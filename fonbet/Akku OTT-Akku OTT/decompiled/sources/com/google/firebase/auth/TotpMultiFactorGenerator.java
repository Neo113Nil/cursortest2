package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class TotpMultiFactorGenerator {

    @NonNull
    public static final String FACTOR_ID = "totp";

    private TotpMultiFactorGenerator() {
    }

    @NonNull
    public static Task<TotpSecret> generateSecret(@NonNull MultiFactorSession multiFactorSession) {
        C0875q.g(multiFactorSession);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) multiFactorSession;
        return FirebaseAuth.getInstance(zzamVar.zza().zza()).zza(zzamVar);
    }

    @NonNull
    public static TotpMultiFactorAssertion getAssertionForEnrollment(@NonNull TotpSecret totpSecret, @NonNull String str) {
        C0875q.g(str);
        C0875q.g(totpSecret);
        return new TotpMultiFactorAssertion(str, totpSecret, null);
    }

    @NonNull
    public static TotpMultiFactorAssertion getAssertionForSignIn(@NonNull String str, @NonNull String str2) {
        C0875q.g(str2);
        C0875q.g(str);
        return new TotpMultiFactorAssertion(str2, null, str);
    }
}
