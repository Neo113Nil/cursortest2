package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.у, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0518 implements InterfaceC0902 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1175;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0439 f1176;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f1177;

    public C0518(C0470 c0470, Context context, C0439 c0439) {
        this.f1175 = c0470;
        this.f1177 = context;
        this.f1176 = c0439;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0902
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5489(C1138 c1138, String str) {
        JSONObject jSONObject;
        int i = c1138 != null ? c1138.f3274.f3351 : -1;
        AbstractC0544.m5504(StringFog.decrypt("FPmW6JVUvAIo+pLg\n", "Rpz7h+Ex/20=\n"), StringFog.decrypt("3Je3/wEfxPPtkaz+FB/A+feDrPdTWdH59MW29QFJxuSjxQ==\n", "meXFkHM/o5Y=\n") + i);
        if (i != 403) {
            C0470 c0470 = this.f1175;
            int i2 = c0470.f880;
            c0470.f880 = i2 + 1;
            if (i2 < c0470.m5457()) {
                C0470 c04702 = this.f1175;
                synchronized (c04702) {
                    jSONObject = c04702.f3224;
                }
                m5487(jSONObject.optInt(StringFog.decrypt("uejT\n", "2pqnh34ty6Y=\n"), c04702.f898));
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0902
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5488(C1138 c1138) {
        JSONObject jSONObject;
        int i;
        String str;
        JSONObject jSONObject2;
        try {
            C1171 c1171 = c1138.f3274;
            i = c1171.f3351;
            str = c1171.f3350;
        } catch (Exception e) {
            try {
                AbstractC0480.m5465(StringFog.decrypt("TGODwKGASYBwYIfI\n", "Hgbur9XlCu8=\n"), StringFog.decrypt("i9xQsyhyKWy83UuyPXIraKPBVrl6MTZjqMdF/DAhNmM=\n", "zq4i3FpSWQ0=\n"), e, false, true, false);
            } catch (Throwable unused) {
            }
        }
        if (i >= 200 && i <= 299) {
            if (!TextUtils.isEmpty(c1138.f3275)) {
                jSONObject2 = new JSONObject(c1138.f3275);
            } else {
                jSONObject2 = new JSONObject();
            }
            if (jSONObject2.optBoolean(StringFog.decrypt("ORzj\n", "SniPS9SZgbE=\n"))) {
                C0932.m5751().m5759();
            }
            String decrypt = StringFog.decrypt("yARfZMIs7h/0B1ts\n", "mmEyC7ZJrXA=\n");
            AbstractC0544.m5510(decrypt, decrypt, StringFog.decrypt("T4NpsOHdw8ZpmmaqpNzVw3mffLbgjtPPcpBjtL4=\n", "HPYK04SusKA=\n"), jSONObject2, true);
            JSONObject m5606 = AbstractC0647.m5606(jSONObject2, false);
            C0470 c0470 = this.f1175;
            long optLong = m5606.optLong(StringFog.decrypt("84Ei9w==\n", "n+JWhHnb0zU=\n"), 0L);
            if (!c0470.f876) {
                C0482 c0482 = c0470.f892;
                c0482.getClass();
                C0482.m5466().post(new C0520(c0482, C0470.f869, "" + optLong));
                c0470.f876 = true;
            }
            m5606.remove(StringFog.decrypt("t2WJ\n", "xBH6PkV0204=\n"));
            C0482 c04822 = this.f1175.f892;
            String decrypt2 = StringFog.decrypt("hW9BybkpxAmUbU3Pug==\n", "9wwup99Aoyc=\n");
            String jSONObject3 = m5606.toString();
            c04822.getClass();
            C0482.m5466().post(new C0490(c04822, decrypt2, jSONObject3));
            String decrypt3 = StringFog.decrypt("++U=\n", "j5aFavXZFrA=\n");
            String str2 = AbstractC0494.f1141;
            jSONObject2.put(decrypt3, Calendar.getInstance().getTimeInMillis());
            jSONObject2.put(StringFog.decrypt("x60=\n", "stm/eP3y3vs=\n"), SystemClock.elapsedRealtime());
            C0470 c04702 = this.f1175;
            long j = c1138.f3273;
            c04702.getClass();
            if (jSONObject2.has(StringFog.decrypt("WdbT\n", "KqKgsVvio4c=\n"))) {
                try {
                    jSONObject2.put(StringFog.decrypt("SClp\n", "O10ane1o0d8=\n"), jSONObject2.optLong(StringFog.decrypt("M2Ef\n", "QBVsScAyO3E=\n")) + (j / 2));
                } catch (JSONException unused2) {
                }
            }
            this.f1175.mo5459(jSONObject2);
            this.f1175.m5458();
            this.f1175.m5454();
            C0470 c04703 = this.f1175;
            synchronized (c04703) {
                jSONObject = c04703.f3224;
            }
            m5487(jSONObject.optInt(StringFog.decrypt("Gt6t\n", "eb/Z8wTbBSs=\n"), c04703.f897));
            if (this.f1175.m5455()) {
                C0470 c04704 = this.f1175;
                if (c04704.f880 == c04704.m5457()) {
                    AbstractC0480.m5464(StringFog.decrypt("g7UFTJSLueW/tgFE\n", "0dBoI+Du+oo=\n"), StringFog.decrypt("iRcfUxZoREu7GwFAFzoQQvoXA0YBYxRZ9RYIRgFjFFn2UgRLGm4NTLYbF0AXOhNErhpNVR97DUP6\nGwNMBzoWSKsHCFYH\n", "2nJtJXMaZC0=\n"), (Throwable) null, true);
                    return;
                }
                return;
            }
            return;
        }
        mo5489(c1138, str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5487(int i) {
        synchronized (this.f1175) {
            if (this.f1175.f890 != null) {
                AbstractC1145.m5896(new C0522(this), i);
            }
        }
    }
}
