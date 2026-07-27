package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚆ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0913 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0912 f2556;

    public C0913(C0912 c0912) {
        this.f2556 = c0912;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0969 c0969 = this.f2556.f2555;
        C1042 c1042 = c0969.f2812;
        if (c1042.f3098 == null) {
            c1042.f3098 = new E(c1042.f3106.optJSONObject(C1042.f3094));
        }
        E e = c1042.f3098;
        if (e != null) {
            synchronized (c0969) {
                c0969.f2806 = e;
            }
            if (c0969.f2809.mo5479()) {
                H.f113 = e;
            }
        }
        c0969.f2812.m5815().m5838(StringFog.decrypt("iodVVhvSkj6NgkZa\n", "5OYhP2230Ew=\n"), c0969.f2809);
        Iterator it = c0969.f2812.m5814().keySet().iterator();
        while (it.hasNext()) {
            C1307 c1307 = (C1307) c0969.f2812.m5814().get((String) it.next());
            if (!c1307.f3774) {
                c0969.f2807.add(new C1226(c0969, c0969.f2810, c0969.f2809, c0969.m5790(c1307), c0969.f2812.m5815()));
            }
        }
        c0969.m5791();
        Iterator it2 = c0969.m5789().iterator();
        while (it2.hasNext()) {
            ((C1226) it2.next()).m5928();
        }
        C0651 c0651 = this.f2556.f2552.f1860;
        if (c0651 != null) {
            AbstractC1145.m5891(new C0660(c0651, this.f2556.f2554, EnumC0670.f1833));
        }
        AbstractC0544.m5509(StringFog.decrypt("voW0jcpV982Pp7uNzlHm0A==\n", "/era4682g6I=\n"), this.f2556.f2555.f2812.f3103 + StringFog.decrypt("HzAhBT6SloVQIW4YJZSWlEwgKB48m4zRVj0nHzmWmZhFNio=\n", "P1NOa1D39fE=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5391(Throwable th) {
        try {
            ((JSONObject) C0682.m5621(this.f2556.f2552).get(this.f2556.f2555.f2812.f3104)).put(StringFog.decrypt("zDCIfg==\n", "pV7hCuG5dzo=\n"), false);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("yEoYznlO4+z5aBfOfUry8Q==\n", "iyV2oBwtl4M=\n");
            AbstractC0544.m5511(decrypt, decrypt, StringFog.decrypt("d9HeDyrkwvhG18UOP+TY81vXjBQ35NLyXM3JAyyrw71Ext4TMavfvVjQww4=\n", "MqOsYFjEsZ0=\n"), e, null, false);
        }
        C0651 c0651 = this.f2556.f2552.f1860;
        if (c0651 != null) {
            AbstractC1145.m5891(new C0663(c0651, this.f2556.f2554, EnumC0676.f1844));
        }
        AbstractC0480.m5465(StringFog.decrypt("GpbyrCnjuZ0rtP2sLeeogA==\n", "WfmcwkyAzfI=\n"), AbstractC1257.m5940("R+LFToAE44YI8w==\n", "Z4GqIO5hgPI=\n", new StringBuilder().append(StringFog.decrypt("ySN3p3ri24rlJWypZKvIjeI2JQ==\n", "jFEFyAjCsuQ=\n")).append(this.f2556.f2555.f2812.f3103)), th, true, true, true);
        AbstractC0544.m5504(StringFog.decrypt("GVt8x8eAje8hbGn5\n", "WD8tsqbs5Js=\n"), StringFog.decrypt("pzapTw3JGI3GN+pJCskFmoJ4/kIW1xLfjzbgXhbaG5acMedNX/IkvoIJ/EsT0gOGxgvNYV8=\n", "5liJKn+7d/8=\n") + this.f2556.f2555.f2812.f3103 + StringFog.decrypt("xXSD8YA7qZKKZcI=\n", "5Rfsn+5eyuY=\n"));
    }
}
