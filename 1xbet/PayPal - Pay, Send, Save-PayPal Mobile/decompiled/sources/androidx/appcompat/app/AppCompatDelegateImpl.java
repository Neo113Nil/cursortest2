package androidx.appcompat.app;

/* loaded from: classes3.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.AppCompatDelegate implements androidx.appcompat.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2 {
    private android.window.OnBackInvokedCallback AMEXKernel;
    private androidx.appcompat.app.LayoutIncludeDetector AMEXKernelCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback AMEXKernelJNI;
    private boolean AMEXKernelProvider;
    private boolean AMEXKernela;
    private androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback _BOUNDARY;
    private boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private androidx.appcompat.app.AppCompatViewInflater f2661a;
    private java.lang.CharSequence aid;
    private androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback b;
    private boolean c;
    boolean coroutineBoundary;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager d;
    private android.content.res.Configuration exchange;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] free;
    private boolean freeTransaction;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    androidx.appcompat.app.ActionBar getHighResolutionOutputSizeshNQ4ISI;
    android.widget.PopupWindow getHighSpeedVideoFpsRanges;
    androidx.appcompat.widget.ActionBarContextView getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.view.ActionMode getHighSpeedVideoSizes;
    final androidx.appcompat.app.AppCompatCallback getHighSpeedVideoSizesFor;
    final android.content.Context getInputFormats;
    boolean getInputSizeshNQ4ISI;
    androidx.core.view.ViewPropertyAnimatorCompat getOutputFormats;
    boolean getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    android.view.MenuInflater getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    final java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    java.lang.Runnable getValidOutputFormatsForInputhNQ4ISI;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager init;
    android.view.ViewGroup isOutputSupportedFor;
    android.view.Window isOutputSupportedForhNQ4ISI;
    private boolean kernelVersion;
    private boolean l;
    private int newContext;
    private android.widget.TextView provide;
    private boolean release;
    private boolean requestGoOnline;
    private boolean requestPINEntry;
    private androidx.appcompat.widget.DecorContentParent resetTransaction;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState rsaCipher;
    private android.graphics.Rect setup;
    private int sha1;
    private android.graphics.Rect start;
    private android.window.OnBackInvokedDispatcher startTransaction;
    boolean toString;
    boolean unwrapAs;
    private final java.lang.Runnable updateUI;
    private android.view.View version;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> ArtificialStackFrames = new androidx.collection.SimpleArrayMap<>();
    private static final boolean CoroutineDebuggingKt = false;
    private static final int[] coroutineCreation = {android.R.attr.windowBackground};
    private static final boolean accessartificialFrame = !"robolectric".equals(android.os.Build.FINGERPRINT);

    interface ActionBarMenuCallback {
        boolean getHighSpeedVideoFpsRangesFor(int i);

        android.view.View getHighSpeedVideoSizes(int i);
    }

    private int getOutputMinFrameDuration(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    void getHighSpeedVideoSizes(android.view.ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Thread.UncaughtExceptionHandler {
        final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler Camera2StreamConfigurationMap;

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
            if (getHighSpeedVideoSizes(th)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.Camera2StreamConfigurationMap.uncaughtException(thread, notFoundException);
                return;
            }
            this.Camera2StreamConfigurationMap.uncaughtException(thread, th);
        }

        private boolean getHighSpeedVideoSizes(java.lang.Throwable th) {
            java.lang.String message;
            if (!(th instanceof android.content.res.Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }
    }

    AppCompatDelegateImpl(android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    AppCompatDelegateImpl(android.app.Dialog dialog, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    AppCompatDelegateImpl(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    AppCompatDelegateImpl(android.content.Context context, android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    private AppCompatDelegateImpl(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback, java.lang.Object obj) {
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> simpleArrayMap;
        java.lang.Integer num;
        androidx.appcompat.app.AppCompatActivity accessartificialFrame2;
        this.getOutputFormats = null;
        this.requestPINEntry = true;
        this.sha1 = -100;
        this.updateUI = new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if ((androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputStallDurationlomOqCM & 1) != 0) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor(0);
                }
                if ((androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputStallDurationlomOqCM & 4096) != 0) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor(108);
                }
                androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputSizeshNQ4ISI = false;
                androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputStallDurationlomOqCM = 0;
            }
        };
        this.getInputFormats = context;
        this.getHighSpeedVideoSizesFor = appCompatCallback;
        this.getOutputStallDuration = obj;
        if (this.sha1 == -100 && (obj instanceof android.app.Dialog) && (accessartificialFrame2 = accessartificialFrame()) != null) {
            this.sha1 = accessartificialFrame2.getDelegate().getLocalNightMode();
        }
        if (this.sha1 == -100 && (num = (simpleArrayMap = ArtificialStackFrames).get(obj.getClass().getName())) != null) {
            this.sha1 = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            getHighSpeedVideoSizes(window);
        }
        androidx.appcompat.widget.AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.startTransaction;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.AMEXKernel) != null) {
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.getHighSpeedVideoFpsRangesFor(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.AMEXKernel = null;
        }
        if (onBackInvokedDispatcher == null) {
            java.lang.Object obj = this.getOutputStallDuration;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).getWindow() != null) {
                this.startTransaction = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.a_((android.app.Activity) this.getOutputStallDuration);
                getOutputMinFrameDurationlomOqCM();
            }
        }
        this.startTransaction = onBackInvokedDispatcher;
        getOutputMinFrameDurationlomOqCM();
    }

    void getOutputMinFrameDurationlomOqCM() {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            boolean outputSizes = getOutputSizes();
            if (outputSizes && this.AMEXKernel == null) {
                this.AMEXKernel = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.b_(this.startTransaction, this);
            } else {
                if (outputSizes || (onBackInvokedCallback = this.AMEXKernel) == null) {
                    return;
                }
                androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.getHighSpeedVideoFpsRangesFor(this.startTransaction, onBackInvokedCallback);
                this.AMEXKernel = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context attachBaseContext2(android.content.Context context) {
        this.c = true;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, isOutputSupportedFor());
        if (Camera2StreamConfigurationMap(context)) {
            getHighSpeedVideoFpsRangesFor(context);
        }
        androidx.core.os.LocaleListCompat highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(getHighResolutionOutputSizeshNQ4ISI(context, highSpeedVideoFpsRanges, highSpeedVideoSizesFor, null, false));
                return context;
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
            try {
                ((androidx.appcompat.view.ContextThemeWrapper) context).applyOverrideConfiguration(getHighResolutionOutputSizeshNQ4ISI(context, highSpeedVideoFpsRanges, highSpeedVideoSizesFor, null, false));
                return context;
            } catch (java.lang.IllegalStateException unused2) {
            }
        }
        if (!accessartificialFrame) {
            return super.attachBaseContext2(context);
        }
        android.content.res.Configuration configuration = new android.content.res.Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        android.content.res.Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        android.content.res.Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        android.content.res.Configuration highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(context, highSpeedVideoFpsRanges, highSpeedVideoSizesFor, !configuration2.equals(configuration3) ? getHighResolutionOutputSizeshNQ4ISI(configuration2, configuration3) : null, true);
        androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, androidx.appcompat.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(highResolutionOutputSizeshNQ4ISI);
        try {
            if (context.getTheme() != null) {
                androidx.core.content.res.ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (java.lang.NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        this.c = true;
        getHighSpeedVideoFpsRangesFor(false);
        coroutineBoundary();
        java.lang.Object obj = this.getOutputStallDuration;
        if (obj instanceof android.app.Activity) {
            try {
                str = androidx.core.app.NavUtils.getParentActivityName((android.app.Activity) obj);
            } catch (java.lang.IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.ActionBar outputSizeshNQ4ISI = getOutputSizeshNQ4ISI();
                if (outputSizeshNQ4ISI == null) {
                    this.AMEXKernela = true;
                } else {
                    outputSizeshNQ4ISI.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            getHighSpeedVideoFpsRanges(this);
        }
        this.exchange = new android.content.res.Configuration(this.getInputFormats.getResources().getConfiguration());
        this.release = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(android.os.Bundle bundle) {
        unwrapAs();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.app.ActionBar getSupportActionBar() {
        coroutineCreation();
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final androidx.appcompat.app.ActionBar getOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final android.view.Window.Callback getOutputFormats() {
        return this.isOutputSupportedForhNQ4ISI.getCallback();
    }

    private void coroutineCreation() {
        unwrapAs();
        if (this.getOutputMinFrameDuration && this.getHighResolutionOutputSizeshNQ4ISI == null) {
            java.lang.Object obj = this.getOutputStallDuration;
            if (obj instanceof android.app.Activity) {
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.app.WindowDecorActionBar((android.app.Activity) this.getOutputStallDuration, this.toString);
            } else if (obj instanceof android.app.Dialog) {
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.app.WindowDecorActionBar((android.app.Dialog) this.getOutputStallDuration);
            }
            androidx.appcompat.app.ActionBar actionBar = this.getHighResolutionOutputSizeshNQ4ISI;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.AMEXKernela);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        if (this.getOutputStallDuration instanceof android.app.Activity) {
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof androidx.appcompat.app.WindowDecorActionBar) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.getOutputSizes = null;
            if (supportActionBar != null) {
                supportActionBar.Camera2StreamConfigurationMap();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            if (toolbar != null) {
                androidx.appcompat.app.ToolbarActionBar toolbarActionBar = new androidx.appcompat.app.ToolbarActionBar(toolbar, getOutputMinFrameDuration(), this.b);
                this.getHighResolutionOutputSizeshNQ4ISI = toolbarActionBar;
                this.b.Camera2StreamConfigurationMap(toolbarActionBar.Camera2StreamConfigurationMap);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.b.Camera2StreamConfigurationMap(null);
            }
            invalidateOptionsMenu();
        }
    }

    final android.content.Context getInputFormats() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        android.content.Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.getInputFormats : themedContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.MenuInflater getMenuInflater() {
        if (this.getOutputSizes == null) {
            coroutineCreation();
            androidx.appcompat.app.ActionBar actionBar = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputSizes = new androidx.appcompat.view.SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.getInputFormats);
        }
        return this.getOutputSizes;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends android.view.View> T findViewById(int i) {
        unwrapAs();
        return (T) this.isOutputSupportedForhNQ4ISI.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        androidx.appcompat.app.ActionBar supportActionBar;
        if (this.getOutputMinFrameDuration && this.AMEXKernelProvider && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        androidx.appcompat.widget.AppCompatDrawableManager.get().onConfigurationChanged(this.getInputFormats);
        this.exchange = new android.content.res.Configuration(this.getInputFormats.getResources().getConfiguration());
        getHighResolutionOutputSizeshNQ4ISI(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        getHighResolutionOutputSizeshNQ4ISI(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View view) {
        unwrapAs();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.isOutputSupportedFor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.b.getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i) {
        unwrapAs();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.isOutputSupportedFor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.getInputFormats).inflate(i, viewGroup);
        this.b.getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        unwrapAs();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.isOutputSupportedFor.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.b.getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        unwrapAs();
        ((android.view.ViewGroup) this.isOutputSupportedFor.findViewById(android.R.id.content)).addView(view, layoutParams);
        this.b.getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        androidx.appcompat.app.ActionBar actionBar;
        if (this.getOutputStallDuration instanceof android.app.Activity) {
            Camera2StreamConfigurationMap(this);
        }
        if (this.getOutputSizeshNQ4ISI) {
            this.isOutputSupportedForhNQ4ISI.getDecorView().removeCallbacks(this.updateUI);
        }
        this.getInputSizeshNQ4ISI = true;
        if (this.sha1 != -100) {
            java.lang.Object obj = this.getOutputStallDuration;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).isChangingConfigurations()) {
                ArtificialStackFrames.put(this.getOutputStallDuration.getClass().getName(), java.lang.Integer.valueOf(this.sha1));
                actionBar = this.getHighResolutionOutputSizeshNQ4ISI;
                if (actionBar != null) {
                    actionBar.Camera2StreamConfigurationMap();
                }
                isOutputSupportedForhNQ4ISI();
            }
        }
        ArtificialStackFrames.remove(this.getOutputStallDuration.getClass().getName());
        actionBar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (actionBar != null) {
        }
        isOutputSupportedForhNQ4ISI();
    }

    private void isOutputSupportedForhNQ4ISI() {
        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager = this.d;
        if (autoNightModeManager != null) {
            autoNightModeManager.getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager2 = this.init;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i) {
        this.newContext = i;
    }

    private void coroutineBoundary() {
        if (this.isOutputSupportedForhNQ4ISI == null) {
            java.lang.Object obj = this.getOutputStallDuration;
            if (obj instanceof android.app.Activity) {
                getHighSpeedVideoSizes(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.isOutputSupportedForhNQ4ISI == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    private void getHighSpeedVideoSizes(android.view.Window window) {
        if (this.isOutputSupportedForhNQ4ISI != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback appCompatWindowCallback = new androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback(callback);
        this.b = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getInputFormats, (android.util.AttributeSet) null, coroutineCreation);
        android.graphics.drawable.Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        obtainStyledAttributes.recycle();
        this.isOutputSupportedForhNQ4ISI = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || this.startTransaction != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    private void unwrapAs() {
        if (this.AMEXKernelProvider) {
            return;
        }
        this.isOutputSupportedFor = getValidOutputFormatsForInputhNQ4ISI();
        java.lang.CharSequence outputMinFrameDuration = getOutputMinFrameDuration();
        if (!android.text.TextUtils.isEmpty(outputMinFrameDuration)) {
            androidx.appcompat.widget.DecorContentParent decorContentParent = this.resetTransaction;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(outputMinFrameDuration);
            } else if (getOutputSizeshNQ4ISI() != null) {
                getOutputSizeshNQ4ISI().setWindowTitle(outputMinFrameDuration);
            } else {
                android.widget.TextView textView = this.provide;
                if (textView != null) {
                    textView.setText(outputMinFrameDuration);
                }
            }
        }
        getOutputStallDurationlomOqCM();
        getHighSpeedVideoSizes(this.isOutputSupportedFor);
        this.AMEXKernelProvider = true;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, false);
        if (this.getInputSizeshNQ4ISI) {
            return;
        }
        if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM == null) {
            getHighSpeedVideoFpsRanges(108);
        }
    }

    private android.view.ViewGroup getValidOutputFormatsForInputhNQ4ISI() {
        android.view.ViewGroup viewGroup;
        android.content.Context context;
        android.content.res.TypedArray obtainStyledAttributes = this.getInputFormats.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(108);
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        coroutineBoundary();
        this.isOutputSupportedForhNQ4ISI.getDecorView();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.getInputFormats);
        if (!this.coroutineBoundary) {
            if (this.getOutputMinFrameDurationlomOqCM) {
                viewGroup = (android.view.ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (android.view.ViewGroup) null);
                this.toString = false;
                this.getOutputMinFrameDuration = false;
            } else if (this.getOutputMinFrameDuration) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                this.getInputFormats.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new androidx.appcompat.view.ContextThemeWrapper(this.getInputFormats, typedValue.resourceId);
                } else {
                    context = this.getInputFormats;
                }
                viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (android.view.ViewGroup) null);
                androidx.appcompat.widget.DecorContentParent decorContentParent = (androidx.appcompat.widget.DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
                this.resetTransaction = decorContentParent;
                decorContentParent.setWindowCallback(getOutputFormats());
                if (this.toString) {
                    this.resetTransaction.initFeature(109);
                }
                if (this.requestGoOnline) {
                    this.resetTransaction.initFeature(2);
                }
                if (this.l) {
                    this.resetTransaction.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.unwrapAs ? (android.view.ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (android.view.ViewGroup) null) : (android.view.ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple, (android.view.ViewGroup) null);
        }
        if (viewGroup == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.toString);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.getOutputMinFrameDurationlomOqCM);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.unwrapAs);
            sb.append(", windowNoTitle: ");
            sb.append(this.coroutineBoundary);
            sb.append(" }");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                int highSpeedVideoFpsRangesFor = androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor(windowInsetsCompat, (android.graphics.Rect) null);
                if (systemWindowInsetTop != highSpeedVideoFpsRangesFor) {
                    windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), highSpeedVideoFpsRangesFor, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                return androidx.core.view.ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
        if (this.resetTransaction == null) {
            this.provide = (android.widget.TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
        }
        androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.isOutputSupportedForhNQ4ISI.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.isOutputSupportedForhNQ4ISI.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.widget.ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        });
        return viewGroup;
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl Camera2StreamConfigurationMap;

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(android.graphics.Rect rect) {
            rect.top = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor((androidx.core.view.WindowInsetsCompat) null, rect);
        }
    }

    private void getOutputStallDurationlomOqCM() {
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) this.isOutputSupportedFor.findViewById(android.R.id.content);
        android.view.View decorView = this.isOutputSupportedForhNQ4ISI.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        android.content.res.TypedArray obtainStyledAttributes = this.getInputFormats.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int outputMinFrameDuration = getOutputMinFrameDuration(i);
        if (this.coroutineBoundary && outputMinFrameDuration == 108) {
            return false;
        }
        if (this.getOutputMinFrameDuration && outputMinFrameDuration == 1) {
            this.getOutputMinFrameDuration = false;
        }
        if (outputMinFrameDuration == 1) {
            CoroutineDebuggingKt();
            this.coroutineBoundary = true;
            return true;
        }
        if (outputMinFrameDuration == 2) {
            CoroutineDebuggingKt();
            this.requestGoOnline = true;
            return true;
        }
        if (outputMinFrameDuration == 5) {
            CoroutineDebuggingKt();
            this.l = true;
            return true;
        }
        if (outputMinFrameDuration == 10) {
            CoroutineDebuggingKt();
            this.unwrapAs = true;
            return true;
        }
        if (outputMinFrameDuration == 108) {
            CoroutineDebuggingKt();
            this.getOutputMinFrameDuration = true;
            return true;
        }
        if (outputMinFrameDuration == 109) {
            CoroutineDebuggingKt();
            this.toString = true;
            return true;
        }
        return this.isOutputSupportedForhNQ4ISI.requestFeature(outputMinFrameDuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == false) goto L22;
     */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasWindowFeature(int i) {
        boolean z;
        int outputMinFrameDuration = getOutputMinFrameDuration(i);
        if (outputMinFrameDuration == 1) {
            z = this.coroutineBoundary;
        } else if (outputMinFrameDuration == 2) {
            z = this.requestGoOnline;
        } else if (outputMinFrameDuration == 5) {
            z = this.l;
        } else if (outputMinFrameDuration == 10) {
            z = this.unwrapAs;
        } else {
            if (outputMinFrameDuration != 108) {
                if (outputMinFrameDuration == 109) {
                    z = this.toString;
                }
                return this.isOutputSupportedForhNQ4ISI.hasFeature(i);
            }
            z = this.getOutputMinFrameDuration;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.aid = charSequence;
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.resetTransaction;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (getOutputSizeshNQ4ISI() != null) {
            getOutputSizeshNQ4ISI().setWindowTitle(charSequence);
            return;
        }
        android.widget.TextView textView = this.provide;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final java.lang.CharSequence getOutputMinFrameDuration() {
        java.lang.Object obj = this.getOutputStallDuration;
        if (obj instanceof android.app.Activity) {
            return ((android.app.Activity) obj).getTitle();
        }
        return this.aid;
    }

    void Camera2StreamConfigurationMap(int i) {
        if (i == 108) {
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, true);
            if (Camera2StreamConfigurationMap.getOutputFormats) {
                getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, false);
            }
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI(int i) {
        androidx.appcompat.app.ActionBar supportActionBar;
        if (i != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.dispatchMenuVisibilityChanged(true);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState highSpeedVideoFpsRangesFor;
        android.view.Window.Callback outputFormats = getOutputFormats();
        if (outputFormats == null || this.getInputSizeshNQ4ISI || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return outputFormats.onMenuItemSelected(highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.app.AppCompatCallback appCompatCallback;
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.ActionMode actionMode = this.getHighSpeedVideoSizes;
        if (actionMode != null) {
            actionMode.finish();
        }
        androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9(callback);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            androidx.appcompat.view.ActionMode startActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
            this.getHighSpeedVideoSizes = startActionMode;
            if (startActionMode != null && (appCompatCallback = this.getHighSpeedVideoSizesFor) != null) {
                appCompatCallback.onSupportActionModeStarted(startActionMode);
            }
        }
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(actionModeCallbackWrapperV9);
        }
        getOutputMinFrameDurationlomOqCM();
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (getOutputSizeshNQ4ISI() == null || getSupportActionBar().invalidateOptionsMenu()) {
            return;
        }
        getHighSpeedVideoFpsRanges(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    androidx.appcompat.view.ActionMode getHighSpeedVideoSizes(androidx.appcompat.view.ActionMode.Callback callback) {
        androidx.appcompat.view.ActionMode actionMode;
        android.content.Context context;
        androidx.appcompat.view.ActionMode actionMode2;
        androidx.appcompat.app.AppCompatCallback appCompatCallback;
        getInputSizeshNQ4ISI();
        androidx.appcompat.view.ActionMode actionMode3 = this.getHighSpeedVideoSizes;
        if (actionMode3 != null) {
            actionMode3.finish();
        }
        if (!(callback instanceof androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9)) {
            callback = new androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9(callback);
        }
        androidx.appcompat.app.AppCompatCallback appCompatCallback2 = this.getHighSpeedVideoSizesFor;
        if (appCompatCallback2 != null && !this.getInputSizeshNQ4ISI) {
            try {
                actionMode = appCompatCallback2.onWindowStartingSupportActionMode(callback);
            } catch (java.lang.AbstractMethodError unused) {
            }
            if (actionMode == null) {
                this.getHighSpeedVideoSizes = actionMode;
            } else {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    if (this.getOutputMinFrameDurationlomOqCM) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme = this.getInputFormats.getTheme();
                        theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            android.content.res.Resources.Theme newTheme = this.getInputFormats.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new androidx.appcompat.view.ContextThemeWrapper(this.getInputFormats, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.getInputFormats;
                        }
                        this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.ActionBarContextView(context);
                        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(context, (android.util.AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                        this.getHighSpeedVideoFpsRanges = popupWindow;
                        androidx.core.widget.PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                        this.getHighSpeedVideoFpsRanges.setContentView(this.getHighSpeedVideoFpsRangesFor);
                        this.getHighSpeedVideoFpsRanges.setWidth(-1);
                        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                        this.getHighSpeedVideoFpsRangesFor.setContentHeight(android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.getHighSpeedVideoFpsRanges.setHeight(-2);
                        this.getValidOutputFormatsForInputhNQ4ISI = new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges.showAtLocation(androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor, 55, 0, 0);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.getInputSizeshNQ4ISI();
                                if (androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputStallDuration()) {
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setAlpha(0.0f);
                                    androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
                                    appCompatDelegateImpl.getOutputFormats = androidx.core.view.ViewCompat.animate(appCompatDelegateImpl.getHighSpeedVideoFpsRangesFor).alpha(1.0f);
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                        public void onAnimationStart(android.view.View view) {
                                            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
                                        }

                                        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                        public void onAnimationEnd(android.view.View view) {
                                            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setAlpha(1.0f);
                                            androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats.setListener(null);
                                            androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats = null;
                                        }
                                    });
                                    return;
                                }
                                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setAlpha(1.0f);
                                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
                            }
                        };
                    } else {
                        androidx.appcompat.widget.ViewStubCompat viewStubCompat = (androidx.appcompat.widget.ViewStubCompat) this.isOutputSupportedFor.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(android.view.LayoutInflater.from(getInputFormats()));
                            this.getHighSpeedVideoFpsRangesFor = (androidx.appcompat.widget.ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (this.getHighSpeedVideoFpsRangesFor != null) {
                    getInputSizeshNQ4ISI();
                    this.getHighSpeedVideoFpsRangesFor.killMode();
                    androidx.appcompat.view.StandaloneActionMode standaloneActionMode = new androidx.appcompat.view.StandaloneActionMode(this.getHighSpeedVideoFpsRangesFor.getContext(), this.getHighSpeedVideoFpsRangesFor, callback, this.getHighSpeedVideoFpsRanges == null);
                    if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                        standaloneActionMode.invalidate();
                        this.getHighSpeedVideoFpsRangesFor.initForMode(standaloneActionMode);
                        this.getHighSpeedVideoSizes = standaloneActionMode;
                        if (getOutputStallDuration()) {
                            this.getHighSpeedVideoFpsRangesFor.setAlpha(0.0f);
                            androidx.core.view.ViewPropertyAnimatorCompat alpha = androidx.core.view.ViewCompat.animate(this.getHighSpeedVideoFpsRangesFor).alpha(1.0f);
                            this.getOutputFormats = alpha;
                            alpha.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                public void onAnimationStart(android.view.View view) {
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
                                    if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.getParent() instanceof android.view.View) {
                                        androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.getParent());
                                    }
                                }

                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                public void onAnimationEnd(android.view.View view) {
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setAlpha(1.0f);
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats.setListener(null);
                                    androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats = null;
                                }
                            });
                        } else {
                            this.getHighSpeedVideoFpsRangesFor.setAlpha(1.0f);
                            this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
                            if (this.getHighSpeedVideoFpsRangesFor.getParent() instanceof android.view.View) {
                                androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) this.getHighSpeedVideoFpsRangesFor.getParent());
                            }
                        }
                        if (this.getHighSpeedVideoFpsRanges != null) {
                            this.isOutputSupportedForhNQ4ISI.getDecorView().post(this.getValidOutputFormatsForInputhNQ4ISI);
                        }
                    } else {
                        this.getHighSpeedVideoSizes = null;
                    }
                }
            }
            actionMode2 = this.getHighSpeedVideoSizes;
            if (actionMode2 != null && (appCompatCallback = this.getHighSpeedVideoSizesFor) != null) {
                appCompatCallback.onSupportActionModeStarted(actionMode2);
            }
            getOutputMinFrameDurationlomOqCM();
            return this.getHighSpeedVideoSizes;
        }
        actionMode = null;
        if (actionMode == null) {
        }
        actionMode2 = this.getHighSpeedVideoSizes;
        if (actionMode2 != null) {
            appCompatCallback.onSupportActionModeStarted(actionMode2);
        }
        getOutputMinFrameDurationlomOqCM();
        return this.getHighSpeedVideoSizes;
    }

    final boolean getOutputStallDuration() {
        android.view.ViewGroup viewGroup;
        return this.AMEXKernelProvider && (viewGroup = this.isOutputSupportedFor) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.requestPINEntry = z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.requestPINEntry;
    }

    void getInputSizeshNQ4ISI() {
        androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.getOutputFormats;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    boolean getOutputSizes() {
        if (this.startTransaction == null) {
            return false;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, false);
        return (Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.getOutputFormats) || this.getHighSpeedVideoSizes != null;
    }

    boolean getHighSpeedVideoSizesFor() {
        boolean z = this.freeTransaction;
        this.freeTransaction = false;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, false);
        if (Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.getOutputFormats) {
            if (!z) {
                getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, true);
            }
            return true;
        }
        androidx.appcompat.view.ActionMode actionMode = this.getHighSpeedVideoSizes;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    boolean getHighSpeedVideoFpsRangesFor(int i, android.view.KeyEvent keyEvent) {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent)) {
            return true;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = this.rsaCipher;
        if (panelFeatureState != null && getHighResolutionOutputSizeshNQ4ISI(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = this.rsaCipher;
            if (panelFeatureState2 != null) {
                panelFeatureState2.getOutputMinFrameDuration = true;
            }
            return true;
        }
        if (this.rsaCipher == null) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, true);
            Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, keyEvent);
            boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, keyEvent.getKeyCode(), keyEvent, 1);
            Camera2StreamConfigurationMap.getInputSizeshNQ4ISI = false;
            if (highResolutionOutputSizeshNQ4ISI) {
                return true;
            }
        }
        return false;
    }

    boolean getHighSpeedVideoSizes(android.view.KeyEvent keyEvent) {
        android.view.View decorView;
        java.lang.Object obj = this.getOutputStallDuration;
        if (((obj instanceof androidx.core.view.KeyEventDispatcher.Component) || (obj instanceof androidx.appcompat.app.AppCompatDialog)) && (decorView = this.isOutputSupportedForhNQ4ISI.getDecorView()) != null && androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.b.getHighSpeedVideoFpsRanges(this.isOutputSupportedForhNQ4ISI.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? getHighResolutionOutputSizeshNQ4ISI(keyCode, keyEvent) : Camera2StreamConfigurationMap(keyCode, keyEvent);
    }

    boolean Camera2StreamConfigurationMap(int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                getHighSpeedVideoFpsRanges(0, keyEvent);
                return true;
            }
        } else if (getHighSpeedVideoSizesFor()) {
            return true;
        }
        return false;
    }

    boolean getHighResolutionOutputSizeshNQ4ISI(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            this.freeTransaction = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            getHighSpeedVideoSizes(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (androidx.appcompat.app.LayoutIncludeDetector.getHighSpeedVideoFpsRangesFor(r4, r5) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z = false;
        if (this.f2661a == null) {
            android.content.res.TypedArray obtainStyledAttributes = this.getInputFormats.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            java.lang.String string = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f2661a = new androidx.appcompat.app.AppCompatViewInflater();
            } else {
                try {
                    this.f2661a = (androidx.appcompat.app.AppCompatViewInflater) this.getInputFormats.getClassLoader().loadClass(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.Throwable unused) {
                    this.f2661a = new androidx.appcompat.app.AppCompatViewInflater();
                }
            }
        }
        boolean z2 = CoroutineDebuggingKt;
        if (z2) {
            if (this.AMEXKernelCallback == null) {
                this.AMEXKernelCallback = new androidx.appcompat.app.LayoutIncludeDetector();
            }
            androidx.appcompat.app.LayoutIncludeDetector layoutIncludeDetector = this.AMEXKernelCallback;
            boolean z3 = attributeSet instanceof org.xmlpull.v1.XmlPullParser;
            if (z3) {
                org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
                if (xmlPullParser.getDepth() == 1) {
                    org.xmlpull.v1.XmlPullParser highSpeedVideoFpsRangesFor = androidx.appcompat.app.LayoutIncludeDetector.getHighSpeedVideoFpsRangesFor(layoutIncludeDetector.getHighSpeedVideoSizes);
                    layoutIncludeDetector.getHighSpeedVideoSizes.push(new java.lang.ref.WeakReference<>(xmlPullParser));
                }
            }
            if (!z3) {
                z = getHighSpeedVideoFpsRangesFor((android.view.ViewParent) view);
            }
        }
        boolean z4 = z;
        return this.f2661a.createView(view, str, context, attributeSet, z4, z2, true, androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean getHighSpeedVideoFpsRangesFor(android.view.ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        android.view.View decorView = this.isOutputSupportedForhNQ4ISI.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof android.view.View) || ((android.view.View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.getInputFormats);
        if (from.getFactory() == null) {
            androidx.core.view.LayoutInflaterCompat.setFactory2(from, this);
        } else {
            from.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private androidx.appcompat.app.AppCompatActivity accessartificialFrame() {
        for (android.content.Context context = this.getInputFormats; context != null; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                return (androidx.appcompat.app.AppCompatActivity) context;
            }
            if (!(context instanceof android.content.ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.KeyEvent keyEvent) {
        int i;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.getOutputFormats || this.getInputSizeshNQ4ISI) {
            return;
        }
        if (panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 0 && (this.getInputFormats.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        android.view.Window.Callback outputFormats = getOutputFormats();
        if (outputFormats != null && !outputFormats.onMenuOpened(panelFeatureState.getHighResolutionOutputSizeshNQ4ISI, panelFeatureState.getOutputMinFrameDurationlomOqCM)) {
            getHighSpeedVideoFpsRanges(panelFeatureState, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.getInputFormats.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        if (windowManager == null || !Camera2StreamConfigurationMap(panelFeatureState, keyEvent)) {
            return;
        }
        if (panelFeatureState.Camera2StreamConfigurationMap == null || panelFeatureState.getOutputSizeshNQ4ISI) {
            if (panelFeatureState.Camera2StreamConfigurationMap == null) {
                if (!Camera2StreamConfigurationMap(panelFeatureState) || panelFeatureState.Camera2StreamConfigurationMap == null) {
                    return;
                }
            } else if (panelFeatureState.getOutputSizeshNQ4ISI && panelFeatureState.Camera2StreamConfigurationMap.getChildCount() > 0) {
                panelFeatureState.Camera2StreamConfigurationMap.removeAllViews();
            }
            if (!getHighSpeedVideoFpsRangesFor(panelFeatureState) || !panelFeatureState.hasPanelItems()) {
                panelFeatureState.getOutputSizeshNQ4ISI = true;
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = panelFeatureState.getOutputStallDuration.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new android.view.ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.Camera2StreamConfigurationMap.setBackgroundResource(panelFeatureState.getHighSpeedVideoSizes);
            android.view.ViewParent parent = panelFeatureState.getOutputStallDuration.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(panelFeatureState.getOutputStallDuration);
            }
            panelFeatureState.Camera2StreamConfigurationMap.addView(panelFeatureState.getOutputStallDuration, layoutParams2);
            if (!panelFeatureState.getOutputStallDuration.hasFocus()) {
                panelFeatureState.getOutputStallDuration.requestFocus();
            }
        } else if (panelFeatureState.getHighSpeedVideoFpsRanges != null && (layoutParams = panelFeatureState.getHighSpeedVideoFpsRanges.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            panelFeatureState.getOutputMinFrameDuration = false;
            android.view.WindowManager.LayoutParams layoutParams3 = new android.view.WindowManager.LayoutParams(i, -2, panelFeatureState.toString, panelFeatureState.unwrapAs, 1002, 8519680, -3);
            layoutParams3.gravity = panelFeatureState.getInputFormats;
            layoutParams3.windowAnimations = panelFeatureState.getValidOutputFormatsForInputhNQ4ISI;
            windowManager.addView(panelFeatureState.Camera2StreamConfigurationMap, layoutParams3);
            panelFeatureState.getOutputFormats = true;
            if (panelFeatureState.getHighResolutionOutputSizeshNQ4ISI != 0) {
                getOutputMinFrameDurationlomOqCM();
                return;
            }
            return;
        }
        i = -2;
        panelFeatureState.getOutputMinFrameDuration = false;
        android.view.WindowManager.LayoutParams layoutParams32 = new android.view.WindowManager.LayoutParams(i, -2, panelFeatureState.toString, panelFeatureState.unwrapAs, 1002, 8519680, -3);
        layoutParams32.gravity = panelFeatureState.getInputFormats;
        layoutParams32.windowAnimations = panelFeatureState.getValidOutputFormatsForInputhNQ4ISI;
        windowManager.addView(panelFeatureState.Camera2StreamConfigurationMap, layoutParams32);
        panelFeatureState.getOutputFormats = true;
        if (panelFeatureState.getHighResolutionOutputSizeshNQ4ISI != 0) {
        }
    }

    private boolean Camera2StreamConfigurationMap(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        panelFeatureState.getHighSpeedVideoFpsRanges(getInputFormats());
        panelFeatureState.Camera2StreamConfigurationMap = new androidx.appcompat.app.AppCompatDelegateImpl.ListMenuDecorView(panelFeatureState.getOutputStallDurationlomOqCM);
        panelFeatureState.getInputFormats = 81;
        return true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.resetTransaction;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!android.view.ViewConfiguration.get(this.getInputFormats).hasPermanentMenuKey() || this.resetTransaction.isOverflowMenuShowPending())) {
            android.view.Window.Callback outputFormats = getOutputFormats();
            if (!this.resetTransaction.isOverflowMenuShowing() || !z) {
                if (outputFormats == null || this.getInputSizeshNQ4ISI) {
                    return;
                }
                if (this.getOutputSizeshNQ4ISI && (this.getOutputStallDurationlomOqCM & 1) != 0) {
                    this.isOutputSupportedForhNQ4ISI.getDecorView().removeCallbacks(this.updateUI);
                    this.updateUI.run();
                }
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, true);
                if (Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM == null || Camera2StreamConfigurationMap.getOutputSizes || !outputFormats.onPreparePanel(0, Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges, Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM)) {
                    return;
                }
                outputFormats.onMenuOpened(108, Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM);
                this.resetTransaction.showOverflowMenu();
                return;
            }
            this.resetTransaction.hideOverflowMenu();
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            outputFormats.onPanelClosed(108, Camera2StreamConfigurationMap(0, true).getOutputMinFrameDurationlomOqCM);
            return;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(0, true);
        Camera2StreamConfigurationMap2.getOutputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2, false);
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap2, (android.view.KeyEvent) null);
    }

    private boolean getHighSpeedVideoFpsRanges(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        android.content.res.Resources.Theme theme;
        android.content.Context context = this.getInputFormats;
        if ((panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 0 || panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 108) && this.resetTransaction != null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = new androidx.appcompat.view.menu.MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.Camera2StreamConfigurationMap(menuBuilder);
        return true;
    }

    private boolean getHighSpeedVideoFpsRangesFor(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState) {
        if (panelFeatureState.getHighSpeedVideoFpsRanges != null) {
            panelFeatureState.getOutputStallDuration = panelFeatureState.getHighSpeedVideoFpsRanges;
            return true;
        }
        if (panelFeatureState.getOutputMinFrameDurationlomOqCM == null) {
            return false;
        }
        if (this.AMEXKernelJNI == null) {
            this.AMEXKernelJNI = new androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback();
        }
        panelFeatureState.getOutputStallDuration = (android.view.View) panelFeatureState.getHighSpeedVideoFpsRanges(this.AMEXKernelJNI);
        return panelFeatureState.getOutputStallDuration != null;
    }

    private boolean Camera2StreamConfigurationMap(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        androidx.appcompat.widget.DecorContentParent decorContentParent2;
        androidx.appcompat.widget.DecorContentParent decorContentParent3;
        if (this.getInputSizeshNQ4ISI) {
            return false;
        }
        if (panelFeatureState.getInputSizeshNQ4ISI) {
            return true;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = this.rsaCipher;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            getHighSpeedVideoFpsRanges(panelFeatureState2, false);
        }
        android.view.Window.Callback outputFormats = getOutputFormats();
        if (outputFormats != null) {
            panelFeatureState.getHighSpeedVideoFpsRanges = outputFormats.onCreatePanelView(panelFeatureState.getHighResolutionOutputSizeshNQ4ISI);
        }
        boolean z = panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 0 || panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 108;
        if (z && (decorContentParent3 = this.resetTransaction) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.getHighSpeedVideoFpsRanges == null && (!z || !(getOutputSizeshNQ4ISI() instanceof androidx.appcompat.app.ToolbarActionBar))) {
            if (panelFeatureState.getOutputMinFrameDurationlomOqCM == null || panelFeatureState.getOutputSizes) {
                if (panelFeatureState.getOutputMinFrameDurationlomOqCM == null && (!getHighSpeedVideoFpsRanges(panelFeatureState) || panelFeatureState.getOutputMinFrameDurationlomOqCM == null)) {
                    return false;
                }
                if (z && this.resetTransaction != null) {
                    if (this._BOUNDARY == null) {
                        this._BOUNDARY = new androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback();
                    }
                    this.resetTransaction.setMenu(panelFeatureState.getOutputMinFrameDurationlomOqCM, this._BOUNDARY);
                }
                panelFeatureState.getOutputMinFrameDurationlomOqCM.stopDispatchingItemsChanged();
                if (!outputFormats.onCreatePanelMenu(panelFeatureState.getHighResolutionOutputSizeshNQ4ISI, panelFeatureState.getOutputMinFrameDurationlomOqCM)) {
                    panelFeatureState.Camera2StreamConfigurationMap(null);
                    if (z && (decorContentParent = this.resetTransaction) != null) {
                        decorContentParent.setMenu(null, this._BOUNDARY);
                    }
                    return false;
                }
                panelFeatureState.getOutputSizes = false;
            }
            panelFeatureState.getOutputMinFrameDurationlomOqCM.stopDispatchingItemsChanged();
            if (panelFeatureState.getHighSpeedVideoFpsRangesFor != null) {
                panelFeatureState.getOutputMinFrameDurationlomOqCM.restoreActionViewStates(panelFeatureState.getHighSpeedVideoFpsRangesFor);
                panelFeatureState.getHighSpeedVideoFpsRangesFor = null;
            }
            if (!outputFormats.onPreparePanel(0, panelFeatureState.getHighSpeedVideoFpsRanges, panelFeatureState.getOutputMinFrameDurationlomOqCM)) {
                if (z && (decorContentParent2 = this.resetTransaction) != null) {
                    decorContentParent2.setMenu(null, this._BOUNDARY);
                }
                panelFeatureState.getOutputMinFrameDurationlomOqCM.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.qwertyMode = android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.getOutputMinFrameDurationlomOqCM.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.getOutputMinFrameDurationlomOqCM.startDispatchingItemsChanged();
        }
        panelFeatureState.getInputSizeshNQ4ISI = true;
        panelFeatureState.getOutputMinFrameDuration = false;
        this.rsaCipher = panelFeatureState;
        return true;
    }

    void getHighSpeedVideoFpsRanges(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        if (this.kernelVersion) {
            return;
        }
        this.kernelVersion = true;
        this.resetTransaction.dismissPopups();
        android.view.Window.Callback outputFormats = getOutputFormats();
        if (outputFormats != null && !this.getInputSizeshNQ4ISI) {
            outputFormats.onPanelClosed(108, menuBuilder);
        }
        this.kernelVersion = false;
    }

    void getHighSpeedVideoSizes(int i) {
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(i, true), true);
    }

    void getHighSpeedVideoFpsRanges(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, boolean z) {
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        if (z && panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 0 && (decorContentParent = this.resetTransaction) != null && decorContentParent.isOverflowMenuShowing()) {
            getHighSpeedVideoFpsRanges(panelFeatureState.getOutputMinFrameDurationlomOqCM);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.getInputFormats.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        if (windowManager != null && panelFeatureState.getOutputFormats && panelFeatureState.Camera2StreamConfigurationMap != null) {
            windowManager.removeView(panelFeatureState.Camera2StreamConfigurationMap);
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI(panelFeatureState.getHighResolutionOutputSizeshNQ4ISI, panelFeatureState, null);
            }
        }
        panelFeatureState.getInputSizeshNQ4ISI = false;
        panelFeatureState.getOutputMinFrameDuration = false;
        panelFeatureState.getOutputFormats = false;
        panelFeatureState.getOutputStallDuration = null;
        panelFeatureState.getOutputSizeshNQ4ISI = true;
        if (this.rsaCipher == panelFeatureState) {
            this.rsaCipher = null;
        }
        if (panelFeatureState.getHighResolutionOutputSizeshNQ4ISI == 0) {
            getOutputMinFrameDurationlomOqCM();
        }
    }

    private boolean getHighSpeedVideoSizes(int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, true);
        if (Camera2StreamConfigurationMap.getOutputFormats) {
            return false;
        }
        return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (Camera2StreamConfigurationMap(r2, r5) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoFpsRanges(int i, android.view.KeyEvent keyEvent) {
        android.media.AudioManager audioManager;
        androidx.appcompat.widget.DecorContentParent decorContentParent;
        if (this.getHighSpeedVideoSizes != null) {
            return false;
        }
        boolean z = true;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, true);
        if (i == 0 && (decorContentParent = this.resetTransaction) != null && decorContentParent.canShowOverflowMenu() && !android.view.ViewConfiguration.get(this.getInputFormats).hasPermanentMenuKey()) {
            if (!this.resetTransaction.isOverflowMenuShowing()) {
                if (!this.getInputSizeshNQ4ISI && Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, keyEvent)) {
                    z = this.resetTransaction.showOverflowMenu();
                }
                z = false;
            } else {
                z = this.resetTransaction.hideOverflowMenu();
            }
        } else if (Camera2StreamConfigurationMap.getOutputFormats || Camera2StreamConfigurationMap.getOutputMinFrameDuration) {
            boolean z2 = Camera2StreamConfigurationMap.getOutputFormats;
            getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, true);
            z = z2;
        } else {
            if (Camera2StreamConfigurationMap.getInputSizeshNQ4ISI) {
                if (Camera2StreamConfigurationMap.getOutputSizes) {
                    Camera2StreamConfigurationMap.getInputSizeshNQ4ISI = false;
                }
                getHighSpeedVideoSizes(Camera2StreamConfigurationMap, keyEvent);
            }
            z = false;
        }
        if (z && (audioManager = (android.media.AudioManager) this.getInputFormats.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z;
    }

    void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, android.view.Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.free;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.getOutputMinFrameDurationlomOqCM;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.getOutputFormats) && !this.getInputSizeshNQ4ISI) {
            this.b.Camera2StreamConfigurationMap(this.isOutputSupportedForhNQ4ISI.getCallback(), i, menu);
        }
    }

    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState getHighSpeedVideoFpsRangesFor(android.view.Menu menu) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.free;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.getOutputMinFrameDurationlomOqCM == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    protected androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap(int i, boolean z) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = this.free;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr2 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                java.lang.System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.free = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState panelFeatureState, int i, android.view.KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.getInputSizeshNQ4ISI || Camera2StreamConfigurationMap(panelFeatureState, keyEvent)) && panelFeatureState.getOutputMinFrameDurationlomOqCM != null) {
            z = panelFeatureState.getOutputMinFrameDurationlomOqCM.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.resetTransaction == null) {
            getHighSpeedVideoFpsRanges(panelFeatureState, true);
        }
        return z;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        this.getOutputStallDurationlomOqCM = (1 << i) | this.getOutputStallDurationlomOqCM;
        if (this.getOutputSizeshNQ4ISI) {
            return;
        }
        androidx.core.view.ViewCompat.postOnAnimation(this.isOutputSupportedForhNQ4ISI.getDecorView(), this.updateUI);
        this.getOutputSizeshNQ4ISI = true;
    }

    void getHighSpeedVideoFpsRangesFor(int i) {
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap;
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i, true);
        if (Camera2StreamConfigurationMap2.getOutputMinFrameDurationlomOqCM != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            Camera2StreamConfigurationMap2.getOutputMinFrameDurationlomOqCM.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRangesFor = bundle;
            }
            Camera2StreamConfigurationMap2.getOutputMinFrameDurationlomOqCM.stopDispatchingItemsChanged();
            Camera2StreamConfigurationMap2.getOutputMinFrameDurationlomOqCM.clear();
        }
        Camera2StreamConfigurationMap2.getOutputSizes = true;
        Camera2StreamConfigurationMap2.getOutputSizeshNQ4ISI = true;
        if ((i != 108 && i != 0) || this.resetTransaction == null || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, false)) == null) {
            return;
        }
        Camera2StreamConfigurationMap.getInputSizeshNQ4ISI = false;
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, (android.view.KeyEvent) null);
    }

    final int getHighSpeedVideoFpsRangesFor(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.graphics.Rect rect) {
        int i;
        boolean z;
        boolean z2;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i = rect != null ? rect.top : 0;
        }
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.getHighSpeedVideoFpsRangesFor;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.getHighSpeedVideoFpsRangesFor.getLayoutParams();
            if (this.getHighSpeedVideoFpsRangesFor.isShown()) {
                if (this.start == null) {
                    this.start = new android.graphics.Rect();
                    this.setup = new android.graphics.Rect();
                }
                android.graphics.Rect rect2 = this.start;
                android.graphics.Rect rect3 = this.setup;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(this.isOutputSupportedFor, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                androidx.core.view.WindowInsetsCompat rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(this.isOutputSupportedFor);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && this.version == null) {
                    android.view.View view = new android.view.View(this.getInputFormats);
                    this.version = view;
                    view.setVisibility(8);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.isOutputSupportedFor.addView(this.version, -1, layoutParams);
                } else {
                    android.view.View view2 = this.version;
                    if (view2 != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.version.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                android.view.View view3 = this.version;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    getHighSpeedVideoSizes(this.version);
                }
                if (!this.unwrapAs && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.getHighSpeedVideoFpsRangesFor.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view4 = this.version;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void getHighSpeedVideoSizes(android.view.View view) {
        int color;
        if ((androidx.core.view.ViewCompat.getWindowSystemUiVisibility(view) & 8192) != 0) {
            color = androidx.core.content.ContextCompat.getColor(this.getInputFormats, androidx.appcompat.R.color.abc_decor_view_status_guard_light);
        } else {
            color = androidx.core.content.ContextCompat.getColor(this.getInputFormats, androidx.appcompat.R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    private void CoroutineDebuggingKt() {
        if (this.AMEXKernelProvider) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.appcompat.widget.DecorContentParent decorContentParent = this.resetTransaction;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            this.isOutputSupportedForhNQ4ISI.getDecorView().removeCallbacks(this.getValidOutputFormatsForInputhNQ4ISI);
            if (this.getHighSpeedVideoFpsRanges.isShowing()) {
                try {
                    this.getHighSpeedVideoFpsRanges.dismiss();
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            this.getHighSpeedVideoFpsRanges = null;
        }
        getInputSizeshNQ4ISI();
        androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(0, false);
        if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM == null) {
            return;
        }
        Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM.close();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context getContextForDelegate() {
        return this.getInputFormats;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    boolean getHighSpeedVideoFpsRangesFor() {
        if (Camera2StreamConfigurationMap(this.getInputFormats) && getHighSpeedVideoFpsRanges() != null && !getHighSpeedVideoFpsRanges().equals(Camera2StreamConfigurationMap())) {
            getOutputMinFrameDuration(this.getInputFormats);
        }
        return getHighSpeedVideoFpsRangesFor(true);
    }

    private boolean getHighSpeedVideoFpsRangesFor(boolean z) {
        return getHighResolutionOutputSizeshNQ4ISI(z, true);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2) {
        if (this.getInputSizeshNQ4ISI) {
            return false;
        }
        int isOutputSupportedFor = isOutputSupportedFor();
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getInputFormats, isOutputSupportedFor);
        androidx.core.os.LocaleListCompat highSpeedVideoSizesFor = android.os.Build.VERSION.SDK_INT < 33 ? getHighSpeedVideoSizesFor(this.getInputFormats) : null;
        if (!z2 && highSpeedVideoSizesFor != null) {
            highSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor(this.getInputFormats.getResources().getConfiguration());
        }
        boolean highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, highSpeedVideoSizesFor, z);
        if (isOutputSupportedFor == 0) {
            getOutputFormats(this.getInputFormats).getHighSpeedVideoFpsRangesFor();
        } else {
            androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager = this.d;
            if (autoNightModeManager != null) {
                autoNightModeManager.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        if (isOutputSupportedFor == 3) {
            getInputSizeshNQ4ISI(this.getInputFormats).getHighSpeedVideoFpsRangesFor();
            return highSpeedVideoFpsRanges2;
        }
        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager autoNightModeManager2 = this.init;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.getHighResolutionOutputSizeshNQ4ISI();
        }
        return highSpeedVideoFpsRanges2;
    }

    androidx.core.os.LocaleListCompat getHighSpeedVideoSizesFor(android.content.Context context) {
        androidx.core.os.LocaleListCompat highSpeedVideoFpsRanges;
        if (android.os.Build.VERSION.SDK_INT >= 33 || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges()) == null) {
            return null;
        }
        androidx.core.os.LocaleListCompat highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.LocaleListCompat highSpeedVideoSizes = androidx.appcompat.app.LocaleOverlayHelper.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor);
        return highSpeedVideoSizes.isEmpty() ? highSpeedVideoFpsRangesFor : highSpeedVideoSizes;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        if (this.sha1 != i) {
            this.sha1 = i;
            if (this.c) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.sha1;
    }

    int getHighSpeedVideoFpsRanges(android.content.Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return getOutputFormats(context).getHighSpeedVideoSizes();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return getInputSizeshNQ4ISI(context).getHighSpeedVideoSizes();
                }
                throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    private int isOutputSupportedFor() {
        int i = this.sha1;
        return i != -100 ? i : getDefaultNightMode();
    }

    void getHighSpeedVideoFpsRangesFor(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
        androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getHighSpeedVideoFpsRangesFor(configuration, localeListCompat);
    }

    androidx.core.os.LocaleListCompat getHighSpeedVideoFpsRangesFor(android.content.res.Configuration configuration) {
        return androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getHighSpeedVideoSizes(configuration);
    }

    void getHighSpeedVideoFpsRangesFor(androidx.core.os.LocaleListCompat localeListCompat) {
        androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getHighSpeedVideoSizes(localeListCompat);
    }

    private android.content.res.Configuration getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, int i, androidx.core.os.LocaleListCompat localeListCompat, android.content.res.Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            getHighSpeedVideoFpsRangesFor(configuration2, localeListCompat);
        }
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoFpsRanges(int i, androidx.core.os.LocaleListCompat localeListCompat, boolean z) {
        boolean z2;
        android.content.res.Configuration highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, i, localeListCompat, null, false);
        int inputFormats = getInputFormats(this.getInputFormats);
        android.content.res.Configuration configuration = this.exchange;
        if (configuration == null) {
            configuration = this.getInputFormats.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode;
        int i3 = highResolutionOutputSizeshNQ4ISI.uiMode & 48;
        androidx.core.os.LocaleListCompat highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(configuration);
        androidx.core.os.LocaleListCompat highSpeedVideoFpsRangesFor2 = localeListCompat == null ? null : getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
        int i4 = (i2 & 48) != i3 ? 512 : 0;
        if (highSpeedVideoFpsRangesFor2 != null && !highSpeedVideoFpsRangesFor.equals(highSpeedVideoFpsRangesFor2)) {
            i4 |= 8196;
        }
        boolean z3 = true;
        if (((~inputFormats) & i4) != 0 && z && this.c && (accessartificialFrame || this.release)) {
            java.lang.Object obj = this.getOutputStallDuration;
            if ((obj instanceof android.app.Activity) && !((android.app.Activity) obj).isChild()) {
                if (android.os.Build.VERSION.SDK_INT >= 31 && (i4 & 8192) != 0) {
                    ((android.app.Activity) this.getOutputStallDuration).getWindow().getDecorView().setLayoutDirection(highResolutionOutputSizeshNQ4ISI.getLayoutDirection());
                }
                androidx.core.app.ActivityCompat.recreate((android.app.Activity) this.getOutputStallDuration);
                z2 = true;
                if (!z2 || i4 == 0) {
                    z3 = z2;
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(i3, highSpeedVideoFpsRangesFor2, (i4 & inputFormats) == i4, (android.content.res.Configuration) null);
                }
                if (z3) {
                    java.lang.Object obj2 = this.getOutputStallDuration;
                    if (obj2 instanceof androidx.appcompat.app.AppCompatActivity) {
                        if ((i4 & 512) != 0) {
                            ((androidx.appcompat.app.AppCompatActivity) obj2).onNightModeChanged(i);
                        }
                        if ((i4 & 4) != 0) {
                            ((androidx.appcompat.app.AppCompatActivity) this.getOutputStallDuration).onLocalesChanged(localeListCompat);
                        }
                    }
                }
                if (highSpeedVideoFpsRangesFor2 != null) {
                    getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(this.getInputFormats.getResources().getConfiguration()));
                }
                return z3;
            }
        }
        z2 = false;
        if (z2) {
        }
        z3 = z2;
        if (z3) {
        }
        if (highSpeedVideoFpsRangesFor2 != null) {
        }
        return z3;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.core.os.LocaleListCompat localeListCompat, boolean z, android.content.res.Configuration configuration) {
        android.content.res.Resources resources = this.getInputFormats.getResources();
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            getHighSpeedVideoFpsRangesFor(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = this.newContext;
        if (i2 != 0) {
            this.getInputFormats.setTheme(i2);
            this.getInputFormats.getTheme().applyStyle(this.newContext, true);
        }
        if (z && (this.getOutputStallDuration instanceof android.app.Activity)) {
            Camera2StreamConfigurationMap(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Camera2StreamConfigurationMap(android.content.res.Configuration configuration) {
        android.app.Activity activity = (android.app.Activity) this.getOutputStallDuration;
        if (activity instanceof androidx.view.LifecycleOwner) {
            if (((androidx.view.LifecycleOwner) activity).getLifecycleRegistry().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.release || this.getInputSizeshNQ4ISI) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getOutputFormats(android.content.Context context) {
        if (this.d == null) {
            this.d = new androidx.appcompat.app.AppCompatDelegateImpl.AutoTimeNightModeManager(androidx.appcompat.app.TwilightManager.getHighSpeedVideoFpsRangesFor(context));
        }
        return this.d;
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getInputSizeshNQ4ISI(android.content.Context context) {
        if (this.init == null) {
            this.init = new androidx.appcompat.app.AppCompatDelegateImpl.AutoBatteryNightModeManager(context);
        }
        return this.init;
    }

    private int getInputFormats(android.content.Context context) {
        if (!this._CREATION && (this.getOutputStallDuration instanceof android.app.Activity)) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(context, this.getOutputStallDuration.getClass()), android.os.Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = activityInfo.configChanges;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = 0;
            }
        }
        this._CREATION = true;
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    class ActionModeCallbackWrapperV9 implements androidx.appcompat.view.ActionMode.Callback {
        private androidx.appcompat.view.ActionMode.Callback getHighSpeedVideoFpsRanges;

        public ActionModeCallbackWrapperV9(androidx.appcompat.view.ActionMode.Callback callback) {
            this.getHighSpeedVideoFpsRanges = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            return this.getHighSpeedVideoFpsRanges.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, android.view.Menu menu) {
            androidx.core.view.ViewCompat.requestApplyInsets(androidx.appcompat.app.AppCompatDelegateImpl.this.isOutputSupportedFor);
            return this.getHighSpeedVideoFpsRanges.onPrepareActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.getHighSpeedVideoFpsRanges.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
            this.getHighSpeedVideoFpsRanges.onDestroyActionMode(actionMode);
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.isOutputSupportedForhNQ4ISI.getDecorView().removeCallbacks(androidx.appcompat.app.AppCompatDelegateImpl.this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.getInputSizeshNQ4ISI();
                androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
                appCompatDelegateImpl.getOutputFormats = androidx.core.view.ViewCompat.animate(appCompatDelegateImpl.getHighSpeedVideoFpsRangesFor).alpha(0.0f);
                androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats.setListener(new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(android.view.View view) {
                        androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.setVisibility(8);
                        if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges != null) {
                            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges.dismiss();
                        } else if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.getParent() instanceof android.view.View) {
                            androidx.core.view.ViewCompat.requestApplyInsets((android.view.View) androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.getParent());
                        }
                        androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor.killMode();
                        androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats.setListener(null);
                        androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats = null;
                        androidx.core.view.ViewCompat.requestApplyInsets(androidx.appcompat.app.AppCompatDelegateImpl.this.isOutputSupportedFor);
                    }
                });
            }
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizesFor != null) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizesFor.onSupportActionModeFinished(androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizes);
            }
            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizes = null;
            androidx.core.view.ViewCompat.requestApplyInsets(androidx.appcompat.app.AppCompatDelegateImpl.this.isOutputSupportedFor);
            androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputMinFrameDurationlomOqCM();
        }
    }

    final class PanelMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            androidx.appcompat.view.menu.MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl = androidx.appcompat.app.AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState highSpeedVideoFpsRangesFor = appCompatDelegateImpl.getHighSpeedVideoFpsRangesFor(menuBuilder);
            if (highSpeedVideoFpsRangesFor != null) {
                if (z2) {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor, rootMenu);
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, true);
                } else {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, z);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            android.view.Window.Callback outputFormats;
            if (menuBuilder != menuBuilder.getRootMenu() || !androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputMinFrameDuration || (outputFormats = androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats()) == null || androidx.appcompat.app.AppCompatDelegateImpl.this.getInputSizeshNQ4ISI) {
                return true;
            }
            outputFormats.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            android.view.Window.Callback outputFormats = androidx.appcompat.app.AppCompatDelegateImpl.this.getOutputFormats();
            if (outputFormats == null) {
                return true;
            }
            outputFormats.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRanges(menuBuilder);
        }
    }

    protected static final class PanelFeatureState {
        android.view.ViewGroup Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        android.view.View getHighSpeedVideoFpsRanges;
        android.os.Bundle getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        androidx.appcompat.view.menu.ListMenuPresenter getHighSpeedVideoSizesFor;
        int getInputFormats;
        boolean getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;
        androidx.appcompat.view.menu.MenuBuilder getOutputMinFrameDurationlomOqCM;
        boolean getOutputSizes;
        boolean getOutputSizeshNQ4ISI = false;
        android.view.View getOutputStallDuration;
        android.content.Context getOutputStallDurationlomOqCM;
        int getValidOutputFormatsForInputhNQ4ISI;
        public boolean qwertyMode;
        int toString;
        int unwrapAs;

        PanelFeatureState(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final boolean hasPanelItems() {
            if (this.getOutputStallDuration == null) {
                return false;
            }
            return this.getHighSpeedVideoFpsRanges != null || this.getHighSpeedVideoSizesFor.getAdapter().getCount() > 0;
        }

        public final void clearMenuPresenters() {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.getOutputMinFrameDurationlomOqCM;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.getHighSpeedVideoSizesFor);
            }
            this.getHighSpeedVideoSizesFor = null;
        }

        final void getHighSpeedVideoFpsRanges(android.content.Context context) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.getOutputStallDurationlomOqCM = contextThemeWrapper;
            android.content.res.TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            this.getHighSpeedVideoSizes = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.getValidOutputFormatsForInputhNQ4ISI = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        final void Camera2StreamConfigurationMap(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter;
            androidx.appcompat.view.menu.MenuBuilder menuBuilder2 = this.getOutputMinFrameDurationlomOqCM;
            if (menuBuilder != menuBuilder2) {
                if (menuBuilder2 != null) {
                    menuBuilder2.removeMenuPresenter(this.getHighSpeedVideoSizesFor);
                }
                this.getOutputMinFrameDurationlomOqCM = menuBuilder;
                if (menuBuilder == null || (listMenuPresenter = this.getHighSpeedVideoSizesFor) == null) {
                    return;
                }
                menuBuilder.addMenuPresenter(listMenuPresenter);
            }
        }

        final androidx.appcompat.view.menu.MenuView getHighSpeedVideoFpsRanges(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                return null;
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter = new androidx.appcompat.view.menu.ListMenuPresenter(this.getOutputStallDurationlomOqCM, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.getHighSpeedVideoSizesFor = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.getOutputMinFrameDurationlomOqCM.addMenuPresenter(this.getHighSpeedVideoSizesFor);
            }
            return this.getHighSpeedVideoSizesFor.getMenuView(this.Camera2StreamConfigurationMap);
        }

        /* loaded from: classes5.dex */
        static class SavedState implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                    return androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.getHighSpeedVideoSizes(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(android.os.Parcel parcel) {
                    return androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.getHighSpeedVideoSizes(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int i) {
                    return new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
                }
            };
            android.os.Bundle Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            boolean getHighSpeedVideoSizes;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
                parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
                parcel.writeInt(this.getHighSpeedVideoSizes ? 1 : 0);
                if (this.getHighSpeedVideoSizes) {
                    parcel.writeBundle(this.Camera2StreamConfigurationMap);
                }
            }

            static androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState getHighSpeedVideoSizes(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState savedState = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState();
                savedState.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.getHighSpeedVideoSizes = z;
                if (z) {
                    savedState.Camera2StreamConfigurationMap = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    class ListMenuDecorView extends androidx.appcompat.widget.ContentFrameLayout {
        public ListMenuDecorView(android.content.Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            return androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizes(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && getHighResolutionOutputSizeshNQ4ISI((int) motionEvent.getX(), (int) motionEvent.getY())) {
                androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizes(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    class AppCompatWindowCallback extends androidx.appcompat.view.WindowCallbackWrapper {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback getHighSpeedVideoFpsRanges;
        private boolean getOutputFormats;

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        AppCompatWindowCallback(android.view.Window.Callback callback) {
            super(callback);
        }

        void Camera2StreamConfigurationMap(androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback actionBarMenuCallback) {
            this.getHighSpeedVideoFpsRanges = actionBarMenuCallback;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            return androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizes(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoFpsRangesFor(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.View onCreatePanelView(int i) {
            android.view.View highSpeedVideoSizes;
            androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback actionBarMenuCallback = this.getHighSpeedVideoFpsRanges;
            return (actionBarMenuCallback == null || (highSpeedVideoSizes = actionBarMenuCallback.getHighSpeedVideoSizes(i)) == null) ? super.onCreatePanelView(i) : highSpeedVideoSizes;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.Camera2StreamConfigurationMap) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = menu instanceof androidx.appcompat.view.menu.MenuBuilder ? (androidx.appcompat.view.menu.MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback actionBarMenuCallback = this.getHighSpeedVideoFpsRanges;
            boolean z = actionBarMenuCallback != null && actionBarMenuCallback.getHighSpeedVideoFpsRangesFor(i);
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return z;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, android.view.Menu menu) {
            super.onMenuOpened(i, menu);
            androidx.appcompat.app.AppCompatDelegateImpl.this.getHighResolutionOutputSizeshNQ4ISI(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, android.view.Menu menu) {
            if (this.getOutputFormats) {
                getWrapped().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                androidx.appcompat.app.AppCompatDelegateImpl.this.Camera2StreamConfigurationMap(i);
            }
        }

        final android.view.ActionMode getHighSpeedVideoFpsRangesFor(android.view.ActionMode.Callback callback) {
            androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper callbackWrapper = new androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper(androidx.appcompat.app.AppCompatDelegateImpl.this.getInputFormats, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = androidx.appcompat.app.AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            if (androidx.appcompat.app.AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) {
                return getHighSpeedVideoFpsRangesFor(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i) {
            androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState Camera2StreamConfigurationMap = androidx.appcompat.app.AppCompatDelegateImpl.this.Camera2StreamConfigurationMap(0, true);
            if (Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM != null) {
                super.onProvideKeyboardShortcuts(list, Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public void getHighSpeedVideoFpsRangesFor(android.view.Window.Callback callback) {
            try {
                this.Camera2StreamConfigurationMap = true;
                callback.onContentChanged();
            } finally {
                this.Camera2StreamConfigurationMap = false;
            }
        }

        public boolean getHighSpeedVideoFpsRanges(android.view.Window.Callback callback, android.view.KeyEvent keyEvent) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }

        public void Camera2StreamConfigurationMap(android.view.Window.Callback callback, int i, android.view.Menu menu) {
            try {
                this.getOutputFormats = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.getOutputFormats = false;
            }
        }
    }

    abstract class AutoNightModeManager {
        private android.content.BroadcastReceiver getHighSpeedVideoSizes;

        abstract android.content.IntentFilter Camera2StreamConfigurationMap();

        abstract void getHighSpeedVideoFpsRanges();

        abstract int getHighSpeedVideoSizes();

        AutoNightModeManager() {
        }

        void getHighSpeedVideoFpsRangesFor() {
            getHighResolutionOutputSizeshNQ4ISI();
            android.content.IntentFilter Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap.countActions() == 0) {
                return;
            }
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = new android.content.BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context, android.content.Intent intent) {
                        androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.this.getHighSpeedVideoFpsRanges();
                    }
                };
            }
            androidx.appcompat.app.AppCompatDelegateImpl.this.getInputFormats.registerReceiver(this.getHighSpeedVideoSizes, Camera2StreamConfigurationMap);
        }

        void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoSizes != null) {
                try {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getInputFormats.unregisterReceiver(this.getHighSpeedVideoSizes);
                } catch (java.lang.IllegalArgumentException unused) {
                }
                this.getHighSpeedVideoSizes = null;
            }
        }
    }

    class AutoTimeNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final androidx.appcompat.app.TwilightManager getHighSpeedVideoSizes;

        AutoTimeNightModeManager(androidx.appcompat.app.TwilightManager twilightManager) {
            super();
            this.getHighSpeedVideoSizes = twilightManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x00d5 A[RETURN] */
        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getHighSpeedVideoSizes() {
            long j;
            boolean z;
            androidx.appcompat.app.TwilightManager twilightManager = this.getHighSpeedVideoSizes;
            androidx.appcompat.app.TwilightManager.TwilightState twilightState = twilightManager.getHighResolutionOutputSizeshNQ4ISI;
            if (twilightManager.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor > java.lang.System.currentTimeMillis()) {
                z = twilightState.getHighSpeedVideoSizes;
            } else {
                android.location.Location Camera2StreamConfigurationMap = androidx.core.content.PermissionChecker.checkSelfPermission(twilightManager.Camera2StreamConfigurationMap, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? twilightManager.Camera2StreamConfigurationMap("network") : null;
                android.location.Location Camera2StreamConfigurationMap2 = androidx.core.content.PermissionChecker.checkSelfPermission(twilightManager.Camera2StreamConfigurationMap, "android.permission.ACCESS_FINE_LOCATION") == 0 ? twilightManager.Camera2StreamConfigurationMap("gps") : null;
                if (Camera2StreamConfigurationMap2 == null || Camera2StreamConfigurationMap == null ? Camera2StreamConfigurationMap2 != null : Camera2StreamConfigurationMap2.getTime() > Camera2StreamConfigurationMap.getTime()) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
                }
                if (Camera2StreamConfigurationMap == null) {
                    int i = java.util.Calendar.getInstance().get(11);
                    return (i < 6 || i >= 22) ? 2 : 1;
                }
                androidx.appcompat.app.TwilightManager.TwilightState twilightState2 = twilightManager.getHighResolutionOutputSizeshNQ4ISI;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                androidx.appcompat.app.TwilightCalculator highSpeedVideoSizes = androidx.appcompat.app.TwilightCalculator.getHighSpeedVideoSizes();
                highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(currentTimeMillis - 86400000, Camera2StreamConfigurationMap.getLatitude(), Camera2StreamConfigurationMap.getLongitude());
                highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(currentTimeMillis, Camera2StreamConfigurationMap.getLatitude(), Camera2StreamConfigurationMap.getLongitude());
                boolean z2 = highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor == 1;
                long j2 = highSpeedVideoSizes.getHighSpeedVideoSizes;
                long j3 = highSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                double latitude = Camera2StreamConfigurationMap.getLatitude();
                double longitude = Camera2StreamConfigurationMap.getLongitude();
                boolean z3 = z2;
                highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(86400000 + currentTimeMillis, latitude, longitude);
                long j4 = highSpeedVideoSizes.getHighSpeedVideoSizes;
                if (j2 == -1 || j3 == -1) {
                    j = currentTimeMillis + 43200000;
                } else {
                    if (currentTimeMillis <= j3) {
                        j4 = currentTimeMillis > j2 ? j3 : j2;
                    }
                    j = j4 + 60000;
                }
                twilightState2.getHighSpeedVideoSizes = z3;
                twilightState2.getHighSpeedVideoFpsRangesFor = j;
                z = twilightState.getHighSpeedVideoSizes;
            }
            if (z) {
                return 2;
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void getHighSpeedVideoFpsRanges() {
            androidx.appcompat.app.AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter Camera2StreamConfigurationMap() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    class AutoBatteryNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final android.os.PowerManager getHighSpeedVideoSizes;

        AutoBatteryNightModeManager(android.content.Context context) {
            super();
            this.getHighSpeedVideoSizes = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getHighSpeedVideoSizes() {
            return androidx.appcompat.app.AppCompatDelegateImpl.Api21Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void getHighSpeedVideoFpsRanges() {
            androidx.appcompat.app.AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter Camera2StreamConfigurationMap() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new androidx.appcompat.app.AppCompatDelegateImpl.ActionBarDrawableToggleImpl();
    }

    /* loaded from: classes5.dex */
    class ActionBarDrawableToggleImpl implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
            androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (android.util.AttributeSet) null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
            return androidx.appcompat.app.AppCompatDelegateImpl.this.getInputFormats();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable drawable, int i) {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            androidx.appcompat.app.ActionBar supportActionBar = androidx.appcompat.app.AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i);
            }
        }
    }

    private static android.content.res.Configuration getHighResolutionOutputSizeshNQ4ISI(android.content.res.Configuration configuration, android.content.res.Configuration configuration2) {
        android.content.res.Configuration configuration3 = new android.content.res.Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(configuration, configuration2, configuration3);
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                configuration3.screenLayout |= configuration2.screenLayout & 192;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS) != (configuration2.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)) {
                configuration3.screenLayout |= configuration2.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            }
            androidx.appcompat.app.AppCompatDelegateImpl.Api26Impl.getHighSpeedVideoSizes(configuration, configuration2, configuration3);
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }
        return configuration3;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.os.PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
            android.os.LocaleList locales = configuration.getLocales();
            android.os.LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.LocaleListCompat getHighSpeedVideoSizes(android.content.res.Configuration configuration) {
            return androidx.core.os.LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        static void getHighSpeedVideoFpsRangesFor(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
            configuration.setLocales(android.os.LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }

        public static void getHighSpeedVideoSizes(androidx.core.os.LocaleListCompat localeListCompat) {
            android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void getHighSpeedVideoSizes(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.window.OnBackInvokedCallback b_(java.lang.Object obj, final androidx.appcompat.app.AppCompatDelegateImpl appCompatDelegateImpl) {
            java.util.Objects.requireNonNull(appCompatDelegateImpl);
            android.window.OnBackInvokedCallback onBackInvokedCallback = new android.window.OnBackInvokedCallback() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    androidx.appcompat.app.AppCompatDelegateImpl.this.getHighSpeedVideoSizesFor();
                }
            };
            ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
        }

        static android.window.OnBackInvokedDispatcher a_(android.app.Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }
}
