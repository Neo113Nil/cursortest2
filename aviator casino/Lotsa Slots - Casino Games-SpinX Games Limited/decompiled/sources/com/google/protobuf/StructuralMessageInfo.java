package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class StructuralMessageInfo implements com.google.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final com.google.protobuf.ProtoSyntax syntax;

    StructuralMessageInfo(com.google.protobuf.ProtoSyntax syntax, boolean messageSetWireFormat, int[] checkInitialized, com.google.protobuf.FieldInfo[] fields, java.lang.Object defaultInstance) {
        this.syntax = syntax;
        this.messageSetWireFormat = messageSetWireFormat;
        this.checkInitialized = checkInitialized;
        this.fields = fields;
        this.defaultInstance = (com.google.protobuf.MessageLite) com.google.protobuf.Internal.checkNotNull(defaultInstance, "defaultInstance");
    }

    @Override // com.google.protobuf.MessageInfo
    public com.google.protobuf.ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    public com.google.protobuf.FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.MessageInfo
    public com.google.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public static com.google.protobuf.StructuralMessageInfo.Builder newBuilder() {
        return new com.google.protobuf.StructuralMessageInfo.Builder();
    }

    public static com.google.protobuf.StructuralMessageInfo.Builder newBuilder(int numFields) {
        return new com.google.protobuf.StructuralMessageInfo.Builder(numFields);
    }

    public static final class Builder {
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        private final java.util.List<com.google.protobuf.FieldInfo> fields;
        private boolean messageSetWireFormat;
        private com.google.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList();
        }

        public Builder(int numFields) {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList(numFields);
        }

        public void withDefaultInstance(java.lang.Object defaultInstance) {
            this.defaultInstance = defaultInstance;
        }

        public void withSyntax(com.google.protobuf.ProtoSyntax syntax) {
            this.syntax = (com.google.protobuf.ProtoSyntax) com.google.protobuf.Internal.checkNotNull(syntax, "syntax");
        }

        public void withMessageSetWireFormat(boolean messageSetWireFormat) {
            this.messageSetWireFormat = messageSetWireFormat;
        }

        public void withCheckInitialized(int[] checkInitialized) {
            this.checkInitialized = checkInitialized;
        }

        public void withField(com.google.protobuf.FieldInfo field) {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            this.fields.add(field);
        }

        public com.google.protobuf.StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new java.lang.IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            java.util.Collections.sort(this.fields);
            return new com.google.protobuf.StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (com.google.protobuf.FieldInfo[]) this.fields.toArray(new com.google.protobuf.FieldInfo[0]), this.defaultInstance);
        }
    }
}
