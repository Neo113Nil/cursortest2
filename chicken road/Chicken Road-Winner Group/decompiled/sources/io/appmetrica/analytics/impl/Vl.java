package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Vl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C0425cm f6764a;

    /* renamed from: b, reason: collision with root package name */
    public final C0432d3 f6765b;

    public Vl() {
        this(new C0425cm(), new C0432d3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0554hm handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0711no.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f6765b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C0425cm c0425cm = this.f6764a;
                c0425cm.getClass();
                C0554hm c0554hm = new C0554hm();
                try {
                    c0425cm.f7126h.getClass();
                    C0672mb c0672mb = new C0672mb(new String(responseData, CharEncoding.UTF_8));
                    JSONObject optJSONObject = c0672mb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0554hm.f7443h = str2;
                    c0554hm.f7444i = str;
                    c0425cm.a(c0554hm, c0672mb);
                    c0554hm.f7437a = TextUtils.isEmpty(c0554hm.f7444i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0554hm = new C0554hm();
                    c0554hm.f7437a = 1;
                }
                if (2 == c0554hm.f7437a) {
                    return c0554hm;
                }
            }
        }
        return null;
    }

    public Vl(C0425cm c0425cm, C0432d3 c0432d3) {
        this.f6764a = c0425cm;
        this.f6765b = c0432d3;
    }
}
