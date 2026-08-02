package com.sun.jna;

/* loaded from: classes5.dex */
class ELFAnalyser {
    private static final byte[] getHighSpeedVideoFpsRangesFor = {Byte.MAX_VALUE, 69, 76, 70};
    private final java.lang.String getInputFormats;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean Camera2StreamConfigurationMap = false;
    private boolean getHighSpeedVideoSizesFor = false;
    boolean getHighSpeedVideoFpsRanges = false;
    private boolean getOutputMinFrameDuration = false;
    boolean getHighSpeedVideoSizes = false;
    private boolean getInputSizeshNQ4ISI = false;

    /* JADX WARN: Removed duplicated region for block: B:109:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.sun.jna.ELFAnalyser getHighSpeedVideoFpsRanges(java.lang.String str) throws java.io.IOException {
        java.util.Map map;
        java.util.Map map2;
        com.sun.jna.ELFAnalyser eLFAnalyser = new com.sun.jna.ELFAnalyser(str);
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(eLFAnalyser.getInputFormats, "r");
        try {
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (java.util.Arrays.equals(bArr, getHighSpeedVideoFpsRangesFor)) {
                    eLFAnalyser.getHighResolutionOutputSizeshNQ4ISI = true;
                }
            }
            if (eLFAnalyser.getHighResolutionOutputSizeshNQ4ISI) {
                randomAccessFile.seek(4L);
                byte readByte = randomAccessFile.readByte();
                byte readByte2 = randomAccessFile.readByte();
                eLFAnalyser.Camera2StreamConfigurationMap = readByte == 2;
                eLFAnalyser.getHighSpeedVideoSizesFor = readByte2 == 2;
                randomAccessFile.seek(0L);
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(eLFAnalyser.Camera2StreamConfigurationMap ? 64 : 52);
                randomAccessFile.getChannel().read(allocate, 0L);
                allocate.order(eLFAnalyser.getHighSpeedVideoSizesFor ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
                boolean z = allocate.get(18) == 40;
                eLFAnalyser.getInputSizeshNQ4ISI = z;
                if (z) {
                    int i = allocate.getInt(eLFAnalyser.Camera2StreamConfigurationMap ? 48 : 36);
                    eLFAnalyser.getHighSpeedVideoFpsRanges = (i & 1024) == 1024;
                    eLFAnalyser.getOutputMinFrameDuration = (i & 512) == 512;
                    for (com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry eLFSectionHeaderEntry : new com.sun.jna.ELFAnalyser.ELFSectionHeaders(eLFAnalyser.Camera2StreamConfigurationMap, eLFAnalyser.getHighSpeedVideoSizesFor, allocate, randomAccessFile).getHighSpeedVideoFpsRanges) {
                        if (".ARM.attributes".equals(eLFSectionHeaderEntry.getHighSpeedVideoFpsRangesFor)) {
                            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate((int) eLFSectionHeaderEntry.getHighResolutionOutputSizeshNQ4ISI);
                            allocate2.order(eLFAnalyser.getHighSpeedVideoSizesFor ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
                            randomAccessFile.getChannel().read(allocate2, eLFSectionHeaderEntry.getHighSpeedVideoFpsRanges);
                            allocate2.rewind();
                            if (allocate2.get() == 65) {
                                while (allocate2.position() < allocate2.limit()) {
                                    int position = allocate2.position();
                                    int i2 = allocate2.getInt();
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    if (!"aeabi".equals(getHighSpeedVideoFpsRangesFor(allocate2))) {
                                        allocate2.position(position + i2);
                                    } else {
                                        map = new java.util.HashMap();
                                        while (allocate2.position() < allocate2.limit()) {
                                            int position2 = allocate2.position();
                                            int intValue = getHighSpeedVideoSizes(allocate2).intValue();
                                            int i3 = allocate2.getInt();
                                            if (intValue == 1) {
                                                java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                                                java.util.HashMap hashMap = new java.util.HashMap();
                                                while (allocate2.position() < allocate2.limit()) {
                                                    com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag highSpeedVideoSizes = com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.getHighSpeedVideoSizes(getHighSpeedVideoSizes(allocate2).intValue());
                                                    int ordinal = highSpeedVideoSizes.AMEXKernelCallback.ordinal();
                                                    if (ordinal == 0) {
                                                        hashMap.put(highSpeedVideoSizes, java.lang.Integer.valueOf(allocate2.getInt()));
                                                    } else if (ordinal == 1) {
                                                        hashMap.put(highSpeedVideoSizes, getHighSpeedVideoFpsRangesFor(allocate2));
                                                    } else if (ordinal == 2) {
                                                        hashMap.put(highSpeedVideoSizes, getHighSpeedVideoSizes(allocate2));
                                                    }
                                                }
                                                map.put(valueOf, hashMap);
                                            }
                                            allocate2.position(position2 + i3);
                                        }
                                        map2 = (java.util.Map) map.get(1);
                                        if (map2 == null) {
                                            java.lang.Object obj = map2.get(com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.getOutputStallDuration);
                                            if ((obj instanceof java.lang.Integer) && ((java.lang.Integer) obj).equals(1)) {
                                                eLFAnalyser.getHighSpeedVideoSizes = true;
                                            } else if ((obj instanceof java.math.BigInteger) && ((java.math.BigInteger) obj).intValue() == 1) {
                                                eLFAnalyser.getHighSpeedVideoSizes = true;
                                            }
                                        }
                                    }
                                }
                            }
                            map = java.util.Collections.EMPTY_MAP;
                            map2 = (java.util.Map) map.get(1);
                            if (map2 == null) {
                            }
                        }
                    }
                }
            }
            return eLFAnalyser;
        } finally {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private ELFAnalyser(java.lang.String str) {
        this.getInputFormats = str;
    }

    static class ELFSectionHeaders {
        final java.util.List<com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public ELFSectionHeaders(boolean z, boolean z2, java.nio.ByteBuffer byteBuffer, java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
            long j;
            short s;
            short s2;
            int i;
            byte b;
            if (z) {
                j = byteBuffer.getLong(40);
                s = byteBuffer.getShort(58);
                s2 = byteBuffer.getShort(60);
                i = byteBuffer.getShort(62);
            } else {
                j = byteBuffer.getInt(32);
                s = byteBuffer.getShort(46);
                s2 = byteBuffer.getShort(48);
                i = byteBuffer.getShort(50);
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(s);
            randomAccessFile.getChannel().read(allocate, j);
            com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry eLFSectionHeaderEntry = new com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry(z, allocate);
            int i2 = (s2 != 0 || j == 0) ? s2 : (int) eLFSectionHeaderEntry.getHighResolutionOutputSizeshNQ4ISI;
            i = i == 65535 ? eLFSectionHeaderEntry.getHighSpeedVideoSizes : i;
            int i3 = i2 * s;
            if (i3 == 0 || i == 0) {
                return;
            }
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i3);
            allocate2.order(z2 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(allocate2, j);
            for (int i4 = 0; i4 < s2; i4++) {
                allocate2.position(i4 * s);
                java.nio.ByteBuffer slice = allocate2.slice();
                slice.order(allocate2.order());
                slice.limit(s);
                this.getHighSpeedVideoFpsRanges.add(new com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry(z, slice));
            }
            com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry eLFSectionHeaderEntry2 = this.getHighSpeedVideoFpsRanges.get(i);
            java.nio.ByteBuffer allocate3 = java.nio.ByteBuffer.allocate((int) eLFSectionHeaderEntry2.getHighResolutionOutputSizeshNQ4ISI);
            allocate3.order(z2 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(allocate3, eLFSectionHeaderEntry2.getHighSpeedVideoFpsRanges);
            allocate3.rewind();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(20);
            for (com.sun.jna.ELFAnalyser.ELFSectionHeaderEntry eLFSectionHeaderEntry3 : this.getHighSpeedVideoFpsRanges) {
                byteArrayOutputStream.reset();
                allocate3.position(eLFSectionHeaderEntry3.Camera2StreamConfigurationMap);
                while (allocate3.position() < allocate3.limit() && (b = allocate3.get()) != 0) {
                    byteArrayOutputStream.write(b);
                }
                eLFSectionHeaderEntry3.getHighSpeedVideoFpsRangesFor = byteArrayOutputStream.toString("ASCII");
            }
        }
    }

    static class ELFSectionHeaderEntry {
        final int Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        private final long getHighSpeedVideoSizesFor;
        private final int getInputSizeshNQ4ISI;
        private final long getOutputMinFrameDuration;

        public ELFSectionHeaderEntry(boolean z, java.nio.ByteBuffer byteBuffer) {
            this.Camera2StreamConfigurationMap = byteBuffer.getInt(0);
            this.getInputSizeshNQ4ISI = byteBuffer.getInt(4);
            this.getOutputMinFrameDuration = z ? byteBuffer.getLong(8) : byteBuffer.getInt(8);
            this.getHighSpeedVideoSizesFor = z ? byteBuffer.getLong(16) : byteBuffer.getInt(12);
            this.getHighSpeedVideoFpsRanges = z ? byteBuffer.getLong(24) : byteBuffer.getInt(16);
            this.getHighResolutionOutputSizeshNQ4ISI = z ? byteBuffer.getLong(32) : byteBuffer.getInt(20);
            this.getHighSpeedVideoSizes = byteBuffer.getInt(z ? 40 : 24);
        }

        public java.lang.String toString() {
            int i = this.Camera2StreamConfigurationMap;
            return java.lang.String.format("ELFSectionHeaderEntry{nameOffset=%1$d (0x%1$x), name=%2$s, type=%3$d (0x%3$x), flags=%4$d (0x%4$x), addr=%5$d (0x%5$x), offset=%6$d (0x%6$x), size=%7$d (0x%7$x), link=%8$d (0x%8$x)}", java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI), java.lang.Long.valueOf(this.getOutputMinFrameDuration), java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor), java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
        }
    }

    static class ArmAeabiAttributesTag {
        final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType AMEXKernelCallback;
        private final java.lang.String AMEXKernelJNI;
        private final int freeTransaction;
        private static final java.util.List<com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> sha1 = new java.util.LinkedList();
        private static final java.util.Map<java.lang.Integer, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> rsaCipher = new java.util.HashMap();
        private static final java.util.Map<java.lang.String, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> updateUI = new java.util.HashMap();

        /* renamed from: a, reason: collision with root package name */
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag f6672a = Camera2StreamConfigurationMap(1, "File", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.UINT32);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag kernelVersion = Camera2StreamConfigurationMap(2, "Section", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.UINT32);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag init = Camera2StreamConfigurationMap(3, "Symbol", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.UINT32);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag accessartificialFrame = Camera2StreamConfigurationMap(4, "CPU_raw_name", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag coroutineCreation = Camera2StreamConfigurationMap(5, "CPU_name", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag ArtificialStackFrames = Camera2StreamConfigurationMap(6, "CPU_arch", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag CoroutineDebuggingKt = Camera2StreamConfigurationMap(7, "CPU_arch_profile", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getValidOutputFormatsForInputhNQ4ISI = Camera2StreamConfigurationMap(8, "ARM_ISA_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag resetTransaction = Camera2StreamConfigurationMap(9, "THUMB_ISA_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag b = Camera2StreamConfigurationMap(10, "FP_arch", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag release = Camera2StreamConfigurationMap(11, "WMMX_arch", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag coroutineBoundary = Camera2StreamConfigurationMap(12, "Advanced_SIMD_arch", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag d = Camera2StreamConfigurationMap(13, "PCS_config", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputMinFrameDuration = Camera2StreamConfigurationMap(14, "ABI_PCS_R9_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputStallDurationlomOqCM = Camera2StreamConfigurationMap(15, "ABI_PCS_RW_data", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputMinFrameDurationlomOqCM = Camera2StreamConfigurationMap(16, "ABI_PCS_RO_data", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(17, "ABI_PCS_GOT_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(18, "ABI_PCS_wchar_t", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getInputFormats = Camera2StreamConfigurationMap(19, "ABI_FP_rounding", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(20, "ABI_FP_denormal", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(21, "ABI_FP_exceptions", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputFormats = Camera2StreamConfigurationMap(22, "ABI_FP_user_exceptions", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighSpeedVideoSizes = Camera2StreamConfigurationMap(23, "ABI_FP_number_model", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag isOutputSupportedForhNQ4ISI = Camera2StreamConfigurationMap(24, "ABI_align_needed", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag unwrapAs = Camera2StreamConfigurationMap(25, "ABI_align8_preserved", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag isOutputSupportedFor = Camera2StreamConfigurationMap(26, "ABI_enum_size", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getInputSizeshNQ4ISI = Camera2StreamConfigurationMap(27, "ABI_HardFP_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputStallDuration = Camera2StreamConfigurationMap(28, "ABI_VFP_args", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getOutputSizes = Camera2StreamConfigurationMap(29, "ABI_WMMX_args", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag toString = Camera2StreamConfigurationMap(30, "ABI_optimization_goals", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(31, "ABI_FP_optimization_goals", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag requestPINEntry = Camera2StreamConfigurationMap(32, "compatibility", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag _CREATION = Camera2StreamConfigurationMap(34, "CPU_unaligned_access", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getARTIFICIAL_FRAME_PACKAGE_NAME = Camera2StreamConfigurationMap(36, "FP_HP_extension", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(38, "ABI_FP_16bit_format", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag c = Camera2StreamConfigurationMap(42, "MPextension_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag _BOUNDARY = Camera2StreamConfigurationMap(44, "DIV_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag requestGoOnline = Camera2StreamConfigurationMap(64, "nodefaults", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag startTransaction = Camera2StreamConfigurationMap(65, "also_compatible_with", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag l = Camera2StreamConfigurationMap(67, "conformance", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag exchange = Camera2StreamConfigurationMap(66, "T2EE_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag AMEXKernela = Camera2StreamConfigurationMap(68, "Virtualization_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);
        public static final com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag AMEXKernel = Camera2StreamConfigurationMap(70, "MPextension_use", com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128);

        public enum ParameterType {
            UINT32,
            NTBS,
            ULEB128
        }

        private ArmAeabiAttributesTag(int i, java.lang.String str, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType parameterType) {
            this.freeTransaction = i;
            this.AMEXKernelJNI = str;
            this.AMEXKernelCallback = parameterType;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.AMEXKernelJNI);
            sb.append(" (");
            sb.append(this.freeTransaction);
            sb.append(")");
            return sb.toString();
        }

        public int hashCode() {
            return this.freeTransaction + 469;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.freeTransaction == ((com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag) obj).freeTransaction;
        }

        private static com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag Camera2StreamConfigurationMap(int i, java.lang.String str, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType parameterType) {
            com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag armAeabiAttributesTag = new com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag(i, str, parameterType);
            java.util.Map<java.lang.Integer, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> map = rsaCipher;
            if (!map.containsKey(java.lang.Integer.valueOf(armAeabiAttributesTag.freeTransaction))) {
                map.put(java.lang.Integer.valueOf(armAeabiAttributesTag.freeTransaction), armAeabiAttributesTag);
            }
            java.util.Map<java.lang.String, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> map2 = updateUI;
            if (!map2.containsKey(armAeabiAttributesTag.AMEXKernelJNI)) {
                map2.put(armAeabiAttributesTag.AMEXKernelJNI, armAeabiAttributesTag);
            }
            sha1.add(armAeabiAttributesTag);
            return armAeabiAttributesTag;
        }

        public static com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag getHighSpeedVideoSizes(int i) {
            com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType parameterType;
            java.util.Map<java.lang.Integer, com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag> map = rsaCipher;
            if (map.containsKey(java.lang.Integer.valueOf(i))) {
                return map.get(java.lang.Integer.valueOf(i));
            }
            java.lang.String concat = "Unknown ".concat(java.lang.String.valueOf(i));
            com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag highSpeedVideoSizes = getHighSpeedVideoSizes(i);
            if (highSpeedVideoSizes == null) {
                if (i % 2 == 0) {
                    parameterType = com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.ULEB128;
                } else {
                    parameterType = com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.ParameterType.NTBS;
                }
            } else {
                parameterType = highSpeedVideoSizes.AMEXKernelCallback;
            }
            return new com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag(i, concat, parameterType);
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - position) - 1];
        byteBuffer.position(position);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new java.lang.String(bArr, "ASCII");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static java.math.BigInteger getHighSpeedVideoSizes(java.nio.ByteBuffer byteBuffer) {
        java.math.BigInteger bigInteger = java.math.BigInteger.ZERO;
        int i = 0;
        while (true) {
            byte b = byteBuffer.get();
            bigInteger = bigInteger.or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE).shiftLeft(i));
            if ((b & 128) == 0) {
                return bigInteger;
            }
            i += 7;
        }
    }
}
