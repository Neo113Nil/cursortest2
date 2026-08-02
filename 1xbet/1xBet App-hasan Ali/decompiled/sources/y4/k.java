package y4;

import L4.C0226i;
import L4.InterfaceC0227j;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import v.AbstractC2528x;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: c, reason: collision with root package name */
    public static final q f21353c;

    /* renamed from: a, reason: collision with root package name */
    public final List f21354a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21355b;

    static {
        Pattern pattern = q.f21370d;
        f21353c = AbstractC2528x.d("application/x-www-form-urlencoded");
    }

    public k(ArrayList arrayList, ArrayList arrayList2) {
        kotlin.jvm.internal.l.f("encodedNames", arrayList);
        kotlin.jvm.internal.l.f("encodedValues", arrayList2);
        this.f21354a = z4.b.v(arrayList);
        this.f21355b = z4.b.v(arrayList2);
    }

    @Override // y4.x
    public final long a() {
        return d(null, true);
    }

    @Override // y4.x
    public final q b() {
        return f21353c;
    }

    @Override // y4.x
    public final void c(InterfaceC0227j interfaceC0227j) {
        d(interfaceC0227j, false);
    }

    public final long d(InterfaceC0227j interfaceC0227j, boolean z3) {
        C0226i a5;
        if (z3) {
            a5 = new C0226i();
        } else {
            kotlin.jvm.internal.l.c(interfaceC0227j);
            a5 = interfaceC0227j.a();
        }
        List list = this.f21354a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a5.P(38);
            }
            a5.U((String) list.get(i));
            a5.P(61);
            a5.U((String) this.f21355b.get(i));
        }
        if (!z3) {
            return 0L;
        }
        long j5 = a5.f3091l;
        a5.b();
        return j5;
    }
}
