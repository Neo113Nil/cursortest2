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
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
                this.zza.zzw(new BinderC1507b(view));
                this.zzc.onAdClicked();
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzboz zzbozVar = this.zzl;
            if (zzbozVar != null && !zzbozVar.zzx()) {
                this.zzl.zzs(new BinderC1507b(view));
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
            this.zzm.zzq(new BinderC1507b(view));
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
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzA(View view, Map map) {
        try {
            BinderC1507b binderC1507b = new BinderC1507b(view);
            zzbpd zzbpdVar = this.zza;
            if (zzbpdVar != null) {
                zzbpdVar.zzz(binderC1507b);
                return;
            }
            zzboz zzbozVar = this.zzl;
            if (zzbozVar != null) {
                zzbozVar.zzw(binderC1507b);
                return;
            }
            zzbpa zzbpaVar = this.zzm;
            if (zzbpaVar != null) {
                zzbpaVar.zzu(binderC1507b);
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

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        InterfaceC1506a zzn;
        try {
            BinderC1507b binderC1507b = new BinderC1507b(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z4 = true;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbI)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbJ)).booleanValue() && next.equals("3010")) {
                                zzbpd zzbpdVar = this.zza;
                                Object obj2 = null;
                                if (zzbpdVar != null) {
                                    try {
                                        zzn = zzbpdVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboz zzbozVar = this.zzl;
                                    if (zzbozVar != null) {
                                        zzn = zzbozVar.zzk();
                                    } else {
                                        zzbpa zzbpaVar = this.zzm;
                                        zzn = zzbpaVar != null ? zzbpaVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = BinderC1507b.t0(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                D.A0(optJSONArray, arrayList);
                                P p5 = o.f1952C.f1957c;
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z4 = false;
                        break;
                    }
                }
            }
            this.zzk = z4;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpd zzbpdVar2 = this.zza;
            if (zzbpdVar2 != null) {
                zzbpdVar2.zzy(binderC1507b, new BinderC1507b(zzc), new BinderC1507b(zzc2));
                return;
            }
            zzboz zzbozVar2 = this.zzl;
            if (zzbozVar2 != null) {
                zzbozVar2.zzv(binderC1507b, new BinderC1507b(zzc), new BinderC1507b(zzc2));
                this.zzl.zzu(binderC1507b);
                return;
            }
            zzbpa zzbpaVar2 = this.zzm;
            if (zzbpaVar2 != null) {
                zzbpaVar2.zzt(binderC1507b, new BinderC1507b(zzc), new BinderC1507b(zzc2));
                this.zzm.zzs(binderC1507b);
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to call trackView", e7);
        }
    }
}
