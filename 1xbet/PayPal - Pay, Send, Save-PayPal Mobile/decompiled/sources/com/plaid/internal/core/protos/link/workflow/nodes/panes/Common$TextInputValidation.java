package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$TextInputValidation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> rules_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class Rule extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.b {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule DEFAULT_INSTANCE;
        public static final int DISPLAY_ERROR_FIELD_NUMBER = 1;
        public static final int EQUALITY_FIELD_NUMBER = 5;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> PARSER = null;
        public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 7;
        public static final int REGEX_FIELD_NUMBER = 4;
        public static final int ROUTING_FIELD_NUMBER = 6;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString displayError_;
        private int validationCase_ = 0;
        private java.lang.Object validation_;

        public static final class Equality extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality DEFAULT_INSTANCE;
            public static final int OTHER_TEXT_INPUT_ID_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality> PARSER;
            private java.lang.String otherTextInputId_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality equality = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality();
                DEFAULT_INSTANCE = equality;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.class, equality);
            }

            private Equality() {
            }

            private void clearOtherTextInputId() {
                this.otherTextInputId_ = getDefaultInstance().getOtherTextInputId();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setOtherTextInputIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.otherTextInputId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"otherTextInputId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public final java.lang.String getOtherTextInputId() {
                return this.otherTextInputId_;
            }

            public final com.google.protobuf.ByteString getOtherTextInputIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.otherTextInputId_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality equality) {
                return DEFAULT_INSTANCE.createBuilder(equality);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setOtherTextInputId(java.lang.String str) {
                this.otherTextInputId_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Length extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length> PARSER;
            private int maximum_;
            private int minimum_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length length = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length();
                DEFAULT_INSTANCE = length;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.class, length);
            }

            private Length() {
            }

            private void clearMaximum() {
                this.maximum_ = 0;
            }

            private void clearMinimum() {
                this.minimum_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMaximum(int i) {
                this.maximum_ = i;
            }

            private void setMinimum(int i) {
                this.minimum_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public final int getMaximum() {
                return this.maximum_;
            }

            public final int getMinimum() {
                return this.minimum_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length length) {
                return DEFAULT_INSTANCE.createBuilder(length);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PhoneNumber extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber> PARSER = null;
            public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 1;
            private java.lang.String phoneNumberCountryCode_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber phoneNumber = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber();
                DEFAULT_INSTANCE = phoneNumber;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.class, phoneNumber);
            }

            private PhoneNumber() {
            }

            private void clearPhoneNumberCountryCode() {
                this.phoneNumberCountryCode_ = getDefaultInstance().getPhoneNumberCountryCode();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPhoneNumberCountryCodeBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.phoneNumberCountryCode_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"phoneNumberCountryCode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public final java.lang.String getPhoneNumberCountryCode() {
                return this.phoneNumberCountryCode_;
            }

            public final com.google.protobuf.ByteString getPhoneNumberCountryCodeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.phoneNumberCountryCode_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber phoneNumber) {
                return DEFAULT_INSTANCE.createBuilder(phoneNumber);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setPhoneNumberCountryCode(java.lang.String str) {
                this.phoneNumberCountryCode_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Regex extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex> PARSER = null;
            public static final int REGEX_FIELD_NUMBER = 1;
            private java.lang.String regex_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex regex = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex();
                DEFAULT_INSTANCE = regex;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.class, regex);
            }

            private Regex() {
            }

            private void clearRegex() {
                this.regex_ = getDefaultInstance().getRegex();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRegexBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.regex_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"regex_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public final java.lang.String getRegex() {
                return this.regex_;
            }

            public final com.google.protobuf.ByteString getRegexBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.regex_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex regex) {
                return DEFAULT_INSTANCE.createBuilder(regex);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setRegex(java.lang.String str) {
                this.regex_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class RoutingNumber extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber routingNumber = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber();
                DEFAULT_INSTANCE = routingNumber;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.class, routingNumber);
            }

            private RoutingNumber() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber routingNumber) {
                return DEFAULT_INSTANCE.createBuilder(routingNumber);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Value extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value> PARSER;
            private int bitField0_;
            private com.google.protobuf.Int64Value maximum_;
            private com.google.protobuf.Int64Value minimum_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value value = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value();
                DEFAULT_INSTANCE = value;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.class, value);
            }

            private Value() {
            }

            private void clearMaximum() {
                this.maximum_ = null;
                this.bitField0_ &= -3;
            }

            private void clearMinimum() {
                this.minimum_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
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

            public final com.google.protobuf.Int64Value getMaximum() {
                com.google.protobuf.Int64Value int64Value = this.maximum_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.Int64Value getMinimum() {
                com.google.protobuf.Int64Value int64Value = this.minimum_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final boolean hasMaximum() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasMinimum() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeMaximum(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.maximum_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.maximum_ = int64Value;
                } else {
                    this.maximum_ = com.google.protobuf.Int64Value.newBuilder(this.maximum_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeMinimum(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.minimum_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.minimum_ = int64Value;
                } else {
                    this.minimum_ = com.google.protobuf.Int64Value.newBuilder(this.minimum_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value value) {
                return DEFAULT_INSTANCE.createBuilder(value);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setMaximum(com.google.protobuf.Int64Value int64Value) {
                this.maximum_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setMinimum(com.google.protobuf.Int64Value int64Value) {
                this.minimum_ = int64Value;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            LENGTH(2),
            VALUE(3),
            REGEX(4),
            EQUALITY(5),
            ROUTING(6),
            PHONE_NUMBER_COUNTRY_CODE(7),
            VALIDATION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6176a;

            b(int i) {
                this.f6176a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.b forNumber(int i) {
                if (i == 0) {
                    return VALIDATION_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return LENGTH;
                    case 3:
                        return VALUE;
                    case 4:
                        return REGEX;
                    case 5:
                        return EQUALITY;
                    case 6:
                        return ROUTING;
                    case 7:
                        return PHONE_NUMBER_COUNTRY_CODE;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.f6176a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule rule = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule();
            DEFAULT_INSTANCE = rule;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule.class, rule);
        }

        private Rule() {
        }

        private void clearDisplayError() {
            this.displayError_ = null;
            this.bitField0_ &= -2;
        }

        private void clearEquality() {
            if (this.validationCase_ == 5) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearLength() {
            if (this.validationCase_ == 2) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearPhoneNumberCountryCode() {
            if (this.validationCase_ == 7) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearRegex() {
            if (this.validationCase_ == 4) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearRouting() {
            if (this.validationCase_ == 6) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearValidation() {
            this.validationCase_ = 0;
            this.validation_ = null;
        }

        private void clearValue() {
            if (this.validationCase_ == 3) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new java.lang.Object[]{"validation_", "validationCase_", "bitField0_", "displayError_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDisplayError() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.displayError_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality getEquality() {
            return this.validationCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length getLength() {
            return this.validationCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber getPhoneNumberCountryCode() {
            return this.validationCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex getRegex() {
            return this.validationCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber getRouting() {
            return this.validationCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.b getValidationCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.b.forNumber(this.validationCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value getValue() {
            return this.validationCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) this.validation_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.getDefaultInstance();
        }

        public final boolean hasDisplayError() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasEquality() {
            return this.validationCase_ == 5;
        }

        public final boolean hasLength() {
            return this.validationCase_ == 2;
        }

        public final boolean hasPhoneNumberCountryCode() {
            return this.validationCase_ == 7;
        }

        public final boolean hasRegex() {
            return this.validationCase_ == 4;
        }

        public final boolean hasRouting() {
            return this.validationCase_ == 6;
        }

        public final boolean hasValue() {
            return this.validationCase_ == 3;
        }

        private void mergeDisplayError(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.displayError_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.displayError_ = common$LocalizedString;
            } else {
                this.displayError_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.displayError_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeEquality(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality equality) {
            if (this.validationCase_ != 5 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.getDefaultInstance()) {
                this.validation_ = equality;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality.a) equality).buildPartial();
            }
            this.validationCase_ = 5;
        }

        private void mergeLength(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length length) {
            if (this.validationCase_ != 2 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.getDefaultInstance()) {
                this.validation_ = length;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length.a) length).buildPartial();
            }
            this.validationCase_ = 2;
        }

        private void mergePhoneNumberCountryCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber phoneNumber) {
            if (this.validationCase_ != 7 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.getDefaultInstance()) {
                this.validation_ = phoneNumber;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber.a) phoneNumber).buildPartial();
            }
            this.validationCase_ = 7;
        }

        private void mergeRegex(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex regex) {
            if (this.validationCase_ != 4 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.getDefaultInstance()) {
                this.validation_ = regex;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex.a) regex).buildPartial();
            }
            this.validationCase_ = 4;
        }

        private void mergeRouting(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber routingNumber) {
            if (this.validationCase_ != 6 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.getDefaultInstance()) {
                this.validation_ = routingNumber;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber.a) routingNumber).buildPartial();
            }
            this.validationCase_ = 6;
        }

        private void mergeValue(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value value) {
            if (this.validationCase_ != 3 || this.validation_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.getDefaultInstance()) {
                this.validation_ = value;
            } else {
                this.validation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value) this.validation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value.a) value).buildPartial();
            }
            this.validationCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule rule) {
            return DEFAULT_INSTANCE.createBuilder(rule);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setDisplayError(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.displayError_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void setEquality(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Equality equality) {
            this.validation_ = equality;
            this.validationCase_ = 5;
        }

        private void setLength(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Length length) {
            this.validation_ = length;
            this.validationCase_ = 2;
        }

        private void setPhoneNumberCountryCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.PhoneNumber phoneNumber) {
            this.validation_ = phoneNumber;
            this.validationCase_ = 7;
        }

        private void setRegex(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Regex regex) {
            this.validation_ = regex;
            this.validationCase_ = 4;
        }

        private void setRouting(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.RoutingNumber routingNumber) {
            this.validation_ = routingNumber;
            this.validationCase_ = 6;
        }

        private void setValue(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextInputValidation.Rule.Value value) {
            this.validation_ = value;
            this.validationCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.DEFAULT_INSTANCE);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation();
        DEFAULT_INSTANCE = common$TextInputValidation;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.class, common$TextInputValidation);
    }

    private Common$TextInputValidation() {
    }

    private void addAllRules(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> iterable) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.rules_);
    }

    private void clearRules() {
        this.rules_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"rules_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule getRules(int i) {
        return this.rules_.get(i);
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule> getRulesList() {
        return this.rules_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.b getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.b> getRulesOrBuilderList() {
        return this.rules_;
    }

    private void addRules(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.add(rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation common$TextInputValidation) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInputValidation);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setRules(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.set(i, rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addRules(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation.Rule rule) {
        ensureRulesIsMutable();
        this.rules_.add(i, rule);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
