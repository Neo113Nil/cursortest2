package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class FlagValue extends com.google.protobuf.GeneratedMessageLite<org.chromium.net.httpflags.FlagValue, org.chromium.net.httpflags.FlagValue.Builder> implements org.chromium.net.httpflags.FlagValueOrBuilder {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final org.chromium.net.httpflags.FlagValue getHighSpeedVideoFpsRanges;
    private static volatile com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue> getHighSpeedVideoFpsRangesFor;
    private com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> Camera2StreamConfigurationMap = emptyProtobufList();

    public interface ConstrainedValueOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAppId();

        com.google.protobuf.ByteString getAppIdBytes();

        boolean getApplyEvenIfCronetTelemetryDisabled();

        boolean getBoolValue();

        com.google.protobuf.ByteString getBytesValue();

        float getFloatValue();

        long getIntValue();

        java.lang.String getMinVersion();

        com.google.protobuf.ByteString getMinVersionBytes();

        java.lang.String getStringValue();

        com.google.protobuf.ByteString getStringValueBytes();

        org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase();

        boolean hasAppId();

        boolean hasApplyEvenIfCronetTelemetryDisabled();

        boolean hasBoolValue();

        boolean hasBytesValue();

        boolean hasFloatValue();

        boolean hasIntValue();

        boolean hasMinVersion();

        boolean hasStringValue();
    }

    private FlagValue() {
    }

    public static final class ConstrainedValue extends com.google.protobuf.GeneratedMessageLite<org.chromium.net.httpflags.FlagValue.ConstrainedValue, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder> implements org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder {
        public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int BYTES_VALUE_FIELD_NUMBER = 7;
        private static volatile com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue.ConstrainedValue> Camera2StreamConfigurationMap = null;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        public static final int STRING_VALUE_FIELD_NUMBER = 6;
        private static final org.chromium.net.httpflags.FlagValue.ConstrainedValue getHighSpeedVideoSizes;
        private int getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private java.lang.Object getHighSpeedVideoSizesFor;
        private int getInputSizeshNQ4ISI = 0;
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI = "";
        private java.lang.String getOutputMinFrameDuration = "";

        private ConstrainedValue() {
        }

        public enum ValueCase {
            BOOL_VALUE(3),
            INT_VALUE(4),
            FLOAT_VALUE(5),
            STRING_VALUE(6),
            BYTES_VALUE(7),
            VALUE_NOT_SET(0);

            private final int getHighSpeedVideoFpsRanges;

            ValueCase(int i) {
                this.getHighSpeedVideoFpsRanges = i;
            }

            @java.lang.Deprecated
            public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase valueOf(int i) {
                return forNumber(i);
            }

            public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return BOOL_VALUE;
                }
                if (i == 4) {
                    return INT_VALUE;
                }
                if (i == 5) {
                    return FLOAT_VALUE;
                }
                if (i == 6) {
                    return STRING_VALUE;
                }
                if (i != 7) {
                    return null;
                }
                return BYTES_VALUE;
            }

            public final int getNumber() {
                return this.getHighSpeedVideoFpsRanges;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase() {
            return org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.forNumber(this.getInputSizeshNQ4ISI);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasAppId() {
            return (this.getHighSpeedVideoFpsRanges & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final java.lang.String getAppId() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final com.google.protobuf.ByteString getAppIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasMinVersion() {
            return (this.getHighSpeedVideoFpsRanges & 2) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final java.lang.String getMinVersion() {
            return this.getOutputMinFrameDuration;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final com.google.protobuf.ByteString getMinVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.getOutputMinFrameDuration);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasApplyEvenIfCronetTelemetryDisabled() {
            return (this.getHighSpeedVideoFpsRanges & 4) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean getApplyEvenIfCronetTelemetryDisabled() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasBoolValue() {
            return this.getInputSizeshNQ4ISI == 3;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean getBoolValue() {
            if (this.getInputSizeshNQ4ISI == 3) {
                return ((java.lang.Boolean) this.getHighSpeedVideoSizesFor).booleanValue();
            }
            return false;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasIntValue() {
            return this.getInputSizeshNQ4ISI == 4;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final long getIntValue() {
            if (this.getInputSizeshNQ4ISI == 4) {
                return ((java.lang.Long) this.getHighSpeedVideoSizesFor).longValue();
            }
            return 0L;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasFloatValue() {
            return this.getInputSizeshNQ4ISI == 5;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final float getFloatValue() {
            if (this.getInputSizeshNQ4ISI == 5) {
                return ((java.lang.Float) this.getHighSpeedVideoSizesFor).floatValue();
            }
            return 0.0f;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasStringValue() {
            return this.getInputSizeshNQ4ISI == 6;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final java.lang.String getStringValue() {
            if (this.getInputSizeshNQ4ISI == 6) {
                return (java.lang.String) this.getHighSpeedVideoSizesFor;
            }
            return "";
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final com.google.protobuf.ByteString getStringValueBytes() {
            java.lang.String str;
            if (this.getInputSizeshNQ4ISI != 6) {
                str = "";
            } else {
                str = (java.lang.String) this.getHighSpeedVideoSizesFor;
            }
            return com.google.protobuf.ByteString.copyFromUtf8(str);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final boolean hasBytesValue() {
            return this.getInputSizeshNQ4ISI == 7;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public final com.google.protobuf.ByteString getBytesValue() {
            if (this.getInputSizeshNQ4ISI == 7) {
                return (com.google.protobuf.ByteString) this.getHighSpeedVideoSizesFor;
            }
            return com.google.protobuf.ByteString.EMPTY;
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, byteBuffer);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, byteBuffer, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, byteString);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, byteString, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, bArr);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, bArr, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, inputStream);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, inputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) parseDelimitedFrom(getHighSpeedVideoSizes, inputStream);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) parseDelimitedFrom(getHighSpeedVideoSizes, inputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, codedInputStream);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoSizes, codedInputStream, extensionRegistryLite);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder newBuilder() {
            return getHighSpeedVideoSizes.createBuilder();
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder newBuilder(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            return getHighSpeedVideoSizes.createBuilder(constrainedValue);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.net.httpflags.FlagValue.ConstrainedValue, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder> implements org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder {
            private Builder() {
                super(org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoSizes);
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getValueCase();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getOutputFormats((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasAppId() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final java.lang.String getAppId() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final com.google.protobuf.ByteString getAppIdBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getAppIdBytes();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setAppId(java.lang.String str) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, str);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearAppId() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setAppIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, byteString);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasMinVersion() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final java.lang.String getMinVersion() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final com.google.protobuf.ByteString getMinVersionBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getMinVersionBytes();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setMinVersion(java.lang.String str) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, str);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearMinVersion() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getOutputMinFrameDuration((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setMinVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, byteString);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasApplyEvenIfCronetTelemetryDisabled() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean getApplyEvenIfCronetTelemetryDisabled() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getApplyEvenIfCronetTelemetryDisabled();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setApplyEvenIfCronetTelemetryDisabled(boolean z) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, z);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearApplyEvenIfCronetTelemetryDisabled() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoSizes((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasBoolValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean getBoolValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getBoolValue();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setBoolValue(boolean z) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, z);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearBoolValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasIntValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final long getIntValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getIntValue();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setIntValue(long j) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, j);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearIntValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoSizesFor((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasFloatValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final float getFloatValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getFloatValue();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setFloatValue(float f) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, f);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearFloatValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRanges((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasStringValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final java.lang.String getStringValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final com.google.protobuf.ByteString getStringValueBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getStringValueBytes();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setStringValue(java.lang.String str) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, str);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearStringValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getInputFormats((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setStringValueBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighSpeedVideoFpsRanges((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, byteString);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final boolean hasBytesValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public final com.google.protobuf.ByteString getBytesValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getBytesValue();
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setBytesValue(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance, byteString);
                return this;
            }

            public final org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearBytesValue() {
                copyOnWrite();
                org.chromium.net.httpflags.FlagValue.ConstrainedValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance);
                return this;
            }

            /* synthetic */ Builder(byte b) {
                this();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (org.chromium.net.httpflags.FlagValue.AnonymousClass1.getHighSpeedVideoFpsRanges[methodToInvoke.ordinal()]) {
                case 1:
                    return new org.chromium.net.httpflags.FlagValue.ConstrainedValue();
                case 2:
                    return new org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder((byte) 0);
                case 3:
                    return newMessageInfo(getHighSpeedVideoSizes, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new java.lang.Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
                case 4:
                    return getHighSpeedVideoSizes;
                case 5:
                    com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue.ConstrainedValue> parser2 = Camera2StreamConfigurationMap;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (org.chromium.net.httpflags.FlagValue.ConstrainedValue.class) {
                        parser = Camera2StreamConfigurationMap;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(getHighSpeedVideoSizes);
                            Camera2StreamConfigurationMap = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue = new org.chromium.net.httpflags.FlagValue.ConstrainedValue();
            getHighSpeedVideoSizes = constrainedValue;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(org.chromium.net.httpflags.FlagValue.ConstrainedValue.class, constrainedValue);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue getDefaultInstance() {
            return getHighSpeedVideoSizes;
        }

        public static com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue.ConstrainedValue> parser() {
            return getHighSpeedVideoSizes.getParserForType();
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            constrainedValue.getHighSpeedVideoFpsRanges &= -2;
            constrainedValue.getHighResolutionOutputSizeshNQ4ISI = getDefaultInstance().getAppId();
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoSizes(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            constrainedValue.getHighSpeedVideoFpsRanges &= -5;
            constrainedValue.getHighSpeedVideoFpsRangesFor = false;
        }

        static /* bridge */ /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            if (constrainedValue.getInputSizeshNQ4ISI == 3) {
                constrainedValue.getInputSizeshNQ4ISI = 0;
                constrainedValue.getHighSpeedVideoSizesFor = null;
            }
        }

        static /* bridge */ /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            if (constrainedValue.getInputSizeshNQ4ISI == 7) {
                constrainedValue.getInputSizeshNQ4ISI = 0;
                constrainedValue.getHighSpeedVideoSizesFor = null;
            }
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoFpsRanges(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            if (constrainedValue.getInputSizeshNQ4ISI == 5) {
                constrainedValue.getInputSizeshNQ4ISI = 0;
                constrainedValue.getHighSpeedVideoSizesFor = null;
            }
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoSizesFor(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            if (constrainedValue.getInputSizeshNQ4ISI == 4) {
                constrainedValue.getInputSizeshNQ4ISI = 0;
                constrainedValue.getHighSpeedVideoSizesFor = null;
            }
        }

        static /* synthetic */ void getOutputMinFrameDuration(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            constrainedValue.getHighSpeedVideoFpsRanges &= -3;
            constrainedValue.getOutputMinFrameDuration = getDefaultInstance().getMinVersion();
        }

        static /* bridge */ /* synthetic */ void getInputFormats(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            if (constrainedValue.getInputSizeshNQ4ISI == 6) {
                constrainedValue.getInputSizeshNQ4ISI = 0;
                constrainedValue.getHighSpeedVideoSizesFor = null;
            }
        }

        static /* bridge */ /* synthetic */ void getOutputFormats(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            constrainedValue.getInputSizeshNQ4ISI = 0;
            constrainedValue.getHighSpeedVideoSizesFor = null;
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, java.lang.String str) {
            constrainedValue.getHighSpeedVideoFpsRanges |= 1;
            constrainedValue.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, com.google.protobuf.ByteString byteString) {
            constrainedValue.getHighResolutionOutputSizeshNQ4ISI = byteString.toStringUtf8();
            constrainedValue.getHighSpeedVideoFpsRanges |= 1;
        }

        static /* bridge */ /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, boolean z) {
            constrainedValue.getHighSpeedVideoFpsRanges |= 4;
            constrainedValue.getHighSpeedVideoFpsRangesFor = z;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, boolean z) {
            constrainedValue.getInputSizeshNQ4ISI = 3;
            constrainedValue.getHighSpeedVideoSizesFor = java.lang.Boolean.valueOf(z);
        }

        static /* bridge */ /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, com.google.protobuf.ByteString byteString) {
            constrainedValue.getInputSizeshNQ4ISI = 7;
            constrainedValue.getHighSpeedVideoSizesFor = byteString;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, float f) {
            constrainedValue.getInputSizeshNQ4ISI = 5;
            constrainedValue.getHighSpeedVideoSizesFor = java.lang.Float.valueOf(f);
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, long j) {
            constrainedValue.getInputSizeshNQ4ISI = 4;
            constrainedValue.getHighSpeedVideoSizesFor = java.lang.Long.valueOf(j);
        }

        static /* bridge */ /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, java.lang.String str) {
            constrainedValue.getHighSpeedVideoFpsRanges |= 2;
            constrainedValue.getOutputMinFrameDuration = str;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, com.google.protobuf.ByteString byteString) {
            constrainedValue.getOutputMinFrameDuration = byteString.toStringUtf8();
            constrainedValue.getHighSpeedVideoFpsRanges |= 2;
        }

        static /* bridge */ /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, java.lang.String str) {
            constrainedValue.getInputSizeshNQ4ISI = 6;
            constrainedValue.getHighSpeedVideoSizesFor = str;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue, com.google.protobuf.ByteString byteString) {
            constrainedValue.getHighSpeedVideoSizesFor = byteString.toStringUtf8();
            constrainedValue.getInputSizeshNQ4ISI = 6;
        }
    }

    /* renamed from: org.chromium.net.httpflags.FlagValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public final java.util.List<org.chromium.net.httpflags.FlagValue.ConstrainedValue> getConstrainedValuesList() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<? extends org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder> getConstrainedValuesOrBuilderList() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public final int getConstrainedValuesCount() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public final org.chromium.net.httpflags.FlagValue.ConstrainedValue getConstrainedValues(int i) {
        return this.Camera2StreamConfigurationMap.get(i);
    }

    public final org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder getConstrainedValuesOrBuilder(int i) {
        return this.Camera2StreamConfigurationMap.get(i);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, byteBuffer);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, byteBuffer, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, byteString);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, byteString, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, bArr);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, bArr, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, inputStream);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) parseDelimitedFrom(getHighSpeedVideoFpsRanges, inputStream);
    }

    public static org.chromium.net.httpflags.FlagValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) parseDelimitedFrom(getHighSpeedVideoFpsRanges, inputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, codedInputStream);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.GeneratedMessageLite.parseFrom(getHighSpeedVideoFpsRanges, codedInputStream, extensionRegistryLite);
    }

    public static org.chromium.net.httpflags.FlagValue.Builder newBuilder() {
        return getHighSpeedVideoFpsRanges.createBuilder();
    }

    public static org.chromium.net.httpflags.FlagValue.Builder newBuilder(org.chromium.net.httpflags.FlagValue flagValue) {
        return getHighSpeedVideoFpsRanges.createBuilder(flagValue);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.net.httpflags.FlagValue, org.chromium.net.httpflags.FlagValue.Builder> implements org.chromium.net.httpflags.FlagValueOrBuilder {
        private Builder() {
            super(org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRanges);
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public final java.util.List<org.chromium.net.httpflags.FlagValue.ConstrainedValue> getConstrainedValuesList() {
            return java.util.Collections.unmodifiableList(((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValuesList());
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public final int getConstrainedValuesCount() {
            return ((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValuesCount();
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public final org.chromium.net.httpflags.FlagValue.ConstrainedValue getConstrainedValues(int i) {
            return ((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValues(i);
        }

        public final org.chromium.net.httpflags.FlagValue.Builder setConstrainedValues(int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue) this.instance, i, constrainedValue);
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder setConstrainedValues(int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighResolutionOutputSizeshNQ4ISI((org.chromium.net.httpflags.FlagValue) this.instance, i, builder.build());
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue) this.instance, constrainedValue);
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRanges((org.chromium.net.httpflags.FlagValue) this.instance, i, constrainedValue);
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue) this.instance, builder.build());
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRanges((org.chromium.net.httpflags.FlagValue) this.instance, i, builder.build());
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder addAllConstrainedValues(java.lang.Iterable<? extends org.chromium.net.httpflags.FlagValue.ConstrainedValue> iterable) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.Camera2StreamConfigurationMap((org.chromium.net.httpflags.FlagValue) this.instance, iterable);
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder clearConstrainedValues() {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue) this.instance);
            return this;
        }

        public final org.chromium.net.httpflags.FlagValue.Builder removeConstrainedValues(int i) {
            copyOnWrite();
            org.chromium.net.httpflags.FlagValue.getHighSpeedVideoFpsRangesFor((org.chromium.net.httpflags.FlagValue) this.instance, i);
            return this;
        }

        /* synthetic */ Builder(byte b) {
            this();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (org.chromium.net.httpflags.FlagValue.AnonymousClass1.getHighSpeedVideoFpsRanges[methodToInvoke.ordinal()]) {
            case 1:
                return new org.chromium.net.httpflags.FlagValue();
            case 2:
                return new org.chromium.net.httpflags.FlagValue.Builder((byte) 0);
            case 3:
                return newMessageInfo(getHighSpeedVideoFpsRanges, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new java.lang.Object[]{"constrainedValues_", org.chromium.net.httpflags.FlagValue.ConstrainedValue.class});
            case 4:
                return getHighSpeedVideoFpsRanges;
            case 5:
                com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue> parser2 = getHighSpeedVideoFpsRangesFor;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (org.chromium.net.httpflags.FlagValue.class) {
                    parser = getHighSpeedVideoFpsRangesFor;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(getHighSpeedVideoFpsRanges);
                        getHighSpeedVideoFpsRangesFor = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        org.chromium.net.httpflags.FlagValue flagValue = new org.chromium.net.httpflags.FlagValue();
        getHighSpeedVideoFpsRanges = flagValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(org.chromium.net.httpflags.FlagValue.class, flagValue);
    }

    public static org.chromium.net.httpflags.FlagValue getDefaultInstance() {
        return getHighSpeedVideoFpsRanges;
    }

    public static com.google.protobuf.Parser<org.chromium.net.httpflags.FlagValue> parser() {
        return getHighSpeedVideoFpsRanges.getParserForType();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.httpflags.FlagValue flagValue, java.lang.Iterable iterable) {
        com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> protobufList = flagValue.Camera2StreamConfigurationMap;
        if (!protobufList.isModifiable()) {
            flagValue.Camera2StreamConfigurationMap = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        com.google.protobuf.AbstractMessageLite.addAll(iterable, (java.util.List) flagValue.Camera2StreamConfigurationMap);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(org.chromium.net.httpflags.FlagValue flagValue, int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> protobufList = flagValue.Camera2StreamConfigurationMap;
        if (!protobufList.isModifiable()) {
            flagValue.Camera2StreamConfigurationMap = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        flagValue.Camera2StreamConfigurationMap.add(i, constrainedValue);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue flagValue, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> protobufList = flagValue.Camera2StreamConfigurationMap;
        if (!protobufList.isModifiable()) {
            flagValue.Camera2StreamConfigurationMap = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        flagValue.Camera2StreamConfigurationMap.add(constrainedValue);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue flagValue) {
        flagValue.Camera2StreamConfigurationMap = emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.chromium.net.httpflags.FlagValue flagValue, int i) {
        com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> protobufList = flagValue.Camera2StreamConfigurationMap;
        if (!protobufList.isModifiable()) {
            flagValue.Camera2StreamConfigurationMap = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        flagValue.Camera2StreamConfigurationMap.remove(i);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.chromium.net.httpflags.FlagValue flagValue, int i, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        com.google.protobuf.Internal.ProtobufList<org.chromium.net.httpflags.FlagValue.ConstrainedValue> protobufList = flagValue.Camera2StreamConfigurationMap;
        if (!protobufList.isModifiable()) {
            flagValue.Camera2StreamConfigurationMap = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        flagValue.Camera2StreamConfigurationMap.set(i, constrainedValue);
    }
}
