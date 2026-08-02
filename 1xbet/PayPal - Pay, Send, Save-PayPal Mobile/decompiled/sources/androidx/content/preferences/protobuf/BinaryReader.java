package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes7.dex */
abstract class BinaryReader implements androidx.content.preferences.protobuf.Reader {
    private BinaryReader() {
    }

    static final class SafeHeapReader extends androidx.content.preferences.protobuf.BinaryReader {
        private final byte[] Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getOutputMinFrameDuration;

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getHighResolutionOutputSizeshNQ4ISI() {
            return this.getOutputMinFrameDuration;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final java.lang.String isOutputSupportedForhNQ4ISI() throws java.io.IOException {
            return getHighSpeedVideoFpsRanges(false);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final java.lang.String isOutputSupportedFor() throws java.io.IOException {
            return getHighSpeedVideoFpsRanges(true);
        }

        private <T> T getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, schema, extensionRegistryLite);
            schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final <T> void getHighSpeedVideoFpsRanges(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int ArtificialStackFrames = ArtificialStackFrames();
            if (ArtificialStackFrames >= 0) {
                int i = this.getHighSpeedVideoSizes;
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (ArtificialStackFrames <= i - i2) {
                    int i3 = i2 + ArtificialStackFrames;
                    this.getHighSpeedVideoSizes = i3;
                    try {
                        schema.Camera2StreamConfigurationMap(t, this, extensionRegistryLite);
                        if (this.getHighResolutionOutputSizeshNQ4ISI == i3) {
                            return;
                        } else {
                            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
                        }
                    } finally {
                        this.getHighSpeedVideoSizes = i;
                    }
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        private <T> T getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
            getHighSpeedVideoSizes((androidx.datastore.preferences.protobuf.BinaryReader.SafeHeapReader) Camera2StreamConfigurationMap, (androidx.content.preferences.protobuf.Schema<androidx.datastore.preferences.protobuf.BinaryReader.SafeHeapReader>) schema, extensionRegistryLite);
            schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final <T> void getHighSpeedVideoSizes(T t, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.getOutputMinFrameDuration), 4);
            try {
                schema.Camera2StreamConfigurationMap(t, this, extensionRegistryLite);
                if (this.getOutputMinFrameDuration == this.getHighSpeedVideoFpsRangesFor) {
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
                }
            } finally {
                this.getHighSpeedVideoFpsRangesFor = i;
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getHighSpeedVideoSizes(java.util.List<java.lang.Double> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.DoubleArrayList) {
                androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        getHighSpeedVideoFpsRangesFor(ArtificialStackFrames);
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(accessartificialFrame()));
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(accessartificialFrame()));
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    getHighSpeedVideoFpsRangesFor(ArtificialStackFrames2);
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(accessartificialFrame())));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(accessartificialFrame())));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getInputSizeshNQ4ISI(java.util.List<java.lang.Float> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.FloatArrayList) {
                androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 2) {
                    int ArtificialStackFrames = ArtificialStackFrames();
                    getHighSpeedVideoFpsRanges(ArtificialStackFrames);
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                        floatArrayList.addFloat(java.lang.Float.intBitsToFloat(coroutineBoundary()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        floatArrayList.addFloat(java.lang.Float.intBitsToFloat(coroutineBoundary()));
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = ArtificialStackFrames();
                getHighSpeedVideoFpsRanges(ArtificialStackFrames2);
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                    list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(coroutineBoundary())));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(coroutineBoundary())));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void isOutputSupportedFor(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
                androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 0) {
                    while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        longArrayList.addLong(a());
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i3 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i3;
                            return;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                if (tagWireType == 2) {
                    int ArtificialStackFrames = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                    while (true) {
                        i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 >= ArtificialStackFrames) {
                            break;
                        } else {
                            longArrayList.addLong(a());
                        }
                    }
                    if (i2 != ArtificialStackFrames) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 0) {
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    list.add(java.lang.Long.valueOf(a()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                while (true) {
                    i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i >= ArtificialStackFrames2) {
                        break;
                    } else {
                        list.add(java.lang.Long.valueOf(a()));
                    }
                }
                if (i != ArtificialStackFrames2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getInputFormats(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
                androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 0) {
                    while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        longArrayList.addLong(a());
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i3 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i3;
                            return;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                if (tagWireType == 2) {
                    int ArtificialStackFrames = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                    while (true) {
                        i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 >= ArtificialStackFrames) {
                            break;
                        } else {
                            longArrayList.addLong(a());
                        }
                    }
                    if (i2 != ArtificialStackFrames) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 0) {
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    list.add(java.lang.Long.valueOf(a()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                while (true) {
                    i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i >= ArtificialStackFrames2) {
                        break;
                    } else {
                        list.add(java.lang.Long.valueOf(a()));
                    }
                }
                if (i != ArtificialStackFrames2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputFormats(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 0) {
                    while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        intArrayList.addInt(ArtificialStackFrames());
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i3 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i3;
                            return;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                if (tagWireType == 2) {
                    int ArtificialStackFrames = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                    while (true) {
                        i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 >= ArtificialStackFrames) {
                            break;
                        } else {
                            intArrayList.addInt(ArtificialStackFrames());
                        }
                    }
                    if (i2 != ArtificialStackFrames) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 0) {
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                while (true) {
                    i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i >= ArtificialStackFrames2) {
                        break;
                    } else {
                        list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                    }
                }
                if (i != ArtificialStackFrames2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputMinFrameDuration(java.util.List<java.lang.Long> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
                androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        getHighSpeedVideoFpsRangesFor(ArtificialStackFrames);
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            longArrayList.addLong(accessartificialFrame());
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        longArrayList.addLong(accessartificialFrame());
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    getHighSpeedVideoFpsRangesFor(ArtificialStackFrames2);
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Long.valueOf(accessartificialFrame()));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Long.valueOf(accessartificialFrame()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getHighSpeedVideoFpsRanges(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 2) {
                    int ArtificialStackFrames = ArtificialStackFrames();
                    getHighSpeedVideoFpsRanges(ArtificialStackFrames);
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                        intArrayList.addInt(coroutineBoundary());
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        intArrayList.addInt(coroutineBoundary());
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = ArtificialStackFrames();
                getHighSpeedVideoFpsRanges(ArtificialStackFrames2);
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                    list.add(java.lang.Integer.valueOf(coroutineBoundary()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Integer.valueOf(coroutineBoundary()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof androidx.content.preferences.protobuf.BooleanArrayList) {
                androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 0) {
                    while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        booleanArrayList.addBoolean(ArtificialStackFrames() != 0);
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i3 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i3;
                            return;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                if (tagWireType == 2) {
                    int ArtificialStackFrames = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                    while (true) {
                        i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 >= ArtificialStackFrames) {
                            break;
                        } else {
                            booleanArrayList.addBoolean(ArtificialStackFrames() != 0);
                        }
                    }
                    if (i2 != ArtificialStackFrames) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 0) {
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    list.add(java.lang.Boolean.valueOf(ArtificialStackFrames() != 0));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = this.getHighResolutionOutputSizeshNQ4ISI + ArtificialStackFrames();
                while (true) {
                    i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i >= ArtificialStackFrames2) {
                        break;
                    } else {
                        list.add(java.lang.Boolean.valueOf(ArtificialStackFrames() != 0));
                    }
                }
                if (i != ArtificialStackFrames2) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                return;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputMinFrameDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException {
            getHighSpeedVideoSizes(list, false);
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputStallDurationlomOqCM(java.util.List<java.lang.String> list) throws java.io.IOException {
            getHighSpeedVideoSizes(list, true);
        }

        private void getHighSpeedVideoSizes(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
            int i;
            int i2;
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            if ((list instanceof androidx.content.preferences.protobuf.LazyStringList) && !z) {
                androidx.content.preferences.protobuf.LazyStringList lazyStringList = (androidx.content.preferences.protobuf.LazyStringList) list;
                do {
                    lazyStringList.add(Camera2StreamConfigurationMap());
                    i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i2 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                } while (ArtificialStackFrames() == this.getOutputMinFrameDuration);
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                return;
            }
            do {
                list.add(getHighSpeedVideoFpsRanges(z));
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == this.getHighSpeedVideoSizes) {
                    return;
                }
            } while (ArtificialStackFrames() == this.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.Reader
        public final <T> void getHighSpeedVideoFpsRangesFor(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i;
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int i2 = this.getOutputMinFrameDuration;
            do {
                list.add(getHighResolutionOutputSizeshNQ4ISI(schema, extensionRegistryLite));
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == this.getHighSpeedVideoSizes) {
                    return;
                }
            } while (ArtificialStackFrames() == i2);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.Reader
        @java.lang.Deprecated
        public final <T> void Camera2StreamConfigurationMap(java.util.List<T> list, androidx.content.preferences.protobuf.Schema<T> schema, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i;
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 3) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int i2 = this.getOutputMinFrameDuration;
            do {
                list.add(getHighSpeedVideoFpsRangesFor(schema, extensionRegistryLite));
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == this.getHighSpeedVideoSizes) {
                    return;
                }
            } while (ArtificialStackFrames() == i2);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void Camera2StreamConfigurationMap(java.util.List<androidx.content.preferences.protobuf.ByteString> list) throws java.io.IOException {
            int i;
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            do {
                list.add(Camera2StreamConfigurationMap());
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == this.getHighSpeedVideoSizes) {
                    return;
                }
            } while (ArtificialStackFrames() == this.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void toString(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            intArrayList.addInt(ArtificialStackFrames());
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    intArrayList.addInt(ArtificialStackFrames());
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i2 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i2;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 == this.getHighSpeedVideoSizes) {
                    return;
                }
                if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i4;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getHighSpeedVideoFpsRangesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            intArrayList.addInt(ArtificialStackFrames());
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    intArrayList.addInt(ArtificialStackFrames());
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i2 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i2;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                list.add(java.lang.Integer.valueOf(ArtificialStackFrames()));
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 == this.getHighSpeedVideoSizes) {
                    return;
                }
                if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i4;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getHighSpeedVideoSizesFor(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType == 2) {
                    int ArtificialStackFrames = ArtificialStackFrames();
                    getHighSpeedVideoFpsRanges(ArtificialStackFrames);
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                        intArrayList.addInt(coroutineBoundary());
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        intArrayList.addInt(coroutineBoundary());
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 == 2) {
                int ArtificialStackFrames2 = ArtificialStackFrames();
                getHighSpeedVideoFpsRanges(ArtificialStackFrames2);
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                    list.add(java.lang.Integer.valueOf(coroutineBoundary()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Integer.valueOf(coroutineBoundary()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputSizes(java.util.List<java.lang.Long> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
                androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        getHighSpeedVideoFpsRangesFor(ArtificialStackFrames);
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            longArrayList.addLong(accessartificialFrame());
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        longArrayList.addLong(accessartificialFrame());
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i2 == this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i2;
                            return;
                        }
                    } else {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    getHighSpeedVideoFpsRangesFor(ArtificialStackFrames2);
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Long.valueOf(accessartificialFrame()));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    list.add(java.lang.Long.valueOf(accessartificialFrame()));
                    int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i4 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    }
                } else {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputSizeshNQ4ISI(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.IntArrayList) {
                androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            intArrayList.addInt(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames()));
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    intArrayList.addInt(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames()));
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i2 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i2;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames())));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                list.add(java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames())));
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 == this.getHighSpeedVideoSizes) {
                    return;
                }
                if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i4;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final void getOutputStallDuration(java.util.List<java.lang.Long> list) throws java.io.IOException {
            if (list instanceof androidx.content.preferences.protobuf.LongArrayList) {
                androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) list;
                int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int ArtificialStackFrames = ArtificialStackFrames();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        while (this.getHighResolutionOutputSizeshNQ4ISI < i + ArtificialStackFrames) {
                            longArrayList.addLong(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a()));
                        }
                        return;
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                }
                while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                    longArrayList.addLong(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a()));
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i2 == this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i2;
                        return;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            int tagWireType2 = androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int ArtificialStackFrames2 = ArtificialStackFrames();
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    while (this.getHighResolutionOutputSizeshNQ4ISI < i3 + ArtificialStackFrames2) {
                        list.add(java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a())));
                    }
                    return;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            while (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                list.add(java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a())));
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 == this.getHighSpeedVideoSizes) {
                    return;
                }
                if (ArtificialStackFrames() != this.getOutputMinFrameDuration) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i4;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        private java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            switch (androidx.content.preferences.protobuf.BinaryReader.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
                case 1:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Boolean.valueOf(ArtificialStackFrames() != 0);
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 2:
                    return Camera2StreamConfigurationMap();
                case 3:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(accessartificialFrame()));
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 4:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Integer.valueOf(ArtificialStackFrames());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 5:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 5) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Integer.valueOf(coroutineBoundary());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 6:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Long.valueOf(accessartificialFrame());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 7:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 5) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(coroutineBoundary()));
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 8:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Integer.valueOf(ArtificialStackFrames());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 9:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Long.valueOf(a());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 10:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 2) {
                        return getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls), extensionRegistryLite);
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 11:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 5) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Integer.valueOf(coroutineBoundary());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 12:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) != 1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                        return java.lang.Long.valueOf(accessartificialFrame());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                case 13:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames()));
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 14:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a()));
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 15:
                    return getHighSpeedVideoFpsRanges(true);
                case 16:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Integer.valueOf(ArtificialStackFrames());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                case 17:
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                        return java.lang.Long.valueOf(a());
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
                default:
                    throw new java.lang.RuntimeException("unsupported field type.");
            }
        }

        private int ArtificialStackFrames() throws java.io.IOException {
            int i;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 == i2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) _CREATION();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b;
            if (i6 < 0) {
                i = i6 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << 14) ^ i6;
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << com.google.common.base.Ascii.NAK);
                    if (i10 < 0) {
                        i = (-2080896) ^ i10;
                    } else {
                        i7 = i2 + 5;
                        byte b2 = bArr[i9];
                        int i11 = (i10 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                        if (b2 < 0) {
                            i9 = i2 + 6;
                            if (bArr[i7] < 0) {
                                i7 = i2 + 7;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 8;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 9;
                                        if (bArr[i9] < 0) {
                                            if (bArr[i7] < 0) {
                                                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
                                            }
                                            i5 = i2 + 10;
                                            i = i11;
                                        }
                                    }
                                }
                            }
                            i = i11;
                        }
                        i = i11;
                    }
                    i5 = i9;
                }
                i5 = i7;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i5;
            return i;
        }

        private long a() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 == i) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return _CREATION();
            }
            int i4 = i + 2;
            int i5 = (bArr[i3] << 7) ^ b;
            if (i5 < 0) {
                j = i5 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            } else {
                int i6 = i + 3;
                int i7 = (bArr[i4] << 14) ^ i5;
                if (i7 >= 0) {
                    j = i7 ^ 16256;
                    i4 = i6;
                } else {
                    int i8 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << com.google.common.base.Ascii.NAK);
                    if (i9 < 0) {
                        long j4 = (-2080896) ^ i9;
                        i4 = i8;
                        j = j4;
                    } else {
                        long j5 = i9;
                        i4 = i + 5;
                        long j6 = j5 ^ (bArr[i8] << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            int i10 = i + 6;
                            long j7 = j6 ^ (bArr[i4] << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i4 = i + 7;
                                j6 = j7 ^ (bArr[i10] << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i10 = i + 8;
                                    j7 = j6 ^ (bArr[i4] << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        i4 = i + 9;
                                        long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            if (bArr[i4] < 0) {
                                                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
                                            }
                                            i4 = i + 10;
                                        }
                                        j = j8;
                                    }
                                }
                            }
                            j = j7 ^ j2;
                            i4 = i10;
                        }
                        j = j6 ^ j3;
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            return j;
        }

        private long _CREATION() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((coroutineCreation() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        private byte coroutineCreation() throws java.io.IOException {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == this.getHighSpeedVideoSizes) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            return bArr[i];
        }

        private int coroutineBoundary() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long accessartificialFrame() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private void getARTIFICIAL_FRAME_PACKAGE_NAME() throws java.io.IOException {
            int i = this.getHighSpeedVideoSizes;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i - i2 >= 10) {
                byte[] bArr = this.Camera2StreamConfigurationMap;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            for (int i5 = 0; i5 < 10; i5++) {
                if (coroutineCreation() >= 0) {
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        private void b() throws java.io.IOException {
            int i = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.getOutputMinFrameDuration), 4);
            while (getHighSpeedVideoFpsRangesFor() != Integer.MAX_VALUE && CoroutineDebuggingKt()) {
            }
            if (this.getOutputMinFrameDuration != this.getHighSpeedVideoFpsRangesFor) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        private void getHighSpeedVideoSizes(int i) throws java.io.IOException {
            if (i >= 0) {
                int i2 = this.getHighSpeedVideoSizes;
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i <= i2 - i3) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i3 + i;
                    return;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        private void getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
            if (i < 0 || i > this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if ((i & 3) != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            if (this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes) {
                return Integer.MAX_VALUE;
            }
            int ArtificialStackFrames = ArtificialStackFrames();
            this.getOutputMinFrameDuration = ArtificialStackFrames;
            if (ArtificialStackFrames == this.getHighSpeedVideoFpsRangesFor) {
                return Integer.MAX_VALUE;
            }
            return androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(ArtificialStackFrames);
        }

        private void getHighSpeedVideoFpsRangesFor(int i) throws java.io.IOException {
            if (i < 0 || i > this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if ((i & 7) != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final boolean CoroutineDebuggingKt() throws java.io.IOException {
            int i;
            if (this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes || (i = this.getOutputMinFrameDuration) == this.getHighSpeedVideoFpsRangesFor) {
                return false;
            }
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                getARTIFICIAL_FRAME_PACKAGE_NAME();
                return true;
            }
            if (tagWireType == 1) {
                getHighSpeedVideoSizes(8);
                return true;
            }
            if (tagWireType == 2) {
                getHighSpeedVideoSizes(ArtificialStackFrames());
                return true;
            }
            if (tagWireType == 3) {
                b();
                return true;
            }
            if (tagWireType == 5) {
                getHighSpeedVideoSizes(4);
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final boolean getHighSpeedVideoFpsRanges() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return ArtificialStackFrames() != 0;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final androidx.content.preferences.protobuf.ByteString Camera2StreamConfigurationMap() throws java.io.IOException {
            androidx.content.preferences.protobuf.ByteString copyFrom;
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 2) {
                int ArtificialStackFrames = ArtificialStackFrames();
                if (ArtificialStackFrames == 0) {
                    return androidx.content.preferences.protobuf.ByteString.EMPTY;
                }
                if (ArtificialStackFrames >= 0) {
                    int i = this.getHighSpeedVideoSizes;
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (ArtificialStackFrames <= i - i2) {
                        if (this.getHighSpeedVideoFpsRanges) {
                            copyFrom = androidx.content.preferences.protobuf.ByteString.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, i2, ArtificialStackFrames);
                        } else {
                            copyFrom = androidx.content.preferences.protobuf.ByteString.copyFrom(this.Camera2StreamConfigurationMap, i2, ArtificialStackFrames);
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI += ArtificialStackFrames;
                        return copyFrom;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final double getHighSpeedVideoSizes() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return java.lang.Double.longBitsToDouble(accessartificialFrame());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getOutputFormats() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return ArtificialStackFrames();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getInputFormats() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return coroutineBoundary();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final long getInputSizeshNQ4ISI() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return accessartificialFrame();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final float getHighSpeedVideoSizesFor() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return java.lang.Float.intBitsToFloat(coroutineBoundary());
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        @java.lang.Deprecated
        public final <T> T getHighSpeedVideoSizes(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 3) {
                return (T) getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls), extensionRegistryLite);
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getOutputMinFrameDuration() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return ArtificialStackFrames();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final long getOutputStallDuration() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return a();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.preferences.protobuf.Reader
        public final <K, V> void getHighSpeedVideoSizes(java.util.Map<K, V> map, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 2) {
                int ArtificialStackFrames = ArtificialStackFrames();
                if (ArtificialStackFrames >= 0) {
                    int i = this.getHighSpeedVideoSizes;
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (ArtificialStackFrames <= i - i2) {
                        this.getHighSpeedVideoSizes = i2 + ArtificialStackFrames;
                        try {
                            java.lang.Object obj = metadata.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object obj2 = metadata.Camera2StreamConfigurationMap;
                            while (true) {
                                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                                if (highSpeedVideoFpsRangesFor == Integer.MAX_VALUE) {
                                    map.put(obj, obj2);
                                    return;
                                }
                                if (highSpeedVideoFpsRangesFor == 1) {
                                    obj = getHighResolutionOutputSizeshNQ4ISI(metadata.getHighSpeedVideoFpsRanges, null, null);
                                } else if (highSpeedVideoFpsRangesFor == 2) {
                                    obj2 = getHighResolutionOutputSizeshNQ4ISI(metadata.getHighResolutionOutputSizeshNQ4ISI, metadata.Camera2StreamConfigurationMap.getClass(), extensionRegistryLite);
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
                            }
                        } finally {
                            this.getHighSpeedVideoSizes = i;
                        }
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 2) {
                return (T) getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls), extensionRegistryLite);
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getOutputMinFrameDurationlomOqCM() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 5) {
                if (4 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return coroutineBoundary();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final long getOutputSizeshNQ4ISI() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 1) {
                if (8 <= this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) {
                    return accessartificialFrame();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int getOutputStallDurationlomOqCM() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(ArtificialStackFrames());
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final long getOutputSizes() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(a());
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        private java.lang.String getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 2) {
                int ArtificialStackFrames = ArtificialStackFrames();
                if (ArtificialStackFrames == 0) {
                    return "";
                }
                if (ArtificialStackFrames >= 0) {
                    int i = this.getHighSpeedVideoSizes;
                    int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (ArtificialStackFrames <= i - i2) {
                        if (z && !androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, i2, i2 + ArtificialStackFrames)) {
                            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                        }
                        java.lang.String str = new java.lang.String(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, ArtificialStackFrames, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                        this.getHighResolutionOutputSizeshNQ4ISI += ArtificialStackFrames;
                        return str;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final int unwrapAs() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return ArtificialStackFrames();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.Reader
        public final long getValidOutputFormatsForInputhNQ4ISI() throws java.io.IOException {
            if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(this.getOutputMinFrameDuration) == 0) {
                return a();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }
}
