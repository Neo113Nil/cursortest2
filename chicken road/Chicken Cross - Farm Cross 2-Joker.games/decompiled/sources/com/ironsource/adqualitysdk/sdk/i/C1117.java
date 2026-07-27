package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.丨, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1117 extends C0504 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC0411[] f3245;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0411 f3246;

    public C1117(AbstractC0411 abstractC0411, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(str, arrayList2);
        this.f3246 = abstractC0411;
        if (arrayList != null) {
            AbstractC0411[] abstractC0411Arr = new AbstractC0411[arrayList.size()];
            this.f3245 = abstractC0411Arr;
            arrayList.toArray(abstractC0411Arr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0504
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1117.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1117 c1117 = (C1117) obj;
        AbstractC0411 abstractC0411 = this.f3246;
        if (abstractC0411 == null ? c1117.f3246 != null : !abstractC0411.equals(c1117.f3246)) {
            return false;
        }
        AbstractC0411[] abstractC0411Arr = this.f3245;
        AbstractC0411[] abstractC0411Arr2 = c1117.f3245;
        return abstractC0411Arr != null ? abstractC0411Arr.equals(abstractC0411Arr2) : abstractC0411Arr2 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0504
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0411 abstractC0411 = this.f3246;
        int hashCode2 = (hashCode + (abstractC0411 != null ? abstractC0411.hashCode() : 0)) * 31;
        AbstractC0411[] abstractC0411Arr = this.f3245;
        return hashCode2 + (abstractC0411Arr != null ? abstractC0411Arr.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0504
    public final String toString() {
        return mo5478(this.f1150);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0504
    /* renamed from: ﾇ */
    public final String mo5478(Object[] objArr) {
        return AbstractC1257.m5940("nQ==\n", "tLrbCn4K4CY=\n", new StringBuilder().append(this.f3246).append(StringFog.decrypt("Fg==\n", "OJqL6VM6vko=\n")).append(this.f1151).append(this.f3245 != null ? AbstractC1257.m5940("TQ==\n", "c6bQX+oYJEs=\n", new StringBuilder().append(StringFog.decrypt("Yg==\n", "XnvRCnl4BOQ=\n")).append(AbstractC0411.m5425(this.f3245))) : "").append(StringFog.decrypt("LQ==\n", "BUn6F/vQXZs=\n")).append(AbstractC0411.m5425(objArr)));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0504, com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C0623 c0623;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0411 abstractC0411 : this.f1150) {
            arrayList.add(abstractC0411.m5426(c1074, c1226).f3386);
        }
        AbstractC0411 abstractC04112 = this.f3246;
        if ((abstractC04112 instanceof C1055) && ((C1055) abstractC04112).f3138.equals(StringFog.decrypt("GbJG70Q=\n", "asc2ijaKydc=\n"))) {
            C1192 m5583 = c1226.f3484.f313.m5382(this.f1151).m5583(c1074, c1226, arrayList);
            m5583.f3385 = false;
            return m5583;
        }
        Object obj = this.f3246.m5426(c1074, c1226).f3386;
        if (obj instanceof InterfaceC0947) {
            return new C1192(((InterfaceC0947) obj).mo5313(c1226, this.f1151, arrayList, c1226.f3480, c1074));
        }
        if (obj instanceof C1226) {
            synchronized (obj) {
                C1226 c12262 = (C1226) obj;
                String str = this.f1151;
                if (str != null) {
                    c0623 = c12262.f3484.m5382(str);
                } else {
                    c12262.getClass();
                    c0623 = null;
                }
                if (c0623 != null) {
                    C1192 m55832 = c0623.m5583(c12262.f3483, c12262, arrayList);
                    m55832.f3385 = false;
                    return m55832;
                }
                AbstractC1086.m5875(c1226.m5929(), StringFog.decrypt("NwJgP1mgmmoXE2ckQu6YMh8VZjhE5N8=\n", "cnASUCuA/xI=\n") + this.f1151, new NoSuchMethodException(), null);
            }
        }
        try {
            AbstractC0411[] abstractC0411Arr = this.f3245;
            Method m5779 = abstractC0411Arr != null ? AbstractC0940.m5779(obj, this.f1151, m5881(abstractC0411Arr, c1074, c1226)) : AbstractC0940.m5780(obj, this.f1151, (List) arrayList);
            if (m5779 != null) {
                return new C1192(m5779.invoke(obj, arrayList.toArray()));
            }
            arrayList.add(0, obj);
            return new C1192(c1226.f3482.mo5313(c1226, this.f1151, arrayList, c1226.f3480, c1074));
        } catch (IllegalAccessException e) {
            AbstractC1086.m5875(c1226.m5929(), StringFog.decrypt("T6KMzsfMfsxvs4vV3IJ8lGe1isnaiDs=\n", "CtD+obXsG7Q=\n") + this, e, null);
            return null;
        } catch (IllegalArgumentException e2) {
            AbstractC1086.m5875(c1226.m5929(), StringFog.decrypt("xswwBRy/qsvm3TceB/Gok+7bNgIB++8=\n", "g75Cam6fz7M=\n") + this, e2, null);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5881(AbstractC0411[] abstractC0411Arr, C1074 c1074, C1226 c1226) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0411 abstractC0411 : abstractC0411Arr) {
            arrayList.add((Class) abstractC0411.m5426(c1074, c1226).f3386);
        }
        return arrayList;
    }
}
