package Ae0;

import B1.AbstractC2531a;
import B1.C2551u;
import D1.V;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes7.dex */
public final class c {
    public static final int a(V v11, AbstractC2531a abstractC2531a) {
        V a12 = v11.a1();
        if (a12 == null) {
            A1.a.b("Child of " + v11 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (v11.g1().s().containsKey(abstractC2531a)) {
            Integer num = v11.g1().s().get(abstractC2531a);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int E11 = a12.E(abstractC2531a);
            if (E11 != Integer.MIN_VALUE) {
                a12.A1(true);
                v11.w1(true);
                v11.s1();
                a12.A1(false);
                v11.w1(false);
                return abstractC2531a instanceof C2551u ? E11 + ((int) (a12.l1() & 4294967295L)) : E11 + ((int) (a12.l1() >> 32));
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }
}
