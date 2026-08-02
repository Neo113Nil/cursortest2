package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S6 {
    public static final com.plaid.link.event.LinkEvent a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        com.plaid.link.event.LinkEventMetadata a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(common$SDKEvent, "");
        if (common$SDKEvent.hasMetadata()) {
            java.lang.String brandName = common$SDKEvent.getMetadata().getBrandName();
            java.lang.String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            java.lang.String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            java.lang.String errorType = common$SDKEvent.getMetadata().getErrorType();
            java.lang.String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            java.lang.String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            java.lang.String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            java.lang.String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            java.lang.String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            java.lang.String mfaType = common$SDKEvent.getMetadata().getMfaType();
            java.lang.String requestId = common$SDKEvent.getMetadata().getRequestId();
            java.lang.String selection = common$SDKEvent.getMetadata().getSelection();
            java.lang.String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            java.lang.String viewName = common$SDKEvent.getMetadata().getViewName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode);
            kotlin.jvm.internal.Intrinsics.checkNotNull(errorMessage);
            kotlin.jvm.internal.Intrinsics.checkNotNull(errorType);
            kotlin.jvm.internal.Intrinsics.checkNotNull(exitStatus);
            kotlin.jvm.internal.Intrinsics.checkNotNull(institutionId);
            kotlin.jvm.internal.Intrinsics.checkNotNull(institutionName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(institutionSearchQuery);
            kotlin.jvm.internal.Intrinsics.checkNotNull(linkSessionId);
            kotlin.jvm.internal.Intrinsics.checkNotNull(mfaType);
            kotlin.jvm.internal.Intrinsics.checkNotNull(requestId);
            kotlin.jvm.internal.Intrinsics.checkNotNull(timestamp);
            kotlin.jvm.internal.Intrinsics.checkNotNull(viewName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(brandName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
            a2 = com.plaid.internal.C0700z2.a((r33 & 1) != 0 ? "" : errorCode, (r33 & 2) != 0 ? "" : errorMessage, (r33 & 4) != 0 ? "" : errorType, (r33 & 8) != 0 ? "" : exitStatus, (r33 & 16) != 0 ? "" : institutionId, (r33 & 32) != 0 ? "" : institutionName, (r33 & 64) != 0 ? "" : institutionSearchQuery, "", linkSessionId, (r33 & 512) != 0 ? "" : mfaType, (r33 & 1024) != 0 ? "" : requestId, timestamp, (r33 & 4096) != 0 ? "" : viewName, brandName, (r33 & 16384) != 0 ? "" : selection, "{}");
        } else {
            java.lang.String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(brandName2, "");
            a2 = com.plaid.internal.C0700z2.a((r33 & 1) != 0 ? "" : null, (r33 & 2) != 0 ? "" : null, (r33 & 4) != 0 ? "" : null, (r33 & 8) != 0 ? "" : null, (r33 & 16) != 0 ? "" : null, (r33 & 32) != 0 ? "" : null, (r33 & 64) != 0 ? "" : null, "", "", (r33 & 512) != 0 ? "" : null, (r33 & 1024) != 0 ? "" : null, "", (r33 & 4096) != 0 ? "" : null, brandName2, (r33 & 16384) != 0 ? "" : null, "{}");
        }
        java.lang.String eventName = common$SDKEvent.getEventName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        return new com.plaid.link.event.LinkEvent(com.plaid.link.event.LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), a2);
    }

    public static final com.plaid.link.event.LinkEvent a(com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent sDKEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sDKEvent, "");
        java.lang.String brandName = sDKEvent.getMetadata().getBrandName();
        java.lang.String errorCode = sDKEvent.getMetadata().getErrorCode();
        java.lang.String errorMessage = sDKEvent.getMetadata().getErrorMessage();
        java.lang.String errorType = sDKEvent.getMetadata().getErrorType();
        java.lang.String exitStatus = sDKEvent.getMetadata().getExitStatus();
        java.lang.String institutionId = sDKEvent.getMetadata().getInstitutionId();
        java.lang.String institutionName = sDKEvent.getMetadata().getInstitutionName();
        java.lang.String institutionSearchQuery = sDKEvent.getMetadata().getInstitutionSearchQuery();
        java.lang.String issueId = sDKEvent.getMetadata().getIssueId();
        java.lang.String linkSessionId = sDKEvent.getMetadata().getLinkSessionId();
        java.lang.String mfaType = sDKEvent.getMetadata().getMfaType();
        java.lang.String requestId = sDKEvent.getMetadata().getRequestId();
        java.lang.String selection = sDKEvent.getMetadata().getSelection();
        java.lang.String timestamp = sDKEvent.getMetadata().getTimestamp();
        java.lang.String viewName = sDKEvent.getMetadata().getViewName();
        java.lang.String metadataJson = sDKEvent.getMetadataJson();
        if (kotlin.text.StringsKt.isBlank(metadataJson)) {
            metadataJson = "{}";
        }
        java.lang.String str = metadataJson;
        kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode);
        kotlin.jvm.internal.Intrinsics.checkNotNull(errorMessage);
        kotlin.jvm.internal.Intrinsics.checkNotNull(errorType);
        kotlin.jvm.internal.Intrinsics.checkNotNull(exitStatus);
        kotlin.jvm.internal.Intrinsics.checkNotNull(institutionId);
        kotlin.jvm.internal.Intrinsics.checkNotNull(institutionName);
        kotlin.jvm.internal.Intrinsics.checkNotNull(institutionSearchQuery);
        kotlin.jvm.internal.Intrinsics.checkNotNull(issueId);
        kotlin.jvm.internal.Intrinsics.checkNotNull(linkSessionId);
        kotlin.jvm.internal.Intrinsics.checkNotNull(mfaType);
        kotlin.jvm.internal.Intrinsics.checkNotNull(requestId);
        kotlin.jvm.internal.Intrinsics.checkNotNull(timestamp);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewName);
        kotlin.jvm.internal.Intrinsics.checkNotNull(brandName);
        kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        com.plaid.link.event.LinkEventMetadata a2 = com.plaid.internal.C0700z2.a(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType, requestId, timestamp, viewName, brandName, selection, str);
        java.lang.String eventName = sDKEvent.getEventName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        return new com.plaid.link.event.LinkEvent(com.plaid.link.event.LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), a2);
    }
}
