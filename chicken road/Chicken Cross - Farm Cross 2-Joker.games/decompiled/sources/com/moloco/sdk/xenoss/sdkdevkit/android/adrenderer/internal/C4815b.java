package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4815b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> {
    public static final int B = 8;
    public final StateFlow<Boolean> A;
    public final Context j;
    public final C4782e k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i l;
    public final r m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z n;
    public final com.moloco.sdk.internal.C o;
    public final CoroutineScope p;
    public final com.moloco.sdk.internal.services.s q;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h r;
    public final String s;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j t;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h u;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> v;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> w;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> x;
    public final InterfaceC4812b y;
    public final MutableStateFlow<Boolean> z;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a */
    public static final class a implements InterfaceC4812b {

        /* renamed from: a, reason: collision with root package name */
        public final MutableStateFlow<Boolean> f10945a;
        public final StateFlow<Boolean> b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1520a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10946a;

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
                f10946a = iArr;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$load$1", f = "AggregatedBanner.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b, reason: collision with other inner class name */
        public static final class C1521b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10947a;
            public final /* synthetic */ C4815b c;
            public final /* synthetic */ long d;
            public final /* synthetic */ InterfaceC4812b.a e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a, reason: collision with other inner class name */
            public static final class C1522a implements InterfaceC4812b.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4812b.a f10948a;
                public final /* synthetic */ C4815b b;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C1523a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f10949a;

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
                        f10949a = iArr;
                    }
                }

                public C1522a(InterfaceC4812b.a aVar, C4815b c4815b) {
                    this.f10948a = aVar;
                    this.b = c4815b;
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
                public void a() {
                    InterfaceC4812b.a aVar = this.f10948a;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                    Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType = this.b.getCreativeType();
                    switch (creativeType == null ? -1 : C1523a.f10949a[creativeType.ordinal()]) {
                        case -1:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "creativeType is null", new Throwable(), false, 8, null);
                            return;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            InterfaceC4812b.a aVar = this.f10948a;
                            if (aVar != null) {
                                aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.h);
                                return;
                            }
                            return;
                        case 2:
                            InterfaceC4812b.a aVar2 = this.f10948a;
                            if (aVar2 != null) {
                                aVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.i);
                                return;
                            }
                            return;
                        case 3:
                            InterfaceC4812b.a aVar3 = this.f10948a;
                            if (aVar3 != null) {
                                aVar3.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.j);
                                return;
                            }
                            return;
                        case 4:
                        case 5:
                        case 6:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                            return;
                        case 7:
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.b.s, "Unknown creative type for timeout error", null, false, 12, null);
                            return;
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                    Intrinsics.checkNotNullParameter(internalError, "internalError");
                    InterfaceC4812b.a aVar = this.f10948a;
                    if (aVar != null) {
                        aVar.a(internalError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1521b(C4815b c4815b, long j, InterfaceC4812b.a aVar, Continuation<? super C1521b> continuation) {
                super(2, continuation);
                this.c = c4815b;
                this.d = j;
                this.e = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1521b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return a.this.new C1521b(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10947a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = a.this;
                    this.f10947a = 1;
                    if (aVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C bannerImpl = this.c.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.d, new C1522a(this.e, this.c));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1", f = "AggregatedBanner.kt", i = {0}, l = {160}, m = "prepareBanner", n = {"this"}, s = {"L$0"})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$c */
        public static final class c extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f10950a;
            public /* synthetic */ Object b;
            public int d;

            public c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$2", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$d */
        public static final class d extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10951a;
            public /* synthetic */ boolean b;

            public d(Continuation<? super d> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                d dVar = a.this.new d(continuation);
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
                if (this.f10951a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a.this.f10945a.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$3", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$e */
        public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10952a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ C4815b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C4815b c4815b, Continuation<? super e> continuation) {
                super(2, continuation);
                this.c = c4815b;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.c, continuation);
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
                if (this.f10952a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.z.setValue(Boxing.boxBoolean(this.b));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$adLoader$1$prepareBanner$crType$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$a$f */
        public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10953a;
            public final /* synthetic */ C4815b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C4815b c4815b, Continuation<? super f> continuation) {
                super(2, continuation);
                this.b = c4815b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10953a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j c = C4822h.f10984a.c(this.b.k.getAdm());
                this.b.t = c;
                return c;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.d = aVar;
            MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.f10945a = MutableStateFlow;
            this.b = FlowKt.asStateFlow(MutableStateFlow);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
        public StateFlow<Boolean> isLoaded() {
            return this.b;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
        public void a(long j, InterfaceC4812b.a aVar) {
            BuildersKt__Builders_commonKt.launch$default(C4815b.this.p, null, null, new C1521b(C4815b.this, j, aVar, null), 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(Continuation<? super Unit> continuation) {
            c cVar;
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType;
            a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C bannerImpl;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C bannerImpl2;
            StateFlow<Boolean> l;
            Flow onEach;
            StateFlow<Boolean> isLoaded;
            Flow onEach2;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C4815b.this.s, "Preparing banner", false, 4, null);
                        creativeType = C4815b.this.getCreativeType();
                        if (creativeType != null) {
                            aVar = this;
                            switch (C1520a.f10946a[creativeType.ordinal()]) {
                                case 1:
                                    C4815b.this.o.a(C4815b.this);
                                    C4815b.this.v = new N(C4815b.this.j, aVar.d, C4815b.this.l.c(), C4815b.this.m, C4815b.this.p, new L(C4815b.this.k, C4815b.this.p, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(C4815b.this.j), a.C1507a.f10866a.a(), true, null, 32, null));
                                    break;
                                case 2:
                                    C4815b.this.w = new z(C4815b.this.j, C4815b.this.k.getAdm(), C4815b.this.m, C4815b.this.n, null, C4815b.this.p, 16, null);
                                    break;
                                case 3:
                                    Context context = C4815b.this.j;
                                    com.moloco.sdk.internal.services.s sVar = C4815b.this.q;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = C4815b.this.r;
                                    com.moloco.sdk.internal.ortb.model.y molocoSdkClickMetaData = C4815b.this.k.getExt().getMolocoSdkClickMetaData();
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, sVar, hVar, (molocoSdkClickMetaData != null ? molocoSdkClickMetaData.getBannerClickMetaData() : null) != null, null, 34, null);
                                    C4815b.this.x = new F(C4815b.this.j, C4815b.this.n, aVar2, new E(C4815b.this.k.getAdm(), C4815b.this.p, aVar2), C4815b.this.p, null, 32, null);
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C4815b.this.s, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                                    break;
                                case 7:
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, C4815b.this.s, "Unknown creative type for timeout error", null, false, 12, null);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            bannerImpl = C4815b.this.getBannerImpl();
                            if (bannerImpl != null && (isLoaded = bannerImpl.isLoaded()) != null && (onEach2 = FlowKt.onEach(isLoaded, aVar.new d(null))) != null) {
                                FlowKt.launchIn(onEach2, C4815b.this.p);
                            }
                            bannerImpl2 = C4815b.this.getBannerImpl();
                            if (bannerImpl2 != null && (l = bannerImpl2.l()) != null && (onEach = FlowKt.onEach(l, new e(C4815b.this, null))) != null) {
                                FlowKt.launchIn(onEach, C4815b.this.p);
                            }
                            C4815b c4815b = C4815b.this;
                            c4815b.setAdShowListener(c4815b.getAdShowListener());
                            return Unit.INSTANCE;
                        }
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = new f(C4815b.this, null);
                        cVar.f10950a = this;
                        cVar.d = 1;
                        obj = BuildersKt.withContext(coroutineContext, fVar, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) cVar.f10950a;
                        ResultKt.throwOnFailure(obj);
                    }
                    creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) obj;
                    switch (C1520a.f10946a[creativeType.ordinal()]) {
                    }
                    bannerImpl = C4815b.this.getBannerImpl();
                    if (bannerImpl != null) {
                        FlowKt.launchIn(onEach2, C4815b.this.p);
                    }
                    bannerImpl2 = C4815b.this.getBannerImpl();
                    if (bannerImpl2 != null) {
                        FlowKt.launchIn(onEach, C4815b.this.p);
                    }
                    C4815b c4815b2 = C4815b.this;
                    c4815b2.setAdShowListener(c4815b2.getAdShowListener());
                    return Unit.INSTANCE;
                }
            }
            cVar = new c(continuation);
            Object obj2 = cVar.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cVar.d;
            if (i != 0) {
            }
            creativeType = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) obj2;
            switch (C1520a.f10946a[creativeType.ordinal()]) {
            }
            bannerImpl = C4815b.this.getBannerImpl();
            if (bannerImpl != null) {
            }
            bannerImpl2 = C4815b.this.getBannerImpl();
            if (bannerImpl2 != null) {
            }
            C4815b c4815b22 = C4815b.this;
            c4815b22.setAdShowListener(c4815b22.getAdShowListener());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AggregatedBanner$destroy$1", f = "AggregatedBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b$b, reason: collision with other inner class name */
    public static final class C1524b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10954a;

        public C1524b(Continuation<? super C1524b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1524b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4815b.this.new C1524b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10954a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4815b.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C bannerImpl = C4815b.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4815b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, C4782e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i options, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, com.moloco.sdk.internal.C viewLifecycleOwner, CoroutineScope scope, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.j = context;
        this.k = bid;
        this.l = options;
        this.m = externalLinkHandler;
        this.n = watermark;
        this.o = viewLifecycleOwner;
        this.p = scope;
        this.q = clickthroughService;
        this.r = buttonTracker;
        this.s = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.t = jVar;
        this.y = new a(customUserEventBuilderService);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.z = MutableStateFlow;
        this.A = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<?> getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> c = this.v;
        if (c != null) {
            return c;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> c2 = this.w;
        return c2 == null ? this.x : c2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        BuildersKt__Builders_commonKt.launch$default(this.p, null, null, new C1524b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public InterfaceC4812b getAdLoader() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.t;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h getAdShowListener() {
        return this.u;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public void k() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return this.A;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public void setAdShowListener(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        this.u = hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> c = this.v;
        if (c != null) {
            c.setAdShowListener(hVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> c2 = this.w;
        if (c2 == null) {
            c2 = this.x;
        }
        if (c2 != null) {
            c2.setAdShowListener(hVar);
        }
    }
}
