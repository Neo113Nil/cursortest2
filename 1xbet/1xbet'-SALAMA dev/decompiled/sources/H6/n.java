package H6;

import D6.E;
import W5.AbstractC0486a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p077k6.c implements G6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.h f3446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p065i6.i f3447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p065i6.i f3449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p065i6.d f3450e;

    public n(G6.h hVar, p065i6.i iVar) {
        super(k.f3443a, p065i6.j.f14074a);
        this.f3446a = hVar;
        this.f3447b = iVar;
        this.f3448c = ((Number) iVar.fold(0, m.f3445a)).intValue();
    }

    @Override // G6.h
    public final Object c(Object obj, p065i6.d dVar) {
        try {
            Object objE = e(dVar, obj);
            return objE == j6.a.f14648a ? objE : p044f6.i.f13014a;
        } catch (Throwable th) {
            this.f3449d = new i(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object e(p065i6.d dVar, Object obj) {
        Comparable comparable;
        String strSubstring;
        p065i6.i context = dVar.getContext();
        E.f(context);
        p065i6.i iVar = this.f3449d;
        if (iVar != context) {
            int i7 = 0;
            if (iVar instanceof i) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f3441a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                t6.h.e(str, "<this>");
                List listK0 = B6.d.K0(new B6.e(str, 2));
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : listK0) {
                    if (!C6.o.u0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p050g6.j.N0(arrayList));
                for (String str2 : arrayList) {
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
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
                int length3 = str.length();
                listK0.size();
                int iL0 = p050g6.i.L0(listK0);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listK0) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj3;
                    if ((i7 == 0 || i7 == iL0) && C6.o.u0(str3)) {
                        strSubstring = null;
                    } else {
                        t6.h.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(AbstractC0486a1.f(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        t6.h.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i7 = i8;
                }
                StringBuilder sb = new StringBuilder(length3);
                p050g6.h.S0(arrayList3, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new q(this))).intValue() != this.f3448c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3447b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3449d = context;
        }
        this.f3450e = dVar;
        o oVar = p.f3452a;
        G6.h hVar = this.f3446a;
        t6.h.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object objC = hVar.c(obj, this);
        if (!t6.h.a(objC, j6.a.f14648a)) {
            this.f3450e = null;
        }
        return objC;
    }

    @Override // p077k6.a, p077k6.d
    public final p077k6.d getCallerFrame() {
        p065i6.d dVar = this.f3450e;
        if (dVar instanceof p077k6.d) {
            return (p077k6.d) dVar;
        }
        return null;
    }

    @Override // p077k6.c, p065i6.d
    public final p065i6.i getContext() {
        p065i6.i iVar = this.f3449d;
        return iVar == null ? p065i6.j.f14074a : iVar;
    }

    @Override // p077k6.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p044f6.f.a(obj);
        if (thA != null) {
            this.f3449d = new i(getContext(), thA);
        }
        p065i6.d dVar = this.f3450e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return j6.a.f14648a;
    }
}
