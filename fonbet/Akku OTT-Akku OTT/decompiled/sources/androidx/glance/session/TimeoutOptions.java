package androidx.glance.session;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\nJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/glance/session/TimeoutOptions;", "", "initialTimeout", "Lkotlin/time/Duration;", "additionalTime", "idleTimeout", "timeSource", "Landroidx/glance/session/TimeSource;", "(JJJLandroidx/glance/session/TimeSource;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdditionalTime-UwyO8pc", "()J", "J", "getIdleTimeout-UwyO8pc", "getInitialTimeout-UwyO8pc", "getTimeSource", "()Landroidx/glance/session/TimeSource;", "component1", "component1-UwyO8pc", "component2", "component2-UwyO8pc", "component3", "component3-UwyO8pc", "component4", "copy", "copy-2d-g_3Q", "(JJJLandroidx/glance/session/TimeSource;)Landroidx/glance/session/TimeoutOptions;", "equals", "", "other", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TimeoutOptions {
    private final long additionalTime;
    private final long idleTimeout;
    private final long initialTimeout;
    private final TimeSource timeSource;

    public /* synthetic */ TimeoutOptions(long j, long j2, long j3, TimeSource timeSource, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, timeSource);
    }

    /* renamed from: copy-2d-g_3Q$default, reason: not valid java name */
    public static /* synthetic */ TimeoutOptions m1443copy2dg_3Q$default(TimeoutOptions timeoutOptions, long j, long j2, long j3, TimeSource timeSource, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeoutOptions.initialTimeout;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = timeoutOptions.additionalTime;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = timeoutOptions.idleTimeout;
        }
        long j6 = j3;
        if ((i & 8) != 0) {
            timeSource = timeoutOptions.timeSource;
        }
        return timeoutOptions.m1447copy2dg_3Q(j4, j5, j6, timeSource);
    }

    /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getInitialTimeout() {
        return this.initialTimeout;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getAdditionalTime() {
        return this.additionalTime;
    }

    /* renamed from: component3-UwyO8pc, reason: not valid java name and from getter */
    public final long getIdleTimeout() {
        return this.idleTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final TimeSource getTimeSource() {
        return this.timeSource;
    }

    /* renamed from: copy-2d-g_3Q, reason: not valid java name */
    public final TimeoutOptions m1447copy2dg_3Q(long initialTimeout, long additionalTime, long idleTimeout, TimeSource timeSource) {
        return new TimeoutOptions(initialTimeout, additionalTime, idleTimeout, timeSource, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutOptions)) {
            return false;
        }
        TimeoutOptions timeoutOptions = (TimeoutOptions) other;
        return Duration.m3066equalsimpl0(this.initialTimeout, timeoutOptions.initialTimeout) && Duration.m3066equalsimpl0(this.additionalTime, timeoutOptions.additionalTime) && Duration.m3066equalsimpl0(this.idleTimeout, timeoutOptions.idleTimeout) && Intrinsics.areEqual(this.timeSource, timeoutOptions.timeSource);
    }

    /* renamed from: getAdditionalTime-UwyO8pc, reason: not valid java name */
    public final long m1448getAdditionalTimeUwyO8pc() {
        return this.additionalTime;
    }

    /* renamed from: getIdleTimeout-UwyO8pc, reason: not valid java name */
    public final long m1449getIdleTimeoutUwyO8pc() {
        return this.idleTimeout;
    }

    /* renamed from: getInitialTimeout-UwyO8pc, reason: not valid java name */
    public final long m1450getInitialTimeoutUwyO8pc() {
        return this.initialTimeout;
    }

    public final TimeSource getTimeSource() {
        return this.timeSource;
    }

    public int hashCode() {
        return this.timeSource.hashCode() + ((Duration.m3082hashCodeimpl(this.idleTimeout) + ((Duration.m3082hashCodeimpl(this.additionalTime) + (Duration.m3082hashCodeimpl(this.initialTimeout) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) Duration.m3101toStringimpl(this.initialTimeout)) + ", additionalTime=" + ((Object) Duration.m3101toStringimpl(this.additionalTime)) + ", idleTimeout=" + ((Object) Duration.m3101toStringimpl(this.idleTimeout)) + ", timeSource=" + this.timeSource + ')';
    }

    private TimeoutOptions(long j, long j2, long j3, TimeSource timeSource) {
        this.initialTimeout = j;
        this.additionalTime = j2;
        this.idleTimeout = j3;
        this.timeSource = timeSource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TimeoutOptions(long j, long j2, long j3, TimeSource timeSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r4, r2, (i & 8) != 0 ? TimeSource.INSTANCE.getMonotonic() : timeSource, null);
        long j4;
        long j5;
        long j6;
        if ((i & 1) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j4 = DurationKt.toDuration(45, DurationUnit.SECONDS);
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            j5 = DurationKt.toDuration(5, DurationUnit.SECONDS);
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            Duration.Companion companion3 = Duration.INSTANCE;
            j6 = DurationKt.toDuration(5, DurationUnit.SECONDS);
        } else {
            j6 = j3;
        }
    }
}
