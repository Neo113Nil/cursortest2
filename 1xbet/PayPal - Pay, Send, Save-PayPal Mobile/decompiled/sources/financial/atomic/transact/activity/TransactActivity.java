package financial.atomic.transact.activity;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lfinancial/atomic/transact/activity/TransactActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "Companion", "financial/atomic/b/a", "transact_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final financial.atomic.b.a Companion = new financial.atomic.b.a(null);
    public boolean b;
    public financial.atomic.transact.Transact d;

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.b.b f6893a = new financial.atomic.b.b(this);
    public final financial.atomic.b.e c = new financial.atomic.b.e(this);

    public static android.webkit.WebView a(android.view.View view) {
        if ((view instanceof financial.atomic.f.a) || (view instanceof financial.atomic.f.b)) {
            return (android.webkit.WebView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(childAt);
            android.webkit.WebView a2 = a(childAt);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        com.google.android.play.core.splitcompat.SplitCompat.installActivity(this);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @kotlin.Deprecated(message = "Use OnBackPressedDispatcher instead")
    public final void onBackPressed() {
        if (a()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "");
        super.onConfigurationChanged(newConfig);
        final android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(financial.atomic.transact.R.id.TransactLayout);
        if (frameLayout == null) {
            return;
        }
        frameLayout.requestLayout();
        frameLayout.post(new java.lang.Runnable() { // from class: financial.atomic.transact.activity.TransactActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                financial.atomic.transact.activity.TransactActivity.a(frameLayout, this);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(10);
        setContentView(financial.atomic.transact.R.layout.activity_transact);
        getGetHighResolutionOutputSizeshNQ4ISI().addCallback(this, new financial.atomic.b.f(this));
        bindService(new android.content.Intent(this, (java.lang.Class<?>) financial.atomic.transact.service.TransactService.class), this.c, 1);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f6893a, new android.content.IntentFilter(financial.atomic.transact.Transact.INSTANCE.getACTION_EVENT()), 4);
        } else {
            registerReceiver(this.f6893a, new android.content.IntentFilter(financial.atomic.transact.Transact.INSTANCE.getACTION_EVENT()));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        try {
            unregisterReceiver(this.f6893a);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        if (this.b) {
            unbindService(this.c);
            this.b = false;
        }
        ((android.widget.FrameLayout) findViewById(financial.atomic.transact.R.id.TransactLayout)).removeAllViews();
        super.onDestroy();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level >= 10) {
            if (this.d != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", "memory-warning");
                jSONObject.put("level", level);
                financial.atomic.transact.Transact transact = this.d;
                if (transact == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    transact = null;
                }
                transact.dispatchEvent$transact_release(financial.atomic.transact.Transact.Event.LOG.getValue(), jSONObject);
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(financial.atomic.transact.R.id.TransactLayout);
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = frameLayout.getChildAt(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
                android.webkit.WebView a2 = a(childAt);
                if (a2 != null) {
                    a2.clearCache(false);
                }
            }
        }
    }

    public final boolean a() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(financial.atomic.transact.R.id.TransactLayout);
        if (frameLayout == null) {
            return false;
        }
        for (int childCount = frameLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = frameLayout.getChildAt(childCount);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
            android.webkit.WebView a2 = a(childAt);
            if (a2 != null) {
                float width = frameLayout.getWidth();
                if (a2.getVisibility() == 0 && a2.getX() >= 0.0f && a2.getX() < width && a2.onKeyDown(4, new android.view.KeyEvent(0, 4))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void a(android.widget.FrameLayout frameLayout, financial.atomic.transact.activity.TransactActivity transactActivity) {
        float width = frameLayout.getWidth();
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = frameLayout.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
            android.webkit.WebView a2 = a(childAt);
            if (a2 != null && a2.getTranslationX() > 0.0f) {
                a2.setX(width);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
