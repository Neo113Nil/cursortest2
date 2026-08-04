package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.D;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzcak extends FrameLayout implements zzcab {
    final zzcay zza;
    private final zzcaw zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcn zze;
    private final long zzf;
    private final zzcac zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcak(Context context, zzcaw zzcawVar, int i7, boolean z4, zzbcn zzbcnVar, zzcav zzcavVar, zzdqq zzdqqVar) {
        super(context);
        this.zzb = zzcawVar;
        this.zze = zzbcnVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        D.i(zzcawVar.zzj());
        zzcao zzcaoVar = zzcawVar.zzj().f1906a;
        zzcax zzcaxVar = new zzcax(context, zzcawVar.zzm(), zzcawVar.zzs(), zzbcnVar, zzcawVar.zzk());
        zzcac zzcdqVar = i7 == 3 ? new zzcdq(context, zzcaxVar) : i7 == 2 ? new zzcbo(context, zzcaxVar, zzcawVar, z4, zzcad.zza(zzcawVar), zzcavVar, zzdqqVar) : new zzcaa(context, zzcawVar, z4, zzcad.zza(zzcawVar), zzcavVar, new zzcax(context, zzcawVar.zzm(), zzcawVar.zzs(), zzbcnVar, zzcawVar.zzk()), zzdqqVar);
        this.zzg = zzcdqVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcdqVar, new FrameLayout.LayoutParams(-1, -1, 17));
        zzbbp zzbbpVar = zzbby.zzU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzR)).booleanValue()) {
            zzp();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) c0254t.f2726c.zzb(zzbby.zzW)).longValue();
        boolean zBooleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzT)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbcnVar != null) {
            zzbcnVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcay(this);
        zzcdqVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcac zzcacVar = this.zzg;
            if (zzcacVar != null) {
                zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcae
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcacVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z4));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcab
    public final void onWindowVisibilityChanged(int i7) {
        boolean z4;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0) {
            this.zza.zzb();
            z4 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z4 = false;
        }
        P.f3579l.post(new zzcaj(this, z4));
    }

    public final void zzA(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzz(i7);
    }

    public final void zzB(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzA(i7);
    }

    public final void zzC(int i7) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzU)).booleanValue()) {
            this.zzc.setBackgroundColor(i7);
            this.zzd.setBackgroundColor(i7);
        }
    }

    public final void zzD(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzB(i7);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i7, int i8, int i9, int i10) {
        if (J.m()) {
            StringBuilder sbG = p150v0.a.g("Set video bounds to x:", i7, ";y:", i8, ";w:");
            sbG.append(i9);
            sbG.append(";h:");
            sbG.append(i10);
            J.k(sbG.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i7, i8, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzb.zze(f7);
        zzcacVar.zzn();
    }

    public final void zzH(float f7, float f8) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar != null) {
            zzcacVar.zzu(f7, f8);
        }
    }

    public final void zzI() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzb.zzd(false);
        zzcacVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zza() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcd)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, SentryBaseEvent.JsonKeys.EXTRA, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzc(String str, String str2) {
        zzK(SentryEvent.JsonKeys.EXCEPTION, "what", "ExoPlayerAdapter exception", SentryBaseEvent.JsonKeys.EXTRA, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zze() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcd)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z4 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z4;
            if (!z4) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzf() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar != null && this.zzm == 0) {
            float fZzc = zzcacVar.zzc();
            zzcac zzcacVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(fZzc / 1000.0f), "videoWidth", String.valueOf(zzcacVar2.zze()), "videoHeight", String.valueOf(zzcacVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzg() {
        this.zzd.setVisibility(4);
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzh() {
        this.zza.zzb();
        P.f3579l.post(new zzcah(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        P.f3579l.post(new zzcai(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzj(int i7, int i8) {
        if (this.zzk) {
            zzbbp zzbbpVar = zzbby.zzV;
            C0254t c0254t = C0254t.f2723d;
            int iMax = Math.max(i7 / ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue(), 1);
            int iMax2 = Math.max(i8 / ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        o oVar = o.f1952C;
        oVar.j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        oVar.j.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (J.m()) {
            J.k("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            j.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcn zzbcnVar = this.zze;
            if (zzbcnVar != null) {
                zzbcnVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar != null) {
            return zzcacVar.zzw();
        }
        return null;
    }

    public final void zzp() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        TextView textView = new TextView(zzcacVar.getContext());
        Resources resourcesZze = o.f1952C.f1961g.zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzq() {
        this.zza.zza();
        zzcac zzcacVar = this.zzg;
        if (zzcacVar != null) {
            zzcacVar.zzt();
        }
        zzJ();
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzb.zzd(true);
        zzcacVar.zzn();
    }

    public final void zzt() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        long jZza = zzcacVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f7 = jZza / 1000.0f;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue()) {
            String strValueOf = String.valueOf(f7);
            String strValueOf2 = String.valueOf(this.zzg.zzh());
            String strValueOf3 = String.valueOf(this.zzg.zzf());
            String strValueOf4 = String.valueOf(this.zzg.zzg());
            String strValueOf5 = String.valueOf(this.zzg.zzb());
            o.f1952C.j.getClass();
            zzK("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f7));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzo();
    }

    public final void zzv() {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzp();
    }

    public final void zzw(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzq(i7);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzx(i7);
    }

    public final void zzz(int i7) {
        zzcac zzcacVar = this.zzg;
        if (zzcacVar == null) {
            return;
        }
        zzcacVar.zzy(i7);
    }
}
