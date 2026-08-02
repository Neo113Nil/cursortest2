package Il0;

import De.C2862e;
import He.b;
import Nl0.g;
import Sc.r;
import Sc.s;
import bb.AbstractC5615b;
import bb.InterfaceC5614a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.p;
import lm0.q;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.M;
import xe.N;

/* loaded from: classes8.dex */
public final class a implements InterfaceC5614a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Al0.a f12592a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f12593b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2862e f12594c;

    @e(c = "ru.rustore.sdk.pushclient.internal.analytics.sender.ClientAnalyticsSender$send$1", f = "ClientAnalyticsSender.kt", l = {24, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: Il0.a$a, reason: collision with other inner class name */
    public static final class C0253a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f12595d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AbstractC5615b f12597f;

        /* renamed from: Il0.a$a$a, reason: collision with other inner class name */
        public static final class C0254a extends AbstractC7737t implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0254a f12598b = new C0254a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                Throwable it = th2;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f71690a;
            }
        }

        /* renamed from: Il0.a$a$b */
        public static final class b extends AbstractC7737t implements Function1<Unit, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C10737n f12599b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10737n c10737n) {
                super(1);
                this.f12599b = c10737n;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Unit unit) {
                Unit it = unit;
                Intrinsics.checkNotNullParameter(it, "it");
                C10737n c10737n = this.f12599b;
                Unit unit2 = Unit.f71690a;
                Intrinsics.checkNotNullParameter(c10737n, "<this>");
                if (c10737n.isActive()) {
                    r.Companion companion = r.INSTANCE;
                    c10737n.resumeWith(unit2);
                }
                return unit2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0253a(AbstractC5615b abstractC5615b, d<? super C0253a> dVar) {
            super(2, dVar);
            this.f12597f = abstractC5615b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C0253a(this.f12597f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return a.this.new C0253a(this.f12597f, dVar).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            if (r7 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12595d;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                g gVar = aVar2.f12593b;
                this.f12595d = 1;
                obj = gVar.a(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            AbstractC5615b abstractC5615b = this.f12597f;
            LinkedHashMap m11 = U.m((Map) obj, abstractC5615b.b());
            this.f12595d = 2;
            C10737n c10737n = new C10737n(1, Wc.b.b(this));
            c10737n.o();
            q.a(p.a(aVar2.f12592a.a(new Al0.b(abstractC5615b.a(), m11)), C0254a.f12598b), jm0.j.a(), new b(c10737n));
            Object n11 = c10737n.n();
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
        }
    }

    public a(Al0.a analyticsClient, g baseClientAnalyticsRepository) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e scope = N.a(b.f10879b);
        Intrinsics.checkNotNullParameter(analyticsClient, "analyticsClient");
        Intrinsics.checkNotNullParameter(baseClientAnalyticsRepository, "baseClientAnalyticsRepository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12592a = analyticsClient;
        this.f12593b = baseClientAnalyticsRepository;
        this.f12594c = scope;
    }

    @Override // bb.InterfaceC5614a
    public final void a(@NotNull AbstractC5615b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(this.f12594c, null, null, new C0253a(event, null), 3);
    }
}
