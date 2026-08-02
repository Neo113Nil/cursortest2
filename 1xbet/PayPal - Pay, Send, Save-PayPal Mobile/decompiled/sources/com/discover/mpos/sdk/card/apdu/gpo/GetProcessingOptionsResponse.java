package com.discover.mpos.sdk.card.apdu.gpo;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u00020\u0002X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/GetProcessingOptionsError;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "()V", "content", "getContent", "()Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponseContent;", "setContent", "(Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponseContent;)V", "error", "getError", "()Lcom/discover/mpos/sdk/card/apdu/error/GetProcessingOptionsError;", "setError", "(Lcom/discover/mpos/sdk/card/apdu/error/GetProcessingOptionsError;)V", "clear", "", "isSuccessful", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.c.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetProcessingOptionsResponse implements com.discover.mpos.sdk.card.apdu.base.ApduResponse<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent, com.discover.mpos.sdk.card.apdu.error.GetProcessingOptionsError>, com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent f2948a;
    public com.discover.mpos.sdk.card.apdu.error.GetProcessingOptionsError b;

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isExecutionFailed() {
        return com.discover.mpos.sdk.card.apdu.base.ApduResponse.a.b(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final /* synthetic */ void setContent(com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent getProcessingOptionsResponseContent) {
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent getProcessingOptionsResponseContent2 = getProcessingOptionsResponseContent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProcessingOptionsResponseContent2, "");
        this.f2948a = getProcessingOptionsResponseContent2;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final /* bridge */ /* synthetic */ void setError(com.discover.mpos.sdk.card.apdu.error.GetProcessingOptionsError getProcessingOptionsError) {
        this.b = getProcessingOptionsError;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent getContent() {
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponseContent getProcessingOptionsResponseContent = this.f2948a;
        if (getProcessingOptionsResponseContent == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return getProcessingOptionsResponseContent;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        if (this.f2948a != null) {
            getContent().clear();
        }
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: getError */
    public final /* bridge */ /* synthetic */ com.discover.mpos.sdk.card.apdu.error.GetProcessingOptionsError getB() {
        return this.b;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isSuccessful() {
        return this.b == null && this.f2948a != null;
    }
}
