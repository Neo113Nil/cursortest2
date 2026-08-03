package com.facebook.login.widget;

/* compiled from: ProfilePictureView.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 T2\u00020\u0001:\u0002TUB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0011H\u0003J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u000206H\u0003J\b\u00107\u001a\u00020\u0011H\u0002J\b\u00108\u001a\u000206H\u0014J0\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0014J\u0018\u0010?\u001a\u0002062\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tH\u0014J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020DH\u0014J\b\u0010E\u001a\u00020DH\u0014J\u0010\u0010F\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0012\u0010G\u001a\u0002062\b\u0010H\u001a\u0004\u0018\u00010IH\u0003J\u0010\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020\u0011H\u0003J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020\u0011H\u0003J\b\u0010N\u001a\u000206H\u0003J\u0010\u0010O\u001a\u0002062\b\u0010P\u001a\u0004\u0018\u00010\fJ\u0012\u0010Q\u001a\u0002062\b\u0010R\u001a\u0004\u0018\u00010\fH\u0003J\b\u0010S\u001a\u00020\u0011H\u0003R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0010\u001a\u0004\u0018\u00010#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010-\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006V"}, d2 = {"Lcom/facebook/login/widget/ProfilePictureView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "customizedDefaultProfilePicture", "Landroid/graphics/Bitmap;", "image", "Landroid/widget/ImageView;", "imageContents", "value", "", "isCropped", "()Z", "setCropped", "(Z)V", "lastRequest", "Lcom/facebook/internal/ImageRequest;", "onErrorListener", "Lcom/facebook/login/widget/ProfilePictureView$OnErrorListener;", "getOnErrorListener", "()Lcom/facebook/login/widget/ProfilePictureView$OnErrorListener;", "setOnErrorListener", "(Lcom/facebook/login/widget/ProfilePictureView$OnErrorListener;)V", "presetSize", "getPresetSize", "()I", "setPresetSize", "(I)V", "", "profileId", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "profileTracker", "Lcom/facebook/ProfileTracker;", "queryHeight", "queryWidth", "shouldUpdateOnProfileChange", "getShouldUpdateOnProfileChange", "setShouldUpdateOnProfileChange", "getPresetSizeInPixels", "forcePreset", "getProfilePictureUri", "Landroid/net/Uri;", "accessToken", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "isUnspecifiedDimensions", "onDetachedFromWindow", "onLayout", "changed", "left", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "parseAttributes", "processResponse", com.ironsource.Ve.n, "Lcom/facebook/internal/ImageResponse;", "refreshImage", "force", "sendImageRequest", "allowCachedResponse", "setBlankProfilePicture", "setDefaultProfilePicture", "inputBitmap", "setImageBitmap", "imageBitmap", "updateImageQueryParameters", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "OnErrorListener", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfilePictureView extends android.widget.FrameLayout {
    private static final java.lang.String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
    private static final java.lang.String BITMAP_KEY = "ProfilePictureView_bitmap";
    private static final java.lang.String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
    public static final int CUSTOM = -1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.widget.ProfilePictureView.Companion INSTANCE = new com.facebook.login.widget.ProfilePictureView.Companion(null);
    private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
    private static final java.lang.String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
    public static final int LARGE = -4;
    private static final int MIN_SIZE = 1;
    public static final int NORMAL = -3;
    private static final java.lang.String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
    private static final java.lang.String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
    private static final java.lang.String PROFILE_ID_KEY = "ProfilePictureView_profileId";
    public static final int SMALL = -2;
    private static final java.lang.String SUPER_STATE_KEY = "ProfilePictureView_superState";
    private static final java.lang.String TAG;
    private android.graphics.Bitmap customizedDefaultProfilePicture;
    private final android.widget.ImageView image;
    private android.graphics.Bitmap imageContents;
    private boolean isCropped;
    private com.facebook.internal.ImageRequest lastRequest;
    private com.facebook.login.widget.ProfilePictureView.OnErrorListener onErrorListener;
    private int presetSize;
    private java.lang.String profileId;
    private com.facebook.ProfileTracker profileTracker;
    private int queryHeight;
    private int queryWidth;

    /* compiled from: ProfilePictureView.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/widget/ProfilePictureView$OnErrorListener;", "", "onError", "", "error", "Lcom/facebook/FacebookException;", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnErrorListener {
        void onError(com.facebook.FacebookException error);
    }

    public final java.lang.String getProfileId() {
        return this.profileId;
    }

    public final void setProfileId(java.lang.String str) {
        java.lang.String str2 = this.profileId;
        boolean z = true;
        if (str2 == null || str2.length() == 0 || !kotlin.text.StringsKt.equals(this.profileId, str, true)) {
            setBlankProfilePicture();
        } else {
            z = false;
        }
        this.profileId = str;
        refreshImage(z);
    }

    /* renamed from: isCropped, reason: from getter */
    public final boolean getIsCropped() {
        return this.isCropped;
    }

    public final void setCropped(boolean z) {
        this.isCropped = z;
        refreshImage(false);
    }

    public final com.facebook.login.widget.ProfilePictureView.OnErrorListener getOnErrorListener() {
        return this.onErrorListener;
    }

    public final void setOnErrorListener(com.facebook.login.widget.ProfilePictureView.OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }

    public final int getPresetSize() {
        return this.presetSize;
    }

    public final void setPresetSize(int i) {
        if (i == -4 || i == -3 || i == -2 || i == -1) {
            this.presetSize = i;
            requestLayout();
            return;
        }
        throw new java.lang.IllegalArgumentException("Must use a predefined preset size");
    }

    public final boolean getShouldUpdateOnProfileChange() {
        com.facebook.ProfileTracker profileTracker = this.profileTracker;
        if (profileTracker == null) {
            return false;
        }
        return profileTracker.getIsTracking();
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        if (z) {
            com.facebook.ProfileTracker profileTracker = this.profileTracker;
            if (profileTracker == null) {
                return;
            }
            profileTracker.startTracking();
            return;
        }
        com.facebook.ProfileTracker profileTracker2 = this.profileTracker;
        if (profileTracker2 == null) {
            return;
        }
        profileTracker2.stopTracking();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.image = new android.widget.ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.image = new android.widget.ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
        parseAttributes(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(android.content.Context context, android.util.AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.image = new android.widget.ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
        parseAttributes(attrs);
    }

    private final void initialize() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            removeAllViews();
            this.image.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.image.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            addView(this.image);
            this.profileTracker = new com.facebook.ProfileTracker() { // from class: com.facebook.login.widget.ProfilePictureView$initialize$1
                @Override // com.facebook.ProfileTracker
                protected void onCurrentProfileChanged(com.facebook.Profile oldProfile, com.facebook.Profile currentProfile) {
                    com.facebook.login.widget.ProfilePictureView.this.setProfileId(currentProfile == null ? null : currentProfile.getId());
                    com.facebook.login.widget.ProfilePictureView.this.refreshImage(true);
                }
            };
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDefaultProfilePicture(android.graphics.Bitmap inputBitmap) {
        this.customizedDefaultProfilePicture = inputBitmap;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        boolean z2 = true;
        if (android.view.View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = getPresetSizeInPixels(true);
            heightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (android.view.View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = getPresetSizeInPixels(true);
            widthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        refreshImage(false);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, onSaveInstanceState);
        bundle.putString(PROFILE_ID_KEY, this.profileId);
        bundle.putInt(PRESET_SIZE_KEY, this.presetSize);
        bundle.putBoolean(IS_CROPPED_KEY, this.isCropped);
        bundle.putInt(BITMAP_WIDTH_KEY, this.queryWidth);
        bundle.putInt(BITMAP_HEIGHT_KEY, this.queryHeight);
        bundle.putBoolean(PENDING_REFRESH_KEY, this.lastRequest != null);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state.getClass(), android.os.Bundle.class)) {
            super.onRestoreInstanceState(state);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) state;
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE_KEY));
        setProfileId(bundle.getString(PROFILE_ID_KEY));
        setPresetSize(bundle.getInt(PRESET_SIZE_KEY));
        setCropped(bundle.getBoolean(IS_CROPPED_KEY));
        this.queryWidth = bundle.getInt(BITMAP_WIDTH_KEY);
        this.queryHeight = bundle.getInt(BITMAP_HEIGHT_KEY);
        refreshImage(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    private final void parseAttributes(android.util.AttributeSet attrs) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, com.facebook.login.R.styleable.com_facebook_profile_picture_view);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.com_facebook_profile_picture_view)");
            setPresetSize(obtainStyledAttributes.getInt(com.facebook.login.R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            setCropped(obtainStyledAttributes.getBoolean(com.facebook.login.R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true));
            obtainStyledAttributes.recycle();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshImage(boolean force) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean updateImageQueryParameters = updateImageQueryParameters();
            java.lang.String str = this.profileId;
            if (str != null && str.length() != 0 && !isUnspecifiedDimensions()) {
                if (updateImageQueryParameters || force) {
                    sendImageRequest(true);
                    return;
                }
                return;
            }
            setBlankProfilePicture();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isUnspecifiedDimensions() {
        return this.queryWidth == 0 && this.queryHeight == 0;
    }

    private final void setBlankProfilePicture() {
        int i;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                com.facebook.internal.ImageDownloader imageDownloader = com.facebook.internal.ImageDownloader.INSTANCE;
                com.facebook.internal.ImageDownloader.cancelRequest(imageRequest);
            }
            android.graphics.Bitmap bitmap = this.customizedDefaultProfilePicture;
            if (bitmap == null) {
                if (this.isCropped) {
                    i = com.facebook.login.R.drawable.com_facebook_profile_picture_blank_square;
                } else {
                    i = com.facebook.login.R.drawable.com_facebook_profile_picture_blank_portrait;
                }
                setImageBitmap(android.graphics.BitmapFactory.decodeResource(getResources(), i));
                return;
            }
            updateImageQueryParameters();
            setImageBitmap(android.graphics.Bitmap.createScaledBitmap(bitmap, this.queryWidth, this.queryHeight, false));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void setImageBitmap(android.graphics.Bitmap imageBitmap) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || imageBitmap == null) {
            return;
        }
        try {
            this.imageContents = imageBitmap;
            this.image.setImageBitmap(imageBitmap);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void sendImageRequest(boolean allowCachedResponse) {
        com.facebook.AccessToken currentAccessToken;
        java.lang.String token;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.String str = "";
            if (com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive() && (currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken()) != null && (token = currentAccessToken.getToken()) != null) {
                str = token;
            }
            android.net.Uri profilePictureUri = getProfilePictureUri(str);
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
            com.facebook.internal.ImageRequest build = new com.facebook.internal.ImageRequest.Builder(context, profilePictureUri).setAllowCachedRedirects(allowCachedResponse).setCallerTag(this).setCallback(new com.facebook.internal.ImageRequest.Callback() { // from class: com.facebook.login.widget.ProfilePictureView$$ExternalSyntheticLambda0
                @Override // com.facebook.internal.ImageRequest.Callback
                public final void onCompleted(com.facebook.internal.ImageResponse imageResponse) {
                    com.facebook.login.widget.ProfilePictureView.m5252sendImageRequest$lambda2(com.facebook.login.widget.ProfilePictureView.this, imageResponse);
                }
            }).build();
            com.facebook.internal.ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                com.facebook.internal.ImageDownloader imageDownloader = com.facebook.internal.ImageDownloader.INSTANCE;
                com.facebook.internal.ImageDownloader.cancelRequest(imageRequest);
            }
            this.lastRequest = build;
            com.facebook.internal.ImageDownloader imageDownloader2 = com.facebook.internal.ImageDownloader.INSTANCE;
            com.facebook.internal.ImageDownloader.downloadAsync(build);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendImageRequest$lambda-2, reason: not valid java name */
    public static final void m5252sendImageRequest$lambda2(com.facebook.login.widget.ProfilePictureView this$0, com.facebook.internal.ImageResponse imageResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.processResponse(imageResponse);
    }

    private final android.net.Uri getProfilePictureUri(java.lang.String accessToken) {
        com.facebook.Profile currentProfile = com.facebook.Profile.INSTANCE.getCurrentProfile();
        if (currentProfile != null && com.facebook.AccessToken.INSTANCE.isLoggedInWithInstagram()) {
            return currentProfile.getProfilePictureUri(this.queryWidth, this.queryHeight);
        }
        return com.facebook.internal.ImageRequest.INSTANCE.getProfilePictureUri(this.profileId, this.queryWidth, this.queryHeight, accessToken);
    }

    private final void processResponse(com.facebook.internal.ImageResponse response) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || response == null) {
            return;
        }
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(response.getRequest(), this.lastRequest)) {
                this.lastRequest = null;
                android.graphics.Bitmap bitmap = response.getBitmap();
                java.lang.Exception error = response.getError();
                if (error != null) {
                    com.facebook.login.widget.ProfilePictureView.OnErrorListener onErrorListener = this.onErrorListener;
                    if (onErrorListener != null) {
                        onErrorListener.onError(new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Error in downloading profile picture for profileId: ", this.profileId), error));
                        return;
                    } else {
                        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.REQUESTS, 6, TAG, error.toString());
                        return;
                    }
                }
                if (bitmap == null) {
                    return;
                }
                setImageBitmap(bitmap);
                if (response.getIsCachedRedirect()) {
                    sendImageRequest(false);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean updateImageQueryParameters() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1 && height >= 1) {
                int presetSizeInPixels = getPresetSizeInPixels(false);
                if (presetSizeInPixels != 0) {
                    height = presetSizeInPixels;
                    width = height;
                }
                if (width <= height) {
                    height = this.isCropped ? width : 0;
                } else {
                    width = this.isCropped ? height : 0;
                }
                if (width == this.queryWidth && height == this.queryHeight) {
                    z = false;
                }
                this.queryWidth = width;
                this.queryHeight = height;
                return z;
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final int getPresetSizeInPixels(boolean forcePreset) {
        int i;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            int i2 = this.presetSize;
            if (i2 == -1 && !forcePreset) {
                return 0;
            }
            if (i2 == -4) {
                i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i2 == -3) {
                i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_normal;
            } else if (i2 == -2) {
                i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i2 != -1) {
                    return 0;
                }
                i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* compiled from: ProfilePictureView.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/login/widget/ProfilePictureView$Companion;", "", "()V", "BITMAP_HEIGHT_KEY", "", "BITMAP_KEY", "BITMAP_WIDTH_KEY", com.ironsource.mediationsdk.j.f, "", "IS_CROPPED_DEFAULT_VALUE", "", "IS_CROPPED_KEY", com.ironsource.mediationsdk.j.b, "MIN_SIZE", "NORMAL", "PENDING_REFRESH_KEY", "PRESET_SIZE_KEY", "PROFILE_ID_KEY", "SMALL", "SUPER_STATE_KEY", "TAG", "getTAG", "()Ljava/lang/String;", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getTAG() {
            return com.facebook.login.widget.ProfilePictureView.TAG;
        }
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ProfilePictureView", "ProfilePictureView::class.java.simpleName");
        TAG = "ProfilePictureView";
    }
}
