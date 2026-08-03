package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

/* loaded from: classes5.dex */
public final class a implements androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.unit.Density {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.Density f7894a;
    public boolean b;
    public boolean c;
    public final kotlinx.coroutines.sync.Mutex d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", i = {}, l = {123}, m = "awaitRelease", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a, reason: collision with other inner class name */
    public static final class C0308a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7895a;
        public int c;

        public C0308a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0308a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7895a = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.this.awaitRelease(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", i = {0}, l = {130}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7896a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.this.tryAwaitRelease(this);
        }
    }

    public a(androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "density");
        this.f7894a = density;
        this.d = kotlinx.coroutines.sync.MutexKt.Mutex(false);
    }

    public final void a() {
        this.c = true;
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object awaitRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0308a c0308a;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0308a) {
            c0308a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0308a) continuation;
            int i2 = c0308a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0308a.c = i2 - Integer.MIN_VALUE;
                obj = c0308a.f7895a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0308a.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c0308a.c = 1;
                    obj = tryAwaitRelease(c0308a);
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
        c0308a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.C0308a(continuation);
        obj = c0308a.f7895a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0308a.c;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public final void b() {
        this.b = true;
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    public final void c() {
        kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.d, null, 1, null);
        this.b = false;
        this.c = false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f7894a.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.f7894a.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo308roundToPxR2X_6o(long j) {
        return this.f7894a.mo308roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo309roundToPx0680j_4(float f) {
        return this.f7894a.mo309roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo310toDpGaN1DYA(long j) {
        return this.f7894a.mo310toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo311toDpu2uoSUM(float f) {
        return this.f7894a.mo311toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo313toDpSizekrfVVM(long j) {
        return this.f7894a.mo313toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo314toPxR2X_6o(long j) {
        return this.f7894a.mo314toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo315toPx0680j_4(float f) {
        return this.f7894a.mo315toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f7894a.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo316toSizeXkaWNTQ(long j) {
        return this.f7894a.mo316toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo317toSp0xMU5do(float f) {
        return this.f7894a.mo317toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo318toSpkPz2Gy4(float f) {
        return this.f7894a.mo318toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b bVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b) {
            bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.b && !this.c) {
                        kotlinx.coroutines.sync.Mutex mutex = this.d;
                        bVar.f7896a = this;
                        bVar.d = 1;
                        if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(mutex, null, bVar, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a) bVar.f7896a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.b);
            }
        }
        bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a.b(continuation);
        java.lang.Object obj2 = bVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(aVar.b);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo312toDpu2uoSUM(int i) {
        return this.f7894a.mo312toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo319toSpkPz2Gy4(int i) {
        return this.f7894a.mo319toSpkPz2Gy4(i);
    }
}
