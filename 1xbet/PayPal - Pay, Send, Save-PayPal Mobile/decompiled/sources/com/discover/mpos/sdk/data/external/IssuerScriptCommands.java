package com.discover.mpos.sdk.data.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/discover/mpos/sdk/data/external/IssuerScriptCommands;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "", "content", "<init>", "(Ljava/lang/String;)V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "", "([B)V", "", "clear", "()V", "component1", "()[B", "copy", "([B)Lcom/discover/mpos/sdk/data/external/IssuerScriptCommands;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toByteArray", "toString", "()Ljava/lang/String;", "[B", "isAvailable", "Z", "()Z"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class IssuerScriptCommands implements com.discover.mpos.sdk.core.emv.ClearableEmvData {
    private final byte[] content;
    private final boolean isAvailable;

    public IssuerScriptCommands(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.content = bArr;
        this.isAvailable = !(bArr.length == 0);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    public /* synthetic */ IssuerScriptCommands(byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new byte[0] : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IssuerScriptCommands(java.lang.String str) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IssuerScriptCommands(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        this(tlv.getK());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
    }

    /* renamed from: isAvailable, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getK() {
        return this.content;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.data.external.IssuerScriptCommands");
        }
        com.discover.mpos.sdk.data.external.IssuerScriptCommands issuerScriptCommands = (com.discover.mpos.sdk.data.external.IssuerScriptCommands) other;
        return java.util.Arrays.equals(this.content, issuerScriptCommands.content) && this.isAvailable == issuerScriptCommands.isAvailable;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.content) * 31) + java.lang.Boolean.hashCode(this.isAvailable);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.content.clone();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerScriptCommands(content=");
        sb.append(java.util.Arrays.toString(this.content));
        sb.append(")");
        return sb.toString();
    }

    public final com.discover.mpos.sdk.data.external.IssuerScriptCommands copy(byte[] content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.discover.mpos.sdk.data.external.IssuerScriptCommands(content);
    }

    public static /* synthetic */ com.discover.mpos.sdk.data.external.IssuerScriptCommands copy$default(com.discover.mpos.sdk.data.external.IssuerScriptCommands issuerScriptCommands, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = issuerScriptCommands.content;
        }
        return issuerScriptCommands.copy(bArr);
    }

    /* renamed from: component1, reason: from getter */
    private final byte[] getContent() {
        return this.content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssuerScriptCommands() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
