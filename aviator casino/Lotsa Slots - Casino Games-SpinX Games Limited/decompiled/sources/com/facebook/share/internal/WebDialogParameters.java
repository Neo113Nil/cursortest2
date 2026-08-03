package com.facebook.share.internal;

/* compiled from: WebDialogParameters.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0013"}, d2 = {"Lcom/facebook/share/internal/WebDialogParameters;", "", "()V", "create", "Landroid/os/Bundle;", "appGroupCreationContent", "Lcom/facebook/share/model/AppGroupCreationContent;", "gameRequestContent", "Lcom/facebook/share/model/GameRequestContent;", "shareLinkContent", "Lcom/facebook/share/model/ShareLinkContent;", "sharePhotoContent", "Lcom/facebook/share/model/SharePhotoContent;", "createBaseParameters", "shareContent", "Lcom/facebook/share/model/ShareContent;", "createForFeed", "shareFeedContent", "Lcom/facebook/share/internal/ShareFeedContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WebDialogParameters {
    public static final com.facebook.share.internal.WebDialogParameters INSTANCE = new com.facebook.share.internal.WebDialogParameters();

    private WebDialogParameters() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle create(com.facebook.share.model.AppGroupCreationContent appGroupCreationContent) {
        java.lang.String appGroupPrivacy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appGroupCreationContent, "appGroupCreationContent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "name", appGroupCreationContent.getName());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "description", appGroupCreationContent.getDescription());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy2 = appGroupCreationContent.getAppGroupPrivacy();
        java.lang.String str = null;
        if (appGroupPrivacy2 != null && (appGroupPrivacy = appGroupPrivacy2.toString()) != null) {
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            str = appGroupPrivacy.toLowerCase(ENGLISH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY, str);
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle create(com.facebook.share.model.GameRequestContent gameRequestContent) {
        java.lang.String actionType;
        java.lang.String lowerCase;
        java.lang.String filters;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gameRequestContent, "gameRequestContent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "message", gameRequestContent.getMessage());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putCommaSeparatedStringList(bundle, "to", gameRequestContent.getRecipients());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "title", gameRequestContent.getTitle());
        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "data", gameRequestContent.getData());
        com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.GameRequestContent.ActionType actionType2 = gameRequestContent.getActionType();
        java.lang.String str = null;
        if (actionType2 == null || (actionType = actionType2.toString()) == null) {
            lowerCase = null;
        } else {
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = actionType.toLowerCase(ENGLISH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, lowerCase);
        com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "object_id", gameRequestContent.getObjectId());
        com.facebook.internal.Utility utility7 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.GameRequestContent.Filters filters2 = gameRequestContent.getFilters();
        if (filters2 != null && (filters = filters2.toString()) != null) {
            java.util.Locale ENGLISH2 = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            str = filters.toLowerCase(ENGLISH2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_FILTERS, str);
        com.facebook.internal.Utility utility8 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putCommaSeparatedStringList(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, gameRequestContent.getSuggestions());
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle create(com.facebook.share.model.ShareLinkContent shareLinkContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        android.os.Bundle createBaseParameters = createBaseParameters(shareLinkContent);
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putUri(createBaseParameters, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_HREF, shareLinkContent.getContentUrl());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(createBaseParameters, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        return createBaseParameters;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle create(com.facebook.share.model.SharePhotoContent sharePhotoContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharePhotoContent, "sharePhotoContent");
        android.os.Bundle createBaseParameters = createBaseParameters(sharePhotoContent);
        java.util.List<com.facebook.share.model.SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.facebook.share.model.SharePhoto> list = photos;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((com.facebook.share.model.SharePhoto) it.next()).getImageUrl()));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array != null) {
            createBaseParameters.putStringArray("media", (java.lang.String[]) array);
            return createBaseParameters;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle createBaseParameters(com.facebook.share.model.ShareContent<?, ?> shareContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareContent, "shareContent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.ShareHashtag shareHashtag = shareContent.getShareHashtag();
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle createForFeed(com.facebook.share.model.ShareLinkContent shareLinkContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareLinkContent, "shareLinkContent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "link", com.facebook.internal.Utility.getUriString(shareLinkContent.getContentUrl()));
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.share.model.ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag == null ? null : shareHashtag.getHashtag());
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle createForFeed(com.facebook.share.internal.ShareFeedContent shareFeedContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareFeedContent, "shareFeedContent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "to", shareFeedContent.getToId());
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "link", shareFeedContent.getLink());
        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "picture", shareFeedContent.getPicture());
        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "source", shareFeedContent.getMediaSource());
        com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "name", shareFeedContent.getLinkName());
        com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM, shareFeedContent.getLinkCaption());
        com.facebook.internal.Utility utility7 = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.putNonEmptyString(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }
}
