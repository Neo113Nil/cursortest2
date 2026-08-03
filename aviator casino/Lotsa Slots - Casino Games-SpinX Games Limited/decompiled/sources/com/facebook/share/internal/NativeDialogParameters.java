package com.facebook.share.internal;

/* compiled from: NativeDialogParameters.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0007J \u0010 \u001a\u00020\u00042\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\""}, d2 = {"Lcom/facebook/share/internal/NativeDialogParameters;", "", "()V", "create", "Landroid/os/Bundle;", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "attachmentUrlsBundle", "dataErrorsFatal", "", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", "mediaInfos", "", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "imageUrls", "", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "mediaInfo", "stickerInfo", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "videoUrl", "callId", "Ljava/util/UUID;", "shareContent", "Lcom/facebook/share/model/ShareContent;", "shouldFailOnDataError", "createBaseParameters", "content", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeDialogParameters {
    public static final com.facebook.share.internal.NativeDialogParameters INSTANCE = new com.facebook.share.internal.NativeDialogParameters();

    private NativeDialogParameters() {
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
        if (shareContent instanceof com.facebook.share.model.ShareVideoContent) {
            com.facebook.share.internal.ShareInternalUtility shareInternalUtility2 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
            com.facebook.share.model.ShareVideoContent shareVideoContent = (com.facebook.share.model.ShareVideoContent) shareContent;
            return INSTANCE.create(shareVideoContent, com.facebook.share.internal.ShareInternalUtility.getVideoUrl(shareVideoContent, callId), shouldFailOnDataError);
        }
        if (shareContent instanceof com.facebook.share.model.ShareMediaContent) {
            com.facebook.share.internal.ShareInternalUtility shareInternalUtility3 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
            com.facebook.share.model.ShareMediaContent shareMediaContent = (com.facebook.share.model.ShareMediaContent) shareContent;
            java.util.List<android.os.Bundle> mediaInfos = com.facebook.share.internal.ShareInternalUtility.getMediaInfos(shareMediaContent, callId);
            if (mediaInfos == null) {
                mediaInfos = kotlin.collections.CollectionsKt.emptyList();
            }
            return INSTANCE.create(shareMediaContent, mediaInfos, shouldFailOnDataError);
        }
        if (shareContent instanceof com.facebook.share.model.ShareCameraEffectContent) {
            com.facebook.share.internal.ShareInternalUtility shareInternalUtility4 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
            com.facebook.share.model.ShareCameraEffectContent shareCameraEffectContent = (com.facebook.share.model.ShareCameraEffectContent) shareContent;
            return INSTANCE.create(shareCameraEffectContent, com.facebook.share.internal.ShareInternalUtility.getTextureUrlBundle(shareCameraEffectContent, callId), shouldFailOnDataError);
        }
        if (!(shareContent instanceof com.facebook.share.model.ShareStoryContent)) {
            return null;
        }
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility5 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        com.facebook.share.model.ShareStoryContent shareStoryContent = (com.facebook.share.model.ShareStoryContent) shareContent;
        android.os.Bundle backgroundAssetMediaInfo = com.facebook.share.internal.ShareInternalUtility.getBackgroundAssetMediaInfo(shareStoryContent, callId);
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility6 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        return INSTANCE.create(shareStoryContent, backgroundAssetMediaInfo, com.facebook.share.internal.ShareInternalUtility.getStickerUrl(shareStoryContent, callId), shouldFailOnDataError);
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareCameraEffectContent cameraEffectContent, android.os.Bundle attachmentUrlsBundle, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(cameraEffectContent, dataErrorsFatal);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.EFFECT_ID, cameraEffectContent.getEffectId());
        if (attachmentUrlsBundle != null) {
            createBaseParameters.putBundle(com.facebook.share.internal.ShareConstants.EFFECT_TEXTURES, attachmentUrlsBundle);
        }
        try {
            com.facebook.share.internal.CameraEffectJSONUtility cameraEffectJSONUtility = com.facebook.share.internal.CameraEffectJSONUtility.INSTANCE;
            org.json.JSONObject convertToJSON = com.facebook.share.internal.CameraEffectJSONUtility.convertToJSON(cameraEffectContent.getArguments());
            if (convertToJSON != null) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.EFFECT_ARGS, convertToJSON.toString());
            }
            return createBaseParameters;
        } catch (org.json.JSONException e) {
            throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Unable to create a JSON Object from the provided CameraEffectArguments: ", e.getMessage()));
        }
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareLinkContent linkContent, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(linkContent, dataErrorsFatal);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.QUOTE, linkContent.getQuote());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putUri(createBaseParameters, com.facebook.share.internal.ShareConstants.MESSENGER_URL, linkContent.getContentUrl());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putUri(createBaseParameters, com.facebook.share.internal.ShareConstants.TARGET_DISPLAY, linkContent.getContentUrl());
        return createBaseParameters;
    }

    private final android.os.Bundle create(com.facebook.share.model.SharePhotoContent photoContent, java.util.List<java.lang.String> imageUrls, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(photoContent, dataErrorsFatal);
        createBaseParameters.putStringArrayList(com.facebook.share.internal.ShareConstants.PHOTOS, new java.util.ArrayList<>(imageUrls));
        return createBaseParameters;
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareVideoContent videoContent, java.lang.String videoUrl, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(videoContent, dataErrorsFatal);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, "TITLE", videoContent.getContentTitle());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, "DESCRIPTION", videoContent.getContentDescription());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.VIDEO_URL, videoUrl);
        return createBaseParameters;
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareMediaContent mediaContent, java.util.List<android.os.Bundle> mediaInfos, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(mediaContent, dataErrorsFatal);
        createBaseParameters.putParcelableArrayList(com.facebook.share.internal.ShareConstants.MEDIA, new java.util.ArrayList<>(mediaInfos));
        return createBaseParameters;
    }

    private final android.os.Bundle create(com.facebook.share.model.ShareStoryContent storyContent, android.os.Bundle mediaInfo, android.os.Bundle stickerInfo, boolean dataErrorsFatal) {
        android.os.Bundle createBaseParameters = createBaseParameters(storyContent, dataErrorsFatal);
        if (mediaInfo != null) {
            createBaseParameters.putParcelable(com.facebook.share.internal.ShareConstants.STORY_BG_ASSET, mediaInfo);
        }
        if (stickerInfo != null) {
            createBaseParameters.putParcelable(com.facebook.share.internal.ShareConstants.STORY_INTERACTIVE_ASSET_URI, stickerInfo);
        }
        java.util.List<java.lang.String> backgroundColorList = storyContent.getBackgroundColorList();
        if (backgroundColorList != null && !backgroundColorList.isEmpty()) {
            createBaseParameters.putStringArrayList(com.facebook.share.internal.ShareConstants.STORY_INTERACTIVE_COLOR_LIST, new java.util.ArrayList<>(backgroundColorList));
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.STORY_DEEP_LINK_URL, storyContent.getAttributionLink());
        return createBaseParameters;
    }

    private final android.os.Bundle createBaseParameters(com.facebook.share.model.ShareContent<?, ?> content, boolean dataErrorsFatal) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putUri(bundle, com.facebook.share.internal.ShareConstants.CONTENT_URL, content.getContentUrl());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.PLACE_ID, content.getPlaceId());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.PAGE_ID, content.getPageId());
        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.REF, content.getRef());
        com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.REF, content.getRef());
        bundle.putBoolean(com.facebook.share.internal.ShareConstants.DATA_FAILURES_FATAL, dataErrorsFatal);
        java.util.List<java.lang.String> peopleIds = content.getPeopleIds();
        if (peopleIds != null && !peopleIds.isEmpty()) {
            bundle.putStringArrayList(com.facebook.share.internal.ShareConstants.PEOPLE_IDS, new java.util.ArrayList<>(peopleIds));
        }
        com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.ShareHashtag shareHashtag = content.getShareHashtag();
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.HASHTAG, shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }
}
