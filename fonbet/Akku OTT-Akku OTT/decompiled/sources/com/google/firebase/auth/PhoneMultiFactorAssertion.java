package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public class PhoneMultiFactorAssertion extends MultiFactorAssertion {
    private final PhoneAuthCredential zza;

    public PhoneMultiFactorAssertion(@NonNull PhoneAuthCredential phoneAuthCredential) {
        C0875q.g(phoneAuthCredential);
        this.zza = phoneAuthCredential;
    }

    @Override // com.google.firebase.auth.MultiFactorAssertion
    @NonNull
    public String getFactorId() {
        return "phone";
    }

    @NonNull
    public final PhoneAuthCredential zza() {
        return this.zza;
    }
}
