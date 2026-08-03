package com.facebook.share.internal;

/* compiled from: LegacyNativeDialogParameters.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0007J \u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/internal/LegacyNativeDialogParameters;", "", "()V", "create", "Landroid/os/Bundle;", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "dataErrorsFatal", "", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "imageUrls", "", "", "callId", "Ljava/util/UUID;", "shareContent", "Lcom/facebook/share/model/ShareContent;", "shouldFailOnDataError", "createBaseParameters", "content", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyNativeDialogParameters {
    public static final com.facebook.share.internal.LegacyNativeDialogParameters INSTANCE = new com.facebook.share.internal.LegacyNativeDialogParameters();

    private LegacyNativeDialogParameters() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle create(java.util.UUID callId, com.facebook.share.model.ShareContent<?, ?> shareContent, boolean shouldFailOnDataError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        if (shareContent instanceof com.facebook.share.model.ShareLinkContent) {
            return INSTANCE.create((com.facebook.share.model.ShareLinkContent) shareContent, shouldFailOnDataError);
        }
        if (shareContent instanceof com.facebook.share.model.SharePhotoContent) {
            com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
            com.facebook.share.model.SharePhotoContent sharePhotoContent = (com.facebook.share.model.SharePhotoContent) shareContent;
            java.util.List<java.lang.String> photoUrls = com.facebook.share.internal.ShareInternalUtility.getPhotoUrls(sharePhotoContent, callId);
            if (photoUrls == null) {
                photoUrls = kotlin.collections.CollectionsKt.emptyList();
            }
            return INSTANCE.create(sharePhotoContent, photoUrls, shouldFailOnDataError);
        }
        boolean z = shareContent instanceof com.facebook.share.model.ShareVideoContent;
        return null;
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareLinkContent linkContent, boolean dataErrorsFatal) {
        return createBaseParameters(linkContent, dataErrorsFatal);
    }

    private final android.os.Bundle create(com.facebook.share.model.SharePhotoContent photoContent, java.util.List<java.lang.String> imageUrls, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(photoContent, dataErrorsFatal);
        createBaseParameters.putStringArrayList(com.facebook.share.internal.ShareConstants.LEGACY_PHOTOS, new java.util.ArrayList<>(imageUrls));
        return createBaseParameters;
    }

    private final android.os.Bundle createBaseParameters(com.facebook.share.model.ShareContent<?, ?> content, boolean dataErrorsFatal) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putUri(bundle, com.facebook.share.internal.ShareConstants.LEGACY_LINK, content.getContentUrl());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.LEGACY_PLACE_TAG, content.getPlaceId());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.LEGACY_REF, content.getRef());
        bundle.putBoolean(com.facebook.share.internal.ShareConstants.LEGACY_DATA_FAILURES_FATAL, dataErrorsFatal);
        java.util.List<java.lang.String> peopleIds = content.getPeopleIds();
        if (peopleIds != null && !peopleIds.isEmpty()) {
            bundle.putStringArrayList(com.facebook.share.internal.ShareConstants.LEGACY_FRIEND_TAGS, new java.util.ArrayList<>(peopleIds));
        }
        return bundle;
    }
}
