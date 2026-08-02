package com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class LegalDocumentsPendingAcceptanceFragment$onCreate$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.core.exception.Failure, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        ((com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment) this.receiver).getHighSpeedVideoFpsRanges(failure);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        getHighSpeedVideoFpsRangesFor(failure);
        return kotlin.Unit.INSTANCE;
    }

    LegalDocumentsPendingAcceptanceFragment$onCreate$3$1(java.lang.Object obj) {
        super(1, obj, com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.class, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRanges(Lcom/ingo/sdk/kotlin/common/core/exception/Failure;)V", 0);
    }
}
