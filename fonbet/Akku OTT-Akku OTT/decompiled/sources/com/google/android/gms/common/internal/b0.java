package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class b0 extends Q {

    @Nullable
    public AbstractC0861c a;
    public final int b;

    public b0(@NonNull AbstractC0861c abstractC0861c, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = abstractC0861c;
        this.b = i;
    }
}
