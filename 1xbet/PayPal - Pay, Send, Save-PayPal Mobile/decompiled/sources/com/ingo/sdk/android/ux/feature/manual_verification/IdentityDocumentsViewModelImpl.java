package com.ingo.sdk.android.ux.feature.manual_verification;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/manual_verification/IdentityDocumentsViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCaseParameters;", "identityDocuments", "", "uploadIdentityDocuments", "(Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCaseParameters;)V", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCase;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/model/IdentityDocumentsResponse;", "identityDocumentResponseData", "Landroidx/lifecycle/MutableLiveData;", "getIdentityDocumentResponseData", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdentityDocumentsViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCase Camera2StreamConfigurationMap;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse> identityDocumentResponseData;

    public /* synthetic */ IdentityDocumentsViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public IdentityDocumentsViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.Camera2StreamConfigurationMap = new com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCase();
        this.identityDocumentResponseData = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse> getIdentityDocumentResponseData() {
        return this.identityDocumentResponseData;
    }

    @Override // com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsViewModel
    public final void uploadIdentityDocuments(final com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters identityDocuments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocuments, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.$r8$lambda$BnTWviBiBdMksRu1sx2e_GMSOBU(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.this, identityDocuments);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BnTWviBiBdMksRu1sx2e_GMSOBU(final com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters uploadIdentityDocumentsUseCaseParameters) {
        identityDocumentsViewModelImpl.Camera2StreamConfigurationMap.invoke(uploadIdentityDocumentsUseCaseParameters, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.$r8$lambda$uLCqvqeke9IyY9fCYr0t2am8bPM(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P42f4qTi2C3z6vDvzhkN7g8DlJw(final com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl, final com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse identityDocumentsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocumentsResponse, "");
        identityDocumentsViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.m10670$r8$lambda$Vk8Yjns9NLdbRvtjLDZqu0YYWg(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.this, identityDocumentsResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Vk8Yjns9NLdbRvtjLDZqu-0YYWg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10670$r8$lambda$Vk8Yjns9NLdbRvtjLDZqu0YYWg(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse identityDocumentsResponse) {
        identityDocumentsViewModelImpl.identityDocumentResponseData.postValue(identityDocumentsResponse);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nziHgZ_l7_VeIaj-9sLUnGCKSEY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10671$r8$lambda$nziHgZ_l7_VeIaj9sLUnGCKSEY(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(identityDocumentsViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uLCqvqeke9IyY9fCYr0t2am8bPM(final com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.m10671$r8$lambda$nziHgZ_l7_VeIaj9sLUnGCKSEY(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.$r8$lambda$P42f4qTi2C3z6vDvzhkN7g8DlJw(com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentityDocumentsViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
