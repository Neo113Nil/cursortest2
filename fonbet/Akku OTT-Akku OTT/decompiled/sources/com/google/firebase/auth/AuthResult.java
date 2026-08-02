package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.d;

/* loaded from: classes4.dex */
public interface AuthResult extends d {
    @Nullable
    AdditionalUserInfo getAdditionalUserInfo();

    @Nullable
    AuthCredential getCredential();

    @Nullable
    FirebaseUser getUser();
}
