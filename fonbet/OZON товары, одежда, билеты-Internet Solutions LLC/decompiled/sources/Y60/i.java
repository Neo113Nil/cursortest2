package Y60;

import Sc.s;
import Y60.g;
import e70.InterfaceC6317d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.common.transformer.TransferDataCachedTransformer$prepareForCache$downloadedBankImages$1", f = "TransferDataCachedTransformer.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends j implements Function2<M, kotlin.coroutines.d<? super List<? extends g.a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34737d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f34738e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<BankInfo> f34739f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Je.f f34740g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ g f34741h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.common.transformer.TransferDataCachedTransformer$prepareForCache$downloadedBankImages$1$1$1", f = "TransferDataCachedTransformer.kt", l = {95, 59}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super g.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Je.f f34742d;

        /* renamed from: e, reason: collision with root package name */
        BankInfo f34743e;

        /* renamed from: f, reason: collision with root package name */
        g f34744f;

        /* renamed from: g, reason: collision with root package name */
        int f34745g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Je.f f34746h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ BankInfo f34747i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ g f34748j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Je.f fVar, BankInfo bankInfo, g gVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f34746h = fVar;
            this.f34747i = bankInfo;
            this.f34748j = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f34746h, this.f34747i, this.f34748j, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super g.a> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
        
            if (r3 == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BankInfo bankInfo;
            g gVar;
            Je.f fVar;
            Je.f fVar2;
            Throwable th2;
            g.a aVar;
            X60.a aVar2;
            BankInfo bankInfo2;
            Je.f fVar3;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34745g;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    Je.f fVar4 = this.f34746h;
                    this.f34742d = fVar4;
                    bankInfo = this.f34747i;
                    this.f34743e = bankInfo;
                    gVar = this.f34748j;
                    this.f34744f = gVar;
                    this.f34745g = 1;
                    Object d11 = ((Je.h) fVar4).d(this);
                    fVar = fVar4;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bankInfo2 = this.f34743e;
                        fVar2 = this.f34742d;
                        try {
                            s.b(obj);
                            aVar = new g.a(bankInfo2.getId(), (InterfaceC6317d) obj);
                            fVar3 = fVar2;
                            fVar3.release();
                            return aVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            fVar2.release();
                            throw th2;
                        }
                    }
                    g gVar2 = this.f34744f;
                    BankInfo bankInfo3 = this.f34743e;
                    Je.f fVar5 = this.f34742d;
                    s.b(obj);
                    fVar = fVar5;
                    gVar = gVar2;
                    bankInfo = bankInfo3;
                }
                String logoUrl = bankInfo.getLogoUrl();
                aVar = null;
                fVar3 = fVar;
                if (logoUrl != null) {
                    String c11 = Y60.a.c(gVar, logoUrl, bankInfo.getId(), 2);
                    aVar2 = gVar.f34724d;
                    this.f34742d = fVar;
                    this.f34743e = bankInfo;
                    this.f34744f = null;
                    this.f34745g = 2;
                    Object a11 = aVar2.a(c11, logoUrl, this);
                    if (a11 != aVar3) {
                        bankInfo2 = bankInfo;
                        fVar2 = fVar;
                        obj = a11;
                        aVar = new g.a(bankInfo2.getId(), (InterfaceC6317d) obj);
                        fVar3 = fVar2;
                    }
                    return aVar3;
                }
                fVar3.release();
                return aVar;
            } catch (Throwable th4) {
                fVar2 = fVar;
                th2 = th4;
                fVar2.release();
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(List<BankInfo> list, Je.f fVar, g gVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f34739f = list;
        this.f34740g = fVar;
        this.f34741h = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f34739f, this.f34740g, this.f34741h, dVar);
        iVar.f34738e = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends g.a>> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34737d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        M m11 = (M) this.f34738e;
        List<BankInfo> list = this.f34739f;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10727i.a(m11, null, null, new a(this.f34740g, (BankInfo) it.next(), this.f34741h, null), 3));
        }
        this.f34737d = 1;
        Object a11 = C10721f.a(arrayList, this);
        return a11 == aVar ? aVar : a11;
    }
}
