package com.bytedance.sdk.openadsdk.core.gbb.gm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class gm {
    private static boolean oo = false;
    private static SimpleDateFormat pcc;
    private final Map<sf, String> gm;
    private final List<String> sf;

    public gm(List<String> list, of ofVar) {
        int hh;
        this.sf = list;
        HashMap hashMap = new HashMap();
        this.gm = hashMap;
        hashMap.put(sf.CACHEBUSTING, gm());
        hashMap.put(sf.TIMESTAMP, sf());
        hashMap.put(sf.APPBUNDLE, lu.pcc().getPackageName());
        hashMap.put(sf.PLAYERSTATE, "");
        if (ofVar != null && ((hh = ofVar.hh()) == 3 || hh == 7 || hh == 8)) {
            hashMap.put(sf.PLAYERSTATE, "fullscreen");
        }
        hashMap.put(sf.SERVERSIDE, "0");
    }

    private String sf() {
        if (pcc == null) {
            pcc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String format = pcc.format(new Date());
        if (!oo) {
            return format;
        }
        int jsj = kun.jsj();
        if (jsj >= 0) {
            if (jsj < 10) {
                return format + "+0" + jsj;
            }
            return format + Marker.ANY_NON_NULL_MARKER + jsj;
        }
        if (jsj <= -10) {
            return format + jsj;
        }
        return format + "-0" + (-jsj);
    }

    public List<String> pcc() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.sf) {
            if (!TextUtils.isEmpty(str)) {
                for (sf sfVar : sf.values()) {
                    String str2 = this.gm.get(sfVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (sfVar == sf.__MRC_IMPRESSION_ID__) {
                        str = str.replaceAll(sfVar.name(), str2);
                    } else {
                        str = str.replaceAll("\\[" + sfVar.name() + "\\]", str2);
                    }
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public gm pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar) {
        if (pccVar != null) {
            this.gm.put(sf.ERRORCODE, pccVar.pcc());
        }
        return this;
    }

    public gm pcc(long j) {
        if (j >= 0) {
            String sf = sf(j);
            if (!TextUtils.isEmpty(sf)) {
                this.gm.put(sf.CONTENTPLAYHEAD, sf);
            }
        }
        return this;
    }

    public gm pcc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.gm.put(sf.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    public gm sf(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.gm.put(sf.ASSETURI, str);
        }
        return this;
    }

    private String gm() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String sf(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
