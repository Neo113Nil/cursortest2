package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class StructuralMessageInfo implements com.google.crypto.tink.shaded.protobuf.MessageInfo {
    private final int[] checkInitialized;
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final com.google.crypto.tink.shaded.protobuf.ProtoSyntax syntax;

    StructuralMessageInfo(com.google.crypto.tink.shaded.protobuf.ProtoSyntax protoSyntax, boolean z, int[] iArr, com.google.crypto.tink.shaded.protobuf.FieldInfo[] fieldInfoArr, java.lang.Object obj) {
        this.syntax = protoSyntax;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = fieldInfoArr;
        this.defaultInstance = (com.google.crypto.tink.shaded.protobuf.MessageLite) com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public final com.google.crypto.tink.shaded.protobuf.ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public final int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    public final com.google.crypto.tink.shaded.protobuf.FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public final com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public static com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder newBuilder() {
        return new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder();
    }

    public static com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder newBuilder(int i) {
        return new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo.Builder(i);
    }

    /* loaded from: classes9.dex */
    public static final class Builder {
        private int[] checkInitialized;
        private java.lang.Object defaultInstance;
        private final java.util.List<com.google.crypto.tink.shaded.protobuf.FieldInfo> fields;
        private boolean messageSetWireFormat;
        private com.google.crypto.tink.shaded.protobuf.ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList();
        }

        public Builder(int i) {
            this.checkInitialized = null;
            this.fields = new java.util.ArrayList(i);
        }

        public final void withDefaultInstance(java.lang.Object obj) {
            this.defaultInstance = obj;
        }

        public final void withSyntax(com.google.crypto.tink.shaded.protobuf.ProtoSyntax protoSyntax) {
            this.syntax = (com.google.crypto.tink.shaded.protobuf.ProtoSyntax) com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(protoSyntax, "syntax");
        }

        public final void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public final void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public final void withField(com.google.crypto.tink.shaded.protobuf.FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public final com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new java.lang.IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            java.util.Collections.sort(this.fields);
            return new com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (com.google.crypto.tink.shaded.protobuf.FieldInfo[]) this.fields.toArray(new com.google.crypto.tink.shaded.protobuf.FieldInfo[0]), this.defaultInstance);
        }
    }
}
