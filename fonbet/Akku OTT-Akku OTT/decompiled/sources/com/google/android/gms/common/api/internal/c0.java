package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c0 extends com.google.android.gms.signin.internal.d implements h.a, h.b {
    public static final com.google.android.gms.signin.b q = com.google.android.gms.signin.e.a;
    public final Context a;
    public final Handler b;
    public final com.google.android.gms.signin.b c;
    public final Set d;
    public final C0863e e;
    public com.google.android.gms.signin.f f;
    public N p;

    @WorkerThread
    public c0(Context context, Handler handler, @NonNull C0863e c0863e) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.a = context;
        this.b = handler;
        this.e = c0863e;
        this.d = c0863e.b;
        this.c = q;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0832f
    @WorkerThread
    public final void onConnected() {
        this.f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0841o
    @WorkerThread
    public final void onConnectionFailed(@NonNull C0852b c0852b) {
        this.p.b(c0852b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0832f
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        N n = this.p;
        K k = (K) n.f.l.get(n.b);
        if (k != null) {
            if (k.r) {
                k.n(new C0852b(17));
            } else {
                k.onConnectionSuspended(i);
            }
        }
    }
}
