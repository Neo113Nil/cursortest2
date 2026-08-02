package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/atomicfu/locks/ParkingSupport;", "", "<init>", "()V", "Lkotlin/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "park-LRDsOJo", "(J)V", com.google.android.libraries.places.api.model.PlaceTypes.PARK, "Lkotlin/time/TimeMark;", "deadline", "parkUntil", "(Lkotlin/time/TimeMark;)V", "Ljava/lang/Thread;", "Lkotlinx/atomicfu/locks/getHighResolutionOutputSizeshNQ4ISI;", "handle", "unpark", "(Ljava/lang/Thread;)V", "currentThreadHandle", "()Ljava/lang/Thread;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParkingSupport {
    public static final kotlinx.atomicfu.locks.ParkingSupport INSTANCE = new kotlinx.atomicfu.locks.ParkingSupport();

    private ParkingSupport() {
    }

    /* renamed from: park-LRDsOJo, reason: not valid java name */
    public final void m24054parkLRDsOJo(long timeout) {
        if (kotlin.time.Duration.m23947equalsimpl0(timeout, kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc())) {
            java.util.concurrent.locks.LockSupport.park();
        } else {
            java.util.concurrent.locks.LockSupport.parkNanos(kotlin.time.Duration.m23976toLongimpl(timeout, kotlin.time.DurationUnit.NANOSECONDS));
        }
    }

    public final void parkUntil(kotlin.time.TimeMark deadline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deadline, "");
        m24054parkLRDsOJo(kotlin.time.Duration.m23968timesUwyO8pc(deadline.mo23933elapsedNowUwyO8pc(), -1));
    }

    public final void unpark(java.lang.Thread handle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handle, "");
        java.util.concurrent.locks.LockSupport.unpark(handle);
    }

    public final java.lang.Thread currentThreadHandle() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentThread, "");
        return currentThread;
    }
}
