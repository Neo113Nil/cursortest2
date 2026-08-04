package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import p050g6.g;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzeh extends zzee {
    private final zzeg zza;
    private final String zzb;

    public zzeh(zzeg zzegVar, String str, Object obj) {
        super(obj);
        this.zza = zzegVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!h.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? g.p0(objArr) : p.f13308a);
        return true;
    }
}
