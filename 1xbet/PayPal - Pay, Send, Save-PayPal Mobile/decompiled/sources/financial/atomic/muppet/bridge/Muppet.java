package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfinancial/atomic/muppet/bridge/Muppet;", "T", "Lfinancial/atomic/muppet/bridge/Handler;", "Lfinancial/atomic/muppet/inter/Muppet;", "muppet", "Lfinancial/atomic/muppet/inter/Browser$Factory;", "factory", "<init>", "(Lfinancial/atomic/muppet/inter/Muppet;Lfinancial/atomic/muppet/inter/Browser$Factory;)V", "Lfinancial/atomic/muppet/bridge/Bridge;", "bridge", "", "handle", "", "method", "Lkotlinx/serialization/json/JsonArray;", "params", "invoke", "(Lfinancial/atomic/muppet/bridge/Bridge;ILjava/lang/String;Lkotlinx/serialization/json/JsonArray;)Ljava/lang/String;", "a", "Lfinancial/atomic/muppet/inter/Muppet;", util.h.xy.cb.b.f1091, "Lfinancial/atomic/muppet/inter/Browser$Factory;", "Factory", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Muppet<T> implements financial.atomic.muppet.bridge.Handler<T> {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final financial.atomic.muppet.bridge.Muppet.Companion INSTANCE = new financial.atomic.muppet.bridge.Muppet.Companion(0);
    private final financial.atomic.muppet.inter.Muppet<T> Camera2StreamConfigurationMap;
    private final financial.atomic.muppet.inter.Browser.Factory<T> getHighSpeedVideoFpsRanges;

    /* renamed from: financial.atomic.muppet.bridge.Muppet$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public Muppet(financial.atomic.muppet.inter.Muppet<T> muppet, financial.atomic.muppet.inter.Browser.Factory<T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muppet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.Camera2StreamConfigurationMap = muppet;
        this.getHighSpeedVideoFpsRanges = factory;
    }

    @Override // financial.atomic.muppet.bridge.Handler
    public final java.lang.String invoke(final financial.atomic.muppet.bridge.Bridge<T> bridge, final int handle, final java.lang.String method, final kotlinx.serialization.json.JsonArray params) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Muppet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Muppet.m23216$r8$lambda$XyGR8fdO8SCHZDx_eR2ovsGdFQ(financial.atomic.muppet.bridge.Bridge.this, handle, method, params);
            }
        };
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Muppet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Muppet.$r8$lambda$v_P5Xpe5z7oajHdm0md0zKOomtA(financial.atomic.muppet.bridge.Bridge.this, handle, method);
            }
        };
        if (kotlin.jvm.internal.Intrinsics.areEqual(method, "muppet.launch")) {
            num = java.lang.Integer.valueOf(bridge.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.f(this, bridge, null)));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(method, "muppet.result")) {
            int i = kotlinx.serialization.json.JsonElementKt.getInt(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(params.get(0)));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new financial.atomic.muppet.b.g(bridge, i, null), 3, null);
            num = java.lang.Integer.valueOf(i);
        } else {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    /* renamed from: $r8$lambda$XyGR8fdO-8SCHZDx_eR2ovsGdFQ, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23216$r8$lambda$XyGR8fdO8SCHZDx_eR2ovsGdFQ(financial.atomic.muppet.bridge.Bridge bridge, int i, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MuppetBridge.invoke: ");
        sb.append(bridge);
        sb.append(' ');
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        sb.append(jsonArray);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$v_P5Xpe5z7oajHdm0md0zKOomtA(financial.atomic.muppet.bridge.Bridge bridge, int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MuppetBridge.invoke: ");
        sb.append(bridge);
        sb.append(' ');
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }
}
