package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ๅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0717 implements InterfaceC0620 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0619 f1984;

    public C0717(C0619 c0619) {
        this.f1984 = c0619;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0620
    /* renamed from: ﾒ */
    public final Object mo5581(List list) {
        AbstractC0411 m5569 = this.f1984.m5569(list);
        if ((m5569 instanceof C1055) || (m5569 instanceof C0705)) {
            return m5569;
        }
        this.f1984.m5579(StringFog.decrypt("vgqkrkOqUfrbBLW5Sb9W8p5Str5U/kb7mBe9vUW6FA==\n", "+3LUyyDeNJ4=\n") + m5569);
        throw null;
    }
}
