package p000;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn0 extends hn0 {

    /* JADX INFO: renamed from: c */
    public final MeasurementManager f2812c;

    public gn0(MeasurementManager measurementManager) {
        this.f2812c = measurementManager;
    }

    /* JADX INFO: renamed from: A */
    public static Object m2125A(gn0 gn0Var, Uri uri, InputEvent inputEvent, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        C0136df c0136df = new C0136df(1, d71.m1111f(interfaceC0808vm));
        c0136df.m1197w();
        gn0Var.f2812c.registerSource(uri, inputEvent, new fn0(), new C0919ym(c0136df));
        Object objM1195u = c0136df.m1195u();
        return objM1195u == EnumC0513nn.f5459j ? objM1195u : kf1.f4365a;
    }

    /* JADX INFO: renamed from: C */
    public static Object m2126C(gn0 gn0Var, Uri uri, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        C0136df c0136df = new C0136df(1, d71.m1111f(interfaceC0808vm));
        c0136df.m1197w();
        gn0Var.f2812c.registerTrigger(uri, new fn0(), new C0919ym(c0136df));
        Object objM1195u = c0136df.m1195u();
        return objM1195u == EnumC0513nn.f5459j ? objM1195u : kf1.f4365a;
    }

    /* JADX INFO: renamed from: E */
    public static Object m2127E(gn0 gn0Var, ti1 ti1Var, InterfaceC0808vm interfaceC0808vm) {
        new C0136df(1, d71.m1111f(interfaceC0808vm)).m1197w();
        MeasurementManager measurementManager = gn0Var.f2812c;
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static Object m2128G(gn0 gn0Var, ui1 ui1Var, InterfaceC0808vm interfaceC0808vm) {
        new C0136df(1, d71.m1111f(interfaceC0808vm)).m1197w();
        MeasurementManager measurementManager = gn0Var.f2812c;
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static Object m2129u(gn0 gn0Var, AbstractC0444ls abstractC0444ls, InterfaceC0808vm interfaceC0808vm) {
        new C0136df(1, d71.m1111f(interfaceC0808vm)).m1197w();
        MeasurementManager measurementManager = gn0Var.f2812c;
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static Object m2130w(gn0 gn0Var, InterfaceC0808vm interfaceC0808vm) {
        C0136df c0136df = new C0136df(1, d71.m1111f(interfaceC0808vm));
        c0136df.m1197w();
        gn0Var.f2812c.getMeasurementApiStatus(new fn0(), new C0919ym(c0136df));
        return c0136df.m1195u();
    }

    /* JADX INFO: renamed from: z */
    public static Object m2131z(gn0 gn0Var, d91 d91Var, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        C0257gp c0257gp = new C0257gp(gn0Var, null, 2);
        x51 x51Var = new x51(interfaceC0808vm, interfaceC0808vm.mo475d());
        Object objM4651e = t22.m4651e(x51Var, x51Var, c0257gp);
        return objM4651e == EnumC0513nn.f5459j ? objM4651e : kf1.f4365a;
    }

    /* JADX INFO: renamed from: B */
    public Object m2132B(Uri uri, InterfaceC0808vm interfaceC0808vm) {
        return m2126C(this, uri, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: D */
    public Object m2133D(ti1 ti1Var, InterfaceC0808vm interfaceC0808vm) {
        return m2127E(this, ti1Var, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: F */
    public Object m2134F(ui1 ui1Var, InterfaceC0808vm interfaceC0808vm) {
        return m2128G(this, ui1Var, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: t */
    public Object m2135t(AbstractC0444ls abstractC0444ls, InterfaceC0808vm interfaceC0808vm) {
        return m2129u(this, abstractC0444ls, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: v */
    public Object m2136v(InterfaceC0808vm interfaceC0808vm) {
        return m2130w(this, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: x */
    public Object m2137x(d91 d91Var, InterfaceC0808vm interfaceC0808vm) {
        return m2131z(this, d91Var, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: y */
    public Object m2138y(Uri uri, InputEvent inputEvent, InterfaceC0808vm interfaceC0808vm) {
        return m2125A(this, uri, inputEvent, interfaceC0808vm);
    }
}
