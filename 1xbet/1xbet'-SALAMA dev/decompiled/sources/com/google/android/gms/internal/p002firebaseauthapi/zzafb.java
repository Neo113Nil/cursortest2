package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031e1.k;
import p122r.b;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzafb {
    private static final Map<String, zzafe> zza = new b();
    private static final Map<String, List<WeakReference<zzafd>>> zzb = new b();

    private static String zza(String str, int i7, boolean z4) {
        if (z4) {
            return "http://[" + str + "]:" + i7 + "/";
        }
        return "http://" + str + ":" + i7 + "/";
    }

    public static String zzb(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return k.e(zzafeVar != null ? L.i("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return k.e(zzafeVar != null ? L.i("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return k.e(zzafeVar != null ? L.i("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar != null) {
            return k.e(zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzafd zzafdVar) {
        Map<String, List<WeakReference<zzafd>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzafdVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzafdVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(i iVar) {
        Map<String, zzafe> map = zza;
        iVar.b();
        return map.containsKey(iVar.f7665c.f7672a);
    }

    public static void zza(i iVar, String str, int i7) {
        iVar.b();
        String str2 = iVar.f7665c.f7672a;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            map.put(str2, new zzafe(str, i7));
        }
        Map<String, List<WeakReference<zzafd>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzafd>> it = map2.get(str2).iterator();
                    boolean z4 = false;
                    while (it.hasNext()) {
                        zzafd zzafdVar = it.next().get();
                        if (zzafdVar != null) {
                            zzafdVar.zza();
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
