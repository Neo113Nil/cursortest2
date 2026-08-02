package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class BaseFeature {
    public static final java.lang.String FLAG_PREFIX = "ChromiumBaseFeature_";
    public static final java.lang.String PARAM_DELIMITER = "_PARAM_";

    private BaseFeature() {
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides getOverrides(org.chromium.net.httpflags.ResolvedFlags resolvedFlags) {
        org.chromium.net.httpflags.BaseFeature.ParsedFlagName parsedFlagName;
        java.lang.String str;
        com.google.protobuf.ByteString copyFrom;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> entry : resolvedFlags.flags().entrySet()) {
            try {
                java.lang.String key = entry.getKey();
                org.chromium.net.httpflags.ResolvedFlags.Value value = entry.getValue();
                if (key.startsWith(FLAG_PREFIX)) {
                    java.lang.String substring = key.substring(20);
                    org.chromium.net.httpflags.BaseFeature.ParsedFlagName parsedFlagName2 = new org.chromium.net.httpflags.BaseFeature.ParsedFlagName((byte) 0);
                    int indexOf = substring.indexOf(PARAM_DELIMITER);
                    if (indexOf < 0) {
                        parsedFlagName2.getHighSpeedVideoFpsRanges = substring;
                    } else {
                        parsedFlagName2.getHighSpeedVideoFpsRanges = substring.substring(0, indexOf);
                        parsedFlagName2.getHighSpeedVideoFpsRangesFor = substring.substring(indexOf + 7);
                    }
                    parsedFlagName = parsedFlagName2;
                } else {
                    parsedFlagName = null;
                }
                if (parsedFlagName != null) {
                    org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder builder = (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder) hashMap.get(parsedFlagName.getHighSpeedVideoFpsRanges);
                    if (builder == null) {
                        builder = org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.newBuilder();
                        hashMap.put(parsedFlagName.getHighSpeedVideoFpsRanges, builder);
                    }
                    if (parsedFlagName.getHighSpeedVideoFpsRangesFor != null) {
                        java.lang.String str2 = parsedFlagName.getHighSpeedVideoFpsRangesFor;
                        org.chromium.net.httpflags.ResolvedFlags.Value.Type type = value.getType();
                        int i = org.chromium.net.httpflags.BaseFeature.AnonymousClass1.Camera2StreamConfigurationMap[type.ordinal()];
                        if (i == 1) {
                            str = value.getBoolValue() ? "true" : "false";
                        } else if (i == 2) {
                            str = java.lang.Long.toString(value.getIntValue(), 10);
                        } else if (i == 3) {
                            str = java.lang.Float.toString(value.getFloatValue());
                        } else {
                            if (i == 4) {
                                copyFrom = com.google.protobuf.ByteString.copyFrom(value.getStringValue(), java.nio.charset.StandardCharsets.UTF_8);
                            } else if (i == 5) {
                                copyFrom = value.getBytesValue();
                            } else {
                                java.lang.String valueOf = java.lang.String.valueOf(type);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported HTTP flag value type for base::Feature param `");
                                sb.append(str2);
                                sb.append("`: ");
                                sb.append(valueOf);
                                throw new java.lang.UnsupportedOperationException(sb.toString());
                            }
                            builder.putParams(str2, copyFrom);
                        }
                        copyFrom = com.google.protobuf.ByteString.copyFrom(str, java.nio.charset.StandardCharsets.UTF_8);
                        builder.putParams(str2, copyFrom);
                    } else {
                        org.chromium.net.httpflags.ResolvedFlags.Value.Type type2 = value.getType();
                        if (type2 != org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL) {
                            java.lang.String valueOf2 = java.lang.String.valueOf(type2);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("HTTP flag has type ");
                            sb2.append(valueOf2);
                            sb2.append(", but only boolean flags are supported as base::Feature overrides");
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                        }
                        builder.setEnabled(value.getBoolValue());
                    }
                }
            } catch (java.lang.RuntimeException e) {
                java.lang.String key2 = entry.getKey();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Could not parse HTTP flag `");
                sb3.append(key2);
                sb3.append("` as a base::Feature override");
                throw new java.lang.IllegalArgumentException(sb3.toString(), e);
            }
        }
        org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder = org.chromium.net.httpflags.BaseFeatureOverrides.newBuilder();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            newBuilder.putFeatureStates((java.lang.String) entry2.getKey(), ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder) entry2.getValue()).build());
        }
        return newBuilder.build();
    }

    static final class ParsedFlagName {
        public java.lang.String getHighSpeedVideoFpsRanges;
        public java.lang.String getHighSpeedVideoFpsRangesFor;

        private ParsedFlagName() {
        }

        /* synthetic */ ParsedFlagName(byte b) {
            this();
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeature$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.chromium.net.httpflags.ResolvedFlags.Value.Type.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}
