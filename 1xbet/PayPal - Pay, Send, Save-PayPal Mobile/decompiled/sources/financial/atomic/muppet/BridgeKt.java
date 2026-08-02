package financial.atomic.muppet;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lfinancial/atomic/muppet/inter/Muppet;", "muppet", "Lfinancial/atomic/muppet/inter/Page;", "page", "Lfinancial/atomic/muppet/inter/Browser$Factory;", "factory", "", "inject", "(Lfinancial/atomic/muppet/inter/Muppet;Lfinancial/atomic/muppet/inter/Page;Lfinancial/atomic/muppet/inter/Browser$Factory;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BridgeKt {
    public static final <T> void inject(financial.atomic.muppet.inter.Muppet<T> muppet, financial.atomic.muppet.inter.Page<? extends T> page, financial.atomic.muppet.inter.Browser.Factory<T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muppet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        financial.atomic.muppet.Page page2 = (financial.atomic.muppet.Page) page;
        financial.atomic.muppet.bridge.Bridge<T> bridge = new financial.atomic.muppet.bridge.Bridge<>(page, new financial.atomic.muppet.bridge.Store(null, null, null, null, 15, null));
        financial.atomic.muppet.bridge.Muppet.Companion companion = financial.atomic.muppet.bridge.Muppet.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muppet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        financial.atomic.muppet.bridge.Muppet muppet2 = new financial.atomic.muppet.bridge.Muppet(muppet, factory);
        bridge.register("muppet.launch", muppet2);
        bridge.register("muppet.result", muppet2);
        financial.atomic.muppet.b.b.a aVar = financial.atomic.muppet.b.b.f6814a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "");
        financial.atomic.muppet.b.b bVar = new financial.atomic.muppet.b.b();
        bridge.register("browser.newPage", bVar);
        bridge.register("browser.pages", bVar);
        bridge.register("browser.close", bVar);
        financial.atomic.muppet.bridge.Page.INSTANCE.register(bridge);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new financial.atomic.muppet.a.a(page2, bridge, null), 3, null);
    }
}
