package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzed implements zzec {
    zzed() {
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final int zzb(int i, Object obj, Object obj2) {
        zzeb zzebVar = (zzeb) obj;
        if (zzebVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzebVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final Object zzb(Object obj, Object obj2) {
        zzeb zzebVar = (zzeb) obj;
        zzeb zzebVar2 = (zzeb) obj2;
        if (!zzebVar2.isEmpty()) {
            if (!zzebVar.isMutable()) {
                zzebVar = zzebVar.zzeu();
            }
            zzebVar.zza(zzebVar2);
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final Map<?, ?> zzi(Object obj) {
        return (zzeb) obj;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final Map<?, ?> zzj(Object obj) {
        return (zzeb) obj;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final boolean zzk(Object obj) {
        return !((zzeb) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final Object zzl(Object obj) {
        ((zzeb) obj).zzbs();
        return obj;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final Object zzm(Object obj) {
        return zzeb.zzet().zzeu();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzec
    public final zzea<?, ?> zzn(Object obj) {
        throw new NoSuchMethodError();
    }
}
