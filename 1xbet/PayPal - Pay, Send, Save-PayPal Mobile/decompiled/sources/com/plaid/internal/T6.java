package com.plaid.internal;

/* loaded from: classes16.dex */
public final class T6 {
    public static final com.plaid.link.result.LinkResult a(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sDKResult, "");
        com.plaid.link.result.LinkInstitution linkInstitution = null;
        if (sDKResult.getCallback() != com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS) {
            if (sDKResult.getCallback() != com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR) {
                return null;
            }
            java.lang.String linkSessionId = sDKResult.getMetadata().getLinkSessionId();
            java.lang.String institutionId = sDKResult.getMetadata().getInstitution().getInstitutionId();
            java.lang.String name2 = sDKResult.getMetadata().getInstitution().getName();
            java.lang.String requestId = sDKResult.getMetadata().getRequestId();
            com.plaid.link.result.LinkExitMetadataStatus fromString = com.plaid.link.result.LinkExitMetadataStatus.INSTANCE.fromString(sDKResult.getMetadata().getStatus());
            java.lang.String metadataJson = sDKResult.getMetadataJson();
            if (name2 != null && name2.length() != 0 && institutionId != null && institutionId.length() != 0) {
                linkInstitution = new com.plaid.link.result.LinkInstitution(name2, institutionId);
            }
            com.plaid.link.result.LinkExitMetadata linkExitMetadata = new com.plaid.link.result.LinkExitMetadata(fromString, linkInstitution, linkSessionId, requestId, metadataJson);
            java.lang.String errorCode = sDKResult.getError().getErrorCode();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCode, "");
            java.lang.String errorMessage = sDKResult.getError().getErrorMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "");
            java.lang.String displayMessage = sDKResult.getError().getDisplayMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayMessage, "");
            java.lang.String errorJson = sDKResult.getErrorJson();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorJson, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorJson, "");
            return new com.plaid.link.result.LinkExit(new com.plaid.link.result.LinkError(com.plaid.link.result.LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson), linkExitMetadata);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> accountsList = sDKResult.getMetadata().getAccountsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accountsList, "");
        for (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account : accountsList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(account);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
            java.lang.String id = account.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
            arrayList.add(new com.plaid.link.result.LinkAccount(id, account.getName(), account.getMask(), com.plaid.link.result.LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType()), com.plaid.link.result.LinkAccountVerificationStatus.INSTANCE.convert(account.getVerificationStatus()), null, 32, null));
        }
        java.lang.String institutionId2 = sDKResult.getMetadata().getInstitution().getInstitutionId();
        java.lang.String name3 = sDKResult.getMetadata().getInstitution().getName();
        java.lang.String linkSessionId2 = sDKResult.getMetadata().getLinkSessionId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linkSessionId2, "");
        java.lang.String metadataJson2 = sDKResult.getMetadataJson();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(metadataJson2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSessionId2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataJson2, "");
        if (institutionId2 != null && institutionId2.length() != 0 && name3 != null && name3.length() != 0) {
            linkInstitution = new com.plaid.link.result.LinkInstitution(institutionId2, name3);
        }
        com.plaid.link.result.LinkSuccessMetadata linkSuccessMetadata = new com.plaid.link.result.LinkSuccessMetadata(linkInstitution, arrayList, linkSessionId2, metadataJson2);
        java.lang.String publicToken = sDKResult.getPublicToken();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSuccessMetadata, "");
        return new com.plaid.link.result.LinkSuccess(publicToken, linkSuccessMetadata);
    }
}
