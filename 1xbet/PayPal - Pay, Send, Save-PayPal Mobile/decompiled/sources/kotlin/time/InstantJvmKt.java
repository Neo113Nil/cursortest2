package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/time/Instant;", "systemClockNow", "()Lkotlin/time/Instant;", "instant", "", "serializedInstant", "(Lkotlin/time/Instant;)Ljava/lang/Object;", "Lkotlin/time/Clock;", "getHighSpeedVideoSizes", "Lkotlin/time/Clock;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstantJvmKt {
    private static final kotlin.time.Clock getHighSpeedVideoSizes = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.getSystemClock();

    public static final kotlin.time.Instant systemClockNow() {
        return getHighSpeedVideoSizes.now();
    }

    public static final java.lang.Object serializedInstant(kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return new kotlin.time.InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }
}
