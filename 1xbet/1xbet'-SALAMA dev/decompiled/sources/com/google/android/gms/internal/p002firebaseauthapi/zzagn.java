package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.D;
import java.io.UnsupportedEncodingException;
import java.util.List;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzagn {
    public static long zza(String str) {
        zzagq zzagqVarZzb = zzb(str);
        return zzagqVarZzb.zza().longValue() - zzagqVarZzb.zzb().longValue();
    }

    private static zzagq zzb(String str) {
        D.e(str);
        List<String> listZza = zzx.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(L.i("Invalid idToken ", str));
        }
        String str2 = listZza.get(1);
        try {
            return zzagq.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("Unable to decode token", e7);
        }
    }
}
