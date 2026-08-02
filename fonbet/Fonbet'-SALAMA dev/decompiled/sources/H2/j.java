package H2;

import C0.RunnableC0085d;
import F2.C0252s;
import F2.C0254t;
import F2.InterfaceC0217a;
import I2.J;
import I2.P;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcft;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcvd;
import com.google.android.gms.internal.ads.zzdcp;
import com.google.android.gms.internal.ads.zzdqp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzear;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzebk;
import com.google.android.gms.internal.ads.zzebm;
import com.google.android.gms.internal.ads.zzfty;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.Collections;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import w1.C1719l1;

/* loaded from: classes.dex */
public abstract class j extends zzbsn {

    /* renamed from: N, reason: collision with root package name */
    public static final int f3245N = Color.argb(0, 0, 0, 0);

    /* renamed from: B, reason: collision with root package name */
    public g f3247B;

    /* renamed from: F, reason: collision with root package name */
    public RunnableC0085d f3251F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3252G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3253H;

    /* renamed from: L, reason: collision with root package name */
    public Toolbar f3257L;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3259a;

    /* renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f3260b;

    /* renamed from: c, reason: collision with root package name */
    public zzceb f3261c;

    /* renamed from: d, reason: collision with root package name */
    public v2.n f3262d;

    /* renamed from: e, reason: collision with root package name */
    public p f3263e;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f3265x;

    /* renamed from: y, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f3266y;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3264f = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3267z = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f3246A = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3248C = false;

    /* renamed from: M, reason: collision with root package name */
    public int f3258M = 1;

    /* renamed from: D, reason: collision with root package name */
    public final Object f3249D = new Object();

    /* renamed from: E, reason: collision with root package name */
    public final e f3250E = new e(this, 0);

    /* renamed from: I, reason: collision with root package name */
    public boolean f3254I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3255J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3256K = true;

    public j(Activity activity) {
        this.f3259a = activity;
    }

    public static final void w0(View view, zzebm zzebmVar) {
        if (zzebmVar == null || view == null) {
            return;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfm)).booleanValue() && zzebmVar.zzb()) {
            return;
        }
        E2.o.f1952C.f1977x.zzj(zzebmVar.zza(), view);
    }

    public final void Z(int i7) {
        Activity activity = this.f3259a;
        int i8 = activity.getApplicationInfo().targetSdkVersion;
        zzbbp zzbbpVar = zzbby.zzfV;
        C0254t c0254t = C0254t.f2723d;
        if (i8 >= ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) c0254t.f2726c.zzb(zzbby.zzfW)).intValue()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= ((Integer) c0254t.f2726c.zzb(zzbby.zzfX)).intValue()) {
                    if (i9 <= ((Integer) c0254t.f2726c.zzb(zzbby.zzfY)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i7);
        } catch (Throwable th) {
            E2.o.f1952C.f1961g.zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(boolean z4) {
        boolean z7;
        zzceb zzcebVar;
        zzbsh zzbshVar;
        boolean z8 = this.f3253H;
        Activity activity = this.f3259a;
        if (!z8) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new f("Invalid activity, no window available.");
        }
        zzceb zzcebVar2 = this.f3260b.f10818d;
        zzcft zzN = zzcebVar2 != null ? zzcebVar2.zzN() : null;
        boolean z9 = zzN != null && zzN.zzT();
        this.f3248C = false;
        if (z9) {
            int i7 = this.f3260b.f10800A;
            if (i7 == 6) {
                z7 = activity.getResources().getConfiguration().orientation == 1;
                this.f3248C = z7;
            } else if (i7 == 7) {
                z7 = activity.getResources().getConfiguration().orientation == 2;
                this.f3248C = z7;
            }
            int i8 = J.f3546b;
            J2.j.b("Delay onShow to next orientation change: " + z7);
            Z(this.f3260b.f10800A);
            window.setFlags(16777216, 16777216);
            J2.j.b("Hardware acceleration on the AdActivity window enabled.");
            if (this.f3246A) {
                this.f3247B.setBackgroundColor(-16777216);
            } else {
                this.f3247B.setBackgroundColor(f3245N);
            }
            activity.setContentView(this.f3247B);
            this.f3253H = true;
            if (z4) {
                zzceb zzcebVar3 = this.f3260b.f10818d;
                this.f3261c = zzcebVar3;
                zzcebVar3.zzan(activity);
            } else {
                try {
                    zzceo zzceoVar = E2.o.f1952C.f1958d;
                    Activity activity2 = this.f3259a;
                    zzceb zzcebVar4 = this.f3260b.f10818d;
                    zzcfv zzO = zzcebVar4 != null ? zzcebVar4.zzO() : null;
                    zzceb zzcebVar5 = this.f3260b.f10818d;
                    String zzU = zzcebVar5 != null ? zzcebVar5.zzU() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
                    VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.f10803D;
                    zzceb zzcebVar6 = adOverlayInfoParcel.f10818d;
                    zzceb zza = zzceo.zza(activity2, zzO, zzU, true, z9, null, null, versionInfoParcel, null, null, zzcebVar6 != null ? zzcebVar6.zzj() : null, zzbaw.zza(), null, null, null, null, null);
                    this.f3261c = zza;
                    zzcft zzN2 = zza.zzN();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3260b;
                    zzbhp zzbhpVar = adOverlayInfoParcel2.f10806G;
                    zzceb zzcebVar7 = adOverlayInfoParcel2.f10818d;
                    zzN2.zzV(null, zzbhpVar, null, adOverlayInfoParcel2.f10819e, adOverlayInfoParcel2.f10823z, true, null, zzcebVar7 != null ? zzcebVar7.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                    this.f3261c.zzN().zzC(new C1719l1(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f3260b;
                    String str = adOverlayInfoParcel3.f10802C;
                    if (str != null) {
                        this.f3261c.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f10822y;
                        if (str2 == null) {
                            throw new f("No URL or HTML to display in ad overlay.");
                        }
                        this.f3261c.loadDataWithBaseURL(adOverlayInfoParcel3.f10820f, str2, "text/html", "UTF-8", null);
                    }
                    zzceb zzcebVar8 = this.f3260b.f10818d;
                    if (zzcebVar8 != null) {
                        zzcebVar8.zzaw(this);
                    }
                } catch (Exception e7) {
                    J2.j.e("Error obtaining webview.", e7);
                    throw new f("Could not obtain webview for the overlay.", e7);
                }
            }
            if (this.f3260b.f10813N) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f3261c.zzG(), false);
            }
            this.f3261c.zzai(this);
            zzcebVar = this.f3260b.f10818d;
            if (zzcebVar != null) {
                w0(this.f3247B, zzcebVar.zzQ());
            }
            if (this.f3260b.f10801B != 5) {
                ViewParent parent = this.f3261c.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f3261c.zzF());
                }
                if (this.f3246A) {
                    this.f3261c.zzam();
                }
                if (this.f3260b.f10813N) {
                    Toolbar toolbar = new Toolbar(activity);
                    this.f3257L = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.f3261c.zzF().setId(View.generateViewId());
                    this.f3257L.setBackgroundColor(-12303292);
                    this.f3257L.setVisibility(0);
                    try {
                        this.f3257L.setNavigationIcon(E2.o.f1952C.f1961g.zze().getDrawable(R.drawable.admob_close_button_white_cross, null));
                    } catch (Resources.NotFoundException | NullPointerException e8) {
                        J.l("Error obtaining close icon.", e8);
                    }
                    this.f3257L.setNavigationOnClickListener(this.f3250E);
                    this.f3257L.setTitleMarginStart(0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.f3247B.addView(this.f3257L, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.f3257L.getId());
                    layoutParams2.addRule(12);
                    this.f3247B.addView(this.f3261c.zzF(), layoutParams2);
                    u0(this.f3257L);
                } else {
                    this.f3247B.addView(this.f3261c.zzF(), -1, -1);
                }
            }
            if (!z4 && !this.f3248C) {
                this.f3261c.zzaa();
            }
            if (this.f3260b.f10801B == 5) {
                x0(z9);
                if (this.f3261c.zzaB()) {
                    y0(z9, true);
                    return;
                }
                return;
            }
            zzear zze = zzeas.zze();
            zze.zza(activity);
            zze.zzb(this);
            zze.zzc(this.f3260b.f10807H);
            zze.zzd(this.f3260b.f10808I);
            zzeas zze2 = zze.zze();
            try {
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.f3260b;
                if (adOverlayInfoParcel4 == null || (zzbshVar = adOverlayInfoParcel4.f10812M) == null) {
                    throw new f("noioou");
                }
                zzbshVar.zzg(new BinderC1507b(zze2));
                return;
            } catch (f | RemoteException e9) {
                throw new f(e9.getMessage(), e9);
            }
        }
        z7 = false;
        int i82 = J.f3546b;
        J2.j.b("Delay onShow to next orientation change: " + z7);
        Z(this.f3260b.f10800A);
        window.setFlags(16777216, 16777216);
        J2.j.b("Hardware acceleration on the AdActivity window enabled.");
        if (this.f3246A) {
        }
        activity.setContentView(this.f3247B);
        this.f3253H = true;
        if (z4) {
        }
        if (this.f3260b.f10813N) {
        }
        this.f3261c.zzai(this);
        zzcebVar = this.f3260b.f10818d;
        if (zzcebVar != null) {
        }
        if (this.f3260b.f10801B != 5) {
        }
        if (!z4) {
            this.f3261c.zzaa();
        }
        if (this.f3260b.f10801B == 5) {
        }
    }

    public final void u0(View view) {
        zzebm zzQ;
        zzebk zzP;
        zzceb zzcebVar = this.f3261c;
        if (zzcebVar == null) {
            return;
        }
        zzbbp zzbbpVar = zzbby.zzfn;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (zzP = zzcebVar.zzP()) != null) {
            zzP.zza(view);
        } else if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfm)).booleanValue() && (zzQ = zzcebVar.zzQ()) != null && zzQ.zzb()) {
            E2.o.f1952C.f1977x.zzg(zzQ.zza(), view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(Configuration configuration) {
        boolean z4;
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzl zzlVar;
        zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3260b;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (adOverlayInfoParcel2 == null || (zzlVar2 = adOverlayInfoParcel2.f10805F) == null || !zzlVar2.f10842b) ? false : true;
        E2.o.f1952C.f1959e.getClass();
        zzbbp zzbbpVar = zzbby.zzeZ;
        C0254t c0254t = C0254t.f2723d;
        boolean booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        zzbbw zzbbwVar = c0254t.f2726c;
        Activity activity = this.f3259a;
        if (booleanValue) {
            if (((Boolean) zzbbwVar.zzb(zzbby.zzfb)).booleanValue()) {
                z4 = activity.isInMultiWindowMode();
            } else {
                J2.d dVar = C0252s.f2717f.f2718a;
                int p5 = J2.d.p(configuration.screenHeightDp, activity);
                int m7 = J2.d.m(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
                WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i7 = displayMetrics.heightPixels;
                int i8 = displayMetrics.widthPixels;
                int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
                int intValue = ((Integer) zzbbwVar.zzb(zzbby.zzeX)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
                if (Math.abs(i7 - (p5 + dimensionPixelSize)) > intValue || Math.abs(i8 - m7) > intValue) {
                    z4 = true;
                }
            }
            if ((this.f3246A || z9 || ((Boolean) zzbbwVar.zzb(zzbby.zzaT)).booleanValue()) && (!z4 || ((Boolean) zzbbwVar.zzb(zzbby.zzaS)).booleanValue())) {
                adOverlayInfoParcel = this.f3260b;
                if (adOverlayInfoParcel != null && (zzlVar = adOverlayInfoParcel.f10805F) != null && zzlVar.f10847x) {
                    z8 = true;
                }
            } else {
                z7 = false;
            }
            Window window = activity.getWindow();
            if (!((Boolean) zzbbwVar.zzb(zzbby.zzbq)).booleanValue()) {
                window.getDecorView().setSystemUiVisibility(z7 ? z8 ? 5894 : 5380 : 256);
                return;
            }
            if (!z7) {
                window.addFlags(2048);
                window.clearFlags(1024);
                return;
            }
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z8) {
                window.getDecorView().setSystemUiVisibility(4098);
                return;
            }
            return;
        }
        z4 = false;
        if (this.f3246A) {
        }
        adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel != null) {
            z8 = true;
        }
        Window window2 = activity.getWindow();
        if (!((Boolean) zzbbwVar.zzb(zzbby.zzbq)).booleanValue()) {
        }
    }

    public final void x0(boolean z4) {
        if (this.f3260b.f10813N) {
            return;
        }
        zzbbp zzbbpVar = zzbby.zzfd;
        C0254t c0254t = C0254t.f2723d;
        int intValue = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        boolean z7 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzbm)).booleanValue() || z4;
        o oVar = new o();
        oVar.f3280a = 0;
        oVar.f3281b = 0;
        oVar.f3282c = 0;
        oVar.f3283d = 50;
        oVar.f3280a = true != z7 ? 0 : intValue;
        oVar.f3281b = true != z7 ? intValue : 0;
        oVar.f3282c = intValue;
        this.f3263e = new p(this.f3259a, oVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z7 ? 9 : 11);
        y0(z4, this.f3260b.f10821x);
        this.f3247B.addView(this.f3263e, layoutParams);
        u0(this.f3263e);
    }

    public final void y0(boolean z4, boolean z7) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzl zzlVar2;
        zzbbp zzbbpVar = zzbby.zzbk;
        C0254t c0254t = C0254t.f2723d;
        boolean z8 = true;
        boolean z9 = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (adOverlayInfoParcel2 = this.f3260b) != null && (zzlVar2 = adOverlayInfoParcel2.f10805F) != null && zzlVar2.f10848y;
        boolean z10 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzbl)).booleanValue() && (adOverlayInfoParcel = this.f3260b) != null && (zzlVar = adOverlayInfoParcel.f10805F) != null && zzlVar.f10849z;
        if (z4 && z7 && z9 && !z10) {
            new zzbrs(this.f3261c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        p pVar = this.f3263e;
        if (pVar != null) {
            if (!z10 && (!z7 || z9)) {
                z8 = false;
            }
            ImageButton imageButton = pVar.f3284a;
            if (!z8) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) c0254t.f2726c.zzb(zzbby.zzbo)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        m mVar;
        if (!this.f3259a.isFinishing() || this.f3254I) {
            return;
        }
        this.f3254I = true;
        zzceb zzcebVar = this.f3261c;
        if (zzcebVar != null) {
            zzcebVar.zzZ(this.f3258M - 1);
            synchronized (this.f3249D) {
                try {
                    if (!this.f3252G && this.f3261c.zzaC()) {
                        zzbbp zzbbpVar = zzbby.zzeY;
                        C0254t c0254t = C0254t.f2723d;
                        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && !this.f3255J && (adOverlayInfoParcel = this.f3260b) != null && (mVar = adOverlayInfoParcel.f10817c) != null) {
                            mVar.zzdo();
                        }
                        RunnableC0085d runnableC0085d = new RunnableC0085d(this, 8);
                        this.f3251F = runnableC0085d;
                        P.f3579l.postDelayed(runnableC0085d, ((Long) c0254t.f2726c.zzb(zzbby.zzbj)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final boolean zzH() {
        this.f3258M = 1;
        if (this.f3261c == null) {
            return true;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && this.f3261c.canGoBack()) {
            this.f3261c.goBack();
            return false;
        }
        boolean zzaH = this.f3261c.zzaH();
        if (!zzaH) {
            this.f3261c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaH;
    }

    public final void zzb() {
        this.f3258M = 3;
        Activity activity = this.f3259a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f10801B != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzceb zzcebVar = this.f3261c;
        if (zzcebVar != null) {
            zzcebVar.zzai(null);
        }
    }

    public final void zzc() {
        zzceb zzcebVar;
        m mVar;
        if (this.f3255J) {
            return;
        }
        this.f3255J = true;
        zzceb zzcebVar2 = this.f3261c;
        if (zzcebVar2 != null) {
            this.f3247B.removeView(zzcebVar2.zzF());
            v2.n nVar = this.f3262d;
            if (nVar != null) {
                this.f3261c.zzan((Context) nVar.f17139d);
                this.f3261c.zzaq(false);
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmF)).booleanValue() && this.f3261c.getParent() != null) {
                    ((ViewGroup) this.f3261c.getParent()).removeView(this.f3261c.zzF());
                }
                ViewGroup viewGroup = (ViewGroup) this.f3262d.f17138c;
                View zzF = this.f3261c.zzF();
                v2.n nVar2 = this.f3262d;
                viewGroup.addView(zzF, nVar2.f17136a, (ViewGroup.LayoutParams) nVar2.f17137b);
                this.f3262d = null;
            } else {
                Activity activity = this.f3259a;
                if (activity.getApplicationContext() != null) {
                    this.f3261c.zzan(activity.getApplicationContext());
                }
            }
            this.f3261c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f10817c) != null) {
            mVar.zzds(this.f3258M);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3260b;
        if (adOverlayInfoParcel2 == null || (zzcebVar = adOverlayInfoParcel2.f10818d) == null) {
            return;
        }
        w0(this.f3260b.f10818d.zzF(), zzcebVar.zzQ());
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel != null && this.f3264f) {
            Z(adOverlayInfoParcel.f10800A);
        }
        if (this.f3265x != null) {
            this.f3259a.setContentView(this.f3247B);
            this.f3253H = true;
            this.f3265x.removeAllViews();
            this.f3265x = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f3266y;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f3266y = null;
        }
        this.f3264f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh(int i7, int i8, Intent intent) {
        zzdqq zze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i7 == 236) {
            zzbbp zzbbpVar = zzbby.zzna;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                J.k("Callback from intent launch with requestCode: 236 and resultCode: " + i8);
                zzceb zzcebVar = this.f3261c;
                if (zzcebVar == null || zzcebVar.zzN() == null || (zze = zzcebVar.zzN().zze()) == null || (adOverlayInfoParcel = this.f3260b) == null || !((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    return;
                }
                zzdqp zza = zze.zza();
                zza.zzb("action", "hilca");
                zza.zzb("gqi", zzfty.zzc(adOverlayInfoParcel.f10807H));
                StringBuilder sb = new StringBuilder();
                sb.append(i8);
                zza.zzb("hilr", sb.toString());
                if (i8 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zza.zzb("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zza.zzb("hills", stringExtra2);
                    }
                }
                zza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi() {
        this.f3258M = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzk(InterfaceC1506a interfaceC1506a) {
        v0((Configuration) BinderC1507b.t0(interfaceC1506a));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: f -> 0x0035, TryCatch #0 {f -> 0x0035, blocks: (B:11:0x001b, B:13:0x0027, B:15:0x002b, B:17:0x0031, B:18:0x0038, B:19:0x0041, B:21:0x004c, B:22:0x004e, B:24:0x0054, B:25:0x0060, B:28:0x0069, B:32:0x0076, B:34:0x007b, B:36:0x0088, B:38:0x008c, B:40:0x0092, B:41:0x0095, B:43:0x009b, B:44:0x009e, B:46:0x00a4, B:48:0x00a8, B:49:0x00ab, B:51:0x00b1, B:52:0x00b4, B:59:0x00df, B:62:0x00e3, B:63:0x00ea, B:64:0x00eb, B:66:0x00ef, B:68:0x00fc, B:71:0x0072, B:72:0x0084, B:73:0x0100, B:74:0x0107), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc A[Catch: f -> 0x0035, TryCatch #0 {f -> 0x0035, blocks: (B:11:0x001b, B:13:0x0027, B:15:0x002b, B:17:0x0031, B:18:0x0038, B:19:0x0041, B:21:0x004c, B:22:0x004e, B:24:0x0054, B:25:0x0060, B:28:0x0069, B:32:0x0076, B:34:0x007b, B:36:0x0088, B:38:0x008c, B:40:0x0092, B:41:0x0095, B:43:0x009b, B:44:0x009e, B:46:0x00a4, B:48:0x00a8, B:49:0x00ab, B:51:0x00b1, B:52:0x00b4, B:59:0x00df, B:62:0x00e3, B:63:0x00ea, B:64:0x00eb, B:66:0x00ef, B:68:0x00fc, B:71:0x0072, B:72:0x0084, B:73:0x0100, B:74:0x0107), top: B:10:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzl(Bundle bundle) {
        int i7;
        boolean z4 = this.f3253H;
        Activity activity = this.f3259a;
        if (!z4) {
            activity.requestWindowFeature(1);
        }
        this.f3267z = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel j = AdOverlayInfoParcel.j(activity.getIntent());
            this.f3260b = j;
            if (j == null) {
                throw new f("Could not get info for ad overlay.");
            }
            if (j.f10813N) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f3260b.f10803D.f10836c > 7500000) {
                this.f3258M = 4;
            }
            if (activity.getIntent() != null) {
                this.f3256K = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
            zzl zzlVar = adOverlayInfoParcel.f10805F;
            int i8 = adOverlayInfoParcel.f10801B;
            if (zzlVar != null) {
                boolean z7 = zzlVar.f10841a;
                this.f3246A = z7;
                if (z7) {
                    if (i8 != 5 && zzlVar.f10846f != -1) {
                        new h(this).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.f3256K) {
                        zzcvd zzcvdVar = this.f3260b.f10810K;
                        if (zzcvdVar != null) {
                            zzcvdVar.zze();
                        }
                        m mVar = this.f3260b.f10817c;
                        if (mVar != null) {
                            mVar.zzdp();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f3260b;
                    if (adOverlayInfoParcel2.f10801B != 1) {
                        InterfaceC0217a interfaceC0217a = adOverlayInfoParcel2.f10816b;
                        if (interfaceC0217a != null) {
                            interfaceC0217a.onAdClicked();
                        }
                        zzdcp zzdcpVar = this.f3260b.f10811L;
                        if (zzdcpVar != null) {
                            zzdcpVar.zzdd();
                        }
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f3260b;
                g gVar = new g(activity, adOverlayInfoParcel3.f10804E, adOverlayInfoParcel3.f10803D.f10834a, adOverlayInfoParcel3.f10809J);
                this.f3247B = gVar;
                gVar.setId(zzbbd.zzq.zzf);
                E2.o.f1952C.f1959e.f(activity);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.f3260b;
                i7 = adOverlayInfoParcel4.f10801B;
                if (i7 == 1) {
                    t0(false);
                    return;
                }
                if (i7 == 2) {
                    this.f3262d = new v2.n(adOverlayInfoParcel4.f10818d);
                    t0(false);
                    return;
                } else if (i7 == 3) {
                    t0(true);
                    return;
                } else {
                    if (i7 != 5) {
                        throw new f("Could not determine ad overlay type.");
                    }
                    t0(false);
                    return;
                }
            }
            if (i8 == 5) {
                this.f3246A = true;
                if (i8 != 5) {
                    new h(this).zzb();
                }
                if (bundle == null) {
                }
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.f3260b;
                g gVar2 = new g(activity, adOverlayInfoParcel32.f10804E, adOverlayInfoParcel32.f10803D.f10834a, adOverlayInfoParcel32.f10809J);
                this.f3247B = gVar2;
                gVar2.setId(zzbbd.zzq.zzf);
                E2.o.f1952C.f1959e.f(activity);
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.f3260b;
                i7 = adOverlayInfoParcel42.f10801B;
                if (i7 == 1) {
                }
            } else {
                this.f3246A = false;
                if (bundle == null) {
                }
                AdOverlayInfoParcel adOverlayInfoParcel322 = this.f3260b;
                g gVar22 = new g(activity, adOverlayInfoParcel322.f10804E, adOverlayInfoParcel322.f10803D.f10834a, adOverlayInfoParcel322.f10809J);
                this.f3247B = gVar22;
                gVar22.setId(zzbbd.zzq.zzf);
                E2.o.f1952C.f1959e.f(activity);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.f3260b;
                i7 = adOverlayInfoParcel422.f10801B;
                if (i7 == 1) {
                }
            }
        } catch (f e7) {
            String message = e7.getMessage();
            int i9 = J.f3546b;
            J2.j.g(message);
            this.f3258M = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzm() {
        zzceb zzcebVar = this.f3261c;
        if (zzcebVar != null) {
            try {
                this.f3247B.removeView(zzcebVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzo() {
        m mVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f10817c) != null) {
            mVar.zzdi();
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfa)).booleanValue() && this.f3261c != null && (!this.f3259a.isFinishing() || this.f3262d == null)) {
            this.f3261c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzp(int i7, String[] strArr, int[] iArr) {
        if (i7 == 12345) {
            zzear zze = zzeas.zze();
            zze.zza(this.f3259a);
            zze.zzb(this.f3260b.f10801B == 5 ? this : null);
            try {
                this.f3260b.f10812M.zzf(strArr, iArr, new BinderC1507b(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzr() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f10817c) != null) {
            mVar.zzdE();
        }
        v0(this.f3259a.getResources().getConfiguration());
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfa)).booleanValue()) {
            return;
        }
        zzceb zzcebVar = this.f3261c;
        if (zzcebVar != null && !zzcebVar.zzaE()) {
            this.f3261c.onResume();
        } else {
            int i7 = J.f3546b;
            J2.j.g("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3267z);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzt() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfa)).booleanValue()) {
            zzceb zzcebVar = this.f3261c;
            if (zzcebVar != null && !zzcebVar.zzaE()) {
                this.f3261c.onResume();
            } else {
                int i7 = J.f3546b;
                J2.j.g("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzu() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfa)).booleanValue() && this.f3261c != null && (!this.f3259a.isFinishing() || this.f3262d == null)) {
            this.f3261c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzv() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3260b;
        if (adOverlayInfoParcel == null || (mVar = adOverlayInfoParcel.f10817c) == null) {
            return;
        }
        mVar.zzdr();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzx() {
        this.f3253H = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzq() {
    }
}
