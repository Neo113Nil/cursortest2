package com.google.android.recaptcha.internal;

import g6.C1167p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import t6.h;

/* loaded from: classes.dex */
public final class zzef extends zzee {
    private final Function2 zza;
    private final String zzb;

    public zzef(Function2 function2, String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g6.p] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.recaptcha.internal.zzkm, com.google.android.recaptcha.internal.zzrj] */
    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        ?? r02;
        if (!h.a(method.getName(), this.zzb)) {
            return false;
        }
        ?? zzf = zzrm.zzf();
        if (objArr != null) {
            r02 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzrk zzf2 = zzrl.zzf();
                zzf2.zzv(obj2.toString());
                r02.add((zzrl) zzf2.zzj());
            }
        } else {
            r02 = C1167p.f13302a;
        }
        zzf.zzd(r02);
        zzrm zzrmVar = (zzrm) zzf.zzj();
        Function2 function2 = this.zza;
        byte[] zzd = zzrmVar.zzd();
        function2.invoke(objArr, zzhz.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
