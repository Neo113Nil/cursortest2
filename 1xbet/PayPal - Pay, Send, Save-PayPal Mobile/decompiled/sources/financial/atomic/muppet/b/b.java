package financial.atomic.muppet.b;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfinancial/atomic/muppet/b/b;", "T", "Lfinancial/atomic/muppet/bridge/Handler;", "<init>", "()V", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b<T> implements financial.atomic.muppet.bridge.Handler<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final financial.atomic.muppet.b.b.a f6814a = new financial.atomic.muppet.b.b.a(0);

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    @Override // financial.atomic.muppet.bridge.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String invoke(financial.atomic.muppet.bridge.Bridge bridge, final int i, final java.lang.String str, final kotlinx.serialization.json.JsonArray jsonArray) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "");
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.b.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.b.b.$r8$lambda$86bdOt9nTrL21AJzGfKrcPIi49U(i, str, jsonArray);
            }
        };
        financial.atomic.muppet.inter.Browser<T> browser = bridge.getStore().getBrowsers().get(java.lang.Integer.valueOf(i));
        if (browser != null) {
            int hashCode = str.hashCode();
            if (hashCode == 1372649394) {
                if (str.equals("browser.close")) {
                    valueOf = java.lang.Integer.valueOf(bridge.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.e(bridge, i, browser, null)));
                    if (valueOf != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            } else if (hashCode != 1384319358) {
                if (hashCode == 1539654537 && str.equals("browser.newPage")) {
                    valueOf = java.lang.Integer.valueOf(bridge.dispatch(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.b.c(browser, null)));
                    if (valueOf != null) {
                        return valueOf.toString();
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            } else {
                if (str.equals("browser.pages")) {
                    valueOf = java.lang.Integer.valueOf(financial.atomic.muppet.bridge.Bridge.dispatch$default(bridge, null, new financial.atomic.muppet.b.d(browser, null), 1, null));
                    if (valueOf != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            }
        }
        return null;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$86bdOt9nTrL21AJzGfKrcPIi49U(int i, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Browser.invoke ");
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        sb.append(jsonArray);
        return sb.toString();
    }
}
