package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ṭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1016 extends C0536 {

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f3024 = StringFog.decrypt("8SaVsBhZIEvDDYK5D1kOTd4thr0VQjs=\n", "sEj03GEtSSg=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Handler f3025;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f3026;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f3027;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f3028;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3029;

    public C1016(Context context, C0439 c0439, int i, String str, long j) {
        super(context, c0439, j);
        this.f3028 = i;
        this.f3027 = 0;
        this.f3026 = 1;
        this.f3029 = str;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("NhKYm4hgXnoEOY+Sn2BwfBkZi5aFe0U=\n", "d3z59/EUNxk=\n"));
        handlerThread.start();
        this.f3025 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5804(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1107 c1107) {
        this.f3025.post(new C1025(this, str, jSONObject, jSONObject2, z, c1107));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0536
    /* renamed from: ﾒ */
    public final JSONObject mo5493(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        long timeInMillis;
        long elapsedRealtime;
        synchronized (this) {
            String str = AbstractC0494.f1141;
            timeInMillis = Calendar.getInstance().getTimeInMillis();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        JSONObject mo5493 = super.mo5493(jSONObject, z, z2, z3);
        try {
            String str2 = AbstractC0739.f2061;
            long optLong = mo5493.optLong(str2);
            mo5493.remove(str2);
            if (optLong != 0) {
                long j = elapsedRealtime - (timeInMillis - optLong);
                mo5493.put(StringFog.decrypt("n1QO\n", "7CB9wRcImkY=\n"), timeInMillis);
                mo5493.put(StringFog.decrypt("DjnR\n", "fUylZyLZEuw=\n"), elapsedRealtime);
                timeInMillis = optLong;
                elapsedRealtime = j;
            }
            mo5493.put(StringFog.decrypt("0bj/\n", "tcyMYbn0S8k=\n"), timeInMillis);
            mo5493.put(StringFog.decrypt("lvM=\n", "44fa0UdqTmw=\n"), elapsedRealtime);
            mo5493.put(StringFog.decrypt("2RLRVw==\n", "qme4M8FCmQQ=\n"), this.f3029);
            mo5493.put(StringFog.decrypt("HbHh\n", "btiFsyXKgws=\n"), this.f3028);
            String decrypt = StringFog.decrypt("3Bff\n", "r3myjc7wq/Y=\n");
            int i = this.f3027;
            if (i == 0) {
                i = 1;
            }
            mo5493.put(decrypt, i);
            if (AbstractC0398.m5397().mo5398()) {
                mo5493.put(StringFog.decrypt("eV0vxg==\n", "Gi5DopikAeI=\n"), true);
            }
            mo5493.put(StringFog.decrypt("Ip3x\n", "QfqH7mXvKxc=\n"), AbstractC0398.m5397().mo5410());
            C0521 c0521 = ((C0470) AbstractC0398.m5397()).f886;
            if (c0521 != null) {
                String m5491 = c0521.m5491();
                if (!TextUtils.isEmpty(m5491)) {
                    mo5493.put(StringFog.decrypt("PW5x\n", "WBoFpxY/EEA=\n"), m5491);
                }
                Object m5492 = c0521.m5492();
                if (m5492 != null) {
                    mo5493.put(StringFog.decrypt("0x+7GQ==\n", "tmvPag7zkxY=\n"), m5492);
                }
            }
            if (z2) {
                m5805(mo5493);
            }
        } catch (JSONException e) {
            String str3 = f3024;
            AbstractC0544.m5511(str3, str3, StringFog.decrypt("POvIrSeYSZ4c+M6rO98KiQ/81LYY3V6N\n", "eZm6wlW4Kuw=\n"), e, null, false);
        }
        return mo5493;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5805(JSONObject jSONObject) {
        C0744 m5949 = C1312.m5944().m5949();
        try {
            jSONObject.put(StringFog.decrypt("vdFxLu7QWuO5\n", "0bACWrq/L4A=\n"), AbstractC0647.m5605(m5949.f2074, m5949.f2073, m5949.f2072, m5949.f2071));
        } catch (JSONException e) {
            String str = f3024;
            AbstractC0544.m5511(str, str, StringFog.decrypt("ZMZrNOgvk3Vl3Xc8umOTYnXbbDjyL4Z+IdFvPvR7\n", "AbQZW5oP8hE=\n"), e, null, false);
        }
    }
}
