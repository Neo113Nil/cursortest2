package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public interface n {
    @NonNull
    @Deprecated
    Task<C0811e> beginSignIn(@NonNull C0810d c0810d);

    @NonNull
    String getPhoneNumberFromIntent(@Nullable Intent intent) throws com.google.android.gms.common.api.b;

    @NonNull
    Task<PendingIntent> getPhoneNumberHintIntent(@NonNull C0814h c0814h);

    @NonNull
    @Deprecated
    o getSignInCredentialFromIntent(@Nullable Intent intent) throws com.google.android.gms.common.api.b;

    @NonNull
    @Deprecated
    Task<PendingIntent> getSignInIntent(@NonNull C0815i c0815i);

    @NonNull
    @Deprecated
    Task<Void> signOut();
}
