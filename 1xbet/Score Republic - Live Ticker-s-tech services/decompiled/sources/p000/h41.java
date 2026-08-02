package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h41 extends AbstractC0882xm implements u10 {

    /* JADX INFO: renamed from: m */
    public final u10 f3046m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC0180en f3047n;

    /* JADX INFO: renamed from: o */
    public final int f3048o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0180en f3049p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0808vm f3050q;

    public h41(u10 u10Var, InterfaceC0180en interfaceC0180en) {
        super(C0620qj.f6507l, C0301hw.f3348j);
        this.f3046m = u10Var;
        this.f3047n = interfaceC0180en;
        this.f3048o = ((Number) interfaceC0180en.mo1467l(0, new C0804vi(5))).intValue();
    }

    @Override // p000.AbstractC0243gb, p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public final InterfaceC0550on mo1182c() {
        InterfaceC0808vm interfaceC0808vm = this.f3050q;
        if (interfaceC0808vm instanceof InterfaceC0550on) {
            return (InterfaceC0550on) interfaceC0808vm;
        }
        return null;
    }

    @Override // p000.AbstractC0882xm, p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        InterfaceC0180en interfaceC0180en = this.f3049p;
        return interfaceC0180en == null ? C0301hw.f3348j : interfaceC0180en;
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: j */
    public final Object mo583j(Object obj, InterfaceC0808vm interfaceC0808vm) {
        try {
            Object objM2207p = m2207p(interfaceC0808vm, obj);
            return objM2207p == EnumC0513nn.f5459j ? objM2207p : kf1.f4365a;
        } catch (Throwable th) {
            this.f3049p = new C0779uu(interfaceC0808vm.mo475d(), th);
            throw th;
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: l */
    public final StackTraceElement mo2012l() {
        return null;
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        Throwable thM3843a = p21.m3843a(obj);
        if (thM3843a != null) {
            this.f3049p = new C0779uu(mo475d(), thM3843a);
        }
        InterfaceC0808vm interfaceC0808vm = this.f3050q;
        if (interfaceC0808vm != null) {
            interfaceC0808vm.mo476f(obj);
        }
        return EnumC0513nn.f5459j;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX INFO: renamed from: p */
    public final Object m2207p(InterfaceC0808vm interfaceC0808vm, Object obj) {
        List listM5193e;
        Comparable comparable;
        String strSubstring;
        int length;
        InterfaceC0180en interfaceC0180enMo475d = interfaceC0808vm.mo475d();
        ag0 ag0Var = (ag0) interfaceC0180enMo475d.mo1466j(wa0.f8474n);
        if (ag0Var != null && !ag0Var.mo203a()) {
            throw ((ig0) ag0Var).m2635z();
        }
        InterfaceC0180en interfaceC0180en = this.f3049p;
        if (interfaceC0180en != interfaceC0180enMo475d) {
            if (interfaceC0180en instanceof C0779uu) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C0779uu) interfaceC0180en).f7908k + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                hi0 hi0Var = new hi0(str);
                if (hi0Var.hasNext()) {
                    Object next = hi0Var.next();
                    if (hi0Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (hi0Var.hasNext()) {
                            arrayList.add(hi0Var.next());
                        }
                        listM5193e = arrayList;
                    } else {
                        listM5193e = vt1.m5193e(next);
                    }
                } else {
                    listM5193e = C0411kw.f4584j;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM5193e) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    for (int i = 0; i < str2.length(); i++) {
                        char cCharAt = str2.charAt(i);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            arrayList2.add(obj2);
                            break;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length2 = str3.length();
                    int length3 = 0;
                    while (true) {
                        if (length3 >= length2) {
                            length3 = -1;
                            break;
                        }
                        char cCharAt2 = str3.charAt(length3);
                        if (!Character.isWhitespace(cCharAt2) && !Character.isSpaceChar(cCharAt2)) {
                            break;
                        }
                        length3++;
                    }
                    if (length3 == -1) {
                        length3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(length3));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length4 = str.length();
                listM5193e.size();
                int size2 = listM5193e.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                for (Object obj4 : listM5193e) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if (i3 == 0 || i3 == size2) {
                        str4.getClass();
                        int i5 = 0;
                        while (true) {
                            if (i5 < str4.length()) {
                                char cCharAt3 = str4.charAt(i5);
                                if (Character.isWhitespace(cCharAt3) || Character.isSpaceChar(cCharAt3)) {
                                    i5++;
                                } else {
                                    str4.getClass();
                                    if (iIntValue >= 0) {
                                        C0270h1.m2186b(AbstractC0024an.m282e(iIntValue, "Requested character count ", " is less than zero."));
                                        return null;
                                    }
                                    length = str4.length();
                                    if (iIntValue <= length) {
                                        length = iIntValue;
                                    }
                                    strSubstring = str4.substring(length);
                                }
                            } else {
                                strSubstring = null;
                            }
                        }
                    } else {
                        str4.getClass();
                        if (iIntValue >= 0) {
                            C0270h1.m2186b(AbstractC0024an.m282e(iIntValue, "Requested character count ", " is less than zero."));
                            return null;
                        }
                        length = str4.length();
                        if (iIntValue <= length) {
                            length = iIntValue;
                        }
                        strSubstring = str4.substring(length);
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i3 = i4;
                }
                StringBuilder sb = new StringBuilder(length4);
                AbstractC0471mi.m3386t(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) interfaceC0180enMo475d.mo1467l(0, new v60() { // from class: k41
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // p000.v60
                /* JADX INFO: renamed from: g */
                public final Object mo1490g(Object obj5, Object obj6) {
                    int iIntValue2 = ((Integer) obj5).intValue();
                    InterfaceC0104cn interfaceC0104cn = (InterfaceC0104cn) obj6;
                    InterfaceC0144dn key = interfaceC0104cn.getKey();
                    InterfaceC0104cn interfaceC0104cnMo1466j = this.f4281j.f3047n.mo1466j(key);
                    if (key == wa0.f8474n) {
                        ag0 ag0Var2 = (ag0) interfaceC0104cnMo1466j;
                        ag0 parent = (ag0) interfaceC0104cn;
                        while (true) {
                            if (parent != null) {
                                if (parent == ag0Var2 || !(parent instanceof x51)) {
                                    break;
                                }
                                InterfaceC0432lg interfaceC0432lgM2604D = ((x51) parent).m2604D();
                                parent = interfaceC0432lgM2604D != null ? interfaceC0432lgM2604D.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != ag0Var2) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + ag0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (ag0Var2 != null) {
                            iIntValue2++;
                        }
                    } else if (interfaceC0104cn != interfaceC0104cnMo1466j) {
                        iIntValue2 = Integer.MIN_VALUE;
                    } else {
                        iIntValue2++;
                    }
                    return Integer.valueOf(iIntValue2);
                }
            })).intValue() != this.f3048o) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3047n + ",\n\t\tbut emission happened in " + interfaceC0180enMo475d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3049p = interfaceC0180enMo475d;
        }
        this.f3050q = interfaceC0808vm;
        x60 x60Var = j41.f3816a;
        u10 u10Var = this.f3046m;
        u10Var.getClass();
        Object objMo928e = x60Var.mo928e(u10Var, obj, this);
        if (!af0.m187a(objMo928e, EnumC0513nn.f5459j)) {
            this.f3050q = null;
        }
        return objMo928e;
    }
}
