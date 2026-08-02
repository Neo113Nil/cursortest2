package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.changelist.d;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.firebase.FirebaseApp;
import defpackage.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzagl {
    private static final Map<String, zzagk> zza = new ArrayMap();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new ArrayMap();

    private static String zza(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + DomExceptionUtils.SEPARATOR;
        }
        return "http://" + str + ":" + i + DomExceptionUtils.SEPARATOR;
    }

    @NonNull
    public static String zzb(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return d.b(zzagkVar != null ? g.a("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    @NonNull
    public static String zzc(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return d.b(zzagkVar != null ? g.a("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    @NonNull
    public static String zzd(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return d.b(zzagkVar != null ? g.a("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    @NonNull
    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            return d.b(zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, int i) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzagk(str, i));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(apiKey)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(apiKey).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z = true;
                        }
                    }
                    if (!z) {
                        zza.remove(apiKey);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(@NonNull FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }
}
