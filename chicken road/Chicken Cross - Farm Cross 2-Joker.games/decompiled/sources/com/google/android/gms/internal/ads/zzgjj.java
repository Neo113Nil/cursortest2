package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgjj extends zzgka {
    zzgjj(zzaya zzayaVar, zzgiw zzgiwVar, zzgrh zzgrhVar) {
        super("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", zzayaVar, zzgiwVar, zzgrhVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzayaVar) {
            zzayaVar.zza(ExifInterface.LONGITUDE_EAST);
            zzayaVar.zzB(0L);
            zzayaVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzayaVar) {
            zzayaVar.zza((String) objArr2[0]);
            zzayaVar.zzB(((Long) objArr2[1]).longValue());
            zzayaVar.zzV((String) objArr2[2]);
        }
    }
}
