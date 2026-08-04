package H5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f3383e = new l();

    @Override // H5.c, A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3 = null;
        Long lValueOf4 = null;
        switch (b7) {
            case -128:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                g gVar = new g();
                int i7 = p136t.e.f(3)[((Integer) arrayList.get(0)).intValue()];
                if (i7 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                gVar.f3370a = i7;
                gVar.f3371b = (String) arrayList.get(1);
                return gVar;
            case -127:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                h hVar = new h();
                hVar.a(p136t.e.f(3)[((Integer) arrayList2.get(0)).intValue()]);
                hVar.f3373b = (String) arrayList2.get(1);
                hVar.f3374c = (Double) arrayList2.get(2);
                return hVar;
            case -126:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                i iVar = new i();
                String str = (String) arrayList3.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"path\" is null.");
                }
                iVar.f3375a = str;
                iVar.f3376b = (Map) arrayList3.get(1);
                Object obj = arrayList3.get(2);
                iVar.f3377c = obj != null ? p.a((ArrayList) obj) : null;
                Object obj2 = arrayList3.get(3);
                iVar.f3378d = obj2 == null ? 0 : p136t.e.f(3)[((Integer) obj2).intValue()];
                Object obj3 = arrayList3.get(4);
                iVar.f3379e = obj3 != null ? p136t.e.f(3)[((Integer) obj3).intValue()] : 0;
                return iVar;
            case -125:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                m mVar = new m();
                String str2 = (String) arrayList4.get(0);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"appName\" is null.");
                }
                mVar.f3384a = str2;
                Object obj4 = arrayList4.get(1);
                r rVarA = obj4 != null ? r.a((ArrayList) obj4) : null;
                if (rVarA == null) {
                    throw new IllegalStateException("Nonnull field \"settings\" is null.");
                }
                mVar.f3385b = rVarA;
                String str3 = (String) arrayList4.get(2);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
                }
                mVar.f3386c = str3;
                return mVar;
            case -124:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                o oVar = new o();
                int i8 = p136t.e.f(3)[((Integer) arrayList5.get(0)).intValue()];
                if (i8 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                oVar.f3389a = i8;
                Object obj5 = arrayList5.get(1);
                q qVarA = obj5 == null ? null : q.a((ArrayList) obj5);
                if (qVarA == null) {
                    throw new IllegalStateException("Nonnull field \"document\" is null.");
                }
                oVar.f3390b = qVarA;
                Object obj6 = arrayList5.get(2);
                if (obj6 == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
                }
                if (lValueOf == null) {
                    throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
                }
                oVar.f3391c = lValueOf;
                Object obj7 = arrayList5.get(3);
                if (obj7 != null) {
                    lValueOf4 = Long.valueOf(obj7 instanceof Integer ? ((Integer) obj7).intValue() : ((Long) obj7).longValue());
                }
                if (lValueOf4 == null) {
                    throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
                }
                oVar.f3392d = lValueOf4;
                return oVar;
            case -123:
                return p.a((ArrayList) e(byteBuffer));
            case -122:
                return q.a((ArrayList) e(byteBuffer));
            case -121:
                return r.a((ArrayList) e(byteBuffer));
            case -120:
                ArrayList arrayList6 = (ArrayList) e(byteBuffer);
                s sVar = new s();
                int i9 = p136t.e.f(3)[((Integer) arrayList6.get(0)).intValue()];
                if (i9 == 0) {
                    throw new IllegalStateException("Nonnull field \"source\" is null.");
                }
                sVar.f3403a = i9;
                int i10 = p136t.e.f(3)[((Integer) arrayList6.get(1)).intValue()];
                if (i10 == 0) {
                    throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
                }
                sVar.f3404b = i10;
                return sVar;
            case -119:
                ArrayList arrayList7 = (ArrayList) e(byteBuffer);
                t tVar = new t();
                tVar.f3405a = (List) arrayList7.get(0);
                tVar.f3406b = (List) arrayList7.get(1);
                Object obj8 = arrayList7.get(2);
                if (obj8 == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
                }
                tVar.f3407c = lValueOf2;
                Object obj9 = arrayList7.get(3);
                if (obj9 != null) {
                    lValueOf3 = Long.valueOf(obj9 instanceof Integer ? ((Integer) obj9).intValue() : ((Long) obj9).longValue());
                }
                tVar.f3408d = lValueOf3;
                tVar.f3409e = (List) arrayList7.get(4);
                tVar.f3410f = (List) arrayList7.get(5);
                tVar.f3411g = (List) arrayList7.get(6);
                tVar.f3412h = (List) arrayList7.get(7);
                tVar.f3413i = (Map) arrayList7.get(8);
                return tVar;
            case -118:
                ArrayList arrayList8 = (ArrayList) e(byteBuffer);
                u uVar = new u();
                List list = (List) arrayList8.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"documents\" is null.");
                }
                uVar.f3414a = list;
                List list2 = (List) arrayList8.get(1);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
                }
                uVar.f3415b = list2;
                Object obj10 = arrayList8.get(2);
                v vVarA = obj10 != null ? v.a((ArrayList) obj10) : null;
                if (vVarA == null) {
                    throw new IllegalStateException("Nonnull field \"metadata\" is null.");
                }
                uVar.f3416c = vVarA;
                return uVar;
            case -117:
                return v.a((ArrayList) e(byteBuffer));
            case -116:
                ArrayList arrayList9 = (ArrayList) e(byteBuffer);
                w wVar = new w();
                int i11 = p136t.e.f(4)[((Integer) arrayList9.get(0)).intValue()];
                if (i11 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                wVar.f3419a = i11;
                String str4 = (String) arrayList9.get(1);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"path\" is null.");
                }
                wVar.f3420b = str4;
                wVar.f3421c = (Map) arrayList9.get(2);
                Object obj11 = arrayList9.get(3);
                wVar.f3422d = obj11 != null ? p.a((ArrayList) obj11) : null;
                return wVar;
            default:
                return super.f(b7, byteBuffer);
        }
    }

    @Override // H5.c, A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof g) {
            byteArrayOutputStream.write(128);
            g gVar = (g) obj;
            gVar.getClass();
            ArrayList arrayList = new ArrayList(2);
            int i7 = gVar.f3370a;
            arrayList.add(i7 != 0 ? Integer.valueOf(p136t.e.e(i7)) : null);
            arrayList.add(gVar.f3371b);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof h) {
            byteArrayOutputStream.write(129);
            h hVar = (h) obj;
            hVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            int i8 = hVar.f3372a;
            arrayList2.add(i8 != 0 ? Integer.valueOf(p136t.e.e(i8)) : null);
            arrayList2.add(hVar.f3373b);
            arrayList2.add(hVar.f3374c);
            k(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(130);
            i iVar = (i) obj;
            iVar.getClass();
            ArrayList arrayList3 = new ArrayList(5);
            arrayList3.add(iVar.f3375a);
            arrayList3.add(iVar.f3376b);
            p pVar = iVar.f3377c;
            arrayList3.add(pVar == null ? null : pVar.b());
            int i9 = iVar.f3378d;
            arrayList3.add(i9 == 0 ? null : Integer.valueOf(p136t.e.e(i9)));
            int i10 = iVar.f3379e;
            arrayList3.add(i10 != 0 ? Integer.valueOf(p136t.e.e(i10)) : null);
            k(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof m) {
            byteArrayOutputStream.write(131);
            m mVar = (m) obj;
            mVar.getClass();
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(mVar.f3384a);
            r rVar = mVar.f3385b;
            arrayList4.add(rVar != null ? rVar.b() : null);
            arrayList4.add(mVar.f3386c);
            k(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof o) {
            byteArrayOutputStream.write(132);
            k(byteArrayOutputStream, ((o) obj).a());
            return;
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(133);
            k(byteArrayOutputStream, ((p) obj).b());
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(134);
            k(byteArrayOutputStream, ((q) obj).b());
            return;
        }
        if (obj instanceof r) {
            byteArrayOutputStream.write(135);
            k(byteArrayOutputStream, ((r) obj).b());
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(136);
            s sVar = (s) obj;
            sVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            int i11 = sVar.f3403a;
            arrayList5.add(i11 == 0 ? null : Integer.valueOf(p136t.e.e(i11)));
            int i12 = sVar.f3404b;
            arrayList5.add(i12 != 0 ? Integer.valueOf(p136t.e.e(i12)) : null);
            k(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(137);
            t tVar = (t) obj;
            tVar.getClass();
            ArrayList arrayList6 = new ArrayList(9);
            arrayList6.add(tVar.f3405a);
            arrayList6.add(tVar.f3406b);
            arrayList6.add(tVar.f3407c);
            arrayList6.add(tVar.f3408d);
            arrayList6.add(tVar.f3409e);
            arrayList6.add(tVar.f3410f);
            arrayList6.add(tVar.f3411g);
            arrayList6.add(tVar.f3412h);
            arrayList6.add(tVar.f3413i);
            k(byteArrayOutputStream, arrayList6);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(138);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(uVar.f3414a);
            arrayList7.add(uVar.f3415b);
            v vVar = uVar.f3416c;
            arrayList7.add(vVar != null ? vVar.b() : null);
            k(byteArrayOutputStream, arrayList7);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(139);
            k(byteArrayOutputStream, ((v) obj).b());
            return;
        }
        if (!(obj instanceof w)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(140);
        w wVar = (w) obj;
        wVar.getClass();
        ArrayList arrayList8 = new ArrayList(4);
        int i13 = wVar.f3419a;
        arrayList8.add(i13 == 0 ? null : Integer.valueOf(p136t.e.e(i13)));
        arrayList8.add(wVar.f3420b);
        arrayList8.add(wVar.f3421c);
        p pVar2 = wVar.f3422d;
        arrayList8.add(pVar2 != null ? pVar2.b() : null);
        k(byteArrayOutputStream, arrayList8);
    }
}
