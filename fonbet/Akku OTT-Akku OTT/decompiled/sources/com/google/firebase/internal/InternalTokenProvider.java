package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;

/* loaded from: classes4.dex */
public interface InternalTokenProvider {
    @NonNull
    Task<GetTokenResult> getAccessToken(boolean z);

    @Nullable
    String getUid();
}
