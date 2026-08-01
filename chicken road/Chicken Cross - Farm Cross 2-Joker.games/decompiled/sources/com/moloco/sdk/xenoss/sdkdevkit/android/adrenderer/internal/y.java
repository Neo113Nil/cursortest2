package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4783f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class y implements InterfaceC4812b {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f11571a;
    public final C4782e b;
    public final InterfaceC4827m c;
    public final Function1<Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> d;
    public final MutableStateFlow<Boolean> e;
    public final StateFlow<Boolean> f;
    public com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> g;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1", f = "MraidAdLoad.kt", i = {0}, l = {60, 80}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f11572a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC4812b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a, reason: collision with other inner class name */
        public static final class C1619a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11573a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C4823i c;
            public final /* synthetic */ y d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$decDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$a$a, reason: collision with other inner class name */
            public static final class C1620a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f11574a;
                public int b;
                public final /* synthetic */ C4823i c;
                public final /* synthetic */ y d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1620a(C4823i c4823i, y yVar, Continuation<? super C1620a> continuation) {
                    super(2, continuation);
                    this.c = c4823i;
                    this.d = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                    return ((C1620a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1620a(this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C4823i c4823i;
                    C4783f ext;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C4823i c4823i2 = this.c;
                        String str = null;
                        if (c4823i2 == null) {
                            return null;
                        }
                        y yVar = this.d;
                        try {
                            InterfaceC4827m interfaceC4827m = yVar.c;
                            C4782e c4782e = yVar.b;
                            if (c4782e != null && (ext = c4782e.getExt()) != null) {
                                str = ext.getMtid();
                            }
                            this.f11574a = c4823i2;
                            this.b = 1;
                            Object a2 = interfaceC4827m.a(c4823i2, str, this);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c4823i = c4823i2;
                            obj = a2;
                        } catch (Exception unused) {
                            return c4823i2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4823i = (C4823i) this.f11574a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception unused2) {
                            return c4823i;
                        }
                    }
                    return (C4823i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1619a(long j, C4823i c4823i, y yVar, Continuation<? super C1619a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c4823i;
                this.d = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                return ((C1619a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1619a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f11573a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1620a c1620a = new C1620a(this.c, this.d, null);
                    this.f11573a = 1;
                    obj = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, c1620a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C4823i c4823i = (C4823i) obj;
                return c4823i == null ? this.c : c4823i;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1", f = "MraidAdLoad.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11575a;
            public final /* synthetic */ long b;
            public final /* synthetic */ y c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.MraidAdLoad$load$1$mraidLoadResultDeferred$1$1", f = "MraidAdLoad.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y$a$b$a, reason: collision with other inner class name */
            public static final class C1621a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11576a;
                public final /* synthetic */ y b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1621a(y yVar, Continuation<? super C1621a> continuation) {
                    super(2, continuation);
                    this.b = yVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                    return ((C1621a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1621a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f11576a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function1 function1 = this.b.d;
                        this.f11576a = 1;
                        obj = function1.invoke(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, y yVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = yVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f11575a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1621a c1621a = new C1621a(this.c, null);
                    this.f11575a = 1;
                    obj = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, c1621a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4812b.a aVar, long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = y.this.new a(this.e, this.f, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0100  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            Deferred deferred;
            C4783f ext;
            com.moloco.sdk.internal.ortb.model.B player;
            com.moloco.sdk.internal.ortb.model.n dec;
            InterfaceC4812b.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar;
            y yVar;
            InterfaceC4812b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                if (y.this.a() instanceof x.b) {
                    InterfaceC4812b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return Unit.INSTANCE;
                }
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(this.f, y.this, null), 3, null);
                C4782e c4782e = y.this.b;
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C1619a(this.f, (c4782e == null || (ext = c4782e.getExt()) == null || (player = ext.getPlayer()) == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), y.this, null), 3, null);
                try {
                    this.c = async$default2;
                    this.b = 1;
                    Object await = async$default.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred = async$default2;
                    obj = await;
                } catch (TimeoutCancellationException unused) {
                    deferred = async$default2;
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    y.this.a(new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) this.f11572a;
                    yVar = (y) this.c;
                    ResultKt.throwOnFailure(obj);
                    yVar.a(new x.b(cVar.a((C4823i) obj)));
                    y.this.e.setValue(Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.c;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (TimeoutCancellationException unused2) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar42 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f;
                    y.this.a(new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.e));
                    aVar = this.e;
                    if (aVar != null) {
                        aVar.a(aVar42);
                    }
                    return Unit.INSTANCE;
                }
            }
            com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) obj;
            if (xVar == null) {
                InterfaceC4812b.a aVar5 = this.e;
                if (aVar5 != null) {
                    aVar5.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.c);
                }
            } else if (xVar instanceof x.a) {
                InterfaceC4812b.a aVar6 = this.e;
                if (aVar6 != null) {
                    aVar6.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                }
                Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
            } else {
                if (!(xVar instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar2 = y.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((x.b) xVar).a();
                this.c = yVar2;
                this.f11572a = cVar2;
                this.b = 2;
                Object await2 = deferred.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = await2;
                yVar = yVar2;
                yVar.a(new x.b(cVar.a((C4823i) obj)));
                y.this.e.setValue(Boxing.boxBoolean(true));
                aVar2 = this.e;
                if (aVar2 != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(CoroutineScope scope, C4782e c4782e, InterfaceC4827m decLoader, Function1<? super Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, ? extends Object> loadAndReadyMraid) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.f11571a = scope;
        this.b = c4782e;
        this.c = decLoader;
        this.d = loadAndReadyMraid;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.f;
    }

    public final com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.g;
    }

    public final void a(com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.g = xVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f11571a, null, null, new a(aVar, j, null), 3, null);
    }
}
