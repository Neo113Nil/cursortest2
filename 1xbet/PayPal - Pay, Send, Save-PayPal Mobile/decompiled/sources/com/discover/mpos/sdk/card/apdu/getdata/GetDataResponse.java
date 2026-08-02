package com.discover.mpos.sdk.card.apdu.getdata;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u00020\u0002X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "()V", "content", "getContent", "()Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponseContent;", "setContent", "(Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponseContent;)V", "error", "getError", "()Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "setError", "(Lcom/discover/mpos/sdk/card/apdu/error/ApduError;)V", "clear", "", "isSuccessful", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetDataResponse implements com.discover.mpos.sdk.card.apdu.base.ApduResponse<com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent, com.discover.mpos.sdk.card.apdu.error.ApduError>, com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent f2943a;
    private com.discover.mpos.sdk.card.apdu.error.ApduError b;

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isExecutionFailed() {
        return com.discover.mpos.sdk.card.apdu.base.ApduResponse.a.b(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final /* synthetic */ void setContent(com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent getDataResponseContent) {
        com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent getDataResponseContent2 = getDataResponseContent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDataResponseContent2, "");
        this.f2943a = getDataResponseContent2;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent getContent() {
        com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent getDataResponseContent = this.f2943a;
        if (getDataResponseContent == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return getDataResponseContent;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: getError, reason: from getter */
    public final com.discover.mpos.sdk.card.apdu.error.ApduError getB() {
        return this.b;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final void setError(com.discover.mpos.sdk.card.apdu.error.ApduError apduError) {
        this.b = apduError;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isSuccessful() {
        return getB() == null && this.f2943a != null;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        if (this.f2943a != null) {
            getContent().clear();
        }
    }
}
