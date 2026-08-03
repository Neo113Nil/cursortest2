package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public class StyledPlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    private final android.view.View audioTrackButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.ComponentListener componentListener;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final android.view.View fastForwardButton;
    private final android.widget.TextView fastForwardButtonTextView;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final android.widget.ImageView fullScreenButton;
    private final java.lang.String fullScreenEnterContentDescription;
    private final android.graphics.drawable.Drawable fullScreenEnterDrawable;
    private final java.lang.String fullScreenExitContentDescription;
    private final android.graphics.drawable.Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private final android.widget.ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final android.view.View nextButton;
    private com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final android.view.View playPauseButton;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter;
    private final android.view.View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private com.google.android.exoplayer2.Player player;
    private final android.widget.TextView positionView;
    private final android.view.View previousButton;
    private com.google.android.exoplayer2.ui.StyledPlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.content.res.Resources resources;
    private final android.view.View rewindButton;
    private final android.widget.TextView rewindButtonTextView;
    private boolean scrubbing;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingsAdapter settingsAdapter;
    private final android.view.View settingsButton;
    private final androidx.recyclerview.widget.RecyclerView settingsView;
    private final android.widget.PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;
    private final android.widget.ImageView subtitleButton;
    private final android.graphics.drawable.Drawable subtitleOffButtonDrawable;
    private final java.lang.String subtitleOffContentDescription;
    private final android.graphics.drawable.Drawable subtitleOnButtonDrawable;
    private final java.lang.String subtitleOnContentDescription;
    private final com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final com.google.android.exoplayer2.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener> visibilityListeners;
    private final android.view.View vrButton;
    private final com.google.android.exoplayer2.Timeline.Window window;

    @java.lang.Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    @java.lang.Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(android.content.Context context) {
        this(context, null);
    }

    public StyledPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public StyledPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        android.widget.ImageView imageView;
        com.google.android.exoplayer2.ui.StyledPlayerControlView.ComponentListener componentListener;
        boolean z9;
        boolean z10;
        android.widget.TextView textView;
        int i2 = com.google.android.exoplayer2.ui.R.layout.exo_styled_player_control_view;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView, i, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_controller_layout_id, i2);
                this.showTimeoutMs = obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_timeout, this.showTimeoutMs);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                boolean z11 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z12 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z13 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z14 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z15 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z16 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z17 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                boolean z18 = obtainStyledAttributes.getBoolean(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                z7 = z15;
                z8 = z16;
                z3 = z11;
                z4 = z12;
                z5 = z13;
                z = z18;
                z6 = z14;
                z2 = z17;
            } catch (java.lang.Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = false;
            z8 = false;
        }
        android.view.LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        com.google.android.exoplayer2.ui.StyledPlayerControlView.ComponentListener componentListener2 = new com.google.android.exoplayer2.ui.StyledPlayerControlView.ComponentListener();
        this.componentListener = componentListener2;
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
        this.updateProgressAction = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateProgress();
            }
        };
        this.durationView = (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_duration);
        this.positionView = (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_position);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_subtitle);
        this.subtitleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener2);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_fullscreen);
        this.fullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.onFullScreenButtonClicked(view);
            }
        });
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_minimal_fullscreen);
        this.minimalFullScreenButton = imageView4;
        initializeFullScreenButton(imageView4, new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.onFullScreenButtonClicked(view);
            }
        });
        android.view.View findViewById = findViewById(com.google.android.exoplayer2.ui.R.id.exo_settings);
        this.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(componentListener2);
        }
        android.view.View findViewById2 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_playback_speed);
        this.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener2);
        }
        android.view.View findViewById3 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_audio_track);
        this.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener2);
        }
        com.google.android.exoplayer2.ui.TimeBar timeBar = (com.google.android.exoplayer2.ui.TimeBar) findViewById(com.google.android.exoplayer2.ui.R.id.exo_progress);
        android.view.View findViewById4 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
            imageView = imageView2;
            componentListener = componentListener2;
            z9 = z;
            z10 = z2;
            textView = null;
        } else if (findViewById4 != null) {
            imageView = imageView2;
            textView = null;
            componentListener = componentListener2;
            z9 = z;
            z10 = z2;
            com.google.android.exoplayer2.ui.DefaultTimeBar defaultTimeBar = new com.google.android.exoplayer2.ui.DefaultTimeBar(context, null, 0, attributeSet2, com.google.android.exoplayer2.ui.R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(com.google.android.exoplayer2.ui.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            imageView = imageView2;
            componentListener = componentListener2;
            z9 = z;
            z10 = z2;
            textView = null;
            this.timeBar = null;
        }
        com.google.android.exoplayer2.ui.TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        android.view.View findViewById5 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_play_pause);
        this.playPauseButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener);
        }
        android.view.View findViewById6 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_prev);
        this.previousButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener);
        }
        android.view.View findViewById7 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_next);
        this.nextButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener);
        }
        android.graphics.Typeface font = androidx.core.content.res.ResourcesCompat.getFont(context, com.google.android.exoplayer2.ui.R.font.roboto_medium_numbers);
        android.view.View findViewById8 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_rew);
        android.widget.TextView textView2 = findViewById8 == null ? (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_rew_with_amount) : textView;
        this.rewindButtonTextView = textView2;
        if (textView2 != null) {
            textView2.setTypeface(font);
        }
        findViewById8 = findViewById8 == null ? textView2 : findViewById8;
        this.rewindButton = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(componentListener);
        }
        android.view.View findViewById9 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_ffwd);
        android.widget.TextView textView3 = findViewById9 == null ? (android.widget.TextView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_ffwd_with_amount) : null;
        this.fastForwardButtonTextView = textView3;
        if (textView3 != null) {
            textView3.setTypeface(font);
        }
        findViewById9 = findViewById9 == null ? textView3 : findViewById9;
        this.fastForwardButton = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView6 = (android.widget.ImageView) findViewById(com.google.android.exoplayer2.ui.R.id.exo_shuffle);
        this.shuffleButton = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(componentListener);
        }
        android.content.res.Resources resources = context.getResources();
        this.resources = resources;
        this.buttonAlphaEnabled = resources.getInteger(com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(com.google.android.exoplayer2.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        android.view.View findViewById10 = findViewById(com.google.android.exoplayer2.ui.R.id.exo_vr);
        this.vrButton = findViewById10;
        boolean z19 = z10;
        if (findViewById10 != null) {
            updateButton(false, findViewById10);
        }
        com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = new com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager(this);
        this.controlViewLayoutManager = styledPlayerControlViewLayoutManager;
        styledPlayerControlViewLayoutManager.setAnimationEnabled(z9);
        boolean z20 = z8;
        boolean z21 = z7;
        com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingsAdapter settingsAdapter = new com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingsAdapter(new java.lang.String[]{resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_playback_speed), resources.getString(com.google.android.exoplayer2.ui.R.string.exo_track_selection_title_audio)}, new android.graphics.drawable.Drawable[]{resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_speed), resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_audiotrack)});
        this.settingsAdapter = settingsAdapter;
        this.settingsWindowMargin = resources.getDimensionPixelSize(com.google.android.exoplayer2.ui.R.dimen.exo_settings_offset);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) android.view.LayoutInflater.from(context).inflate(com.google.android.exoplayer2.ui.R.layout.exo_styled_settings_list, (android.view.ViewGroup) null);
        this.settingsView = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) recyclerView, -2, -2, true);
        this.settingsWindow = popupWindow;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(componentListener);
        this.needToHideBars = true;
        this.trackNameProvider = new com.google.android.exoplayer2.ui.DefaultTrackNameProvider(getResources());
        this.subtitleOnButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_subtitle_on);
        this.subtitleOffButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_subtitle_off);
        this.subtitleOnContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter();
        this.audioTrackSelectionAdapter = new com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter();
        this.playbackSpeedAdapter = new com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter(resources.getStringArray(com.google.android.exoplayer2.ui.R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        this.fullScreenExitDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_fullscreen_exit);
        this.fullScreenEnterDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_fullscreen_enter);
        this.repeatOffButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_shuffle_off);
        this.fullScreenExitContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_fullscreen_exit_description);
        this.fullScreenEnterContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_shuffle_off_description);
        styledPlayerControlViewLayoutManager.setShowButton((android.view.ViewGroup) findViewById(com.google.android.exoplayer2.ui.R.id.exo_bottom_bar), true);
        styledPlayerControlViewLayoutManager.setShowButton(findViewById9, z4);
        styledPlayerControlViewLayoutManager.setShowButton(findViewById8, z3);
        styledPlayerControlViewLayoutManager.setShowButton(findViewById6, z5);
        styledPlayerControlViewLayoutManager.setShowButton(findViewById7, z6);
        styledPlayerControlViewLayoutManager.setShowButton(imageView6, z21);
        styledPlayerControlViewLayoutManager.setShowButton(imageView, z20);
        styledPlayerControlViewLayoutManager.setShowButton(findViewById10, z19);
        styledPlayerControlViewLayoutManager.setShowButton(imageView5, this.repeatToggleModes != 0);
        addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.onLayoutChange(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
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

    @java.lang.Deprecated
    public void addVisibilityListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener visibilityListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @java.lang.Deprecated
    public void removeVisibilityListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
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
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.setAnimationEnabled(z);
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = com.google.android.exoplayer2.util.Util.constrainValue(i, 16, 1000);
    }

    @java.lang.Deprecated
    public void setOnFullScreenModeChangedListener(com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener != null);
        updateFullScreenButtonVisibility(this.minimalFullScreenButton, onFullScreenModeChangedListener != null);
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    void notifyOnVisibilityChange() {
        java.util.Iterator<com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            if (shouldShowPauseButton()) {
                ((android.widget.ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_pause));
                this.playPauseButton.setContentDescription(this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_pause_description));
            } else {
                ((android.widget.ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(com.google.android.exoplayer2.ui.R.drawable.exo_styled_controls_play));
                this.playPauseButton.setContentDescription(this.resources.getString(com.google.android.exoplayer2.ui.R.string.exo_controls_play_description));
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
            if (z4) {
                updateRewindButton();
            }
            if (z5) {
                updateFastForwardButton();
            }
            updateButton(z3, this.previousButton);
            updateButton(z4, this.rewindButton);
            updateButton(z5, this.fastForwardButton);
            updateButton(z2, this.nextButton);
            com.google.android.exoplayer2.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    private void updateRewindButton() {
        com.google.android.exoplayer2.Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        android.widget.TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekBackIncrement));
        }
        android.view.View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(com.google.android.exoplayer2.ui.R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, java.lang.Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateFastForwardButton() {
        com.google.android.exoplayer2.Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        android.widget.TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekForwardIncrement));
        }
        android.view.View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(com.google.android.exoplayer2.ui.R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, java.lang.Integer.valueOf(seekForwardIncrement)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            com.google.android.exoplayer2.Player player = this.player;
            if (player == null) {
                updateButton(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        android.widget.ImageView imageView;
        java.lang.String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            com.google.android.exoplayer2.Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, this.shuffleButton);
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
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        com.google.android.exoplayer2.Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            com.google.android.exoplayer2.Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(com.google.common.collect.ImmutableList.of());
            }
        }
    }

    private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> gatherSupportedTrackInfosOfType(com.google.android.exoplayer2.Tracks tracks, int i) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> groups = tracks.getGroups();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            com.google.android.exoplayer2.Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                for (int i3 = 0; i3 < group.length; i3++) {
                    if (group.isTrackSupported(i3)) {
                        com.google.android.exoplayer2.Format trackFormat = group.getTrackFormat(i3);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation(tracks, i2, i3, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
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
            android.widget.TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            com.google.android.exoplayer2.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j);
                this.timeBar.setBufferedPosition(j2);
            }
            com.google.android.exoplayer2.ui.StyledPlayerControlView.ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(java.lang.Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(java.lang.Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, android.view.View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        com.google.android.exoplayer2.Player player = this.player;
        if (player == null) {
            return;
        }
        player.setPlaybackParameters(player.getPlaybackParameters().withSpeed(f));
    }

    void requestPlayPauseFocus() {
        android.view.View view = this.playPauseButton;
        if (view != null) {
            view.requestFocus();
        }
    }

    private void updateButton(boolean z, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullScreenButtonClicked(android.view.View view) {
        if (this.onFullScreenModeChangedListener == null) {
            return;
        }
        boolean z = !this.isFullScreen;
        this.isFullScreen = z;
        updateFullScreenButtonForState(this.fullScreenButton, z);
        updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
        com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.isFullScreen);
        }
    }

    private void updateFullScreenButtonForState(android.widget.ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.fullScreenExitDrawable);
            imageView.setContentDescription(this.fullScreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (android.view.View) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.settingsButton));
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (android.view.View) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    private boolean shouldShowPauseButton() {
        com.google.android.exoplayer2.Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlayPause(com.google.android.exoplayer2.Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            dispatchPlay(player);
        } else {
            dispatchPause(player);
        }
    }

    private void dispatchPlay(com.google.android.exoplayer2.Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            seekTo(player, player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    private void dispatchPause(com.google.android.exoplayer2.Player player) {
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

    private static void initializeFullScreenButton(android.view.View view, android.view.View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static void updateFullScreenButtonVisibility(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getInt(com.google.android.exoplayer2.ui.R.styleable.StyledPlayerControlView_repeat_toggle_modes, i);
    }

    private final class ComponentListener implements com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener {
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
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateTimeline();
            }
            if (events.contains(12)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.contains(2)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.updateTrackLists();
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(com.google.android.exoplayer2.ui.TimeBar timeBar, long j) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.scrubbing = true;
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.positionView != null) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.positionView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.formatBuilder, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.formatter, j));
            }
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(com.google.android.exoplayer2.ui.TimeBar timeBar, long j) {
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.positionView != null) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.positionView.setText(com.google.android.exoplayer2.util.Util.getStringForTime(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.formatBuilder, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(com.google.android.exoplayer2.ui.TimeBar timeBar, long j, boolean z) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.scrubbing = false;
            if (!z && com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player != null) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                styledPlayerControlView.seekToTimeBarPosition(styledPlayerControlView.player, j);
            }
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.needToHideBars) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.exoplayer2.Player player = com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.nextButton != view) {
                if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.previousButton != view) {
                    if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.fastForwardButton != view) {
                        if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.rewindButton != view) {
                            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.playPauseButton == view) {
                                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.dispatchPlayPause(player);
                                return;
                            }
                            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.repeatToggleButton != view) {
                                if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.shuffleButton != view) {
                                    if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsButton == view) {
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                                        styledPlayerControlView.displaySettingsWindow(styledPlayerControlView.settingsAdapter, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsButton);
                                        return;
                                    }
                                    if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.playbackSpeedButton == view) {
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView2 = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                                        styledPlayerControlView2.displaySettingsWindow(styledPlayerControlView2.playbackSpeedAdapter, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.playbackSpeedButton);
                                        return;
                                    } else if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.audioTrackButton == view) {
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView3 = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                                        styledPlayerControlView3.displaySettingsWindow(styledPlayerControlView3.audioTrackSelectionAdapter, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.audioTrackButton);
                                        return;
                                    } else {
                                        if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleButton == view) {
                                            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                            com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView4 = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                                            styledPlayerControlView4.displaySettingsWindow(styledPlayerControlView4.textTrackSelectionAdapter, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleButton);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                return;
                            }
                            player.setRepeatMode(com.google.android.exoplayer2.util.RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), com.google.android.exoplayer2.ui.StyledPlayerControlView.this.repeatToggleModes));
                            return;
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

    private class SettingsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder> {
        private final android.graphics.drawable.Drawable[] iconIds;
        private final java.lang.String[] mainTexts;
        private final java.lang.String[] subTexts;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public SettingsAdapter(java.lang.String[] strArr, android.graphics.drawable.Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new java.lang.String[strArr.length];
            this.iconIds = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return com.google.android.exoplayer2.ui.StyledPlayerControlView.this.new SettingViewHolder(android.view.LayoutInflater.from(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getContext()).inflate(com.google.android.exoplayer2.ui.R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder settingViewHolder, int i) {
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            if (this.subTexts[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i]);
            }
            if (this.iconIds[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        public void setSubTextAtPosition(int i, java.lang.String str) {
            this.subTexts[i] = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView iconView;
        private final android.widget.TextView mainTextView;
        private final android.widget.TextView subTextView;

        public SettingViewHolder(android.view.View view) {
            super(view);
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (android.widget.TextView) view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_main_text);
            this.subTextView = (android.widget.TextView) view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_sub_text);
            this.iconView = (android.widget.ImageView) view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_icon);
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.this.m5452xbf8efbb9(view2);
                }
            });
        }

        /* renamed from: lambda$new$0$com-google-android-exoplayer2-ui-StyledPlayerControlView$SettingViewHolder, reason: not valid java name */
        /* synthetic */ void m5452xbf8efbb9(android.view.View view) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.onSettingViewClicked(getAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class PlaybackSpeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder> {
        private final java.lang.String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(java.lang.String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public void updateSelectedIndex(float f) {
            int i = 0;
            int i2 = 0;
            float f2 = Float.MAX_VALUE;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i < fArr.length) {
                    float abs = java.lang.Math.abs(f - fArr[i]);
                    if (abs < f2) {
                        i2 = i;
                        f2 = abs;
                    }
                    i++;
                } else {
                    this.selectedIndex = i2;
                    return;
                }
            }
        }

        public java.lang.String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return new com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getContext()).inflate(com.google.android.exoplayer2.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder, final int i) {
            if (i < this.playbackSpeedTexts.length) {
                subSettingViewHolder.textView.setText(this.playbackSpeedTexts[i]);
            }
            if (i == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$PlaybackSpeedAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.PlaybackSpeedAdapter.this.m5451xdf46b9b2(i, view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolder$0$com-google-android-exoplayer2-ui-StyledPlayerControlView$PlaybackSpeedAdapter, reason: not valid java name */
        /* synthetic */ void m5451xdf46b9b2(int i, android.view.View view) {
            if (i != this.selectedIndex) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i]);
            }
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInformation {
        public final com.google.android.exoplayer2.Tracks.Group trackGroup;
        public final int trackIndex;
        public final java.lang.String trackName;

        public TrackInformation(com.google.android.exoplayer2.Tracks tracks, int i, int i2, java.lang.String str) {
            this.trackGroup = tracks.getGroups().get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class TextTrackSelectionAdapter extends com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter {
        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
        }

        private TextTrackSelectionAdapter() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i).isSelected()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleButton != null) {
                android.widget.ImageView imageView = com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleButton;
                com.google.android.exoplayer2.ui.StyledPlayerControlView styledPlayerControlView = com.google.android.exoplayer2.ui.StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.subtitleOnButtonDrawable : styledPlayerControlView.subtitleOffButtonDrawable);
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleButton.setContentDescription(z ? com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleOnContentDescription : com.google.android.exoplayer2.ui.StyledPlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(com.google.android.exoplayer2.ui.R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.tracks.size()) {
                    z = true;
                    break;
                } else {
                    if (this.tracks.get(i).isSelected()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter.this.m5453xcc051aee(view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolderAtZeroPosition$0$com-google-android-exoplayer2-ui-StyledPlayerControlView$TextTrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m5453xcc051aee(android.view.View view) {
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player != null) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player.setTrackSelectionParameters(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioTrackSelectionAdapter extends com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter.this.m5450x5e042c6b(view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolderAtZeroPosition$0$com-google-android-exoplayer2-ui-StyledPlayerControlView$AudioTrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m5450x5e042c6b(android.view.View view) {
            if (com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player == null) {
                return;
            }
            ((com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Util.castNonNull(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player)).setTrackSelectionParameters(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getResources().getString(com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto));
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        private boolean hasSelectionOverride(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> list) {
            this.tracks = list;
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters = ((com.google.android.exoplayer2.Player) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getResources().getString(com.google.android.exoplayer2.ui.R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getResources().getString(com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation trackInformation = list.get(i);
                if (trackInformation.isSelected()) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class TrackSelectionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder> {
        protected java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> tracks = new java.util.ArrayList();

        public abstract void init(java.util.List<com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation> list);

        protected abstract void onBindViewHolderAtZeroPosition(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder);

        protected abstract void onTrackSelection(java.lang.String str);

        protected TrackSelectionAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return new com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(com.google.android.exoplayer2.ui.StyledPlayerControlView.this.getContext()).inflate(com.google.android.exoplayer2.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(com.google.android.exoplayer2.ui.StyledPlayerControlView.SubSettingViewHolder subSettingViewHolder, int i) {
            final com.google.android.exoplayer2.Player player = com.google.android.exoplayer2.ui.StyledPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation trackInformation = this.tracks.get(i - 1);
            final com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlView$TrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter.this.m5454x30db9e7f(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolder$0$com-google-android-exoplayer2-ui-StyledPlayerControlView$TrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m5454x30db9e7f(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.source.TrackGroup trackGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackInformation trackInformation, android.view.View view) {
            player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(trackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
            onTrackSelection(trackInformation.trackName);
            com.google.android.exoplayer2.ui.StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        protected void clear() {
            this.tracks = java.util.Collections.emptyList();
        }
    }

    private static class SubSettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final android.view.View checkView;
        public final android.widget.TextView textView;

        public SubSettingViewHolder(android.view.View view) {
            super(view);
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (android.widget.TextView) view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_text);
            this.checkView = view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_check);
        }
    }
}
