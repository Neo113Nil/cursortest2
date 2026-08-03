package com.facebook.share.internal;

/* compiled from: ShareContentValidation.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00045678B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0011\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0012\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0013\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0014\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u0004H\u0002J \u0010\u001b\u001a\u00020\t2\u000e\u0010\u001c\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020+H\u0002J\u001a\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001a\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u00102\u001a\u00020\t2\u0006\u00103\u001a\u0002042\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation;", "", "()V", "apiValidator", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "defaultValidator", "storyValidator", "webShareValidator", "validate", "", "content", "Lcom/facebook/share/model/ShareContent;", "validator", "validateCameraEffectContent", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "validateForApiShare", "validateForMessage", "validateForNativeShare", "validateForStoryShare", "validateForWebShare", "validateLinkContent", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "validateMediaContent", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", "validateMedium", "medium", "Lcom/facebook/share/model/ShareMedia;", "validatePhoto", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "validatePhotoContent", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "validatePhotoForApi", "validatePhotoForNativeDialog", "validatePhotoForWebDialog", "validateShareMessengerActionButton", "button", "Lcom/facebook/share/model/ShareMessengerActionButton;", "validateShareMessengerURLActionButton", "Lcom/facebook/share/model/ShareMessengerURLActionButton;", "validateStoryContent", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "validateVideo", "video", "Lcom/facebook/share/model/ShareVideo;", "validateVideoContent", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "ApiValidator", "StoryShareValidator", "Validator", "WebShareValidator", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareContentValidation {
    public static final com.facebook.share.internal.ShareContentValidation INSTANCE = new com.facebook.share.internal.ShareContentValidation();
    private static final com.facebook.share.internal.ShareContentValidation.Validator webShareValidator = new com.facebook.share.internal.ShareContentValidation.WebShareValidator();
    private static final com.facebook.share.internal.ShareContentValidation.Validator defaultValidator = new com.facebook.share.internal.ShareContentValidation.Validator();
    private static final com.facebook.share.internal.ShareContentValidation.Validator apiValidator = new com.facebook.share.internal.ShareContentValidation.ApiValidator();
    private static final com.facebook.share.internal.ShareContentValidation.Validator storyValidator = new com.facebook.share.internal.ShareContentValidation.StoryShareValidator();

    private ShareContentValidation() {
    }

    @kotlin.jvm.JvmStatic
    public static final void validateForMessage(com.facebook.share.model.ShareContent<?, ?> content) {
        INSTANCE.validate(content, defaultValidator);
    }

    @kotlin.jvm.JvmStatic
    public static final void validateForNativeShare(com.facebook.share.model.ShareContent<?, ?> content) {
        INSTANCE.validate(content, defaultValidator);
    }

    @kotlin.jvm.JvmStatic
    public static final void validateForWebShare(com.facebook.share.model.ShareContent<?, ?> content) {
        INSTANCE.validate(content, webShareValidator);
    }

    @kotlin.jvm.JvmStatic
    public static final void validateForApiShare(com.facebook.share.model.ShareContent<?, ?> content) {
        INSTANCE.validate(content, apiValidator);
    }

    @kotlin.jvm.JvmStatic
    public static final void validateForStoryShare(com.facebook.share.model.ShareContent<?, ?> content) {
        INSTANCE.validate(content, storyValidator);
    }

    private final void validate(com.facebook.share.model.ShareContent<?, ?> content, com.facebook.share.internal.ShareContentValidation.Validator validator) throws com.facebook.FacebookException {
        if (content == null) {
            throw new com.facebook.FacebookException("Must provide non-null content to share");
        }
        if (content instanceof com.facebook.share.model.ShareLinkContent) {
            validator.validate((com.facebook.share.model.ShareLinkContent) content);
            return;
        }
        if (content instanceof com.facebook.share.model.SharePhotoContent) {
            validator.validate((com.facebook.share.model.SharePhotoContent) content);
            return;
        }
        if (content instanceof com.facebook.share.model.ShareVideoContent) {
            validator.validate((com.facebook.share.model.ShareVideoContent) content);
            return;
        }
        if (content instanceof com.facebook.share.model.ShareMediaContent) {
            validator.validate((com.facebook.share.model.ShareMediaContent) content);
        } else if (content instanceof com.facebook.share.model.ShareCameraEffectContent) {
            validator.validate((com.facebook.share.model.ShareCameraEffectContent) content);
        } else if (content instanceof com.facebook.share.model.ShareStoryContent) {
            validator.validate((com.facebook.share.model.ShareStoryContent) content);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateStoryContent(com.facebook.share.model.ShareStoryContent storyContent, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        if (storyContent == null || (storyContent.getBackgroundAsset() == null && storyContent.getStickerAsset() == null)) {
            throw new com.facebook.FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (storyContent.getBackgroundAsset() != null) {
            validator.validate(storyContent.getBackgroundAsset());
        }
        if (storyContent.getStickerAsset() != null) {
            validator.validate(storyContent.getStickerAsset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateLinkContent(com.facebook.share.model.ShareLinkContent linkContent, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        android.net.Uri contentUrl = linkContent.getContentUrl();
        if (contentUrl != null) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isWebUri(contentUrl)) {
                throw new com.facebook.FacebookException("Content Url must be an http:// or https:// url");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoContent(com.facebook.share.model.SharePhotoContent photoContent, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        java.util.List<com.facebook.share.model.SharePhoto> photos = photoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new com.facebook.FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() > 6) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "Cannot add more than %d photos.", java.util.Arrays.copyOf(new java.lang.Object[]{6}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.FacebookException(format);
        }
        java.util.Iterator<com.facebook.share.model.SharePhoto> it = photos.iterator();
        while (it.hasNext()) {
            validator.validate(it.next());
        }
    }

    private final void validatePhoto(com.facebook.share.model.SharePhoto photo) {
        if (photo == null) {
            throw new com.facebook.FacebookException("Cannot share a null SharePhoto");
        }
        android.graphics.Bitmap bitmap = photo.getBitmap();
        android.net.Uri imageUrl = photo.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            throw new com.facebook.FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForApi(com.facebook.share.model.SharePhoto photo, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        validatePhoto(photo);
        android.graphics.Bitmap bitmap = photo.getBitmap();
        android.net.Uri imageUrl = photo.getImageUrl();
        if (bitmap == null) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isWebUri(imageUrl)) {
                throw new com.facebook.FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForNativeDialog(com.facebook.share.model.SharePhoto photo, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        validatePhotoForApi(photo, validator);
        if (photo.getBitmap() == null) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isWebUri(photo.getImageUrl())) {
                return;
            }
        }
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasContentProvider(com.facebook.FacebookSdk.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForWebDialog(com.facebook.share.model.SharePhoto photo, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        validatePhoto(photo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideoContent(com.facebook.share.model.ShareVideoContent videoContent, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        validator.validate(videoContent.getVideo());
        com.facebook.share.model.SharePhoto previewPhoto = videoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideo(com.facebook.share.model.ShareVideo video, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        if (video == null) {
            throw new com.facebook.FacebookException("Cannot share a null ShareVideo");
        }
        android.net.Uri localUrl = video.getLocalUrl();
        if (localUrl == null) {
            throw new com.facebook.FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isContentUri(localUrl)) {
            return;
        }
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isFileUri(localUrl)) {
            throw new com.facebook.FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateMediaContent(com.facebook.share.model.ShareMediaContent mediaContent, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        java.util.List<com.facebook.share.model.ShareMedia<?, ?>> media = mediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new com.facebook.FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() > 6) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "Cannot add more than %d media.", java.util.Arrays.copyOf(new java.lang.Object[]{6}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.FacebookException(format);
        }
        java.util.Iterator<com.facebook.share.model.ShareMedia<?, ?>> it = media.iterator();
        while (it.hasNext()) {
            validator.validate(it.next());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void validateMedium(com.facebook.share.model.ShareMedia<?, ?> medium, com.facebook.share.internal.ShareContentValidation.Validator validator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(medium, "medium");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator, "validator");
        if (medium instanceof com.facebook.share.model.SharePhoto) {
            validator.validate((com.facebook.share.model.SharePhoto) medium);
        } else {
            if (medium instanceof com.facebook.share.model.ShareVideo) {
                validator.validate((com.facebook.share.model.ShareVideo) medium);
                return;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "Invalid media type: %s", java.util.Arrays.copyOf(new java.lang.Object[]{medium.getClass().getSimpleName()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.FacebookException(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCameraEffectContent(com.facebook.share.model.ShareCameraEffectContent cameraEffectContent) {
        java.lang.String effectId = cameraEffectContent.getEffectId();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(effectId)) {
            throw new com.facebook.FacebookException("Must specify a non-empty effectId");
        }
    }

    private final void validateShareMessengerActionButton(com.facebook.share.model.ShareMessengerActionButton button) {
        if (button == null) {
            return;
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(button.getTitle())) {
            throw new com.facebook.FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if (button instanceof com.facebook.share.model.ShareMessengerURLActionButton) {
            validateShareMessengerURLActionButton((com.facebook.share.model.ShareMessengerURLActionButton) button);
        }
    }

    private final void validateShareMessengerURLActionButton(com.facebook.share.model.ShareMessengerURLActionButton button) {
        if (button.getUrl() == null) {
            throw new com.facebook.FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$StoryShareValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class StoryShareValidator extends com.facebook.share.internal.ShareContentValidation.Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareStoryContent storyContent) {
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateStoryContent(storyContent, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$WebShareValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class WebShareValidator extends com.facebook.share.internal.ShareContentValidation.Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareVideoContent videoContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            throw new com.facebook.FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareMediaContent mediaContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new com.facebook.FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.SharePhoto photo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "photo");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validatePhotoForWebDialog(photo, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$ApiValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class ApiValidator extends com.facebook.share.internal.ShareContentValidation.Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.SharePhoto photo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "photo");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validatePhotoForApi(photo, this);
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareVideoContent videoContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(videoContent.getPlaceId())) {
                throw new com.facebook.FacebookException("Cannot share video content with place IDs using the share api");
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(videoContent.getPeopleIds())) {
                throw new com.facebook.FacebookException("Cannot share video content with people IDs using the share api");
            }
            com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(videoContent.getRef())) {
                throw new com.facebook.FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareMediaContent mediaContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new com.facebook.FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(com.facebook.share.model.ShareLinkContent linkContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(linkContent.getQuote())) {
                throw new com.facebook.FacebookException("Cannot share link content with quote using the share api");
            }
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$Validator;", "", "()V", "validate", "", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "medium", "Lcom/facebook/share/model/ShareMedia;", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "video", "Lcom/facebook/share/model/ShareVideo;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class Validator {
        public void validate(com.facebook.share.model.ShareLinkContent linkContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateLinkContent(linkContent, this);
        }

        public void validate(com.facebook.share.model.SharePhotoContent photoContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoContent, "photoContent");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validatePhotoContent(photoContent, this);
        }

        public void validate(com.facebook.share.model.ShareVideoContent videoContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateVideoContent(videoContent, this);
        }

        public void validate(com.facebook.share.model.ShareMediaContent mediaContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateMediaContent(mediaContent, this);
        }

        public void validate(com.facebook.share.model.ShareCameraEffectContent cameraEffectContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraEffectContent, "cameraEffectContent");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateCameraEffectContent(cameraEffectContent);
        }

        public void validate(com.facebook.share.model.SharePhoto photo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "photo");
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validatePhotoForNativeDialog(photo, this);
        }

        public void validate(com.facebook.share.model.ShareVideo video) {
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateVideo(video, this);
        }

        public void validate(com.facebook.share.model.ShareMedia<?, ?> medium) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(medium, "medium");
            com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
            com.facebook.share.internal.ShareContentValidation.validateMedium(medium, this);
        }

        public void validate(com.facebook.share.model.ShareStoryContent storyContent) {
            com.facebook.share.internal.ShareContentValidation.INSTANCE.validateStoryContent(storyContent, this);
        }
    }
}
