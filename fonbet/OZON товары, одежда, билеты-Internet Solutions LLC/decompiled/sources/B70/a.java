package B70;

import B70.g;
import Jb.i;
import Jb.j;
import We.E;
import android.content.Context;
import androidx.lifecycle.z0;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.operations.network.OperationsApi;
import ru.ozon.fintech.features.operations.presentation.OperationInfoFragment;
import ru.ozon.fintech.features.operations.presentation.ReceiptFragment;

/* loaded from: classes3.dex */
final class a implements B70.b {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f2999a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Context> f3000b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f3001c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f3002d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<E> f3003e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<Moshi> f3004f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<OperationsApi> f3005g;

    /* renamed from: h, reason: collision with root package name */
    private F70.b f3006h;

    /* renamed from: i, reason: collision with root package name */
    private F70.d f3007i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<z0.b> f3008j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B70.a$a, reason: collision with other inner class name */
    static final class C0074a implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f3009a;

        C0074a(O90.a aVar) {
            this.f3009a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f3009a.w0();
            j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f3010a;

        b(Z80.a aVar) {
            this.f3010a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f3010a.getOkHttpClient();
            j.c(okHttpClient);
            return okHttpClient;
        }
    }

    private static final class c implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f3011a;

        c(P30.b bVar) {
            this.f3011a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f3011a.h();
            j.c(h11);
            return h11;
        }
    }

    private static final class d implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f3012a;

        d(M80.a aVar) {
            this.f3012a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f3012a.d0();
            j.c(d02);
            return d02;
        }
    }

    a(P30.b bVar, Y20.a aVar, M80.a aVar2, Z80.a aVar3, O90.a aVar4) {
        g gVar;
        this.f2999a = aVar;
        this.f3000b = new c(bVar);
        this.f3001c = new d(aVar2);
        this.f3002d = new C0074a(aVar4);
        this.f3003e = new b(aVar3);
        gVar = g.a.f3017a;
        Pc.a<Moshi> b11 = Jb.d.b(gVar);
        this.f3004f = b11;
        Pc.a<OperationsApi> b12 = Jb.d.b(new f(this.f3003e, this.f3002d, b11));
        this.f3005g = b12;
        Pc.a<Context> aVar5 = this.f3000b;
        Pc.a<S80.b> aVar6 = this.f3001c;
        this.f3006h = new F70.b(aVar5, aVar6, this.f3002d, b12);
        this.f3007i = new F70.d(aVar5, aVar6);
        i.a b13 = i.b(2);
        b13.b(ru.ozon.fintech.features.operations.presentation.a.class, this.f3006h);
        b13.b(ru.ozon.fintech.features.operations.presentation.d.class, this.f3007i);
        this.f3008j = Jb.d.b(new h(b13.a()));
    }

    @Override // B70.b
    public final void I0(ReceiptFragment receiptFragment) {
        receiptFragment.factory = this.f3008j.get();
        InterfaceC6618a B11 = this.f2999a.B();
        j.c(B11);
        receiptFragment.analyticsInteractor = B11;
    }

    @Override // B70.b
    public final void u1(OperationInfoFragment operationInfoFragment) {
        operationInfoFragment.factory = this.f3008j.get();
        InterfaceC6618a B11 = this.f2999a.B();
        j.c(B11);
        operationInfoFragment.analyticsInteractor = B11;
    }
}
