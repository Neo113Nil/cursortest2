package p000;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class we0 extends AbstractC0875xf {

    /* JADX INFO: renamed from: i */
    public me0 f8523i;

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: h */
    public final void mo5320h(int i, String str, Object... objArr) {
        me0 me0Var = this.f8523i;
        Level levelM5796t = C0912yf.m5796t(i);
        if (C0137dg.f1641c.isLoggable(levelM5796t)) {
            C0137dg.m1201a(me0Var, levelM5796t, MessageFormat.format(str, objArr));
        }
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: i */
    public final void mo5321i(String str, int i) {
        me0 me0Var = this.f8523i;
        Level levelM5796t = C0912yf.m5796t(i);
        if (C0137dg.f1641c.isLoggable(levelM5796t)) {
            C0137dg.m1201a(me0Var, levelM5796t, str);
        }
    }
}
