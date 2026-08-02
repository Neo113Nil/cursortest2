package com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            mutableState = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableState3 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            getHtmlContentViewModelImpl = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            androidx.view.MutableLiveData<java.lang.String> htmlContent = getHtmlContentViewModelImpl.getHtmlContent();
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.getHighResolutionOutputSizeshNQ4ISI.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.getHighResolutionOutputSizeshNQ4ISI.getFailureAction();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.getHighResolutionOutputSizeshNQ4ISI.getRetryAction();
            final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment3 = this.getHighResolutionOutputSizeshNQ4ISI;
            new com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider(function0, mutableState2, mutableState, htmlContent, mutableState3, function02, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.this);
                }
            }, failure, failureAction, retryAction).View(composer2, com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.$stable);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.String str;
        androidx.compose.runtime.MutableState mutableState3;
        java.lang.String type;
        mutableState = legalDocumentsPendingAcceptanceFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            legalDocumentsPendingAcceptanceFragment.trackNavigationPressed();
            mutableState2 = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
            com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState2.getValue();
            java.lang.String str2 = "";
            if (legalDocument == null || (str = legalDocument.getDocumentId()) == null) {
                str = "";
            }
            mutableState3 = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
            com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument2 = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState3.getValue();
            if (legalDocument2 != null && (type = legalDocument2.getType()) != null) {
                str2 = type;
            }
            legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoSizes(com.ingo.sdk.kotlin.common.analytics.IEventNames.LegalDocumentDeclined, str, str2);
            com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.access$declineDocumentAndExitSdk(legalDocumentsPendingAcceptanceFragment);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.String str;
        androidx.compose.runtime.MutableState mutableState3;
        java.lang.String type;
        mutableState = legalDocumentsPendingAcceptanceFragment.getHighResolutionOutputSizeshNQ4ISI;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            mutableState2 = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
            com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState2.getValue();
            java.lang.String str2 = "";
            if (legalDocument == null || (str = legalDocument.getDocumentId()) == null) {
                str = "";
            }
            mutableState3 = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
            com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument2 = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState3.getValue();
            if (legalDocument2 != null && (type = legalDocument2.getType()) != null) {
                str2 = type;
            }
            legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoSizes(com.ingo.sdk.kotlin.common.analytics.IEventNames.LegalDocumentDeclined, str, str2);
            com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.access$declineDocumentAndExitSdk(legalDocumentsPendingAcceptanceFragment);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment) {
        androidx.compose.runtime.MutableState mutableState;
        java.lang.String str;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.String type;
        mutableState = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
        com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState.getValue();
        java.lang.String str2 = "";
        if (legalDocument == null || (str = legalDocument.getDocumentId()) == null) {
            str = "";
        }
        mutableState2 = legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor;
        com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument2 = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState2.getValue();
        if (legalDocument2 != null && (type = legalDocument2.getType()) != null) {
            str2 = type;
        }
        legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoSizes(com.ingo.sdk.kotlin.common.analytics.IEventNames.LegalDocumentAccepted, str, str2);
        legalDocumentsPendingAcceptanceFragment.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    LegalDocumentsPendingAcceptanceFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment legalDocumentsPendingAcceptanceFragment) {
        this.getHighResolutionOutputSizeshNQ4ISI = legalDocumentsPendingAcceptanceFragment;
    }
}
