package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.BuildConfig;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class s1 extends i2 {
    private JSONObject i;

    public s1(com.applovin.impl.sdk.l lVar) {
        super(lVar, h2.b.ERROR);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.i = JsonUtils.deserialize((String) this.f4236a.a(c5.K));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ServerSentEventKt.COLON + str2, th, map);
    }

    public void b(final String str, final String str2, final Throwable th) {
        this.f4236a.s0().a((n5) new x6(this.f4236a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.s1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s1.this.a(str, str2, th);
            }
        }), i6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("source", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), hashMap);
            arrayList.add(hashMap);
        }
        a(h2.Z0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("error_message", str2);
        if (bVar != null) {
            hashMap.putAll(j2.a((AppLovinAdImpl) bVar));
            hashMap.putAll(j2.a(bVar));
            boolean D0 = bVar.D0();
            hashMap.put("is_video_stream", String.valueOf(D0));
            if (D0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).l1(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.K(), hashMap);
            }
        }
        d(h2.f1, hashMap);
    }

    public void a(String str, String str2, int i, String str3) {
        List a2 = a(str2);
        boolean z = a2 != null;
        if (z && a2.contains(Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            hashMap.put("error_message", j2.a(str3));
            d(h2.i1, hashMap);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.i, BuildConfig.FLAVOR, null) : integerList;
    }
}
