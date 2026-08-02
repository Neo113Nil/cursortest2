package bm0;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import cb.C5796a;
import cm0.C5842a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bm0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5684b implements InterfaceC5683a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f56097a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.d f56098b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {18}, m = "deletePushToken-gIAlu-s")
    /* renamed from: bm0.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f56099d;

        /* renamed from: f, reason: collision with root package name */
        public int f56101f;

        public a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f56099d = obj;
            this.f56101f |= LinearLayoutManager.INVALID_OFFSET;
            Object a11 = C5684b.this.a(null, this);
            return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {14}, m = "getNewPushToken-0E7RQCE")
    /* renamed from: bm0.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0841b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f56102d;

        /* renamed from: f, reason: collision with root package name */
        public int f56104f;

        public C0841b(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f56102d = obj;
            this.f56104f |= LinearLayoutManager.INVALID_OFFSET;
            Object a11 = C5684b.this.a(null, null, this);
            return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$getNewPushToken$2", f = "PushTokenRepositoryImpl.kt", l = {14}, m = "invokeSuspend")
    /* renamed from: bm0.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends j implements Function1<kotlin.coroutines.d<? super r<? extends C5842a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f56105d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f56107f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C5796a f56108g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C5796a c5796a, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f56107f = str;
            this.f56108g = c5796a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C5684b.this.new c(this.f56107f, this.f56108g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super r<? extends C5842a>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56105d;
            if (i11 == 0) {
                s.b(obj);
                h hVar = C5684b.this.f56097a;
                this.f56105d = 1;
                a11 = hVar.a(this.f56107f, this);
                if (a11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a11 = ((r) obj).getF26106a();
            }
            return r.a(a11);
        }
    }

    public C5684b(@NotNull h api, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f56097a = api;
        this.f56098b = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // bm0.InterfaceC5683a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super r<Unit>> dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f56101f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f56101f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f56099d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f56101f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                aVar.f56101f = 1;
                Object b11 = this.f56097a.b(str, aVar);
                return b11 == aVar2 ? aVar2 : b11;
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = aVar.f56099d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f56101f;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // bm0.InterfaceC5683a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, C5796a c5796a, @NotNull kotlin.coroutines.d<? super r<C5842a>> dVar) {
        C0841b c0841b;
        int i11;
        if (dVar instanceof C0841b) {
            c0841b = (C0841b) dVar;
            int i12 = c0841b.f56104f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c0841b.f56104f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c0841b.f56102d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0841b.f56104f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                C5685c c5685c = new C5685c(this.f56098b);
                c cVar = new c(str, c5796a, null);
                c0841b.f56104f = 1;
                Object d11 = c5685c.d(cVar, c0841b);
                return d11 == aVar ? aVar : d11;
            }
        }
        c0841b = new C0841b((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = c0841b.f56102d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c0841b.f56104f;
        if (i11 == 0) {
        }
    }
}
