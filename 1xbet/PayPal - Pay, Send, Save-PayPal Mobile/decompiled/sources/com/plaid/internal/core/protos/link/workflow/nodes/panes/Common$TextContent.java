package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$TextContent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ALIGN_FIELD_NUMBER = 5;
    public static final int AS_FIELD_NUMBER = 1;
    public static final int CASING_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int CONTRAST_FIELD_NUMBER = 8;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent DEFAULT_INSTANCE;
    public static final int FONT_FIELD_NUMBER = 6;
    public static final int LINE_HEIGHT_FIELD_NUMBER = 9;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private int align_;
    private int as_;
    private int bitField0_;
    private int casing_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString content_;
    private int contrast_;
    private int font_;
    private int lineHeight_;
    private int size_;
    private int weight_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        return DEFAULT_INSTANCE.createBuilder(common$TextContent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public final int getWeightValue() {
        return this.weight_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g getWeight() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.forNumber(this.weight_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.UNRECOGNIZED : forNumber;
    }

    public final int getSize() {
        return this.size_;
    }

    public final int getLineHeight() {
        return this.lineHeight_;
    }

    public final int getFontValue() {
        return this.font_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f getFont() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f.forNumber(this.font_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f.UNRECOGNIZED : forNumber;
    }

    public final int getContrastValue() {
        return this.contrast_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e getContrast() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e.forNumber(this.contrast_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final int getCasingValue() {
        return this.casing_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d getCasing() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d.forNumber(this.casing_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d.UNRECOGNIZED : forNumber;
    }

    public final int getAsValue() {
        return this.as_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b getAs() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.forNumber(this.as_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.UNRECOGNIZED : forNumber;
    }

    public final int getAlignValue() {
        return this.align_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a getAlign() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.forNumber(this.align_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004ဉ\u0000\u0005\f\u0006\f\u0007\f\b\f\t\u000b", new java.lang.Object[]{"bitField0_", "as_", "size_", "weight_", "content_", "align_", "font_", "casing_", "contrast_", "lineHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.class) {
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

    private void setWeightValue(int i) {
        this.weight_ = i;
    }

    private void setWeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g gVar) {
        this.weight_ = gVar.getNumber();
    }

    private void setSize(int i) {
        this.size_ = i;
    }

    private void setLineHeight(int i) {
        this.lineHeight_ = i;
    }

    private void setFontValue(int i) {
        this.font_ = i;
    }

    private void setFont(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f fVar) {
        this.font_ = fVar.getNumber();
    }

    private void setContrastValue(int i) {
        this.contrast_ = i;
    }

    private void setContrast(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e eVar) {
        this.contrast_ = eVar.getNumber();
    }

    private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setCasingValue(int i) {
        this.casing_ = i;
    }

    private void setCasing(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d dVar) {
        this.casing_ = dVar.getNumber();
    }

    private void setAsValue(int i) {
        this.as_ = i;
    }

    private void setAs(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b bVar) {
        this.as_ = bVar.getNumber();
    }

    private void setAlignValue(int i) {
        this.align_ = i;
    }

    private void setAlign(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a aVar) {
        this.align_ = aVar.getNumber();
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearLineHeight() {
        this.lineHeight_ = 0;
    }

    private void clearFont() {
        this.font_ = 0;
    }

    private void clearContrast() {
        this.contrast_ = 0;
    }

    public enum a implements com.google.protobuf.Internal.EnumLite {
        ALIGN_START(0),
        ALIGN_END(1),
        ALIGN_LEFT(2),
        ALIGN_RIGHT(3),
        ALIGN_CENTER(4),
        UNRECOGNIZED(-1);

        public static final int ALIGN_CENTER_VALUE = 4;
        public static final int ALIGN_END_VALUE = 1;
        public static final int ALIGN_LEFT_VALUE = 2;
        public static final int ALIGN_RIGHT_VALUE = 3;
        public static final int ALIGN_START_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.C0184a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.C0184a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6160a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a$a, reason: collision with other inner class name */
        public final class C0184a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6160a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.a.b f6161a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.a.b.f6161a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.a forNumber(int i) {
            if (i == 0) {
                return ALIGN_START;
            }
            if (i == 1) {
                return ALIGN_END;
            }
            if (i == 2) {
                return ALIGN_LEFT;
            }
            if (i == 3) {
                return ALIGN_RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return ALIGN_CENTER;
        }

        a(int i) {
            this.f6160a = i;
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        AS_CODE(0),
        AS_H1(1),
        AS_H2(2),
        AS_H3(3),
        AS_H4(4),
        AS_H5(5),
        AS_H6(6),
        AS_P(7),
        AS_SMALL(8),
        AS_SPAN(9),
        UNRECOGNIZED(-1);

        public static final int AS_CODE_VALUE = 0;
        public static final int AS_H1_VALUE = 1;
        public static final int AS_H2_VALUE = 2;
        public static final int AS_H3_VALUE = 3;
        public static final int AS_H4_VALUE = 4;
        public static final int AS_H5_VALUE = 5;
        public static final int AS_H6_VALUE = 6;
        public static final int AS_P_VALUE = 7;
        public static final int AS_SMALL_VALUE = 8;
        public static final int AS_SPAN_VALUE = 9;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6162a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6162a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b$b, reason: collision with other inner class name */
        public static final class C0185b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.C0185b f6163a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.C0185b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b.C0185b.f6163a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.b forNumber(int i) {
            switch (i) {
                case 0:
                    return AS_CODE;
                case 1:
                    return AS_H1;
                case 2:
                    return AS_H2;
                case 3:
                    return AS_H3;
                case 4:
                    return AS_H4;
                case 5:
                    return AS_H5;
                case 6:
                    return AS_H6;
                case 7:
                    return AS_P;
                case 8:
                    return AS_SMALL;
                case 9:
                    return AS_SPAN;
                default:
                    return null;
            }
        }

        b(int i) {
            this.f6162a = i;
        }
    }

    public enum d implements com.google.protobuf.Internal.EnumLite {
        CASING_NONE(0),
        CASING_CAPITALIZE(1),
        CASING_LOWERCASE(2),
        CASING_UPPERCASE(3),
        UNRECOGNIZED(-1);

        public static final int CASING_CAPITALIZE_VALUE = 1;
        public static final int CASING_LOWERCASE_VALUE = 2;
        public static final int CASING_NONE_VALUE = 0;
        public static final int CASING_UPPERCASE_VALUE = 3;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.d.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.d.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6164a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6164a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.d.b f6165a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.d.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.d.b.f6165a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.d forNumber(int i) {
            if (i == 0) {
                return CASING_NONE;
            }
            if (i == 1) {
                return CASING_CAPITALIZE;
            }
            if (i == 2) {
                return CASING_LOWERCASE;
            }
            if (i != 3) {
                return null;
            }
            return CASING_UPPERCASE;
        }

        d(int i) {
            this.f6164a = i;
        }
    }

    public enum e implements com.google.protobuf.Internal.EnumLite {
        CONTRAST_DEFAULT(0),
        CONTRAST_LOW(1),
        CONTRAST_HIGH(2),
        CONTRAST_INVERSE_DEFAULT(3),
        CONTRAST_INVERSE_LOW(4),
        CONTRAST_INVERSE_HIGH(5),
        UNRECOGNIZED(-1);

        public static final int CONTRAST_DEFAULT_VALUE = 0;
        public static final int CONTRAST_HIGH_VALUE = 2;
        public static final int CONTRAST_INVERSE_DEFAULT_VALUE = 3;
        public static final int CONTRAST_INVERSE_HIGH_VALUE = 5;
        public static final int CONTRAST_INVERSE_LOW_VALUE = 4;
        public static final int CONTRAST_LOW_VALUE = 1;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.e.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.e.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6166a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6166a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.e.b f6167a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.e.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.e.b.f6167a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.e forNumber(int i) {
            if (i == 0) {
                return CONTRAST_DEFAULT;
            }
            if (i == 1) {
                return CONTRAST_LOW;
            }
            if (i == 2) {
                return CONTRAST_HIGH;
            }
            if (i == 3) {
                return CONTRAST_INVERSE_DEFAULT;
            }
            if (i == 4) {
                return CONTRAST_INVERSE_LOW;
            }
            if (i != 5) {
                return null;
            }
            return CONTRAST_INVERSE_HIGH;
        }

        e(int i) {
            this.f6166a = i;
        }
    }

    public enum f implements com.google.protobuf.Internal.EnumLite {
        FONT_SANS(0),
        FONT_MONO(1),
        UNRECOGNIZED(-1);

        public static final int FONT_MONO_VALUE = 1;
        public static final int FONT_SANS_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.f.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.f.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6168a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6168a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.f.b f6169a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.f.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.f.b.f6169a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.f forNumber(int i) {
            if (i == 0) {
                return FONT_SANS;
            }
            if (i != 1) {
                return null;
            }
            return FONT_MONO;
        }

        f(int i) {
            this.f6168a = i;
        }
    }

    public enum g implements com.google.protobuf.Internal.EnumLite {
        FONT_WEIGHT_NORMAL(0),
        FONT_WEIGHT_BOLD(1),
        FONT_WEIGHT_MEDIUM(2),
        FONT_WEIGHT_SEMI_BOLD(3),
        FONT_WEIGHT_EXTRA_BOLD(4),
        UNRECOGNIZED(-1);

        public static final int FONT_WEIGHT_BOLD_VALUE = 1;
        public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 4;
        public static final int FONT_WEIGHT_MEDIUM_VALUE = 2;
        public static final int FONT_WEIGHT_NORMAL_VALUE = 0;
        public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 3;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.g.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.g.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6170a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6170a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.g.b f6171a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.g.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.TextContent.g.b.f6171a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g forNumber(int i) {
            if (i == 0) {
                return FONT_WEIGHT_NORMAL;
            }
            if (i == 1) {
                return FONT_WEIGHT_BOLD;
            }
            if (i == 2) {
                return FONT_WEIGHT_MEDIUM;
            }
            if (i == 3) {
                return FONT_WEIGHT_SEMI_BOLD;
            }
            if (i != 4) {
                return null;
            }
            return FONT_WEIGHT_EXTRA_BOLD;
        }

        g(int i) {
            this.f6170a = i;
        }
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    private void clearCasing() {
        this.casing_ = 0;
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearAlign() {
        this.align_ = 0;
    }

    private Common$TextContent() {
    }

    public static final class c extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c> implements com.google.protobuf.MessageLiteOrBuilder {
        public c() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent();
        DEFAULT_INSTANCE = common$TextContent;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.class, common$TextContent);
    }
}
