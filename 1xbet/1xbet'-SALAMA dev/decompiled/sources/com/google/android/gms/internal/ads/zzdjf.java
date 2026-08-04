package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import I2.J;
import I2.P;
import J2.j;
import Y4.D;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdjf implements zzdhk {
    private final zzbpd zza;
    private final zzcvi zzb;
    private final zzcuo zzc;
    private final zzdcn zzd;
    private final Context zze;
    private final zzfaf zzf;
    private final VersionInfoParcel zzg;
    private final zzfba zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzboz zzl;
    private final zzbpa zzm;

    public zzdjf(zzboz zzbozVar, zzbpa zzbpaVar, zzbpd zzbpdVar, zzcvi zzcviVar, zzcuo zzcuoVar, zzdcn zzdcnVar, Context context, zzfaf zzfafVar, VersionInfoParcel versionInfoParcel, zzfba zzfbaVar) {
        this.zzl = zzbozVar;
        this.zzm = zzbpaVar;
        this.zza = zzbpdVar;
        this.zzb = zzcviVar;
        this.zzc = zzcuoVar;
        this.zzd = zzdcnVar;
        this.zze = context;
        this.zzf = zzfafVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfbaVar;
    }

    private final void zzb(View view) {
        try {
            zzbpd zzbpdVar = this.zza;
            if (zzbpdVar != null && !zzbpdVar.zzA()) {
                this.zza.zzw(new p105o3.b(view));
                this.zzc.onAdClicked();
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzboz zzbozVar = this.zzl;
            if (zzbozVar != null && !zzbozVar.zzx()) {
                this.zzl.zzs(new p105o3.b(view));
                this.zzc.onAdClicked();
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbpa zzbpaVar = this.zzm;
            if (zzbpaVar == null || zzbpaVar.zzv()) {
                return;
            }
            this.zzm.zzq(new p105o3.b(view));
            this.zzc.onAdClicked();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
                this.zzd.zzdd();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to call handleClick", e7);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzA(View view, Map map) {
        try {
            p105o3.b bVar = new p105o3.b(view);
            zzbpd zzbpdVar = this.zza;
            if (zzbpdVar != null) {
                zzbpdVar.zzz(bVar);
                return;
            }
            zzboz zzbozVar = this.zzl;
            if (zzbozVar != null) {
                zzbozVar.zzw(bVar);
                return;
            }
            zzbpa zzbpaVar = this.zzm;
            if (zzbpaVar != null) {
                zzbpaVar.zzu(bVar);
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to call untrackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzD(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzh() {
        int i7 = J.f3546b;
        j.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzk(InterfaceC0250q0 interfaceC0250q0) {
        int i7 = J.f3546b;
        j.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzl(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzn(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzp(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType, int i7) {
        if (!this.zzj) {
            int i8 = J.f3546b;
            j.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            int i9 = J.f3546b;
            j.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = o.f1952C.f1967n.i(this.zze, this.zzg.f10834a, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpd zzbpdVar = this.zza;
                if (zzbpdVar != null && !zzbpdVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzboz zzbozVar = this.zzl;
                if (zzbozVar != null && !zzbozVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbpa zzbpaVar = this.zzm;
                if (zzbpaVar == null || zzbpaVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to call recordImpression", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzt(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzu(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzv(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzw() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzx(InterfaceC0244n0 interfaceC0244n0) {
        int i7 = J.f3546b;
        j.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzy(zzbha zzbhaVar) {
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[Catch: RemoteException -> 0x002c, JSONException -> 0x0048, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:13:0x0032, B:15:0x0039, B:16:0x0048, B:18:0x004e, B:20:0x005a, B:23:0x0066, B:26:0x006d, B:28:0x0083, B:30:0x008b, B:45:0x00aa, B:35:0x0095, B:39:0x009e, B:48:0x00b1, B:49:0x00b5, B:50:0x00cb, B:52:0x00d1, B:56:0x00e3, B:58:0x00f1, B:60:0x00ff, B:62:0x0103, B:64:0x0116, B:66:0x011a), top: B:73:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00cb A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        p105o3.a aVarZzn;
        try {
            p105o3.b bVar = new p105o3.b(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z4 = true;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbI)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbJ)).booleanValue() && next.equals("3010")) {
                                zzbpd zzbpdVar = this.zza;
                                Object objT0 = null;
                                if (zzbpdVar != null) {
                                    try {
                                        aVarZzn = zzbpdVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboz zzbozVar = this.zzl;
                                    if (zzbozVar != null) {
                                        aVarZzn = zzbozVar.zzk();
                                    } else {
                                        zzbpa zzbpaVar = this.zzm;
                                        aVarZzn = zzbpaVar != null ? zzbpaVar.zzj() : null;
                                    }
                                }
                                if (aVarZzn != null) {
                                    objT0 = p105o3.b.t0(aVarZzn);
                                }
                                if (objT0 != null) {
                                    cls = objT0.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    D.A0(jSONArrayOptJSONArray, arrayList);
                                    P p5 = o.f1952C.f1957c;
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    D.A0(jSONArrayOptJSONArray, arrayList2);
                                    P p7 = o.f1952C.f1957c;
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z4 = false;
                        break;
                    }
                }
            }
            this.zzk = z4;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbpd zzbpdVar2 = this.zza;
            if (zzbpdVar2 != null) {
                zzbpdVar2.zzy(bVar, new p105o3.b(mapZzc), new p105o3.b(mapZzc2));
                return;
            }
            zzboz zzbozVar2 = this.zzl;
            if (zzbozVar2 != null) {
                zzbozVar2.zzv(bVar, new p105o3.b(mapZzc), new p105o3.b(mapZzc2));
                this.zzl.zzu(bVar);
                return;
            }
            zzbpa zzbpaVar2 = this.zzm;
            if (zzbpaVar2 != null) {
                zzbpaVar2.zzt(bVar, new p105o3.b(mapZzc), new p105o3.b(mapZzc2));
                this.zzm.zzs(bVar);
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to call trackView", e7);
        }
    }
}
