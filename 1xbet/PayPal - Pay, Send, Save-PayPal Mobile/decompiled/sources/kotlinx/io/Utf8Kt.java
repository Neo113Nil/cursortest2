package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0000*\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0013\u001a\u00020\u0000*\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u0019\u0010\u0013\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\u0001*\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0014\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0018\u001a\u0013\u0010\u001e\u001a\u00020\u0001*\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020\u0000*\u00020\u00152\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\""}, d2 = {"", "", "startIndex", "endIndex", "", "utf8Size", "(Ljava/lang/String;II)J", "Lkotlinx/io/Sink;", "codePoint", "", "writeCodePointValue", "(Lkotlinx/io/Sink;I)V", "string", "writeString", "(Lkotlinx/io/Sink;Ljava/lang/String;II)V", "", "chars", "(Lkotlinx/io/Sink;Ljava/lang/CharSequence;II)V", "Lkotlinx/io/Source;", "readString", "(Lkotlinx/io/Source;)Ljava/lang/String;", "Lkotlinx/io/Buffer;", "(Lkotlinx/io/Buffer;)Ljava/lang/String;", "byteCount", "(Lkotlinx/io/Source;J)Ljava/lang/String;", "readCodePointValue", "(Lkotlinx/io/Source;)I", "readLine", "limit", "readLineStrict", "Camera2StreamConfigurationMap", "(Lkotlinx/io/Buffer;)I", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/io/Buffer;J)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Utf8Kt {
    public static /* synthetic */ long utf8Size$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return utf8Size(str, i, i2);
    }

    public static final long utf8Size(java.lang.String str, int i, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.io._UtilKt.checkBounds(str.length(), i, i2);
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }

    public static /* synthetic */ void writeString$default(kotlinx.io.Sink sink, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        writeString(sink, str, i, i2);
    }

    public static final void writeString(kotlinx.io.Sink sink, java.lang.String str, int i, int i2) {
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext;
        int i3;
        kotlinx.io.Segment writableSegment;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext2;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext3;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i4 = i;
        kotlinx.io._UtilKt.checkBounds(str.length(), i4, i2);
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = sink.getGetHighSpeedVideoFpsRanges();
        while (i4 < i2) {
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = str.charAt(i4);
            if (intRef.element < 128) {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment2 = getHighSpeedVideoFpsRanges.writableSegment(1);
                segmentWriteContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                int i5 = -i4;
                int min = java.lang.Math.min(i2, writableSegment2.getRemainingCapacity() + i4);
                int i6 = i4 + 1;
                segmentWriteContext.setUnchecked(writableSegment2, i4 + i5, (byte) intRef.element);
                while (true) {
                    i4 = i6;
                    if (i4 >= min) {
                        break;
                    }
                    intRef.element = str.charAt(i4);
                    if (intRef.element >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    segmentWriteContext.setUnchecked(writableSegment2, i4 + i5, (byte) intRef.element);
                }
                int i7 = i5 + i4;
                if (i7 == 1) {
                    writableSegment2.setLimit(writableSegment2.getLimit() + i7);
                    getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i7);
                } else {
                    if (i7 < 0 || i7 > writableSegment2.getRemainingCapacity()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                        sb.append(i7);
                        sb.append(". Should be in 0..");
                        sb.append(writableSegment2.getRemainingCapacity());
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    if (i7 != 0) {
                        writableSegment2.setLimit(writableSegment2.getLimit() + i7);
                        getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i7);
                    } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment2)) {
                        getHighSpeedVideoFpsRanges.recycleTail();
                    }
                }
            } else {
                if (intRef.element < 2048) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations2 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    i3 = 2;
                    writableSegment = getHighSpeedVideoFpsRanges.writableSegment(2);
                    segmentWriteContext2 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext2.setUnchecked(writableSegment, 0, (byte) ((intRef.element >> 6) | 192), (byte) ((intRef.element & 63) | 128));
                } else if (intRef.element < 55296 || intRef.element > 57343) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations3 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    i3 = 3;
                    writableSegment = getHighSpeedVideoFpsRanges.writableSegment(3);
                    segmentWriteContext3 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext3.setUnchecked(writableSegment, 0, (byte) ((intRef.element >> 12) | 224), (byte) (((intRef.element >> 6) & 63) | 128), (byte) ((intRef.element & 63) | 128));
                } else {
                    int i8 = i4 + 1;
                    char charAt = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (intRef.element > 56319 || 56320 > charAt || charAt >= 57344) {
                        getHighSpeedVideoFpsRanges.writeByte((byte) 63);
                        i4 = i8;
                    } else {
                        int i9 = (((intRef.element & 1023) << 10) | (charAt & 1023)) + 65536;
                        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations4 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                        kotlinx.io.Segment writableSegment3 = getHighSpeedVideoFpsRanges.writableSegment(4);
                        segmentWriteContext4 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                        segmentWriteContext4.setUnchecked(writableSegment3, 0, (byte) ((i9 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), (byte) (((i9 >> 12) & 63) | 128), (byte) (((i9 >> 6) & 63) | 128), (byte) ((i9 & 63) | 128));
                        writableSegment3.setLimit(writableSegment3.getLimit() + 4);
                        getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + 4);
                        i4 += 2;
                    }
                }
                writableSegment.setLimit(writableSegment.getLimit() + i3);
                getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i3);
                i4++;
            }
        }
        sink.hintEmit();
    }

    public static /* synthetic */ void writeString$default(kotlinx.io.Sink sink, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        writeString(sink, charSequence, i, i2);
    }

    public static final void writeString(kotlinx.io.Sink sink, java.lang.CharSequence charSequence, int i, int i2) {
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext;
        int i3;
        kotlinx.io.Segment writableSegment;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext2;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext3;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int i4 = i;
        kotlinx.io._UtilKt.checkBounds(charSequence.length(), i4, i2);
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = sink.getGetHighSpeedVideoFpsRanges();
        while (i4 < i2) {
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = charSequence.charAt(i4);
            if (intRef.element < 128) {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment2 = getHighSpeedVideoFpsRanges.writableSegment(1);
                segmentWriteContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                int i5 = -i4;
                int min = java.lang.Math.min(i2, writableSegment2.getRemainingCapacity() + i4);
                int i6 = i4 + 1;
                segmentWriteContext.setUnchecked(writableSegment2, i4 + i5, (byte) intRef.element);
                while (true) {
                    i4 = i6;
                    if (i4 >= min) {
                        break;
                    }
                    intRef.element = charSequence.charAt(i4);
                    if (intRef.element >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    segmentWriteContext.setUnchecked(writableSegment2, i4 + i5, (byte) intRef.element);
                }
                int i7 = i5 + i4;
                if (i7 == 1) {
                    writableSegment2.setLimit(writableSegment2.getLimit() + i7);
                    getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i7);
                } else {
                    if (i7 < 0 || i7 > writableSegment2.getRemainingCapacity()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                        sb.append(i7);
                        sb.append(". Should be in 0..");
                        sb.append(writableSegment2.getRemainingCapacity());
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    if (i7 != 0) {
                        writableSegment2.setLimit(writableSegment2.getLimit() + i7);
                        getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i7);
                    } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment2)) {
                        getHighSpeedVideoFpsRanges.recycleTail();
                    }
                }
            } else {
                if (intRef.element < 2048) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations2 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    i3 = 2;
                    writableSegment = getHighSpeedVideoFpsRanges.writableSegment(2);
                    segmentWriteContext2 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext2.setUnchecked(writableSegment, 0, (byte) ((intRef.element >> 6) | 192), (byte) ((intRef.element & 63) | 128));
                } else if (intRef.element < 55296 || intRef.element > 57343) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations3 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    i3 = 3;
                    writableSegment = getHighSpeedVideoFpsRanges.writableSegment(3);
                    segmentWriteContext3 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext3.setUnchecked(writableSegment, 0, (byte) ((intRef.element >> 12) | 224), (byte) (((intRef.element >> 6) & 63) | 128), (byte) ((intRef.element & 63) | 128));
                } else {
                    int i8 = i4 + 1;
                    char charAt = i8 < i2 ? charSequence.charAt(i8) : (char) 0;
                    if (intRef.element > 56319 || 56320 > charAt || charAt >= 57344) {
                        getHighSpeedVideoFpsRanges.writeByte((byte) 63);
                        i4 = i8;
                    } else {
                        int i9 = (((intRef.element & 1023) << 10) | (charAt & 1023)) + 65536;
                        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations4 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                        kotlinx.io.Segment writableSegment3 = getHighSpeedVideoFpsRanges.writableSegment(4);
                        segmentWriteContext4 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                        segmentWriteContext4.setUnchecked(writableSegment3, 0, (byte) ((i9 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE), (byte) (((i9 >> 12) & 63) | 128), (byte) (((i9 >> 6) & 63) | 128), (byte) ((i9 & 63) | 128));
                        writableSegment3.setLimit(writableSegment3.getLimit() + 4);
                        getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + 4);
                        i4 += 2;
                    }
                }
                writableSegment.setLimit(writableSegment.getLimit() + i3);
                getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + i3);
                i4++;
            }
        }
        sink.hintEmit();
    }

    public static final java.lang.String readString(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        source.request(Long.MAX_VALUE);
        return getHighResolutionOutputSizeshNQ4ISI(source.getGetHighSpeedVideoFpsRanges(), source.getGetHighSpeedVideoFpsRanges().getSizeMut());
    }

    public static final java.lang.String readString(kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return getHighResolutionOutputSizeshNQ4ISI(buffer, buffer.getSizeMut());
    }

    public static final java.lang.String readString(kotlinx.io.Source source, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        source.require(j);
        return getHighResolutionOutputSizeshNQ4ISI(source.getGetHighSpeedVideoFpsRanges(), j);
    }

    public static final int readCodePointValue(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof kotlinx.io.Buffer) {
            return Camera2StreamConfigurationMap((kotlinx.io.Buffer) source);
        }
        source.require(1L);
        byte b = source.getGetHighSpeedVideoFpsRanges().get(0L);
        if ((b & 224) == 192) {
            source.require(2L);
        } else if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
            source.require(3L);
        } else if ((b & 248) == 240) {
            source.require(4L);
        }
        return Camera2StreamConfigurationMap(source.getGetHighSpeedVideoFpsRanges());
    }

    public static final java.lang.String readLine(kotlinx.io.Source source) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (!source.request(1L)) {
            return null;
        }
        long indexOf$default = kotlinx.io.SourcesKt.indexOf$default(source, (byte) 10, 0L, 0L, 6, null);
        if (indexOf$default == -1) {
            return readString(source);
        }
        if (indexOf$default == 0) {
            source.skip(1L);
            return "";
        }
        long j = indexOf$default - 1;
        if (source.getGetHighSpeedVideoFpsRanges().get(j) == 13) {
            i = 2;
            indexOf$default = j;
        } else {
            i = 1;
        }
        java.lang.String readString = readString(source, indexOf$default);
        source.skip(i);
        return readString;
    }

    public static /* synthetic */ java.lang.String readLineStrict$default(kotlinx.io.Source source, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return readLineStrict(source, j);
    }

    public static final java.lang.String readLineStrict(kotlinx.io.Source source, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("limit (");
            sb.append(j);
            sb.append(") < 0");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        long j2 = 1;
        source.require(1L);
        long indexOf = kotlinx.io.SourcesKt.indexOf(source, (byte) 10, 0L, j);
        if (indexOf == 0) {
            source.skip(1L);
            return "";
        }
        if (indexOf > 0) {
            long j3 = indexOf - 1;
            if (source.getGetHighSpeedVideoFpsRanges().get(j3) == 13) {
                indexOf = j3;
                j2 = 2;
            }
            java.lang.String readString = readString(source, indexOf);
            source.skip(j2);
            return readString;
        }
        if (source.getGetHighSpeedVideoFpsRanges().getSizeMut() < j) {
            throw new java.io.EOFException();
        }
        if (j == Long.MAX_VALUE) {
            throw new java.io.EOFException();
        }
        long j4 = j + 1;
        if (!source.request(j4)) {
            throw new java.io.EOFException();
        }
        byte b = source.getGetHighSpeedVideoFpsRanges().get(j);
        if (b == 10) {
            java.lang.String readString2 = readString(source, j);
            source.skip(1L);
            return readString2;
        }
        if (b != 13 || !source.request(j + 2)) {
            throw new java.io.EOFException();
        }
        if (source.getGetHighSpeedVideoFpsRanges().get(j4) != 10) {
            throw new java.io.EOFException();
        }
        java.lang.String readString3 = readString(source, j);
        source.skip(2L);
        return readString3;
    }

    private static final int Camera2StreamConfigurationMap(kotlinx.io.Buffer buffer) {
        int i;
        int i2;
        int i3;
        buffer.require(1L);
        byte b = buffer.get(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & com.google.common.base.Ascii.US;
            i2 = 2;
            i3 = 128;
        } else if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
            i = b & com.google.common.base.Ascii.SI;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return 65533;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.getSizeMut() < j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size < ");
            sb.append(i2);
            sb.append(": ");
            sb.append(buffer.getSizeMut());
            sb.append(" (to read code point prefixed 0x");
            sb.append(kotlinx.io._UtilKt.toHexString(b));
            sb.append(')');
            throw new java.io.EOFException(sb.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.get(j2);
            if ((b2 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
                buffer.skip(j2);
                return 65533;
            }
            i = (i << 6) | (b2 & 63);
        }
        buffer.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(kotlinx.io.Buffer buffer, long j) {
        kotlinx.io.unsafe.SegmentReadContext unused;
        if (j == 0) {
            return "";
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Segment head = buffer.getHead();
        if (head != null) {
            unused = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
            if (head.getSize() < j) {
                return kotlinx.io.internal._Utf8Kt.commonToUtf8String$default(kotlinx.io.SourcesKt.readByteArray(buffer, (int) j), 0, 0, 3, null);
            }
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            java.lang.String commonToUtf8String = kotlinx.io.internal._Utf8Kt.commonToUtf8String(dataAsByteArray, pos, java.lang.Math.min(head.getLimit(), ((int) j) + pos));
            buffer.skip(j);
            return commonToUtf8String;
        }
        throw new java.lang.IllegalStateException("Unreacheable".toString());
    }

    public static final void writeCodePointValue(kotlinx.io.Sink sink, int i) {
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext2;
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = sink.getGetHighSpeedVideoFpsRanges();
        if (i >= 0 && i <= 1114111) {
            if (i < 128) {
                getHighSpeedVideoFpsRanges.writeByte((byte) i);
            } else if (i < 2048) {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment = getHighSpeedVideoFpsRanges.writableSegment(2);
                segmentWriteContext3 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                segmentWriteContext3.setUnchecked(writableSegment, 0, (byte) ((i >> 6) | 192));
                segmentWriteContext3.setUnchecked(writableSegment, 1, (byte) ((i & 63) | 128));
                writableSegment.setLimit(writableSegment.getLimit() + 2);
                getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + 2);
            } else if (55296 <= i && i < 57344) {
                getHighSpeedVideoFpsRanges.writeByte((byte) 63);
            } else if (i < 65536) {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations2 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment2 = getHighSpeedVideoFpsRanges.writableSegment(3);
                segmentWriteContext2 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                segmentWriteContext2.setUnchecked(writableSegment2, 0, (byte) ((i >> 12) | 224));
                segmentWriteContext2.setUnchecked(writableSegment2, 1, (byte) (((i >> 6) & 63) | 128));
                segmentWriteContext2.setUnchecked(writableSegment2, 2, (byte) ((i & 63) | 128));
                writableSegment2.setLimit(writableSegment2.getLimit() + 3);
                getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + 3);
            } else {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations3 = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment3 = getHighSpeedVideoFpsRanges.writableSegment(4);
                segmentWriteContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                segmentWriteContext.setUnchecked(writableSegment3, 0, (byte) ((i >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                segmentWriteContext.setUnchecked(writableSegment3, 1, (byte) (((i >> 12) & 63) | 128));
                segmentWriteContext.setUnchecked(writableSegment3, 2, (byte) (((i >> 6) & 63) | 128));
                segmentWriteContext.setUnchecked(writableSegment3, 3, (byte) ((i & 63) | 128));
                writableSegment3.setLimit(writableSegment3.getLimit() + 4);
                getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + 4);
            }
            sink.hintEmit();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
        sb.append(kotlinx.io._UtilKt.toHexString(i));
        sb.append(" (");
        sb.append(i);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
