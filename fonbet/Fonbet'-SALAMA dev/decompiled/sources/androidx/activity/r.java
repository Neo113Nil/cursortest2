package androidx.activity;

import android.util.Log;
import androidx.fragment.app.C0713l;
import androidx.fragment.app.H;
import androidx.fragment.app.P;
import androidx.fragment.app.Q;
import androidx.fragment.app.Z;
import androidx.fragment.app.a0;
import f6.C1116i;
import g6.AbstractC1159h;
import g6.AbstractC1165n;
import g6.C1157f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f8118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(A a2, int i7) {
        super(1);
        this.f8117a = i7;
        this.f8118b = a2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f8117a) {
            case 0:
                t6.h.e((C0625b) obj, "backEvent");
                A a2 = this.f8118b;
                C1157f c1157f = a2.f8081b;
                c1157f.getClass();
                ListIterator listIterator = c1157f.listIterator(c1157f.f13300c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((H) obj2).f9356a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                H h6 = (H) obj2;
                a2.f8082c = h6;
                if (h6 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                    Q q7 = h6.f9359d;
                    if (isLoggable) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + q7);
                    }
                    q7.x();
                    q7.y(new P(q7), false);
                }
                return C1116i.f13008a;
            default:
                C0625b c0625b = (C0625b) obj;
                t6.h.e(c0625b, "backEvent");
                A a4 = this.f8118b;
                H h7 = a4.f8082c;
                if (h7 == null) {
                    C1157f c1157f2 = a4.f8081b;
                    c1157f2.getClass();
                    ListIterator listIterator2 = c1157f2.listIterator(c1157f2.f13300c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((H) obj3).f9356a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    h7 = (H) obj3;
                }
                if (h7 != null) {
                    boolean isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    Q q8 = h7.f9359d;
                    if (isLoggable2) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + q8);
                    }
                    if (q8.f9390h != null) {
                        Iterator it = q8.f(new ArrayList(Collections.singletonList(q8.f9390h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C0713l c0713l = (C0713l) it.next();
                            c0713l.getClass();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0625b.f8090c);
                            }
                            ArrayList arrayList = c0713l.f9468c;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((a0) it2.next()).getClass();
                                AbstractC1165n.O0(arrayList2, null);
                            }
                            List a12 = AbstractC1159h.a1(AbstractC1159h.e1(arrayList2));
                            int size = a12.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((Z) a12.get(i7)).b(c0625b, c0713l.f9466a);
                            }
                        }
                        Iterator it3 = q8.f9394m.iterator();
                        if (it3.hasNext()) {
                            it3.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return C1116i.f13008a;
        }
    }
}
