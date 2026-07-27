package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1157 implements InterfaceC0902 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1155 f3313;

    public C1157(C1155 c1155) {
        this.f3313 = c1155;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0902
    /* renamed from: ﾒ */
    public final void mo5488(C1138 c1138) {
        C1171 c1171 = c1138.f3274;
        int i = c1171.f3351;
        String str = c1171.f3350;
        if (i < 200 || i > 299) {
            if (i == 403) {
                synchronized (this.f3313.f3308) {
                    Iterator it = this.f3313.f3308.f3125.iterator();
                    while (it.hasNext()) {
                        AbstractC1145.m5891(new C1230((C1109) it.next()));
                    }
                }
            } else {
                AbstractC0544.m5509(StringFog.decrypt("wh/K2vrZG+nw\n", "g3GrtoOtcoo=\n"), StringFog.decrypt("Ah4BGLHiWLI2URsYq/4RqyMeAhrl/VioOVEfGKvudKo0HxhT5c1eqHEDCQ615V+vNEtM\n", "UXFsfcWKMdw=\n") + i + ServerSentEventKt.SPACE + str);
            }
            AbstractC1145.m5891(new C1222(this, c1138, i, str));
            return;
        }
        String decrypt = StringFog.decrypt("xcagF9p2a/f3\n", "hKjBe6MCApQ=\n");
        AbstractC0544.m5510(decrypt, decrypt, StringFog.decrypt("qI3WjeK3w2iMgcfe8LfCeJySzcPw8pB7gJCC3ub51FiZh8zZog==\n", "7+KirYOXsB0=\n"), this.f3313.f3311, true);
        Iterator it2 = this.f3313.f3310.iterator();
        while (it2.hasNext()) {
            C1035 c1035 = (C1035) it2.next();
            C0357 c0357 = this.f3313.f3308.f3131;
            C0414 c0414 = c1035.f3075;
            c0357.getClass();
            C0482.m5466().post(new C0359(c0357, c0414));
        }
        AbstractC1145.m5891(new C1228(this, c1138));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0902
    /* renamed from: ﾒ */
    public final void mo5489(C1138 c1138, String str) {
        AbstractC1145.m5891(new C1165(this, c1138, str));
    }
}
