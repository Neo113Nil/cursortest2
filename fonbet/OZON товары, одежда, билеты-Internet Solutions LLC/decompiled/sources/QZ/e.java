package QZ;

import Bl0.C2645f;
import K00.i;
import QZ.a;
import h10.C6780b;
import h10.C6782d;
import i10.C6996b;
import i10.C6997c;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import n10.InterfaceC8418b;
import n20.k;
import x00.C10622a;
import z00.h;

/* loaded from: classes7.dex */
final class e extends AbstractC7737t implements Function0<InterfaceC7238a<C7854a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a<C7854a> f23179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(a<C7854a> aVar) {
        super(0);
        this.f23179b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC7238a<C7854a> invoke() {
        bk0.c cVar;
        C6997c initialState;
        K00.a aVar;
        i iVar;
        List interceptors;
        RZ.a aVar2;
        h pageIssueFactory;
        A00.b eventLoadingCallback;
        InterfaceC8418b interfaceC8418b;
        List additionalStateReducers;
        E00.a aVar3;
        C00.a aVar4;
        K00.a aVar5;
        k kVar;
        f10.b bVar;
        a<C7854a> aVar6 = this.f23179b;
        cVar = ((a) aVar6).f23152n;
        initialState = ((a) aVar6).f23139a;
        aVar = ((a) aVar6).f23140b;
        L00.d callFactory = aVar.f();
        iVar = ((a) aVar6).f23143e;
        if (iVar == null) {
            aVar5 = ((a) aVar6).f23140b;
            kVar = ((a) aVar6).f23141c;
            bVar = ((a) aVar6).f23142d;
            iVar = K00.a.d(aVar5, kVar, bVar);
        }
        i repository = iVar;
        I00.a<C7854a> mapper = aVar6.s();
        interceptors = ((a) aVar6).f23144f;
        aVar2 = ((a) aVar6).f23146h;
        a.b.f23171a.getClass();
        D00.a frequencyLoadChecker = a.b.a();
        D00.e incidentsNotifier = a.b.b();
        pageIssueFactory = ((a) aVar6).f23147i;
        eventLoadingCallback = ((a) aVar6).f23148j;
        interfaceC8418b = ((a) aVar6).f23149k;
        additionalStateReducers = ((a) aVar6).f23145g;
        aVar3 = ((a) aVar6).f23150l;
        aVar4 = ((a) aVar6).f23151m;
        C10622a dispatchersProvider = C10622a.f104798a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(frequencyLoadChecker, "frequencyLoadChecker");
        Intrinsics.checkNotNullParameter(incidentsNotifier, "incidentsNotifier");
        Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
        Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
        Intrinsics.checkNotNullParameter(additionalStateReducers, "additionalStateReducers");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        return new j10.d(initialState, new C6780b(), new y00.b(frequencyLoadChecker, incidentsNotifier), new C6782d(interceptors, aVar2, mapper, pageIssueFactory, eventLoadingCallback, additionalStateReducers, new C2645f()), new J00.b(callFactory, repository, interceptors, eventLoadingCallback, aVar2, interfaceC8418b, dispatchersProvider, aVar3, pageIssueFactory, aVar4, mapper, new C6996b()), additionalStateReducers, dispatchersProvider);
    }
}
