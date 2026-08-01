package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import io.ktor.sse.ServerSentEventKt;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OperatorMap.java */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8935a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8935a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) ? a() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) ? d(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) ? f(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) ? c(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) ? a(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) ? e(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) ? e(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) ? d(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) ? g(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) ? a(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) ? b(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) ? b(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("898")) ? c(obj) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e) {
            q0.b("MapOperator", "Error handling map operation: " + str + ", " + e.getMessage(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String valueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(valueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(valueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(valueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if ("or".equals(java.lang.String.valueOf(r7.get(0)).trim().toLowerCase()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        Map map;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        String str = (list == null || list.isEmpty()) ? "and" : "or";
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry2 : map.entrySet()) {
            if (!z2) {
                sb.append(ServerSentEventKt.SPACE).append(str).append(ServerSentEventKt.SPACE);
            }
            sb.append((String) entry2.getKey()).append(U3.j.b).append(entry2.getValue());
            z2 = false;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? a(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String valueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(valueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b(valueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(valueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        Map<String, Object> map;
        String valueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(valueOf)) {
            try {
                map = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(valueOf));
            } catch (JSONException e) {
                q0.b("MapOperator", e.getMessage());
                map = null;
            }
            if (map != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String valueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(valueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c(valueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(valueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String str;
        if (list != null && !list.isEmpty()) {
            str = String.valueOf(list.get(0));
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) str)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(str)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Collection<Object> g = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).g();
            if (!g.isEmpty()) {
                arrayList.addAll(g);
            }
        }
        if (obj instanceof Map) {
            Collection values = ((Map) obj).values();
            if (!values.isEmpty()) {
                arrayList.addAll(values);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj) {
        Map map;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject(map).toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj) {
        Map map;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        try {
            StringBuilder sb = new StringBuilder();
            boolean z2 = true;
            for (Map.Entry entry2 : map.entrySet()) {
                if (!z2) {
                    sb.append(U3.j.c);
                }
                sb.append(URLEncoder.encode((String) entry2.getKey(), "UTF-8")).append(U3.j.b).append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                z2 = false;
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
        } catch (Throwable th) {
            q0.b("MapOperator", "Error encoding URL parameters: " + th.getMessage(), th);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Set<String> e = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e();
            if (!e.isEmpty()) {
                arrayList.addAll(e);
            }
        }
        if (obj instanceof Map) {
            Set keySet = ((Map) obj).keySet();
            if (!keySet.isEmpty()) {
                arrayList.addAll(keySet);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).f()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("898"));
    }
}
