package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0771 implements InterfaceC0942 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0761 f2216;

    public C0771(C0761 c0761) {
        this.f2216 = c0761;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0942
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5664() {
        HashMap hashMap;
        this.f2216.f2194.f1861 = AbstractC0398.m5397().mo5407();
        AbstractC0544.m5509(StringFog.decrypt("Ij9hqqpzYcwTHW6qrndw0Q==\n", "YVAPxM8QFaM=\n"), StringFog.decrypt("sSmgtjRFVLSSYLq5P11Uu5kpqbIyCV61my62tCJGT6k=\n", "9UDT11YpPdo=\n"));
        C0682 c0682 = this.f2216.f2194;
        c0682.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = (c0682.f1867 != null ? new ArrayList(c0682.f1867) : new ArrayList()).iterator();
        while (it.hasNext()) {
            C0969 c0969 = (C0969) it.next();
            if (c0682.m5636(c0969.f2812.f3104)) {
                arrayList.add(c0969);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0969 c09692 = (C0969) it2.next();
            String str = C0682.f1855;
            AbstractC0544.m5512(str, str, AbstractC1257.m5940("04lbFTdkG1CcmA==\n", "8+o0e1kBeCQ=\n", new StringBuilder().append(StringFog.decrypt("fMVH0CHcHslfjA==\n", "OKw0sUOwd6c=\n")).append(c09692.f2812.f3103)), true);
            String str2 = c09692.f2812.f3104;
            synchronized (c0682) {
                hashMap = c0682.f1865;
            }
            c0682.m5635(str2, (JSONObject) hashMap.get(str2));
            AbstractC1145.m5895(new C0813(c09692));
            ((ArrayList) c0682.m5628()).remove(c09692);
        }
    }
}
