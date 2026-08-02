package H6;

import D6.E;
import W5.AbstractC0486a1;
import f6.C1113f;
import f6.C1116i;
import g6.AbstractC1159h;
import g6.AbstractC1160i;
import g6.AbstractC1161j;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC1356c;
import k6.InterfaceC1357d;

/* loaded from: classes2.dex */
public final class n extends AbstractC1356c implements G6.h {

    /* renamed from: a, reason: collision with root package name */
    public final G6.h f3446a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1292i f3447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3448c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1292i f3449d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1287d f3450e;

    public n(G6.h hVar, InterfaceC1292i interfaceC1292i) {
        super(k.f3443a, C1293j.f14068a);
        this.f3446a = hVar;
        this.f3447b = interfaceC1292i;
        this.f3448c = ((Number) interfaceC1292i.fold(0, m.f3445a)).intValue();
    }

    @Override // G6.h
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        try {
            Object e7 = e(interfaceC1287d, obj);
            return e7 == j6.a.f14642a ? e7 : C1116i.f13008a;
        } catch (Throwable th) {
            this.f3449d = new i(interfaceC1287d.getContext(), th);
            throw th;
        }
    }

    public final Object e(InterfaceC1287d interfaceC1287d, Object obj) {
        Comparable comparable;
        String str;
        InterfaceC1292i context = interfaceC1287d.getContext();
        E.f(context);
        InterfaceC1292i interfaceC1292i = this.f3449d;
        if (interfaceC1292i != context) {
            int i7 = 0;
            if (interfaceC1292i instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) interfaceC1292i).f3441a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                t6.h.e(str2, "<this>");
                List K02 = B6.d.K0(new B6.e(str2, 2));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : K02) {
                    if (!C6.o.u0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1161j.N0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            i8 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i8);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i8++;
                    }
                    if (i8 == -1) {
                        i8 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i8));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                K02.size();
                int L02 = AbstractC1160i.L0(K02);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : K02) {
                    int i9 = i7 + 1;
                    if (i7 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i7 == 0 || i7 == L02) && C6.o.u0(str4)) {
                        str = null;
                    } else {
                        t6.h.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(AbstractC0486a1.f(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        t6.h.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i7 = i9;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC1159h.S0(arrayList3, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new q(this))).intValue() != this.f3448c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3447b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3449d = context;
        }
        this.f3450e = interfaceC1287d;
        o oVar = p.f3452a;
        G6.h hVar = this.f3446a;
        t6.h.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object c3 = hVar.c(obj, this);
        if (!t6.h.a(c3, j6.a.f14642a)) {
            this.f3450e = null;
        }
        return c3;
    }

    @Override // k6.AbstractC1354a, k6.InterfaceC1357d
    public final InterfaceC1357d getCallerFrame() {
        InterfaceC1287d interfaceC1287d = this.f3450e;
        if (interfaceC1287d instanceof InterfaceC1357d) {
            return (InterfaceC1357d) interfaceC1287d;
        }
        return null;
    }

    @Override // k6.AbstractC1356c, i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        InterfaceC1292i interfaceC1292i = this.f3449d;
        return interfaceC1292i == null ? C1293j.f14068a : interfaceC1292i;
    }

    @Override // k6.AbstractC1354a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = C1113f.a(obj);
        if (a2 != null) {
            this.f3449d = new i(getContext(), a2);
        }
        InterfaceC1287d interfaceC1287d = this.f3450e;
        if (interfaceC1287d != null) {
            interfaceC1287d.resumeWith(obj);
        }
        return j6.a.f14642a;
    }
}
