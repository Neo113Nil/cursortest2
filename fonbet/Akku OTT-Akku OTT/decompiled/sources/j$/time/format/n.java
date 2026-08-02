package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class n implements e {
    public final j$.time.temporal.q a;
    public final z b;
    public final a c;
    public volatile h d;

    public n(j$.time.temporal.q qVar, z zVar, a aVar) {
        this.a = qVar;
        this.b = zVar;
        this.c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean o(s sVar, StringBuilder sb) {
        String a;
        Long a2 = sVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = sVar.b;
        if (a2 == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) sVar.a.b(j$.time.temporal.r.b);
        if (lVar == null || lVar == j$.time.chrono.s.c) {
            a aVar = this.c;
            long longValue = a2.longValue();
            z zVar = this.b;
            Locale locale = dateTimeFormatter.b;
            a = aVar.a.a(longValue, zVar);
        } else {
            a aVar2 = this.c;
            long longValue2 = a2.longValue();
            z zVar2 = this.b;
            Locale locale2 = dateTimeFormatter.b;
            a = aVar2.a.a(longValue2, zVar2);
        }
        if (a != null) {
            sb.append(a);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, y.NORMAL);
        }
        return this.d.o(sVar, sb);
    }

    @Override // j$.time.format.e
    public final int v(p pVar, CharSequence charSequence, int i) {
        a aVar = this.c;
        j$.time.temporal.q qVar = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = pVar.c;
            DateTimeFormatter dateTimeFormatter = pVar.a;
            Iterator it = null;
            z zVar = z ? this.b : null;
            j$.time.chrono.l lVar = pVar.c().c;
            if (lVar == null && (lVar = pVar.a.e) == null) {
                lVar = j$.time.chrono.s.c;
            }
            if (lVar == null || lVar == j$.time.chrono.s.c) {
                Locale locale = dateTimeFormatter.b;
                List list = (List) ((HashMap) aVar.a.b).get(zVar);
                it = list != null ? list.iterator() : null;
            } else {
                Locale locale2 = dateTimeFormatter.b;
                List list2 = (List) ((HashMap) aVar.a.b).get(zVar);
                if (list2 != null) {
                    it = list2.iterator();
                }
            }
            Iterator it2 = it;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    if (pVar.g(str, 0, charSequence, i, str.length())) {
                        return pVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (qVar == j$.time.temporal.a.ERA && !pVar.c) {
                    Iterator it3 = lVar.u().iterator();
                    while (it3.hasNext()) {
                        String obj = ((j$.time.chrono.m) it3.next()).toString();
                        if (pVar.g(obj, 0, charSequence, i, obj.length())) {
                            return pVar.f(this.a, r7.getValue(), i, obj.length() + i);
                        }
                    }
                }
                if (pVar.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new h(this.a, 1, 19, y.NORMAL);
            }
            return this.d.v(pVar, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        z zVar = z.FULL;
        j$.time.temporal.q qVar = this.a;
        z zVar2 = this.b;
        if (zVar2 == zVar) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + zVar2 + ")";
    }
}
