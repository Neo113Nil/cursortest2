package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0011J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "Lio/ktor/network/selector/Selectable;", "selectable", "", "notifyClosed", "(Lio/ktor/network/selector/Selectable;)V", "Lio/ktor/network/selector/SelectInterest;", "interest", "select", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/spi/SelectorProvider;", "getProvider", "()Ljava/nio/channels/spi/SelectorProvider;", "provider", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectorManager extends kotlinx.coroutines.CoroutineScope, java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.selector.SelectorManager.Companion INSTANCE = io.ktor.network.selector.SelectorManager.Companion.getHighSpeedVideoFpsRanges;

    java.nio.channels.spi.SelectorProvider getProvider();

    void notifyClosed(io.ktor.network.selector.Selectable selectable);

    java.lang.Object select(io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectInterest selectInterest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/network/selector/SelectorManager$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ io.ktor.network.selector.SelectorManager.Companion getHighSpeedVideoFpsRanges = new io.ktor.network.selector.SelectorManager.Companion();

        private Companion() {
        }
    }
}
