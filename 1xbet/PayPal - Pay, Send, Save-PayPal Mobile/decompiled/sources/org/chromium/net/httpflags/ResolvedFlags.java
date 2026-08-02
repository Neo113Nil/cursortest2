package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class ResolvedFlags {
    private final java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> Camera2StreamConfigurationMap;

    /* renamed from: org.chromium.net.httpflags.ResolvedFlags$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.BOOL_VALUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.INT_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.FLOAT_VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.STRING_VALUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.BYTES_VALUE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.VALUE_NOT_SET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static final class Value {
        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        public enum Type {
            BOOL,
            INT,
            FLOAT,
            STRING,
            BYTES
        }

        public Value(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.valueOf(z);
        }

        public Value(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Long.valueOf(j);
        }

        public Value(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Float.valueOf(f);
        }

        public Value(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public Value(com.google.protobuf.ByteString byteString) {
            this.getHighResolutionOutputSizeshNQ4ISI = byteString;
        }

        public final org.chromium.net.httpflags.ResolvedFlags.Value.Type getType() {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj instanceof java.lang.Boolean) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL;
            }
            if (obj instanceof java.lang.Long) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT;
            }
            if (obj instanceof java.lang.Float) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT;
            }
            if (obj instanceof java.lang.String) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING;
            }
            if (obj instanceof com.google.protobuf.ByteString) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES;
            }
            throw new java.lang.IllegalStateException("Unexpected flag value type: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
        }

        private void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type type) {
            org.chromium.net.httpflags.ResolvedFlags.Value.Type type2 = getType();
            if (type == type2) {
                return;
            }
            java.lang.String valueOf = java.lang.String.valueOf(type);
            java.lang.String valueOf2 = java.lang.String.valueOf(type2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to access flag value as ");
            sb.append(valueOf);
            sb.append(", but actual type is ");
            sb.append(valueOf2);
            throw new java.lang.IllegalStateException(sb.toString());
        }

        public final boolean getBoolValue() {
            getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL);
            return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI).booleanValue();
        }

        public final long getIntValue() {
            getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT);
            return ((java.lang.Long) this.getHighResolutionOutputSizeshNQ4ISI).longValue();
        }

        public final float getFloatValue() {
            getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT);
            return ((java.lang.Float) this.getHighResolutionOutputSizeshNQ4ISI).floatValue();
        }

        public final java.lang.String getStringValue() {
            getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING);
            return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final com.google.protobuf.ByteString getBytesValue() {
            getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES);
            return (com.google.protobuf.ByteString) this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI.toString();
        }

        static /* synthetic */ org.chromium.net.httpflags.ResolvedFlags.Value getHighSpeedVideoFpsRanges(org.chromium.net.httpflags.FlagValue flagValue, java.lang.String str, int[] iArr, boolean z) {
            loop0: for (org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue : flagValue.getConstrainedValuesList()) {
                if (z || constrainedValue.getApplyEvenIfCronetTelemetryDisabled()) {
                    if (!constrainedValue.hasAppId() || constrainedValue.getAppId().equals(str)) {
                        if (constrainedValue.hasMinVersion()) {
                            int[] highSpeedVideoFpsRangesFor = org.chromium.net.httpflags.ResolvedFlags.getHighSpeedVideoFpsRangesFor(constrainedValue.getMinVersion());
                            int i = 0;
                            while (i < java.lang.Math.max(iArr.length, highSpeedVideoFpsRangesFor.length)) {
                                int i2 = i < iArr.length ? iArr[i] : 0;
                                int i3 = i < highSpeedVideoFpsRangesFor.length ? highSpeedVideoFpsRangesFor[i] : 0;
                                if (i2 > i3) {
                                    break loop0;
                                }
                                if (i2 < i3) {
                                    break;
                                }
                                i++;
                            }
                        }
                        org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase valueCase = constrainedValue.getValueCase();
                        switch (org.chromium.net.httpflags.ResolvedFlags.AnonymousClass1.getHighSpeedVideoSizes[valueCase.ordinal()]) {
                            case 1:
                                return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getBoolValue());
                            case 2:
                                return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getIntValue());
                            case 3:
                                return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getFloatValue());
                            case 4:
                                return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getStringValue());
                            case 5:
                                return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getBytesValue());
                            case 6:
                                return null;
                            default:
                                throw new java.lang.IllegalArgumentException("Flag value uses unknown value type ".concat(java.lang.String.valueOf(java.lang.String.valueOf(valueCase))));
                        }
                    }
                }
            }
            return null;
        }
    }

    public static org.chromium.net.httpflags.ResolvedFlags resolve(org.chromium.net.httpflags.Flags flags, java.lang.String str, java.lang.String str2, boolean z) {
        org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("Cronet ResolvedFlags#resolve");
        try {
            int[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<java.lang.String, org.chromium.net.httpflags.FlagValue> entry : flags.getFlagsMap().entrySet()) {
                try {
                    org.chromium.net.httpflags.ResolvedFlags.Value highSpeedVideoFpsRanges = org.chromium.net.httpflags.ResolvedFlags.Value.getHighSpeedVideoFpsRanges(entry.getValue(), str, highSpeedVideoFpsRangesFor, z);
                    if (highSpeedVideoFpsRanges != null) {
                        hashMap.put(entry.getKey(), highSpeedVideoFpsRanges);
                    }
                } catch (java.lang.RuntimeException e) {
                    java.lang.String key = entry.getKey();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Unable to resolve HTTP flag `");
                    sb.append(key);
                    sb.append("`");
                    throw new java.lang.IllegalArgumentException(sb.toString(), e);
                }
            }
            org.chromium.net.httpflags.ResolvedFlags resolvedFlags = new org.chromium.net.httpflags.ResolvedFlags(hashMap);
            if (scoped != null) {
                scoped.close();
            }
            return resolvedFlags;
        } catch (java.lang.Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public ResolvedFlags(java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> map) {
        this.Camera2StreamConfigurationMap = map;
    }

    public final java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> flags() {
        return java.util.Collections.unmodifiableMap(this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Version string is empty");
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i = 0; i < countTokens; i++) {
                iArr[i] = java.lang.Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (java.lang.RuntimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse HTTP flags version string: `");
            sb.append(str);
            sb.append("`");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }
}
