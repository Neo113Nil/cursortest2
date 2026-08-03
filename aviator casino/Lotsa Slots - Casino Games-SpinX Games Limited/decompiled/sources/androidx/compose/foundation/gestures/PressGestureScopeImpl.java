package androidx.compose.foundation.gestures;

/* compiled from: TapGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u001e\u001a\u00020\u0018*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u001e\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u0005*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\"J\u0017\u0010)\u001a\u00020\u0005*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010 J\r\u0010,\u001a\u00020-*\u00020.H\u0097\u0001J\u0017\u0010/\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00101\u001a\u00020\u001b*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00103J\u001a\u00101\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "(Landroidx/compose/ui/unit/Density;)V", "", "getDensity", "()F", "fontScale", "getFontScale", "isCanceled", "", "isReleased", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "release", "reset", "tryAwaitRelease", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PressGestureScopeImpl implements androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.unit.Density {
    private final /* synthetic */ androidx.compose.ui.unit.Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex(false);

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo308roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo308roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo309roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo309roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo310toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo310toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo311toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo311toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo312toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo312toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo313toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo313toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo314toPxR2X_6o(long j) {
        return this.$$delegate_0.mo314toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo315toPx0680j_4(float f) {
        return this.$$delegate_0.mo315toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo316toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo316toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo317toSp0xMU5do(float f) {
        return this.$$delegate_0.mo317toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo318toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo318toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo319toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo319toSpkPz2Gy4(i);
    }

    public PressGestureScopeImpl(androidx.compose.ui.unit.Density density) {
        this.$$delegate_0 = density;
    }

    public final void cancel() {
        this.isCanceled = true;
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void release() {
        this.isReleased = true;
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object reset(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        int i;
        androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) continuation;
            if ((pressGestureScopeImpl$reset$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = pressGestureScopeImpl$reset$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$reset$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.Mutex mutex = this.mutex;
                    pressGestureScopeImpl$reset$1.L$0 = this;
                    pressGestureScopeImpl$reset$1.label = 1;
                    if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex, null, pressGestureScopeImpl$reset$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pressGestureScopeImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pressGestureScopeImpl = (androidx.compose.foundation.gestures.PressGestureScopeImpl) pressGestureScopeImpl$reset$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pressGestureScopeImpl.isReleased = false;
                pressGestureScopeImpl.isCanceled = false;
                return kotlin.Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$reset$1 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1(this, continuation);
        java.lang.Object obj2 = pressGestureScopeImpl$reset$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$reset$1.label;
        if (i != 0) {
        }
        pressGestureScopeImpl.isReleased = false;
        pressGestureScopeImpl.isCanceled = false;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object awaitRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) continuation;
            if ((pressGestureScopeImpl$awaitRelease$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.label -= Integer.MIN_VALUE;
                obj = pressGestureScopeImpl$awaitRelease$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$awaitRelease$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    pressGestureScopeImpl$awaitRelease$1.label = 1;
                    obj = tryAwaitRelease(pressGestureScopeImpl$awaitRelease$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new androidx.compose.foundation.gestures.GestureCancellationException("The press gesture was canceled.");
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$awaitRelease$1 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1(this, continuation);
        obj = pressGestureScopeImpl$awaitRelease$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$awaitRelease$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i;
        androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) continuation;
            if ((pressGestureScopeImpl$tryAwaitRelease$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$tryAwaitRelease$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.isReleased && !this.isCanceled) {
                        kotlinx.coroutines.sync.Mutex mutex = this.mutex;
                        pressGestureScopeImpl$tryAwaitRelease$1.L$0 = this;
                        pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                        if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex, null, pressGestureScopeImpl$tryAwaitRelease$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pressGestureScopeImpl = this;
                    } else {
                        pressGestureScopeImpl = this;
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pressGestureScopeImpl = (androidx.compose.foundation.gestures.PressGestureScopeImpl) pressGestureScopeImpl$tryAwaitRelease$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(pressGestureScopeImpl.mutex, null, 1, null);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1(this, continuation);
        java.lang.Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$tryAwaitRelease$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(pressGestureScopeImpl.mutex, null, 1, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
    }
}
