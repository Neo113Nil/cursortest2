package U5;

import com.google.protobuf.AbstractC0847a;
import java.util.List;

/* JADX INFO: renamed from: U5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0457y {
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public C0453u a() {
        boolean z4;
        List listB = b();
        if (listB != null) {
            z4 = listB.size() == 1;
        }
        p113p3.f.s(z4, "%s does not have exactly one group", listB);
        return (C0453u) listB.get(0);
    }

    public abstract List b();

    public abstract C0435b c();

    public abstract AbstractC0438e d();

    public abstract Object e();

    public abstract String f();

    public abstract void g(l0 l0Var, b0 b0Var);

    public abstract void i(AbstractC0847a abstractC0847a);

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
