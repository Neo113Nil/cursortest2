package Id0;

import Sc.s;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inapppush.presentation.InAppPushHostImpl$receiveInAppPushInternal$1;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f12235a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fd0.c f12236b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zd0.b f12237c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f12238d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f12239e;

    /* renamed from: f, reason: collision with root package name */
    private Long f12240f;

    /* renamed from: g, reason: collision with root package name */
    private Long f12241g;

    /* renamed from: h, reason: collision with root package name */
    private Long f12242h;

    /* renamed from: i, reason: collision with root package name */
    private b f12243i;

    /* renamed from: Id0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0241a {
        @NotNull
        a a(long j11);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final zd0.g f12244a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final J f12245b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FrameLayout f12246c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f12247d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Id0.b f12248e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final InAppPushHostImpl$receiveInAppPushInternal$1 f12249f;

        public b(@NotNull zd0.g page, @NotNull J lifecycleOwner, @NotNull FrameLayout container, Long l11, @NotNull Id0.b lifecycleObserver, @NotNull InAppPushHostImpl$receiveInAppPushInternal$1 hostListener) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
            Intrinsics.checkNotNullParameter(hostListener, "hostListener");
            this.f12244a = page;
            this.f12245b = lifecycleOwner;
            this.f12246c = container;
            this.f12247d = l11;
            this.f12248e = lifecycleObserver;
            this.f12249f = hostListener;
        }

        public static b a(b bVar, Long l11) {
            zd0.g page = bVar.f12244a;
            Id0.b lifecycleObserver = bVar.f12248e;
            InAppPushHostImpl$receiveInAppPushInternal$1 hostListener = bVar.f12249f;
            Intrinsics.checkNotNullParameter(page, "page");
            J lifecycleOwner = bVar.f12245b;
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            FrameLayout container = bVar.f12246c;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
            Intrinsics.checkNotNullParameter(hostListener, "hostListener");
            return new b(page, lifecycleOwner, container, l11, lifecycleObserver, hostListener);
        }

        @NotNull
        public final ViewGroup b() {
            return this.f12246c;
        }

        public final Long c() {
            return this.f12247d;
        }

        @NotNull
        public final zd0.c d() {
            return this.f12249f;
        }

        @NotNull
        public final I e() {
            return this.f12248e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12244a.equals(bVar.f12244a) && Intrinsics.d(this.f12245b, bVar.f12245b) && Intrinsics.d(this.f12246c, bVar.f12246c) && Intrinsics.d(this.f12247d, bVar.f12247d) && this.f12248e.equals(bVar.f12248e) && equals(bVar.f12249f);
        }

        @NotNull
        public final J f() {
            return this.f12245b;
        }

        @NotNull
        public final zd0.g g() {
            return this.f12244a;
        }

        public final int hashCode() {
            int hashCode = (this.f12246c.hashCode() + ((this.f12245b.hashCode() + (this.f12244a.hashCode() * 31)) * 31)) * 31;
            Long l11 = this.f12247d;
            return hashCode() + ((this.f12248e.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "State(page=" + this.f12244a + ", lifecycleOwner=" + this.f12245b + ", container=" + this.f12246c + ", delayMs=" + this.f12247d + ", lifecycleObserver=" + this.f12248e + ", hostListener=" + this.f12249f + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.presentation.InAppPushSdkManager$receiveAndShowInAppPush$3", f = "InAppPushSdkManager.kt", l = {102}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12250d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f12251e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f12252f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.presentation.InAppPushSdkManager$receiveAndShowInAppPush$3$1", f = "InAppPushSdkManager.kt", l = {111, 114}, m = "invokeSuspend")
        /* renamed from: Id0.a$c$a, reason: collision with other inner class name */
        static final class C0242a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f12253d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f12254e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f12255f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f12256g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0242a(b bVar, a aVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f12255f = aVar;
                this.f12256g = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0242a c0242a = new C0242a(this.f12256g, this.f12255f, dVar);
                c0242a.f12254e = obj;
                return c0242a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0242a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
            
                if (r9 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0066, code lost:
            
                if (xe.Y.b(r6, r8) == r0) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                M m11;
                long c11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f12253d;
                b bVar = this.f12256g;
                a aVar2 = this.f12255f;
                if (i11 == 0) {
                    s.b(obj);
                    m11 = (M) this.f12254e;
                    aVar2.f12240f = new Long(System.currentTimeMillis());
                    if (aVar2.f12241g != null) {
                        aVar2.f12241g = null;
                        aVar2.o();
                        return Unit.f71690a;
                    }
                    Long l11 = aVar2.f12242h;
                    long longValue = l11 != null ? l11.longValue() : aVar2.m(bVar.c());
                    this.f12254e = m11;
                    this.f12253d = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        Gd0.a aVar3 = (Gd0.a) obj;
                        if (aVar3 == null) {
                            Jd0.a.f14618a.d("In app push is absent after receiving from server");
                            if (aVar2.f12237c.c() == 0) {
                                aVar2.s();
                                return Unit.f71690a;
                            }
                            b bVar2 = aVar2.f12243i;
                            aVar2.f12243i = bVar2 != null ? b.a(bVar2, new Long(aVar2.f12237c.c())) : null;
                            b bVar3 = aVar2.f12243i;
                            if (bVar3 != null) {
                                aVar2.p(bVar3);
                            }
                            return Unit.f71690a;
                        }
                        aVar2.f12238d.b();
                        aVar2.f12238d.c(bVar.b(), bVar.f(), aVar3, bVar.d());
                        Long c12 = aVar3.c();
                        if (c12 != null && c12.longValue() == 0) {
                            aVar2.s();
                            return Unit.f71690a;
                        }
                        if (aVar3.c() != null) {
                            c11 = aVar3.c().longValue();
                        } else {
                            if (aVar2.f12237c.c() == 0) {
                                aVar2.s();
                                return Unit.f71690a;
                            }
                            c11 = aVar2.f12237c.c();
                        }
                        b bVar4 = aVar2.f12243i;
                        aVar2.f12243i = bVar4 != null ? b.a(bVar4, new Long(c11)) : null;
                        b bVar5 = aVar2.f12243i;
                        if (bVar5 != null) {
                            aVar2.p(bVar5);
                        }
                        return Unit.f71690a;
                    }
                    m11 = (M) this.f12254e;
                    s.b(obj);
                }
                aVar2.f12242h = null;
                Fd0.c cVar = aVar2.f12236b;
                String a11 = bVar.g().a();
                this.f12254e = m11;
                this.f12253d = 2;
                obj = cVar.b(a11, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f12251e = bVar;
            this.f12252f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f12251e, this.f12252f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12250d;
            if (i11 == 0) {
                s.b(obj);
                b bVar = this.f12251e;
                J f7 = bVar.f();
                AbstractC5434v.b bVar2 = AbstractC5434v.b.STARTED;
                C0242a c0242a = new C0242a(bVar, this.f12252f, null);
                this.f12250d = 1;
                if (C5412d0.b(f7, bVar2, c0242a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public a(long j11, @NotNull Fd0.c interactor, @NotNull zd0.b config, @NotNull g notificationWrapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(notificationWrapper, "notificationWrapper");
        this.f12235a = j11;
        this.f12236b = interactor;
        this.f12237c = config;
        this.f12238d = notificationWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long m(Long l11) {
        zd0.b bVar = this.f12237c;
        long longValue = l11 != null ? l11.longValue() : bVar.d();
        long currentTimeMillis = System.currentTimeMillis() - this.f12235a;
        return currentTimeMillis >= bVar.e() ? longValue : bVar.e() - currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(b bVar) {
        B0 b02 = this.f12239e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f12239e = C10727i.c(K.a(bVar.f()), null, null, new c(bVar, this, null), 3);
    }

    public final void n() {
        this.f12238d.b();
        Jd0.a.f14618a.d("Notificaiton dismissed");
    }

    public final void o() {
        B0 b02 = this.f12239e;
        if (b02 == null || ((H0) b02).isCancelled() || this.f12241g != null) {
            return;
        }
        this.f12241g = Long.valueOf(System.currentTimeMillis());
        B0 b03 = this.f12239e;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        Jd0.a.f14618a.d("In app push receiving was paused");
    }

    public final void q(@NotNull zd0.g page, @NotNull J lifecycleOwner, @NotNull FrameLayout container, Long l11, @NotNull InAppPushHostImpl$receiveInAppPushInternal$1 hostListener) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(hostListener, "hostListener");
        b bVar = this.f12243i;
        if (bVar != null) {
            lifecycleOwner.getLifecycle().e(bVar.e());
        }
        this.f12240f = null;
        this.f12241g = null;
        this.f12242h = null;
        b bVar2 = new b(page, lifecycleOwner, container, l11, new Id0.b(this), hostListener);
        p(bVar2);
        this.f12243i = bVar2;
    }

    public final void r() {
        b bVar;
        Long l11;
        B0 b02 = this.f12239e;
        if (b02 != null) {
            if ((b02 != null && !((H0) b02).isCancelled()) || (bVar = this.f12243i) == null || (l11 = this.f12240f) == null) {
                return;
            }
            long longValue = l11.longValue();
            Long l12 = this.f12241g;
            if (l12 != null) {
                long longValue2 = l12.longValue();
                long currentTimeMillis = System.currentTimeMillis() - longValue2;
                long j11 = longValue2 - longValue;
                Long l13 = this.f12242h;
                long longValue3 = ((l13 != null ? l13.longValue() : m(bVar.c())) - j11) - currentTimeMillis;
                if (longValue3 < 0) {
                    longValue3 = 0;
                }
                this.f12242h = Long.valueOf(longValue3);
                this.f12241g = null;
                Jd0.a.f14618a.d("In app push receiving was resumed");
                b bVar2 = this.f12243i;
                if (bVar2 != null) {
                    p(bVar2);
                }
            }
        }
    }

    public final void s() {
        B0 b02 = this.f12239e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        Jd0.a.f14618a.d("In app push receiving was stop");
    }
}
