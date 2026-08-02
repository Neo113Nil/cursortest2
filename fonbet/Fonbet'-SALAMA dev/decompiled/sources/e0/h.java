package e0;

import A1.W;
import W5.C0495d1;
import androidx.datastore.preferences.protobuf.AbstractC0696u;
import androidx.datastore.preferences.protobuf.AbstractC0698w;
import androidx.datastore.preferences.protobuf.C0683g;
import androidx.datastore.preferences.protobuf.C0687k;
import androidx.datastore.preferences.protobuf.C0700y;
import androidx.datastore.preferences.protobuf.InterfaceC0697v;
import b0.C0755c;
import d0.C0941c;
import d0.C0943e;
import d0.C0944f;
import d0.C0945g;
import d0.C0946h;
import d0.C0947i;
import g6.AbstractC1159h;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f12504a = new h();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            C0943e q7 = C0943e.q(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            t6.h.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map o7 = q7.o();
            t6.h.d(o7, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o7.entrySet()) {
                String str = (String) entry.getKey();
                C0947i c0947i = (C0947i) entry.getValue();
                t6.h.d(str, "name");
                t6.h.d(c0947i, "value");
                int E7 = c0947i.E();
                switch (E7 == 0 ? -1 : g.f12503a[t.e.e(E7)]) {
                    case -1:
                        throw new C0755c("Value case is null.", null);
                    case 0:
                    default:
                        throw new W();
                    case 1:
                        bVar.d(new e(str), Boolean.valueOf(c0947i.v()));
                        break;
                    case 2:
                        bVar.d(new e(str), Float.valueOf(c0947i.z()));
                        break;
                    case 3:
                        bVar.d(new e(str), Double.valueOf(c0947i.y()));
                        break;
                    case 4:
                        bVar.d(new e(str), Integer.valueOf(c0947i.A()));
                        break;
                    case 5:
                        bVar.d(new e(str), Long.valueOf(c0947i.B()));
                        break;
                    case 6:
                        e eVar = new e(str);
                        String C3 = c0947i.C();
                        t6.h.d(C3, "value.string");
                        bVar.d(eVar, C3);
                        break;
                    case 7:
                        e eVar2 = new e(str);
                        InterfaceC0697v p5 = c0947i.D().p();
                        t6.h.d(p5, "value.stringSet.stringsList");
                        bVar.d(eVar2, AbstractC1159h.e1(p5));
                        break;
                    case 8:
                        e eVar3 = new e(str);
                        C0683g w7 = c0947i.w();
                        int size = w7.size();
                        if (size == 0) {
                            bArr = AbstractC0698w.f9256b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w7.y(size, bArr2);
                            bArr = bArr2;
                        }
                        t6.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(eVar3, bArr);
                        break;
                    case 9:
                        throw new C0755c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0700y e7) {
            throw new C0755c("Unable to parse preferences proto.", e7);
        }
    }

    public final void b(Object obj, C0495d1 c0495d1) {
        AbstractC0696u a2;
        Map a4 = ((b) obj).a();
        C0941c p5 = C0943e.p();
        for (Map.Entry entry : a4.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f12502a;
            if (value instanceof Boolean) {
                C0946h F7 = C0947i.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F7.c();
                C0947i.s((C0947i) F7.f9254b, booleanValue);
                a2 = F7.a();
            } else if (value instanceof Float) {
                C0946h F8 = C0947i.F();
                float floatValue = ((Number) value).floatValue();
                F8.c();
                C0947i.t((C0947i) F8.f9254b, floatValue);
                a2 = F8.a();
            } else if (value instanceof Double) {
                C0946h F9 = C0947i.F();
                double doubleValue = ((Number) value).doubleValue();
                F9.c();
                C0947i.q((C0947i) F9.f9254b, doubleValue);
                a2 = F9.a();
            } else if (value instanceof Integer) {
                C0946h F10 = C0947i.F();
                int intValue = ((Number) value).intValue();
                F10.c();
                C0947i.u((C0947i) F10.f9254b, intValue);
                a2 = F10.a();
            } else if (value instanceof Long) {
                C0946h F11 = C0947i.F();
                long longValue = ((Number) value).longValue();
                F11.c();
                C0947i.n((C0947i) F11.f9254b, longValue);
                a2 = F11.a();
            } else if (value instanceof String) {
                C0946h F12 = C0947i.F();
                F12.c();
                C0947i.o((C0947i) F12.f9254b, (String) value);
                a2 = F12.a();
            } else if (value instanceof Set) {
                C0946h F13 = C0947i.F();
                C0944f q7 = C0945g.q();
                t6.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q7.c();
                C0945g.n((C0945g) q7.f9254b, (Set) value);
                F13.c();
                C0947i.p((C0947i) F13.f9254b, (C0945g) q7.a());
                a2 = F13.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                C0946h F14 = C0947i.F();
                byte[] bArr = (byte[]) value;
                C0683g c0683g = C0683g.f9182c;
                C0683g t7 = C0683g.t(bArr, 0, bArr.length);
                F14.c();
                C0947i.r((C0947i) F14.f9254b, t7);
                a2 = F14.a();
            }
            p5.getClass();
            str.getClass();
            p5.c();
            C0943e.n((C0943e) p5.f9254b).put(str, (C0947i) a2);
        }
        C0943e c0943e = (C0943e) p5.a();
        int a7 = c0943e.a(null);
        Logger logger = C0687k.f9214r;
        if (a7 > 4096) {
            a7 = 4096;
        }
        C0687k c0687k = new C0687k(c0495d1, a7);
        c0943e.b(c0687k);
        if (c0687k.f9219p > 0) {
            c0687k.P0();
        }
    }
}
