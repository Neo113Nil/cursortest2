package U5;

import com.google.protobuf.AbstractC0891a;
import java.util.List;

/* renamed from: U5.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0457y {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0453u a() {
        boolean z4;
        List b7 = b();
        if (b7 != null) {
            z4 = true;
        }
        z4 = false;
        p3.f.s(z4, "%s does not have exactly one group", b7);
        return (C0453u) b7.get(0);
    }

    public abstract List b();

    public abstract C0435b c();

    public abstract AbstractC0438e d();

    public abstract Object e();

    public abstract String f();

    public abstract void g(l0 l0Var, b0 b0Var);

    public abstract void i(AbstractC0891a abstractC0891a);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(AbstractC0438e abstractC0438e);

    public abstract void o(M m7);

    public abstract void p(List list);

    public void j() {
    }

    public void h(b0 b0Var) {
    }
}
