package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzaj {
    void initialize();

    void interrupt(String str);

    boolean isInterrupted(String str);

    void purgeOutstandingWrites();

    void refreshAuthToken();

    void resume(String str);

    void shutdown();

    void zza(List<String> list, zzbb zzbbVar);

    void zza(List<String> list, Object obj, zzbb zzbbVar);

    void zza(List<String> list, Object obj, String str, zzbb zzbbVar);

    void zza(List<String> list, Map<String, Object> map);

    void zza(List<String> list, Map<String, Object> map, zzai zzaiVar, Long l, zzbb zzbbVar);

    void zza(List<String> list, Map<String, Object> map, zzbb zzbbVar);

    void zzb(List<String> list, Object obj, zzbb zzbbVar);

    void zzb(List<String> list, Map<String, Object> map, zzbb zzbbVar);

    void zzh(String str);
}
