package com.mbridge.msdk.config.component.common.express.operator;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: OperatorUrl.java */
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8945a;

    public t(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8945a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: Exception -> 0x0123, TryCatch #1 {Exception -> 0x0123, blocks: (B:17:0x002e, B:19:0x003a, B:21:0x0043, B:23:0x004f, B:25:0x0058, B:27:0x0064, B:29:0x006d, B:33:0x0081, B:35:0x007d, B:36:0x0086, B:40:0x009a, B:42:0x0096, B:43:0x009f, B:47:0x00b3, B:49:0x00af, B:50:0x00b8, B:52:0x00c4, B:54:0x00cd, B:56:0x00d9, B:58:0x00e2, B:62:0x0119, B:64:0x00f2, B:65:0x011e), top: B:16:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: Exception -> 0x0123, TryCatch #1 {Exception -> 0x0123, blocks: (B:17:0x002e, B:19:0x003a, B:21:0x0043, B:23:0x004f, B:25:0x0058, B:27:0x0064, B:29:0x006d, B:33:0x0081, B:35:0x007d, B:36:0x0086, B:40:0x009a, B:42:0x0096, B:43:0x009f, B:47:0x00b3, B:49:0x00af, B:50:0x00b8, B:52:0x00c4, B:54:0x00cd, B:56:0x00d9, B:58:0x00e2, B:62:0x0119, B:64:0x00f2, B:65:0x011e), top: B:16:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Uri uri;
        if (obj != null && !(obj instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (obj == null) {
            obj = "";
        }
        try {
        } catch (Exception e) {
            q0.b("UrlOperator", e.getMessage());
        }
        try {
            if (!TextUtils.isEmpty(obj.toString())) {
                uri = Uri.parse(obj.toString());
                if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("822"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("823"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("824"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("884"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getHost());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("885"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getScheme());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("825"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getQuery());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("826"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("827"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getScheme() + "://" + uri.getHost() + uri.getPath());
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("822"))) {
            }
        } catch (Exception e2) {
            q0.b("UrlOperator", e2.getMessage(), e2);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        uri = null;
    }

    private Object c(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && list.size() == 2) {
            String valueOf = String.valueOf(list.get(0));
            String valueOf2 = String.valueOf(list.get(1));
            if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2)) {
                Map<String, String> a2 = a(uri);
                a2.put(valueOf, valueOf2);
                buildUpon.clearQuery();
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return buildUpon.build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String valueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(valueOf)) {
                return buildUpon.authority(valueOf).build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    private Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String str : query.split(U3.j.c)) {
                String[] split = str.split(U3.j.b);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("822")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("823")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("824")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("884")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("885")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("825")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("826")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("827")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"));
    }

    private Object b(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String valueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(valueOf)) {
                Map<String, String> a2 = a(uri);
                a2.remove(valueOf.trim());
                buildUpon.clearQuery();
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return buildUpon.build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    private Object b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            String[] split = query.split(U3.j.c);
            if (split.length > 0) {
                return Arrays.asList(split);
            }
        }
        return null;
    }
}
