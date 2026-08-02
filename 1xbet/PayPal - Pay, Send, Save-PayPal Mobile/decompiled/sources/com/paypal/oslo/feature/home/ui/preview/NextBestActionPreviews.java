package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/NextBestActionPreviews;", "", "<init>", "()V", "", "id", "label", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "iconUrl", "actionLabel", "Lcom/paypal/oslo/feature/home/domain/model/NextBestAction;", "createActionItem$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/NextBestAction;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "createSampleActionItems$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NextBestActionPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews();

    private NextBestActionPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.NextBestAction createActionItem$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews nextBestActionPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "preview-action";
        }
        if ((i & 2) != 0) {
            str2 = "Preview Label";
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = "Preview Description";
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PreviewConstants.PREVIEW_LOGO_URL_PAYPAL;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = "Action";
        }
        return nextBestActionPreviews.createActionItem$home_prodRelease(str, str6, str7, str8, str5);
    }

    public final com.paypal.oslo.feature.home.domain.model.NextBestAction createActionItem$home_prodRelease(java.lang.String id, java.lang.String label, java.lang.String description, java.lang.String iconUrl, java.lang.String actionLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionLabel, "");
        return new com.paypal.oslo.feature.home.domain.model.NextBestAction(id, label, description, iconUrl, actionLabel, null, 32, null);
    }

    public static /* synthetic */ java.util.List createSampleActionItems$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews nextBestActionPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return nextBestActionPreviews.createSampleActionItems$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.NextBestAction> createSampleActionItems$home_prodRelease(int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < count; i++) {
            arrayList.add(createActionItem$home_prodRelease$default(INSTANCE, "action-".concat(java.lang.String.valueOf(i)), "Action ".concat(java.lang.String.valueOf(i)), "Description ".concat(java.lang.String.valueOf(i)), null, "Label", 8, null));
        }
        return arrayList;
    }
}
