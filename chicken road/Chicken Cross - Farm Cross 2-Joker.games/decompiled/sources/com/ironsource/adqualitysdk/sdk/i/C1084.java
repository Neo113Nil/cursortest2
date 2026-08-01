package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅼ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1084 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f3195;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3196;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3197;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f3198;

    public C1084(C0900 c0900, String str, boolean z, C1226 c1226) {
        this.f3195 = c0900;
        this.f3198 = str;
        this.f3197 = z;
        this.f3196 = c1226;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5873(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                String str = this.f3198 + StringFog.decrypt("aQ==\n", "R53fMRyAAtM=\n") + method.getName();
                ArrayList m5707 = C0900.m5707(this.f3195, objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(InterfaceC0997) obj});
                ArrayList arrayList = new ArrayList();
                if (this.f3197) {
                    arrayList.add(m5707);
                    m5707 = arrayList;
                }
                C0807 c0807 = this.f3196.f3480;
                C1226.m5926(c0807.f2352, str, true, false, m5707);
                C1226 c1226 = c0807.f2352;
                C0844 c0844 = new C0844(c0807, str, false, m5707);
                c1226.getClass();
                try {
                    AbstractC1145.m5895(c0844);
                } catch (Throwable unused) {
                }
                C1226 c12262 = c0807.f2352;
                C0844 c08442 = new C0844(c0807, str, true, m5707);
                c12262.getClass();
                try {
                    AbstractC1145.m5893(new C0706(c08442));
                } catch (Throwable unused2) {
                }
            } catch (Exception e) {
                AbstractC1086.m5875(this.f3196.m5929(), AbstractC1257.m5940("lWpPI48uWnXH\n", "tQYmUPtLNBA=\n", new StringBuilder().append(StringFog.decrypt("vGB8h6vd7J6PfWWBt5ql\n", "+RIO6Nn9hfA=\n")).append(method.getName()).append(StringFog.decrypt("hqpTK4wRFZfJqRY=\n", "psc2X+R+cbc=\n")).append(this.f3198)), e, null);
            }
        }
    }
}
