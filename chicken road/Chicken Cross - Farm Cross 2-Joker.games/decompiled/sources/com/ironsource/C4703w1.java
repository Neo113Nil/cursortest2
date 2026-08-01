package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4703w1 extends AbstractC4455i3 {
    public C4703w1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4455i3
    protected int c(C4689v5 c4689v5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void f(C4689v5 c4689v5) {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean h(C4689v5 c4689v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean j(C4689v5 c4689v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean d(C4689v5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int c = event.c();
        return c == EnumC4707w5.FIRST_INSTANCE.b() || c == EnumC4707w5.INIT_COMPLETE.b() || c == EnumC4707w5.SDK_INIT_FAILED.b() || c == EnumC4707w5.SDK_INIT_SUCCESS.b();
    }
}
