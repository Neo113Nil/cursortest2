package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgjt extends zzgka {
    private final Context zza;

    zzgjt(zzaya zzayaVar, zzgiw zzgiwVar, Context context, zzgrh zzgrhVar) {
        super("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzayaVar) {
            zzayaVar.zzc(((Long) objArr2[0]).longValue());
            zzayaVar.zzP(((Long) objArr2[1]).longValue());
        }
    }
}
