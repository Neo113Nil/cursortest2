package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.l4;
import com.chartboost.sdk.impl.xi;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class yi implements Closeable {
    public final xi b;
    public final List c;
    public final Function2 d;
    public final Function2 e;
    public final CoroutineDispatcher f;
    public final Object g;
    public CompletableJob h;
    public CoroutineScope i;
    public boolean j;
    public final AtomicBoolean k;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui uiVar, Continuation continuation) {
            return ((a) create(uiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ui uiVar = (ui) this.c;
                this.b = 1;
                c = com.chartboost.sdk.internal.clickthrough.b.c(uiVar, null, null, null, null, this, 30, null);
                if (c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c = ((Result) obj).getValue();
            }
            return Result.m8078boximpl(c);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui uiVar, Continuation continuation) {
            return ((b) create(uiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ui uiVar = (ui) this.c;
                this.b = 1;
                a2 = com.chartboost.sdk.internal.clickthrough.b.a(uiVar, null, null, null, null, null, this, 62, null);
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

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui uiVar, Continuation continuation) {
            return ((c) create(uiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ui uiVar = (ui) this.c;
                this.b = 1;
                a2 = com.chartboost.sdk.internal.clickthrough.b.a(uiVar, null, null, null, null, this, 30, null);
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

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui uiVar, Continuation continuation) {
            return ((d) create(uiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ui uiVar = (ui) this.c;
                this.b = 1;
                b = com.chartboost.sdk.internal.clickthrough.b.b(uiVar, null, null, null, null, this, 30, null);
                if (b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b = ((Result) obj).getValue();
            }
            return Result.m8078boximpl(b);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui uiVar, Continuation continuation) {
            return ((e) create(uiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = new e(continuation);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ui uiVar = (ui) this.c;
                this.b = 1;
                a2 = com.chartboost.sdk.internal.clickthrough.b.a(uiVar, null, null, null, null, null, this, 62, null);
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
        public /* synthetic */ Object c;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation continuation) {
            return ((f) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(continuation);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.c;
                this.b = 1;
                if (com.chartboost.sdk.internal.clickthrough.b.a(str, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5093a;
        public final l4.c b;
        public final Throwable c;

        public g(boolean z, l4.c cVar, Throwable th) {
            this.f5093a = z;
            this.b = cVar;
            this.c = th;
        }

        public final Throwable a() {
            return this.c;
        }

        public final l4.c b() {
            return this.b;
        }

        public final boolean c() {
            return this.f5093a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f5093a == gVar.f5093a && this.b == gVar.b && Intrinsics.areEqual(this.c, gVar.c);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f5093a) * 31;
            l4.c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Throwable th = this.c;
            return hashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ActionsOutcome(success=" + this.f5093a + ", lastMethod=" + this.b + ", lastError=" + this.c + ")";
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final l4 f5094a;
        public final boolean b;

        public h(l4 result, boolean z) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f5094a = result;
            this.b = z;
        }

        public final l4 a() {
            return this.f5094a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f5094a, hVar.f5094a) && this.b == hVar.b;
        }

        public int hashCode() {
            return (this.f5094a.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "AttemptOutcome(result=" + this.f5094a + ", terminal=" + this.b + ")";
        }
    }

    public static final class i extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public boolean e;
        public /* synthetic */ Object f;
        public int h;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return yi.this.a((String) null, (i4) null, false, (o4) null, false, (Continuation) this);
        }
    }

    public static final class j extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return yi.this.a((String) null, (i4) null, false, (o4) null, (Continuation) this);
        }
    }

    public static final class k extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return yi.this.b(null, null, false, null, this);
        }
    }

    public static final class l extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = yi.this.a((Function2) null, (ui) null, (o4) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class m extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return yi.this.a((ui) null, (o4) null, this);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ yi e;
        public final /* synthetic */ String f;
        public final /* synthetic */ i4 g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ o4 i;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;
        public final /* synthetic */ Ref.ObjectRef l;

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ yi c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yi yiVar, String str, Continuation continuation) {
                super(2, continuation);
                this.c = yiVar;
                this.d = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.c.e;
                    String str = this.d;
                    this.b = 1;
                    if (function2.invoke(str, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z, yi yiVar, String str, i4 i4Var, boolean z2, o4 o4Var, String str2, String str3, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.d = z;
            this.e = yiVar;
            this.f = str;
            this.g = i4Var;
            this.h = z2;
            this.i = o4Var;
            this.j = str2;
            this.k = str3;
            this.l = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
            nVar.c = obj;
            return nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
        
            if (r0 != r8) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        
            if (r0 == r8) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        
            if (r0 == r8) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            h hVar;
            Object b;
            h hVar2;
            Object a3;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                if (this.d) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, NonCancellable.INSTANCE, null, new a(this.e, this.k, null), 2, null);
                }
                yi yiVar = this.e;
                String str = this.f;
                i4 i4Var = this.g;
                boolean z = this.h;
                o4 o4Var = this.i;
                this.b = 1;
                a2 = yiVar.a(str, i4Var, z, o4Var, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        a3 = obj;
                        t = (l4) a3;
                        this.l.element = t;
                        return Unit.INSTANCE;
                    }
                    h hVar3 = (h) this.c;
                    ResultKt.throwOnFailure(obj);
                    hVar = hVar3;
                    b = obj;
                    hVar2 = (h) b;
                    if (hVar == null && hVar.b()) {
                        t = hVar.a();
                    } else if (hVar2 == null && hVar2.b()) {
                        t = hVar2.a();
                    } else {
                        yi yiVar2 = this.e;
                        String str2 = this.k;
                        i4 i4Var2 = this.g;
                        boolean z2 = this.h;
                        o4 o4Var2 = this.i;
                        boolean z3 = this.d;
                        this.c = null;
                        this.b = 3;
                        a3 = yiVar2.a(str2, i4Var2, z2, o4Var2, z3, this);
                    }
                    this.l.element = t;
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a2 = obj;
            }
            hVar = (h) a2;
            if (hVar == null || !hVar.b()) {
                yi yiVar3 = this.e;
                String str3 = this.j;
                i4 i4Var3 = this.g;
                boolean z4 = this.h;
                o4 o4Var3 = this.i;
                this.c = hVar;
                this.b = 2;
                b = yiVar3.b(str3, i4Var3, z4, o4Var3, this);
            } else {
                hVar2 = null;
                if (hVar == null) {
                }
                if (hVar2 == null) {
                }
                yi yiVar22 = this.e;
                String str22 = this.k;
                i4 i4Var22 = this.g;
                boolean z22 = this.h;
                o4 o4Var22 = this.i;
                boolean z32 = this.d;
                this.c = null;
                this.b = 3;
                a3 = yiVar22.a(str22, i4Var22, z22, o4Var22, z32, this);
            }
        }
    }

    public yi(xi urlRedirect, List actions, Function2 deeplinkAction, Function2 backgroundAction, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(urlRedirect, "urlRedirect");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(deeplinkAction, "deeplinkAction");
        Intrinsics.checkNotNullParameter(backgroundAction, "backgroundAction");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.b = urlRedirect;
        this.c = actions;
        this.d = deeplinkAction;
        this.e = backgroundAction;
        this.f = ioDispatcher;
        this.g = new Object();
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.h = SupervisorJob$default;
        this.i = CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(ioDispatcher));
        this.k = new AtomicBoolean(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.g) {
            if (this.j) {
                return;
            }
            this.j = true;
            Job.DefaultImpls.cancel$default((Job) this.h, (CancellationException) null, 1, (Object) null);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, i4 i4Var, boolean z, o4 o4Var, Continuation continuation) {
        k kVar;
        int i2;
        boolean d2;
        Object a2;
        yi yiVar;
        yi yiVar2;
        Throwable m8082exceptionOrNullimpl;
        String str2 = str;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i3 = kVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.f = i3 - Integer.MIN_VALUE;
                Object obj = kVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar.f;
                if (i2 == 0) {
                    if (i2 == 1) {
                        str2 = (String) kVar.c;
                        yiVar2 = (yi) kVar.b;
                        ResultKt.throwOnFailure(obj);
                        g gVar = (g) obj;
                        return new h(new l4(l4.d.e, gVar.b(), gVar.c() ? null : yiVar2.a(str2, gVar.a())), true);
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) kVar.c;
                    yiVar = (yi) kVar.b;
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                    if (m8082exceptionOrNullimpl == null) {
                        return new h(new l4(l4.d.e, l4.c.d, yiVar.a(str2, m8082exceptionOrNullimpl)), false);
                    }
                    return new h(new l4(l4.d.e, l4.c.d, null, 4, null), true);
                }
                ResultKt.throwOnFailure(obj);
                if (str2 == null) {
                    return null;
                }
                ui uiVar = new ui(str, i4Var, z);
                d2 = zi.d(str);
                if (d2) {
                    kVar.b = this;
                    kVar.c = str2;
                    kVar.f = 1;
                    obj = a(uiVar, o4Var, kVar);
                    if (obj != coroutine_suspended) {
                        yiVar2 = this;
                        g gVar2 = (g) obj;
                        return new h(new l4(l4.d.e, gVar2.b(), gVar2.c() ? null : yiVar2.a(str2, gVar2.a())), true);
                    }
                } else {
                    Function2 function2 = this.d;
                    kVar.b = this;
                    kVar.c = str2;
                    kVar.f = 2;
                    a2 = a(function2, uiVar, o4Var, kVar);
                    if (a2 != coroutine_suspended) {
                        yiVar = this;
                        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                        if (m8082exceptionOrNullimpl == null) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.f;
        if (i2 == 0) {
        }
    }

    public final void a() {
        synchronized (this.g) {
            if (this.j) {
                return;
            }
            Job.DefaultImpls.cancel$default((Job) this.h, (CancellationException) null, 1, (Object) null);
            CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
            this.h = SupervisorJob$default;
            this.i = CoroutineScopeKt.CoroutineScope(SupervisorJob$default.plus(this.f));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final CBError.Click a(String str, i4 clkp, o4 o4Var, boolean z, String str2, String str3, boolean z2, final Function1 function1, boolean z3) {
        CoroutineScope coroutineScope;
        l4 l4Var;
        Job launch$default;
        boolean c2;
        boolean b2;
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        if (str != null && str.length() != 0) {
            if (z3) {
                c2 = zi.c(str);
                if (c2) {
                    b2 = zi.b(str, "about");
                    if (b2) {
                        mb.e("Clickthrough url with 'about' scheme ignored", null, 2, null);
                        if (function1 != null) {
                            function1.invoke(l4.d.c("Clickthrough url with 'about' scheme: " + str));
                        }
                        return CBError.Click.URI_INVALID;
                    }
                } else {
                    mb.e("Url is missing a scheme; refusing to navigate: " + str, null, 2, null);
                    if (function1 != null) {
                        function1.invoke(l4.d.c("Url is missing a scheme: " + str));
                    }
                    return CBError.Click.URI_INVALID;
                }
            }
            if (!this.k.compareAndSet(false, true)) {
                mb.a("Clickthrough already in-flight; dropping " + str, (Throwable) null, 2, (Object) null);
                if (function1 != null) {
                    function1.invoke(l4.d.a("gate in-flight"));
                }
                return null;
            }
            synchronized (this.g) {
                if (this.j) {
                    this.k.set(false);
                    mb.e("Url resolver is closed; dropping resolve for " + str + ".", null, 2, null);
                    l4Var = l4.d.a("resolver closed");
                    coroutineScope = null;
                } else {
                    coroutineScope = this.i;
                    l4Var = null;
                }
            }
            if (coroutineScope == null) {
                if (l4Var != null && function1 != null) {
                    function1.invoke(l4Var);
                }
                return CBError.Click.URI_INVALID;
            }
            mb.a("Resolving url: " + str + ", clickPreference: " + clkp + ", userGesture: " + z, (Throwable) null, 2, (Object) null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new n(z2, this, str2, clkp, z, o4Var, str3, str, objectRef, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: com.chartboost.sdk.impl.yi$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return yi.a(yi.this, objectRef, function1, (Throwable) obj);
                }
            });
            return null;
        }
        mb.e("Url is null or empty.", null, 2, null);
        if (function1 != null) {
            function1.invoke(l4.d.b("Url is null or empty."));
        }
        return CBError.Click.URI_INVALID;
    }

    public /* synthetic */ yi(xi xiVar, List list, Function2 function2, Function2 function22, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xiVar, (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Function2[]{new a(null), new b(null), new c(null), new d(null)}) : list, (i2 & 4) != 0 ? new e(null) : function2, (i2 & 8) != 0 ? new f(null) : function22, (i2 & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit a(yi yiVar, Ref.ObjectRef objectRef, Function1 function1, Throwable th) {
        yiVar.k.set(false);
        l4 l4Var = (l4) objectRef.element;
        if (l4Var != null && function1 != null) {
            function1.invoke(l4Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, i4 i4Var, boolean z, o4 o4Var, Continuation continuation) {
        j jVar;
        int i2;
        Object a2;
        yi yiVar;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f = i3 - Integer.MIN_VALUE;
                Object obj = jVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = jVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str == null) {
                        return null;
                    }
                    ui uiVar = new ui(str, i4Var, z);
                    Function2 function2 = this.d;
                    jVar.b = this;
                    jVar.c = str;
                    jVar.f = 1;
                    a2 = a(function2, uiVar, o4Var, jVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    yiVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar.c;
                    yiVar = (yi) jVar.b;
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                }
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                if (m8082exceptionOrNullimpl != null) {
                    return new h(new l4(l4.d.d, l4.c.d, null, 4, null), true);
                }
                return new h(new l4(l4.d.d, l4.c.d, yiVar.a(str, m8082exceptionOrNullimpl)), false);
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = jVar.f;
        if (i2 != 0) {
        }
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        if (m8082exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, i4 i4Var, boolean z, o4 o4Var, boolean z2, Continuation continuation) {
        i iVar;
        int i2;
        yi yiVar;
        o4 o4Var2;
        boolean z3;
        i4 i4Var2;
        yi yiVar2;
        boolean c2;
        boolean b2;
        Object obj;
        Object obj2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.h = i3 - Integer.MIN_VALUE;
                Object obj3 = iVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (z2) {
                        o4Var2 = o4Var;
                        z3 = z;
                        i4Var2 = i4Var;
                        yiVar2 = this;
                        c2 = zi.c(str);
                        if (c2) {
                            b2 = zi.b(str, "about");
                            if (b2) {
                                mb.e("Creative clickthrough url with 'about' scheme ignored: " + str, null, 2, null);
                                return l4.d.c("Clickthrough url with 'about' scheme: " + str);
                            }
                            ui uiVar = new ui(str, i4Var2, z3);
                            iVar.b = yiVar2;
                            iVar.c = str;
                            iVar.d = null;
                            iVar.h = 2;
                            Object a2 = yiVar2.a(uiVar, o4Var2, iVar);
                            obj2 = a2;
                        } else {
                            mb.e("Creative clickthrough URL is missing a scheme; refusing to navigate: " + str, null, 2, null);
                            return l4.d.c("Url is missing a scheme: " + str);
                        }
                    } else {
                        iVar.b = this;
                        iVar.c = i4Var;
                        iVar.d = o4Var;
                        iVar.e = z;
                        iVar.h = 1;
                        Object a3 = a(str, o4Var, iVar);
                        if (a3 != coroutine_suspended) {
                            yiVar = this;
                            obj = a3;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) iVar.c;
                        yiVar2 = (yi) iVar.b;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        g gVar = (g) obj2;
                        return new l4(l4.d.c, gVar.b(), gVar.c() ? null : yiVar2.a(str, gVar.a()));
                    }
                    z = iVar.e;
                    o4Var = (o4) iVar.d;
                    i4Var = (i4) iVar.c;
                    yiVar = (yi) iVar.b;
                    ResultKt.throwOnFailure(obj3);
                    obj = obj3;
                }
                i4 i4Var3 = i4Var;
                yiVar2 = yiVar;
                str = (String) obj;
                o4Var2 = o4Var;
                z3 = z;
                i4Var2 = i4Var3;
                c2 = zi.c(str);
                if (c2) {
                }
            }
        }
        iVar = new i(continuation);
        Object obj32 = iVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.h;
        if (i2 != 0) {
        }
        i4 i4Var32 = i4Var;
        yiVar2 = yiVar;
        str = (String) obj;
        o4Var2 = o4Var;
        z3 = z;
        i4Var2 = i4Var32;
        c2 = zi.c(str);
        if (c2) {
        }
    }

    public final Object a(String str, o4 o4Var, Continuation continuation) {
        Object a2 = a(xi.a(this.b, str, 0, 2, null), str, o4Var);
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
        return m8082exceptionOrNullimpl == null ? (String) a2 : m8082exceptionOrNullimpl instanceof xi.b.e ? ((xi.b.e) m8082exceptionOrNullimpl).a() : str;
    }

    public final Object a(Object obj, String str, o4 o4Var) {
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj);
        if (m8082exceptionOrNullimpl == null) {
            String str2 = (String) obj;
            if (o4Var != null) {
                o4Var.a("Redirection successful from " + str + " to " + str2);
            }
            mb.a("Redirection successful from " + str + " to " + str2, (Throwable) null, 2, (Object) null);
            return obj;
        }
        if (o4Var != null) {
            o4Var.b("Redirection failed for " + str + ": " + m8082exceptionOrNullimpl);
        }
        mb.e("Redirection failed for " + str + ": " + m8082exceptionOrNullimpl, null, 2, null);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ui uiVar, o4 o4Var, Continuation continuation) {
        m mVar;
        int i2;
        yi yiVar;
        ui uiVar2;
        Iterator it;
        m mVar2;
        Ref.ObjectRef objectRef;
        o4 o4Var2;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i3 = mVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.i = i3 - Integer.MIN_VALUE;
                Object obj = mVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = mVar.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    yiVar = this;
                    uiVar2 = uiVar;
                    it = this.c.iterator();
                    mVar2 = mVar;
                    objectRef = objectRef2;
                    o4Var2 = o4Var;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) mVar.f;
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) mVar.e;
                    o4 o4Var3 = (o4) mVar.d;
                    ui uiVar3 = (ui) mVar.c;
                    yiVar = (yi) mVar.b;
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = ((Result) obj).getValue();
                    m mVar3 = mVar;
                    objectRef = objectRef3;
                    uiVar2 = uiVar3;
                    m mVar4 = mVar3;
                    String a2 = Result.m8082exceptionOrNullimpl(obj2) != null ? ((ti) obj2).a() : null;
                    if (a2 != null) {
                        ?? m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj2);
                        if (m8082exceptionOrNullimpl != 0 && !(m8082exceptionOrNullimpl instanceof com.chartboost.sdk.internal.clickthrough.a)) {
                            objectRef.element = m8082exceptionOrNullimpl;
                        }
                        o4Var2 = o4Var3;
                        mVar2 = mVar4;
                        if (!it.hasNext()) {
                            Function2 function2 = (Function2) it.next();
                            mVar2.b = yiVar;
                            mVar2.c = uiVar2;
                            mVar2.d = o4Var2;
                            mVar2.e = objectRef;
                            mVar2.f = it;
                            mVar2.i = 1;
                            Object a3 = yiVar.a(function2, uiVar2, o4Var2, mVar2);
                            if (a3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mVar3 = mVar2;
                            o4Var3 = o4Var2;
                            obj2 = a3;
                            m mVar42 = mVar3;
                            if (Result.m8082exceptionOrNullimpl(obj2) != null) {
                            }
                            if (a2 != null) {
                                return new g(true, yiVar.a(a2), null);
                            }
                        } else {
                            if (o4Var2 != null) {
                                o4Var2.b("None of the actions was able to process URL " + uiVar2.b());
                            }
                            mb.b("None of the actions was able to process URL " + uiVar2.b(), (Throwable) null, 2, (Object) null);
                            return new g(false, null, (Throwable) objectRef.element);
                        }
                    }
                }
            }
        }
        mVar = new m(continuation);
        Object obj3 = mVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = mVar.i;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, ui uiVar, o4 o4Var, Continuation continuation) {
        l lVar;
        int i2;
        Object value;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i3 = lVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.f = i3 - Integer.MIN_VALUE;
                Object obj = lVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    lVar.b = uiVar;
                    lVar.c = o4Var;
                    lVar.f = 1;
                    obj = function2.invoke(uiVar, lVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o4Var = (o4) lVar.c;
                    uiVar = (ui) lVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.m8086isSuccessimpl(value)) {
                    ti tiVar = (ti) value;
                    if (o4Var != null) {
                        o4Var.a("Url " + uiVar.b() + " opened with action " + tiVar.a());
                    }
                    mb.a("Url " + uiVar.b() + " opened with action " + tiVar.a(), (Throwable) null, 2, (Object) null);
                }
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
                if (m8082exceptionOrNullimpl != null && !(m8082exceptionOrNullimpl instanceof com.chartboost.sdk.internal.clickthrough.a)) {
                    if (o4Var != null) {
                        o4Var.b("Url " + uiVar.b() + " opening failed with error " + m8082exceptionOrNullimpl);
                    }
                    mb.b("Url " + uiVar.b() + " opening failed with error " + m8082exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
                }
                return value;
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar.f;
        if (i2 != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.m8086isSuccessimpl(value)) {
        }
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
        if (m8082exceptionOrNullimpl != null) {
            if (o4Var != null) {
            }
            mb.b("Url " + uiVar.b() + " opening failed with error " + m8082exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
        }
        return value;
    }

    public final l4.c a(String str) {
        return Intrinsics.areEqual(str, "openInEmbeddedBrowser") ? l4.c.c : l4.c.d;
    }

    public final l4.b a(String str, Throwable th) {
        if (th != null) {
            String simpleName = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = th.getClass().getName();
            }
            String str2 = str + ": " + simpleName;
            if (str2 != null) {
                str = str2;
            }
        }
        return l4.b.a.a(l4.b.f, str, false, 2, null);
    }
}
