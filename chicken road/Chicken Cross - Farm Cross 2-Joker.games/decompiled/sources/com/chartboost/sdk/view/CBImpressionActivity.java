package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.m9;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.o9;
import com.chartboost.sdk.impl.qk;
import com.chartboost.sdk.impl.uf;
import com.chartboost.sdk.internal.Model.a;
import com.ironsource.U3;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/view/CBImpressionActivity;", "Landroid/app/Activity;", "Lcom/chartboost/sdk/impl/m9;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", U3.i.u0, U3.i.t0, "onDestroy", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "", "isActivityHardwareAccelerated", "()Z", "finishActivity", "Lcom/chartboost/sdk/impl/qk;", "view", "attachViewToActivity", "(Lcom/chartboost/sdk/impl/qk;)V", "getActivity", "()Lcom/chartboost/sdk/view/CBImpressionActivity;", "setFullscreen", "b", "a", "c", "Lcom/chartboost/sdk/impl/o9;", "Lcom/chartboost/sdk/impl/o9;", "presenter", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CBImpressionActivity extends Activity implements m9 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public o9 presenter;

    public final void a() {
        if (this.presenter == null) {
            if (!Chartboost.isSdkStarted()) {
                mb.b("Cannot start Chartboost activity due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
                finish();
                return;
            }
            b4 b4Var = b4.b;
            uf a2 = b4Var.i().a();
            Object obj = b4Var.b().b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            this.presenter = new o9(this, a2, (a) obj, b4Var.a().k());
        }
    }

    @Override // com.chartboost.sdk.impl.m9
    public void attachViewToActivity(qk view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e) {
            mb.a("Cannot attach view to activity", e);
        }
    }

    public final boolean b() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isChartboost", false);
        }
        return false;
    }

    public final void c() {
    }

    @Override // com.chartboost.sdk.impl.m9
    public void finishActivity() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.m9
    public CBImpressionActivity getActivity() {
        return this;
    }

    @Override // com.chartboost.sdk.impl.m9
    public boolean isActivityHardwareAccelerated() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        return decorView.isHardwareAccelerated();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.h();
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.b();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c();
        if (!b()) {
            mb.b("This activity cannot be called from outside chartboost SDK", (Throwable) null, 2, (Object) null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        a();
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.c();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.d();
        }
        this.presenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.e();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.f();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o9 o9Var = this.presenter;
        if (o9Var != null) {
            o9Var.g();
        }
    }

    @Override // com.chartboost.sdk.impl.m9
    public void setFullscreen() {
        View decorView;
        Window window;
        WindowManager.LayoutParams attributes;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setDecorFitsSystemWindows(true);
                    WindowInsetsController insetsController = window2.getInsetsController();
                    if (insetsController != null) {
                        insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window3 = getWindow();
                if (window3 != null && (decorView = window3.getDecorView()) != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
            if (i < 28 || (window = getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return;
            }
            attributes.layoutInDisplayCutoutMode = 1;
        } catch (Exception e) {
            mb.a("Cannot set view to fullscreen", e);
        }
    }
}
