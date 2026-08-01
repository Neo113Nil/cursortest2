package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵥ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0990 extends AbstractC0599 {
    static {
        StringFog.decrypt("S/Pf/pMbJydS+93siBE=\n", "PZatjfp0SWQ=\n");
        StringFog.decrypt("0VBUcFH0emPEXE5WTg==\n", "tjUgMT2YKRc=\n");
        StringFog.decrypt("/zzdE9GTxvr/PNEf3Iv39/0q\n", "mFmpUr3/lJ8=\n");
        StringFog.decrypt("Ou79tdR54UAP7u6WxUbzQD7j\n", "XYuJ870LkjQ=\n");
        StringFog.decrypt("B3BWej69AK0Dc2NFJL4mpj13Y0k5qg==\n", "bgMRIFfNQ8I=\n");
        StringFog.decrypt("VIXqJXpe1NVDk84Qfl71xEKJ5y0=\n", "MOCJShcuprA=\n");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static int m5798(ArrayList arrayList) {
        return AbstractC1191.m5913((String) AbstractC0599.m5554(arrayList, 0, String.class), (String) AbstractC0599.m5554(arrayList, 1, String.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m5799(ArrayList arrayList) {
        return AbstractC1191.m5912((String) AbstractC0599.m5554(arrayList, 0, String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m5800(ArrayList arrayList) {
        String str = (String) AbstractC0599.m5554(arrayList, 0, String.class);
        boolean booleanValue = arrayList.size() > 2 ? ((Boolean) AbstractC0599.m5554(arrayList, 2, Boolean.class)).booleanValue() : true;
        if (arrayList.get(1) instanceof String) {
            return AbstractC1191.m5915(str, (String) AbstractC0599.m5554(arrayList, 1, String.class), booleanValue);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC0599.m5554(arrayList, 1, List.class));
        for (int i = 0; i < jSONArray.length(); i++) {
            String m5915 = AbstractC1191.m5915(str, jSONArray.optString(i), booleanValue);
            if (m5915 != null) {
                return m5915;
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m5801(ArrayList arrayList) {
        Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
        List list = (List) AbstractC0599.m5554(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC0599.m5554(arrayList, 2, Integer.class)).intValue();
        C1174 c1174 = C0391.m5393().f502;
        c1174.getClass();
        C1176 c1176 = new C1176();
        C1215 c1215 = new C1215();
        C1227 c1227 = c1215.f3419;
        c1227.f3489 = -1;
        c1227.f3488 = -1;
        c1227.f3487 = -1;
        c1227.f3491 = -1;
        c1215.f3418 = c1176;
        c1215.f3417 = null;
        C1227 c12272 = c1215.f3419;
        c12272.f3495 = list;
        c12272.f3494 = intValue;
        c12272.f3497 = c1176.getClass();
        c1215.f3419.f3496 = null;
        C1211 c1211 = new C1211(c1215);
        c1211.f3410 = true;
        c1174.m5903(m5554, c1211, 0, (C1303) null);
        return new ArrayList(c1211.f3409);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m5802(ArrayList arrayList) {
        String str = (String) AbstractC0599.m5554(arrayList, 0, String.class);
        if (arrayList.get(1) instanceof String) {
            return AbstractC1191.m5911(str, (String) AbstractC0599.m5554(arrayList, 1, String.class), false);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC0599.m5554(arrayList, 1, List.class));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList2.addAll(AbstractC1191.m5911(str, jSONArray.optString(i), false));
        }
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5803(ArrayList arrayList) {
        return AbstractC1191.m5914((String) AbstractC0599.m5554(arrayList, 0, String.class));
    }
}
