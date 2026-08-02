package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ThreadsListItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem DEFAULT_INSTANCE;
    public static final int LEADING_CONTENTS_FIELD_NUMBER = 1;
    public static final int LEADING_TEXT_ROWS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem> PARSER = null;
    public static final int TRAILING_CONTENTS_COLUMNS_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection leadingContents_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection leadingTextRows_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection trailingContentsColumns_;

    public static final class ListItemRow extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.b {
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.add(i, common$FlexibleComponent);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemRow.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.add(common$FlexibleComponent);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemRow.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow listItemRow) {
            return DEFAULT_INSTANCE.createBuilder(listItemRow);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemRow.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow.class) {
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

        private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.set(i, common$FlexibleComponent);
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void ensureComponentsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void clearComponents() {
            this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
            ensureComponentsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
        }

        private ListItemRow() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow listItemRow = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow();
            DEFAULT_INSTANCE = listItemRow;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow.class, listItemRow);
        }
    }

    public static final class ListItemSection extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow listItemRow) {
            ensureComponentsIsMutable();
            this.components_.add(i, listItemRow);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow listItemRow) {
            ensureComponentsIsMutable();
            this.components_.add(listItemRow);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
            return DEFAULT_INSTANCE.createBuilder(listItemSection);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.b> getComponentsOrBuilderList() {
            return this.components_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.b getComponentsOrBuilder(int i) {
            return this.components_.get(i);
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> getComponentsList() {
            return this.components_;
        }

        public final int getComponentsCount() {
            return this.components_.size();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow getComponents(int i) {
            return this.components_.get(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.class) {
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

        private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow listItemRow) {
            ensureComponentsIsMutable();
            this.components_.set(i, listItemRow);
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void ensureComponentsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void clearComponents() {
            this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemRow> iterable) {
            ensureComponentsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
        }

        private ListItemSection() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection();
            DEFAULT_INSTANCE = listItemSection;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.class, listItemSection);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem common$ThreadsListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$ThreadsListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasTrailingContentsColumns() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasLeadingTextRows() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasLeadingContents() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection getTrailingContentsColumns() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection = this.trailingContentsColumns_;
        return listItemSection == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance() : listItemSection;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection getLeadingTextRows() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection = this.leadingTextRows_;
        return listItemSection == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance() : listItemSection;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection getLeadingContents() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection = this.leadingContents_;
        return listItemSection == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance() : listItemSection;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"bitField0_", "leadingContents_", "leadingTextRows_", "trailingContentsColumns_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.class) {
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

    private void setTrailingContentsColumns(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        this.trailingContentsColumns_ = listItemSection;
        this.bitField0_ |= 4;
    }

    private void setLeadingTextRows(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        this.leadingTextRows_ = listItemSection;
        this.bitField0_ |= 2;
    }

    private void setLeadingContents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        this.leadingContents_ = listItemSection;
        this.bitField0_ |= 1;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeTrailingContentsColumns(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection2 = this.trailingContentsColumns_;
        if (listItemSection2 != null && listItemSection2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance()) {
            listItemSection = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.newBuilder(this.trailingContentsColumns_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a) listItemSection).buildPartial();
        }
        this.trailingContentsColumns_ = listItemSection;
        this.bitField0_ |= 4;
    }

    private void mergeLeadingTextRows(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection2 = this.leadingTextRows_;
        if (listItemSection2 != null && listItemSection2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance()) {
            listItemSection = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.newBuilder(this.leadingTextRows_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a) listItemSection).buildPartial();
        }
        this.leadingTextRows_ = listItemSection;
        this.bitField0_ |= 2;
    }

    private void mergeLeadingContents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection listItemSection2 = this.leadingContents_;
        if (listItemSection2 != null && listItemSection2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.getDefaultInstance()) {
            listItemSection = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.ListItemSection.newBuilder(this.leadingContents_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ThreadsListItem.ListItemSection.a) listItemSection).buildPartial();
        }
        this.leadingContents_ = listItemSection;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearTrailingContentsColumns() {
        this.trailingContentsColumns_ = null;
        this.bitField0_ &= -5;
    }

    private void clearLeadingTextRows() {
        this.leadingTextRows_ = null;
        this.bitField0_ &= -3;
    }

    private void clearLeadingContents() {
        this.leadingContents_ = null;
        this.bitField0_ &= -2;
    }

    private Common$ThreadsListItem() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem common$ThreadsListItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem();
        DEFAULT_INSTANCE = common$ThreadsListItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.class, common$ThreadsListItem);
    }
}
