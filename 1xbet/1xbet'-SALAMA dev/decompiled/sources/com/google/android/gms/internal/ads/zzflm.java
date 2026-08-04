package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
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
        long jNanoTime = System.nanoTime();
        zzfko zzfkoVarZza = zzflmVar.zzj.zza();
        if (zzflmVar.zzk.zze().size() > 0) {
            for (String str : zzflmVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzfkoVarZza.zza(null);
                View viewZza = zzflmVar.zzk.zza(str);
                zzfko zzfkoVarZzb = zzflmVar.zzj.zzb();
                String strZzc = zzflmVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfkoVarZzb.zza(viewZza);
                    zzfky.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e7) {
                        zzfkz.zza("Error with setting not visible reason", e7);
                    }
                    zzfky.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfky.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzflmVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzflmVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfkoVarZza.zza(null);
            zzflmVar.zzk(null, zzfkoVarZza, jSONObjectZza3, 1, false);
            zzfky.zzf(jSONObjectZza3);
            zzflmVar.zzl.zzd(jSONObjectZza3, zzflmVar.zzk.zzf(), jNanoTime);
        } else {
            zzflmVar.zzl.zzb();
        }
        zzflmVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzflmVar.zzm;
        if (zzflmVar.zzf.size() > 0) {
            for (zzfll zzfllVar : zzflmVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
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
        int iZzl;
        boolean z7;
        if (zzfld.zza(view) != null || (iZzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfkoVar.zza(view);
        zzfky.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfky.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e7) {
                zzfkz.zza("Error with setting has window focus", e7);
            }
            boolean zZzj = this.zzk.zzj(strZzd);
            Object objValueOf = Boolean.valueOf(zZzj);
            if (zZzj) {
                try {
                    jSONObjectZza.put("isPipActive", objValueOf);
                } catch (JSONException e8) {
                    zzfkz.zza("Error with setting is picture-in-picture active", e8);
                }
            }
            this.zzk.zzh();
        } else {
            zzfle zzfleVarZzb = this.zzk.zzb(view);
            if (zzfleVarZzb != null) {
                zzfkf zzfkfVarZza = zzfleVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfleVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i7 = 0; i7 < size; i7++) {
                    jSONArray.put((String) arrayListZzb.get(i7));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfkfVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfkfVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfkfVarZza.zzc());
                } catch (JSONException e9) {
                    zzfkz.zza("Error with setting friendly obstruction", e9);
                }
                z7 = true;
            } else {
                z7 = false;
            }
            zzk(view, zzfkoVar, jSONObjectZza, iZzl, z4 || z7);
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
