package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1050 {

    /* renamed from: סּ, reason: contains not printable characters */
    public final C1124 f3118;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final String f3119;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0909 f3120;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C0988 f3122;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public C1103 f3123;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final Context f3124;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public boolean f3127;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f3128;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Handler f3129;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C1016 f3130;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0357 f3131;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0516 f3132;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f3133;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0965 f3134;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3117 = StringFog.decrypt("T/QrNzpc7Lx9\n", "DppKW0Mohd8=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3116 = StringFog.decrypt("MnrWN3/q9TQtJtwiNOz2eSdm1jhj/P00NQ==\n", "Rgi3VBqIlFc=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3115 = StringFog.decrypt("fWJ+cjPPtxxrbmN6K4OuDmBsfWYrx/kc\n", "Dg0RH1+umm8=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3114 = StringFog.decrypt("678VNo0h1hDLtQ==\n", "gtFhGP5EpWM=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3113 = StringFog.decrypt("96Lw1hVShs3rue/TGmDB2g==\n", "hNaCv3s1qL4=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ArrayList f3126 = new ArrayList();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ArrayList f3125 = new ArrayList();

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final Thread.UncaughtExceptionHandler f3121 = Thread.getDefaultUncaughtExceptionHandler();

    public C1050(Context context, C0439 c0439, C0965 c0965, boolean z, String str, C1124 c1124) {
        this.f3118 = c1124;
        Thread.setDefaultUncaughtExceptionHandler(new C1135(this));
        this.f3134 = c0965;
        this.f3124 = context;
        C0482 c0482 = new C0482(context, StringFog.decrypt("AFKzwPDUE/EfDrnVu9IQvBVOs8/swhvxBw==\n", "dCDSo5W2cpI=\n"), StringFog.decrypt("XyvM4dVShTdJJ9HpzR6cJUIlz/XNWss3\n", "LESjjLkzqEQ=\n"));
        this.f3131 = new C0357(c0482, StringFog.decrypt("OLQ1FD+NviY=\n", "cONwYlrjylU=\n"), StringFog.decrypt("mX/pZvW6\n", "/AmMCIGUJbA=\n"));
        String str2 = f3114;
        String m5468 = c0482.m5468(str2);
        int parseInt = !TextUtils.isEmpty(m5468) ? Integer.parseInt(m5468) + 1 : 1;
        c0482.m5469(str2, "" + parseInt);
        String str3 = f3113;
        String m54682 = c0482.m5468(str3);
        if (TextUtils.isEmpty(m54682)) {
            m54682 = UUID.randomUUID().toString();
            c0482.m5469(str3, m54682);
        }
        String str4 = m54682;
        String m54683 = ((C0470) AbstractC0398.m5397()).f892.m5468(C0470.f869);
        this.f3130 = new C1016(context, c0439, parseInt, str4, !TextUtils.isEmpty(m54683) ? Long.parseLong(m54683) : 0L);
        this.f3132 = new C0516(context);
        this.f3133 = false;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("o3y7fItOTLqDeKtngWw=\n", "4B3YFO4ePtU=\n"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3129 = handler;
        this.f3122 = new C0988(parseInt);
        this.f3128 = !z;
        this.f3119 = str;
        synchronized (this) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new C1247(this), 0);
        }
        m5822();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5816(C1050 c1050) {
        synchronized (c1050) {
            c1050.f3127 = false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5817(C1050 c1050) {
        synchronized (c1050) {
            if (c1050.m5825() && !TextUtils.isEmpty(c1050.f3130.f1205.m5441()) && !c1050.m5827()) {
                c1050.m5821();
                AbstractC0544.m5509(f3117, StringFog.decrypt("3NMKYXo17NLqwAFrZyirlP3ZCSVwOuia6g==\n", "j7ZkBRNbi/I=\n"));
                C0357 c0357 = c1050.f3131;
                int m5774 = c1050.m5828().m5774();
                C1239 c1239 = new C1239(c1050);
                c0357.getClass();
                C0482.m5466().post(new C0383(c0357, m5774, c1239));
            }
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final void m5819() {
        C1103 c1103 = this.f3123;
        if (c1103 != null) {
            C0455 c0455 = this.f3132.f1171;
            synchronized (c0455) {
                c0455.f845.remove(c1103);
            }
        }
        this.f3120.m5719();
        this.f3120 = null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m5820() {
        this.f3133 = false;
        Handler handler = this.f3129;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C0516 c0516 = this.f3132;
        C0455 c0455 = c0516.f1171;
        c0455.f847.unregisterReceiver(c0455);
        c0516.f1170 = true;
        m5819();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized void m5821() {
        this.f3127 = true;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m5822() {
        C1103 c1103 = new C1103(this);
        this.f3123 = c1103;
        C0455 c0455 = this.f3132.f1171;
        synchronized (c0455) {
            c0455.f845.add(c1103);
        }
        this.f3120 = new C0909(new C1087(this));
        AbstractC0554.m5521().m5526(new C1082(this));
        AbstractC0398 m5397 = AbstractC0398.m5397();
        C1079 c1079 = new C1079(this);
        C0470 c0470 = (C0470) m5397;
        Handler handler = c0470.f890;
        if (handler != null) {
            handler.post(new C0506(c0470, c1079));
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5823() {
        synchronized (this) {
            Handler handler = this.f3129;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m5834(true);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5824() {
        try {
            this.f3128 = true;
            AbstractC1145.m5892(new C1127(this));
            m5823();
        } catch (Exception e) {
            AbstractC0480.m5464(f3117, StringFog.decrypt("oQeqwpx2WuDEGrbsniZn4aYUu8aJJFz7ihE=\n", "5HXYre5WM44=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m5825() {
        return this.f3133;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m5827() {
        return this.f3127;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5826(JSONObject jSONObject) {
        ArrayList arrayList;
        if (C0932.m5751().m5762()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f3126);
            }
            AbstractC1145.m5891(new C1152(arrayList, jSONObject));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5818(C1050 c1050, ArrayList arrayList, C1240 c1240) {
        JSONObject jSONObject;
        c1050.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1035 c1035 = (C1035) it.next();
            synchronized (c1035) {
                jSONObject = c1035.f3075.f546;
            }
            if (!jSONObject.has(StringFog.decrypt("NQhd\n", "UXwuqNa9hQk=\n"))) {
                try {
                    jSONObject.put(StringFog.decrypt("DVbT\n", "aSKgKq7xmiY=\n"), jSONObject.optLong(AbstractC0739.f2061));
                } catch (JSONException unused) {
                }
            }
            if (c1050.f3122.m5796(jSONObject)) {
                c1050.f3131.m5389(c1035.f3075, null);
            }
            jSONArray.put(jSONObject);
        }
        C1016 c1016 = c1050.f3130;
        c1016.f3025.post(new C1018(c1016, c1050.f3132.f1171.m5449(), jSONArray, new C1155(c1050, jSONArray, arrayList, c1240)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5830(C1123 c1123) {
        this.f3126.add(c1123);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5829(C1109 c1109) {
        this.f3125.add(c1109);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5831(String str, JSONObject jSONObject) {
        m5832(str, jSONObject, null, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5832(String str, JSONObject jSONObject, JSONObject jSONObject2, C0423 c0423) {
        boolean z;
        String str2 = f3117;
        AbstractC0544.m5510(str2, str2, AbstractC1257.m5940("gpLeZ4Oq873Wl9YzguTwqpg=\n", "ouW3E+uKlsU=\n", AbstractC1196.m5920("WbOZclsErKBi4ZN+WwessXukjm8PQw==\n", "DcHgGzVjjNQ=\n", new StringBuilder(), str)), jSONObject, true);
        try {
            if (m5828().m5775().contains(str)) {
                AbstractC0544.m5509(str2, StringFog.decrypt("EVTOkQHGgPQ2Vd2RF9WL/isbzdgGy87+Plbfi1I=\n", "Xzu6sXKj7pA=\n") + str + StringFog.decrypt("wA6JE4npCHWFQswJk6UOdJJQiRnD\n", "4Cbsa+qFfRE=\n"));
                return;
            }
            AbstractC0544.m5509(str2, StringFog.decrypt("699YwdpStwzQjVLN2lG3HcnIT9yUQv4M141PydlQrVg=\n", "v60hqLQ1l3g=\n") + str);
            C1016 c1016 = this.f3130;
            C0455 c0455 = this.f3132.f1171;
            synchronized (c0455) {
                z = c0455.f846;
            }
            c1016.m5804(str, jSONObject, jSONObject2, z, new C1107(this, c0423));
        } catch (Exception e) {
            AbstractC0480.m5465(f3117, StringFog.decrypt("AvcNZ71x0xNn9hpmqxTMGCnx\n", "R4V/CM9Run0=\n"), e, false, false, true);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized C0936 m5828() {
        return ((C0470) AbstractC0398.m5397()).f888;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5834(boolean z) {
        if (z) {
            this.f3129.removeCallbacksAndMessages(null);
            this.f3129.postDelayed(new C1247(this), 0);
        } else {
            C0357 c0357 = this.f3131;
            C1051 c1051 = new C1051(this);
            c0357.getClass();
            C0482.m5466().post(new C0368(c0357, c1051));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5833(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C0936 m5828 = m5828();
        C1161 c1161 = m5828.f3223;
        JSONObject jSONObject3 = c1161.f3327;
        String str = c1161.f3329;
        List arrayList = new ArrayList();
        String str2 = AbstractC0647.f1786;
        JSONArray optJSONArray = jSONObject3.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC0647.m5604(optJSONArray);
        }
        synchronized (m5828) {
            jSONObject2 = m5828.f3224;
        }
        String decrypt = StringFog.decrypt("piyY\n", "wFjgFtIllmA=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC0647.m5604(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }
}
