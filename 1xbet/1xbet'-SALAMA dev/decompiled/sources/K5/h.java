package K5;

import A5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f4110d = new h();

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        Long lValueOf;
        switch (b7) {
            case -128:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                j jVar = new j();
                jVar.f4112a = (Map) arrayList.get(0);
                return jVar;
            case -127:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                k kVar = new k();
                Object obj = arrayList2.get(0);
                if (obj == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
                }
                if (lValueOf == null) {
                    throw new IllegalStateException("Nonnull field \"maxResults\" is null.");
                }
                kVar.f4113a = lValueOf;
                kVar.f4114b = (String) arrayList2.get(1);
                return kVar;
            case -126:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                l lVar = new l();
                List list = (List) arrayList3.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"items\" is null.");
                }
                lVar.f4115a = list;
                lVar.f4116b = (String) arrayList3.get(1);
                List list2 = (List) arrayList3.get(2);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"prefixs\" is null.");
                }
                lVar.f4117c = list2;
                return lVar;
            case -125:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                m mVar = new m();
                mVar.f4118a = (String) arrayList4.get(0);
                mVar.f4119b = (String) arrayList4.get(1);
                mVar.f4120c = (String) arrayList4.get(2);
                mVar.f4121d = (String) arrayList4.get(3);
                mVar.f4122e = (String) arrayList4.get(4);
                mVar.f4123f = (Map) arrayList4.get(5);
                return mVar;
            case -124:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                n nVar = new n();
                String str = (String) arrayList5.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"appName\" is null.");
                }
                nVar.f4124a = str;
                nVar.f4125b = (String) arrayList5.get(1);
                String str2 = (String) arrayList5.get(2);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"bucket\" is null.");
                }
                nVar.f4126c = str2;
                return nVar;
            case -123:
                ArrayList arrayList6 = (ArrayList) e(byteBuffer);
                o oVar = new o();
                String str3 = (String) arrayList6.get(0);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"bucket\" is null.");
                }
                oVar.f4127a = str3;
                String str4 = (String) arrayList6.get(1);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
                }
                oVar.f4128b = str4;
                String str5 = (String) arrayList6.get(2);
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                oVar.f4129c = str5;
                return oVar;
            default:
                return super.f(b7, byteBuffer);
        }
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof j) {
            byteArrayOutputStream.write(128);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(jVar.f4112a);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof k) {
            byteArrayOutputStream.write(129);
            k kVar = (k) obj;
            kVar.getClass();
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(kVar.f4113a);
            arrayList2.add(kVar.f4114b);
            k(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof l) {
            byteArrayOutputStream.write(130);
            l lVar = (l) obj;
            lVar.getClass();
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(lVar.f4115a);
            arrayList3.add(lVar.f4116b);
            arrayList3.add(lVar.f4117c);
            k(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof m) {
            byteArrayOutputStream.write(131);
            m mVar = (m) obj;
            mVar.getClass();
            ArrayList arrayList4 = new ArrayList(6);
            arrayList4.add(mVar.f4118a);
            arrayList4.add(mVar.f4119b);
            arrayList4.add(mVar.f4120c);
            arrayList4.add(mVar.f4121d);
            arrayList4.add(mVar.f4122e);
            arrayList4.add(mVar.f4123f);
            k(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(132);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(nVar.f4124a);
            arrayList5.add(nVar.f4125b);
            arrayList5.add(nVar.f4126c);
            k(byteArrayOutputStream, arrayList5);
            return;
        }
        if (!(obj instanceof o)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(133);
        o oVar = (o) obj;
        oVar.getClass();
        ArrayList arrayList6 = new ArrayList(3);
        arrayList6.add(oVar.f4127a);
        arrayList6.add(oVar.f4128b);
        arrayList6.add(oVar.f4129c);
        k(byteArrayOutputStream, arrayList6);
    }
}
