package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.FirebaseException;

/* loaded from: classes4.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        C0875q.d(str);
        this.zza = str;
    }

    @NonNull
    public String getErrorCode() {
        return this.zza;
    }
}
