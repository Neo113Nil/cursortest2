package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdhy extends zzbfm implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdja {
    public static final zzfwh zza = zzfwh.zzq("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgbn zzf;
    private View zzg;
    private zzdgx zzi;
    private zzaxy zzj;
    private zzbfg zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private p105o3.a zzk = null;
    private boolean zzn = false;
    private final int zzh = 250930000;

    public zzdhy(FrameLayout frameLayout, FrameLayout frameLayout2, int i7) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        o oVar = o.f1952C;
        zzbzn zzbznVar = oVar.f1954B;
        zzbzn.zza(frameLayout, this);
        zzbzn zzbznVar2 = oVar.f1954B;
        zzbzn.zzb(frameLayout, this);
        this.zzf = zzbza.zzf;
        this.zzj = new zzaxy(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public static /* synthetic */ void zzs(zzdhy zzdhyVar) {
        if (zzdhyVar.zzg == null) {
            View view = new View(zzdhyVar.zzd.getContext());
            zzdhyVar.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (zzdhyVar.zzd != zzdhyVar.zzg.getParent()) {
            zzdhyVar.zzd.addView(zzdhyVar.zzg);
        }
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e7) {
                        j.h("Encountered invalid base64 watermark.", e7);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhx
            @Override // java.lang.Runnable
            public final void run() {
                zzdhy.zzs(this.zza);
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdig(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar == null || !zzdgxVar.zzV()) {
            return;
        }
        this.zzi.zzA();
        this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgxVar.zzB(frameLayout, zzl(), zzm(), zzdgx.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgxVar.zzB(frameLayout, zzl(), zzm(), zzdgx.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            zzdgxVar.zzL(view, motionEvent, this.zzd);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized p105o3.a zzb(String str) {
        return new p105o3.b(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzc() {
        try {
            if (this.zzn) {
                return;
            }
            zzdgx zzdgxVar = this.zzi;
            if (zzdgxVar != null) {
                zzdgxVar.zzT(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzd(p105o3.a aVar) {
        onTouch(this.zzd, (MotionEvent) p105o3.b.t0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzdt(String str, p105o3.a aVar) {
        zzq(str, (View) p105o3.b.t0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzdu(p105o3.a aVar) {
        this.zzi.zzN((View) p105o3.b.t0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzdv(zzbfg zzbfgVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbfgVar;
            zzdgx zzdgxVar = this.zzi;
            if (zzdgxVar != null) {
                zzdgxVar.zzc().zzb(zzbfgVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzdw(p105o3.a aVar) {
        if (this.zzn) {
            return;
        }
        this.zzk = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zzdx(p105o3.a aVar) {
        if (this.zzn) {
            return;
        }
        Object objT0 = p105o3.b.t0(aVar);
        if (!(objT0 instanceof zzdgx)) {
            int i7 = J.f3546b;
            j.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            zzdgxVar.zzT(this);
        }
        zzu();
        zzdgx zzdgxVar2 = (zzdgx) objT0;
        this.zzi = zzdgxVar2;
        zzdgxVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzz(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzed)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final synchronized void zze(p105o3.a aVar, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final zzaxy zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final p105o3.a zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized JSONObject zzo() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar == null) {
            return null;
        }
        return zzdgxVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized JSONObject zzp() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar == null) {
            return null;
        }
        return zzdgxVar.zzj(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized void zzq(String str, View view, boolean z4) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (p003a.a.H0(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }
}
