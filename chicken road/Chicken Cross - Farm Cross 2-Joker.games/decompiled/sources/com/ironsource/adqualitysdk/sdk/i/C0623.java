package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0623 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f1638 = -1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0623 f1639;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1105 f1640;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String[] f1641;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1642;

    static {
        StringFog.decrypt("sU/JCw==\n", "0D2ueF/Efg0=\n");
        StringFog.decrypt("rThYlA==\n", "z1c87fKajSQ=\n");
    }

    public C0623(String str, String str2, String str3, JSONObject jSONObject, C0623 c0623) {
        ArrayList arrayList;
        this.f1642 = AbstractC1212.m5923(str3);
        this.f1639 = c0623;
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("bL+Z2g==\n", "Dc3+qbsuQEE=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m5923 = AbstractC1212.m5923(optJSONArray.optString(i));
                if (m5923 != null) {
                    arrayList.add(m5923);
                }
            }
        } else {
            arrayList = null;
        }
        String[] strArr = new String[arrayList.size()];
        this.f1641 = strArr;
        arrayList.toArray(strArr);
        try {
            this.f1640 = AbstractC1137.m5890(str, str3, jSONObject.optString(StringFog.decrypt("s34k0Q==\n", "0RFAqAdg4O4=\n")));
        } catch (C1119 e) {
            new C0590(str, str2, str3, m5582(), StringFog.decrypt("vIMtKMSGSp+LgjYp0YZXm42ZMCOWgQ==\n", "+fFfR7amOv4=\n") + this.f1642 + StringFog.decrypt("vNMp3ElCEHP+0w==\n", "m/NIqGkueR0=\n") + (m5582() + e.f3251) + StringFog.decrypt("pls=\n", "nHvUQliLHXs=\n") + e.getMessage(), e).m5536(str);
        } catch (Throwable th) {
            String str4 = StringFog.decrypt("VsAQwmvgCV1hwQvDfuAUWWfaDck55w==\n", "E7JirRnAeTw=\n") + this.f1642 + StringFog.decrypt("LbKZ\n", "Coi5LPDZua8=\n") + th.getMessage();
            AbstractC1086.m5875(str, str4, th, new C0590(str, str2, str3, m5582(), str4));
        }
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(StringFog.decrypt("fnzTk8e0/Y84\n", "GAm98LPdkuE=\n")).append(this.f1642).append(StringFog.decrypt("Rw==\n", "bzvRFAGVOvM=\n")).append(UByte$$ExternalSyntheticBackport0.m((CharSequence) StringFog.decrypt("w1Y=\n", "73ayUmYl3Bw=\n"), (CharSequence[]) this.f1641)).append(StringFog.decrypt("b28=\n", "Rk+gvisg09s=\n"));
        C1105 c1105 = this.f1640;
        return append.append(c1105 != null ? c1105.toString() : StringFog.decrypt("T3S1\n", "NFTIb+QMdfc=\n")).toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1192 m5583(C1074 c1074, C1226 c1226, List list) {
        HashMap hashMap;
        List asList = Arrays.asList(this.f1641);
        if (list.size() != asList.size()) {
            AbstractC1086.m5875(c1226.m5929(), this.f1642 + StringFog.decrypt("nYgpUHbk7lnYnTxBff/vHZ0=\n", "veVMJB6Link=\n") + asList.size() + StringFog.decrypt("a7mZJ4WGNAY/q8sihZ9xGi67jimGjjVI\n", "S9jrQPDrUWg=\n") + list.size(), null, null);
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put((String) asList.get(i), list.get(i));
            }
        }
        C1074 c10742 = c1074.f3183;
        C1074 c10743 = new C1074(hashMap, c10742, this, c1074, c10742 == null);
        C1105 c1105 = this.f1640;
        if (c1105 != null) {
            return c1105.m5395(c10743, c1226);
        }
        new C0364(c1226, c10743, AbstractC1257.m5940("VOYv9GoHE5kX/Gf4fFMVgx+wL/tgFwI=\n", "c9wPmQ9ze/Y=\n", new StringBuilder().append(StringFog.decrypt("GrZMZiDk7LUpq1VgPKOltjqwVmY25KI=\n", "X8Q+CVLEhds=\n")).append(this.f1642)), null).m5536(c1226.m5929());
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m5582() {
        if (this.f1638 == -1) {
            C0623 c0623 = this.f1639;
            if (c0623 == null) {
                this.f1638 = 1;
            } else {
                int m5582 = c0623.m5582();
                C1105 c1105 = this.f1639.f1640;
                this.f1638 = m5582 + (c1105 != null ? c1105.mo5330() : 1) + 1;
            }
        }
        return this.f1638;
    }
}
