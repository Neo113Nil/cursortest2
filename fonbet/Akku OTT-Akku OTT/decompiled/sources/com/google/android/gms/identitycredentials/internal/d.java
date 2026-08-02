package com.google.android.gms.identitycredentials.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements r {

    @NonNull
    public /* synthetic */ GetCredentialRequest a;

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(@NonNull Object obj, @NonNull Object obj2) {
        GetCredentialRequest request = this.a;
        Intrinsics.checkNotNullParameter(request, "$request");
        ((b) ((c) obj).getService()).w(new e((TaskCompletionSource) obj2), request);
    }
}
