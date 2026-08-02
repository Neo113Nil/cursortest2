package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public class PhoneMultiFactorGenerator {

    @NonNull
    public static final String FACTOR_ID = "phone";

    @NonNull
    public static PhoneMultiFactorAssertion getAssertion(@NonNull PhoneAuthCredential phoneAuthCredential) {
        C0875q.g(phoneAuthCredential);
        return new PhoneMultiFactorAssertion(phoneAuthCredential);
    }
}
