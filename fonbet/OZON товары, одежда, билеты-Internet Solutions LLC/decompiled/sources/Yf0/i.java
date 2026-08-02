package Yf0;

import Cf0.J;
import Od0.a;
import Sc.InterfaceC4008j;
import Sc.s;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.m;
import xe.M;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f35015a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35016b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.OzonNetworkMockPathListDeeplinkHandler$handleDeeplink$1", f = "OzonNetworkMockPathListDeeplinkHandler.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Od0.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35017d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Od0.a> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35017d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f35017d = 1;
            Object b11 = i.b(i.this, this);
            return b11 == aVar ? aVar : b11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.OzonNetworkMockPathListDeeplinkHandler$handleDeeplink$2", f = "OzonNetworkMockPathListDeeplinkHandler.kt", l = {28}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Od0.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35019d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f35021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f35021f = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new b(this.f35021f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Od0.a> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35019d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f35019d = 1;
            Object a11 = i.a(i.this, this.f35021f, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    static final class c extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f35022b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            J j11 = m.f80514a;
            if (j11 != null) {
                return j11.l();
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    public i(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f35015a = store;
        this.f35016b = Sc.k.b(c.f35022b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, Uri uri, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        String substring;
        iVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f35025f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f35025f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f35023d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f35025f;
                if (i11 != 0) {
                    s.b(obj);
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    int J11 = kotlin.text.h.J(uri2, "add=", 0, false, 6);
                    if (J11 == -1) {
                        substring = "";
                    } else {
                        substring = uri2.substring(J11 + 4);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    }
                    if (substring.length() == 0) {
                        return new a.b("Query parameter is empty", null);
                    }
                    h hVar = (h) iVar.f35016b.getValue();
                    jVar.f35025f = 1;
                    if (hVar.d(substring, jVar) == aVar) {
                        return aVar;
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
        jVar = new j(iVar, cVar);
        Object obj2 = jVar.f35023d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f35025f;
        if (i11 != 0) {
        }
        return new a.C0408a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        iVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f35028f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f35028f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f35026d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f35028f;
                if (i11 != 0) {
                    s.b(obj);
                    h hVar = (h) iVar.f35016b.getValue();
                    kVar.f35028f = 1;
                    if (hVar.c(kVar) == aVar) {
                        return aVar;
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
        kVar = new k(iVar, cVar);
        Object obj2 = kVar.f35026d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f35028f;
        if (i11 != 0) {
        }
        return new a.C0408a();
    }

    @NotNull
    public final Od0.a c(@NotNull Uri deeplink) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f35015a.c().b() != Nd0.b.DEBUG) {
            return new a.c();
        }
        Set<String> queryParameterNames = deeplink.getQueryParameterNames();
        if (queryParameterNames.size() == 1 && queryParameterNames.contains("reset") && ((queryParameter = deeplink.getQueryParameter("reset")) == null || queryParameter.length() == 0)) {
        }
        return new a.C0408a();
    }
}
