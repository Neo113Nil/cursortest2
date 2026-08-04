package p018c2;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p128r5.c;
import p151v2.d;
import p151v2.f;
import p151v2.g;
import p151v2.r;
import p151v2.t;

/* JADX INFO: renamed from: c2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0765k implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10368b;

    public /* synthetic */ C0765k(Object obj, int i7) {
        this.f10367a = i7;
        this.f10368b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj = this.f10368b;
        switch (this.f10367a) {
            case 0:
                C0771q c0771q = (C0771q) obj;
                c0771q.getClass();
                int i7 = message.what;
                if (i7 != 0) {
                    ArrayList arrayList = c0771q.f10391n;
                    if (i7 == 1) {
                        Object obj2 = message.obj;
                        int i8 = t.f17159a;
                        C0770p c0770p = (C0770p) obj2;
                        int i9 = c0770p.f10384a;
                        int iIntValue = ((Integer) c0770p.f10385b).intValue();
                        if (i9 == 0) {
                            Z z4 = c0771q.f10398u;
                            if (iIntValue == z4.f10294b.length) {
                                c0771q.f10398u = z4.a();
                            } else {
                                c0771q.f10398u = c0771q.f10398u.c(i9, iIntValue);
                            }
                        } else {
                            c0771q.f10398u = c0771q.f10398u.c(i9, iIntValue);
                        }
                        for (int i10 = iIntValue - 1; i10 >= i9; i10--) {
                            C0769o c0769o = (C0769o) arrayList.remove(i10);
                            c0771q.f10393p.remove(c0769o.f10379b);
                            c0771q.x(i10, -1, -c0769o.f10378a.f10421o.f10399b.o());
                            c0769o.f10383f = true;
                            c0771q.B(c0769o);
                        }
                        c0771q.E(c0770p.f10386c);
                    } else if (i7 == 2) {
                        Object obj3 = message.obj;
                        int i11 = t.f17159a;
                        C0770p c0770p2 = (C0770p) obj3;
                        Z z7 = c0771q.f10398u;
                        int i12 = c0770p2.f10384a;
                        Z zC = z7.c(i12, i12 + 1);
                        c0771q.f10398u = zC;
                        Integer num = (Integer) c0770p2.f10385b;
                        c0771q.f10398u = zC.b(num.intValue(), 1);
                        int iIntValue2 = num.intValue();
                        int i13 = c0770p2.f10384a;
                        int iMin = Math.min(i13, iIntValue2);
                        int iMax = Math.max(i13, iIntValue2);
                        int iO = ((C0769o) arrayList.get(iMin)).f10382e;
                        arrayList.add(iIntValue2, (C0769o) arrayList.remove(i13));
                        while (iMin <= iMax) {
                            C0769o c0769o2 = (C0769o) arrayList.get(iMin);
                            c0769o2.f10381d = iMin;
                            c0769o2.f10382e = iO;
                            iO += c0769o2.f10378a.f10421o.f10399b.o();
                            iMin++;
                        }
                        c0771q.E(c0770p2.f10386c);
                    } else if (i7 == 3) {
                        Object obj4 = message.obj;
                        int i14 = t.f17159a;
                        C0770p c0770p3 = (C0770p) obj4;
                        c0771q.f10398u = (Z) c0770p3.f10385b;
                        c0771q.E(c0770p3.f10386c);
                    } else if (i7 == 4) {
                        c0771q.H();
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException();
                        }
                        Object obj5 = message.obj;
                        int i15 = t.f17159a;
                        c0771q.A((Set) obj5);
                    }
                } else {
                    Object obj6 = message.obj;
                    int i16 = t.f17159a;
                    C0770p c0770p4 = (C0770p) obj6;
                    Z z8 = c0771q.f10398u;
                    int i17 = c0770p4.f10384a;
                    Collection collection = (Collection) c0770p4.f10385b;
                    c0771q.f10398u = z8.b(i17, collection.size());
                    c0771q.v(c0770p4.f10384a, collection);
                    c0771q.E(c0770p4.f10386c);
                }
                return true;
            default:
                c cVar = (c) obj;
                for (g gVar : (CopyOnWriteArraySet) cVar.f16062e) {
                    if (!gVar.f17114d && gVar.f17113c) {
                        d dVarE = gVar.f17112b.e();
                        gVar.f17112b = new B3.g();
                        gVar.f17113c = false;
                        ((f) cVar.f16061d).c(gVar.f17111a, dVarE);
                    }
                    if (((r) cVar.f16060c).f17154a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
        }
    }
}
