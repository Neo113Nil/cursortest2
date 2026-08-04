package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
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
        ?? arrayList;
        if (!h.a(method.getName(), this.zzb)) {
            return false;
        }
        ?? Zzf = zzrm.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzrk zzrkVarZzf = zzrl.zzf();
                zzrkVarZzf.zzv(obj2.toString());
                arrayList.add((zzrl) zzrkVarZzf.zzj());
            }
        } else {
            arrayList = p.f13308a;
        }
        Zzf.zzd(arrayList);
        zzrm zzrmVar = (zzrm) Zzf.zzj();
        Function2 function2 = this.zza;
        byte[] bArrZzd = zzrmVar.zzd();
        function2.invoke(objArr, zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
