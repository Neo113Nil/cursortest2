package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/atomicfu/locks/ThreadParker;", "", "<init>", "()V", "", com.google.android.libraries.places.api.model.PlaceTypes.PARK, "", "nanos", "parkNanos", "(J)V", "Lkotlin/Function1;", "Ljava/lang/Thread;", "Lkotlinx/atomicfu/locks/Camera2StreamConfigurationMap;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;)V", "unpark", "Lkotlinx/atomicfu/locks/ParkingDelegator;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/locks/ParkingDelegator;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/atomicfu/locks/ParkingState;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicRef;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ThreadParker {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.locks.ParkingDelegator getHighSpeedVideoFpsRanges = kotlinx.atomicfu.locks.ParkingDelegator.INSTANCE;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<kotlinx.atomicfu.locks.ParkingState> getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(kotlinx.atomicfu.locks.Free.INSTANCE);

    public final void park() {
        getHighResolutionOutputSizeshNQ4ISI(new kotlin.jvm.functions.Function1() { // from class: kotlinx.atomicfu.locks.ThreadParker$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.atomicfu.locks.ThreadParker.$r8$lambda$4MeFkQPbXYfPb2Gw4gYdmsVM4P8(kotlinx.atomicfu.locks.ThreadParker.this, (java.lang.Thread) obj);
            }
        });
    }

    public final void parkNanos(final long nanos) {
        final long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        getHighResolutionOutputSizeshNQ4ISI(new kotlin.jvm.functions.Function1() { // from class: kotlinx.atomicfu.locks.ThreadParker$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.atomicfu.locks.ThreadParker.$r8$lambda$O4iqVsqSINIBZOoOOHhywvKhoxk(nanos, m24028markNowz9LOYto, this, (java.lang.Thread) obj);
            }
        });
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super java.lang.Thread, kotlin.Unit> p0) {
        while (true) {
            kotlinx.atomicfu.locks.ParkingState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                java.lang.Thread createRef = this.getHighSpeedVideoFpsRanges.createRef();
                if (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(kotlinx.atomicfu.locks.Free.INSTANCE, new kotlinx.atomicfu.locks.Parked(createRef))) {
                    this.getHighSpeedVideoFpsRanges.destroyRef(createRef);
                } else {
                    p0.invoke(createRef);
                    while (true) {
                        kotlinx.atomicfu.locks.ParkingState value2 = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                        if (value2 instanceof kotlinx.atomicfu.locks.Parked) {
                            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(value2, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                                this.getHighSpeedVideoFpsRanges.destroyRef(createRef);
                                return;
                            }
                        } else {
                            if (!(value2 instanceof kotlinx.atomicfu.locks.Unparking)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(value2, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                                    this.getHighSpeedVideoFpsRanges.destroyRef(createRef);
                                    return;
                                } else {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(value2, kotlinx.atomicfu.locks.Unparked.INSTANCE)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    this.getHighSpeedVideoFpsRanges.destroyRef(createRef);
                                    return;
                                }
                            }
                            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(value2, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                                return;
                            }
                        }
                    }
                }
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, kotlinx.atomicfu.locks.Unparked.INSTANCE)) {
                    if (value instanceof kotlinx.atomicfu.locks.Parked) {
                        throw new java.lang.IllegalStateException("Thread should not be able to call park when it is already parked");
                    }
                    if (!(value instanceof kotlinx.atomicfu.locks.Unparking)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    throw new java.lang.IllegalStateException("Thread should not be able to call park when it is already parked");
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(kotlinx.atomicfu.locks.Unparked.INSTANCE, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                    return;
                }
            }
        }
    }

    public final void unpark() {
        kotlinx.atomicfu.locks.Unparking unparking = new kotlinx.atomicfu.locks.Unparking();
        while (true) {
            kotlinx.atomicfu.locks.ParkingState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, kotlinx.atomicfu.locks.Unparked.INSTANCE) || (value instanceof kotlinx.atomicfu.locks.Unparking)) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(kotlinx.atomicfu.locks.Free.INSTANCE, kotlinx.atomicfu.locks.Unparked.INSTANCE)) {
                    return;
                }
            } else {
                if (!(value instanceof kotlinx.atomicfu.locks.Parked)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(value, unparking)) {
                    kotlinx.atomicfu.locks.Parked parked = (kotlinx.atomicfu.locks.Parked) value;
                    this.getHighSpeedVideoFpsRanges.wake(parked.getHighResolutionOutputSizeshNQ4ISI);
                    if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(unparking, kotlinx.atomicfu.locks.Free.INSTANCE)) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRanges.destroyRef(parked.getHighResolutionOutputSizeshNQ4ISI);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4MeFkQPbXYfPb2Gw4gYdmsVM4P8(final kotlinx.atomicfu.locks.ThreadParker threadParker, java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "");
        threadParker.getHighSpeedVideoFpsRanges.wait(thread, new kotlin.jvm.functions.Function0() { // from class: kotlinx.atomicfu.locks.ThreadParker$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(kotlinx.atomicfu.locks.ThreadParker.$r8$lambda$rFYnLwtBEySKL562GKUExYIWGYk(kotlinx.atomicfu.locks.ThreadParker.this));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O4iqVsqSINIBZOoOOHhywvKhoxk(long j, long j2, final kotlinx.atomicfu.locks.ThreadParker threadParker, java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "");
        long m23976toLongimpl = j - kotlin.time.Duration.m23976toLongimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(j2), kotlin.time.DurationUnit.NANOSECONDS);
        if (m23976toLongimpl > 0) {
            threadParker.getHighSpeedVideoFpsRanges.timedWait(thread, m23976toLongimpl, new kotlin.jvm.functions.Function0() { // from class: kotlinx.atomicfu.locks.ThreadParker$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(kotlinx.atomicfu.locks.ThreadParker.$r8$lambda$yhX0HtDKpcw4AQ1F9eC32Q5wG_I(kotlinx.atomicfu.locks.ThreadParker.this));
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$rFYnLwtBEySKL562GKUExYIWGYk(kotlinx.atomicfu.locks.ThreadParker threadParker) {
        return threadParker.getHighResolutionOutputSizeshNQ4ISI.getValue() instanceof kotlinx.atomicfu.locks.Parked;
    }

    public static /* synthetic */ boolean $r8$lambda$yhX0HtDKpcw4AQ1F9eC32Q5wG_I(kotlinx.atomicfu.locks.ThreadParker threadParker) {
        return threadParker.getHighResolutionOutputSizeshNQ4ISI.getValue() instanceof kotlinx.atomicfu.locks.Parked;
    }
}
