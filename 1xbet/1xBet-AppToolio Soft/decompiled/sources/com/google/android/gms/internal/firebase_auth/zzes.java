package com.google.android.gms.internal.firebase_auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzes {
    private static final zzes zzud = new zzes();
    private final zzew zzue;
    private final ConcurrentMap<Class<?>, zzev<?>> zzuf = new ConcurrentHashMap();

    private zzes() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzew zzewVar = null;
        for (int i = 0; i <= 0; i++) {
            zzewVar = zzaq(strArr[0]);
            if (zzewVar != null) {
                break;
            }
        }
        this.zzue = zzewVar == null ? new zzdw() : zzewVar;
    }

    private static zzew zzaq(String str) {
        try {
            return (zzew) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzes zzfg() {
        return zzud;
    }

    public final <T> zzev<T> zzf(Class<T> cls) {
        zzdd.zza(cls, "messageType");
        zzev<T> zzevVar = (zzev) this.zzuf.get(cls);
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev<T> zze = this.zzue.zze(cls);
        zzdd.zza(cls, "messageType");
        zzdd.zza(zze, "schema");
        zzev<T> zzevVar2 = (zzev) this.zzuf.putIfAbsent(cls, zze);
        return zzevVar2 != null ? zzevVar2 : zze;
    }

    public final <T> zzev<T> zzq(T t) {
        return zzf(t.getClass());
    }
}
