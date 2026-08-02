package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import g6.C1167p;
import java.lang.reflect.Method;
import t6.h;

/* loaded from: classes.dex */
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
        this.zza.zzb(objArr != null ? AbstractC1158g.p0(objArr) : C1167p.f13302a);
        return true;
    }
}
