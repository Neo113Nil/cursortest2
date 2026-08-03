package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f7827a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D b;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> c;

    public static final class a implements kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Flow f7828a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a, reason: collision with other inner class name */
        public static final class C0296a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7829a;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionGoNextActionImpl$special$$inlined$map$1$2", f = "CompanionGoNextAction.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a, reason: collision with other inner class name */
            public static final class C0297a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ java.lang.Object f7830a;
                public int b;
                public java.lang.Object c;

                public C0297a(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.f7830a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a.this.emit(null, this);
                }
            }

            public C0296a(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                this.f7829a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a.C0297a c0297a;
                int i;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a b;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a.C0297a) {
                    c0297a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a.C0297a) continuation;
                    int i2 = c0297a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0297a.b = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0297a.f7830a;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0297a.b;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.f7829a;
                            b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.b(((kotlin.UInt) obj).getData());
                            c0297a.b = 1;
                            if (flowCollector.emit(b, c0297a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                c0297a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a.C0297a(continuation);
                java.lang.Object obj22 = c0297a.f7830a;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0297a.b;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public a(kotlinx.coroutines.flow.Flow flow) {
            this.f7828a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> flowCollector, kotlin.coroutines.Continuation continuation) {
            java.lang.Object collect = this.f7828a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a.C0296a(flowCollector), continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.b.a(this.f7827a);
    }

    public e(int i, kotlinx.coroutines.CoroutineScope scope) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7827a = i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D(i, scope, null);
        this.b = d;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e.a(d.a());
        kotlinx.coroutines.flow.SharingStarted WhileSubscribed$default = kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null);
        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.b(i);
        this.c = kotlinx.coroutines.flow.FlowKt.stateIn(aVar, scope, WhileSubscribed$default, b);
    }
}
