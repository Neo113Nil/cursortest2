package io.sentry.android.replay;

import C6.f;
import C6.g;
import C6.o;
import Y4.D;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.EnumC1110c;
import f6.InterfaceC1109b;
import io.sentry.Breadcrumb;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.SentryLevel;
import io.sentry.SpanDataConvention;
import io.sentry.protocol.Device;
import io.sentry.protocol.Request;
import io.sentry.protocol.Response;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class DefaultReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final InterfaceC1109b snakecasePattern$delegate;
    private static final HashSet<String> supportedNetworkData;
    private String lastConnectivityState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g getSnakecasePattern() {
            return (g) DefaultReplayBreadcrumbConverter.snakecasePattern$delegate.getValue();
        }

        private Companion() {
        }
    }

    static {
        EnumC1110c[] enumC1110cArr = EnumC1110c.f12999a;
        snakecasePattern$delegate = D.B(DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2.INSTANCE);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(Response.JsonKeys.STATUS_CODE);
        hashSet.add(Request.JsonKeys.METHOD);
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(SpanDataConvention.HTTP_RESPONSE_CONTENT_LENGTH_KEY);
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    private final boolean isValidForRRWebSpan(Breadcrumb breadcrumb) {
        Object obj = breadcrumb.getData().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() != 0) {
            Map<String, Object> data = breadcrumb.getData();
            h.d(data, "data");
            if (data.containsKey(SpanDataConvention.HTTP_START_TIMESTAMP)) {
                Map<String, Object> data2 = breadcrumb.getData();
                h.d(data2, "data");
                if (data2.containsKey(SpanDataConvention.HTTP_END_TIMESTAMP)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String snakeToCamelCase(String str) {
        g snakecasePattern = Companion.getSnakecasePattern();
        DefaultReplayBreadcrumbConverter$snakeToCamelCase$1 defaultReplayBreadcrumbConverter$snakeToCamelCase$1 = DefaultReplayBreadcrumbConverter$snakeToCamelCase$1.INSTANCE;
        snakecasePattern.getClass();
        h.e(str, "input");
        h.e(defaultReplayBreadcrumbConverter$snakeToCamelCase$1, "transform");
        Matcher matcher = snakecasePattern.f1599a.matcher(str);
        h.d(matcher, "matcher(...)");
        f fVar = !matcher.find(0) ? null : new f(matcher, str);
        if (fVar == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i7 = 0;
        do {
            Matcher matcher2 = fVar.f1597a;
            sb.append((CharSequence) str, i7, q2.g.e(matcher2.start(), matcher2.end()).f18534a);
            sb.append((CharSequence) defaultReplayBreadcrumbConverter$snakeToCamelCase$1.invoke((Object) fVar));
            i7 = q2.g.e(matcher2.start(), matcher2.end()).f18535b + 1;
            int end = matcher2.end() + (matcher2.end() != matcher2.start() ? 0 : 1);
            String str2 = fVar.f1598b;
            if (end <= str2.length()) {
                Matcher matcher3 = matcher2.pattern().matcher(str2);
                h.d(matcher3, "matcher(...)");
                fVar = !matcher3.find(end) ? null : new f(matcher3, str2);
            } else {
                fVar = null;
            }
            if (i7 >= length) {
                break;
            }
        } while (fVar != null);
        if (i7 < length) {
            sb.append((CharSequence) str, i7, length);
        }
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }

    private final RRWebSpanEvent toRRWebSpanEvent(Breadcrumb breadcrumb) {
        double longValue;
        double longValue2;
        Object obj = breadcrumb.getData().get(SpanDataConvention.HTTP_START_TIMESTAMP);
        Object obj2 = breadcrumb.getData().get(SpanDataConvention.HTTP_END_TIMESTAMP);
        RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
        rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        rRWebSpanEvent.setOp("resource.http");
        Object obj3 = breadcrumb.getData().get("url");
        h.c(obj3, "null cannot be cast to non-null type kotlin.String");
        rRWebSpanEvent.setDescription((String) obj3);
        if (obj instanceof Double) {
            longValue = ((Number) obj).doubleValue();
        } else {
            h.c(obj, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((Long) obj).longValue();
        }
        rRWebSpanEvent.setStartTimestamp(longValue / 1000.0d);
        if (obj2 instanceof Double) {
            longValue2 = ((Number) obj2).doubleValue();
        } else {
            h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            longValue2 = ((Long) obj2).longValue();
        }
        rRWebSpanEvent.setEndTimestamp(longValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> data = breadcrumb.getData();
        h.d(data, "breadcrumb.data");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                h.d(key, "key");
                String y02 = o.y0(key, "content_length", "body_size");
                linkedHashMap.put(snakeToCamelCase(o.C0(y02, ".", y02)), value);
            }
        }
        rRWebSpanEvent.setData(linkedHashMap);
        return rRWebSpanEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    @Override // io.sentry.ReplayBreadcrumbConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RRWebEvent convert(Breadcrumb breadcrumb) {
        String message;
        SentryLevel level;
        Object obj;
        String str;
        h.e(breadcrumb, RRWebBreadcrumbEvent.EVENT_TAG);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (h.a(breadcrumb.getCategory(), "http")) {
            if (isValidForRRWebSpan(breadcrumb)) {
                return toRRWebSpanEvent(breadcrumb);
            }
            return null;
        }
        String str2 = "navigation";
        if (h.a(breadcrumb.getType(), "navigation") && h.a(breadcrumb.getCategory(), "app.lifecycle")) {
            str2 = "app." + breadcrumb.getData().get(SentryThread.JsonKeys.STATE);
        } else if (h.a(breadcrumb.getType(), "navigation") && h.a(breadcrumb.getCategory(), "device.orientation")) {
            str2 = breadcrumb.getCategory();
            h.b(str2);
            Object obj2 = breadcrumb.getData().get("position");
            if (!h.a(obj2, "landscape") && !h.a(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!h.a(breadcrumb.getType(), "navigation")) {
                if (h.a(breadcrumb.getCategory(), "ui.click")) {
                    Object obj3 = breadcrumb.getData().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.getData().get("view.tag")) == null) {
                        obj3 = breadcrumb.getData().get("view.class");
                    }
                    message = obj3 instanceof String ? (String) obj3 : null;
                    if (message == null) {
                        return null;
                    }
                    Map<String, Object> data = breadcrumb.getData();
                    h.d(data, "breadcrumb.data");
                    linkedHashMap.putAll(data);
                    str2 = "ui.tap";
                    level = null;
                } else if (h.a(breadcrumb.getType(), "system") && h.a(breadcrumb.getCategory(), "network.event")) {
                    if (!h.a(breadcrumb.getData().get("action"), "NETWORK_LOST")) {
                        Map<String, Object> data2 = breadcrumb.getData();
                        h.d(data2, "breadcrumb.data");
                        if (data2.containsKey("network_type")) {
                            Object obj4 = breadcrumb.getData().get("network_type");
                            String str3 = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str3 == null || str3.length() == 0) ? "offline" : breadcrumb.getData().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put(SentryThread.JsonKeys.STATE, obj);
                    if (h.a(this.lastConnectivityState, linkedHashMap.get(SentryThread.JsonKeys.STATE))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get(SentryThread.JsonKeys.STATE);
                    this.lastConnectivityState = obj5 instanceof String ? (String) obj5 : null;
                    str2 = "device.connectivity";
                } else if (h.a(breadcrumb.getData().get("action"), "BATTERY_CHANGED")) {
                    Map<String, Object> data3 = breadcrumb.getData();
                    h.d(data3, "breadcrumb.data");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : data3.entrySet()) {
                        String key = entry.getKey();
                        if (h.a(key, "level") || h.a(key, Device.JsonKeys.CHARGING)) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    str2 = "device.battery";
                } else {
                    str2 = breadcrumb.getCategory();
                    message = breadcrumb.getMessage();
                    level = breadcrumb.getLevel();
                    Map<String, Object> data4 = breadcrumb.getData();
                    h.d(data4, "breadcrumb.data");
                    linkedHashMap.putAll(data4);
                }
                if (str2 == null && str2.length() != 0) {
                    RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
                    rRWebBreadcrumbEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
                    rRWebBreadcrumbEvent.setBreadcrumbTimestamp(breadcrumb.getTimestamp().getTime() / 1000.0d);
                    rRWebBreadcrumbEvent.setBreadcrumbType("default");
                    rRWebBreadcrumbEvent.setCategory(str2);
                    rRWebBreadcrumbEvent.setMessage(message);
                    rRWebBreadcrumbEvent.setLevel(level);
                    rRWebBreadcrumbEvent.setData(linkedHashMap);
                    return rRWebBreadcrumbEvent;
                }
            }
            if (h.a(breadcrumb.getData().get(SentryThread.JsonKeys.STATE), "resumed")) {
                Object obj6 = breadcrumb.getData().get("screen");
                String str4 = obj6 instanceof String ? (String) obj6 : null;
                if (str4 != null) {
                    str = o.D0(str4, str4);
                    if (str != null) {
                        return null;
                    }
                    linkedHashMap.put("to", str);
                }
                str = null;
                if (str != null) {
                }
            } else {
                Map<String, Object> data5 = breadcrumb.getData();
                h.d(data5, "breadcrumb.data");
                if (data5.containsKey("to")) {
                    Object obj7 = breadcrumb.getData().get("to");
                    if (obj7 instanceof String) {
                        str = (String) obj7;
                        if (str != null) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }
        message = null;
        level = null;
        return str2 == null ? null : null;
    }
}
