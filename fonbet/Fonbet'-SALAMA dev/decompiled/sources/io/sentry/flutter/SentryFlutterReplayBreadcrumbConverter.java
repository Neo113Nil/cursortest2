package io.sentry.flutter;

import f6.C1111d;
import g6.AbstractC1170s;
import io.sentry.Breadcrumb;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.protocol.Request;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t6.e;
import t6.h;

/* loaded from: classes2.dex */
public final class SentryFlutterReplayBreadcrumbConverter extends DefaultReplayBreadcrumbConverter {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, String> supportedNetworkData = AbstractC1170s.M0(new C1111d(Response.JsonKeys.STATUS_CODE, "statusCode"), new C1111d(Request.JsonKeys.METHOD, Request.JsonKeys.METHOD), new C1111d("response_body_size", "responseBodySize"), new C1111d("request_body_size", "requestBodySize"));

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    private final RRWebEvent convertNetworkBreadcrumb(Breadcrumb breadcrumb) {
        RRWebEvent convert = super.convert(breadcrumb);
        RRWebEvent rRWebEvent = convert;
        if (convert == null) {
            rRWebEvent = convert;
            if (breadcrumb.getData().containsKey("start_timestamp")) {
                rRWebEvent = convert;
                if (breadcrumb.getData().containsKey("end_timestamp")) {
                    RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
                    rRWebSpanEvent.setOp("resource.http");
                    rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
                    Object obj = breadcrumb.getData().get("url");
                    h.c(obj, "null cannot be cast to non-null type kotlin.String");
                    rRWebSpanEvent.setDescription((String) obj);
                    Object obj2 = breadcrumb.getData().get("start_timestamp");
                    h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setStartTimestamp(doubleTimestamp(((Long) obj2).longValue()));
                    Object obj3 = breadcrumb.getData().get("end_timestamp");
                    h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setEndTimestamp(doubleTimestamp(((Long) obj3).longValue()));
                    Map<String, Object> data = breadcrumb.getData();
                    h.d(data, "breadcrumb.data");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : data.entrySet()) {
                        if (supportedNetworkData.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1170s.K0(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(supportedNetworkData.get((String) entry2.getKey()), entry2.getValue());
                    }
                    rRWebSpanEvent.setData(linkedHashMap2);
                    rRWebEvent = rRWebSpanEvent;
                }
            }
        }
        return rRWebEvent;
    }

    private final double doubleTimestamp(long j) {
        return j / 1000.0d;
    }

    private final String getTouchPathMessage(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int min = Math.min(4, list.size());
        while (true) {
            min--;
            if (-1 >= min) {
                return sb.toString();
            }
            Object obj2 = list.get(min);
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("element");
                if (obj3 == null) {
                    obj3 = "?";
                }
                sb.append(obj3);
                Object obj4 = map.get("label");
                if (obj4 == null) {
                    obj4 = map.get("name");
                }
                if ((obj4 instanceof String) && ((CharSequence) obj4).length() > 0) {
                    String str = (String) obj4;
                    if (str.length() > 20) {
                        String substring = str.substring(0, 17);
                        h.d(substring, "substring(...)");
                        obj4 = substring.concat("...");
                    }
                    sb.append("(");
                    sb.append((String) obj4);
                    sb.append(")");
                }
                if (min > 0) {
                    sb.append(" > ");
                }
            }
        }
    }

    private final RRWebBreadcrumbEvent newRRWebBreadcrumb(Breadcrumb breadcrumb) {
        RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
        rRWebBreadcrumbEvent.setCategory(breadcrumb.getCategory());
        rRWebBreadcrumbEvent.setLevel(breadcrumb.getLevel());
        rRWebBreadcrumbEvent.setData(breadcrumb.getData());
        rRWebBreadcrumbEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        Date timestamp = breadcrumb.getTimestamp();
        h.d(timestamp, "breadcrumb.timestamp");
        rRWebBreadcrumbEvent.setBreadcrumbTimestamp(doubleTimestamp(timestamp));
        rRWebBreadcrumbEvent.setBreadcrumbType("default");
        return rRWebBreadcrumbEvent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.android.replay.DefaultReplayBreadcrumbConverter, io.sentry.ReplayBreadcrumbConverter
    public RRWebEvent convert(Breadcrumb breadcrumb) {
        h.e(breadcrumb, RRWebBreadcrumbEvent.EVENT_TAG);
        String category = breadcrumb.getCategory();
        if (category == null) {
            return null;
        }
        switch (category.hashCode()) {
            case -2139323986:
                if (category.equals("ui.click")) {
                    RRWebBreadcrumbEvent newRRWebBreadcrumb = newRRWebBreadcrumb(breadcrumb);
                    newRRWebBreadcrumb.setCategory("ui.tap");
                    newRRWebBreadcrumb.setMessage(getTouchPathMessage(breadcrumb.getData().get("path")));
                    return newRRWebBreadcrumb;
                }
                break;
            case -252308533:
                if (category.equals("sentry.event")) {
                    return null;
                }
                break;
            case -152761521:
                if (category.equals("sentry.transaction")) {
                    return null;
                }
                break;
            case 3213448:
                if (category.equals("http")) {
                    return convertNetworkBreadcrumb(breadcrumb);
                }
                break;
            case 1862666772:
                if (category.equals("navigation")) {
                    if (breadcrumb.getData().containsKey("to") && (breadcrumb.getData().get("to") instanceof String)) {
                        return newRRWebBreadcrumb(breadcrumb);
                    }
                    return null;
                }
                break;
        }
        RRWebEvent convert = super.convert(breadcrumb);
        if ((convert instanceof RRWebBreadcrumbEvent) && h.a(((RRWebBreadcrumbEvent) convert).getCategory(), "navigation")) {
            return null;
        }
        return convert;
    }

    private final double doubleTimestamp(Date date) {
        return doubleTimestamp(date.getTime());
    }
}
