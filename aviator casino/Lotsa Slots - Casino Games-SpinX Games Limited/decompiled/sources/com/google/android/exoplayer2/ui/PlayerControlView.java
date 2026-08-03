package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public class PlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final com.google.android.exoplayer2.ui.PlayerControlView.ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final android.view.View fastForwardButton;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final java.lang.Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final android.view.View nextButton;
    private final android.view.View pauseButton;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final android.view.View playButton;
    private boolean[] playedAdGroups;
    private com.google.android.exoplayer2.Player player;
    private final android.widget.TextView positionView;
    private final android.view.View previousButton;
    private com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.view.View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;
    private final com.google.android.exoplayer2.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener> visibilityListeners;
    private final android.view.View vrButton;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(android.content.Context context) {
        this(context, null);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = com.google.android.exoplayer2.ui.R.layout.exo_player_control_view;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = -9223372036854775807L;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, com.google.android.exoplayer2.ui.R.styleable.PlayerControlView, i, 0);
            try {
                this.showTimeoutMs = obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_timeout, this.showTimeoutMs);
                i2 = obtainStyledAttributes.getResourceId(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_controller_layout_id, i2);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.period = new com.google.android.exoplayer2.Timeline.Period();
        this.window = new com.google.android.exoplayer2.Timeline.Window();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        com.google.android.exoplayer2.ui.PlayerControlView.ComponentListener componentListener = new com.google.android.exoplayer2.ui.PlayerControlView.ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateProgress();
            }
        };
        this.hideAction = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.PlayerControlView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.PlayerControlView.this.hide();
            }
        };
        android.view.LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        com.google.android.exoplayer2.ui.TimeBar timeBar = (com.google.android.exoplayer2.ui.TimeBar) findViewById(com.google.android.exoplayer2.ui.R.id.exo_progress);
        android.view.View findViewById = findViewById(com.google.android.exoplayer2.ui.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
        } else if (findViewById != null) {
            com.google.android.exoplayer2.ui.DefaultTimeBar defaultTimeBar = new com.google.android.exoplayer2.ui.DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(com.google.android.exoplayer2.ui.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_duration);
        this.positionView = (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_position);
        com.google.android.exoplayer2.ui.TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        android.view.View findViewById2 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_play);
        this.playButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener);
        }
        android.view.View findViewById3 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_pause);
        this.pauseButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener);
        }
        android.view.View findViewById4 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_prev);
        this.previousButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(componentListener);
        }
        android.view.View findViewById5 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_next);
        this.nextButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener);
        }
        android.view.View findViewById6 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_rew);
        this.rewindButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener);
        }
        android.view.View findViewById7 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_ffwd);
        this.fastForwardButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        android.view.View findViewById8 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_vr);
        this.vrButton = findViewById8;
        setShowVrButton(false);
        updateButton(false, false, findViewById8);
        android.content.res.Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_off_description);
        this.currentPosition = -9223372036854775807L;
        this.currentBufferedPosition = -9223372036854775807L;
    }

    public com.google.android.exoplayer2.Player getPlayer() {
        return this.player;
    }

    public void setPlayer(com.google.android.exoplayer2.Player player) {
        boolean z = true;
        com.google.android.exoplayer2.util.Assertions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != android.os.Looper.getMainLooper()) {
            z = false;
        }
        com.google.android.exoplayer2.util.Assertions.checkArgument(z);
        com.google.android.exoplayer2.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(zArr);
            com.google.android.exoplayer2.util.Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void addVisibilityListener(com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener visibilityListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    public void removeVisibilityListener(com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        com.google.android.exoplayer2.Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public boolean getShowVrButton() {
        android.view.View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void setShowVrButton(boolean z) {
        android.view.View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = com.google.android.exoplayer2.util.Util.constrainValue(i, 16, 1000);
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            java.util.Iterator<com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            java.util.Iterator<com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = -9223372036854775807L;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = uptimeMillis + i;
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, i);
                return;
            }
            return;
        }
        this.hideAtMs = -9223372036854775807L;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        boolean z2;
        if (isVisible() && this.isAttachedToWindow) {
            boolean shouldShowPauseButton = shouldShowPauseButton();
            android.view.View view = this.playButton;
            boolean z3 = true;
            if (view != null) {
                z = shouldShowPauseButton && view.isFocused();
                if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                    z2 = z;
                } else {
                    z2 = shouldShowPauseButton && com.google.android.exoplayer2.ui.PlayerControlView.Api21.isAccessibilityFocused(this.playButton);
                }
                this.playButton.setVisibility(shouldShowPauseButton ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            android.view.View view2 = this.pauseButton;
            if (view2 != null) {
                z |= !shouldShowPauseButton && view2.isFocused();
                if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                    z3 = z;
                } else if (shouldShowPauseButton || !com.google.android.exoplayer2.ui.PlayerControlView.Api21.isAccessibilityFocused(this.pauseButton)) {
                    z3 = false;
                }
                z2 |= z3;
                this.pauseButton.setVisibility(shouldShowPauseButton ? 0 : 8);
            }
            if (z) {
                requestPlayPauseFocus();
            }
            if (z2) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (isVisible() && this.isAttachedToWindow) {
            com.google.android.exoplayer2.Player player = this.player;
            if (player != null) {
                z = player.isCommandAvailable(5);
                z3 = player.isCommandAvailable(7);
                z4 = player.isCommandAvailable(11);
                z5 = player.isCommandAvailable(12);
                z2 = player.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            updateButton(this.showPreviousButton, z3, this.previousButton);
            updateButton(this.showRewindButton, z4, this.rewindButton);
            updateButton(this.showFastForwardButton, z5, this.fastForwardButton);
            updateButton(this.showNextButton, z2, this.nextButton);
            com.google.android.exoplayer2.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            com.google.android.exoplayer2.Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        android.widget.ImageView imageView;
        java.lang.String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            com.google.android.exoplayer2.Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
            android.widget.ImageView imageView2 = this.shuffleButton;
            if (player.getShuffleModeEnabled()) {
                str = this.shuffleOnContentDescription;
            } else {
                str = this.shuffleOffContentDescription;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        long j;
        int i;
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        this.currentWindowOffset = 0L;
        com.google.android.exoplayer2.Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            j = 0;
            i = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > windowCount) {
                    break;
                }
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = com.google.android.exoplayer2.util.Util.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.window);
                if (this.window.durationUs == -9223372036854775807L) {
                    com.google.android.exoplayer2.util.Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                for (int i3 = this.window.firstPeriodIndex; i3 <= this.window.lastPeriodIndex; i3++) {
                    currentTimeline.getPeriod(i3, this.period);
                    int adGroupCount = this.period.getAdGroupCount();
                    for (int removedAdGroupCount = this.period.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                        long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                        if (adGroupTimeUs == Long.MIN_VALUE) {
                            if (this.period.durationUs != -9223372036854775807L) {
                                adGroupTimeUs = this.period.durationUs;
                            }
                        }
                        long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                        if (positionInWindowUs >= 0) {
                            long[] jArr = this.adGroupTimesMs;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.adGroupTimesMs = java.util.Arrays.copyOf(jArr, length);
                                this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, length);
                            }
                            this.adGroupTimesMs[i] = com.google.android.exoplayer2.util.Util.usToMs(j2 + positionInWindowUs);
                            this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                            i++;
                        }
                    }
                }
                j2 += this.window.durationUs;
                i2++;
                z = true;
            }
            j = j2;
        }
        long usToMs = com.google.android.exoplayer2.util.Util.usToMs(j);
        android.widget.TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(this.formatBuilder, this.formatter, usToMs));
        }
        com.google.android.exoplayer2.ui.TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(usToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = java.util.Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, i4);
            }
            java.lang.System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            java.lang.System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            com.google.android.exoplayer2.Player player = this.player;
            if (player != null) {
                j = this.currentWindowOffset + player.getContentPosition();
                j2 = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z = j != this.currentPosition;
            boolean z2 = j2 != this.currentBufferedPosition;
            this.currentPosition = j;
            this.currentBufferedPosition = j2;
            android.widget.TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z) {
                textView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            com.google.android.exoplayer2.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j);
                this.timeBar.setBufferedPosition(j2);
            }
            com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.onProgressUpdate(j, j2);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            com.google.android.exoplayer2.ui.TimeBar timeBar2 = this.timeBar;
            long min = java.lang.Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, com.google.android.exoplayer2.util.Util.constrainValue(f > 0.0f ? (long) (min / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    private void requestPlayPauseFocus() {
        android.view.View view;
        android.view.View view2;
        boolean shouldShowPauseButton = shouldShowPauseButton();
        if (!shouldShowPauseButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (!shouldShowPauseButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void requestPlayPauseAccessibilityFocus() {
        android.view.View view;
        android.view.View view2;
        boolean shouldShowPauseButton = shouldShowPauseButton();
        if (!shouldShowPauseButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!shouldShowPauseButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void updateButton(boolean z, boolean z2, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(com.google.android.exoplayer2.Player player, long j) {
        int currentMediaItemIndex;
        com.google.android.exoplayer2.Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j);
        updateProgress();
    }

    private void seekTo(com.google.android.exoplayer2.Player player, int i, long j) {
        player.seekTo(i, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - android.os.SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            dispatchPlayPause(player);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            dispatchPlay(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        dispatchPause(player);
        return true;
    }

    private boolean shouldShowPauseButton() {
        com.google.android.exoplayer2.Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    private void dispatchPlayPause(com.google.android.exoplayer2.Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            dispatchPlay(player);
        } else {
            dispatchPause(player);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlay(com.google.android.exoplayer2.Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            seekTo(player, player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPause(com.google.android.exoplayer2.Player player) {
        player.pause();
    }

    private static boolean canShowMultiWindowTimeBar(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getInt(com.google.android.exoplayer2.ui.R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    private final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener {
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
        public /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, cueGroup);
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
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
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
        public /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(this);
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
        public /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks tracks) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(this, f);
        }

        private ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
            if (events.containsAny(4, 5)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.updateTimeline();
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(com.google.android.exoplayer2.ui.TimeBar timeBar, long j) {
            com.google.android.exoplayer2.ui.PlayerControlView.this.scrubbing = true;
            if (com.google.android.exoplayer2.ui.PlayerControlView.this.positionView != null) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.positionView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(com.google.android.exoplayer2.ui.PlayerControlView.this.formatBuilder, com.google.android.exoplayer2.ui.PlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(com.google.android.exoplayer2.ui.TimeBar timeBar, long j) {
            if (com.google.android.exoplayer2.ui.PlayerControlView.this.positionView != null) {
                com.google.android.exoplayer2.ui.PlayerControlView.this.positionView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(com.google.android.exoplayer2.ui.PlayerControlView.this.formatBuilder, com.google.android.exoplayer2.ui.PlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(com.google.android.exoplayer2.ui.TimeBar timeBar, long j, boolean z) {
            com.google.android.exoplayer2.ui.PlayerControlView.this.scrubbing = false;
            if (z || com.google.android.exoplayer2.ui.PlayerControlView.this.player == null) {
                return;
            }
            com.google.android.exoplayer2.ui.PlayerControlView playerControlView = com.google.android.exoplayer2.ui.PlayerControlView.this;
            playerControlView.seekToTimeBarPosition(playerControlView.player, j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.exoplayer2.Player player = com.google.android.exoplayer2.ui.PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (com.google.android.exoplayer2.ui.PlayerControlView.this.nextButton != view) {
                if (com.google.android.exoplayer2.ui.PlayerControlView.this.previousButton != view) {
                    if (com.google.android.exoplayer2.ui.PlayerControlView.this.fastForwardButton != view) {
                        if (com.google.android.exoplayer2.ui.PlayerControlView.this.rewindButton != view) {
                            if (com.google.android.exoplayer2.ui.PlayerControlView.this.playButton == view) {
                                com.google.android.exoplayer2.ui.PlayerControlView.this.dispatchPlay(player);
                                return;
                            }
                            if (com.google.android.exoplayer2.ui.PlayerControlView.this.pauseButton == view) {
                                com.google.android.exoplayer2.ui.PlayerControlView.this.dispatchPause(player);
                                return;
                            } else {
                                if (com.google.android.exoplayer2.ui.PlayerControlView.this.repeatToggleButton != view) {
                                    if (com.google.android.exoplayer2.ui.PlayerControlView.this.shuffleButton == view) {
                                        player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                        return;
                                    }
                                    return;
                                }
                                player.setRepeatMode(com.google.android.exoplayer2.util.RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), com.google.android.exoplayer2.ui.PlayerControlView.this.repeatToggleModes));
                                return;
                            }
                        }
                        player.seekBack();
                        return;
                    }
                    if (player.getPlaybackState() != 4) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                player.seekToPrevious();
                return;
            }
            player.seekToNext();
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isAccessibilityFocused(android.view.View view) {
            return view.isAccessibilityFocused();
        }
    }
}
