package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;", "error", "", "handleDocUploadError", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadError;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadViewComponentAttacherKt {
    public static final void handleDocUploadError(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError docUploadError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadError, "");
        if ((docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Cancelled) || (docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.NoDocumentTypeIDSelected) || (docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.PermissionDenied)) {
            return;
        }
        if (docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.UploadFailed) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Document upload error occurred", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "UploadFailed")), null, 4, null);
        } else {
            if (!(docUploadError instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Document upload error occurred", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "Unknown")), null, new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.UnknownDocUploadException(((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadError.Unknown) docUploadError).getMessage()), 4, null);
        }
    }
}
