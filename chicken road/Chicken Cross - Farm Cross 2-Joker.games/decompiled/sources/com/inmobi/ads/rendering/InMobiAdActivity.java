package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.webkit.Profile;
import com.inmobi.ads.R;
import com.inmobi.media.A9;
import com.inmobi.media.AbstractC3727g4;
import com.inmobi.media.AbstractC3841k6;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC4237y9;
import com.inmobi.media.AbstractC4260z4;
import com.inmobi.media.Ak;
import com.inmobi.media.Ba;
import com.inmobi.media.C;
import com.inmobi.media.C3715fk;
import com.inmobi.media.C3810j3;
import com.inmobi.media.C3855kj;
import com.inmobi.media.C3979p0;
import com.inmobi.media.C4041r6;
import com.inmobi.media.C4153v6;
import com.inmobi.media.C4156v9;
import com.inmobi.media.C4180w6;
import com.inmobi.media.C4210x9;
import com.inmobi.media.C4220xj;
import com.inmobi.media.C4265z9;
import com.inmobi.media.Ck;
import com.inmobi.media.D;
import com.inmobi.media.Ej;
import com.inmobi.media.Gj;
import com.inmobi.media.Ij;
import com.inmobi.media.J4;
import com.inmobi.media.Jg;
import com.inmobi.media.K5;
import com.inmobi.media.Kc;
import com.inmobi.media.Lq;
import com.inmobi.media.Pb;
import com.inmobi.media.U7;
import com.inmobi.media.Vj;
import com.inmobi.media.Y5;
import com.inmobi.media.Y9;
import com.inmobi.media.Yb;
import com.inmobi.media.Z9;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.yq;
import com.ironsource.U3;
import com.ironsource.Wf;
import com.unity3d.ads.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/y9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InMobiAdActivity extends Activity {
    public static final SparseArray t = new SparseArray();
    public static Ej u;

    /* renamed from: a, reason: collision with root package name */
    public C4210x9 f6443a;
    public C4156v9 b;
    public Ej c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Y9 h;
    public Lq i;
    public OnBackInvokedCallback j;
    public boolean k;
    public final CoroutineScope l = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
    public Job m;
    public boolean n;
    public boolean o;
    public RelativeLayout p;
    public FrameLayout q;
    public Yb r;
    public long s;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.c();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C4153v6 c4153v6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ej ej = inMobiAdActivity.c;
        if (ej != null && (c4153v6 = ej.F0) != null) {
            C4153v6.a(c4153v6, 6, true, null, 12);
        }
        Ej ej2 = inMobiAdActivity.c;
        if (ej2 != null) {
            ej2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C4153v6 c4153v6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ej ej = inMobiAdActivity.c;
        if (ej == null || !ej.canGoBack()) {
            Ej ej2 = inMobiAdActivity.c;
            if (ej2 != null && (c4153v6 = ej2.F0) != null) {
                C4153v6.a(c4153v6, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
        } else {
            Ej ej3 = inMobiAdActivity.c;
            if (ej3 != null) {
                ej3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        Ej ej;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        Ej ej2 = inMobiAdActivity.c;
        if (ej2 != null && ej2.canGoForward() && (ej = inMobiAdActivity.c) != null) {
            ej.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        C4210x9 c4210x9 = this.f6443a;
        if (c4210x9 != null) {
            if (c4210x9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                c4210x9 = null;
            }
            c4210x9.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0155, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        int i;
        Yb yb;
        Config a2;
        Gj gj;
        String str;
        String str2;
        InMobiAdActivity inMobiAdActivity;
        Y9 y9;
        AdConfig adConfig;
        Ej ej;
        Object obj;
        super.onCreate(bundle);
        Y9 y92 = this.h;
        if (y92 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y92).a("InMobiAdActivity", "onCreate called");
        }
        if (!AbstractC3914mk.c()) {
            b();
            Y9 y93 = this.h;
            if (y93 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((Z9) y93).b("InMobiAdActivity", "session not found. close");
            }
            Kc.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f = false;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3841k6.c(this);
        }
        this.d = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f6443a = new C4210x9(this);
        String key = getIntent().getStringExtra("loggerCacheKey");
        if (key != null) {
            HashMap hashMap = AbstractC4237y9.f7497a;
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                WeakReference weakReference = (WeakReference) AbstractC4237y9.f7497a.get(key);
                obj = weakReference != null ? weakReference.get() : null;
            } catch (ClassCastException unused) {
            }
        }
        i = this.d;
        if (i == 100) {
            if (i == 102) {
                C4156v9 orientationListener = new C4156v9(this);
                Y9 logger = this.h;
                if (logger != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    orientationListener.h = logger;
                }
                C4210x9 c4210x9 = this.f6443a;
                if (c4210x9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                    c4210x9 = null;
                }
                c4210x9.getClass();
                Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                c4210x9.b.add(orientationListener);
                c4210x9.a();
                this.b = orientationListener;
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                orientationListener.a(intent, t);
            }
            return;
        }
        String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        long longExtra2 = getIntent().getLongExtra("viewTouchTimestamp", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        String stringExtra2 = getIntent().getStringExtra("impressionId");
        String stringExtra3 = getIntent().getStringExtra("creativeId");
        boolean booleanExtra2 = getIntent().getBooleanExtra("supportLockScreen", false);
        this.n = getIntent().getBooleanExtra("isImmersive", false);
        this.o = getIntent().getBooleanExtra("supportBrowserLoader", false);
        try {
        } catch (Exception unused2) {
            yb = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            yb = (Yb) getIntent().getParcelableExtra("lpTelemetryControlInfo", Yb.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("lpTelemetryControlInfo");
            if (parcelableExtra instanceof Yb) {
                yb = (Yb) parcelableExtra;
            }
            yb = null;
        }
        this.r = yb;
        if (booleanExtra2) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            getWindow().requestFeature(1);
            Y5.f6965a.getClass();
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        Gj gj2 = Ej.i1;
        Ej ej2 = u;
        if (ej2 != null) {
            gj2 = ej2.getListener();
            a2 = ej2.getAdConfig();
        } else {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            a2 = AbstractC4260z4.f7518a.a(AdConfig.class);
        }
        Gj gj3 = gj2;
        Config config = a2;
        long j = longExtra2 + 4;
        try {
            Y9 y94 = this.h;
            yq yqVar = new yq(y94);
            C3715fk c3715fk = new C3715fk(BuildConfig.FLAVOR, "browser");
            if (config == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adConfig");
                adConfig = null;
            } else {
                adConfig = (AdConfig) config;
            }
            str = "InMobiAdActivity";
            str2 = "TAG";
            try {
                ej = new Ej((Context) this, (byte) 1, (LinkedHashSet) null, stringExtra2, (String) null, j, (Ij) null, y94, c3715fk, yqVar, (C3979p0) null, adConfig, 164);
                inMobiAdActivity = this;
            } catch (Exception e) {
                e = e;
                inMobiAdActivity = this;
            }
        } catch (Exception e2) {
            e = e2;
            gj = gj3;
            str = "InMobiAdActivity";
            str2 = "TAG";
            inMobiAdActivity = this;
        }
        try {
            inMobiAdActivity.c = ej;
            ej.setPlacementId(longExtra);
            Ej ej3 = inMobiAdActivity.c;
            if (ej3 != null) {
                ej3.setCreativeId(stringExtra3);
            }
            Ej ej4 = inMobiAdActivity.c;
            if (ej4 != null) {
                ej4.setAllowAutoRedirection(booleanExtra);
            }
            Ej ej5 = inMobiAdActivity.c;
            if (ej5 != null) {
                gj = gj3;
                try {
                    ej5.a(gj);
                } catch (Exception e3) {
                    e = e3;
                    y9 = inMobiAdActivity.h;
                    if (y9 != null) {
                    }
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(e));
                    gj.c();
                    b();
                    return;
                }
            } else {
                gj = gj3;
            }
            Ej ej6 = inMobiAdActivity.c;
            if (ej6 != null) {
                ej6.setLandingPageTelemetryControlInfoOnWebViewClient(inMobiAdActivity.r);
            }
            inMobiAdActivity.a(((AdConfig) config).getCustomBrowser().getInt());
            Ej ej7 = inMobiAdActivity.c;
            if (ej7 != null) {
                ej7.setFullScreenActivityContext(inMobiAdActivity);
            }
            Ej ej8 = inMobiAdActivity.c;
            if (ej8 != null) {
                Intrinsics.checkNotNull(stringExtra);
                ej8.loadUrl(stringExtra);
            }
            C4210x9 c4210x92 = inMobiAdActivity.f6443a;
            if (c4210x92 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                c4210x92 = null;
            }
            Ej orientationListener2 = inMobiAdActivity.c;
            Intrinsics.checkNotNull(orientationListener2);
            c4210x92.getClass();
            Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
            c4210x92.b.add(orientationListener2);
            c4210x92.a();
            return;
        } catch (Exception e4) {
            e = e4;
            gj = gj3;
            y9 = inMobiAdActivity.h;
            if (y9 != null) {
                String str3 = str;
                Intrinsics.checkNotNullExpressionValue(str3, str2);
                ((Z9) y9).a(str3, "Exception while initializing In-App browser", e);
            }
            Lazy lazy2 = Ba.f6473a;
            Ba.a(new C3810j3(e));
            gj.c();
            b();
            return;
        }
        obj = null;
        this.h = (Y9) obj;
        i = this.d;
        if (i == 100) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C4156v9 c4156v9;
        Ej ej;
        C4153v6 c4153v6;
        C fullScreenEventsListener;
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onDestroy");
        }
        int i = this.d;
        if (100 == i) {
            a();
            Ej ej2 = u;
            if (ej2 != null) {
                Ej.h1.getClass();
                ej2.c(C3855kj.a("IN_CUSTOM_BROWSER", "onClose"));
            }
            u = null;
        } else if (102 == i && (c4156v9 = this.b) != null && c4156v9.e != null && c4156v9 != null) {
            Ej.h1.getClass();
            c4156v9.a(C3855kj.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.e) {
            int i2 = this.d;
            if (100 == i2) {
                Ej ej3 = this.c;
                if (ej3 != null && (fullScreenEventsListener = ej3.getFullScreenEventsListener()) != null) {
                    try {
                        C4220xj c4220xj = (C4220xj) fullScreenEventsListener;
                        Y9 y92 = c4220xj.f7481a.i;
                        if (y92 != null) {
                            String str = Ej.j1;
                            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                            ((Z9) y92).a(str, Wf.m);
                        }
                        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, c4220xj.f7481a.getViewState())) {
                            c4220xj.f7481a.setAndUpdateViewState("Hidden");
                        }
                        c4220xj.f7481a.Y();
                        Ej ej4 = this.c;
                        Intrinsics.checkNotNull(ej4);
                        ej4.b();
                        C4210x9 c4210x9 = this.f6443a;
                        if (c4210x9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                            c4210x9 = null;
                        }
                        Ej orientationListener = this.c;
                        Intrinsics.checkNotNull(orientationListener);
                        c4210x9.getClass();
                        Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                        c4210x9.b.remove(orientationListener);
                        c4210x9.a();
                        this.c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i2) {
                C4156v9 orientationListener2 = this.b;
                if (orientationListener2 != null) {
                    C4210x9 c4210x92 = this.f6443a;
                    if (c4210x92 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        c4210x92 = null;
                    }
                    c4210x92.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
                    c4210x92.b.remove(orientationListener2);
                    c4210x92.a();
                    U7 u7 = orientationListener2.c;
                    if (u7 != null) {
                        u7.b();
                    }
                    RelativeLayout relativeLayout = orientationListener2.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    C4041r6 c4041r6 = orientationListener2.e;
                    if (c4041r6 != null) {
                        C4180w6 c4180w6 = c4041r6.c;
                        if (c4180w6 != null) {
                            c4180w6.destroy();
                        }
                        c4041r6.c = null;
                        c4041r6.d = null;
                        c4041r6.e = null;
                        Lq lq = c4041r6.g;
                        if (lq != null) {
                            lq.a();
                        }
                        c4041r6.removeAllViews();
                    }
                    orientationListener2.f7432a.clear();
                    orientationListener2.b = null;
                    orientationListener2.c = null;
                    orientationListener2.d = null;
                    orientationListener2.e = null;
                }
                this.b = null;
            }
        } else {
            int i3 = this.d;
            if (100 != i3 && 102 == i3) {
                C4156v9 orientationListener3 = this.b;
                if (orientationListener3 != null) {
                    C4210x9 c4210x93 = this.f6443a;
                    if (c4210x93 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        c4210x93 = null;
                    }
                    c4210x93.getClass();
                    Intrinsics.checkNotNullParameter(orientationListener3, "orientationListener");
                    c4210x93.b.remove(orientationListener3);
                    c4210x93.a();
                    U7 u72 = orientationListener3.c;
                    if (u72 != null) {
                        u72.b();
                    }
                    RelativeLayout relativeLayout2 = orientationListener3.d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    C4041r6 c4041r62 = orientationListener3.e;
                    if (c4041r62 != null) {
                        C4180w6 c4180w62 = c4041r62.c;
                        if (c4180w62 != null) {
                            c4180w62.destroy();
                        }
                        c4041r62.c = null;
                        c4041r62.d = null;
                        c4041r62.e = null;
                        Lq lq2 = c4041r62.g;
                        if (lq2 != null) {
                            lq2.a();
                        }
                        c4041r62.removeAllViews();
                    }
                    orientationListener3.f7432a.clear();
                    orientationListener3.b = null;
                    orientationListener3.c = null;
                    orientationListener3.d = null;
                    orientationListener3.e = null;
                }
                this.b = null;
            }
            if (100 == this.d && (ej = this.c) != null && (c4153v6 = ej.F0) != null) {
                C4153v6.a(c4153v6, 9, true, null, 12);
                Ck ck = c4153v6.m;
                if (!ck.f && ck.f6497a > 0) {
                    ck.f = true;
                    ck.g = Ak.f;
                    ck.a();
                }
                CoroutineScopeKt.cancel$default(ck.d, null, 1, null);
            }
        }
        Lq lq3 = this.i;
        if (lq3 != null) {
            lq3.a();
        }
        this.i = null;
        CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        C4156v9 c4156v9;
        C4210x9 c4210x9;
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "multiWindow mode - " + z);
        }
        super.onMultiWindowModeChanged(z);
        if (z || (c4156v9 = this.b) == null) {
            return;
        }
        D d = c4156v9.b;
        C4210x9 c4210x92 = null;
        Jg orientationProperties = (d == null || !(d instanceof Ej)) ? null : ((Ej) d).getOrientationProperties();
        if (orientationProperties == null || (c4210x9 = this.f6443a) == null) {
            return;
        }
        if (c4210x9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
        } else {
            c4210x92 = c4210x9;
        }
        c4210x92.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.c = null;
        setIntent(intent);
        C4156v9 c4156v9 = this.b;
        if (c4156v9 != null) {
            SparseArray adContainers = t;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(adContainers, "adContainers");
            c4156v9.a(intent, adContainers);
            U7 u7 = c4156v9.c;
            if (u7 != null) {
                u7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C4156v9 c4156v9;
        super.onPause();
        int i = this.d;
        if (100 == i) {
            Ej ej = u;
            if (ej != null) {
                Ej.h1.getClass();
                ej.c(C3855kj.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i || (c4156v9 = this.b) == null || c4156v9.e == null || c4156v9 == null) {
            return;
        }
        Ej.h1.getClass();
        c4156v9.a(C3855kj.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        U7 u7;
        C fullScreenEventsListener;
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", U3.i.u0);
        }
        super.onResume();
        if (this.e) {
            return;
        }
        int i = this.d;
        if (100 == i) {
            Ej ej = this.c;
            if (ej != null && (fullScreenEventsListener = ej.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f) {
                        this.f = true;
                        ((C4220xj) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            Ej ej2 = u;
            if (ej2 != null) {
                Ej.h1.getClass();
                ej2.c(C3855kj.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i) {
            C4156v9 c4156v9 = this.b;
            if (c4156v9 != null && (u7 = c4156v9.c) != null && !u7.h) {
                try {
                    u7.h = true;
                    C fullScreenEventsListener2 = u7.f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((C4220xj) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            C4156v9 c4156v92 = this.b;
            if (c4156v92 == null || c4156v92.e == null || c4156v92 == null) {
                return;
            }
            Ej.h1.getClass();
            c4156v92.a(C3855kj.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C4156v9 c4156v9;
        Window window;
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        Y5.f6965a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.j == null) {
                this.j = new OnBackInvokedCallback() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda4
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(InMobiAdActivity.this);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.e || 102 != this.d || (c4156v9 = this.b) == null) {
            return;
        }
        U7 u7 = c4156v9.c;
        if (u7 != null) {
            u7.e();
        }
        D d = c4156v9.b;
        if (d != null) {
            if ((d instanceof Ej ? ((Ej) d).Y0 : false) && !Y5.t() && Y5.w()) {
                Object obj = c4156v9.f7432a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        Y5.f6965a.getClass();
        if (Build.VERSION.SDK_INT >= 33 && this.j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.d == 100) {
            a("ACTIVITY_STOP");
        }
    }

    public final void a(AdConfig.FormatCustomBrowserConfig formatCustomBrowserConfig) {
        Job launch$default;
        View inflate = getLayoutInflater().inflate(R.layout.inmobi_in_app_browser_activity, (ViewGroup) null);
        if (inflate == null) {
            return;
        }
        this.p = (RelativeLayout) inflate.findViewById(R.id.inmobi_in_app_browser_webview_container);
        this.q = (FrameLayout) inflate.findViewById(R.id.inmobi_in_app_browser_loader_overlay);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, R.id.inmobi_in_app_browser_bottom_bar);
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.addView(this.c, layoutParams);
            a(viewGroup);
            long loaderTimeout = formatCustomBrowserConfig.getLoaderTimeout();
            if (!this.o || loaderTimeout <= 0) {
                FrameLayout frameLayout = this.q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
                FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.k = true;
                if (this.n) {
                    Window window = getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    Lazy lazy = Vj.f6915a;
                    Intrinsics.checkNotNullParameter(window, "<this>");
                    Y5.f6965a.getClass();
                    if (Y5.t()) {
                        Vj.a(window, 3);
                    } else if (Y5.r()) {
                        Vj.a(window, 1);
                    }
                    Window window2 = getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    Vj.a(window2);
                }
                this.s = SystemClock.elapsedRealtime();
                Pb.a("InAppBrowserLoaderShown", this.r, (String) null, (Long) null);
                long loaderTimeout2 = formatCustomBrowserConfig.getLoaderTimeout();
                if (this.k) {
                    a();
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new A9(loaderTimeout2, this, null), 3, null);
                    this.m = launch$default;
                }
            }
        }
        setContentView(inflate);
    }

    public final void b() {
        if (isTaskRoot()) {
            Y5.f6965a.getClass();
            if (Y5.x()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z, newConfig);
        onMultiWindowModeChanged(z);
    }

    public final void c() {
        C4153v6 c4153v6;
        U7 u7;
        Y9 y9 = this.h;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y9).c("InMobiAdActivity", "onBackPressed");
        }
        int i = this.d;
        if (i == 102) {
            Y9 y92 = this.h;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((Z9) y92).c("InMobiAdActivity", "back pressed on ad");
            }
            C4156v9 c4156v9 = this.b;
            if (c4156v9 == null || (u7 = c4156v9.c) == null) {
                return;
            }
            u7.a();
            return;
        }
        if (i != 100 || this.k) {
            return;
        }
        Y9 y93 = this.h;
        if (y93 != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((Z9) y93).c("InMobiAdActivity", "back pressed in browser");
        }
        Ej ej = this.c;
        if (ej != null && (c4153v6 = ej.F0) != null) {
            C4153v6.a(c4153v6, 7, true, null, 12);
        }
        this.e = true;
        b();
    }

    public final void a(String reason) {
        C4153v6 c4153v6;
        Ck ck;
        boolean z;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.k) {
            Y9 y9 = this.h;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((Z9) y9).a("InMobiAdActivity", "hideLoaderAndShowWebView reason=" + reason);
            }
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.n) {
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                Vj.b(window);
                Window window2 = getWindow();
                Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                Vj.c(window2);
            }
            this.k = false;
            a();
            Ej ej = this.c;
            if (ej != null && (c4153v6 = ej.F0) != null && !(z = (ck = c4153v6.m).f) && !z && ck.f6497a > 0) {
                ck.f = true;
                ck.g = Ak.f;
                ck.a();
            }
            Pb.a("InAppBrowserLoaderHidden", this.r, reason, Long.valueOf(SystemClock.elapsedRealtime() - this.s));
        }
    }

    public final void a() {
        try {
            Job job = this.m;
            if (job != null) {
                JobKt.ensureActive(job);
            }
            Job job2 = this.m;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
        } catch (Exception unused) {
        }
        this.m = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_bottom_bar)).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (AbstractC3727g4.a(this)) {
            Lq lq = this.i;
            if (lq != null) {
                lq.a();
            }
            this.i = new Lq(this, new C4265z9(layoutParams2), this.h);
        }
        K5 k5 = new K5(this, (byte) 2, this.h);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(InMobiAdActivity.this, view, motionEvent);
            }
        });
        K5 k52 = new K5(this, (byte) 3, this.h);
        k52.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(InMobiAdActivity.this, view, motionEvent);
            }
        });
        K5 k53 = new K5(this, (byte) 4, this.h);
        k53.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(InMobiAdActivity.this, view, motionEvent);
            }
        });
        K5 k54 = new K5(this, (byte) 6, this.h);
        k54.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(InMobiAdActivity.this, view, motionEvent);
            }
        });
        try {
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_close_slot)).addView(k5);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_refresh_slot)).addView(k52);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_back_slot)).addView(k53);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_forward_slot)).addView(k54);
        } catch (Exception e) {
            Y9 y9 = this.h;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((Z9) y9).a("InMobiAdActivity", "Error setting up bottom bar buttons", e);
            }
        }
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C4153v6 c4153v6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Ej ej = inMobiAdActivity.c;
            if (ej != null && (c4153v6 = ej.F0) != null) {
                C4153v6.a(c4153v6, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
