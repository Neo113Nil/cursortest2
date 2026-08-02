package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00060\u0003j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/runtime/internal/AwaiterQueue;", "Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;", "A", "", "<init>", "()V", "awaiter", "Lkotlin/Function0;", "", "onFirstAwaiter", "Landroidx/compose/runtime/CancellationHandle;", "addAwaiter", "(Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "Lkotlin/Function1;", "resume", "flushAndDispatchAwaiters", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "fail", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/lang/Throwable;", "Landroidx/compose/runtime/internal/AtomicAwaitersCount;", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoFpsRanges", "", "getHasAwaiters", "()Z", "hasAwaiters", "Awaiter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AwaiterQueue<A extends androidx.compose.runtime.internal.AwaiterQueue.Awaiter> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.AtomicAwaitersCount.getHighSpeedVideoSizes();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableObjectList<A> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.collection.MutableObjectList<A> getHighSpeedVideoFpsRanges;
    private java.lang.Throwable getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;", "", "<init>", "()V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "", "exception", "resumeWithException", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Awaiter {
        public static final int $stable = 0;

        public abstract void cancel();

        public abstract void resumeWithException(java.lang.Throwable exception);
    }

    public AwaiterQueue() {
        int i = 0;
        int i2 = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.getHighSpeedVideoFpsRanges = new androidx.collection.MutableObjectList<>(i, i2, defaultConstructorMarker);
        this.Camera2StreamConfigurationMap = new androidx.collection.MutableObjectList<>(i, i2, defaultConstructorMarker);
    }

    public final boolean getHasAwaiters() {
        return (this.getHighSpeedVideoFpsRangesFor.get() & 134217727) > 0;
    }

    public final androidx.compose.runtime.CancellationHandle addAwaiter(final A awaiter, kotlin.jvm.functions.Function0<kotlin.Unit> onFirstAwaiter) {
        int i;
        int i2;
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = -1;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                awaiter.resumeWithException(th);
                return androidx.compose.runtime.CancellationHandle.INSTANCE.getEmpty$runtime();
            }
            androidx.compose.runtime.internal.AtomicInt atomicInt = this.getHighSpeedVideoFpsRangesFor;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            intRef.element = (i2 >>> 27) & 15;
            this.getHighSpeedVideoFpsRanges.add(awaiter);
            if (z && onFirstAwaiter != null) {
                try {
                    onFirstAwaiter.invoke();
                } catch (java.lang.Throwable th2) {
                    fail(th2);
                }
            }
            return new androidx.compose.runtime.OneShotCancellationHandle(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.internal.AwaiterQueue$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.internal.AwaiterQueue.m5430$r8$lambda$Kgi8oW_1artQjzUw4_DwDGeFgE(androidx.compose.runtime.internal.AwaiterQueue.Awaiter.this, this, intRef);
                }
            });
        }
    }

    public final void flushAndDispatchAwaiters(kotlin.jvm.functions.Function1<? super A, kotlin.Unit> resume) {
        int i;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.collection.MutableObjectList<A> mutableObjectList = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = mutableObjectList;
            androidx.compose.runtime.internal.AtomicInt atomicInt = this.getHighSpeedVideoFpsRangesFor;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, androidx.compose.runtime.internal.AtomicAwaitersCount.getHighSpeedVideoSizes(((i >>> 27) & 15) + 1)));
            int size = mutableObjectList.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                resume.invoke(mutableObjectList.get(i2));
            }
            mutableObjectList.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void fail(java.lang.Throwable cause) {
        int i;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoSizes != null) {
                return;
            }
            this.getHighSpeedVideoSizes = cause;
            androidx.collection.MutableObjectList<A> mutableObjectList = this.getHighSpeedVideoFpsRanges;
            java.lang.Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((androidx.compose.runtime.internal.AwaiterQueue.Awaiter) objArr[i3]).resumeWithException(cause);
            }
            this.getHighSpeedVideoFpsRanges.clear();
            androidx.compose.runtime.internal.AtomicInt atomicInt = this.getHighSpeedVideoFpsRangesFor;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, androidx.compose.runtime.internal.AtomicAwaitersCount.getHighSpeedVideoSizes(((i >>> 27) & 15) + 1)));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: $r8$lambda$Kgi8oW_1artQjzUw4_D-wDGeFgE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m5430$r8$lambda$Kgi8oW_1artQjzUw4_DwDGeFgE(androidx.compose.runtime.internal.AwaiterQueue.Awaiter awaiter, androidx.compose.runtime.internal.AwaiterQueue awaiterQueue, kotlin.jvm.internal.Ref.IntRef intRef) {
        int i;
        awaiter.cancel();
        androidx.compose.runtime.internal.AtomicInt atomicInt = awaiterQueue.getHighSpeedVideoFpsRangesFor;
        int i2 = intRef.element;
        do {
            i = atomicInt.get();
        } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return kotlin.Unit.INSTANCE;
    }
}
