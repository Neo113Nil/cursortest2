package com.bytedance.sdk.openadsdk.qy;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class pcc {
    private static int pcc(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static List<String> pcc(List<String> list, boolean z) {
        String pcc = hc.pcc(lu.pcc());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(pcc)) {
                next = next.replace("{UID}", pcc).replace("__UID__", pcc);
            }
            if (z) {
                next = pcc(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public static String pcc(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String pcc = hc.pcc(lu.pcc());
        if (str.contains("{TS}") || str.contains("__TS__")) {
            long currentTimeMillis = System.currentTimeMillis();
            str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
        }
        if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(pcc)) {
            str = str.replace("{UID}", pcc).replace("__UID__", pcc);
        }
        return z ? pcc(str) : str;
    }

    private static String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            lo.gm("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> pcc(List<String> list, boolean z, of ofVar) {
        String pcc = hc.pcc(lu.pcc());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(pcc)) {
                next = next.replace("{UID}", pcc).replace("__UID__", pcc);
            }
            if (next.contains("__CID__") && ofVar != null && !TextUtils.isEmpty(ofVar.esn())) {
                next = next.replace("__CID__", ofVar.esn());
            }
            if (next.contains("__CTYPE__") && ofVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(pcc(ofVar.ct())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(kun.oo()));
            }
            if (z) {
                next = pcc(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
