package com.plaid.internal;

/* loaded from: classes16.dex */
public final class R5 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.P5 f5910a;

    public R5(com.plaid.internal.P5 p5) {
        this.f5910a = p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.plaid.internal.P5 p5 = this.f5910a;
        com.plaid.internal.C0615p6 c0615p6 = p5.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "");
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("JS send Link is shown", true);
        p5.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"open\", \"data\": {}}')");
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "JSBridge - sent open");
    }
}
