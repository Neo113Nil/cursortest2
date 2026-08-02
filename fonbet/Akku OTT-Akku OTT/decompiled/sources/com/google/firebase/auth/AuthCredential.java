package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;

/* loaded from: classes4.dex */
public abstract class AuthCredential extends a {
    @NonNull
    public abstract String getProvider();

    @NonNull
    public abstract String getSignInMethod();

    @NonNull
    public abstract AuthCredential zza();
}
