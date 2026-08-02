package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Box extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int AS_FIELD_NUMBER = 7;
    public static final int BORDER_BOTTOM_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_FIELD_NUMBER = 8;
    public static final int BORDER_LEFT_FIELD_NUMBER = 5;
    public static final int BORDER_RIGHT_FIELD_NUMBER = 3;
    public static final int BORDER_TOP_FIELD_NUMBER = 2;
    public static final int COMPONENTS_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 6;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_BEHAVIOR_FIELD_NUMBER = 11;
    public static final int JUSTIFY_CONTENT_FIELD_NUMBER = 9;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box> PARSER;
    private int as_;
    private int borderBottom_;
    private int borderColor_;
    private int borderLeft_;
    private int borderRight_;
    private int borderTop_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private int display_;
    private int flexDirection_;
    private int heightBehavior_;
    private int justifyContent_;

    private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureComponentsIsMutable();
        this.components_.add(i, common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureComponentsIsMutable();
        this.components_.add(common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box) {
        return DEFAULT_INSTANCE.createBuilder(common$Box);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final int getJustifyContentValue() {
        return this.justifyContent_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s getJustifyContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(this.justifyContent_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.UNRECOGNIZED : forNumber;
    }

    public final int getHeightBehaviorValue() {
        return this.heightBehavior_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f getHeightBehavior() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f.forNumber(this.heightBehavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f.UNRECOGNIZED : forNumber;
    }

    public final int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u getFlexDirection() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.forNumber(this.flexDirection_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.UNRECOGNIZED : forNumber;
    }

    public final int getDisplayValue() {
        return this.display_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e getDisplay() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e.forNumber(this.display_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e.UNRECOGNIZED : forNumber;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getComponentsOrBuilderList() {
        return this.components_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getComponentsOrBuilder(int i) {
        return this.components_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getComponentsList() {
        return this.components_;
    }

    public final int getComponentsCount() {
        return this.components_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponents(int i) {
        return this.components_.get(i);
    }

    public final int getBorderTopValue() {
        return this.borderTop_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b getBorderTop() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(this.borderTop_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.UNRECOGNIZED : forNumber;
    }

    public final int getBorderRightValue() {
        return this.borderRight_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b getBorderRight() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(this.borderRight_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.UNRECOGNIZED : forNumber;
    }

    public final int getBorderLeftValue() {
        return this.borderLeft_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b getBorderLeft() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(this.borderLeft_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.UNRECOGNIZED : forNumber;
    }

    public final int getBorderColorValue() {
        return this.borderColor_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c getBorderColor() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c.forNumber(this.borderColor_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c.UNRECOGNIZED : forNumber;
    }

    public final int getBorderBottomValue() {
        return this.borderBottom_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b getBorderBottom() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(this.borderBottom_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.UNRECOGNIZED : forNumber;
    }

    public final int getAsValue() {
        return this.as_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a getAs() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.forNumber(this.as_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\f\b\f\t\f\n\f\u000b\f", new java.lang.Object[]{"components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "borderTop_", "borderRight_", "borderBottom_", "borderLeft_", "display_", "as_", "borderColor_", "justifyContent_", "flexDirection_", "heightBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.class) {
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

    private void setJustifyContentValue(int i) {
        this.justifyContent_ = i;
    }

    private void setJustifyContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s enumC0492s) {
        this.justifyContent_ = enumC0492s.getNumber();
    }

    private void setHeightBehaviorValue(int i) {
        this.heightBehavior_ = i;
    }

    private void setHeightBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f fVar) {
        this.heightBehavior_ = fVar.getNumber();
    }

    private void setFlexDirectionValue(int i) {
        this.flexDirection_ = i;
    }

    private void setFlexDirection(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u enumC0494u) {
        this.flexDirection_ = enumC0494u.getNumber();
    }

    private void setDisplayValue(int i) {
        this.display_ = i;
    }

    private void setDisplay(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e eVar) {
        this.display_ = eVar.getNumber();
    }

    private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureComponentsIsMutable();
        this.components_.set(i, common$FlexibleComponent);
    }

    private void setBorderTopValue(int i) {
        this.borderTop_ = i;
    }

    private void setBorderTop(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b bVar) {
        this.borderTop_ = bVar.getNumber();
    }

    private void setBorderRightValue(int i) {
        this.borderRight_ = i;
    }

    private void setBorderRight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b bVar) {
        this.borderRight_ = bVar.getNumber();
    }

    private void setBorderLeftValue(int i) {
        this.borderLeft_ = i;
    }

    private void setBorderLeft(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b bVar) {
        this.borderLeft_ = bVar.getNumber();
    }

    private void setBorderColorValue(int i) {
        this.borderColor_ = i;
    }

    private void setBorderColor(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c cVar) {
        this.borderColor_ = cVar.getNumber();
    }

    private void setBorderBottomValue(int i) {
        this.borderBottom_ = i;
    }

    private void setBorderBottom(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b bVar) {
        this.borderBottom_ = bVar.getNumber();
    }

    private void setAsValue(int i) {
        this.as_ = i;
    }

    private void setAs(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a aVar) {
        this.as_ = aVar.getNumber();
    }

    private void removeComponents(int i) {
        ensureComponentsIsMutable();
        this.components_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureComponentsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearJustifyContent() {
        this.justifyContent_ = 0;
    }

    private void clearHeightBehavior() {
        this.heightBehavior_ = 0;
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void clearDisplay() {
        this.display_ = 0;
    }

    private void clearComponents() {
        this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearBorderTop() {
        this.borderTop_ = 0;
    }

    private void clearBorderRight() {
        this.borderRight_ = 0;
    }

    private void clearBorderLeft() {
        this.borderLeft_ = 0;
    }

    public enum a implements com.google.protobuf.Internal.EnumLite {
        AS_DIV(0),
        AS_SPAN(1),
        UNRECOGNIZED(-1);

        public static final int AS_DIV_VALUE = 0;
        public static final int AS_SPAN_VALUE = 1;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.C0173a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.C0173a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6117a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a$a, reason: collision with other inner class name */
        public final class C0173a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6117a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.a.b f6118a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.a.b.f6118a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.a forNumber(int i) {
            if (i == 0) {
                return AS_DIV;
            }
            if (i != 1) {
                return null;
            }
            return AS_SPAN;
        }

        a(int i) {
            this.f6117a = i;
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        BORDER_NONE(0),
        BORDER_STANDARD(1),
        UNRECOGNIZED(-1);

        public static final int BORDER_NONE_VALUE = 0;
        public static final int BORDER_STANDARD_VALUE = 1;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6119a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6119a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b$b, reason: collision with other inner class name */
        public static final class C0174b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.C0174b f6120a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.C0174b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b.C0174b.f6120a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.b forNumber(int i) {
            if (i == 0) {
                return BORDER_NONE;
            }
            if (i != 1) {
                return null;
            }
            return BORDER_STANDARD;
        }

        b(int i) {
            this.f6119a = i;
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        BORDER_COLOR_CONTRAST_DEFAULT(0),
        BORDER_COLOR_CONTRAST_LOW(1),
        BORDER_COLOR_CONTRAST_HIGH(2),
        BORDER_COLOR_STATE_DEFAULT(3),
        BORDER_COLOR_STATE_ERROR(4),
        BORDER_COLOR_STATE_INFO(5),
        BORDER_COLOR_STATE_SUCCESS(6),
        BORDER_COLOR_STATE_WARNING(7),
        BORDER_COLOR_STATUS_DEFAULT(8),
        BORDER_COLOR_STATUS_ERROR(9),
        BORDER_COLOR_STATUS_INFO(10),
        BORDER_COLOR_STATUS_SUCCESS(11),
        BORDER_COLOR_STATUS_WARNING(12),
        UNRECOGNIZED(-1);

        public static final int BORDER_COLOR_CONTRAST_DEFAULT_VALUE = 0;
        public static final int BORDER_COLOR_CONTRAST_HIGH_VALUE = 2;
        public static final int BORDER_COLOR_CONTRAST_LOW_VALUE = 1;
        public static final int BORDER_COLOR_STATE_DEFAULT_VALUE = 3;
        public static final int BORDER_COLOR_STATE_ERROR_VALUE = 4;
        public static final int BORDER_COLOR_STATE_INFO_VALUE = 5;
        public static final int BORDER_COLOR_STATE_SUCCESS_VALUE = 6;
        public static final int BORDER_COLOR_STATE_WARNING_VALUE = 7;
        public static final int BORDER_COLOR_STATUS_DEFAULT_VALUE = 8;
        public static final int BORDER_COLOR_STATUS_ERROR_VALUE = 9;
        public static final int BORDER_COLOR_STATUS_INFO_VALUE = 10;
        public static final int BORDER_COLOR_STATUS_SUCCESS_VALUE = 11;
        public static final int BORDER_COLOR_STATUS_WARNING_VALUE = 12;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6121a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6121a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.c.b f6122a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.c.b.f6122a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.c forNumber(int i) {
            switch (i) {
                case 0:
                    return BORDER_COLOR_CONTRAST_DEFAULT;
                case 1:
                    return BORDER_COLOR_CONTRAST_LOW;
                case 2:
                    return BORDER_COLOR_CONTRAST_HIGH;
                case 3:
                    return BORDER_COLOR_STATE_DEFAULT;
                case 4:
                    return BORDER_COLOR_STATE_ERROR;
                case 5:
                    return BORDER_COLOR_STATE_INFO;
                case 6:
                    return BORDER_COLOR_STATE_SUCCESS;
                case 7:
                    return BORDER_COLOR_STATE_WARNING;
                case 8:
                    return BORDER_COLOR_STATUS_DEFAULT;
                case 9:
                    return BORDER_COLOR_STATUS_ERROR;
                case 10:
                    return BORDER_COLOR_STATUS_INFO;
                case 11:
                    return BORDER_COLOR_STATUS_SUCCESS;
                case 12:
                    return BORDER_COLOR_STATUS_WARNING;
                default:
                    return null;
            }
        }

        c(int i) {
            this.f6121a = i;
        }
    }

    public enum e implements com.google.protobuf.Internal.EnumLite {
        DISPLAY_INLINE(0),
        DISPLAY_BLOCK(1),
        DISPLAY_INLINE_BLOCK(2),
        DISPLAY_FLEX(3),
        DISPLAY_INLINE_FLEX(4),
        DISPLAY_GRID(5),
        DISPLAY_INLINE_GRID(6),
        UNRECOGNIZED(-1);

        public static final int DISPLAY_BLOCK_VALUE = 1;
        public static final int DISPLAY_FLEX_VALUE = 3;
        public static final int DISPLAY_GRID_VALUE = 5;
        public static final int DISPLAY_INLINE_BLOCK_VALUE = 2;
        public static final int DISPLAY_INLINE_FLEX_VALUE = 4;
        public static final int DISPLAY_INLINE_GRID_VALUE = 6;
        public static final int DISPLAY_INLINE_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.e.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.e.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6123a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6123a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.e.b f6124a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.e.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.e.b.f6124a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.e forNumber(int i) {
            switch (i) {
                case 0:
                    return DISPLAY_INLINE;
                case 1:
                    return DISPLAY_BLOCK;
                case 2:
                    return DISPLAY_INLINE_BLOCK;
                case 3:
                    return DISPLAY_FLEX;
                case 4:
                    return DISPLAY_INLINE_FLEX;
                case 5:
                    return DISPLAY_GRID;
                case 6:
                    return DISPLAY_INLINE_GRID;
                default:
                    return null;
            }
        }

        e(int i) {
            this.f6123a = i;
        }
    }

    public enum f implements com.google.protobuf.Internal.EnumLite {
        HEIGHT_BEHAVIOR_DEFAULT(0),
        HEIGHT_BEHAVIOR_100_PERCENT(1),
        UNRECOGNIZED(-1);

        public static final int HEIGHT_BEHAVIOR_100_PERCENT_VALUE = 1;
        public static final int HEIGHT_BEHAVIOR_DEFAULT_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.f.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.f.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6125a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6125a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.f.b f6126a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.f.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Box.f.b.f6126a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.f forNumber(int i) {
            if (i == 0) {
                return HEIGHT_BEHAVIOR_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return HEIGHT_BEHAVIOR_100_PERCENT;
        }

        f(int i) {
            this.f6125a = i;
        }
    }

    private void clearBorderColor() {
        this.borderColor_ = 0;
    }

    private void clearBorderBottom() {
        this.borderBottom_ = 0;
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
        ensureComponentsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
    }

    private Common$Box() {
    }

    public static final class d extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d> implements com.google.protobuf.MessageLiteOrBuilder {
        public d() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box();
        DEFAULT_INSTANCE = common$Box;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.class, common$Box);
    }
}
