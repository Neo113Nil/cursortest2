package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C4324ag;
import com.ironsource.C4491k4;
import com.ironsource.Mf;
import com.ironsource.P8;
import com.ironsource.Vf;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TestSuiteActivity extends Activity implements P8 {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f8440a;
    private C4324ag b;
    private Vf c;
    private OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject d() {
        JSONObject jSONObject;
        String b = new Mf().b(this);
        if (b != null) {
            try {
                if (b.length() != 0) {
                    jSONObject = new JSONObject(b);
                    return jSONObject;
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        jSONObject = new JSONObject();
        return jSONObject;
    }

    private final RelativeLayout.LayoutParams e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.f8440a;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets a2;
                    a2 = TestSuiteActivity.a(view, windowInsets);
                    return a2;
                }
            });
            RelativeLayout relativeLayout3 = this.f8440a;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            } else {
                relativeLayout2 = relativeLayout3;
            }
            relativeLayout2.requestApplyInsets();
        }
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f8440a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.P8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f8440a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C4324ag c4324ag = new C4324ag(this, this, d(), c());
        this.b = c4324ag;
        Vf vf = new Vf(c4324ag);
        this.c = vf;
        vf.d();
        RelativeLayout relativeLayout2 = this.f8440a;
        C4324ag c4324ag2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        C4324ag c4324ag3 = this.b;
        if (c4324ag3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c4324ag2 = c4324ag3;
        }
        relativeLayout2.addView(c4324ag2.d(), e());
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f();
        Vf vf = this.c;
        C4324ag c4324ag = null;
        if (vf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            vf = null;
        }
        vf.a();
        RelativeLayout relativeLayout = this.f8440a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        C4324ag c4324ag2 = this.b;
        if (c4324ag2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c4324ag = c4324ag2;
        }
        c4324ag.a();
        super.onDestroy();
    }

    @Override // com.ironsource.P8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(TestSuiteActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4324ag c4324ag = this$0.b;
        C4324ag c4324ag2 = null;
        if (c4324ag == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            c4324ag = null;
        }
        if (c4324ag.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f8440a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            C4324ag c4324ag3 = this$0.b;
            if (c4324ag3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c4324ag3 = null;
            }
            relativeLayout.removeView(c4324ag3.d());
            RelativeLayout relativeLayout2 = this$0.f8440a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            C4324ag c4324ag4 = this$0.b;
            if (c4324ag4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c4324ag4 = null;
            }
            relativeLayout2.addView(c4324ag4.c(), this$0.e());
            C4324ag c4324ag5 = this$0.b;
            if (c4324ag5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                c4324ag2 = c4324ag5;
            }
            c4324ag2.b();
        }
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    TestSuiteActivity.b();
                }
            };
            this.d = onBackInvokedCallback;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }
}
