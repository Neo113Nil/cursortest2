package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import defpackage.g;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    @NonNull
    private static zzahw zzb(String str) {
        C0875q.d(str);
        List<String> zza = zzt.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            throw new RuntimeException(g.a("Invalid idToken ", str));
        }
        try {
            return zzahw.zza(new String(Base64Utils.decodeUrlSafeNoPadding(zza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
