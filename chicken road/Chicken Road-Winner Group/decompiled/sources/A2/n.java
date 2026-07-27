package A2;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import d2.AbstractC0276f;
import d2.C0279i;
import e2.AbstractC0292g;
import e2.AbstractC0293h;
import e2.AbstractC0294i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import i2.InterfaceC0344c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w2.C1240t;
import w2.P;
import w2.Z;

/* loaded from: classes.dex */
public final class n extends AbstractC0343b implements z2.e {

    /* renamed from: d, reason: collision with root package name */
    public final z2.e f110d;

    /* renamed from: e, reason: collision with root package name */
    public final g2.h f111e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public g2.h f112g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0319c f113h;

    public n(z2.e eVar, g2.h hVar) {
        super(k.f107a, g2.i.f4981a);
        this.f110d = eVar;
        this.f111e = hVar;
        this.f = ((Number) hVar.i(0, m.f109e)).intValue();
    }

    @Override // z2.e
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        try {
            Object i3 = i(interfaceC0319c, obj);
            return i3 == EnumC0326a.f4994a ? i3 : C0279i.f4852a;
        } catch (Throwable th) {
            this.f112g = new i(interfaceC0319c.getContext(), th);
            throw th;
        }
    }

    @Override // i2.AbstractC0343b, i2.InterfaceC0344c
    public final InterfaceC0344c c() {
        InterfaceC0319c interfaceC0319c = this.f113h;
        if (interfaceC0319c instanceof InterfaceC0344c) {
            return (InterfaceC0344c) interfaceC0319c;
        }
        return null;
    }

    @Override // i2.AbstractC0343b
    public final StackTraceElement d() {
        return null;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        Throwable a3 = AbstractC0276f.a(obj);
        if (a3 != null) {
            this.f112g = new i(getContext(), a3);
        }
        InterfaceC0319c interfaceC0319c = this.f113h;
        if (interfaceC0319c != null) {
            interfaceC0319c.e(obj);
        }
        return EnumC0326a.f4994a;
    }

    @Override // i2.AbstractC0343b, g2.InterfaceC0319c
    public final g2.h getContext() {
        g2.h hVar = this.f112g;
        return hVar == null ? g2.i.f4981a : hVar;
    }

    public final Object i(InterfaceC0319c interfaceC0319c, Object obj) {
        List list;
        Comparable comparable;
        String str;
        g2.h context = interfaceC0319c.getContext();
        P p3 = (P) context.k(C1240t.f10525b);
        if (p3 != null && !p3.a()) {
            throw ((Z) p3).y();
        }
        g2.h hVar = this.f112g;
        if (hVar != context) {
            int i3 = 0;
            if (hVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) hVar).f105a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                v2.d dVar = new v2.d(str2);
                if (dVar.hasNext()) {
                    Object next = dVar.next();
                    if (dVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (dVar.hasNext()) {
                            arrayList.add(dVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = X0.a.z(next);
                    }
                } else {
                    list = e2.o.f4877a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!v2.m.n0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0294i.U(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i4);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 == -1) {
                        i4 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i4));
                }
                Iterator it2 = arrayList3.iterator();
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
                list.size();
                int size = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0293h.T();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i3 == 0 || i3 == size) && v2.m.n0(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(B0.c.i(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.j.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i3 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0292g.Y(arrayList4, sb, IOUtils.LINE_SEPARATOR_UNIX, "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.i(0, new q(this))).intValue() != this.f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f111e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f112g = context;
        }
        this.f113h = interfaceC0319c;
        o oVar = p.f115a;
        z2.e eVar = this.f110d;
        kotlin.jvm.internal.j.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a3 = eVar.a(obj, this);
        if (!kotlin.jvm.internal.j.a(a3, EnumC0326a.f4994a)) {
            this.f113h = null;
        }
        return a3;
    }
}
