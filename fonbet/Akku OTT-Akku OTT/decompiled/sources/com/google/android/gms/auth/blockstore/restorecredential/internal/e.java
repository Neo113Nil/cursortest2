package com.google.android.gms.auth.blockstore.restorecredential.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements r {

    @NonNull
    public /* synthetic */ com.google.android.gms.auth.blockstore.restorecredential.a a;

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(@NonNull Object obj, @NonNull Object obj2) {
        com.google.android.gms.auth.blockstore.restorecredential.a request = this.a;
        Intrinsics.checkNotNullParameter(request, "$request");
        ((d) ((l) obj).getService()).l(request, new i((TaskCompletionSource) obj2));
    }
}
