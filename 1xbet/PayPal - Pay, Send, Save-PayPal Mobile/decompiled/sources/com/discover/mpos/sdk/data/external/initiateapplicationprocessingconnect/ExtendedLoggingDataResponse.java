package com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001b\u0010!\u001a\u00020\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "", "content", "<init>", "(Ljava/lang/String;)V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "", "([B)V", "", "clear", "()V", "component1", "()[B", "copy", "([B)Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toByteArray", "toString", "()Ljava/lang/String;", "[B", "extendedLoggingData$delegate", "Lkotlin/Lazy;", "getExtendedLoggingData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "extendedLoggingData"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ExtendedLoggingDataResponse implements com.discover.mpos.sdk.core.emv.ClearableEmvData {
    private final byte[] content;

    /* renamed from: extendedLoggingData$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy extendedLoggingData;

    public ExtendedLoggingDataResponse(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.content = bArr;
        this.extendedLoggingData = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse.a());
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedLoggingDataResponse(java.lang.String str) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedLoggingDataResponse(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        this(tlv.getE());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getE() {
        return this.content;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.content);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            return java.util.Arrays.equals(this.content, ((com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse) other).content);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse");
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.content);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.core.emv.tlv.Tlv> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.core.emv.tlv.Tlv invoke() {
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) kotlin.collections.CollectionsKt.firstOrNull(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.split$default(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse.this.content, false, false, 3, null));
            return tlv == null ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.EXTENDED_LOGGING_DATA.getTag(), null, 0, 0, 14, null) : tlv;
        }

        a() {
            super(0);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtendedLoggingDataResponse(content=");
        sb.append(java.util.Arrays.toString(this.content));
        sb.append(")");
        return sb.toString();
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getExtendedLoggingData() {
        return (com.discover.mpos.sdk.core.emv.tlv.Tlv) this.extendedLoggingData.getValue();
    }

    public final com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse copy(byte[] content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse(content);
    }

    public static /* synthetic */ com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse copy$default(com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect.ExtendedLoggingDataResponse extendedLoggingDataResponse, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = extendedLoggingDataResponse.content;
        }
        return extendedLoggingDataResponse.copy(bArr);
    }

    /* renamed from: component1, reason: from getter */
    private final byte[] getContent() {
        return this.content;
    }
}
