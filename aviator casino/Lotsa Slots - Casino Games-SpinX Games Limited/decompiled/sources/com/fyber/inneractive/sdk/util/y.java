package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class y extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.b0 f4319a;

    public y(com.fyber.inneractive.sdk.util.b0 b0Var) {
        this.f4319a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.fyber.inneractive.sdk.util.b0 b0Var = this.f4319a;
        b0Var.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sonReceive. action = %s", com.fyber.inneractive.sdk.util.IAlog.a(b0Var), intent.getAction());
        com.fyber.inneractive.sdk.util.b0.a(this.f4319a, context, intent);
    }
}
