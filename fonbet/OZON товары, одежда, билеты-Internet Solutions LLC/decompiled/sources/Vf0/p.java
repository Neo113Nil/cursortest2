package Vf0;

import Cf0.J;
import Od0.a;
import Sc.InterfaceC4008j;
import Sc.s;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f32742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f32743b;

    static final class a extends AbstractC7737t implements Function0<InterfaceC8918a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32744b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC8918a invoke() {
            J j11 = pf0.m.f80514a;
            if (j11 != null) {
                return j11.i();
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.OzonNetworkExtraHeadersDeeplinkHandler$handleDeeplink$1", f = "OzonNetworkExtraHeadersDeeplinkHandler.kt", l = {22}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f32745d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f32745d;
            if (i11 == 0) {
                s.b(obj);
                this.f32745d = 1;
                if (p.b(p.this, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.OzonNetworkExtraHeadersDeeplinkHandler$handleDeeplink$2", f = "OzonNetworkExtraHeadersDeeplinkHandler.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Od0.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f32747d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f32749f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<String> f32750g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Uri uri, Set<String> set, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f32749f = uri;
            this.f32750g = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new c(this.f32749f, this.f32750g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Od0.a> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f32747d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            Set<String> set = this.f32750g;
            this.f32747d = 1;
            Object a11 = p.a(p.this, this.f32749f, set, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    public p(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f32742a = store;
        this.f32743b = Sc.k.b(a.f32744b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, Uri uri, Set set, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        pVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f32753f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f32753f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qVar.f32751d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar.f32753f;
                if (i11 != 0) {
                    s.b(obj);
                    qVar.f32753f = 1;
                    if (pVar.e(uri, set, qVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return new a.C0408a();
            }
        }
        qVar = new q(pVar, cVar);
        Object obj3 = qVar.f32751d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f32753f;
        if (i11 != 0) {
        }
        return new a.C0408a();
    }

    public static final Object b(p pVar, kotlin.coroutines.d dVar) {
        Object b11 = ((InterfaceC8918a) pVar.f32743b.getValue()).b((kotlin.coroutines.jvm.internal.c) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r8.e(r10, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Uri uri, Set set, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        p pVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f32759i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f32759i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f32757g;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f32759i;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC8918a interfaceC8918a = (InterfaceC8918a) this.f32743b.getValue();
                    rVar.f32754d = this;
                    rVar.f32755e = uri;
                    rVar.f32756f = set;
                    rVar.f32759i = 1;
                    obj = interfaceC8918a.a(rVar);
                    if (obj != obj2) {
                        pVar = this;
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                set = rVar.f32756f;
                uri = rVar.f32755e;
                pVar = rVar.f32754d;
                s.b(obj);
                LinkedHashMap u11 = U.u((Map) obj);
                for (String str : set) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null && queryParameter.length() != 0) {
                        u11.put(str, queryParameter);
                    }
                }
                InterfaceC8918a interfaceC8918a2 = (InterfaceC8918a) pVar.f32743b.getValue();
                rVar.f32754d = null;
                rVar.f32755e = null;
                rVar.f32756f = null;
                rVar.f32759i = 2;
            }
        }
        rVar = new r(this, cVar);
        Object obj3 = rVar.f32757g;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f32759i;
        if (i11 != 0) {
        }
        LinkedHashMap u112 = U.u((Map) obj3);
        while (r9.hasNext()) {
        }
        InterfaceC8918a interfaceC8918a22 = (InterfaceC8918a) pVar.f32743b.getValue();
        rVar.f32754d = null;
        rVar.f32755e = null;
        rVar.f32756f = null;
        rVar.f32759i = 2;
    }

    @NotNull
    public final Od0.a d(@NotNull Uri deeplink) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (o.a(this.f32742a)) {
            return new a.c();
        }
        Set<String> queryParameterNames = deeplink.getQueryParameterNames();
        Intrinsics.f(queryParameterNames);
        if (queryParameterNames.size() != 1 || !queryParameterNames.contains("delete") || ((queryParameter = deeplink.getQueryParameter("delete")) != null && queryParameter.length() != 0)) {
            return (Od0.a) C10727i.d(kotlin.coroutines.g.f71771a, new c(deeplink, queryParameterNames, null));
        }
        C10727i.d(kotlin.coroutines.g.f71771a, new b(null));
        return new a.C0408a();
    }
}
