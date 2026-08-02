package com.discover.mpos.sdk.card.apdu.g.application;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0002X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponse;", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;", "()V", "content", "getContent", "()Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;", "setContent", "(Lcom/discover/mpos/sdk/card/apdu/select/application/SelectApplicationResponseContent;)V", "error", "getError", "()Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;", "setError", "(Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;)V", "isSuccessful", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.g.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectApplicationResponse implements com.discover.mpos.sdk.card.apdu.base.ApduResponse<com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent, com.discover.mpos.sdk.card.apdu.error.SelectApduError> {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent f2966a;
    private com.discover.mpos.sdk.card.apdu.error.SelectApduError b;

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isExecutionFailed() {
        return com.discover.mpos.sdk.card.apdu.base.ApduResponse.a.b(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final /* synthetic */ void setContent(com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent) {
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent2 = selectApplicationResponseContent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectApplicationResponseContent2, "");
        this.f2966a = selectApplicationResponseContent2;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final /* bridge */ /* synthetic */ void setError(com.discover.mpos.sdk.card.apdu.error.SelectApduError selectApduError) {
        this.b = selectApduError;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent getContent() {
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = this.f2966a;
        if (selectApplicationResponseContent == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return selectApplicationResponseContent;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    /* renamed from: getError */
    public final /* bridge */ /* synthetic */ com.discover.mpos.sdk.card.apdu.error.SelectApduError getB() {
        return this.b;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isSuccessful() {
        return this.b == null && this.f2966a != null;
    }
}
