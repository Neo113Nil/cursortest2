package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class CodedInputStreamReader implements androidx.content.preferences.protobuf.Reader {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges = 0;
    private final androidx.content.preferences.protobuf.CodedInputStream getHighSpeedVideoFpsRangesFor;

    public static androidx.content.preferences.protobuf.CodedInputStreamReader getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) {
        if (codedInputStream.getHighSpeedVideoSizes != null) {
            return codedInputStream.getHighSpeedVideoSizes;
        }
        return new androidx.content.preferences.protobuf.CodedInputStreamReader(codedInputStream);
    }

    private CodedInputStreamReader(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) {
        androidx.content.preferences.protobuf.CodedInputStream codedInputStream2 = (androidx.content.preferences.protobuf.CodedInputStream) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(codedInputStream, "input");
        this.getHighSpeedVideoFpsRangesFor = codedInputStream2;
        codedInputStream2.getHighSpeedVideoSizes = this;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = 0;
        } else {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.readTag();
        }
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 == 0 || i2 == this.getHighResolutionOutputSizeshNQ4ISI) {
            return Integer.MAX_VALUE;
        }
        return androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i2);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final boolean CoroutineDebuggingKt() throws java.io.IOException {
        int i;
        if (this.getHighSpeedVideoFpsRangesFor.isAtEnd() || (i = this.Camera2StreamConfigurationMap) == this.getHighResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.skipField(i);
    }

    private <T> void getHighSpeedVideoFpsRangesFor(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
        if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap >= this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
        int pushLimit = this.getHighSpeedVideoFpsRangesFor.pushLimit(readUInt32);
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap++;
        schema.Camera2StreamConfigurationMap(t, this, extensionRegistryLite);
        this.getHighSpeedVideoFpsRangesFor.checkLastTagWas(0);
        androidx.content.preferences.protobuf.CodedInputStream codedInputStream = this.getHighSpeedVideoFpsRangesFor;
        codedInputStream.Camera2StreamConfigurationMap--;
        this.getHighSpeedVideoFpsRangesFor.popLimit(pushLimit);
    }

    private <T> void Camera2StreamConfigurationMap(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.Camera2StreamConfigurationMap), 4);
        try {
            schema.Camera2StreamConfigurationMap(t, this, extensionRegistryLite);
            if (this.Camera2StreamConfigurationMap == this.getHighResolutionOutputSizeshNQ4ISI) {
            } else {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    private <T> T Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        T Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.CodedInputStreamReader) Camera2StreamConfigurationMap, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) schema, extensionRegistryLite);
        schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getHighSpeedVideoSizes(java.util.List<java.lang.Double> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.DoubleArrayList) {
            androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 1) {
                do {
                    doubleArrayList.addDouble(this.getHighSpeedVideoFpsRangesFor.readDouble());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 7) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        doubleArrayList.addDouble(this.getHighSpeedVideoFpsRangesFor.readDouble());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.getHighSpeedVideoFpsRangesFor.readDouble()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 7) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Double.valueOf(this.getHighSpeedVideoFpsRangesFor.readDouble()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getInputSizeshNQ4ISI(java.util.List<java.lang.Float> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.FloatArrayList) {
            androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 3) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        floatArrayList.addFloat(this.getHighSpeedVideoFpsRangesFor.readFloat());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            if (tagWireType == 5) {
                do {
                    floatArrayList.addFloat(this.getHighSpeedVideoFpsRangesFor.readFloat());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 3) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor.readFloat()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor.readFloat()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void isOutputSupportedFor(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readUInt64());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readUInt64());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt64()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt64()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getInputFormats(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readInt64());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readInt64());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt64()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt64()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputFormats(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readInt32());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readInt32());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt32()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt32()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputMinFrameDuration(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readFixed64());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 7) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readFixed64());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed64()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 7) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed64()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getHighSpeedVideoFpsRanges(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 3) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readFixed32());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readFixed32());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 3) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed32()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed32()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.BooleanArrayList) {
            androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    booleanArrayList.addBoolean(this.getHighSpeedVideoFpsRangesFor.readBool());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    booleanArrayList.addBoolean(this.getHighSpeedVideoFpsRangesFor.readBool());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.readBool()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.readBool()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputMinFrameDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(list, false);
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputStallDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(list, true);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
        java.lang.String readString;
        int readTag;
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 2) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        if ((list instanceof androidx.content.preferences.protobuf.LazyStringList) && !z) {
            androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
                lazyStringList.add(this.getHighSpeedVideoFpsRangesFor.readBytes());
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                }
                int readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                if (readTag2 != this.Camera2StreamConfigurationMap) {
                    this.getHighSpeedVideoFpsRanges = readTag2;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        do {
            if (z) {
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                readString = this.getHighSpeedVideoFpsRangesFor.readStringRequireUtf8();
            } else {
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                readString = this.getHighSpeedVideoFpsRangesFor.readString();
            }
            list.add(readString);
            if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                return;
            } else {
                readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
            }
        } while (readTag == this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = readTag;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final <T> void getHighSpeedVideoFpsRangesFor(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readTag;
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 2) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int i = this.Camera2StreamConfigurationMap;
        do {
            T Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.CodedInputStreamReader) Camera2StreamConfigurationMap, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) schema, extensionRegistryLite);
            schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            list.add(Camera2StreamConfigurationMap);
            if (this.getHighSpeedVideoFpsRangesFor.isAtEnd() || this.getHighSpeedVideoFpsRanges != 0) {
                return;
            } else {
                readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
            }
        } while (readTag == i);
        this.getHighSpeedVideoFpsRanges = readTag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.Reader
    @java.lang.Deprecated
    public final <T> void Camera2StreamConfigurationMap(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readTag;
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 3) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int i = this.Camera2StreamConfigurationMap;
        do {
            list.add(Camera2StreamConfigurationMap(schema, extensionRegistryLite));
            if (this.getHighSpeedVideoFpsRangesFor.isAtEnd() || this.getHighSpeedVideoFpsRanges != 0) {
                return;
            } else {
                readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
            }
        } while (readTag == i);
        this.getHighSpeedVideoFpsRanges = readTag;
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void Camera2StreamConfigurationMap(java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) != 2) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            list.add(this.getHighSpeedVideoFpsRangesFor.readBytes());
            if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                return;
            }
            int readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
            if (readTag != this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges = readTag;
                return;
            }
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void toString(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readUInt32());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readUInt32());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt32()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt32()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getHighSpeedVideoFpsRangesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readEnum());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readEnum());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readEnum()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readEnum()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getHighSpeedVideoSizesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 3) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readSFixed32());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readSFixed32());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 3) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed32()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed32()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputSizes(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readSFixed64());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
                if ((readUInt32 & 7) == 0) {
                    int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                    do {
                        longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readSFixed64());
                    } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead + readUInt32);
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed64()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.getHighSpeedVideoFpsRangesFor.readUInt32();
            if ((readUInt322 & 7) == 0) {
                int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead();
                do {
                    list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed64()));
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2 + readUInt322);
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputSizeshNQ4ISI(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
            androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readSInt32());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    intArrayList.addInt(this.getHighSpeedVideoFpsRangesFor.readSInt32());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt32()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt32()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final void getOutputStallDuration(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
            androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readSInt64());
                    if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.getHighSpeedVideoFpsRangesFor.readTag();
                    }
                } while (readTag2 == this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRanges = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
                do {
                    longArrayList.addLong(this.getHighSpeedVideoFpsRangesFor.readSInt64());
                } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead);
                if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
        int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt64()));
                if (this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                    return;
                } else {
                    readTag = this.getHighSpeedVideoFpsRangesFor.readTag();
                }
            } while (readTag == this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() + this.getHighSpeedVideoFpsRangesFor.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt64()));
            } while (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() < totalBytesRead2);
            if (this.getHighSpeedVideoFpsRangesFor.getTotalBytesRead() != totalBytesRead2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private java.lang.Object Camera2StreamConfigurationMap(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        switch (androidx.content.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.getHighSpeedVideoSizes[fieldType.ordinal()]) {
            case 1:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.readBool());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 2:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
                    return this.getHighSpeedVideoFpsRangesFor.readBytes();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 3:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
                    return java.lang.Double.valueOf(this.getHighSpeedVideoFpsRangesFor.readDouble());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 4:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readEnum());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 5:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed32());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 6:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
                    return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readFixed64());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 7:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
                    return java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor.readFloat());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 8:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt32());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 9:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readInt64());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 10:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
                    androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls);
                    java.lang.Object Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                    getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.CodedInputStreamReader) Camera2StreamConfigurationMap, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) highResolutionOutputSizeshNQ4ISI, extensionRegistryLite);
                    highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
                    return Camera2StreamConfigurationMap;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 11:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed32());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 12:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
                    return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSFixed64());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 13:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt32());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 14:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readSInt64());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 15:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
                    return this.getHighSpeedVideoFpsRangesFor.readStringRequireUtf8();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 16:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt32());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            case 17:
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
                    return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.readUInt64());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
        }
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final <T> void getHighSpeedVideoSizes(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 3) {
            Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.CodedInputStreamReader) t, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) schema, extensionRegistryLite);
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final <T> void getHighSpeedVideoFpsRanges(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.CodedInputStreamReader) t, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) schema, extensionRegistryLite);
            return;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final boolean getHighSpeedVideoFpsRanges() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readBool();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            return this.getHighSpeedVideoFpsRangesFor.readBytes();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final double getHighSpeedVideoSizes() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
            return this.getHighSpeedVideoFpsRangesFor.readDouble();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getOutputFormats() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readEnum();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getInputFormats() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
            return this.getHighSpeedVideoFpsRangesFor.readFixed32();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final long getInputSizeshNQ4ISI() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
            return this.getHighSpeedVideoFpsRangesFor.readFixed64();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final float getHighSpeedVideoSizesFor() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
            return this.getHighSpeedVideoFpsRangesFor.readFloat();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    @java.lang.Deprecated
    public final <T> T getHighSpeedVideoSizes(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 3) {
            return (T) Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls), extensionRegistryLite);
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getOutputMinFrameDuration() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readInt32();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final long getOutputStallDuration() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readInt64();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void getHighSpeedVideoSizes(java.util.Map<K, V> map, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            int pushLimit = this.getHighSpeedVideoFpsRangesFor.pushLimit(this.getHighSpeedVideoFpsRangesFor.readUInt32());
            java.lang.Object obj = metadata.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj2 = metadata.Camera2StreamConfigurationMap;
            while (true) {
                try {
                    int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                    if (highSpeedVideoFpsRangesFor == Integer.MAX_VALUE || this.getHighSpeedVideoFpsRangesFor.isAtEnd()) {
                        break;
                    }
                    if (highSpeedVideoFpsRangesFor == 1) {
                        obj = Camera2StreamConfigurationMap(metadata.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) null, (androidx.content.preferences.protobuf.ExtensionRegistryLite) null);
                    } else if (highSpeedVideoFpsRangesFor == 2) {
                        obj2 = Camera2StreamConfigurationMap(metadata.getHighResolutionOutputSizeshNQ4ISI, metadata.Camera2StreamConfigurationMap.getClass(), extensionRegistryLite);
                    } else {
                        try {
                            if (!CoroutineDebuggingKt()) {
                                throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!CoroutineDebuggingKt()) {
                                throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    }
                } finally {
                    this.getHighSpeedVideoFpsRangesFor.popLimit(pushLimit);
                }
            }
        } else {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            androidx.content.preferences.protobuf.Schema<T> highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls);
            T Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.CodedInputStreamReader) Camera2StreamConfigurationMap, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.CodedInputStreamReader>) highResolutionOutputSizeshNQ4ISI, extensionRegistryLite);
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getOutputMinFrameDurationlomOqCM() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 5) {
            return this.getHighSpeedVideoFpsRangesFor.readSFixed32();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final long getOutputSizeshNQ4ISI() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 1) {
            return this.getHighSpeedVideoFpsRangesFor.readSFixed64();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int getOutputStallDurationlomOqCM() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readSInt32();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final long getOutputSizes() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readSInt64();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final java.lang.String isOutputSupportedForhNQ4ISI() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            return this.getHighSpeedVideoFpsRangesFor.readString();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final java.lang.String isOutputSupportedFor() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 2) {
            return this.getHighSpeedVideoFpsRangesFor.readStringRequireUtf8();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final int unwrapAs() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readUInt32();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.content.preferences.protobuf.Reader
    public final long getValidOutputFormatsForInputhNQ4ISI() throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.Camera2StreamConfigurationMap) == 0) {
            return this.getHighSpeedVideoFpsRangesFor.readUInt64();
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
    }
}
