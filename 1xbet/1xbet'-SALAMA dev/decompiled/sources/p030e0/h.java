package p030e0;

import A1.W;
import W5.C0495d1;
import androidx.datastore.preferences.protobuf.AbstractC0675u;
import androidx.datastore.preferences.protobuf.AbstractC0677w;
import androidx.datastore.preferences.protobuf.C0662g;
import androidx.datastore.preferences.protobuf.C0666k;
import androidx.datastore.preferences.protobuf.C0679y;
import androidx.datastore.preferences.protobuf.InterfaceC0676v;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import p010b0.C0732c;
import p022d0.c;
import p022d0.e;
import p022d0.f;
import p022d0.g;
import p022d0.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f12510a = new h();

    public final b a(FileInputStream fileInputStream) throws C0732c {
        byte[] bArr;
        try {
            e eVarQ = e.q(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            t6.h.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapO = eVarQ.o();
            t6.h.d(mapO, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapO.entrySet()) {
                String str = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                t6.h.d(str, "name");
                t6.h.d(iVar, "value");
                int iE = iVar.E();
                switch (iE == 0 ? -1 : g.f12509a[p136t.e.e(iE)]) {
                    case -1:
                        throw new C0732c("Value case is null.", null);
                    case 0:
                    default:
                        throw new W();
                    case 1:
                        bVar.d(new e(str), Boolean.valueOf(iVar.v()));
                        break;
                    case 2:
                        bVar.d(new e(str), Float.valueOf(iVar.z()));
                        break;
                    case 3:
                        bVar.d(new e(str), Double.valueOf(iVar.y()));
                        break;
                    case 4:
                        bVar.d(new e(str), Integer.valueOf(iVar.A()));
                        break;
                    case 5:
                        bVar.d(new e(str), Long.valueOf(iVar.B()));
                        break;
                    case 6:
                        e eVar = new e(str);
                        String strC = iVar.C();
                        t6.h.d(strC, "value.string");
                        bVar.d(eVar, strC);
                        break;
                    case 7:
                        e eVar2 = new e(str);
                        InterfaceC0676v interfaceC0676vP = iVar.D().p();
                        t6.h.d(interfaceC0676vP, "value.stringSet.stringsList");
                        bVar.d(eVar2, p050g6.h.e1(interfaceC0676vP));
                        break;
                    case 8:
                        e eVar3 = new e(str);
                        C0662g c0662gW = iVar.w();
                        int size = c0662gW.size();
                        if (size == 0) {
                            bArr = AbstractC0677w.f9256b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0662gW.y(size, bArr2);
                            bArr = bArr2;
                        }
                        t6.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(eVar3, bArr);
                        break;
                    case 9:
                        throw new C0732c("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0679y e7) {
            throw new C0732c("Unable to parse preferences proto.", e7);
        }
    }

    public final void b(Object obj, C0495d1 c0495d1) {
        AbstractC0675u abstractC0675uA;
        Map mapA = ((b) obj).a();
        c cVarP = e.p();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f12508a;
            if (value instanceof Boolean) {
                p022d0.h hVarF = i.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarF.c();
                i.s((i) hVarF.f9254b, zBooleanValue);
                abstractC0675uA = hVarF.a();
            } else if (value instanceof Float) {
                p022d0.h hVarF2 = i.F();
                float fFloatValue = ((Number) value).floatValue();
                hVarF2.c();
                i.t((i) hVarF2.f9254b, fFloatValue);
                abstractC0675uA = hVarF2.a();
            } else if (value instanceof Double) {
                p022d0.h hVarF3 = i.F();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarF3.c();
                i.q((i) hVarF3.f9254b, dDoubleValue);
                abstractC0675uA = hVarF3.a();
            } else if (value instanceof Integer) {
                p022d0.h hVarF4 = i.F();
                int iIntValue = ((Number) value).intValue();
                hVarF4.c();
                i.u((i) hVarF4.f9254b, iIntValue);
                abstractC0675uA = hVarF4.a();
            } else if (value instanceof Long) {
                p022d0.h hVarF5 = i.F();
                long jLongValue = ((Number) value).longValue();
                hVarF5.c();
                i.n((i) hVarF5.f9254b, jLongValue);
                abstractC0675uA = hVarF5.a();
            } else if (value instanceof String) {
                p022d0.h hVarF6 = i.F();
                hVarF6.c();
                i.o((i) hVarF6.f9254b, (String) value);
                abstractC0675uA = hVarF6.a();
            } else if (value instanceof Set) {
                p022d0.h hVarF7 = i.F();
                f fVarQ = g.q();
                t6.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                fVarQ.c();
                g.n((g) fVarQ.f9254b, (Set) value);
                hVarF7.c();
                i.p((i) hVarF7.f9254b, (g) fVarQ.a());
                abstractC0675uA = hVarF7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                p022d0.h hVarF8 = i.F();
                byte[] bArr = (byte[]) value;
                C0662g c0662g = C0662g.f9182c;
                C0662g c0662gT = C0662g.t(bArr, 0, bArr.length);
                hVarF8.c();
                i.r((i) hVarF8.f9254b, c0662gT);
                abstractC0675uA = hVarF8.a();
            }
            cVarP.getClass();
            str.getClass();
            cVarP.c();
            e.n((e) cVarP.f9254b).put(str, (i) abstractC0675uA);
        }
        e eVar2 = (e) cVarP.a();
        int iA = eVar2.a(null);
        Logger logger = C0666k.f9214r;
        if (iA > 4096) {
            iA = 4096;
        }
        C0666k c0666k = new C0666k(c0495d1, iA);
        eVar2.b(c0666k);
        if (c0666k.f9219p > 0) {
            c0666k.P0();
        }
    }
}
