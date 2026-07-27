package z3;

import L3.j;
import X2.l;
import X2.q;
import X2.s;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579d implements InterfaceC1577b {

    /* renamed from: i, reason: collision with root package name */
    public static final V2.e f12467i = V2.e.a(Q2.b.f2476a, WebViewManager.EVENT_TYPE_KEY);

    /* renamed from: j, reason: collision with root package name */
    public static final V2.e f12468j = V2.e.a(Q2.b.f2477b, "success");

    /* renamed from: a, reason: collision with root package name */
    public final D3.h f12469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12471c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f12472d;

    /* renamed from: e, reason: collision with root package name */
    public final Q2.a f12473e;

    /* renamed from: f, reason: collision with root package name */
    public final Q2.a f12474f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f12475g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f12476h;

    public C1579d(D3.h hVar, L3.l lVar) {
        String str;
        String str2;
        String str3;
        this.f12469a = hVar;
        switch (lVar) {
            case OTLP_GRPC_SPAN_EXPORTER:
            case OTLP_HTTP_SPAN_EXPORTER:
            case OTLP_HTTP_JSON_SPAN_EXPORTER:
            case OTLP_GRPC_LOG_EXPORTER:
            case OTLP_HTTP_LOG_EXPORTER:
            case OTLP_HTTP_JSON_LOG_EXPORTER:
            case OTLP_GRPC_METRIC_EXPORTER:
            case OTLP_HTTP_METRIC_EXPORTER:
            case OTLP_HTTP_JSON_METRIC_EXPORTER:
                str = "otlp";
                break;
            case ZIPKIN_HTTP_SPAN_EXPORTER:
            case ZIPKIN_HTTP_JSON_SPAN_EXPORTER:
                str = "zipkin";
                break;
            case OTLP_GRPC_PROFILES_EXPORTER:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f12470b = str;
        switch (lVar) {
            case OTLP_GRPC_SPAN_EXPORTER:
            case OTLP_GRPC_LOG_EXPORTER:
            case OTLP_GRPC_METRIC_EXPORTER:
                str2 = "grpc";
                break;
            case OTLP_HTTP_SPAN_EXPORTER:
            case OTLP_HTTP_LOG_EXPORTER:
            case OTLP_HTTP_METRIC_EXPORTER:
            case ZIPKIN_HTTP_SPAN_EXPORTER:
                str2 = "http";
                break;
            case OTLP_HTTP_JSON_SPAN_EXPORTER:
            case OTLP_HTTP_JSON_LOG_EXPORTER:
            case OTLP_HTTP_JSON_METRIC_EXPORTER:
            case ZIPKIN_HTTP_JSON_SPAN_EXPORTER:
                str2 = "http-json";
                break;
            case OTLP_GRPC_PROFILES_EXPORTER:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + lVar);
        }
        this.f12471c = str2;
        j jVar = new j(1);
        int i2 = lVar.f1513b;
        int b6 = O.j.b(i2);
        if (b6 == 0) {
            str3 = "span";
        } else if (b6 == 1) {
            str3 = "metric";
        } else {
            if (b6 != 2) {
                if (b6 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        jVar.e(f12467i, str3);
        Q2.a b7 = jVar.b();
        this.f12472d = b7;
        j e3 = b7.e();
        Boolean bool = Boolean.TRUE;
        V2.e eVar = f12468j;
        e3.e(eVar, bool);
        this.f12473e = e3.b();
        j e6 = b7.e();
        e6.e(eVar, Boolean.FALSE);
        this.f12474f = e6.b();
    }

    @Override // z3.InterfaceC1577b
    public final AbstractC1576a a(int i2) {
        return new C1578c(this, i2);
    }

    public final l b() {
        l lVar = this.f12476h;
        if (lVar != null && !C1583h.e(lVar)) {
            return lVar;
        }
        l build = c().d(this.f12470b + ".exporter.exported").build();
        this.f12476h = build;
        return build;
    }

    public final q c() {
        s sVar = (s) this.f12469a.get();
        if (sVar == null) {
            sVar = X2.h.f3518a;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f12470b + "-" + this.f12471c).build();
    }
}
