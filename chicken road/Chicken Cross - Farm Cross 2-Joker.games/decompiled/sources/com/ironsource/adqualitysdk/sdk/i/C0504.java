package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Г, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0504 extends AbstractC0411 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1149 = StringFog.decrypt("g0xg\n", "7yMH0jDYsY0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411[] f1150;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1151;

    public C0504(String str, ArrayList arrayList) {
        this.f1151 = AbstractC1212.m5923(str);
        AbstractC0411[] abstractC0411Arr = new AbstractC0411[arrayList.size()];
        this.f1150 = abstractC0411Arr;
        arrayList.toArray(abstractC0411Arr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0504 c0504 = (C0504) obj;
        if (this.f1151.equals(c0504.f1151)) {
            return Arrays.equals(this.f1150, c0504.f1150);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1151;
        return Arrays.hashCode(this.f1150) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        return mo5478(this.f1150);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String mo5478(Object[] objArr) {
        return AbstractC1257.m5940("Yg==\n", "S9j3tSOqapw=\n", new StringBuilder().append(this.f1151).append(StringFog.decrypt("dg==\n", "Xkj+XpiFIKQ=\n")).append(AbstractC0411.m5425(objArr)));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public C1192 mo5387(C1074 c1074, C1226 c1226) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0411 abstractC0411 : this.f1150) {
            arrayList.add(abstractC0411.m5426(c1074, c1226).f3386);
        }
        if (this.f1151.equals(f1149)) {
            AbstractC1086.m5875(StringFog.decrypt("kHR9eFpE1g==\n", "wyYxJxYLkbI=\n"), c1226.m5929() + StringFog.decrypt("V2k=\n", "bUlEdTT1jCo=\n") + arrayList.get(0), null, null);
            return new C1192(null);
        }
        try {
            return new C1192(((C0623) c1074.m5837(this.f1151)).m5583(c1074, c1226, arrayList));
        } catch (Exception unused) {
            if (c1226.f3484.m5382(this.f1151) == null) {
                return new C1192(c1226.f3482.mo5313(c1226, this.f1151, arrayList, c1226.f3480, c1074));
            }
            C1192 m5583 = c1226.f3484.m5382(this.f1151).m5583(c1074, c1226, arrayList);
            m5583.f3385 = false;
            return m5583;
        }
    }
}
