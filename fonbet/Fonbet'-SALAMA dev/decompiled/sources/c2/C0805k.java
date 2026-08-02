package c2;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import r5.C1578c;

/* renamed from: c2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0805k implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10368b;

    public /* synthetic */ C0805k(Object obj, int i7) {
        this.f10367a = i7;
        this.f10368b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[LOOP:2: B:47:0x0117->B:48:0x0119, LOOP_END] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        int i7;
        Object obj = this.f10368b;
        switch (this.f10367a) {
            case 0:
                C0811q c0811q = (C0811q) obj;
                c0811q.getClass();
                int i8 = message.what;
                if (i8 != 0) {
                    ArrayList arrayList = c0811q.f10391n;
                    if (i8 == 1) {
                        Object obj2 = message.obj;
                        int i9 = v2.t.f17153a;
                        C0810p c0810p = (C0810p) obj2;
                        int i10 = c0810p.f10384a;
                        int intValue = ((Integer) c0810p.f10385b).intValue();
                        if (i10 == 0) {
                            Z z4 = c0811q.f10398u;
                            if (intValue == z4.f10294b.length) {
                                c0811q.f10398u = z4.a();
                                for (i7 = intValue - 1; i7 >= i10; i7--) {
                                    C0809o c0809o = (C0809o) arrayList.remove(i7);
                                    c0811q.f10393p.remove(c0809o.f10379b);
                                    c0811q.x(i7, -1, -c0809o.f10378a.f10421o.f10399b.o());
                                    c0809o.f10383f = true;
                                    c0811q.B(c0809o);
                                }
                                c0811q.E(c0810p.f10386c);
                            }
                        }
                        c0811q.f10398u = c0811q.f10398u.c(i10, intValue);
                        while (i7 >= i10) {
                        }
                        c0811q.E(c0810p.f10386c);
                    } else if (i8 == 2) {
                        Object obj3 = message.obj;
                        int i11 = v2.t.f17153a;
                        C0810p c0810p2 = (C0810p) obj3;
                        Z z7 = c0811q.f10398u;
                        int i12 = c0810p2.f10384a;
                        Z c3 = z7.c(i12, i12 + 1);
                        c0811q.f10398u = c3;
                        Integer num = (Integer) c0810p2.f10385b;
                        c0811q.f10398u = c3.b(num.intValue(), 1);
                        int intValue2 = num.intValue();
                        int i13 = c0810p2.f10384a;
                        int min = Math.min(i13, intValue2);
                        int max = Math.max(i13, intValue2);
                        int i14 = ((C0809o) arrayList.get(min)).f10382e;
                        arrayList.add(intValue2, (C0809o) arrayList.remove(i13));
                        while (min <= max) {
                            C0809o c0809o2 = (C0809o) arrayList.get(min);
                            c0809o2.f10381d = min;
                            c0809o2.f10382e = i14;
                            i14 += c0809o2.f10378a.f10421o.f10399b.o();
                            min++;
                        }
                        c0811q.E(c0810p2.f10386c);
                    } else if (i8 == 3) {
                        Object obj4 = message.obj;
                        int i15 = v2.t.f17153a;
                        C0810p c0810p3 = (C0810p) obj4;
                        c0811q.f10398u = (Z) c0810p3.f10385b;
                        c0811q.E(c0810p3.f10386c);
                    } else if (i8 == 4) {
                        c0811q.H();
                    } else {
                        if (i8 != 5) {
                            throw new IllegalStateException();
                        }
                        Object obj5 = message.obj;
                        int i16 = v2.t.f17153a;
                        c0811q.A((Set) obj5);
                    }
                } else {
                    Object obj6 = message.obj;
                    int i17 = v2.t.f17153a;
                    C0810p c0810p4 = (C0810p) obj6;
                    Z z8 = c0811q.f10398u;
                    int i18 = c0810p4.f10384a;
                    Collection collection = (Collection) c0810p4.f10385b;
                    c0811q.f10398u = z8.b(i18, collection.size());
                    c0811q.v(c0810p4.f10384a, collection);
                    c0811q.E(c0810p4.f10386c);
                }
                return true;
            default:
                C1578c c1578c = (C1578c) obj;
                Iterator it = ((CopyOnWriteArraySet) c1578c.f16056e).iterator();
                while (it.hasNext()) {
                    v2.g gVar = (v2.g) it.next();
                    if (!gVar.f17108d && gVar.f17107c) {
                        v2.d e7 = gVar.f17106b.e();
                        gVar.f17106b = new B3.g();
                        gVar.f17107c = false;
                        ((v2.f) c1578c.f16055d).c(gVar.f17105a, e7);
                    }
                    if (((v2.r) c1578c.f16054c).f17148a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
        }
    }
}
