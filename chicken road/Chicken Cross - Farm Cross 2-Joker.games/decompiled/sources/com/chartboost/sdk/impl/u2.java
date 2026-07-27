package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.L6;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5023a;
    public final l1 b;
    public final a9 c;
    public final f2 d;
    public final CoroutineDispatcher e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public volatile Job i;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return u2.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = u2.this.i;
                if (job == null) {
                    return null;
                }
                this.b = 1;
                if (job.join(this) == coroutine_suspended) {
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

    public static final class b extends SuspendLambda implements Function2 {
        public int b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return u2.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            u2.this.b();
            return Unit.INSTANCE;
        }
    }

    public u2(Context context, l1 android2, a9 ifa, f2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f5023a = context;
        this.b = android2;
        this.c = ifa;
        this.d = base64Wrapper;
        this.e = ioDispatcher;
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.u2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.j();
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.u2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.i();
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.u2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u2.f();
            }
        });
        g();
    }

    public static final AtomicReference f() {
        return new AtomicReference(null);
    }

    public static final AtomicInteger i() {
        return new AtomicInteger();
    }

    public static final AtomicReference j() {
        return new AtomicReference(null);
    }

    public final AtomicReference c() {
        return (AtomicReference) this.h.getValue();
    }

    public final AtomicReference d() {
        return (AtomicReference) this.f.getValue();
    }

    public final AtomicInteger e() {
        return (AtomicInteger) this.g.getValue();
    }

    public final void g() {
        Job launch$default;
        try {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.e), null, null, new b(null), 3, null);
            this.i = launch$default;
        } catch (Throwable th) {
            mb.b("Error launching identity job", th);
        }
    }

    public final void h() {
        try {
            if (!a()) {
                mb.b("AppSetId dependency not present", (Throwable) null, 2, (Object) null);
                return;
            }
            Task a2 = this.b.a(this.f5023a);
            if (a2 != null) {
                final Function1 function1 = new Function1() { // from class: com.chartboost.sdk.impl.u2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return u2.a(u2.this, (AppSetIdInfo) obj);
                    }
                };
                a2.addOnSuccessListener(new OnSuccessListener() { // from class: com.chartboost.sdk.impl.u2$$ExternalSyntheticLambda4
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        u2.a(Function1.this, obj);
                    }
                });
            }
        } catch (Exception e) {
            mb.b("Error requesting AppSetId", e);
        }
    }

    public final i9 k() {
        if (this.i == null) {
            g();
            Unit unit = Unit.INSTANCE;
        }
        i9 i9Var = (i9) c().get();
        return i9Var == null ? a(this.f5023a) : i9Var;
    }

    public static /* synthetic */ Object a(u2 u2Var, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 150;
        }
        return u2Var.a(j, continuation);
    }

    public final void b() {
        h();
        c().set(a(this.f5023a));
    }

    public final Object a(long j, Continuation continuation) {
        return TimeoutKt.withTimeoutOrNull(j, new a(null), continuation);
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit a(u2 u2Var, AppSetIdInfo appSetIdInfo) {
        u2Var.a(appSetIdInfo);
        return Unit.INSTANCE;
    }

    public final i9 a(Context context) {
        try {
            h1 a2 = this.c.a();
            mb.b("IFA: " + a2, (Throwable) null, 2, (Object) null);
            String a3 = a2.a();
            ni b2 = a2.b();
            String a4 = this.c.a(context, b2 == ni.e);
            if (a3 != null) {
                a4 = "000000000";
            }
            String str = a4;
            String str2 = Chartboost.instanceId;
            if (jg.f4829a.d()) {
                jg.b(a3);
                jg.c(str);
            }
            return new i9(b2, a(a3, str, str2), str, a3, (String) d().get(), Integer.valueOf(e().get()), str2);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                mb.b(message, (Throwable) null, 2, (Object) null);
            }
            return new i9(null, null, null, null, null, null, null, 127, null);
        }
    }

    public /* synthetic */ u2(Context context, l1 l1Var, a9 a9Var, f2 f2Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, l1Var, a9Var, f2Var, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            x2.a(jSONObject, L6.X0, str);
        } else if (str2 != null) {
            x2.a(jSONObject, "uuid", str2);
        }
        String str4 = (String) d().get();
        if (str4 != null) {
            x2.a(jSONObject, "appsetid", str4);
        }
        if (str3 != null) {
            x2.a(jSONObject, "instance_id", str3);
        }
        f2 f2Var = this.d;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return f2Var.c(jSONObject2);
    }

    public final void a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            d().set(appSetIdInfo.getId());
            e().set(appSetIdInfo.getScope());
        }
    }

    public final boolean a() {
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
