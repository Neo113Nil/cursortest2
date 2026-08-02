package Rd;

import C.o0;
import Nd.k;
import Nd.m;
import Nd.p;
import Nd.t;
import Pd.b;
import Qd.C3856a;
import Rd.d;
import Td.h;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Td.f f25023a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25024b = 0;

    static {
        Td.f c11 = Td.f.c();
        c11.a(C3856a.f23232a);
        c11.a(C3856a.f23233b);
        c11.a(C3856a.f23234c);
        c11.a(C3856a.f23235d);
        c11.a(C3856a.f23236e);
        c11.a(C3856a.f23237f);
        c11.a(C3856a.f23238g);
        c11.a(C3856a.f23239h);
        c11.a(C3856a.f23240i);
        c11.a(C3856a.f23241j);
        c11.a(C3856a.f23242k);
        c11.a(C3856a.f23243l);
        c11.a(C3856a.f23244m);
        c11.a(C3856a.f23245n);
        Intrinsics.checkNotNullExpressionValue(c11, "apply(...)");
        f25023a = c11;
    }

    @NotNull
    public static Td.f a() {
        return f25023a;
    }

    public static d.b b(@NotNull Nd.c proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable) {
        String V11;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        h.f<Nd.c, C3856a.b> constructorSignature = C3856a.f23232a;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        C3856a.b bVar = (C3856a.b) Pd.e.a(proto, constructorSignature);
        String string = (bVar == null || !bVar.n()) ? "<init>" : nameResolver.getString(bVar.l());
        if (bVar == null || !bVar.m()) {
            List<t> G11 = proto.G();
            Intrinsics.checkNotNullExpressionValue(G11, "getValueParameterList(...)");
            List<t> list = G11;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (t tVar : list) {
                Intrinsics.f(tVar);
                String f7 = f(Pd.f.e(tVar, typeTable), nameResolver);
                if (f7 == null) {
                    return null;
                }
                arrayList.add(f7);
            }
            V11 = C7714v.V(arrayList, "", "(", ")V", null, 56);
        } else {
            V11 = nameResolver.getString(bVar.j());
        }
        return new d.b(string, V11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 java.lang.String, still in use, count: 2, list:
          (r3v2 java.lang.String) from 0x005b: IF  (r3v2 java.lang.String) == (null java.lang.String)  -> B:23:0x005d A[HIDDEN]
          (r3v2 java.lang.String) from 0x005e: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:20:0x005b, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static Rd.d.a c(@org.jetbrains.annotations.NotNull Nd.m r3, @org.jetbrains.annotations.NotNull Pd.c r4, @org.jetbrains.annotations.NotNull Pd.g r5, boolean r6) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            Td.h$f<Nd.m, Qd.a$c> r0 = Qd.C3856a.f23235d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = Pd.e.a(r3, r0)
            Qd.a$c r0 = (Qd.C3856a.c) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L5d
        L20:
            boolean r2 = r0.A()
            if (r2 == 0) goto L2b
            Qd.a$a r0 = r0.p()
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 != 0) goto L31
            if (r6 == 0) goto L31
            goto L5d
        L31:
            if (r0 == 0) goto L3e
            boolean r6 = r0.n()
            if (r6 == 0) goto L3e
            int r6 = r0.l()
            goto L42
        L3e:
            int r6 = r3.W()
        L42:
            if (r0 == 0) goto L53
            boolean r2 = r0.m()
            if (r2 == 0) goto L53
            int r3 = r0.j()
            java.lang.String r3 = r4.getString(r3)
            goto L5e
        L53:
            Nd.p r3 = Pd.f.d(r3, r5)
            java.lang.String r3 = f(r3, r4)
            if (r3 != 0) goto L5e
        L5d:
            return r1
        L5e:
            Rd.d$a r5 = new Rd.d$a
            java.lang.String r4 = r4.getString(r6)
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rd.h.c(Nd.m, Pd.c, Pd.g, boolean):Rd.d$a");
    }

    public static d.b d(@NotNull Nd.h proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable) {
        String c11;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        h.f<Nd.h, C3856a.b> methodSignature = C3856a.f23233b;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        C3856a.b bVar = (C3856a.b) Pd.e.a(proto, methodSignature);
        int X9 = (bVar == null || !bVar.n()) ? proto.X() : bVar.l();
        if (bVar == null || !bVar.m()) {
            List c02 = C7714v.c0(Pd.f.b(proto, typeTable));
            List<t> f02 = proto.f0();
            Intrinsics.checkNotNullExpressionValue(f02, "getValueParameterList(...)");
            List<t> list = f02;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (t tVar : list) {
                Intrinsics.f(tVar);
                arrayList.add(Pd.f.e(tVar, typeTable));
            }
            ArrayList p02 = C7714v.p0(arrayList, c02);
            ArrayList arrayList2 = new ArrayList(C7714v.z(p02, 10));
            Iterator it = p02.iterator();
            while (it.hasNext()) {
                String f7 = f((p) it.next(), nameResolver);
                if (f7 == null) {
                    return null;
                }
                arrayList2.add(f7);
            }
            String f11 = f(Pd.f.c(proto, typeTable), nameResolver);
            if (f11 == null) {
                return null;
            }
            c11 = o0.c(new StringBuilder(), C7714v.V(arrayList2, "", "(", ")", null, 56), f11);
        } else {
            c11 = nameResolver.getString(bVar.j());
        }
        return new d.b(nameResolver.getString(X9), c11);
    }

    public static final boolean e(@NotNull m proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        b.a a11 = c.a();
        Object h11 = proto.h(C3856a.f23236e);
        Intrinsics.checkNotNullExpressionValue(h11, "getExtension(...)");
        Boolean d11 = a11.d(((Number) h11).intValue());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    private static String f(p pVar, Pd.c cVar) {
        if (pVar.g0()) {
            return b.b(cVar.a(pVar.S()));
        }
        return null;
    }

    @NotNull
    public static final Pair<f, Nd.b> g(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(i(byteArrayInputStream, strings), (Nd.b) ((Td.b) Nd.b.f19065K).d(byteArrayInputStream, f25023a));
    }

    @NotNull
    public static final Pair<f, Nd.h> h(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(data));
        return new Pair<>(i(byteArrayInputStream, strings), (Nd.h) ((Td.b) Nd.h.f19192v).d(byteArrayInputStream, f25023a));
    }

    private static f i(ByteArrayInputStream byteArrayInputStream, String[] strings) {
        C3856a.d types = (C3856a.d) ((Td.b) C3856a.d.f23286h).c(byteArrayInputStream, f25023a);
        Intrinsics.checkNotNullExpressionValue(types, "parseDelimitedFrom(...)");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List<Integer> l11 = types.l();
        Set Y02 = l11.isEmpty() ? M.f71699a : C7714v.Y0(l11);
        List<C3856a.d.c> m11 = types.m();
        Intrinsics.checkNotNullExpressionValue(m11, "getRecordList(...)");
        Intrinsics.checkNotNullParameter(m11, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(m11.size());
        for (C3856a.d.c cVar : m11) {
            int A11 = cVar.A();
            for (int i11 = 0; i11 < A11; i11++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return new f(strings, Y02, arrayList);
    }

    @NotNull
    public static final Pair<f, k> j(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bytes = a.a(data);
        Intrinsics.checkNotNullExpressionValue(bytes, "decodeBytes(...)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(i(byteArrayInputStream, strings), (k) ((Td.b) k.f19228l).d(byteArrayInputStream, f25023a));
    }
}
