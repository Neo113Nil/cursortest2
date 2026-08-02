package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
public final class zzaeq {
    public static zzaia zza(PhoneAuthCredential phoneAuthCredential) {
        if (TextUtils.isEmpty(phoneAuthCredential.f11881e)) {
            return zzaia.zza(phoneAuthCredential.f11877a, phoneAuthCredential.f11878b, phoneAuthCredential.f11880d);
        }
        return zzaia.zzb(phoneAuthCredential.f11879c, phoneAuthCredential.f11881e, phoneAuthCredential.f11880d);
    }
}
