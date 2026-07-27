package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4357cd extends AbstractC4455i3 {
    public static final C4357cd P;

    static {
        C4357cd c4357cd = new C4357cd();
        P = c4357cd;
        c4357cd.H = "outcome";
        c4357cd.G = 0;
        c4357cd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4357cd.e();
    }

    private C4357cd() {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void a(ArrayList<C4689v5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected int c(C4689v5 c4689v5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean d(C4689v5 c4689v5) {
        return true;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void f(C4689v5 c4689v5) {
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean g(C4689v5 c4689v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean h(C4689v5 c4689v5) {
        return false;
    }

    public final void i() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C4689v5(EnumC4707w5.INIT_DEFERRED_DATA, new C4292a9().a()));
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean j(C4689v5 c4689v5) {
        return false;
    }
}
