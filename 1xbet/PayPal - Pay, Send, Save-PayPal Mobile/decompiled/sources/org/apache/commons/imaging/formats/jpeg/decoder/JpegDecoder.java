package org.apache.commons.imaging.formats.jpeg.decoder;

/* loaded from: classes17.dex */
public class JpegDecoder extends org.apache.commons.imaging.common.BinaryFileParser implements org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor {
    private java.awt.image.BufferedImage image;
    private org.apache.commons.imaging.ImageReadException imageReadException;
    private java.io.IOException ioException;
    private org.apache.commons.imaging.formats.jpeg.segments.SofnSegment sofnSegment;
    private org.apache.commons.imaging.formats.jpeg.segments.SosSegment sosSegment;
    private final org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable[] quantizationTables = new org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable[4];
    private final org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable[] huffmanDCTables = new org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable[4];
    private final org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable[] huffmanACTables = new org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable[4];
    private final float[][] scaledQuantizationTables = new float[4][];
    private final int[] zz = new int[64];
    private final int[] blockInt = new int[64];
    private final float[] block = new float[64];

    private int extend(int i, int i2) {
        return i < (1 << (i2 + (-1))) ? i + ((-1) << i2) + 1 : i;
    }

    private static int fastRound(float f) {
        return (int) (f + 0.5f);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    public boolean beginSOS() {
        return true;
    }

    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
        java.awt.image.DirectColorModel directColorModel;
        java.awt.image.WritableRaster createPackedRaster;
        int i2;
        org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream[] jpegInputStreamArr;
        java.awt.image.WritableRaster writableRaster;
        int[] iArr;
        java.awt.image.WritableRaster writableRaster2;
        java.awt.image.DirectColorModel directColorModel2;
        org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream jpegInputStream;
        java.awt.image.WritableRaster writableRaster3;
        java.awt.image.DirectColorModel directColorModel3;
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
        try {
            int read2Bytes = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("segmentLength", byteArrayInputStream, "Not a Valid JPEG File", getByteOrder());
            this.sosSegment = new org.apache.commons.imaging.formats.jpeg.segments.SosSegment(i, org.apache.commons.imaging.common.BinaryFunctions.readBytes("SosSegment", byteArrayInputStream, read2Bytes - 2, "Not a Valid JPEG File"));
            int length = bArr2.length - read2Bytes;
            int[] iArr2 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = byteArrayInputStream.read();
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.sofnSegment.numberOfComponents; i6++) {
                i4 = java.lang.Math.max(i4, this.sofnSegment.getComponents(i6).horizontalSamplingFactor);
                i5 = java.lang.Math.max(i5, this.sofnSegment.getComponents(i6).verticalSamplingFactor);
            }
            int i7 = i4 * 8;
            int i8 = i5 * 8;
            int i9 = ((this.sofnSegment.width + i7) - 1) / i7;
            int i10 = ((this.sofnSegment.height + i8) - 1) / i8;
            org.apache.commons.imaging.formats.jpeg.decoder.Block[] allocateMCUMemory = allocateMCUMemory();
            int length2 = allocateMCUMemory.length;
            org.apache.commons.imaging.formats.jpeg.decoder.Block[] blockArr = new org.apache.commons.imaging.formats.jpeg.decoder.Block[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                blockArr[i11] = new org.apache.commons.imaging.formats.jpeg.decoder.Block(i7, i8);
            }
            int[] iArr3 = new int[this.sofnSegment.numberOfComponents];
            if (this.sofnSegment.numberOfComponents == 4) {
                directColorModel = new java.awt.image.DirectColorModel(24, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255);
                createPackedRaster = java.awt.image.Raster.createPackedRaster(3, this.sofnSegment.width, this.sofnSegment.height, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255}, (java.awt.Point) null);
            } else if (this.sofnSegment.numberOfComponents == 3) {
                directColorModel = new java.awt.image.DirectColorModel(24, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255);
                createPackedRaster = java.awt.image.Raster.createPackedRaster(3, this.sofnSegment.width, this.sofnSegment.height, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255}, (java.awt.Point) null);
            } else if (this.sofnSegment.numberOfComponents == 1) {
                directColorModel = new java.awt.image.DirectColorModel(24, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255);
                createPackedRaster = java.awt.image.Raster.createPackedRaster(3, this.sofnSegment.width, this.sofnSegment.height, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255}, (java.awt.Point) null);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.sofnSegment.numberOfComponents);
                sb.append(" components are invalid or unsupported");
                throw new org.apache.commons.imaging.ImageReadException(sb.toString());
            }
            java.awt.image.DataBuffer dataBuffer = createPackedRaster.getDataBuffer();
            org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream[] splitByRstMarkers = splitByRstMarkers(iArr2);
            org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream jpegInputStream2 = splitByRstMarkers[0];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i8 * i10) {
                int i14 = i10;
                int i15 = 0;
                while (i15 < i7 * i9) {
                    if (jpegInputStream2.hasNext()) {
                        i2 = i9;
                    } else {
                        int i16 = i13 + 1;
                        i2 = i9;
                        if (i16 < splitByRstMarkers.length) {
                            jpegInputStream2 = splitByRstMarkers[i16];
                        }
                        i13 = i16;
                    }
                    readMCU(jpegInputStream2, iArr3, allocateMCUMemory);
                    rescaleMCU(allocateMCUMemory, i7, i8, blockArr);
                    int i17 = (this.sofnSegment.width * i12) + i15;
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        if (i18 >= i8) {
                            jpegInputStreamArr = splitByRstMarkers;
                            writableRaster = createPackedRaster;
                            iArr = iArr3;
                            break;
                        }
                        jpegInputStreamArr = splitByRstMarkers;
                        iArr = iArr3;
                        if (i12 + i18 >= this.sofnSegment.height) {
                            writableRaster = createPackedRaster;
                            break;
                        }
                        int i20 = 0;
                        while (true) {
                            if (i20 >= i7) {
                                writableRaster2 = createPackedRaster;
                                directColorModel2 = directColorModel;
                                jpegInputStream = jpegInputStream2;
                                break;
                            }
                            jpegInputStream = jpegInputStream2;
                            if (i15 + i20 >= this.sofnSegment.width) {
                                writableRaster2 = createPackedRaster;
                                directColorModel2 = directColorModel;
                                break;
                            }
                            if (length2 == 4) {
                                int i21 = i19 + i20;
                                writableRaster3 = createPackedRaster;
                                directColorModel3 = directColorModel;
                                dataBuffer.setElem(i17 + i20, org.apache.commons.imaging.color.ColorConversions.convertCMYKtoRGB(blockArr[0].samples[i21], blockArr[1].samples[i21], blockArr[2].samples[i21], blockArr[3].samples[i21]));
                            } else {
                                writableRaster3 = createPackedRaster;
                                directColorModel3 = directColorModel;
                                if (length2 == 3) {
                                    int i22 = i19 + i20;
                                    dataBuffer.setElem(i17 + i20, org.apache.commons.imaging.formats.jpeg.decoder.YCbCrConverter.convertYCbCrToRGB(blockArr[0].samples[i22], blockArr[1].samples[i22], blockArr[2].samples[i22]));
                                } else if (allocateMCUMemory.length == 1) {
                                    int i23 = blockArr[0].samples[i19 + i20];
                                    dataBuffer.setElem(i17 + i20, i23 | (i23 << 16) | (i23 << 8));
                                    i20++;
                                    jpegInputStream2 = jpegInputStream;
                                    createPackedRaster = writableRaster3;
                                    directColorModel = directColorModel3;
                                } else {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append("Unsupported JPEG with ");
                                    sb2.append(allocateMCUMemory.length);
                                    sb2.append(" components");
                                    throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                                }
                            }
                            i20++;
                            jpegInputStream2 = jpegInputStream;
                            createPackedRaster = writableRaster3;
                            directColorModel = directColorModel3;
                        }
                        i19 += i7;
                        i17 += this.sofnSegment.width;
                        i18++;
                        splitByRstMarkers = jpegInputStreamArr;
                        iArr3 = iArr;
                        jpegInputStream2 = jpegInputStream;
                        createPackedRaster = writableRaster2;
                        directColorModel = directColorModel2;
                    }
                    i15 += i7;
                    i9 = i2;
                    splitByRstMarkers = jpegInputStreamArr;
                    iArr3 = iArr;
                    jpegInputStream2 = jpegInputStream2;
                    createPackedRaster = writableRaster;
                    directColorModel = directColorModel;
                }
                i12 += i8;
                i10 = i14;
                i9 = i9;
                iArr3 = iArr3;
                createPackedRaster = createPackedRaster;
            }
            java.awt.image.DirectColorModel directColorModel4 = directColorModel;
            this.image = new java.awt.image.BufferedImage(directColorModel4, createPackedRaster, directColorModel4.isAlphaPremultiplied(), new java.util.Properties());
        } catch (java.io.IOException e) {
            this.ioException = e;
        } catch (java.lang.RuntimeException e2) {
            this.imageReadException = new org.apache.commons.imaging.ImageReadException("Error parsing JPEG", e2);
        } catch (org.apache.commons.imaging.ImageReadException e3) {
            this.imageReadException = e3;
        }
    }

    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable[] huffmanTableArr;
        if (java.util.Arrays.binarySearch(new int[]{org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF0_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF1_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF2_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF3_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF5_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF6_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF10_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF11_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF13_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF14_MARKER, org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF15_MARKER}, i) < 0) {
            if (i == 65499) {
                org.apache.commons.imaging.formats.jpeg.segments.DqtSegment dqtSegment = new org.apache.commons.imaging.formats.jpeg.segments.DqtSegment(i, bArr3);
                for (int i3 = 0; i3 < dqtSegment.quantizationTables.size(); i3++) {
                    org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable quantizationTable = dqtSegment.quantizationTables.get(i3);
                    if (quantizationTable.destinationIdentifier >= 0) {
                        int i4 = quantizationTable.destinationIdentifier;
                        org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable[] quantizationTableArr = this.quantizationTables;
                        if (i4 < quantizationTableArr.length) {
                            quantizationTableArr[quantizationTable.destinationIdentifier] = quantizationTable;
                            org.apache.commons.imaging.formats.jpeg.decoder.ZigZag.zigZagToBlock(quantizationTable.getElements(), new int[64]);
                            float[] fArr = new float[64];
                            for (int i5 = 0; i5 < 64; i5++) {
                                fArr[i5] = r1[i5];
                            }
                            org.apache.commons.imaging.formats.jpeg.decoder.Dct.scaleDequantizationMatrix(fArr);
                            this.scaledQuantizationTables[quantizationTable.destinationIdentifier] = fArr;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid quantization table identifier ");
                    sb.append(quantizationTable.destinationIdentifier);
                    throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                }
            }
            if (i == 65476) {
                org.apache.commons.imaging.formats.jpeg.segments.DhtSegment dhtSegment = new org.apache.commons.imaging.formats.jpeg.segments.DhtSegment(i, bArr3);
                for (int i6 = 0; i6 < dhtSegment.huffmanTables.size(); i6++) {
                    org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable huffmanTable = dhtSegment.huffmanTables.get(i6);
                    if (huffmanTable.tableClass == 0) {
                        huffmanTableArr = this.huffmanDCTables;
                    } else if (huffmanTable.tableClass == 1) {
                        huffmanTableArr = this.huffmanACTables;
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid huffman table class ");
                        sb2.append(huffmanTable.tableClass);
                        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                    }
                    if (huffmanTable.destinationIdentifier < 0 || huffmanTable.destinationIdentifier >= huffmanTableArr.length) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid huffman table identifier ");
                        sb3.append(huffmanTable.destinationIdentifier);
                        throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
                    }
                    huffmanTableArr[huffmanTable.destinationIdentifier] = huffmanTable;
                }
            }
        } else {
            if (i != 65472) {
                throw new org.apache.commons.imaging.ImageReadException("Only sequential, baseline JPEGs are supported at the moment");
            }
            this.sofnSegment = new org.apache.commons.imaging.formats.jpeg.segments.SofnSegment(i, bArr3);
        }
        return true;
    }

    private void rescaleMCU(org.apache.commons.imaging.formats.jpeg.decoder.Block[] blockArr, int i, int i2, org.apache.commons.imaging.formats.jpeg.decoder.Block[] blockArr2) {
        for (int i3 = 0; i3 < blockArr.length; i3++) {
            org.apache.commons.imaging.formats.jpeg.decoder.Block block = blockArr[i3];
            if (block.width == i && block.height == i2) {
                java.lang.System.arraycopy(block.samples, 0, blockArr2[i3].samples, 0, i * i2);
            } else {
                int i4 = i / block.width;
                int i5 = i2 / block.height;
                if (i4 == 2 && i5 == 2) {
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < block.height; i8++) {
                        for (int i9 = 0; i9 < i; i9++) {
                            int i10 = block.samples[(i9 >> 1) + i7];
                            blockArr2[i3].samples[i6 + i9] = i10;
                            blockArr2[i3].samples[i6 + i + i9] = i10;
                        }
                        i7 += block.width;
                        i6 += i * 2;
                    }
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < i2; i12++) {
                        for (int i13 = 0; i13 < i; i13++) {
                            blockArr2[i3].samples[i11 + i13] = block.samples[((i12 / i5) * block.width) + (i13 / i4)];
                        }
                        i11 += i;
                    }
                }
            }
        }
    }

    private org.apache.commons.imaging.formats.jpeg.decoder.Block[] allocateMCUMemory() throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component component;
        org.apache.commons.imaging.formats.jpeg.decoder.Block[] blockArr = new org.apache.commons.imaging.formats.jpeg.decoder.Block[this.sosSegment.numberOfComponents];
        for (int i = 0; i < this.sosSegment.numberOfComponents; i++) {
            org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component components = this.sosSegment.getComponents(i);
            int i2 = 0;
            while (true) {
                if (i2 >= this.sofnSegment.numberOfComponents) {
                    component = null;
                    break;
                }
                if (this.sofnSegment.getComponents(i2).componentIdentifier == components.scanComponentSelector) {
                    component = this.sofnSegment.getComponents(i2);
                    break;
                }
                i2++;
            }
            if (component == null) {
                throw new org.apache.commons.imaging.ImageReadException("Invalid component");
            }
            blockArr[i] = new org.apache.commons.imaging.formats.jpeg.decoder.Block(component.horizontalSamplingFactor * 8, component.verticalSamplingFactor * 8);
        }
        return blockArr;
    }

    private void readMCU(org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream jpegInputStream, int[] iArr, org.apache.commons.imaging.formats.jpeg.decoder.Block[] blockArr) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component component;
        int fastRound;
        org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder jpegDecoder = this;
        int i = 0;
        int i2 = 0;
        while (i2 < jpegDecoder.sosSegment.numberOfComponents) {
            org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component components = jpegDecoder.sosSegment.getComponents(i2);
            int i3 = i;
            while (true) {
                if (i3 >= jpegDecoder.sofnSegment.numberOfComponents) {
                    component = null;
                    break;
                } else {
                    if (jpegDecoder.sofnSegment.getComponents(i3).componentIdentifier == components.scanComponentSelector) {
                        component = jpegDecoder.sofnSegment.getComponents(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (component == null) {
                throw new org.apache.commons.imaging.ImageReadException("Invalid component");
            }
            org.apache.commons.imaging.formats.jpeg.decoder.Block block = blockArr[i2];
            int i4 = i;
            while (i4 < component.verticalSamplingFactor) {
                int i5 = i;
                while (i5 < component.horizontalSamplingFactor) {
                    java.util.Arrays.fill(jpegDecoder.zz, i);
                    int decode = jpegDecoder.decode(jpegInputStream, jpegDecoder.huffmanDCTables[components.dcCodingTableSelector]);
                    int extend = jpegDecoder.extend(jpegDecoder.receive(decode, jpegInputStream), decode);
                    int[] iArr2 = jpegDecoder.zz;
                    int i6 = iArr[i2] + extend;
                    iArr2[i] = i6;
                    iArr[i2] = i6;
                    int i7 = 1;
                    while (true) {
                        int decode2 = jpegDecoder.decode(jpegInputStream, jpegDecoder.huffmanACTables[components.acCodingTableSelector]);
                        int i8 = decode2 & 15;
                        int i9 = decode2 >> 4;
                        if (i8 != 0) {
                            int i10 = i7 + i9;
                            jpegDecoder.zz[i10] = jpegDecoder.receive(i8, jpegInputStream);
                            int[] iArr3 = jpegDecoder.zz;
                            iArr3[i10] = jpegDecoder.extend(iArr3[i10], i8);
                            if (i10 == 63) {
                                break;
                            }
                            i7 = i10 + 1;
                            jpegDecoder = this;
                            i = 0;
                        } else if (i9 != 15) {
                            break;
                        } else {
                            i7 += 16;
                        }
                    }
                    int i11 = jpegDecoder.sofnSegment.precision;
                    int i12 = (1 << jpegDecoder.sofnSegment.precision) - 1;
                    float[] fArr = jpegDecoder.scaledQuantizationTables[component.quantTabDestSelector];
                    org.apache.commons.imaging.formats.jpeg.decoder.ZigZag.zigZagToBlock(jpegDecoder.zz, jpegDecoder.blockInt);
                    for (int i13 = i; i13 < 64; i13++) {
                        jpegDecoder.block[i13] = jpegDecoder.blockInt[i13] * fArr[i13];
                    }
                    org.apache.commons.imaging.formats.jpeg.decoder.Dct.inverseDCT8x8(jpegDecoder.block);
                    int i14 = (i4 * 64 * component.horizontalSamplingFactor) + (i5 * 8);
                    int i15 = i;
                    int i16 = i15;
                    while (true) {
                        int i17 = 8;
                        if (i15 < 8) {
                            while (i < i17) {
                                float f = jpegDecoder.block[i16] + (1 << (i11 - 1));
                                if (f < 0.0f) {
                                    fastRound = 0;
                                } else {
                                    fastRound = f > ((float) i12) ? i12 : fastRound(f);
                                }
                                block.samples[i14 + i] = fastRound;
                                i++;
                                i16++;
                                i17 = 8;
                                jpegDecoder = this;
                            }
                            i14 += component.horizontalSamplingFactor * 8;
                            i15++;
                            jpegDecoder = this;
                            i = 0;
                        }
                    }
                    i5++;
                    jpegDecoder = this;
                    i = 0;
                }
                i4++;
                jpegDecoder = this;
                i = 0;
            }
            i2++;
            jpegDecoder = this;
            i = 0;
        }
    }

    static org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream[] splitByRstMarkers(int[] iArr) {
        java.util.List<java.lang.Integer> intervalStartPositions = getIntervalStartPositions(iArr);
        int size = intervalStartPositions.size();
        org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream[] jpegInputStreamArr = new org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream[size];
        for (int i = 0; i < size; i++) {
            jpegInputStreamArr[i] = new org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream(java.util.Arrays.copyOfRange(iArr, intervalStartPositions.get(i).intValue(), i < size - 1 ? intervalStartPositions.get(i + 1).intValue() - 2 : iArr.length));
        }
        return jpegInputStreamArr;
    }

    static java.util.List<java.lang.Integer> getIntervalStartPositions(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(0);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < iArr.length; i++) {
            if (z) {
                int i2 = iArr[i];
                if (i2 < 208 || i2 > 215) {
                    z = false;
                } else {
                    z2 = true;
                }
            }
            boolean z3 = iArr[i] != 255 ? z : true;
            if (z3 && z2) {
                arrayList.add(java.lang.Integer.valueOf(i + 1));
                z = false;
                z2 = false;
            } else {
                z = z3;
            }
        }
        return arrayList;
    }

    private int receive(int i, org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream jpegInputStream) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        int i2 = 0;
        int i3 = 0;
        while (i2 != i) {
            i2++;
            i3 = (i3 << 1) + jpegInputStream.nextBit();
        }
        return i3;
    }

    private int decode(org.apache.commons.imaging.formats.jpeg.decoder.JpegInputStream jpegInputStream, org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable huffmanTable) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        int nextBit = jpegInputStream.nextBit();
        int i = 1;
        while (nextBit > huffmanTable.getMaxCode(i)) {
            i++;
            nextBit = (nextBit << 1) | jpegInputStream.nextBit();
        }
        return huffmanTable.getHuffVal(huffmanTable.getValPtr(i) + (nextBit - huffmanTable.getMinCode(i)));
    }

    public java.awt.image.BufferedImage decode(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        new org.apache.commons.imaging.formats.jpeg.JpegUtils().traverseJFIF(byteSource, this);
        org.apache.commons.imaging.ImageReadException imageReadException = this.imageReadException;
        if (imageReadException != null) {
            throw imageReadException;
        }
        java.io.IOException iOException = this.ioException;
        if (iOException != null) {
            throw iOException;
        }
        return this.image;
    }
}
