package com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/legal_documents_pending_acceptance/LegalDocumentsViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/ingo/sdk/kotlin/common/core/http/response/LegalDocument;", "legalDocument", "", "accept", "(Lcom/ingo/sdk/kotlin/common/core/http/response/LegalDocument;)V", "decline", "Landroidx/lifecycle/MutableLiveData;", "", "acceptedDocumentData", "Landroidx/lifecycle/MutableLiveData;", "getAcceptedDocumentData", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LegalDocumentsViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsViewModel {
    public static final int $stable = 8;
    private final androidx.view.MutableLiveData<java.lang.Object> acceptedDocumentData;

    public /* synthetic */ LegalDocumentsViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public LegalDocumentsViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.acceptedDocumentData = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<java.lang.Object> getAcceptedDocumentData() {
        return this.acceptedDocumentData;
    }

    @Override // com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsViewModel
    public final void accept(final com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalDocument, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.$r8$lambda$tdOpbNOCAMPatFNI4QbyamVYwno(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument.this, this);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsViewModel
    public final void decline(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalDocument, "");
        kotlinx.coroutines.CoroutineScope coroutineScope = getCoroutineScope();
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
        if (obj != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getBackgroundDispatcher(), null, new com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$decline$1(legalDocument, null), 2, null);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EWjSnDOQ0FgYgcoHBBGpfrDDByQ(final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl legalDocumentsViewModelImpl, final java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        legalDocumentsViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.$r8$lambda$nFL4aMETGz7D4oQ6Hf05qa4fWH4(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.this, obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OsXvYyCURTGLvqkDILTLR6kDmAA(final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl legalDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.fold(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.$r8$lambda$b0ifpiWZVyXngL4AuWyKlNs_AQc(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.$r8$lambda$EWjSnDOQ0FgYgcoHBBGpfrDDByQ(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.this, obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b0ifpiWZVyXngL4AuWyKlNs_AQc(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl legalDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(legalDocumentsViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nFL4aMETGz7D4oQ6Hf05qa4fWH4(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl legalDocumentsViewModelImpl, java.lang.Object obj) {
        legalDocumentsViewModelImpl.acceptedDocumentData.postValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tdOpbNOCAMPatFNI4QbyamVYwno(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument, final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl legalDocumentsViewModelImpl) {
        new com.ingo.sdk.kotlin.common.features.legal_documents.AcceptLegalDocumentUseCase().invoke(legalDocument, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.$r8$lambda$OsXvYyCURTGLvqkDILTLR6kDmAA(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LegalDocumentsViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
