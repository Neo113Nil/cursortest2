package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.firebase.internal.InternalTokenResult;

/* loaded from: classes4.dex */
public interface IdTokenListener {
    void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult);
}
