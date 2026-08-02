package Yf0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import Yf0.a;
import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f34999a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f.a<String> f35000b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<W2.f> f35001c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.MockServerDataSource$resetMockPathsList$2", f = "MockServerDataSource.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35002d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f35002d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f35002d).h(c.this.f35000b);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.MockServerDataSource$setMockPathsList$2", f = "MockServerDataSource.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35004d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35006f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f35006f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = c.this.new b(this.f35006f, dVar);
            bVar.f35004d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            W2.b bVar = (W2.b) this.f35004d;
            c cVar = c.this;
            String str = (String) bVar.c(cVar.f35000b);
            String str2 = this.f35006f;
            if (str != null) {
                str2 = G.g.c(str, ",", str2);
            }
            bVar.i(cVar.f35000b, C7714v.V(C7714v.Y0(kotlin.text.h.m(str2, new String[]{","}, 0, 6)), ",", null, null, null, 62));
            return Unit.f71690a;
        }
    }

    public c(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = null;
        String c11 = Hg0.a.c("debug.mock_server", null);
        if (c11 != null && c11.length() != 0) {
            str = c11;
        }
        this.f34999a = str;
        this.f35000b = W2.i.c("mock_paths_list");
        this.f35001c = d.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Yf0.b bVar;
        int i11;
        c cVar2;
        String str;
        if (cVar instanceof Yf0.b) {
            bVar = (Yf0.b) cVar;
            int i12 = bVar.f34998g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f34998g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f34996e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f34998g;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC2395h<W2.f> data = this.f35001c.getData();
                    bVar.f34995d = this;
                    bVar.f34998g = 1;
                    obj = C2399j.w(data, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = bVar.f34995d;
                    s.b(obj);
                }
                W2.f fVar = (W2.f) obj;
                return (fVar != null || (str = (String) fVar.c(cVar2.f35000b)) == null) ? a.C0651a.f34993a : kotlin.text.h.K(str) ? a.C0651a.f34993a : new a.b(kotlin.text.h.m(str, new String[]{","}, 0, 6));
            }
        }
        bVar = new Yf0.b(this, cVar);
        Object obj2 = bVar.f34996e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f34998g;
        if (i11 != 0) {
        }
        W2.f fVar2 = (W2.f) obj2;
        if (fVar2 != null) {
        }
    }

    public final String c() {
        return this.f34999a;
    }

    public final Object d(@NotNull kotlin.coroutines.d<? super W2.f> dVar) {
        return W2.j.a(this.f35001c, new a(null), dVar);
    }

    public final Object e(@NotNull String str, @NotNull kotlin.coroutines.d<? super W2.f> dVar) {
        return W2.j.a(this.f35001c, new b(str, null), dVar);
    }
}
