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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfxu implements zzfwv {
    private static final zzfxu zza = new zzfxu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfxq();
    private static final Runnable zzl = new zzfxr();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfxn zzh = new zzfxn();
    private final zzfwx zzg = new zzfwx();
    private final zzfxo zzi = new zzfxo(new zzfxx());

    zzfxu() {
    }

    public static zzfxu zzb() {
        return zza;
    }

    /* JADX WARN: Failed to check method usage
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1714)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:361)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
     */
    static /* synthetic */ Runnable zzj() {
        return zzl;
    }

    private final void zzk(View view, zzfww zzfwwVar, JSONObject jSONObject, int i, boolean z) {
        zzfwwVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final void zza(View view, zzfww zzfwwVar, JSONObject jSONObject, boolean z) {
        zzfxn zzfxnVar;
        int zzl2;
        boolean z2;
        if (zzfxl.zza(view) != null || (zzl2 = (zzfxnVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfwwVar.zza(view);
        zzfxg.zze(jSONObject, zza2);
        String zzg = zzfxnVar.zzg(view);
        if (zzg != null) {
            zzfxg.zzd(zza2, zzg);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfxh.zza("Error with setting has window focus", e);
            }
            Boolean valueOf = Boolean.valueOf(this.zzh.zzk(zzg));
            if (valueOf.booleanValue()) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e2) {
                    zzfxh.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
        } else {
            zzfxm zzi = zzfxnVar.zzi(view);
            if (zzi != null) {
                zzfwn zzb2 = zzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzc2 = zzi.zzc();
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzc2.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zzb2.zzb());
                    zza2.put("friendlyObstructionPurpose", zzb2.zzc());
                    zza2.put("friendlyObstructionReason", zzb2.zzd());
                } catch (JSONException e3) {
                    zzfxh.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfwwVar, zza2, zzl2, z || z2);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfxp(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        this.zze = 0;
        this.zzf.clear();
        for (zzfvq zzfvqVar : zzfwk.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfxn zzfxnVar = this.zzh;
        zzfxnVar.zzd();
        zzfwx zzfwxVar = this.zzg;
        long nanoTime = System.nanoTime();
        zzfww zza2 = zzfwxVar.zza();
        if (zzfxnVar.zzb().size() > 0) {
            Iterator it = zzfxnVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zzh = zzfxnVar.zzh(str);
                zzfww zzb2 = zzfwxVar.zzb();
                String zzc2 = zzfxnVar.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza4 = zzb2.zza(zzh);
                    zzfxg.zzd(zza4, str);
                    try {
                        zza4.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfxh.zza("Error with setting not visible reason", e);
                    }
                    zzfxg.zze(zza3, zza4);
                }
                zzfxg.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(zza3, hashSet, nanoTime);
            }
        }
        zzfxn zzfxnVar2 = this.zzh;
        if (zzfxnVar2.zza().size() > 0) {
            JSONObject zza5 = zza2.zza(null);
            zzk(null, zza2, zza5, 1, false);
            zzfxg.zzf(zza5);
            this.zzi.zza(zza5, zzfxnVar2.zza(), nanoTime);
        } else {
            this.zzi.zzc();
        }
        zzfxnVar2.zze();
        long nanoTime2 = System.nanoTime() - this.zzj;
        List<zzfxt> list = this.zzd;
        if (list.size() > 0) {
            for (zzfxt zzfxtVar : list) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfxtVar.zzb();
                if (zzfxtVar instanceof zzfxs) {
                    ((zzfxs) zzfxtVar).zza();
                }
            }
        }
        zzfwu.zza().zzc();
    }

    final /* synthetic */ zzfxo zzh() {
        return this.zzi;
    }
}
