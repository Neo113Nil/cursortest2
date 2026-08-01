package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.a.b.b;
import com.bykv.vk.openvk.preload.a.d;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: WebResourceUtils.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends d<?, ?>>, b> f4618a = new HashMap();

    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            String str = map.get("content-type");
            String[] strArr = new String[0];
            if (TextUtils.isEmpty(str)) {
                str = map.get("Content-Type");
            }
            if (!TextUtils.isEmpty(str) && str != null) {
                str = str.replace(ServerSentEventKt.SPACE, "");
                strArr = str.split(";");
            }
            String str2 = "";
            String str3 = str2;
            for (String str4 : strArr) {
                if (!TextUtils.isEmpty(str4)) {
                    int indexOf = str4.indexOf(U3.j.b);
                    if (indexOf == -1) {
                        str2 = str4;
                    } else if (str4.contains("charset")) {
                        str3 = str4.substring(indexOf + 1);
                    }
                }
            }
            if (str != null ? str.contains("font/ttf") : false) {
                return new WebResourceResponse(str2, str3, 200, "OK", map, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str2, str3, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Throwable th) {
            Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
            return null;
        }
    }

    public static <T> T a(JSONObject jSONObject, String str, Class<T> cls) {
        Object opt;
        if (jSONObject.has(str) && (opt = jSONObject.opt(str)) != null && opt != JSONObject.NULL) {
            try {
                if (cls != Double.class) {
                    if (cls != Integer.class) {
                        if (cls != Long.class) {
                            if (cls != String.class) {
                                if (cls == Boolean.class && (opt instanceof Boolean)) {
                                    return (T) ((Boolean) opt);
                                }
                            } else {
                                if (opt instanceof String) {
                                    return (T) ((String) opt);
                                }
                                return null;
                            }
                        } else {
                            if (opt instanceof Long) {
                                return (T) ((Long) opt);
                            }
                            if (opt instanceof Number) {
                                return (T) Long.valueOf(((Number) opt).longValue());
                            }
                            return null;
                        }
                    } else {
                        if (opt instanceof Integer) {
                            return (T) ((Integer) opt);
                        }
                        if (opt instanceof Number) {
                            return (T) Integer.valueOf(((Number) opt).intValue());
                        }
                        return null;
                    }
                } else {
                    if (opt instanceof Double) {
                        return (T) ((Double) opt);
                    }
                    if (opt instanceof Number) {
                        return (T) Double.valueOf(((Number) opt).doubleValue());
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.a.b.a aVar) {
        synchronized (this.f4618a) {
            b bVar = this.f4618a.get(cls);
            if (bVar == null) {
                bVar = new b(new com.bykv.vk.openvk.preload.a.b.a[0]);
                this.f4618a.put(cls, bVar);
            }
            bVar.a(aVar);
        }
    }

    public final com.bykv.vk.openvk.preload.a.b.a a(Class<? extends d<?, ?>> cls) {
        b bVar;
        synchronized (this.f4618a) {
            bVar = this.f4618a.get(cls);
        }
        return bVar;
    }
}
