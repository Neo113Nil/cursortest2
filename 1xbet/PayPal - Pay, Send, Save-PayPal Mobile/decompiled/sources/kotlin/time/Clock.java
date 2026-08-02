package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/time/Clock;", "", "Lkotlin/time/Instant;", "now", "()Lkotlin/time/Instant;", "Companion", "System"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Clock {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Clock.Companion INSTANCE = kotlin.time.Clock.Companion.getHighSpeedVideoFpsRanges;

    kotlin.time.Instant now();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/time/Clock$System;", "Lkotlin/time/Clock;", "<init>", "()V", "Lkotlin/time/Instant;", "now", "()Lkotlin/time/Instant;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class System implements kotlin.time.Clock {
        public static final kotlin.time.Clock.System INSTANCE = new kotlin.time.Clock.System();

        private System() {
        }

        @Override // kotlin.time.Clock
        public final kotlin.time.Instant now() {
            return kotlin.time.InstantJvmKt.systemClockNow();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/time/Clock$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ kotlin.time.Clock.Companion getHighSpeedVideoFpsRanges = new kotlin.time.Clock.Companion();

        private Companion() {
        }
    }
}
