package P;

import M.C0074c;
import M.m0;
import O.j;
import O.k;
import androidx.datastore.preferences.protobuf.AbstractC0226v;
import androidx.datastore.preferences.protobuf.AbstractC0228x;
import androidx.datastore.preferences.protobuf.C0212g;
import androidx.datastore.preferences.protobuf.C0217l;
import androidx.datastore.preferences.protobuf.C0230z;
import androidx.datastore.preferences.protobuf.InterfaceC0227w;
import g4.AbstractC0465j;
import g4.AbstractC0476u;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2275a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            O.f q5 = O.f.q(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map o2 = q5.o();
            i.d(o2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o2.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                i.d(name, "name");
                i.d(value, "value");
                int E5 = value.E();
                switch (E5 == 0 ? -1 : f.f2274a[j.b(E5)]) {
                    case -1:
                        throw new C0074c("Value case is null.", null);
                    case 0:
                    default:
                        throw new C1.b();
                    case 1:
                        bVar.d(new d(name), Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        bVar.d(new d(name), Float.valueOf(value.z()));
                        break;
                    case 3:
                        bVar.d(new d(name), Double.valueOf(value.y()));
                        break;
                    case 4:
                        bVar.d(new d(name), Integer.valueOf(value.A()));
                        break;
                    case 5:
                        bVar.d(new d(name), Long.valueOf(value.B()));
                        break;
                    case 6:
                        d dVar = new d(name);
                        String C2 = value.C();
                        i.d(C2, "value.string");
                        bVar.d(dVar, C2);
                        break;
                    case 7:
                        d dVar2 = new d(name);
                        InterfaceC0227w p5 = value.D().p();
                        i.d(p5, "value.stringSet.stringsList");
                        bVar.d(dVar2, AbstractC0465j.X0(p5));
                        break;
                    case 8:
                        d dVar3 = new d(name);
                        C0212g w3 = value.w();
                        int size = w3.size();
                        if (size == 0) {
                            bArr = AbstractC0228x.f4509b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w3.e(size, bArr2);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0074c("Value not set.", null);
                }
            }
            return new b(AbstractC0476u.e0(bVar.a()), true);
        } catch (C0230z e3) {
            throw new C0074c("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, m0 m0Var) {
        AbstractC0226v a6;
        Map a7 = ((b) obj).a();
        O.d p5 = O.f.p();
        for (Map.Entry entry : a7.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f2273a;
            if (value instanceof Boolean) {
                O.i F2 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F2.c();
                k.s((k) F2.f4507b, booleanValue);
                a6 = F2.a();
            } else if (value instanceof Float) {
                O.i F5 = k.F();
                float floatValue = ((Number) value).floatValue();
                F5.c();
                k.t((k) F5.f4507b, floatValue);
                a6 = F5.a();
            } else if (value instanceof Double) {
                O.i F6 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F6.c();
                k.q((k) F6.f4507b, doubleValue);
                a6 = F6.a();
            } else if (value instanceof Integer) {
                O.i F7 = k.F();
                int intValue = ((Number) value).intValue();
                F7.c();
                k.u((k) F7.f4507b, intValue);
                a6 = F7.a();
            } else if (value instanceof Long) {
                O.i F8 = k.F();
                long longValue = ((Number) value).longValue();
                F8.c();
                k.n((k) F8.f4507b, longValue);
                a6 = F8.a();
            } else if (value instanceof String) {
                O.i F9 = k.F();
                F9.c();
                k.o((k) F9.f4507b, (String) value);
                a6 = F9.a();
            } else if (value instanceof Set) {
                O.i F10 = k.F();
                O.g q5 = O.h.q();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q5.c();
                O.h.n((O.h) q5.f4507b, (Set) value);
                F10.c();
                k.p((k) F10.f4507b, (O.h) q5.a());
                a6 = F10.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                O.i F11 = k.F();
                byte[] bArr = (byte[]) value;
                C0212g c0212g = C0212g.f4436c;
                C0212g d6 = C0212g.d(bArr, 0, bArr.length);
                F11.c();
                k.r((k) F11.f4507b, d6);
                a6 = F11.a();
            }
            p5.getClass();
            str.getClass();
            p5.c();
            O.f.n((O.f) p5.f4507b).put(str, (k) a6);
        }
        O.f fVar = (O.f) p5.a();
        int a8 = fVar.a(null);
        Logger logger = C0217l.f4467h;
        if (a8 > 4096) {
            a8 = 4096;
        }
        C0217l c0217l = new C0217l(m0Var, a8);
        fVar.b(c0217l);
        if (c0217l.f4472f > 0) {
            c0217l.e0();
        }
    }
}
