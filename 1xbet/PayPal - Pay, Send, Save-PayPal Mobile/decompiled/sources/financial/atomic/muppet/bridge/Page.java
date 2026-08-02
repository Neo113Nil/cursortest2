package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lfinancial/atomic/muppet/bridge/Page;", "T", "Lfinancial/atomic/muppet/bridge/Handler;", "Lfinancial/atomic/muppet/bridge/Bridge;", "bridge", "<init>", "(Lfinancial/atomic/muppet/bridge/Bridge;)V", "Lfinancial/atomic/muppet/inter/Page;", "page", "Lkotlinx/serialization/json/JsonArray;", "params", "", "goto", "(Lfinancial/atomic/muppet/inter/Page;Lkotlinx/serialization/json/JsonArray;)I", "handle", "", "method", "invoke", "(Lfinancial/atomic/muppet/bridge/Bridge;ILjava/lang/String;Lkotlinx/serialization/json/JsonArray;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lfinancial/atomic/muppet/bridge/Bridge;", "Camera2StreamConfigurationMap", "", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Page<T> implements financial.atomic.muppet.bridge.Handler<T> {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final financial.atomic.muppet.bridge.Page.Companion INSTANCE = new financial.atomic.muppet.bridge.Page.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final financial.atomic.muppet.bridge.Bridge<T> Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lfinancial/atomic/muppet/bridge/Page$Factory;", "", "<init>", "()V", "T", "Lfinancial/atomic/muppet/bridge/Bridge;", "bridge", "Lfinancial/atomic/muppet/bridge/Page;", "register", "(Lfinancial/atomic/muppet/bridge/Bridge;)Lfinancial/atomic/muppet/bridge/Page;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: financial.atomic.muppet.bridge.Page$Factory, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> financial.atomic.muppet.bridge.Page<T> register(financial.atomic.muppet.bridge.Bridge<T> bridge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
            financial.atomic.muppet.bridge.Page<T> page = new financial.atomic.muppet.bridge.Page<>(bridge);
            bridge.register("page.close", page);
            bridge.register("page.evaluate", page);
            bridge.register("page.goto", page);
            bridge.register("page.progress", page);
            bridge.register("page.hide", page);
            bridge.register("page.request", page);
            bridge.register("page.screenshot", page);
            bridge.register("page.setUserAgent", page);
            bridge.register("page.show", page);
            bridge.register("page.url", page);
            bridge.register("page.on", page);
            bridge.register("page.off", page);
            bridge.register("page.addUserScript", page);
            bridge.register("page.cookies", page);
            bridge.register("page.setCookie", page);
            return page;
        }

        private Companion() {
        }
    }

    public Page(financial.atomic.muppet.bridge.Bridge<T> bridge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        this.Camera2StreamConfigurationMap = bridge;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    }

    /* renamed from: goto, reason: not valid java name */
    private final int m23218goto(financial.atomic.muppet.inter.Page<? extends T> page, kotlinx.serialization.json.JsonArray params) {
        return financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.m(page, null, params), 1, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // financial.atomic.muppet.bridge.Handler
    public final java.lang.String invoke(final financial.atomic.muppet.bridge.Bridge<T> bridge, final int handle, final java.lang.String method, final kotlinx.serialization.json.JsonArray params) {
        T t;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Page$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Page.$r8$lambda$ylwvnb9W_Vp2uWZfT1twYVifAto(financial.atomic.muppet.bridge.Bridge.this, handle, method, params);
            }
        };
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Page$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Page.$r8$lambda$Znd_dnn9vWYw2sS1Tbt7OXmJEkg(financial.atomic.muppet.bridge.Bridge.this, handle, method);
            }
        };
        java.util.Iterator<financial.atomic.muppet.inter.Browser<T>> it = bridge.getStore().getBrowsers().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Iterator<T> it2 = it.next().pages().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (((financial.atomic.muppet.inter.Page) t).hashCode() == handle) {
                    break;
                }
            }
            final financial.atomic.muppet.inter.Page<? extends T> page = (financial.atomic.muppet.inter.Page) t;
            if (page != null) {
                financial.atomic.muppet.g.a aVar2 = financial.atomic.muppet.g.f6869a;
                new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Page$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.lang.String concat;
                        concat = "Page.invoke: ".concat(java.lang.String.valueOf(financial.atomic.muppet.inter.Page.this));
                        return concat;
                    }
                };
                switch (method.hashCode()) {
                    case -1927585243:
                        if (method.equals("page.screenshot")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.t(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case -1166828840:
                        if (method.equals("page.addUserScript")) {
                            obj = java.lang.String.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.h(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case -803595874:
                        if (method.equals("page.on")) {
                            obj = java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.q(params, this, page, null)));
                            break;
                        }
                        obj = null;
                        break;
                    case -199200569:
                        if (method.equals("page.setCookie")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.u(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case -180305236:
                        if (method.equals("page.progress")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.r(page, null), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case 211994073:
                        if (method.equals("page.close")) {
                            obj = java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.i(this, page, null)));
                            break;
                        }
                        obj = null;
                        break;
                    case 838244706:
                        if (method.equals("page.goto")) {
                            obj = java.lang.Integer.valueOf(m23218goto(page, params));
                            break;
                        }
                        obj = null;
                        break;
                    case 838268225:
                        if (method.equals("page.hide")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.n(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case 838595324:
                        if (method.equals("page.show")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.w(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case 858331536:
                        if (method.equals("page.off")) {
                            obj = java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.o(params, this, page, null)));
                            break;
                        }
                        obj = null;
                        break;
                    case 858337680:
                        if (method.equals("page.url")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.x(page, null), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case 982560024:
                        if (method.equals("page.evaluate")) {
                            obj = java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.l(page, null, params)));
                            break;
                        }
                        obj = null;
                        break;
                    case 1346037943:
                        if (method.equals("page.setUserAgent")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.v(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    case 1948497456:
                        if (method.equals("page.cookies")) {
                            java.lang.String contentOrNull = kotlinx.serialization.json.JsonElementKt.getContentOrNull(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(params.get(0)));
                            if (contentOrNull != null) {
                                obj = java.lang.String.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.j(page, contentOrNull, null), 1, null));
                                break;
                            } else {
                                obj = java.lang.String.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.k(null), 1, null));
                                break;
                            }
                        }
                        obj = null;
                        break;
                    case 2092000816:
                        if (method.equals("page.request")) {
                            obj = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(this.Camera2StreamConfigurationMap, null, new financial.atomic.muppet.b.s(page, null, params), 1, null));
                            break;
                        }
                        obj = null;
                        break;
                    default:
                        obj = null;
                        break;
                }
                if (obj != null) {
                    return obj.toString();
                }
            }
        }
        return null;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Znd_dnn9vWYw2sS1Tbt7OXmJEkg(financial.atomic.muppet.bridge.Bridge bridge, int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Page.invoke: ");
        sb.append(bridge);
        sb.append(' ');
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ylwvnb9W_Vp2uWZfT1twYVifAto(financial.atomic.muppet.bridge.Bridge bridge, int i, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Page.invoke: ");
        sb.append(bridge);
        sb.append(' ');
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        sb.append(jsonArray);
        return sb.toString();
    }
}
