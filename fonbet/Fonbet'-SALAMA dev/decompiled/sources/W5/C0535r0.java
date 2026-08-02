package W5;

import U5.AbstractC0438e;
import java.text.MessageFormat;
import java.util.logging.Level;

/* renamed from: W5.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0535r0 extends AbstractC0438e {

    /* renamed from: d, reason: collision with root package name */
    public U5.F f7321d;

    @Override // U5.AbstractC0438e
    public final void l(int i7, String str) {
        U5.F f7 = this.f7321d;
        Level t7 = C0517l.t(i7);
        if (C0523n.f7290c.isLoggable(t7)) {
            C0523n.a(f7, t7, str);
        }
    }

    @Override // U5.AbstractC0438e
    public final void m(int i7, String str, Object... objArr) {
        U5.F f7 = this.f7321d;
        Level t7 = C0517l.t(i7);
        if (C0523n.f7290c.isLoggable(t7)) {
            C0523n.a(f7, t7, MessageFormat.format(str, objArr));
        }
    }
}
