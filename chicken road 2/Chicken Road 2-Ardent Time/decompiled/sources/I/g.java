package I;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final I.g f650a = new I.g();

    public final I.b a(java.io.FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            H.f q2 = H.f.q(fileInputStream);
            I.b bVar = new I.b(false);
            I.e[] pairs = (I.e[]) java.util.Arrays.copyOf(new I.e[0], 0);
            kotlin.jvm.internal.i.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                I.e eVar = pairs[0];
                throw null;
            }
            java.util.Map o2 = q2.o();
            kotlin.jvm.internal.i.d(o2, "preferencesProto.preferencesMap");
            for (java.util.Map.Entry entry : o2.entrySet()) {
                java.lang.String name = (java.lang.String) entry.getKey();
                H.k value = (H.k) entry.getValue();
                kotlin.jvm.internal.i.d(name, "name");
                kotlin.jvm.internal.i.d(value, "value");
                int E2 = value.E();
                switch (E2 == 0 ? -1 : I.f.f649a[H.j.b(E2)]) {
                    case -1:
                        throw new F.C0003c("Value case is null.", null);
                    case 0:
                    default:
                        throw new E1.A();
                    case 1:
                        bVar.d(new I.d(name), java.lang.Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        bVar.d(new I.d(name), java.lang.Float.valueOf(value.z()));
                        break;
                    case 3:
                        bVar.d(new I.d(name), java.lang.Double.valueOf(value.y()));
                        break;
                    case 4:
                        bVar.d(new I.d(name), java.lang.Integer.valueOf(value.A()));
                        break;
                    case 5:
                        bVar.d(new I.d(name), java.lang.Long.valueOf(value.B()));
                        break;
                    case 6:
                        I.d dVar = new I.d(name);
                        java.lang.String C2 = value.C();
                        kotlin.jvm.internal.i.d(C2, "value.string");
                        bVar.d(dVar, C2);
                        break;
                    case 7:
                        I.d dVar2 = new I.d(name);
                        androidx.datastore.preferences.protobuf.InterfaceC0087x p2 = value.D().p();
                        kotlin.jvm.internal.i.d(p2, "value.stringSet.stringsList");
                        bVar.d(dVar2, i1.AbstractC0190i.b0(p2));
                        break;
                    case 8:
                        I.d dVar3 = new I.d(name);
                        androidx.datastore.preferences.protobuf.C0071g w2 = value.w();
                        int size = w2.size();
                        if (size == 0) {
                            bArr = androidx.datastore.preferences.protobuf.AbstractC0088y.f2377b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w2.d(size, bArr2);
                            bArr = bArr2;
                        }
                        kotlin.jvm.internal.i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new F.C0003c("Value not set.", null);
                }
            }
            return new I.b(i1.AbstractC0202u.L(bVar.a()), true);
        } catch (androidx.datastore.preferences.protobuf.A e2) {
            throw new F.C0003c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(java.lang.Object obj, F.m0 m0Var) {
        androidx.datastore.preferences.protobuf.AbstractC0086w a2;
        java.util.Map a3 = ((I.b) obj).a();
        H.d p2 = H.f.p();
        for (java.util.Map.Entry entry : a3.entrySet()) {
            I.d dVar = (I.d) entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.String str = dVar.f648a;
            if (value instanceof java.lang.Boolean) {
                H.i F2 = H.k.F();
                boolean booleanValue = ((java.lang.Boolean) value).booleanValue();
                F2.c();
                H.k.s((H.k) F2.f2375b, booleanValue);
                a2 = F2.a();
            } else if (value instanceof java.lang.Float) {
                H.i F3 = H.k.F();
                float floatValue = ((java.lang.Number) value).floatValue();
                F3.c();
                H.k.t((H.k) F3.f2375b, floatValue);
                a2 = F3.a();
            } else if (value instanceof java.lang.Double) {
                H.i F4 = H.k.F();
                double doubleValue = ((java.lang.Number) value).doubleValue();
                F4.c();
                H.k.q((H.k) F4.f2375b, doubleValue);
                a2 = F4.a();
            } else if (value instanceof java.lang.Integer) {
                H.i F5 = H.k.F();
                int intValue = ((java.lang.Number) value).intValue();
                F5.c();
                H.k.u((H.k) F5.f2375b, intValue);
                a2 = F5.a();
            } else if (value instanceof java.lang.Long) {
                H.i F6 = H.k.F();
                long longValue = ((java.lang.Number) value).longValue();
                F6.c();
                H.k.n((H.k) F6.f2375b, longValue);
                a2 = F6.a();
            } else if (value instanceof java.lang.String) {
                H.i F7 = H.k.F();
                F7.c();
                H.k.o((H.k) F7.f2375b, (java.lang.String) value);
                a2 = F7.a();
            } else if (value instanceof java.util.Set) {
                H.i F8 = H.k.F();
                H.g q2 = H.h.q();
                kotlin.jvm.internal.i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                H.h.n((H.h) q2.f2375b, (java.util.Set) value);
                F8.c();
                H.k.p((H.k) F8.f2375b, (H.h) q2.a());
                a2 = F8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new java.lang.IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                H.i F9 = H.k.F();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.C0071g c0071g = androidx.datastore.preferences.protobuf.C0071g.f2301c;
                androidx.datastore.preferences.protobuf.C0071g c2 = androidx.datastore.preferences.protobuf.C0071g.c(bArr, 0, bArr.length);
                F9.c();
                H.k.r((H.k) F9.f2375b, c2);
                a2 = F9.a();
            }
            p2.getClass();
            str.getClass();
            p2.c();
            H.f.n((H.f) p2.f2375b).put(str, (H.k) a2);
        }
        H.f fVar = (H.f) p2.a();
        int a4 = fVar.a(null);
        java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
        if (a4 > 4096) {
            a4 = 4096;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = new androidx.datastore.preferences.protobuf.C0077m(m0Var, a4);
        fVar.b(c0077m);
        if (c0077m.f2340d > 0) {
            c0077m.e0();
        }
    }
}
