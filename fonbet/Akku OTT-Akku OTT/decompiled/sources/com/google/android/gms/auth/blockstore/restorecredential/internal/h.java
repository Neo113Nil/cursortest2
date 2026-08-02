package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.C0863e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.api.g<a.d.c> {
    public static final b Companion = new b();
    public static final com.google.android.gms.common.api.a<a.d.c> a = new com.google.android.gms.common.api.a<>("RestoreCredential.API", new a(), new a.g());

    public static final class a extends a.AbstractC0110a<l, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0110a
        @NonNull
        public final l buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull C0863e clientSettings, @NonNull a.d.c cVar, @NonNull InterfaceC0832f connectionCallbacks, @NonNull InterfaceC0841o connectionFailedListener) {
            a.d.c apiOptions = cVar;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(clientSettings, "commonSettings");
            Intrinsics.checkNotNullParameter(apiOptions, "apiOptions");
            Intrinsics.checkNotNullParameter(connectionCallbacks, "connectedListener");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
            Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
            Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
            return new l(context, looper, 381, clientSettings, connectionCallbacks, connectionFailedListener);
        }
    }

    public static final class b {
    }
}
