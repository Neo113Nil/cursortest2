package com.google.firebase.appcheck;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class AppCheckTokenResult {
    @Nullable
    public abstract Exception getError();

    @NonNull
    public abstract String getToken();
}
