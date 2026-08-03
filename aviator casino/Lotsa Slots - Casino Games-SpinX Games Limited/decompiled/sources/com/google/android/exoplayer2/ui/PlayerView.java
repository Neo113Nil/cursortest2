package com.google.android.exoplayer2.ui;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public class PlayerView extends android.widget.FrameLayout implements com.google.android.exoplayer2.ui.AdViewProvider {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final android.widget.FrameLayout adOverlayFrameLayout;
    private final android.widget.ImageView artworkView;
    private final android.view.View bufferingView;
    private final com.google.android.exoplayer2.ui.PlayerView.ComponentListener componentListener;
    private final com.google.android.exoplayer2.ui.AspectRatioFrameLayout contentFrame;
    private final com.google.android.exoplayer2.ui.PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener controllerVisibilityListener;
    private java.lang.CharSequence customErrorMessage;
    private android.graphics.drawable.Drawable defaultArtwork;
    private com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> errorMessageProvider;
    private final android.widget.TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    private final android.widget.FrameLayout overlayFrameLayout;
    private com.google.android.exoplayer2.Player player;
    private int showBuffering;
    private final android.view.View shutterView;
    private final com.google.android.exoplayer2.ui.SubtitleView subtitleView;
    private final android.view.View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public PlayerView(android.content.Context context) {
        this(context, null);
    }

    public PlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        com.google.android.exoplayer2.ui.PlayerView.ComponentListener componentListener = new com.google.android.exoplayer2.ui.PlayerView.ComponentListener();
        this.componentListener = componentListener;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
                configureEditModeLogoV23(getResources(), imageView);
            } else {
                configureEditModeLogo(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = com.google.android.exoplayer2.ui.R.layout.exo_player_view;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.exoplayer2.ui.R.styleable.PlayerView, i, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(com.google.android.exoplayer2.ui.R.styleable.PlayerView_shutter_background_color);
                int color = obtainStyledAttributes.getColor(com.google.android.exoplayer2.ui.R.styleable.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(com.google.android.exoplayer2.ui.R.styleable.PlayerView_player_layout_id, i8);
                boolean z9 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(com.google.android.exoplayer2.ui.R.styleable.PlayerView_default_artwork, 0);
                boolean z10 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_use_controller, true);
                int i9 = obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerView_surface_type, 1);
                int i10 = obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerView_resize_mode, 0);
                int i11 = obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerView_show_timeout, 5000);
                boolean z11 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_hide_on_touch, true);
                boolean z12 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_auto_show, true);
                i4 = obtainStyledAttributes.getInteger(com.google.android.exoplayer2.ui.R.styleable.PlayerView_show_buffering, 0);
                this.keepContentOnPlayerReset = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z13 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z3 = z11;
                z = z12;
                i3 = i10;
                z6 = z10;
                i7 = resourceId2;
                z5 = z9;
                i6 = color;
                z4 = hasValue;
                i5 = i9;
                i8 = resourceId;
                i2 = i11;
                z2 = z13;
            } catch (java.lang.Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            i4 = 0;
            z2 = true;
            z3 = true;
            i5 = 1;
            z4 = false;
            i6 = 0;
            z5 = true;
            i7 = 0;
            z6 = true;
        }
        android.view.LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        com.google.android.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) findViewById(com.google.android.exoplayer2.ui.R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i3);
        }
        android.view.View findViewById = findViewById(com.google.android.exoplayer2.ui.R.id.exo_shutter);
        this.shutterView = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout != null && i5 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                this.surfaceView = new android.view.TextureView(context);
            } else if (i5 == 3) {
                try {
                    this.surfaceView = (android.view.View) java.lang.Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(android.content.Context.class).newInstance(context);
                    z8 = true;
                    this.surfaceView.setLayoutParams(layoutParams);
                    this.surfaceView.setOnClickListener(componentListener);
                    this.surfaceView.setClickable(false);
                    aspectRatioFrameLayout.addView(this.surfaceView, 0);
                    z7 = z8;
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i5 == 4) {
                try {
                    this.surfaceView = (android.view.View) java.lang.Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(android.content.Context.class).newInstance(context);
                } catch (java.lang.Exception e2) {
                    throw new java.lang.IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else {
                this.surfaceView = new android.view.SurfaceView(context);
            }
            z8 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(componentListener);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
            z7 = z8;
        } else {
            this.surfaceView = null;
            z7 = false;
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.adOverlayFrameLayout = (android.widget.FrameLayout) findViewById(com.google.android.exoplayer2.ui.R.id.exo_ad_overlay);
        this.overlayFrameLayout = (android.widget.FrameLayout) findViewById(com.google.android.exoplayer2.ui.R.id.exo_overlay);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_artwork);
        this.artworkView = imageView2;
        this.useArtwork = z5 && imageView2 != null;
        if (i7 != 0) {
            this.defaultArtwork = androidx.core.content.ContextCompat.getDrawable(getContext(), i7);
        }
        com.google.android.exoplayer2.ui.SubtitleView subtitleView = (com.google.android.exoplayer2.ui.SubtitleView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        android.view.View findViewById2 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_buffering);
        this.bufferingView = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.showBuffering = i4;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.google.android.exoplayer2.ui.PlayerControlView playerControlView = (com.google.android.exoplayer2.ui.PlayerControlView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_controller);
        android.view.View findViewById3 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.controller = playerControlView;
        } else if (findViewById3 != null) {
            com.google.android.exoplayer2.ui.PlayerControlView playerControlView2 = new com.google.android.exoplayer2.ui.PlayerControlView(context, null, 0, attributeSet);
            this.controller = playerControlView2;
            playerControlView2.setId(com.google.android.exoplayer2.ui.R.id.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            this.controller = null;
        }
        com.google.android.exoplayer2.ui.PlayerControlView playerControlView3 = this.controller;
        this.controllerShowTimeoutMs = playerControlView3 != null ? i2 : 0;
        this.controllerHideOnTouch = z3;
        this.controllerAutoShow = z;
        this.controllerHideDuringAds = z2;
        this.useController = z6 && playerControlView3 != null;
        if (playerControlView3 != null) {
            playerControlView3.hide();
            this.controller.addVisibilityListener(componentListener);
        }
        if (z6) {
            setClickable(true);
        }
        updateContentDescription();
    }

    public static void switchTargetView(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.ui.PlayerView playerView, com.google.android.exoplayer2.ui.PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(player);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    public com.google.android.exoplayer2.Player getPlayer() {
        return this.player;
    }

    public void setPlayer(com.google.android.exoplayer2.Player player) {
        com.google.android.exoplayer2.util.Assertions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        com.google.android.exoplayer2.util.Assertions.checkArgument(player == null || player.getApplicationLooper() == android.os.Looper.getMainLooper());
        com.google.android.exoplayer2.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
            if (player2.isCommandAvailable(27)) {
                android.view.View view = this.surfaceView;
                if (view instanceof android.view.TextureView) {
                    player2.clearVideoTextureView((android.view.TextureView) view);
                } else if (view instanceof android.view.SurfaceView) {
                    player2.clearVideoSurfaceView((android.view.SurfaceView) view);
                }
            }
        }
        com.google.android.exoplayer2.ui.SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = player;
        if (useController()) {
            this.controller.setPlayer(player);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (player != null) {
            if (player.isCommandAvailable(27)) {
                android.view.View view2 = this.surfaceView;
                if (view2 instanceof android.view.TextureView) {
                    player.setVideoTextureView((android.view.TextureView) view2);
                } else if (view2 instanceof android.view.SurfaceView) {
                    player.setVideoSurfaceView((android.view.SurfaceView) view2);
                }
                updateAspectRatio();
            }
            if (this.subtitleView != null && player.isCommandAvailable(28)) {
                this.subtitleView.setCues(player.getCurrentCues().cues);
            }
            player.addListener(this.componentListener);
            maybeShowController(false);
            return;
        }
        hideController();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        android.view.View view = this.surfaceView;
        if (view instanceof android.view.SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public int getResizeMode() {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public void setUseArtwork(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkState((z && this.artworkView == null) ? false : true);
        if (this.useArtwork != z) {
            this.useArtwork = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public android.graphics.drawable.Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public void setDefaultArtwork(android.graphics.drawable.Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public boolean getUseController() {
        return this.useController;
    }

    public void setUseController(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkState((z && this.controller == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            com.google.android.exoplayer2.ui.PlayerControlView playerControlView = this.controller;
            if (playerControlView != null) {
                playerControlView.hide();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    public void setShutterBackgroundColor(int i) {
        android.view.View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setErrorMessageProvider(com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> errorMessageProvider) {
        if (this.errorMessageProvider != errorMessageProvider) {
            this.errorMessageProvider = errorMessageProvider;
            updateErrorMessage();
        }
    }

    public void setCustomErrorMessage(java.lang.CharSequence charSequence) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.google.android.exoplayer2.Player player = this.player;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean isDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (isDpadKey && useController() && !this.controller.isVisible()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (isDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public boolean isControllerVisible() {
        com.google.android.exoplayer2.ui.PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.isVisible();
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void hideController() {
        com.google.android.exoplayer2.ui.PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.hide();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public void setControllerShowTimeoutMs(int i) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isVisible()) {
            showController();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public void setControllerHideOnTouch(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerVisibilityListener(com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener visibilityListener) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener visibilityListener2 = this.controllerVisibilityListener;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            this.controller.removeVisibilityListener(visibilityListener2);
        }
        this.controllerVisibilityListener = visibilityListener;
        if (visibilityListener != null) {
            this.controller.addVisibilityListener(visibilityListener);
        }
    }

    public void setShowRewindButton(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowFastForwardButton(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowNextButton(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setRepeatToggleModes(int i) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setAspectRatioListener(com.google.android.exoplayer2.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setAspectRatioListener(aspectRatioListener);
    }

    public android.view.View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public android.widget.FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public com.google.android.exoplayer2.ui.SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    public void onResume() {
        android.view.View view = this.surfaceView;
        if (view instanceof android.opengl.GLSurfaceView) {
            ((android.opengl.GLSurfaceView) view).onResume();
        }
    }

    public void onPause() {
        android.view.View view = this.surfaceView;
        if (view instanceof android.opengl.GLSurfaceView) {
            ((android.opengl.GLSurfaceView) view).onPause();
        }
    }

    protected void onContentAspectRatioChanged(com.google.android.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public android.view.ViewGroup getAdViewGroup() {
        return (android.view.ViewGroup) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public java.util.List<com.google.android.exoplayer2.ui.AdOverlayInfo> getAdOverlayInfos() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.AdOverlayInfo(this.overlayFrameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        if (this.controller != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.AdOverlayInfo(this.controller, 1));
        }
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.controller);
        return true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.artworkView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.isVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.hide();
        }
    }

    private void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.isVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean shouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || shouldShowControllerIndefinitely) {
                showController(shouldShowControllerIndefinitely);
            }
        }
    }

    private boolean shouldShowControllerIndefinitely() {
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        return this.controllerAutoShow && (playbackState == 1 || playbackState == 4 || !this.player.getPlayWhenReady());
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        com.google.android.exoplayer2.Player player = this.player;
        return player != null && player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null || !player.isCommandAvailable(30) || player.getCurrentTracks().isEmpty()) {
            if (this.keepContentOnPlayerReset) {
                return;
            }
            hideArtwork();
            closeShutter();
            return;
        }
        if (z && !this.keepContentOnPlayerReset) {
            closeShutter();
        }
        if (player.getCurrentTracks().isTypeSelected(2)) {
            hideArtwork();
            return;
        }
        closeShutter();
        if (useArtwork() && (setArtworkFromMediaMetadata(player.getMediaMetadata()) || setDrawableArtwork(this.defaultArtwork))) {
            return;
        }
        hideArtwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        com.google.android.exoplayer2.Player player = this.player;
        com.google.android.exoplayer2.video.VideoSize videoSize = player != null ? player.getVideoSize() : com.google.android.exoplayer2.video.VideoSize.UNKNOWN;
        int i = videoSize.width;
        int i2 = videoSize.height;
        int i3 = videoSize.unappliedRotationDegrees;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.pixelWidthHeightRatio) / i2;
        android.view.View view = this.surfaceView;
        if (view instanceof android.view.TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i3;
            if (i3 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((android.view.TextureView) this.surfaceView, this.textureViewRotation);
        }
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : f);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        if (mediaMetadata.artworkData == null) {
            return false;
        }
        return setDrawableArtwork(new android.graphics.drawable.BitmapDrawable(getResources(), android.graphics.BitmapFactory.decodeByteArray(mediaMetadata.artworkData, 0, mediaMetadata.artworkData.length)));
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, intrinsicWidth / intrinsicHeight);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void hideArtwork() {
        android.widget.ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    private void closeShutter() {
        android.view.View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.player.getPlayWhenReady() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBuffering() {
        boolean z;
        if (this.bufferingView != null) {
            com.google.android.exoplayer2.Player player = this.player;
            if (player != null && player.getPlaybackState() == 2) {
                int i = this.showBuffering;
                z = true;
                if (i != 2) {
                    if (i == 1) {
                    }
                }
                this.bufferingView.setVisibility(z ? 0 : 8);
            }
            z = false;
            this.bufferingView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        com.google.android.exoplayer2.util.ErrorMessageProvider<? super com.google.android.exoplayer2.PlaybackException> errorMessageProvider;
        android.widget.TextView textView = this.errorMessageView;
        if (textView != null) {
            java.lang.CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            com.google.android.exoplayer2.Player player = this.player;
            com.google.android.exoplayer2.PlaybackException playerError = player != null ? player.getPlayerError() : null;
            if (playerError != null && (errorMessageProvider = this.errorMessageProvider) != null) {
                this.errorMessageView.setText((java.lang.CharSequence) errorMessageProvider.getErrorMessage(playerError).second);
                this.errorMessageView.setVisibility(0);
            } else {
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        com.google.android.exoplayer2.ui.PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(com.google.android.exoplayer2.ui.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.google.android.exoplayer2.ui.R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    private static void configureEditModeLogoV23(android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(com.google.android.exoplayer2.ui.R.color.exo_edit_mode_background_color, null));
    }

    private static void configureEditModeLogo(android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(com.google.android.exoplayer2.ui.R.color.exo_edit_mode_background_color));
    }

    private static void setResizeModeRaw(com.google.android.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(android.view.TextureView textureView, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
            android.graphics.RectF rectF2 = new android.graphics.RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, android.view.View.OnLayoutChangeListener, android.view.View.OnClickListener, com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener {
        private java.lang.Object lastPeriodUidWithTracks;
        private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands commands) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(java.util.List list) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo deviceInfo) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onEvents(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(com.google.android.exoplayer2.PlaybackException playbackException) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException playbackException) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline timeline, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(this, f);
        }

        public ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup) {
            if (com.google.android.exoplayer2.ui.PlayerView.this.subtitleView != null) {
                com.google.android.exoplayer2.ui.PlayerView.this.subtitleView.setCues(cueGroup.cues);
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize) {
            com.google.android.exoplayer2.ui.PlayerView.this.updateAspectRatio();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            if (com.google.android.exoplayer2.ui.PlayerView.this.shutterView != null) {
                com.google.android.exoplayer2.ui.PlayerView.this.shutterView.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(com.google.android.exoplayer2.Tracks tracks) {
            com.google.android.exoplayer2.Player player = (com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.ui.PlayerView.this.player);
            com.google.android.exoplayer2.Timeline currentTimeline = player.getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                this.lastPeriodUidWithTracks = null;
            } else if (!player.getCurrentTracks().isEmpty()) {
                this.lastPeriodUidWithTracks = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), this.period, true).uid;
            } else {
                java.lang.Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (player.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, this.period).windowIndex) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            }
            com.google.android.exoplayer2.ui.PlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            com.google.android.exoplayer2.ui.PlayerView.this.updateBuffering();
            com.google.android.exoplayer2.ui.PlayerView.this.updateErrorMessage();
            com.google.android.exoplayer2.ui.PlayerView.this.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            com.google.android.exoplayer2.ui.PlayerView.this.updateBuffering();
            com.google.android.exoplayer2.ui.PlayerView.this.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
            if (com.google.android.exoplayer2.ui.PlayerView.this.isPlayingAd() && com.google.android.exoplayer2.ui.PlayerView.this.controllerHideDuringAds) {
                com.google.android.exoplayer2.ui.PlayerView.this.hideController();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            com.google.android.exoplayer2.ui.PlayerView.applyTextureViewRotation((android.view.TextureView) view, com.google.android.exoplayer2.ui.PlayerView.this.textureViewRotation);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.exoplayer2.ui.PlayerView.this.toggleControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
        public void onVisibilityChange(int i) {
            com.google.android.exoplayer2.ui.PlayerView.this.updateContentDescription();
        }
    }
}
