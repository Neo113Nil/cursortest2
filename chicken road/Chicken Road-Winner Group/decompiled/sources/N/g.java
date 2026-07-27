package N;

import K.C0035c;
import K.l0;
import M.i;
import M.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0147w;
import androidx.datastore.preferences.protobuf.AbstractC0149y;
import androidx.datastore.preferences.protobuf.C0132g;
import androidx.datastore.preferences.protobuf.C0138m;
import androidx.datastore.preferences.protobuf.InterfaceC0148x;
import e2.AbstractC0292g;
import e2.r;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f985a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            M.f o3 = M.f.o(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            j.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map m3 = o3.m();
            j.d(m3, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m3.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                j.d(name, "name");
                j.d(value, "value");
                int C2 = value.C();
                switch (C2 == 0 ? -1 : f.f984a[M.j.b(C2)]) {
                    case -1:
                        throw new C0035c("Value case is null.", null);
                    case 0:
                    default:
                        throw new T0.b();
                    case 1:
                        bVar.d(new d(name), Boolean.valueOf(value.t()));
                        break;
                    case 2:
                        bVar.d(new d(name), Float.valueOf(value.x()));
                        break;
                    case 3:
                        bVar.d(new d(name), Double.valueOf(value.w()));
                        break;
                    case 4:
                        bVar.d(new d(name), Integer.valueOf(value.y()));
                        break;
                    case 5:
                        bVar.d(new d(name), Long.valueOf(value.z()));
                        break;
                    case 6:
                        d dVar = new d(name);
                        String A3 = value.A();
                        j.d(A3, "value.string");
                        bVar.d(dVar, A3);
                        break;
                    case 7:
                        d dVar2 = new d(name);
                        InterfaceC0148x n3 = value.B().n();
                        j.d(n3, "value.stringSet.stringsList");
                        bVar.d(dVar2, AbstractC0292g.h0(n3));
                        break;
                    case 8:
                        d dVar3 = new d(name);
                        C0132g u3 = value.u();
                        int size = u3.size();
                        if (size == 0) {
                            bArr = AbstractC0149y.f2301b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u3.e(size, bArr2);
                            bArr = bArr2;
                        }
                        j.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0035c("Value not set.", null);
                }
            }
            return new b(r.q0(bVar.a()), true);
        } catch (A e3) {
            throw new C0035c("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, l0 l0Var) {
        AbstractC0147w a3;
        Map a4 = ((b) obj).a();
        M.d n3 = M.f.n();
        for (Map.Entry entry : a4.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f983a;
            if (value instanceof Boolean) {
                i D3 = k.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D3.c();
                k.q((k) D3.f2299b, booleanValue);
                a3 = D3.a();
            } else if (value instanceof Float) {
                i D4 = k.D();
                float floatValue = ((Number) value).floatValue();
                D4.c();
                k.r((k) D4.f2299b, floatValue);
                a3 = D4.a();
            } else if (value instanceof Double) {
                i D5 = k.D();
                double doubleValue = ((Number) value).doubleValue();
                D5.c();
                k.o((k) D5.f2299b, doubleValue);
                a3 = D5.a();
            } else if (value instanceof Integer) {
                i D6 = k.D();
                int intValue = ((Number) value).intValue();
                D6.c();
                k.s((k) D6.f2299b, intValue);
                a3 = D6.a();
            } else if (value instanceof Long) {
                i D7 = k.D();
                long longValue = ((Number) value).longValue();
                D7.c();
                k.l((k) D7.f2299b, longValue);
                a3 = D7.a();
            } else if (value instanceof String) {
                i D8 = k.D();
                D8.c();
                k.m((k) D8.f2299b, (String) value);
                a3 = D8.a();
            } else if (value instanceof Set) {
                i D9 = k.D();
                M.g o3 = M.h.o();
                j.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o3.c();
                M.h.l((M.h) o3.f2299b, (Set) value);
                D9.c();
                k.n((k) D9.f2299b, (M.h) o3.a());
                a3 = D9.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i D10 = k.D();
                byte[] bArr = (byte[]) value;
                C0132g c0132g = C0132g.f2230c;
                C0132g d3 = C0132g.d(bArr, 0, bArr.length);
                D10.c();
                k.p((k) D10.f2299b, d3);
                a3 = D10.a();
            }
            n3.getClass();
            str.getClass();
            n3.c();
            M.f.l((M.f) n3.f2299b).put(str, (k) a3);
        }
        M.f fVar = (M.f) n3.a();
        int a5 = fVar.a(null);
        Logger logger = C0138m.f2262g;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0138m c0138m = new C0138m(l0Var, a5);
        fVar.b(c0138m);
        if (c0138m.f2267e > 0) {
            c0138m.t0();
        }
    }
}
