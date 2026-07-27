package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0922 extends AbstractRunnableC0730 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2565;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0755 f2566;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f2567;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2568;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2569;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2570;

    public C0922(C0682 c0682, String str, Context context, String str2, List list, C0755 c0755) {
        this.f2565 = c0682;
        this.f2570 = str;
        this.f2569 = context;
        this.f2568 = str2;
        this.f2567 = list;
        this.f2566 = c0755;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        AbstractC0544.m5509(StringFog.decrypt("f2liO6+++FhOS207q7rpRQ==\n", "PAYMVcrdjDc=\n"), StringFog.decrypt("c3ucp9/nhohAfJu0luWFj1RwlqfZ9Mo=\n", "OhX107aG6uE=\n") + this.f2570);
        try {
            C0682 c0682 = this.f2565;
            Context context = this.f2569;
            String str = this.f2568;
            String str2 = this.f2570;
            List list = this.f2567;
            C0755 c0755 = this.f2566;
            c0682.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0682.m5632(context, str, str2, (AbstractC0830) it.next(), c0755);
            }
        } catch (Throwable th) {
            C0651 c0651 = this.f2565.f1860;
            if (c0651 != null) {
                AbstractC1145.m5891(new C0663(c0651, this.f2570, EnumC0676.f1843));
            }
            HashMap m5618 = C0682.m5618(this.f2565);
            String str3 = this.f2568;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m5618.put(str3, th2.toString());
            AbstractC0480.m5465(StringFog.decrypt("ZOiOzu40pIhVyoHO6jC1lQ==\n", "J4fgoItX0Oc=\n"), StringFog.decrypt("rnBthB6A4d+OY2uCAseizoRscY4P1O3fyw==\n", "6wIf62yggq0=\n") + this.f2570, th, true, true, false);
        }
    }
}
