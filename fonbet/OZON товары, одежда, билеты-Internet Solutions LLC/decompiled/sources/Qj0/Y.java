package Qj0;

import Je.InterfaceC3394a;
import Sc.InterfaceC3999a;
import Sc.r;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.wallet.WalletConstants;
import hi0.InterfaceC6959a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import mi0.InterfaceC8339i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.model.TraceEntity;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;
import ve.EnumC10311b;
import xe.C10727i;
import ze.C11115c;

@SuppressLint({"CheckResult"})
/* loaded from: classes7.dex */
public final class Y implements V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.tracker.performance.d f23550a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fi0.x f23551b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f23552c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f23553d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC8339i f23554e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xe.M f23555f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.tracker.process.lifecycle.a f23556g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Yj0.a f23557h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final xe.I f23558i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.common.cache.b<String, U> f23559j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Je.d f23560k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final LinkedBlockingQueue<TraceEntity> f23561l;

    /* renamed from: m, reason: collision with root package name */
    private final List<TraceEntity> f23562m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C11115c f23563n;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$1", f = "TraceController.kt", l = {116}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23564d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$1$1", f = "TraceController.kt", l = {117, 119, 121, 122}, m = "invokeSuspend")
        /* renamed from: Qj0.Y$a$a, reason: collision with other inner class name */
        static final class C0476a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f23566d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Y f23567e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0476a(Y y11, kotlin.coroutines.d<? super C0476a> dVar) {
                super(2, dVar);
                this.f23567e = y11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0476a(this.f23567e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0476a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
            
                if (r8.b(r7) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
            
                if (r1.n(r8, r7) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
            
                if (r8 == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
            
                if (Qj0.Y.g(r6, r7) == r0) goto L27;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f23566d;
                Y y11 = this.f23567e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f23566d = 1;
                } else if (i11 == 1) {
                    Sc.s.b(obj);
                } else {
                    if (i11 == 2) {
                        Sc.s.b(obj);
                        List list = (List) obj;
                        if (!list.isEmpty()) {
                            C11115c c11115c = y11.f23563n;
                            this.f23566d = 3;
                        }
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                    l0 l0Var = y11.f23552c;
                    this.f23566d = 4;
                }
                l0 l0Var2 = y11.f23552c;
                this.f23566d = 2;
                obj = l0Var2.g(this);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23564d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Y y11 = Y.this;
                ru.ozon.tracker.process.lifecycle.a aVar2 = y11.f23556g;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                C0476a c0476a = new C0476a(y11, null);
                this.f23564d = 1;
                if (aVar2.c(applicationLifecycleState, c0476a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$2", f = "TraceController.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23568d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Tj0.a f23570f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$2$1", f = "TraceController.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Y f23571d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Tj0.a f23572e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y y11, Tj0.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f23571d = y11;
                this.f23572e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f23571d, this.f23572e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                Y y11 = this.f23571d;
                if (!Y.s(y11)) {
                    this.f23572e.a(y11);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Tj0.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f23570f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new b(this.f23570f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23568d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Y y11 = Y.this;
                ru.ozon.tracker.process.lifecycle.a aVar2 = y11.f23556g;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                a aVar3 = new a(y11, this.f23570f, null);
                this.f23568d = 1;
                if (aVar2.c(applicationLifecycleState, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$3", f = "TraceController.kt", l = {136}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23573d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6959a f23575f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$3$1", f = "TraceController.kt", l = {138}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f23576d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Y f23577e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6959a f23578f;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$3$1$1", f = "TraceController.kt", l = {139}, m = "invokeSuspend")
            /* renamed from: Qj0.Y$c$a$a, reason: collision with other inner class name */
            static final class C0477a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f23579d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Y f23580e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0477a(Y y11, kotlin.coroutines.d<? super C0477a> dVar) {
                    super(2, dVar);
                    this.f23580e = y11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0477a(this.f23580e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0477a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f23579d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                        this.f23579d = 1;
                        if (Y.A(this.f23580e, applicationLifecycleState, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y y11, InterfaceC6959a interfaceC6959a, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f23577e = y11;
                this.f23578f = interfaceC6959a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f23577e, this.f23578f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f23576d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Y y11 = this.f23577e;
                    if (y11.f23551b.D().c()) {
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        long h11 = kotlin.time.c.h(1L, EnumC10311b.MINUTES);
                        C0477a c0477a = new C0477a(y11, null);
                        this.f23576d = 1;
                        if (this.f23578f.a(h11, c0477a, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6959a interfaceC6959a, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f23575f = interfaceC6959a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new c(this.f23575f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23573d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Y y11 = Y.this;
                ru.ozon.tracker.process.lifecycle.a aVar2 = y11.f23556g;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                a aVar3 = new a(y11, this.f23575f, null);
                this.f23573d = 1;
                if (aVar2.c(applicationLifecycleState, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$4", f = "TraceController.kt", l = {146}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23581d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$4$1", f = "TraceController.kt", l = {147, 148}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            ze.j f23583d;

            /* renamed from: e, reason: collision with root package name */
            int f23584e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Y f23585f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y y11, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f23585f = y11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f23585f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
            
                if (Qj0.Y.h(r2, r7, r6) == r0) goto L20;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:6:0x0013). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ze.j it;
                ze.j jVar;
                Object b11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f23584e;
                Y y11 = this.f23585f;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    it = y11.f23563n.iterator();
                    this.f23583d = it;
                    this.f23584e = 1;
                    b11 = it.b(this);
                    if (b11 != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = this.f23583d;
                    Sc.s.b(obj);
                    it = jVar;
                    this.f23583d = it;
                    this.f23584e = 1;
                    b11 = it.b(this);
                    if (b11 != aVar) {
                        jVar = it;
                        obj = b11;
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.f71690a;
                        }
                        List list = (List) jVar.next();
                        this.f23583d = jVar;
                        this.f23584e = 2;
                    }
                    return aVar;
                }
                jVar = this.f23583d;
                Sc.s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23581d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Y y11 = Y.this;
                ru.ozon.tracker.process.lifecycle.a aVar2 = y11.f23556g;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                a aVar3 = new a(y11, null);
                this.f23581d = 1;
                if (aVar2.c(applicationLifecycleState, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$5", f = "TraceController.kt", l = {158}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23586d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ fi0.v f23588f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$5$1", f = "TraceController.kt", l = {159}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f23589d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Y f23590e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ fi0.v f23591f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y y11, fi0.v vVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f23590e = y11;
                this.f23591f = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f23590e, this.f23591f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f23589d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    boolean d11 = this.f23591f.d();
                    this.f23589d = 1;
                    if (Y.u(this.f23590e, d11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(fi0.v vVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f23588f = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new e(this.f23588f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23586d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Y y11 = Y.this;
                ru.ozon.tracker.process.lifecycle.a aVar2 = y11.f23556g;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.BACKGROUND;
                a aVar3 = new a(y11, this.f23588f, null);
                this.f23586d = 1;
                if (aVar2.c(applicationLifecycleState, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$sendAllPerfEvents$1", f = "TraceController.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f23592d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ApplicationLifecycleState f23594f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f23595g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ApplicationLifecycleState applicationLifecycleState, Function1<? super Integer, Unit> function1, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f23594f = applicationLifecycleState;
            this.f23595g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Y.this.new f(this.f23594f, this.f23595g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23592d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f23592d = 1;
                if (Y.z(Y.this, this.f23594f, this.f23595g, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl", f = "TraceController.kt", l = {520, 385}, m = "syncClearAllPerfEvents")
    /* loaded from: classes3.dex */
    static final class g extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f23596d;

        /* renamed from: e, reason: collision with root package name */
        Je.d f23597e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23598f;

        /* renamed from: h, reason: collision with root package name */
        int f23600h;

        g(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23598f = obj;
            this.f23600h |= LinearLayoutManager.INVALID_OFFSET;
            return Y.this.f(this);
        }
    }

    public Y(@NotNull Tj0.a skipPerfTracesInLowPowerModeInteractor, @NotNull ru.ozon.tracker.performance.d traceMapper, @NotNull fi0.x settings, @NotNull l0 traceRepository, @NotNull PowerManagerRepository powerManagerRepository, @NotNull InterfaceC8339i perfLogger, @NotNull xe.M trackerScope, @NotNull ru.ozon.tracker.process.lifecycle.a lifecycleActionExecutor, @NotNull Yj0.a lifecycleStateProvider, @NotNull xe.I trackerDispatcher, @NotNull InterfaceC6959a coroutineCron, @NotNull fi0.v backgroundModeConfig) {
        Intrinsics.checkNotNullParameter(skipPerfTracesInLowPowerModeInteractor, "skipPerfTracesInLowPowerModeInteractor");
        Intrinsics.checkNotNullParameter(traceMapper, "traceMapper");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(traceRepository, "traceRepository");
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(trackerScope, "trackerScope");
        Intrinsics.checkNotNullParameter(lifecycleActionExecutor, "lifecycleActionExecutor");
        Intrinsics.checkNotNullParameter(lifecycleStateProvider, "lifecycleStateProvider");
        Intrinsics.checkNotNullParameter(trackerDispatcher, "trackerDispatcher");
        Intrinsics.checkNotNullParameter(coroutineCron, "coroutineCron");
        Intrinsics.checkNotNullParameter(backgroundModeConfig, "backgroundModeConfig");
        this.f23550a = traceMapper;
        this.f23551b = settings;
        this.f23552c = traceRepository;
        this.f23553d = powerManagerRepository;
        this.f23554e = perfLogger;
        this.f23555f = trackerScope;
        this.f23556g = lifecycleActionExecutor;
        this.f23557h = lifecycleStateProvider;
        this.f23558i = trackerDispatcher;
        com.google.common.cache.c<Object, Object> c11 = com.google.common.cache.c.c();
        c11.b(100L);
        this.f23559j = c11.a();
        this.f23560k = new Je.d(false);
        this.f23561l = new LinkedBlockingQueue<>();
        this.f23562m = Collections.synchronizedList(new ArrayList());
        this.f23563n = ze.k.a(0, 7, null);
        if (settings.D().b()) {
            settings.D().getClass();
        } else {
            powerManagerRepository.registerPowerManagerReceiver();
        }
        C10727i.c(trackerScope, null, null, new a(null), 3);
        C10727i.c(trackerScope, null, null, new b(skipPerfTracesInLowPowerModeInteractor, null), 3);
        C10727i.c(trackerScope, null, null, new c(coroutineCron, null), 3);
        C10727i.c(trackerScope, null, null, new d(null), 3);
        if (backgroundModeConfig.d() || backgroundModeConfig.b()) {
            C10727i.c(trackerScope, null, null, new e(backgroundModeConfig, null), 3);
        }
    }

    static Object A(Y y11, ApplicationLifecycleState applicationLifecycleState, kotlin.coroutines.d dVar) {
        y11.getClass();
        i0 i0Var = new i0(y11, applicationLifecycleState, null, null);
        return C10727i.f(y11.f23558i, i0Var, (kotlin.coroutines.jvm.internal.j) dVar);
    }

    public static U b(Y y11, String str) {
        fi0.x xVar = y11.f23551b;
        if (xVar.D().b()) {
            xVar.D().getClass();
            return new U(str);
        }
        fi0.x xVar2 = y11.f23551b;
        boolean b11 = xVar2.D().b();
        xVar2.D().getClass();
        return new J(str, y11.f23553d, b11, false);
    }

    public static U d(Y y11, U u11) {
        y11.getClass();
        if (u11 instanceof C3897q) {
            return u11;
        }
        fi0.x xVar = y11.f23551b;
        if (xVar.D().b()) {
            xVar.D().getClass();
            return new U(u11);
        }
        boolean b11 = xVar.D().b();
        xVar.D().getClass();
        return new J(u11, y11.f23553d, b11, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r5 = Sc.r.INSTANCE;
        Sc.s.a(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Y y11, kotlin.coroutines.jvm.internal.c cVar) {
        C3881a0 c3881a0;
        int i11;
        y11.getClass();
        if (cVar instanceof C3881a0) {
            c3881a0 = (C3881a0) cVar;
            int i12 = c3881a0.f23608f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3881a0.f23608f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3881a0.f23606d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3881a0.f23608f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    r.Companion companion = Sc.r.INSTANCE;
                    l0 l0Var = y11.f23552c;
                    c3881a0.f23608f = 1;
                    if (l0Var.d(c3881a0) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                Unit unit = Unit.f71690a;
                r.Companion companion2 = Sc.r.INSTANCE;
                return Unit.f71690a;
            }
        }
        c3881a0 = new C3881a0(y11, cVar);
        Object obj2 = c3881a0.f23606d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3881a0.f23608f;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        r.Companion companion22 = Sc.r.INSTANCE;
        return Unit.f71690a;
    }

    public static final Object h(Y y11, List list, kotlin.coroutines.d dVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new b0(y11, list, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object r(Y y11, ApplicationLifecycleState applicationLifecycleState, int i11, kotlin.coroutines.jvm.internal.j jVar) {
        y11.getClass();
        return C10727i.f(y11.f23558i, new c0(y11, applicationLifecycleState, i11, null), jVar);
    }

    public static final boolean s(Y y11) {
        return y11.f23551b.D().b();
    }

    public static final Object t(Y y11, List list, kotlin.coroutines.jvm.internal.j jVar) {
        return y11.f23552c.e(list, jVar);
    }

    public static final Object u(Y y11, boolean z11, kotlin.coroutines.d dVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new d0(y11, z11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object v(Y y11, List list, kotlin.coroutines.d dVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new e0(y11, list, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object w(Y y11, Tc.b bVar, kotlin.coroutines.jvm.internal.j jVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new f0(y11, bVar, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object x(Y y11, List list, kotlin.coroutines.d dVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new g0(y11, list, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object y(Y y11, List list, kotlin.coroutines.jvm.internal.j jVar) {
        y11.getClass();
        Object f7 = C10727i.f(y11.f23558i, new h0(y11, list, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final Object z(Y y11, ApplicationLifecycleState applicationLifecycleState, Function1 function1, kotlin.coroutines.d dVar) {
        y11.getClass();
        i0 i0Var = new i0(y11, applicationLifecycleState, function1, null);
        return C10727i.f(y11.f23558i, i0Var, (kotlin.coroutines.jvm.internal.j) dVar);
    }

    @Override // Qj0.V
    public final void a() {
        ConcurrentMap<String, U> b11 = this.f23559j.b();
        Intrinsics.f(b11);
        int i11 = 0;
        for (Map.Entry<String, U> entry : b11.entrySet()) {
            if (entry.getValue().l()) {
                b11.remove(entry.getKey());
                i11++;
            }
        }
        this.f23554e.log(i11 + " deleted traces");
    }

    @Override // Qj0.V
    @NotNull
    public final U beginTrace(@NotNull final U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Object e11 = this.f23559j.e(trace.g(), new Callable() { // from class: Qj0.X
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Y.d(Y.this, trace);
            }
        });
        U u11 = (U) e11;
        u11.r();
        Intrinsics.checkNotNullExpressionValue(e11, "also(...)");
        return u11;
    }

    @Override // Qj0.V
    @InterfaceC3999a
    public final void c(Function1<? super Integer, Unit> function1) {
        C10727i.c(this.f23555f, null, null, new f(this.f23557h.b(), function1, null), 3);
    }

    @Override // Qj0.V
    public final void e() {
        MetricType[] elements = {MetricType.TOTAL_TIME_END, MetricType.RESPONSE_TIME_END};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        ConcurrentMap<String, U> b11 = this.f23559j.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, U> entry : b11.entrySet()) {
            TreeSet j11 = entry.getValue().j();
            ArrayList arrayList = new ArrayList(C7714v.z(j11, 10));
            Iterator it = j11.iterator();
            while (it.hasNext()) {
                arrayList.add(((Metric) it.next()).getType());
            }
            if (arrayList.containsAll(j02)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            AbstractC3880a d11 = ((U) entry2.getValue()).d(Q.class);
            Q q11 = d11 instanceof Q ? (Q) d11 : null;
            Integer valueOf = q11 != null ? Integer.valueOf(q11.a()) : null;
            if (valueOf != null && (valueOf.intValue() > 200 || valueOf.intValue() < 0)) {
                Object key = entry2.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                endTrace((String) key);
            }
        }
    }

    @Override // Qj0.V
    public final void endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        U remove = this.f23559j.b().remove(name);
        if (remove != null) {
            remove.s();
            if (remove.m()) {
                C10727i.c(this.f23555f, null, null, new Z(this, remove, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Qj0.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        Wc.a aVar;
        int i11;
        Je.d dVar2;
        Y y11;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        l0 l0Var;
        try {
            if (dVar instanceof g) {
                gVar = (g) dVar;
                int i12 = gVar.f23600h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    gVar.f23600h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = gVar.f23598f;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = gVar.f23600h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        gVar.f23596d = this;
                        dVar2 = this.f23560k;
                        gVar.f23597e = dVar2;
                        gVar.f23600h = 1;
                        if (dVar2.a(gVar) != aVar) {
                            y11 = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) gVar.f23596d;
                        try {
                            Sc.s.b(obj);
                            Unit unit = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                    Je.d dVar3 = gVar.f23597e;
                    y11 = (Y) gVar.f23596d;
                    Sc.s.b(obj);
                    dVar2 = dVar3;
                    y11.f23561l.clear();
                    y11.f23562m.clear();
                    l0Var = y11.f23552c;
                    gVar.f23596d = dVar2;
                    gVar.f23597e = null;
                    gVar.f23600h = 2;
                    if (l0Var.b(gVar) != aVar) {
                        interfaceC3394a = dVar2;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    return aVar;
                }
            }
            y11.f23561l.clear();
            y11.f23562m.clear();
            l0Var = y11.f23552c;
            gVar.f23596d = dVar2;
            gVar.f23597e = null;
            gVar.f23600h = 2;
            if (l0Var.b(gVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            interfaceC3394a = dVar2;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
        gVar = new g((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = gVar.f23598f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f23600h;
        if (i11 != 0) {
        }
    }

    @Override // Qj0.V
    public final boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f23559j.b().containsKey(name);
    }

    @Override // Qj0.V
    public final U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f23559j.b().remove(name);
    }

    @Override // Qj0.V
    @NotNull
    public final U beginTrace(@NotNull final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object e11 = this.f23559j.e(name, new Callable() { // from class: Qj0.W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Y.b(Y.this, name);
            }
        });
        U u11 = (U) e11;
        u11.r();
        Intrinsics.checkNotNullExpressionValue(e11, "also(...)");
        return u11;
    }
}
