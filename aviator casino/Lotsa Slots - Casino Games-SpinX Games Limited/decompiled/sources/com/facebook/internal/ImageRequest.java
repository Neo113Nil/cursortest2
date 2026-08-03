package com.facebook.internal;

/* compiled from: ImageRequest.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/facebook/internal/ImageRequest;", "", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "callback", "Lcom/facebook/internal/ImageRequest$Callback;", "allowCachedRedirects", "", "callerTag", "(Landroid/content/Context;Landroid/net/Uri;Lcom/facebook/internal/ImageRequest$Callback;ZLjava/lang/Object;)V", "getAllowCachedRedirects", "()Z", "getCallback", "()Lcom/facebook/internal/ImageRequest$Callback;", "getCallerTag", "()Ljava/lang/Object;", "getContext", "()Landroid/content/Context;", "getImageUri", "()Landroid/net/Uri;", "isCachedRedirectAllowed", "Builder", "Callback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageRequest {
    private static final java.lang.String ACCESS_TOKEN_PARAM = "access_token";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.ImageRequest.Companion INSTANCE = new com.facebook.internal.ImageRequest.Companion(null);
    private static final java.lang.String HEIGHT_PARAM = "height";
    private static final java.lang.String MIGRATION_PARAM = "migration_overrides";
    private static final java.lang.String MIGRATION_VALUE = "{october_2012:true}";
    private static final java.lang.String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final java.lang.String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;
    private final com.facebook.internal.ImageRequest.Callback callback;
    private final java.lang.Object callerTag;
    private final android.content.Context context;
    private final android.net.Uri imageUri;

    /* compiled from: ImageRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/ImageRequest$Callback;", "", "onCompleted", "", com.ironsource.Ve.n, "Lcom/facebook/internal/ImageResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onCompleted(com.facebook.internal.ImageResponse response);
    }

    public /* synthetic */ ImageRequest(android.content.Context context, android.net.Uri uri, com.facebook.internal.ImageRequest.Callback callback, boolean z, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, callback, z, obj);
    }

    @kotlin.jvm.JvmStatic
    public static final android.net.Uri getProfilePictureUri(java.lang.String str, int i, int i2) {
        return INSTANCE.getProfilePictureUri(str, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final android.net.Uri getProfilePictureUri(java.lang.String str, int i, int i2, java.lang.String str2) {
        return INSTANCE.getProfilePictureUri(str, i, i2, str2);
    }

    private ImageRequest(android.content.Context context, android.net.Uri uri, com.facebook.internal.ImageRequest.Callback callback, boolean z, java.lang.Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = callback;
        this.allowCachedRedirects = z;
        this.callerTag = obj;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final android.net.Uri getImageUri() {
        return this.imageUri;
    }

    public final com.facebook.internal.ImageRequest.Callback getCallback() {
        return this.callback;
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    public final java.lang.Object getCallerTag() {
        return this.callerTag;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }

    /* compiled from: ImageRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0007J,\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/ImageRequest$Companion;", "", "()V", "ACCESS_TOKEN_PARAM", "", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "UNSPECIFIED_DIMENSION", "", "WIDTH_PARAM", "getProfilePictureUri", "Landroid/net/Uri;", "userId", "width", "height", "accessToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.net.Uri getProfilePictureUri(java.lang.String userId, int width, int height) {
            return getProfilePictureUri(userId, width, height, "");
        }

        @kotlin.jvm.JvmStatic
        public final android.net.Uri getProfilePictureUri(java.lang.String userId, int width, int height, java.lang.String accessToken) {
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.notNullOrEmpty(userId, "userId");
            int max = java.lang.Math.max(width, 0);
            int max2 = java.lang.Math.max(height, 0);
            if (!((max == 0 && max2 == 0) ? false : true)) {
                throw new java.lang.IllegalArgumentException("Either width or height must be greater than 0".toString());
            }
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            android.net.Uri.Builder buildUpon = android.net.Uri.parse(com.facebook.internal.ServerProtocol.getGraphUrlBase()).buildUpon();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.util.Locale locale = java.util.Locale.US;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String format = java.lang.String.format(locale, com.facebook.internal.ImageRequest.PATH, java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getGraphApiVersion(), userId}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            android.net.Uri.Builder path = buildUpon.path(format);
            if (max2 != 0) {
                path.appendQueryParameter("height", java.lang.String.valueOf(max2));
            }
            if (max != 0) {
                path.appendQueryParameter("width", java.lang.String.valueOf(max));
            }
            path.appendQueryParameter(com.facebook.internal.ImageRequest.MIGRATION_PARAM, com.facebook.internal.ImageRequest.MIGRATION_VALUE);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(accessToken)) {
                path.appendQueryParameter("access_token", accessToken);
            } else {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                if (!com.facebook.internal.Utility.isNullOrEmpty(com.facebook.FacebookSdk.getClientToken())) {
                    com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(com.facebook.FacebookSdk.getApplicationId())) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        com.facebook.FacebookSdk facebookSdk4 = com.facebook.FacebookSdk.INSTANCE;
                        sb.append(com.facebook.FacebookSdk.getApplicationId());
                        sb.append('|');
                        com.facebook.FacebookSdk facebookSdk5 = com.facebook.FacebookSdk.INSTANCE;
                        sb.append(com.facebook.FacebookSdk.getClientToken());
                        path.appendQueryParameter("access_token", sb.toString());
                    }
                }
                android.util.Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            }
            android.net.Uri build = path.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            return build;
        }
    }

    /* compiled from: ImageRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/internal/ImageRequest$Builder;", "", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", "allowCachedRedirects", "", "callback", "Lcom/facebook/internal/ImageRequest$Callback;", "callerTag", "build", "Lcom/facebook/internal/ImageRequest;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "setAllowCachedRedirects", "setCallback", "setCallerTag", "toString", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Builder {
        private boolean allowCachedRedirects;
        private com.facebook.internal.ImageRequest.Callback callback;
        private java.lang.Object callerTag;
        private final android.content.Context context;
        private final android.net.Uri imageUri;

        /* renamed from: component1, reason: from getter */
        private final android.content.Context getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        private final android.net.Uri getImageUri() {
            return this.imageUri;
        }

        public static /* synthetic */ com.facebook.internal.ImageRequest.Builder copy$default(com.facebook.internal.ImageRequest.Builder builder, android.content.Context context, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = builder.context;
            }
            if ((i & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context, uri);
        }

        public final com.facebook.internal.ImageRequest.Builder copy(android.content.Context context, android.net.Uri imageUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            return new com.facebook.internal.ImageRequest.Builder(context, imageUri);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.facebook.internal.ImageRequest.Builder)) {
                return false;
            }
            com.facebook.internal.ImageRequest.Builder builder = (com.facebook.internal.ImageRequest.Builder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.context, builder.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUri, builder.imageUri);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        public java.lang.String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }

        public Builder(android.content.Context context, android.net.Uri imageUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            this.context = context;
            this.imageUri = imageUri;
        }

        public final com.facebook.internal.ImageRequest.Builder setCallback(com.facebook.internal.ImageRequest.Callback callback) {
            this.callback = callback;
            return this;
        }

        public final com.facebook.internal.ImageRequest.Builder setCallerTag(java.lang.Object callerTag) {
            this.callerTag = callerTag;
            return this;
        }

        public final com.facebook.internal.ImageRequest.Builder setAllowCachedRedirects(boolean allowCachedRedirects) {
            this.allowCachedRedirects = allowCachedRedirects;
            return this;
        }

        public final com.facebook.internal.ImageRequest build() {
            android.content.Context context = this.context;
            android.net.Uri uri = this.imageUri;
            com.facebook.internal.ImageRequest.Callback callback = this.callback;
            boolean z = this.allowCachedRedirects;
            java.lang.Object obj = this.callerTag;
            if (obj == null) {
                obj = new java.lang.Object();
            } else if (obj == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            return new com.facebook.internal.ImageRequest(context, uri, callback, z, obj, null);
        }
    }
}
