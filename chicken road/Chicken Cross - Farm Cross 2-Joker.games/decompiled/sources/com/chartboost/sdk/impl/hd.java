package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class hd extends pf implements tf {
    public final List d;
    public final a0 e;
    public final boolean f;
    public final CoroutineScope g;
    public final CoroutineScope h;
    public Job i;
    public final String j;
    public final List k;
    public final Set l;
    public int m;
    public j2 n;
    public float o;
    public boolean p;
    public boolean q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j2 f4793a;
        public final Deferred b;
        public final boolean c;

        public a(j2 renderable, Deferred job, boolean z) {
            Intrinsics.checkNotNullParameter(renderable, "renderable");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f4793a = renderable;
            this.b = job;
            this.c = z;
        }

        public final Deferred a() {
            return this.b;
        }

        public final j2 b() {
            return this.f4793a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4793a, aVar.f4793a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.f4793a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "RenderableJob(renderable=" + this.f4793a + ", job=" + this.b + ", isOptional=" + this.c + ")";
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a2 = hd.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a2 = hd.this.a(null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ hd e;
        public final /* synthetic */ Context f;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ j2 d;
            public final /* synthetic */ hd e;
            public final /* synthetic */ Context f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j2 j2Var, hd hdVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = j2Var;
                this.e = hdVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                j2 j2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.d.a(this.e);
                    j2 j2Var2 = this.d;
                    Context context = this.f;
                    this.b = j2Var2;
                    this.c = 1;
                    Object a2 = j2Var2.a(context, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2Var = j2Var2;
                    obj2 = a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2Var = (j2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(j2Var, Result.m8078boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, hd hdVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = hdVar;
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.d, this.e, this.f, continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            List list = this.d;
            hd hdVar = this.e;
            Context context = this.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((j2) it.next(), hdVar, context, null), 3, null);
                arrayList.add(async$default);
            }
            this.b = 1;
            Object awaitAll = AwaitKt.awaitAll(arrayList, this);
            return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ j2 c;
        public final /* synthetic */ hd d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j2 j2Var, hd hdVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.c = j2Var;
            this.d = hdVar;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.c.a(this.d);
                j2 j2Var = this.c;
                Context context = this.e;
                this.b = 1;
                a2 = j2Var.a(context, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
            }
            return Result.m8078boximpl(a2);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ hd e;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ List d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ hd f;

            /* renamed from: com.chartboost.sdk.impl.hd$f$a$a, reason: collision with other inner class name */
            public static final class C0213a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ j2 c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ hd e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0213a(j2 j2Var, Context context, hd hdVar, Continuation continuation) {
                    super(2, continuation);
                    this.c = j2Var;
                    this.d = context;
                    this.e = hdVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0213a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0213a(this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object a2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            j2 j2Var = this.c;
                            Context context = this.d;
                            this.b = 1;
                            a2 = j2Var.a(context, this);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            a2 = ((Result) obj).getValue();
                        }
                        if (Result.m8085isFailureimpl(a2)) {
                            mb.e(U3.j.d + this.e.j + "] Optional renderable background load failed: type=" + this.c.getClass().getSimpleName() + ", auctionId=" + this.e.u().c(), Result.m8082exceptionOrNullimpl(a2));
                        } else {
                            this.e.z().add(this.c);
                            mb.a(U3.j.d + this.e.j + "] Optional renderable loaded in background: type=" + this.c.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
                            this.c.a(this.d);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        mb.b(U3.j.d + this.e.j + "] Optional renderable background load exception: type=" + this.c.getClass().getSimpleName() + ", auctionId=" + this.e.u().c(), e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, Context context, hd hdVar, Continuation continuation) {
                super(2, continuation);
                this.d = list;
                this.e = context;
                this.f = hdVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.d, this.e, this.f, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List list = this.d;
                Context context = this.e;
                hd hdVar = this.f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0213a((j2) it.next(), context, hdVar, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, Context context, hd hdVar, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = context;
            this.e = hdVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.c, this.d, this.e, null);
                this.b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    public static final class g extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object b = hd.this.b(null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8078boximpl(b);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ Context e;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ j2 d;
            public final /* synthetic */ Context e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j2 j2Var, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = j2Var;
                this.e = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                j2 j2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 j2Var2 = this.d;
                    Context context = this.e;
                    this.b = j2Var2;
                    this.c = 1;
                    Object a2 = j2Var2.a(context, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2Var = j2Var2;
                    obj2 = a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2Var = (j2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(j2Var, Result.m8078boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = new h(this.d, this.e, continuation);
            hVar.c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            List list = this.d;
            Context context = this.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((j2) it.next(), context, null), 3, null);
                arrayList.add(async$default);
            }
            this.b = 1;
            Object awaitAll = AwaitKt.awaitAll(arrayList, this);
            return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
        }
    }

    public static final class i extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a2 = hd.this.a((Context) null, (List) null, (List) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ List d;
        public final /* synthetic */ hd e;
        public final /* synthetic */ Context f;

        public static final class a extends SuspendLambda implements Function2 {
            public Object b;
            public int c;
            public final /* synthetic */ j2 d;
            public final /* synthetic */ hd e;
            public final /* synthetic */ Context f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j2 j2Var, hd hdVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = j2Var;
                this.e = hdVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                j2 j2Var;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.d.a(this.e);
                    j2 j2Var2 = this.d;
                    Context context = this.f;
                    this.b = j2Var2;
                    this.c = 1;
                    Object a2 = j2Var2.a(context, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2Var = j2Var2;
                    obj2 = a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2Var = (j2) this.b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).getValue();
                }
                return TuplesKt.to(j2Var, Result.m8078boximpl(obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, hd hdVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = hdVar;
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.d, this.e, this.f, continuation);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            List list = this.d;
            hd hdVar = this.e;
            Context context = this.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((j2) it.next(), hdVar, context, null), 3, null);
                arrayList.add(async$default);
            }
            this.b = 1;
            Object awaitAll = AwaitKt.awaitAll(arrayList, this);
            return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ hd d;
        public final /* synthetic */ Context e;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ List d;
            public final /* synthetic */ hd e;
            public final /* synthetic */ Context f;

            /* renamed from: com.chartboost.sdk.impl.hd$k$a$a, reason: collision with other inner class name */
            public static final class C0214a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ Deferred c;
                public final /* synthetic */ hd d;
                public final /* synthetic */ j2 e;
                public final /* synthetic */ Context f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0214a(Deferred deferred, hd hdVar, j2 j2Var, Context context, Continuation continuation) {
                    super(2, continuation);
                    this.c = deferred;
                    this.d = hdVar;
                    this.e = j2Var;
                    this.f = context;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0214a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0214a(this.c, this.d, this.e, this.f, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Deferred deferred = this.c;
                            this.b = 1;
                            obj = deferred.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Object value = ((Result) obj).getValue();
                        if (Result.m8085isFailureimpl(value)) {
                            mb.e(U3.j.d + this.d.j + "] Optional renderable concurrent load failed: type=" + this.e.getClass().getSimpleName() + ", auctionId=" + this.d.u().c(), Result.m8082exceptionOrNullimpl(value));
                        } else {
                            this.d.z().add(this.e);
                            mb.a(U3.j.d + this.d.j + "] Optional renderable loaded (concurrent): type=" + this.e.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
                            this.e.a(this.f);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        mb.b(U3.j.d + this.d.j + "] Optional renderable concurrent load exception: type=" + this.e.getClass().getSimpleName() + ", auctionId=" + this.d.u().c(), e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, hd hdVar, Context context, Continuation continuation) {
                super(2, continuation);
                this.d = list;
                this.e = hdVar;
                this.f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.d, this.e, this.f, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                List<Pair> list = this.d;
                hd hdVar = this.e;
                Context context = this.f;
                for (Pair pair : list) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0214a((Deferred) pair.component2(), hdVar, (j2) pair.component1(), context, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list, hd hdVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = hdVar;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.c, this.d, this.e, null);
                this.b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ hd(List list, a0 a0Var, boolean z, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, a0Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }

    public final List A() {
        return this.d;
    }

    public final boolean B() {
        return this.q;
    }

    public void C() {
        String str = this.j;
        String c2 = this.e.c();
        int i2 = this.m;
        j2 j2Var = this.n;
        mb.a(U3.j.d + str + "] Starting renderable: auctionId=" + c2 + ", currentAdIndex=" + i2 + ", currentAdType=" + (j2Var != null ? j2Var.getClass().getSimpleName() : null), (Throwable) null, 2, (Object) null);
        j2 j2Var2 = this.n;
        if (j2Var2 != null) {
            j2Var2.D();
            if (this.q) {
                j2Var2.a(false);
            } else {
                j2Var2.a(t(), false);
            }
        }
    }

    public void c(boolean z) {
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void f() {
        tf n = n();
        if (n != null) {
            n.f();
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void i() {
        tf n = n();
        if (n != null) {
            n.i();
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void j() {
        tf n = n();
        if (n != null) {
            n.j();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public long l() {
        j2 j2Var = this.n;
        if (j2Var != null) {
            return j2Var.l();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.pf
    public boolean m() {
        j2 j2Var = this.n;
        if (j2Var != null && j2Var.m()) {
            return true;
        }
        Iterable indices = CollectionsKt.getIndices(this.d);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return false;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (nextInt > this.m && this.l.contains(this.d.get(nextInt))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.pf
    public View o() {
        j2 j2Var = this.n;
        if (j2Var != null && j2Var.m()) {
            j2 j2Var2 = this.n;
            if (j2Var2 != null) {
                return j2Var2.o();
            }
            return null;
        }
        int i2 = 0;
        for (int i3 = this.m + 1; i3 < this.d.size(); i3++) {
            j2 j2Var3 = (j2) this.d.get(i3);
            if (this.l.contains(j2Var3)) {
                if (i2 > 0) {
                    mb.a(U3.j.d + this.j + "] Skipped " + i2 + " unloaded renderable(s) before showing next ad", (Throwable) null, 2, (Object) null);
                }
                this.m = i3;
                j2Var3.a(this);
                this.n = j2Var3;
                return j2Var3.o();
            }
            mb.a(U3.j.d + this.j + "] Skipping renderable at index " + i3 + " (not yet loaded)", (Throwable) null, 2, (Object) null);
            i2++;
        }
        if (i2 > 0) {
            mb.a(U3.j.d + this.j + "] Reached end of sequence: " + i2 + " renderable(s) still loading in background. No more loaded renderables available at this time.", (Throwable) null, 2, (Object) null);
        } else {
            mb.a(U3.j.d + this.j + "] No more renderables to show", (Throwable) null, 2, (Object) null);
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.tf
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        tf n = n();
        if (n != null) {
            n.onError(error);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void p() {
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.p();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void q() {
        String str = this.j;
        String c2 = this.e.c();
        j2 j2Var = this.n;
        mb.a(U3.j.d + str + "] Pausing: auctionId=" + c2 + ", currentAdType=" + (j2Var != null ? j2Var.getClass().getSimpleName() : null), (Throwable) null, 2, (Object) null);
        j2 j2Var2 = this.n;
        if (j2Var2 != null) {
            j2Var2.q();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void r() {
        String str = this.j;
        String c2 = this.e.c();
        j2 j2Var = this.n;
        mb.a(U3.j.d + str + "] Resuming: auctionId=" + c2 + ", currentAdType=" + (j2Var != null ? j2Var.getClass().getSimpleName() : null) + ", isMuted=" + this.q + ", isDucked=" + this.p, (Throwable) null, 2, (Object) null);
        j2 j2Var2 = this.n;
        if (j2Var2 != null) {
            j2Var2.r();
            if (this.q) {
                j2Var2.a(false);
            } else {
                j2Var2.a(t(), false);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void s() {
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.s();
        }
    }

    public final float t() {
        if (this.p) {
            return 0.2f;
        }
        float f2 = this.o;
        if (f2 > 0.0f) {
            return f2;
        }
        return 1.0f;
    }

    public final a0 u() {
        return this.e;
    }

    public final long v() {
        j2 j2Var = this.n;
        if (j2Var != null) {
            return j2Var.w();
        }
        return 0L;
    }

    public final long w() {
        j2 j2Var = this.n;
        if (j2Var != null) {
            return j2Var.x();
        }
        return 0L;
    }

    public final j2 x() {
        return this.n;
    }

    public final int y() {
        return this.m;
    }

    public final Set z() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(j2 renderable) {
        Intrinsics.checkNotNullParameter(renderable, "renderable");
        return renderable.getClass().getSimpleName() + "(optional=" + renderable.A().o() + ")";
    }

    public hd(List renderables, a0 adMarkupConfig, boolean z, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.d = renderables;
        this.e = adMarkupConfig;
        this.f = z;
        this.g = coroutineScope;
        this.h = coroutineScope;
        this.j = Integer.toHexString(System.identityHashCode(this));
        this.k = Collections.synchronizedList(new ArrayList());
        this.l = Collections.synchronizedSet(new LinkedHashSet());
        this.m = -1;
        this.o = 1.0f;
        this.q = z;
    }

    public final Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        if (r0 == r4) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.chartboost.sdk.impl.hd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.chartboost.sdk.impl.hd] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.chartboost.sdk.impl.hd] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.chartboost.sdk.impl.hd$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // com.chartboost.sdk.impl.pf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        ?? r3;
        ?? r5;
        int i2;
        Result result;
        Object value;
        String message;
        hd hdVar;
        hd hdVar2;
        if (continuation instanceof b) {
            b bVar = (b) continuation;
            int i3 = bVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.g = i3 - Integer.MIN_VALUE;
                r3 = bVar;
                Object obj = r3.e;
                ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r5 = r3.g;
                if (r5 != 0) {
                    ResultKt.throwOnFailure(obj);
                    mb.a(U3.j.d + this.j + "] Load started: auctionId=" + this.e.c() + ", renderableCount=" + this.d.size() + ", loadMode=" + this.e.i(), (Throwable) null, 2, (Object) null);
                    this.l.clear();
                    if (this.d.isEmpty()) {
                        mb.b(U3.j.d + this.j + "] Load failed - no renderable units: auctionId=" + this.e.c(), (Throwable) null, 2, (Object) null);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Internal("Ad markup contains no renderable units.", new IllegalStateException())));
                    }
                    List list = this.d;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((j2) obj2).A().o()) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    r5 = (List) pair.component1();
                    List list2 = (List) pair.component2();
                    mb.a(U3.j.d + this.j + "] Renderables partitioned: criticalCount=" + r5.size() + ", optionalCount=" + list2.size() + ", types=[" + CollectionsKt.joinToString$default(this.d, ",", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.hd$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return hd.a((j2) obj3);
                        }
                    }, 30, null) + U3.j.e, (Throwable) null, 2, (Object) null);
                    try {
                        if (this.e.i() == gb.e) {
                            r3.b = this;
                            r3.c = r5;
                            r3.d = list2;
                            r3.g = 1;
                            value = a(context, r5, list2, r3);
                            if (value == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            hdVar2 = this;
                        } else {
                            r3.b = this;
                            r3.c = r5;
                            r3.d = list2;
                            r3.g = 2;
                            value = a(context, list2, r3);
                        }
                    } catch (ChartboostError.Load e2) {
                        e = e2;
                        r3 = this;
                        mb.b(U3.j.d + r3.j + "] MultiRenderable load failed: auctionId=" + r3.e.c() + ", errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                        Result.Companion companion2 = Result.INSTANCE;
                        value = Result.m8079constructorimpl(ResultKt.createFailure(e));
                        hdVar2 = r3;
                        if (Result.m8085isFailureimpl(value)) {
                        }
                        return value;
                    } catch (CancellationException e3) {
                        e = e3;
                        i2 = 2;
                        hdVar = this;
                        CoroutineScopeKt.cancel$default(hdVar.h, "MultiRenderable load cancelled; releasing background scope", null, i2, null);
                        throw e;
                    } catch (Exception e4) {
                        e = e4;
                        r3 = this;
                        coroutine_suspended = list2;
                        mb.b(U3.j.d + r3.j + "] MultiRenderable unexpected exception during load: auctionId=" + r3.e.c(), e);
                        String a2 = n7.a(e, 5);
                        String simpleName = e.getClass().getSimpleName();
                        message = e.getMessage();
                        if (message == null) {
                        }
                        if (r3.e.i() != gb.e) {
                        }
                        int size = r5.size();
                        int size2 = coroutine_suspended.size();
                        String joinToString$default = CollectionsKt.joinToString$default(r3.d, ",", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.hd$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                CharSequence b2;
                                b2 = hd.b((j2) obj3);
                                return b2;
                            }
                        }, 30, null);
                        Result.Companion companion3 = Result.INSTANCE;
                        value = Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Unexpected exception during renderable loading: " + message + " ExceptionType=" + simpleName + " LoadingStrategy=" + r11 + " CriticalCount=" + size + " OptionalCount=" + size2 + " Renderables=[" + joinToString$default + "] Thread=" + Thread.currentThread().getName() + " StackTrace=[" + a2 + U3.j.e, e)));
                        hdVar2 = r3;
                        if (Result.m8085isFailureimpl(value)) {
                        }
                        return value;
                    }
                } else {
                    try {
                        if (r5 == 1) {
                            List list3 = (List) r3.d;
                            List list4 = (List) r3.c;
                            hd hdVar3 = (hd) r3.b;
                            ResultKt.throwOnFailure(obj);
                            result = (Result) obj;
                            r3 = hdVar3;
                            coroutine_suspended = list3;
                            r5 = list4;
                        } else {
                            if (r5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List list5 = (List) r3.d;
                            List list6 = (List) r3.c;
                            hd hdVar4 = (hd) r3.b;
                            ResultKt.throwOnFailure(obj);
                            result = (Result) obj;
                            r3 = hdVar4;
                            coroutine_suspended = list5;
                            r5 = list6;
                        }
                        value = result.getValue();
                        hdVar2 = r3;
                    } catch (ChartboostError.Load e5) {
                        e = e5;
                        mb.b(U3.j.d + r3.j + "] MultiRenderable load failed: auctionId=" + r3.e.c() + ", errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                        Result.Companion companion22 = Result.INSTANCE;
                        value = Result.m8079constructorimpl(ResultKt.createFailure(e));
                        hdVar2 = r3;
                        if (Result.m8085isFailureimpl(value)) {
                        }
                        return value;
                    } catch (CancellationException e6) {
                        e = e6;
                        i2 = 2;
                        hdVar = r3;
                        CoroutineScopeKt.cancel$default(hdVar.h, "MultiRenderable load cancelled; releasing background scope", null, i2, null);
                        throw e;
                    } catch (Exception e7) {
                        e = e7;
                        mb.b(U3.j.d + r3.j + "] MultiRenderable unexpected exception during load: auctionId=" + r3.e.c(), e);
                        String a22 = n7.a(e, 5);
                        String simpleName2 = e.getClass().getSimpleName();
                        message = e.getMessage();
                        if (message == null) {
                            message = "<no_message>";
                        }
                        String str = r3.e.i() != gb.e ? "sequential" : "concurrent";
                        int size3 = r5.size();
                        int size22 = coroutine_suspended.size();
                        String joinToString$default2 = CollectionsKt.joinToString$default(r3.d, ",", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.hd$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                CharSequence b2;
                                b2 = hd.b((j2) obj3);
                                return b2;
                            }
                        }, 30, null);
                        Result.Companion companion32 = Result.INSTANCE;
                        value = Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Unexpected exception during renderable loading: " + message + " ExceptionType=" + simpleName2 + " LoadingStrategy=" + str + " CriticalCount=" + size3 + " OptionalCount=" + size22 + " Renderables=[" + joinToString$default2 + "] Thread=" + Thread.currentThread().getName() + " StackTrace=[" + a22 + U3.j.e, e)));
                        hdVar2 = r3;
                        if (Result.m8085isFailureimpl(value)) {
                        }
                        return value;
                    }
                }
                if (Result.m8085isFailureimpl(value)) {
                    CoroutineScopeKt.cancel$default(hdVar2.h, "MultiRenderable load failed; releasing background scope", null, 2, null);
                }
                return value;
            }
        }
        r3 = new b(continuation);
        Object obj3 = r3.e;
        ?? coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = r3.g;
        if (r5 != 0) {
        }
        if (Result.m8085isFailureimpl(value)) {
        }
        return value;
    }

    public final void b(Context context, List list) {
        Job launch$default;
        Context b2 = b(context);
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new k(list, this, b2, null), 3, null);
        this.i = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[LOOP:1: B:22:0x0098->B:23:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, List list, Continuation continuation) {
        g gVar;
        int i2;
        hd hdVar;
        List<Pair> list2;
        int size;
        int i3;
        boolean z;
        Iterator it;
        Pair pair;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i4 = gVar.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gVar.e = i4 - Integer.MIN_VALUE;
                Object obj = gVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((j2) it2.next()).a(this);
                    }
                    h hVar = new h(list, context, null);
                    gVar.b = this;
                    gVar.e = 1;
                    obj = SupervisorKt.supervisorScope(hVar, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hdVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hdVar = (hd) gVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (Result.m8086isSuccessimpl(((Result) ((Pair) obj2).component2()).getValue())) {
                        arrayList.add(obj2);
                    }
                }
                size = arrayList.size();
                int i5 = 0;
                i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    hdVar.l.add((j2) ((Pair) obj3).component1());
                }
                z = list2 instanceof Collection;
                if (z || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (Result.m8086isSuccessimpl(((Result) ((Pair) it.next()).component2()).getValue())) {
                            if (!z || !list2.isEmpty()) {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (Result.m8086isSuccessimpl(((Result) ((Pair) it3.next()).component2()).getValue()) && (i5 = i5 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            mb.a(U3.j.d + hdVar.j + "] Optional renderables sync load complete: " + i5 + "/" + list2.size() + " succeeded, auctionId=" + hdVar.e.c(), (Throwable) null, 2, (Object) null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8079constructorimpl(Unit.INSTANCE);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Pair pair2 : list2) {
                    j2 j2Var = (j2) pair2.component1();
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(((Result) pair2.component2()).getValue());
                    String str = m8082exceptionOrNullimpl != null ? j2Var.getClass().getSimpleName() + ": " + m8082exceptionOrNullimpl.getMessage() : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                mb.b(U3.j.d + hdVar.j + "] All " + list2.size() + " optional renderables failed: auctionId=" + hdVar.e.c() + ", failures=[" + CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null) + U3.j.e, (Throwable) null, 2, (Object) null);
                Result.Companion companion2 = Result.INSTANCE;
                pair = (Pair) CollectionsKt.firstOrNull(list2);
                if (pair != null || (r1 = Result.m8082exceptionOrNullimpl(((Result) pair.component2()).getValue())) == null) {
                    Throwable illegalStateException = new IllegalStateException("All optional renderables failed.");
                }
                return Result.m8079constructorimpl(ResultKt.createFailure(illegalStateException));
            }
        }
        gVar = new g(continuation);
        Object obj4 = gVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.e;
        if (i2 != 0) {
        }
        list2 = (List) obj4;
        ArrayList arrayList3 = new ArrayList();
        while (r4.hasNext()) {
        }
        size = arrayList3.size();
        int i52 = 0;
        i3 = 0;
        while (i3 < size) {
        }
        z = list2 instanceof Collection;
        if (z) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r3.hasNext()) {
        }
        mb.b(U3.j.d + hdVar.j + "] All " + list2.size() + " optional renderables failed: auctionId=" + hdVar.e.c() + ", failures=[" + CollectionsKt.joinToString$default(arrayList22, "; ", null, null, 0, null, null, 62, null) + U3.j.e, (Throwable) null, 2, (Object) null);
        Result.Companion companion22 = Result.INSTANCE;
        pair = (Pair) CollectionsKt.firstOrNull(list2);
        if (pair != null) {
        }
        Throwable illegalStateException2 = new IllegalStateException("All optional renderables failed.");
        return Result.m8079constructorimpl(ResultKt.createFailure(illegalStateException2));
    }

    public static final CharSequence a(j2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, List list2, Continuation continuation) {
        i iVar;
        int i2;
        hd hdVar;
        Iterator it;
        Object obj;
        Pair pair;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.g = i3 - Integer.MIN_VALUE;
                Object obj2 = iVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!list.isEmpty()) {
                        j jVar = new j(list, this, context, null);
                        iVar.b = this;
                        iVar.c = list;
                        iVar.d = list2;
                        iVar.g = 1;
                        obj2 = SupervisorKt.supervisorScope(jVar, iVar);
                        if (obj2 != coroutine_suspended) {
                            hdVar = this;
                        }
                    } else if (!list2.isEmpty()) {
                        iVar.g = 2;
                        Object b2 = b(context, list2, iVar);
                        if (b2 != coroutine_suspended) {
                            return b2;
                        }
                    } else {
                        mb.a("No renderables to load.", (Throwable) null, 2, (Object) null);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8079constructorimpl(Unit.INSTANCE);
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return ((Result) obj2).getValue();
                }
                list2 = (List) iVar.d;
                list = (List) iVar.c;
                hdVar = (hd) iVar.b;
                ResultKt.throwOnFailure(obj2);
                List list3 = (List) obj2;
                it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Result.m8085isFailureimpl(((Result) ((Pair) obj).component2()).getValue())) {
                        break;
                    }
                }
                pair = (Pair) obj;
                if (pair == null) {
                    j2 j2Var = (j2) pair.component1();
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(((Result) pair.component2()).getValue());
                    if (m8082exceptionOrNullimpl == null) {
                        m8082exceptionOrNullimpl = new IllegalStateException("Unknown critical load failure");
                    }
                    mb.b(U3.j.d + hdVar.j + "] Critical renderable failed: type=" + j2Var.getClass().getSimpleName() + ", auctionId=" + hdVar.e.c() + ", criticalCount=" + list.size() + ", optionalCount=" + list2.size(), m8082exceptionOrNullimpl);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (Result.m8086isSuccessimpl(((Result) ((Pair) obj3).component2()).getValue())) {
                        arrayList.add(obj3);
                    }
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    hdVar.l.add((j2) ((Pair) obj4).component1());
                }
                mb.a(U3.j.d + hdVar.j + "] All " + list.size() + " critical renderables loaded successfully, auctionId=" + hdVar.e.c(), (Throwable) null, 2, (Object) null);
                if (!list2.isEmpty()) {
                    hdVar.k.addAll(list2);
                }
                mb.a(U3.j.d + hdVar.j + "] Reporting load success after critical renderables ready.", (Throwable) null, 2, (Object) null);
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m8079constructorimpl(Unit.INSTANCE);
            }
        }
        iVar = new i(continuation);
        Object obj22 = iVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.g;
        if (i2 != 0) {
        }
        List list32 = (List) obj22;
        it = list32.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        pair = (Pair) obj;
        if (pair == null) {
        }
    }

    public void b(boolean z) {
        j2 j2Var;
        this.p = z;
        if (z) {
            if (this.q) {
                j2 j2Var2 = this.n;
                if (j2Var2 != null) {
                    pf.a((pf) j2Var2, false, 1, (Object) null);
                    return;
                }
                return;
            }
            this.o = 1.0f;
            j2 j2Var3 = this.n;
            if (j2Var3 != null) {
                pf.a((pf) j2Var3, 0.2f, false, 2, (Object) null);
                return;
            }
            return;
        }
        if (this.q || (j2Var = this.n) == null) {
            return;
        }
        pf.a((pf) j2Var, this.o, false, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, Continuation continuation) {
        c cVar;
        int i2;
        ArrayList<a> arrayList;
        hd hdVar;
        List list2;
        Deferred async$default;
        Iterator it;
        Object obj;
        Pair pair;
        Context context2 = context;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.h = i3 - Integer.MIN_VALUE;
                Object obj2 = cVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    List list3 = this.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (!((j2) obj3).A().o()) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Context b2 = b(context);
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            j2 j2Var = (j2) it2.next();
                            async$default = BuildersKt__Builders_commonKt.async$default(this.h, null, null, new e(j2Var, this, b2, null), 3, null);
                            arrayList.add(new a(j2Var, async$default, true));
                        }
                        d dVar = new d(arrayList2, this, context2, null);
                        cVar.b = this;
                        cVar.c = context2;
                        cVar.d = arrayList2;
                        cVar.e = arrayList;
                        cVar.h = 1;
                        obj2 = SupervisorKt.supervisorScope(dVar, cVar);
                        if (obj2 != coroutine_suspended) {
                            hdVar = this;
                            list2 = arrayList2;
                        }
                    } else {
                        cVar.h = 2;
                        Object b3 = b(context2, list, cVar);
                        if (b3 != coroutine_suspended) {
                            return b3;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return ((Result) obj2).getValue();
                }
                ?? r1 = (List) cVar.e;
                list2 = (List) cVar.d;
                Context context3 = (Context) cVar.c;
                hdVar = (hd) cVar.b;
                ResultKt.throwOnFailure(obj2);
                arrayList = r1;
                context2 = context3;
                List list4 = (List) obj2;
                it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Result.m8085isFailureimpl(((Result) ((Pair) obj).component2()).getValue())) {
                        break;
                    }
                }
                pair = (Pair) obj;
                if (pair == null) {
                    j2 j2Var2 = (j2) pair.component1();
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(((Result) pair.component2()).getValue());
                    if (m8082exceptionOrNullimpl == null) {
                        m8082exceptionOrNullimpl = new IllegalStateException("Unknown critical load failure");
                    }
                    mb.b(U3.j.d + hdVar.j + "] Critical renderable failed (concurrent): type=" + j2Var2.getClass().getSimpleName() + ", auctionId=" + hdVar.e.c() + ", criticalCount=" + list2.size() + ", optionalCount=" + arrayList.size(), m8082exceptionOrNullimpl);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        JobKt__JobKt.cancel$default(((a) it3.next()).a(), "A critical renderable failed.", null, 2, null);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list4) {
                    if (Result.m8086isSuccessimpl(((Result) ((Pair) obj4).component2()).getValue())) {
                        arrayList3.add(obj4);
                    }
                }
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj5 = arrayList3.get(i4);
                    i4++;
                    hdVar.l.add((j2) ((Pair) obj5).component1());
                }
                mb.a(U3.j.d + hdVar.j + "] All " + list2.size() + " critical renderables loaded successfully (concurrent), auctionId=" + hdVar.e.c(), (Throwable) null, 2, (Object) null);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (a aVar : arrayList) {
                    arrayList4.add(TuplesKt.to(aVar.b(), aVar.a()));
                }
                hdVar.b(context2, arrayList4);
                mb.a(U3.j.d + hdVar.j + "] Reporting load success after required renderables ready, monitoring " + arrayList.size() + " optional renderables in background.", (Throwable) null, 2, (Object) null);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8079constructorimpl(Unit.INSTANCE);
            }
        }
        cVar = new c(continuation);
        Object obj22 = cVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.h;
        if (i2 != 0) {
        }
        List list42 = (List) obj22;
        it = list42.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        pair = (Pair) obj;
        if (pair == null) {
        }
    }

    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        mb.a(U3.j.d + this.j + "] Stopping: auctionId=" + this.e.c() + ", reason=" + reason + ", loadedCount=" + this.l.size() + ", currentAdIndex=" + this.m, (Throwable) null, 2, (Object) null);
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k.clear();
        this.l.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((j2) it.next()).b(reason);
        }
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.a((tf) null);
        }
        this.n = null;
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((j2) it2.next()).a((tf) null);
        }
        this.m = -1;
        CoroutineScopeKt.cancel$default(this.h, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.pf
    public float a(boolean z) {
        this.q = true;
        j2 j2Var = this.n;
        if (j2Var != null) {
            this.o = this.p ? 0.2f : this.o;
            j2Var.a(z);
        }
        return this.o;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(float f2, boolean z) {
        this.q = false;
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.a(t(), z);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a() {
        tf n = n();
        if (n != null) {
            n.a();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(boolean z, Integer num, Integer num2, e4 e4Var) {
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.a(z, num, num2, e4Var);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(b7 type, r5 r5Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        j2 j2Var = this.n;
        if (j2Var != null) {
            j2Var.a(type, r5Var);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a(ke request) {
        Intrinsics.checkNotNullParameter(request, "request");
        tf n = n();
        if (n != null) {
            n.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(Context context) {
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((j2) it.next()).a(context);
        }
        List deferredOptionalRenderables = this.k;
        Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables, "deferredOptionalRenderables");
        synchronized (deferredOptionalRenderables) {
            List deferredOptionalRenderables2 = this.k;
            Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables2, "deferredOptionalRenderables");
            if (!deferredOptionalRenderables2.isEmpty()) {
                List deferredOptionalRenderables3 = this.k;
                Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables3, "deferredOptionalRenderables");
                emptyList = CollectionsKt.toList(deferredOptionalRenderables3);
                this.k.clear();
            } else {
                emptyList = CollectionsKt.emptyList();
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        a(context, emptyList);
        mb.a(U3.j.d + this.j + "] Started deferred optional renderables (" + emptyList.size() + " renderables)", (Throwable) null, 2, (Object) null);
    }

    public final void a(Context context, List list) {
        Job launch$default;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j2) it.next()).a(this);
        }
        Context b2 = b(context);
        Job job = this.i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new f(list, b2, this, null), 3, null);
        this.i = launch$default;
    }
}
