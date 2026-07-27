package com.chartboost.sdk.view;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.chartboost.sdk.impl.dl;
import com.chartboost.sdk.impl.ke;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.xf;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import com.ironsource.U3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/chartboost/sdk/view/FullscreenAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", U3.i.u0, "onDestroy", "a", "", "Ljava/lang/String;", "auctionId", "Lcom/chartboost/sdk/impl/m;", "b", "Lcom/chartboost/sdk/impl/m;", "adContainerView", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "rootView", "Lcom/chartboost/sdk/impl/dl;", "d", "Lcom/chartboost/sdk/impl/dl;", "visibilityTracker", "", "e", "Z", "dismissable", "Landroidx/activity/OnBackPressedCallback;", "f", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullscreenAdActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String auctionId;

    /* renamed from: b, reason: from kotlin metadata */
    public m adContainerView;

    /* renamed from: c, reason: from kotlin metadata */
    public FrameLayout rootView;

    /* renamed from: d, reason: from kotlin metadata */
    public dl visibilityTracker;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean dismissable;

    /* renamed from: f, reason: from kotlin metadata */
    public final OnBackPressedCallback onBackPressedCallback = new a();

    public static final class a extends OnBackPressedCallback {
        public a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!FullscreenAdActivity.this.dismissable) {
                mb.a("Back pressed but disallowed. Ignoring.", (Throwable) null, 2, (Object) null);
                return;
            }
            m mVar = FullscreenAdActivity.this.adContainerView;
            if (mVar != null) {
                mVar.k();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        this.rootView = (FrameLayout) findViewById(R.id.content);
        String stringExtra = getIntent().getStringExtra("com.chartboost.sdk.internal.AdController.AdContainerMap");
        this.auctionId = stringExtra;
        if (stringExtra == null) {
            mb.e("Fullscreen activity launched without auction id (likely OS relaunch). Finishing.", null, 2, null);
            finish();
            return;
        }
        o.d dVar = (o.d) o.w.a().get(stringExtra);
        if (dVar == null || !dVar.a().complete(Boolean.TRUE)) {
            mb.e("Fullscreen activity claim failed (timeout already won or stale launch). Finishing.", null, 2, null);
            finish();
            return;
        }
        m b2 = dVar.b();
        this.adContainerView = b2;
        final l adContainerListener$ChartboostMonetization_9_13_0_release = b2.getAdContainerListener$ChartboostMonetization_9_13_0_release();
        b2.setAdContainerListener$ChartboostMonetization_9_13_0_release(new b(adContainerListener$ChartboostMonetization_9_13_0_release, this, b2));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        View a2 = dl.r.a(this, b2);
        if (a2 == null) {
            a2 = b2.getRootView();
        }
        View view = a2;
        Intrinsics.checkNotNull(view);
        dl dlVar = new dl(this, b2, view, 1, 0, 100L, 25, false, 128, null);
        this.visibilityTracker = dlVar;
        dlVar.a(new dl.b() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.dl.b
            public final void a() {
                FullscreenAdActivity.a(l.this);
            }
        });
        dl dlVar2 = this.visibilityTracker;
        if (dlVar2 != null) {
            dlVar2.i();
        }
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(b2);
        }
        b2.y();
        getOnBackPressedDispatcher().addCallback(this.onBackPressedCallback);
        if (b2.n()) {
            this.dismissable = true;
        }
        b2.p();
        a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dl dlVar = this.visibilityTracker;
        if (dlVar != null) {
            dlVar.b();
        }
        this.visibilityTracker = null;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        m mVar = this.adContainerView;
        if (mVar != null) {
            mVar.l();
        }
        m mVar2 = this.adContainerView;
        if (mVar2 != null) {
            mVar2.setAdContainerListener$ChartboostMonetization_9_13_0_release(null);
        }
        this.adContainerView = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f5143a;
        public final /* synthetic */ FullscreenAdActivity b;
        public final /* synthetic */ m c;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5144a;

            static {
                int[] iArr = new int[ke.values().length];
                try {
                    iArr[ke.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ke.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ke.e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ke.d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5144a = iArr;
            }
        }

        public b(l lVar, FullscreenAdActivity fullscreenAdActivity, m mVar) {
            this.f5143a = lVar;
            this.b = fullscreenAdActivity;
            this.c = mVar;
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            this.b.finish();
            this.c.setAdContainerListener$ChartboostMonetization_9_13_0_release(null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.b();
            } else {
                mb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.c();
            } else {
                mb.e("AdContainerListener null when onAdShown()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.d();
            } else {
                mb.e("AdContainerListener null when onAdClicked()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            this.b.finish();
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.e();
            } else {
                mb.e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
            this.c.setAdContainerListener$ChartboostMonetization_9_13_0_release(null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void f() {
            this.b.dismissable = true;
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ke request) {
            Intrinsics.checkNotNullParameter(request, "request");
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.a(request);
            }
            int i = this.b.getResources().getConfiguration().orientation;
            int i2 = -1;
            int i3 = i != 1 ? i != 2 ? -1 : 6 : 1;
            FullscreenAdActivity fullscreenAdActivity = this.b;
            int i4 = a.f5144a[request.ordinal()];
            if (i4 == 1) {
                i2 = i3;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i2 = 1;
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 6;
                }
            }
            fullscreenAdActivity.setRequestedOrientation(i2);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            ContextCompat.startActivity(this.b, new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ExpirationReason expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            l lVar = this.f5143a;
            if (lVar != null) {
                lVar.a(expirationReason);
            } else {
                mb.e("AdContainerListener null when onAdExpired()", null, 2, null);
            }
        }
    }

    public static final void a(l lVar) {
        if (lVar != null) {
            lVar.c();
        }
    }

    public final void a() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FullscreenAdActivity.a(FullscreenAdActivity.this, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(FullscreenAdActivity fullscreenAdActivity, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        mb.a("WindowInsets updated: " + insets, (Throwable) null, 2, (Object) null);
        m mVar = fullscreenAdActivity.adContainerView;
        if (mVar != null) {
            mVar.setRenderingContainerCalculator(new xf(fullscreenAdActivity));
        }
        return insets;
    }
}
