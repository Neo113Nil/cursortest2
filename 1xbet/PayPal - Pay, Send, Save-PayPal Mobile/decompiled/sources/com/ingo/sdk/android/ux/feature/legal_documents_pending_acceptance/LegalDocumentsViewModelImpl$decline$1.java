package com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1", f = "LegalDocumentsViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class LegalDocumentsViewModelImpl$decline$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.core.http.response.LegalDocument getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.ingo.sdk.kotlin.common.features.legal_documents.DeclineLegalDocumentUseCase declineLegalDocumentUseCase = new com.ingo.sdk.kotlin.common.features.legal_documents.DeclineLegalDocumentUseCase();
        final com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument = this.getHighSpeedVideoFpsRangesFor;
        declineLegalDocumentUseCase.invoke(legalDocument, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1.getHighSpeedVideoSizes(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(final com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        either.fold(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to decline document ");
        sb.append(legalDocument);
        sb.append(" ");
        sb.append(failure);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Declined ");
        sb.append(legalDocument);
        sb.append(" successfully");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDocumentsViewModelImpl$decline$1(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = legalDocument;
    }
}
