package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0837k {
    void a(@NonNull String str, @NonNull C0836j c0836j);

    @Nullable
    C0836j b(@NonNull Class cls, @NonNull String str);

    @Nullable
    Activity c();

    void startActivityForResult(@NonNull Intent intent, int i);
}
