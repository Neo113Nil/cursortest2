package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/BroadcastChannel;", "BroadcastChannel", "(I)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/internal/Symbol;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastChannelKt {
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("NO_ELEMENT");

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> BroadcastChannel(int i) {
        if (i == -2) {
            return new kotlinx.coroutines.channels.BroadcastChannelImpl(kotlinx.coroutines.channels.Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i == -1) {
            return new kotlinx.coroutines.channels.ConflatedBroadcastChannel();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i == Integer.MAX_VALUE) {
            throw new java.lang.IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
        return new kotlinx.coroutines.channels.BroadcastChannelImpl(i);
    }
}
