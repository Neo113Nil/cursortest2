package com.inmobi.media;

/* loaded from: classes5.dex */
public final class M1 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f4827a;
    public final android.view.ViewGroup b;
    public final kotlinx.coroutines.flow.MutableStateFlow c;
    public final long d;
    public final com.inmobi.media.InterfaceC2772t9 e;
    public kotlinx.coroutines.Job f;

    public M1(long j, android.view.ViewGroup observableView, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.MutableStateFlow visibilityStateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observableView, "observableView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f4827a = coroutineScope;
        this.b = observableView;
        this.c = visibilityStateFlow;
        this.d = j;
        this.e = interfaceC2772t9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r14.collect(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.M1 m1, android.view.ViewGroup viewGroup, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.K1 k1;
        int i;
        m1.getClass();
        if (continuationImpl instanceof com.inmobi.media.K1) {
            k1 = (com.inmobi.media.K1) continuationImpl;
            int i2 = k1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k1.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = k1.f4792a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = k1.c;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.B5.f4614a.getClass();
                if (com.inmobi.media.B5.B()) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = m1.e;
                    if (interfaceC2772t9 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowLifecycleHandler", "startObservingVisibility - Using window visibility observer (UDC+)");
                    }
                    kotlinx.coroutines.flow.StateFlow stateIn = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.inmobi.media.Vo(viewGroup, null)), kotlinx.coroutines.Dispatchers.getMain()), coroutineScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(viewGroup.getWindowVisibility() == 0));
                    com.inmobi.media.L1 l1 = new com.inmobi.media.L1(m1);
                    k1.c = 1;
                } else {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = m1.e;
                    if (interfaceC2772t92 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).a("WindowLifecycleHandler", "startObservingVisibility - Using window focus observer (pre-UDC)");
                    }
                    kotlinx.coroutines.flow.StateFlow stateIn2 = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.inmobi.media.To(viewGroup, null)), kotlinx.coroutines.Dispatchers.getMain()), coroutineScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(viewGroup.isFocused()));
                    com.inmobi.media.Z6 z6 = new com.inmobi.media.Z6(m1.d, viewGroup, m1.e, coroutineScope, m1.c);
                    k1.c = 2;
                }
                return coroutine_suspended;
            }
        }
        k1 = new com.inmobi.media.K1(m1, continuationImpl);
        java.lang.Object obj2 = k1.f4792a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = k1.c;
        if (i == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return a(((java.lang.Boolean) obj).booleanValue());
    }

    public final kotlin.Unit a(boolean z) {
        kotlinx.coroutines.Job launch$default;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z);
        }
        if (z) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.e;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f4827a, null, null, new com.inmobi.media.J1(this, null), 3, null);
            this.f = launch$default;
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.e;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.c.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            com.inmobi.media.L6.a(this.f);
            this.f = null;
        }
        return kotlin.Unit.INSTANCE;
    }
}
