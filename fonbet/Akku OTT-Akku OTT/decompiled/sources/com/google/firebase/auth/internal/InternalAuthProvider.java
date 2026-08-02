package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.internal.InternalTokenProvider;

/* loaded from: classes4.dex */
public interface InternalAuthProvider extends InternalTokenProvider {
    @DeferredApi
    void addIdTokenListener(@NonNull IdTokenListener idTokenListener);

    @Override // com.google.firebase.internal.InternalTokenProvider
    @NonNull
    Task<GetTokenResult> getAccessToken(boolean z);

    @Override // com.google.firebase.internal.InternalTokenProvider
    @Nullable
    String getUid();

    void removeIdTokenListener(@NonNull IdTokenListener idTokenListener);
}
