package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4816c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public static final int t = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10955a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final C4782e c;
    public final r d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z e;
    public final MetricsRecorder f;
    public final String g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j h;
    public final CoroutineScope i;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> l;
    public final v m;
    public final MutableStateFlow<Boolean> n;
    public final StateFlow<Boolean> o;
    public final MutableStateFlow<Boolean> p;
    public final StateFlow<Boolean> q;
    public final MutableStateFlow<Boolean> r;
    public final StateFlow<Boolean> s;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10956a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.f11577a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10956a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$load$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10957a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC4812b.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a */
        public static final class a implements InterfaceC4812b.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4812b.a f10958a;
            public final /* synthetic */ C4816c b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1525a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f10959a;

                static {
                    int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.values().length];
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.f11577a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.e.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.f.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.g.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    f10959a = iArr;
                }
            }

            public a(InterfaceC4812b.a aVar, C4816c c4816c) {
                this.f10958a = aVar;
                this.b = c4816c;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a() {
                InterfaceC4812b.a aVar = this.f10958a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType = this.b.getCreativeType();
                switch (creativeType == null ? -1 : C1525a.f10959a[creativeType.ordinal()]) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "creativeType is null", null, false, 12, null);
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        InterfaceC4812b.a aVar = this.f10958a;
                        if (aVar != null) {
                            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e);
                            return;
                        }
                        return;
                    case 2:
                        InterfaceC4812b.a aVar2 = this.f10958a;
                        if (aVar2 != null) {
                            aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f);
                            return;
                        }
                        return;
                    case 3:
                        InterfaceC4812b.a aVar3 = this.f10958a;
                        if (aVar3 != null) {
                            aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.g);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        return;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                        return;
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                InterfaceC4812b.a aVar = this.f10958a;
                if (aVar != null) {
                    aVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC4812b.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4816c.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10957a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4816c c4816c = C4816c.this;
                this.f10957a = 1;
                if (c4816c.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m o = C4816c.this.o();
            if (o != null) {
                o.a(this.c, new a(this.d, C4816c.this));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd", f = "AggregatedFullscreenAd.kt", i = {0}, l = {69}, m = "prepareAd", n = {"this"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$c, reason: collision with other inner class name */
    public static final class C1526c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10960a;
        public /* synthetic */ Object b;
        public int d;

        public C1526c(Continuation<? super C1526c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C4816c.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$2", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$d */
    public static final class d extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10961a;
        public /* synthetic */ boolean b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C4816c.this.new d(continuation);
            dVar.b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10961a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4816c.this.n.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$3", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$e */
    public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10962a;
        public /* synthetic */ boolean b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C4816c.this.new e(continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10962a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4816c.this.p.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$4", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$f */
    public static final class f extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10963a;
        public /* synthetic */ boolean b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C4816c.this.new f(continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10963a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4816c.this.r.setValue(Boxing.boxBoolean(this.b));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedFullscreenAd$prepareAd$crType$1", f = "AggregatedFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$g */
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10964a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4816c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10964a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j c = C4822h.f10984a.c(C4816c.this.c.getAdm());
            C4816c c4816c = C4816c.this;
            c4816c.h = c;
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, c4816c.g, "Native ad resolved creativeType: " + c, false, 4, null);
            return c;
        }
    }

    public C4816c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, C4782e bid, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10955a = context;
        this.b = customUserEventBuilderService;
        this.c = bid;
        this.d = externalLinkHandler;
        this.e = watermark;
        this.f = metricsRecorder;
        this.g = "AggregatedFullscreenAd";
        this.h = jVar;
        this.i = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = new v();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.r = MutableStateFlow3;
        this.s = MutableStateFlow3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.i, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> o = o();
        if (o != null) {
            o.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public StateFlow<Boolean> k() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return this.q;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> o() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> mVar = this.j;
        if (mVar != null) {
            return mVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> mVar2 = this.k;
        return mVar2 == null ? this.l : mVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation<? super Unit> continuation) {
        C1526c c1526c;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType;
        C4816c c4816c;
        com.moloco.sdk.internal.ortb.model.A a2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> o;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> o2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> o3;
        StateFlow<Boolean> k;
        Flow onEach;
        StateFlow<Boolean> l;
        Flow onEach2;
        StateFlow<Boolean> isLoaded;
        Flow onEach3;
        if (continuation instanceof C1526c) {
            c1526c = (C1526c) continuation;
            int i2 = c1526c.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1526c.d = i2 - Integer.MIN_VALUE;
                Object obj = c1526c.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1526c.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    creativeType = getCreativeType();
                    if (creativeType != null) {
                        c4816c = this;
                        switch (a.f10956a[creativeType.ordinal()]) {
                            case 1:
                                c4816c.j = c4816c.m.a(c4816c.f10955a, c4816c.c, a.g.f10872a.b().h(), c4816c.e, c4816c.f);
                                break;
                            case 2:
                                v vVar = c4816c.m;
                                Context context = c4816c.f10955a;
                                CoroutineScope coroutineScope = c4816c.i;
                                C4782e c4782e = c4816c.c;
                                r rVar = c4816c.d;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar = c4816c.e;
                                MutableStateFlow<Boolean> mutableStateFlow = c4816c.p;
                                com.moloco.sdk.internal.ortb.model.B player = c4782e.getExt().getPlayer();
                                c4816c.k = vVar.a(context, coroutineScope, c4782e, rVar, zVar, mutableStateFlow, (player == null || (a2 = player.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String()) == null) ? false : a2.getCom.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_MUTE java.lang.String(), c4816c.f);
                                break;
                            case 3:
                                c4816c.l = c4816c.m.a(c4816c.f10955a, c4816c.b, c4816c.c.getAdm(), c4816c.d, c4816c.e, c4816c.f);
                                break;
                            case 4:
                            case 5:
                            case 6:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c4816c.g, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                                break;
                            case 7:
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, c4816c.g, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        o = c4816c.o();
                        if (o != null && (isLoaded = o.isLoaded()) != null && (onEach3 = FlowKt.onEach(isLoaded, c4816c.new d(null))) != null) {
                            FlowKt.launchIn(onEach3, c4816c.i);
                        }
                        o2 = c4816c.o();
                        if (o2 != null && (l = o2.l()) != null && (onEach2 = FlowKt.onEach(l, c4816c.new e(null))) != null) {
                            FlowKt.launchIn(onEach2, c4816c.i);
                        }
                        o3 = c4816c.o();
                        if (o3 != null && (k = o3.k()) != null && (onEach = FlowKt.onEach(k, c4816c.new f(null))) != null) {
                            FlowKt.launchIn(onEach, c4816c.i);
                        }
                        return Unit.INSTANCE;
                    }
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    g gVar = new g(null);
                    c1526c.f10960a = this;
                    c1526c.d = 1;
                    obj = BuildersKt.withContext(coroutineContext, gVar, c1526c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c4816c = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4816c = (C4816c) c1526c.f10960a;
                    ResultKt.throwOnFailure(obj);
                }
                creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) obj;
                switch (a.f10956a[creativeType.ordinal()]) {
                }
                o = c4816c.o();
                if (o != null) {
                    FlowKt.launchIn(onEach3, c4816c.i);
                }
                o2 = c4816c.o();
                if (o2 != null) {
                    FlowKt.launchIn(onEach2, c4816c.i);
                }
                o3 = c4816c.o();
                if (o3 != null) {
                    FlowKt.launchIn(onEach, c4816c.i);
                }
                return Unit.INSTANCE;
            }
        }
        c1526c = new C1526c(continuation);
        Object obj2 = c1526c.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1526c.d;
        if (i != 0) {
        }
        creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) obj2;
        switch (a.f10956a[creativeType.ordinal()]) {
        }
        o = c4816c.o();
        if (o != null) {
        }
        o2 = c4816c.o();
        if (o2 != null) {
        }
        o3 = c4816c.o();
        if (o3 != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new b(j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> mVar = this.j;
        if (mVar != null) {
            mVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y>) options.c(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y) hVar);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> mVar2 = this.k;
        if (mVar2 != null) {
            mVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) hVar);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> mVar3 = this.l;
        if (mVar3 != null) {
            mVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f>) options.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) hVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || hVar == null) {
            return;
        }
        hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f10968a);
        Unit unit4 = Unit.INSTANCE;
    }
}
