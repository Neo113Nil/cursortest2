package com.ironsource;

/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3374y1 extends com.ironsource.AbstractC3143l3 {
    public C3374y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC3143l3
    protected int c(com.ironsource.C3360x5 c3360x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC3143l3
    protected java.lang.String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void f(com.ironsource.C3360x5 c3360x5) {
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean h(com.ironsource.C3360x5 c3360x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean j(com.ironsource.C3360x5 c3360x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean d(com.ironsource.C3360x5 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int c = event.c();
        return c == com.ironsource.EnumC3378y5.FIRST_INSTANCE.b() || c == com.ironsource.EnumC3378y5.INIT_COMPLETE.b() || c == com.ironsource.EnumC3378y5.SDK_INIT_FAILED.b() || c == com.ironsource.EnumC3378y5.SDK_INIT_SUCCESS.b();
    }
}
