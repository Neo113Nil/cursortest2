package A3;

import T4.z;
import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0793l9;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import v3.AbstractC1498b;
import y3.C1567a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    public /* synthetic */ b(int i2) {
        this.f50a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        n[] d6;
        switch (this.f50a) {
            case 0:
                return new f(1, y3.h.f((String) obj));
            case 1:
                return new e(((Boolean) obj).booleanValue());
            case 2:
                return new m(((Long) obj).longValue());
            case 3:
                return new g(((Double) obj).doubleValue());
            case 4:
                return j.a((Q2.g) obj);
            case 5:
                return ((N3.a) obj).j();
            case 6:
                return ((N3.a) obj).l();
            case 7:
                N3.a aVar = (N3.a) obj;
                boolean z = aVar instanceof O3.a;
                if (z) {
                    R2.b c2 = j.c(aVar);
                    if (c2.isEmpty()) {
                        d6 = j.f67b;
                    } else {
                        n[] nVarArr = new n[c2.size()];
                        c2.forEach(new i(nVarArr, 0));
                        d6 = nVarArr;
                    }
                } else {
                    d6 = n.d(aVar.a());
                }
                n[] nVarArr2 = d6;
                int size = z ? j.c(aVar).size() : aVar.a().size();
                y3.i a6 = aVar.i() == null ? null : j.a(aVar.i());
                Y2.h e3 = aVar.e();
                long h3 = aVar.h();
                long k3 = aVar.k();
                C1567a d7 = B3.b.d(aVar.f());
                byte[] f3 = y3.h.f(aVar.g());
                int b6 = aVar.b() - size;
                V2.a aVar2 = (V2.a) e3;
                Y2.e eVar = aVar2.f3228c;
                String str = aVar2.f3226a;
                String str2 = str.equals("00000000000000000000000000000000") ? null : str;
                String str3 = aVar2.f3227b;
                return new B3.b(h3, k3, d7, f3, a6, nVarArr2, b6, eVar, str2, str3.equals("0000000000000000") ? null : str3, y3.h.f(aVar.c()));
            case 8:
                return Boolean.valueOf(AbstractC1498b.f12096a.contains(Integer.valueOf(((z) obj).f3018d)));
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=");
                Iterable iterable = (Iterable) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb2.append((CharSequence) StringUtils.COMMA);
                        }
                    }
                }
                sb.append(sb2.toString());
                return sb.toString();
            case 10:
                return new AtomicInteger(0);
            case 11:
                AbstractC0279e.o(obj);
                return Objects.toString(null);
            case 12:
                return ((V2.e) obj).f3237b;
            case 13:
                Map.Entry entry2 = (Map.Entry) obj;
                return new Q2.d((String) entry2.getKey(), (Q2.g) entry2.getValue());
            case 14:
                Q2.d dVar = (Q2.d) obj;
                return dVar.f2485a + "=" + dVar.f2486b.a();
            case 15:
                return ((Q2.g) obj).a();
            case 16:
                return ((S2.a) obj).f2746b;
            case 17:
                return new Y3.d();
            case 18:
                ((X3.a) obj).getClass();
                return null;
            case C0793l9.f8681C /* 19 */:
                return ((Map.Entry) obj).getValue().toString();
            case C0793l9.f8682D /* 20 */:
                return (String) ((Map.Entry) obj).getValue();
            case C0793l9.f8683E /* 21 */:
                return ((Y3.e) obj).f3705b;
            case 22:
                return ((Y3.e) obj).f3706c.stream();
            case 23:
                return ((s3.j) obj).f11833c;
            case 24:
                return e5.g.c(((s3.j) obj).f11834d);
            case C0793l9.f8684F /* 25 */:
                return e5.g.c((s3.b) obj);
            case 26:
                return ((Integer) obj).toString();
            case C0793l9.f8686H /* 27 */:
                AbstractC0279e.o(obj);
                throw null;
            case 28:
                return new IdentityHashMap(8);
            default:
                return new ArrayList();
        }
    }
}
