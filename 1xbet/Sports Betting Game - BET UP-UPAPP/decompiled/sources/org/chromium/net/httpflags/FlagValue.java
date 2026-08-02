package org.chromium.net.httpflags;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FlagValue extends GeneratedMessageLite<FlagValue, Builder> implements FlagValueOrBuilder {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final FlagValue DEFAULT_INSTANCE;
    private static volatile Parser<FlagValue> PARSER;
    private Internal.ProtobufList<ConstrainedValue> constrainedValues_ = emptyProtobufList();

    public interface ConstrainedValueOrBuilder extends MessageLiteOrBuilder {
        String getAppId();

        ByteString getAppIdBytes();

        boolean getApplyEvenIfCronetTelemetryDisabled();

        boolean getBoolValue();

        ByteString getBytesValue();

        float getFloatValue();

        long getIntValue();

        String getMinVersion();

        ByteString getMinVersionBytes();

        String getStringValue();

        ByteString getStringValueBytes();

        ConstrainedValue.ValueCase getValueCase();

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

    public static final class ConstrainedValue extends GeneratedMessageLite<ConstrainedValue, Builder> implements ConstrainedValueOrBuilder {
        public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int BYTES_VALUE_FIELD_NUMBER = 7;
        private static final ConstrainedValue DEFAULT_INSTANCE;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        private static volatile Parser<ConstrainedValue> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 6;
        private boolean applyEvenIfCronetTelemetryDisabled_;
        private int bitField0_;
        private Object value_;
        private int valueCase_ = 0;
        private String appId_ = "";
        private String minVersion_ = "";

        private ConstrainedValue() {
        }

        public enum ValueCase {
            BOOL_VALUE(3),
            INT_VALUE(4),
            FLOAT_VALUE(5),
            STRING_VALUE(6),
            BYTES_VALUE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int value) {
                this.value = value;
            }

            @Deprecated
            public static ValueCase valueOf(int value) {
                return forNumber(value);
            }

            public static ValueCase forNumber(int value) {
                if (value == 0) {
                    return VALUE_NOT_SET;
                }
                if (value == 3) {
                    return BOOL_VALUE;
                }
                if (value == 4) {
                    return INT_VALUE;
                }
                if (value == 5) {
                    return FLOAT_VALUE;
                }
                if (value == 6) {
                    return STRING_VALUE;
                }
                if (value != 7) {
                    return null;
                }
                return BYTES_VALUE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ByteString getAppIdBytes() {
            return ByteString.copyFromUtf8(this.appId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.appId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.bitField0_ &= -2;
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(ByteString value) {
            this.appId_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasMinVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getMinVersion() {
            return this.minVersion_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ByteString getMinVersionBytes() {
            return ByteString.copyFromUtf8(this.minVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersion(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.minVersion_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinVersion() {
            this.bitField0_ &= -3;
            this.minVersion_ = getDefaultInstance().getMinVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersionBytes(ByteString value) {
            this.minVersion_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasApplyEvenIfCronetTelemetryDisabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getApplyEvenIfCronetTelemetryDisabled() {
            return this.applyEvenIfCronetTelemetryDisabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyEvenIfCronetTelemetryDisabled(boolean value) {
            this.bitField0_ |= 4;
            this.applyEvenIfCronetTelemetryDisabled_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyEvenIfCronetTelemetryDisabled() {
            this.bitField0_ &= -5;
            this.applyEvenIfCronetTelemetryDisabled_ = false;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBoolValue() {
            return this.valueCase_ == 3;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getBoolValue() {
            if (this.valueCase_ == 3) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(boolean value) {
            this.valueCase_ = 3;
            this.value_ = Boolean.valueOf(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public long getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(long value) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasFloatValue() {
            return this.valueCase_ == 5;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public float getFloatValue() {
            if (this.valueCase_ == 5) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(float value) {
            this.valueCase_ = 5;
            this.value_ = Float.valueOf(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValue() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 6;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getStringValue() {
            if (this.valueCase_ != 6) {
                return "";
            }
            return (String) this.value_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ByteString getStringValueBytes() {
            String str;
            if (this.valueCase_ != 6) {
                str = "";
            } else {
                str = (String) this.value_;
            }
            return ByteString.copyFromUtf8(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String value) {
            value.getClass();
            this.valueCase_ = 6;
            this.value_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(ByteString value) {
            this.value_ = value.toStringUtf8();
            this.valueCase_ = 6;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBytesValue() {
            return this.valueCase_ == 7;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ByteString getBytesValue() {
            if (this.valueCase_ == 7) {
                return (ByteString) this.value_;
            }
            return ByteString.EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesValue(ByteString value) {
            value.getClass();
            this.valueCase_ = 7;
            this.value_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesValue() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public static ConstrainedValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConstrainedValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConstrainedValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConstrainedValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConstrainedValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConstrainedValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConstrainedValue parseFrom(InputStream input) throws IOException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ConstrainedValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream input) throws IOException {
            return (ConstrainedValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConstrainedValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ConstrainedValue parseFrom(CodedInputStream input) throws IOException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ConstrainedValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConstrainedValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ConstrainedValue prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ConstrainedValue, Builder> implements ConstrainedValueOrBuilder {
            private Builder() {
                super(ConstrainedValue.DEFAULT_INSTANCE);
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ValueCase getValueCase() {
                return ((ConstrainedValue) this.instance).getValueCase();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasAppId() {
                return ((ConstrainedValue) this.instance).hasAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getAppId() {
                return ((ConstrainedValue) this.instance).getAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ByteString getAppIdBytes() {
                return ((ConstrainedValue) this.instance).getAppIdBytes();
            }

            public Builder setAppId(String value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setAppId(value);
                return this;
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearAppId();
                return this;
            }

            public Builder setAppIdBytes(ByteString value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setAppIdBytes(value);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasMinVersion() {
                return ((ConstrainedValue) this.instance).hasMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getMinVersion() {
                return ((ConstrainedValue) this.instance).getMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ByteString getMinVersionBytes() {
                return ((ConstrainedValue) this.instance).getMinVersionBytes();
            }

            public Builder setMinVersion(String value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setMinVersion(value);
                return this;
            }

            public Builder clearMinVersion() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearMinVersion();
                return this;
            }

            public Builder setMinVersionBytes(ByteString value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setMinVersionBytes(value);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) this.instance).hasApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) this.instance).getApplyEvenIfCronetTelemetryDisabled();
            }

            public Builder setApplyEvenIfCronetTelemetryDisabled(boolean value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setApplyEvenIfCronetTelemetryDisabled(value);
                return this;
            }

            public Builder clearApplyEvenIfCronetTelemetryDisabled() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearApplyEvenIfCronetTelemetryDisabled();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBoolValue() {
                return ((ConstrainedValue) this.instance).hasBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getBoolValue() {
                return ((ConstrainedValue) this.instance).getBoolValue();
            }

            public Builder setBoolValue(boolean value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setBoolValue(value);
                return this;
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearBoolValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasIntValue() {
                return ((ConstrainedValue) this.instance).hasIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public long getIntValue() {
                return ((ConstrainedValue) this.instance).getIntValue();
            }

            public Builder setIntValue(long value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setIntValue(value);
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearIntValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasFloatValue() {
                return ((ConstrainedValue) this.instance).hasFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public float getFloatValue() {
                return ((ConstrainedValue) this.instance).getFloatValue();
            }

            public Builder setFloatValue(float value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setFloatValue(value);
                return this;
            }

            public Builder clearFloatValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearFloatValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasStringValue() {
                return ((ConstrainedValue) this.instance).hasStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getStringValue() {
                return ((ConstrainedValue) this.instance).getStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ByteString getStringValueBytes() {
                return ((ConstrainedValue) this.instance).getStringValueBytes();
            }

            public Builder setStringValue(String value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setStringValue(value);
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearStringValue();
                return this;
            }

            public Builder setStringValueBytes(ByteString value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setStringValueBytes(value);
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBytesValue() {
                return ((ConstrainedValue) this.instance).hasBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ByteString getBytesValue() {
                return ((ConstrainedValue) this.instance).getBytesValue();
            }

            public Builder setBytesValue(ByteString value) {
                copyOnWrite();
                ((ConstrainedValue) this.instance).setBytesValue(value);
                return this;
            }

            public Builder clearBytesValue() {
                copyOnWrite();
                ((ConstrainedValue) this.instance).clearBytesValue();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new ConstrainedValue();
                case 2:
                    return new Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ConstrainedValue> parser = PARSER;
                    if (parser == null) {
                        synchronized (ConstrainedValue.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ConstrainedValue constrainedValue = new ConstrainedValue();
            DEFAULT_INSTANCE = constrainedValue;
            GeneratedMessageLite.registerDefaultInstance(ConstrainedValue.class, constrainedValue);
        }

        public static ConstrainedValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ConstrainedValue> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: org.chromium.net.httpflags.FlagValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public List<ConstrainedValue> getConstrainedValuesList() {
        return this.constrainedValues_;
    }

    public List<? extends ConstrainedValueOrBuilder> getConstrainedValuesOrBuilderList() {
        return this.constrainedValues_;
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public int getConstrainedValuesCount() {
        return this.constrainedValues_.size();
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public ConstrainedValue getConstrainedValues(int index) {
        return this.constrainedValues_.get(index);
    }

    public ConstrainedValueOrBuilder getConstrainedValuesOrBuilder(int index) {
        return this.constrainedValues_.get(index);
    }

    private void ensureConstrainedValuesIsMutable() {
        Internal.ProtobufList<ConstrainedValue> protobufList = this.constrainedValues_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.constrainedValues_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConstrainedValues(int index, ConstrainedValue value) {
        value.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(ConstrainedValue value) {
        value.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(int index, ConstrainedValue value) {
        value.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConstrainedValues(Iterable<? extends ConstrainedValue> values) {
        ensureConstrainedValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.constrainedValues_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstrainedValues() {
        this.constrainedValues_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConstrainedValues(int index) {
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.remove(index);
    }

    public static FlagValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FlagValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FlagValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FlagValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FlagValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static FlagValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static FlagValue parseFrom(InputStream input) throws IOException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FlagValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FlagValue parseDelimitedFrom(InputStream input) throws IOException {
        return (FlagValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static FlagValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FlagValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static FlagValue parseFrom(CodedInputStream input) throws IOException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static FlagValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (FlagValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(FlagValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<FlagValue, Builder> implements FlagValueOrBuilder {
        private Builder() {
            super(FlagValue.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public List<ConstrainedValue> getConstrainedValuesList() {
            return Collections.unmodifiableList(((FlagValue) this.instance).getConstrainedValuesList());
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public int getConstrainedValuesCount() {
            return ((FlagValue) this.instance).getConstrainedValuesCount();
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public ConstrainedValue getConstrainedValues(int index) {
            return ((FlagValue) this.instance).getConstrainedValues(index);
        }

        public Builder setConstrainedValues(int index, ConstrainedValue value) {
            copyOnWrite();
            ((FlagValue) this.instance).setConstrainedValues(index, value);
            return this;
        }

        public Builder setConstrainedValues(int index, ConstrainedValue.Builder builderForValue) {
            copyOnWrite();
            ((FlagValue) this.instance).setConstrainedValues(index, builderForValue.build());
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue value) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(value);
            return this;
        }

        public Builder addConstrainedValues(int index, ConstrainedValue value) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(index, value);
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue.Builder builderForValue) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(builderForValue.build());
            return this;
        }

        public Builder addConstrainedValues(int index, ConstrainedValue.Builder builderForValue) {
            copyOnWrite();
            ((FlagValue) this.instance).addConstrainedValues(index, builderForValue.build());
            return this;
        }

        public Builder addAllConstrainedValues(Iterable<? extends ConstrainedValue> values) {
            copyOnWrite();
            ((FlagValue) this.instance).addAllConstrainedValues(values);
            return this;
        }

        public Builder clearConstrainedValues() {
            copyOnWrite();
            ((FlagValue) this.instance).clearConstrainedValues();
            return this;
        }

        public Builder removeConstrainedValues(int index) {
            copyOnWrite();
            ((FlagValue) this.instance).removeConstrainedValues(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new FlagValue();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", ConstrainedValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FlagValue> parser = PARSER;
                if (parser == null) {
                    synchronized (FlagValue.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        FlagValue flagValue = new FlagValue();
        DEFAULT_INSTANCE = flagValue;
        GeneratedMessageLite.registerDefaultInstance(FlagValue.class, flagValue);
    }

    public static FlagValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<FlagValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
