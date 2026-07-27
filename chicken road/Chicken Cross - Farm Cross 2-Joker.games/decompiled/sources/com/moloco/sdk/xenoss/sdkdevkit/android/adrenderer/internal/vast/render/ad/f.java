package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a {
    public static final int l = 8;

    /* renamed from: a, reason: collision with root package name */
    public final List<k> f11334a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h b;
    public final CoroutineScope c;
    public final MutableStateFlow<k> d;
    public final StateFlow<i.a> e;
    public final StateFlow<Boolean> f;
    public final Flow<Boolean> g;
    public final StateFlow<Boolean> h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c i;
    public final MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> j;
    public final Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> k;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$1", f = "AdPlaylistControllerImpl.kt", i = {}, l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11335a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$a$a, reason: collision with other inner class name */
        public static final class C1584a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<d.a> f11336a;
            public final /* synthetic */ f b;

            public C1584a(Ref.ObjectRef<d.a> objectRef, f fVar) {
                this.f11336a = objectRef;
                this.b = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(d.a aVar, Continuation<? super Unit> continuation) {
                if ((this.f11336a.element instanceof d.a.b) && (aVar instanceof d.a.C1608a)) {
                    this.b.a(b.j.b);
                }
                this.f11336a.element = aVar;
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11335a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                StateFlow<d.a> l = f.this.l();
                C1584a c1584a = new C1584a(objectRef, f.this);
                this.f11335a = 1;
                if (l.collect(c1584a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$2", f = "AdPlaylistControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11337a;
        public /* synthetic */ Object b;
        public final /* synthetic */ k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, Continuation<? super Unit> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b) this.b;
            if (bVar instanceof b.d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    hVar.a(x.j);
                }
                f.this.a(new b.f(((b.d) bVar).b()));
            } else if (bVar instanceof b.a) {
                f.this.a(b.a.b);
            } else if (bVar instanceof b.c) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.b;
                if (hVar2 != null) {
                    Boxing.boxBoolean(hVar2.b());
                }
                f.this.a(b.C1583b.b);
            } else {
                if (!(bVar instanceof b.C1591b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.a) this.d).a().destroy();
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$3", f = "AdPlaylistControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11338a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, Continuation<? super Unit> continuation) {
            return ((c) create(dVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11338a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.b;
            if (dVar instanceof d.C1610d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    hVar.a(x.g);
                }
                f.this.a(new b.f(((d.C1610d) dVar).b()));
            } else if (Intrinsics.areEqual(dVar, d.a.b)) {
                f.this.a(b.a.b);
            } else if (Intrinsics.areEqual(dVar, d.e.b)) {
                f.this.a(b.i.b);
                f.this.Y();
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(dVar, d.b.b)) {
                f.this.a(b.c.b);
                Boxing.boxBoolean(f.this.X());
            } else {
                if (!Intrinsics.areEqual(dVar, d.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.b;
                if (hVar2 != null) {
                    Boxing.boxBoolean(hVar2.b());
                }
                f.this.a(b.g.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$4", f = "AdPlaylistControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11339a;
        public /* synthetic */ Object b;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11340a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.f11492a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11340a = iArr;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, Continuation<? super Unit> continuation) {
            return ((d) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = f.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = a.f11340a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.b).ordinal()];
            if (i == 1) {
                f.this.a(b.a.b);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    Boxing.boxBoolean(hVar.b());
                }
                f.this.a(b.d.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$5", f = "AdPlaylistControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11341a;
        public /* synthetic */ Object b;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11342a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.f11040a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11342a = iArr;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
            return ((e) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = f.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11341a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = a.f11342a[((l) this.b).ordinal()];
            if (i == 1) {
                f.this.a(b.i.b);
                f.this.Y();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f.this.a(b.a.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$canReplay$1", f = "AdPlaylistControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$f, reason: collision with other inner class name */
    public static final class C1585f extends SuspendLambda implements Function3<k, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11343a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public C1585f(Continuation<? super C1585f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Boolean bool, Continuation<? super Boolean> continuation) {
            C1585f c1585f = f.this.new C1585f(continuation);
            c1585f.b = kVar;
            c1585f.c = bool;
            return c1585f.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r0, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) == false) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11343a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            k kVar = (k) this.b;
            Boolean bool = (Boolean) this.c;
            boolean z = kVar != null && Intrinsics.areEqual(kVar, CollectionsKt.last(f.this.f11334a));
            return Boxing.boxBoolean(z);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$onEvent$1", f = "AdPlaylistControllerImpl.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11344a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b b;
        public final /* synthetic */ f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, f fVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = bVar;
            this.c = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11344a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Emitting event: " + this.b, null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = this.c.j;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = this.b;
                this.f11344a = 1;
                if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h implements Flow<i.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f11345a;
        public final /* synthetic */ f b;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f11346a;
            public final /* synthetic */ f b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$1$2", f = "AdPlaylistControllerImpl.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a, reason: collision with other inner class name */
            public static final class C1586a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f11347a;
                public int b;
                public Object c;

                public C1586a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f11347a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, f fVar) {
                this.f11346a = flowCollector;
                this.b = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1586a c1586a;
                int i;
                Object obj2;
                if (continuation instanceof C1586a) {
                    c1586a = (C1586a) continuation;
                    int i2 = c1586a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1586a.b = i2 - Integer.MIN_VALUE;
                        Object obj3 = c1586a.f11347a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1586a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj3);
                            FlowCollector flowCollector = this.f11346a;
                            k kVar = (k) obj;
                            boolean areEqual = Intrinsics.areEqual(CollectionsKt.lastOrNull(this.b.f11334a), kVar);
                            if (kVar instanceof k.a) {
                                obj2 = new i.a.C1590a(((k.a) kVar).a(), areEqual);
                            } else if (kVar instanceof k.c) {
                                obj2 = new i.a.c(((k.c) kVar).a(), areEqual);
                            } else if (kVar instanceof k.b) {
                                obj2 = new i.a.b(((k.b) kVar).a(), areEqual);
                            } else if (kVar instanceof k.d) {
                                obj2 = new i.a.d(((k.d) kVar).a(), areEqual);
                            } else {
                                if (kVar != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj2 = null;
                            }
                            c1586a.b = 1;
                            if (flowCollector.emit(obj2, c1586a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1586a = new C1586a(continuation);
                Object obj32 = c1586a.f11347a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1586a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public h(Flow flow, f fVar) {
            this.f11345a = flow;
            this.b = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super i.a> flowCollector, Continuation continuation) {
            Object collect = this.f11345a.collect(new a(flowCollector, this.b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class i implements Flow<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f11348a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f11349a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$2$2", f = "AdPlaylistControllerImpl.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a, reason: collision with other inner class name */
            public static final class C1587a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f11350a;
                public int b;
                public Object c;

                public C1587a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f11350a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f11349a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1587a c1587a;
                int i;
                boolean z;
                if (continuation instanceof C1587a) {
                    c1587a = (C1587a) continuation;
                    int i2 = c1587a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1587a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1587a.f11350a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1587a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.f11349a;
                            k kVar = (k) obj;
                            if (kVar instanceof k.a) {
                                z = ((k.a) kVar).a().N();
                            } else if (kVar instanceof k.c) {
                                z = ((k.c) kVar).a().N();
                            } else {
                                if (!(kVar instanceof k.b) && !(kVar instanceof k.d) && kVar != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z = false;
                            }
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            c1587a.b = 1;
                            if (flowCollector.emit(boxBoolean, c1587a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1587a = new C1587a(continuation);
                Object obj22 = c1587a.f11350a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1587a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public i(Flow flow) {
            this.f11348a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object collect = this.f11348a.collect(new a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends k> playlist, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar) {
        Flow<Boolean> b2;
        Flow onEach;
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        this.f11334a = playlist;
        this.b = hVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.c = CoroutineScope;
        MutableStateFlow<k> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.d = MutableStateFlow;
        h hVar2 = new h(MutableStateFlow, this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        this.e = FlowKt.stateIn(hVar2, CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        i iVar = new i(MutableStateFlow);
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f = FlowKt.stateIn(iVar, CoroutineScope, WhileSubscribed$default, bool);
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((Flow<? extends k>) MutableStateFlow, CoroutineScope);
        this.g = b2;
        this.h = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, b2, new C1585f(null)), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), bool);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e.a(MutableStateFlow, CoroutineScope);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
        MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.j = MutableSharedFlow$default;
        this.k = MutableSharedFlow$default;
        for (k kVar : playlist) {
            if (kVar instanceof k.a) {
                onEach = FlowKt.onEach(((k.a) kVar).a().a(), new b(kVar, null));
            } else if (kVar instanceof k.c) {
                onEach = FlowKt.onEach(((k.c) kVar).a().a(), new c(null));
            } else if (kVar instanceof k.b) {
                onEach = FlowKt.onEach(((k.b) kVar).a().a(), new d(null));
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                onEach = FlowKt.onEach(((k.d) kVar).a().a(), new e(null));
            }
            FlowKt.launchIn(onEach, this.c);
        }
    }

    public static Object f(f fVar) {
        return Reflection.property0(new PropertyReference0Impl(fVar.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void A() {
        if (l().getValue() instanceof d.a.C1608a) {
            k value = this.d.getValue();
            k.c cVar = value instanceof k.c ? (k.c) value : null;
            if (cVar != null) {
                cVar.a().h();
            } else {
                Y();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void C() {
        N();
        a(b.h.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void E() {
        k value = this.d.getValue();
        if (value instanceof k.a) {
            ((k.a) value).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
            return;
        }
        if (value instanceof k.c) {
            ((k.c) value).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
            return;
        }
        if (value instanceof k.b) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Empty CTA DEC playlist item reached", null, false, 12, null);
        } else if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else {
            if (value != null) {
                throw new NoWhenBranchMatchedException();
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Empty CTA playlist item reached", null, false, 12, null);
        }
    }

    public final void N() {
        k kVar = (k) CollectionsKt.firstOrNull((List) this.f11334a);
        if (kVar == null) {
            return;
        }
        a(kVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public StateFlow<Boolean> T() {
        return this.h;
    }

    public final boolean X() {
        List<k> list = this.f11334a;
        k kVar = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf((List<? extends k>) list, this.d.getValue()) + 1);
        if (kVar == null) {
            return false;
        }
        a(kVar);
        return true;
    }

    public final void Y() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b2;
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.f11334a, this.d.getValue());
        if (b2 != null) {
            b2.w();
        }
        if (X()) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = this.b;
        if (hVar != null) {
            hVar.a();
        }
        a(b.e.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.c, null, 1, null);
        for (k kVar : this.f11334a) {
            if (kVar instanceof k.a) {
                ((k.a) kVar).a().destroy();
            } else if (kVar instanceof k.c) {
                ((k.c) kVar).a().destroy();
            } else if (kVar instanceof k.b) {
                ((k.b) kVar).a().destroy();
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.d) kVar).a().destroy();
            }
        }
        a((k) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public StateFlow<i.a> k() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.i.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public StateFlow<Boolean> o() {
        return this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public void d() {
        N();
    }

    public final void a(k kVar) {
        this.d.setValue(kVar);
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().t();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> a() {
        return this.k;
    }

    public final Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new g(bVar, this, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c button) {
        a.AbstractC1622a.c b2;
        Intrinsics.checkNotNullParameter(button, "button");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.f11334a, this.d.getValue(), button);
        k value = this.d.getValue();
        if (value instanceof k.c) {
            ((k.c) value).a().a(b2);
            return;
        }
        if (value instanceof k.a) {
            ((k.a) value).a().a(b2);
            return;
        }
        if (value instanceof k.b) {
            ((k.b) value).a().a(b2);
        } else if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
        } else {
            if (value == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Displaying " + b2.d() + " at position: " + b2.e() + " of size: " + b2.f() + " in unknown playlist item type", null, false, 12, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c.EnumC1624a buttonType) {
        a.AbstractC1622a.c.EnumC1624a b2;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.f11334a, this.d.getValue(), buttonType);
        k value = this.d.getValue();
        if (value instanceof k.c) {
            ((k.c) value).a().a(b2);
            return;
        }
        if (value instanceof k.a) {
            ((k.a) value).a().a(b2);
            return;
        }
        if (value instanceof k.b) {
            ((k.b) value).a().a(b2);
        } else if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Empty onButtonUnRendered MRAID playlist item reached", null, false, 12, null);
        } else {
            if (value == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f11351a, "Unrendering " + b2 + " in unknown playlist item type", null, false, 12, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
