package com.chartboost.sdk.impl;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class rh {
    public static final a m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f4999a;
    public long b;
    public long c;
    public long d;
    public long e;
    public b f;
    public th g;
    public Function0 h;
    public uh i;
    public String j;
    public final CompletableJob k;
    public final CoroutineScope l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("STARTED", 0);
        public static final b c = new b("PAUSED", 1);
        public static final b d = new b("STOPPED", 2);
        public static final b e = new b("COMPLETED", 3);
        public static final b f = new b("NOT_STARTED", 4);
        public static final /* synthetic */ b[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            b[] a2 = a();
            g = a2;
            h = EnumEntriesKt.enumEntries(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c, d, e, f};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5000a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5000a = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return rh.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                if (rh.this.d() == b.b) {
                    long uptimeMillis = (SystemClock.uptimeMillis() - rh.this.c) - rh.this.d;
                    rh rhVar = rh.this;
                    rhVar.b = RangesKt.coerceAtLeast(rhVar.f4999a - uptimeMillis, 0L);
                    th c = rh.this.c();
                    if (c != null) {
                        c.a(rh.this.b, rh.this.f4999a);
                    }
                    if (rh.this.b == 0) {
                        rh.this.f = b.e;
                        Function0 b = rh.this.b();
                        if (b != null) {
                            b.invoke();
                        }
                    } else {
                        this.b = 1;
                    }
                }
                return Unit.INSTANCE;
            } while (DelayKt.delay(16L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public rh(long j, Function0 function0, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f4999a = j;
        this.b = j;
        this.f = b.f;
        this.i = uh.c;
        this.j = "Reward in %d seconds";
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.k = SupervisorJob$default;
        this.l = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorJob$default));
        a(function0);
    }

    public final void e() {
        if (this.f == b.b) {
            this.f = b.c;
            this.e = SystemClock.uptimeMillis();
        }
    }

    public final void f() {
        this.f = b.f;
        long j = this.f4999a;
        this.b = j;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        th thVar = this.g;
        if (thVar != null) {
            thVar.a(j, j);
        }
    }

    public final void g() {
        b bVar = this.f;
        b bVar2 = b.b;
        if (bVar == bVar2 || bVar == b.e) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = c.f5000a[this.f.ordinal()];
        if (i == 1) {
            this.c = uptimeMillis;
            this.d = 0L;
        } else if (i == 2) {
            this.d += uptimeMillis - this.e;
        } else {
            if (i != 3) {
                return;
            }
            this.c = uptimeMillis;
            this.d = 0L;
        }
        this.f = bVar2;
        BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new d(null), 3, null);
    }

    public final void h() {
        this.f = b.d;
        a();
    }

    public final Function0 b() {
        return this.h;
    }

    public final th c() {
        return this.g;
    }

    public final b d() {
        return this.f;
    }

    public final void a(th thVar) {
        this.g = thVar;
        if (thVar != null) {
            thVar.a(this.b, this.f4999a);
        }
    }

    public final void a(Function0 function0) {
        this.h = function0;
    }

    public final void a(uh mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.i = mode;
        if (str != null) {
            this.j = str;
        }
        th thVar = this.g;
        if (thVar != null) {
            thVar.a(mode, str, str2);
        }
        th thVar2 = this.g;
        if (thVar2 != null) {
            thVar2.a(this.b, this.f4999a);
        }
    }

    public final void a() {
        a((th) null);
        JobKt__JobKt.cancelChildren$default((Job) this.k, (CancellationException) null, 1, (Object) null);
    }

    public /* synthetic */ rh(long j, Function0 function0, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}
