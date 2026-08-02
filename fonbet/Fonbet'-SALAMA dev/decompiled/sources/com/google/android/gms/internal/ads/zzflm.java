package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzflm implements zzfkn {
    private static final zzflm zza = new zzflm();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfli();
    private static final Runnable zze = new zzflj();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzflf zzk = new zzflf();
    private final zzfkp zzj = new zzfkp();
    private final zzflg zzl = new zzflg(new zzflp());

    public static zzflm zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzflm zzflmVar) {
        zzflmVar.zzg = 0;
        zzflmVar.zzi.clear();
        zzflmVar.zzh = false;
        for (zzfjl zzfjlVar : zzfkc.zza().zzb()) {
        }
        zzflmVar.zzm = System.nanoTime();
        zzflmVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfko zza2 = zzflmVar.zzj.zza();
        if (zzflmVar.zzk.zze().size() > 0) {
            Iterator it = zzflmVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzflmVar.zzk.zza(str);
                zzfko zzb2 = zzflmVar.zzj.zzb();
                String zzc2 = zzflmVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfky.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e7) {
                        zzfkz.zza("Error with setting not visible reason", e7);
                    }
                    zzfky.zzc(zza3, zza5);
                }
                zzfky.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzflmVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzflmVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzflmVar.zzk(null, zza2, zza6, 1, false);
            zzfky.zzf(zza6);
            zzflmVar.zzl.zzd(zza6, zzflmVar.zzk.zzf(), nanoTime);
        } else {
            zzflmVar.zzl.zzb();
        }
        zzflmVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzflmVar.zzm;
        if (zzflmVar.zzf.size() > 0) {
            for (zzfll zzfllVar : zzflmVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfllVar.zzb();
                if (zzfllVar instanceof zzflk) {
                    ((zzflk) zzfllVar).zza();
                }
            }
        }
        zzfkm.zza().zzc();
    }

    private final void zzk(View view, zzfko zzfkoVar, JSONObject jSONObject, int i7, boolean z4) {
        zzfkoVar.zzb(view, jSONObject, this, i7 == 1, z4);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkn
    public final void zza(View view, zzfko zzfkoVar, JSONObject jSONObject, boolean z4) {
        int zzl;
        boolean z7;
        if (zzfld.zza(view) != null || (zzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfkoVar.zza(view);
        zzfky.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfky.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e7) {
                zzfkz.zza("Error with setting has window focus", e7);
            }
            boolean zzj = this.zzk.zzj(zzd2);
            Object valueOf = Boolean.valueOf(zzj);
            if (zzj) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e8) {
                    zzfkz.zza("Error with setting is picture-in-picture active", e8);
                }
            }
            this.zzk.zzh();
        } else {
            zzfle zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfkf zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    jSONArray.put((String) zzb3.get(i7));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e9) {
                    zzfkz.zza("Error with setting friendly obstruction", e9);
                }
                z7 = true;
            } else {
                z7 = false;
            }
            zzk(view, zzfkoVar, zza2, zzl, z4 || z7);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzflh(this));
    }
}
