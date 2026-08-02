package Ve;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Hn extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Ar f29169a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f29170b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f29171c;

    /* renamed from: d, reason: collision with root package name */
    public final Ef f29172d;

    /* renamed from: e, reason: collision with root package name */
    public final C4248fl f29173e;

    /* renamed from: f, reason: collision with root package name */
    public final Nq f29174f;

    /* renamed from: g, reason: collision with root package name */
    public final Ib f29175g;

    public Hn(Ar getListOfCardsUseCase, Y9 sPaySdkReducer, Vm sPayDataContract, Ef sdkAuthDataService, C4248fl featuresHandler, Nq selectCardPreparationHelper, Ib sPayStorage) {
        Intrinsics.checkNotNullParameter(getListOfCardsUseCase, "getListOfCardsUseCase");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sdkAuthDataService, "sdkAuthDataService");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(selectCardPreparationHelper, "selectCardPreparationHelper");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f29169a = getListOfCardsUseCase;
        this.f29170b = sPaySdkReducer;
        this.f29171c = sPayDataContract;
        this.f29172d = sdkAuthDataService;
        this.f29173e = featuresHandler;
        this.f29174f = selectCardPreparationHelper;
        this.f29175g = sPayStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M1.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(C4395ko c4395ko, xe.I i11, kotlin.coroutines.d dVar) {
        C4364jm c4364jm;
        int i12;
        Hn hn;
        Object obj;
        xe.I i13;
        Hn hn2;
        Object g10;
        if (dVar instanceof C4364jm) {
            c4364jm = (C4364jm) dVar;
            int i14 = c4364jm.f31387j;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4364jm.f31387j = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4364jm.f31385h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = c4364jm.f31387j;
                if (i12 != 0) {
                    Sc.s.b(obj2);
                    List h11 = ((C4654tn) this.f29171c).h();
                    Y9 y92 = this.f29170b;
                    if (h11 != null && h11.size() == 1) {
                        ((C4238fb) y92).b(new C4209eb(new C4780y7()));
                    }
                    ListOfCardsRequestBody listOfCardsRequestBody = c4395ko.f31471c;
                    if (listOfCardsRequestBody == null) {
                        Intrinsics.checkNotNullParameter(y92, "<this>");
                        a.b bVar = Lm0.a.f17149a;
                        bVar.b("ELSE BRANCH ERROR");
                        bVar.e("Unpredictable case", new Object[0]);
                        ((C4238fb) y92).b(C4360ji.f31372a);
                        return Unit.f71690a;
                    }
                    c4364jm.f31381d = this;
                    c4364jm.f31382e = c4395ko;
                    c4364jm.f31383f = i11;
                    c4364jm.f31384g = this;
                    c4364jm.f31387j = 1;
                    C4341j c4341j = new C4341j(c4395ko.f31469a, listOfCardsRequestBody);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    InterfaceC2395h A11 = C2399j.A(new Xq(this.f29169a, c4341j, He.b.f10879b, null));
                    if (A11 != aVar) {
                        hn = this;
                        obj = A11;
                        i13 = i11;
                        hn2 = hn;
                        hn.getClass();
                        Be.q qVar = new Be.q(C2399j.A(new C4336in(c4395ko, hn, null)), (InterfaceC2395h) obj, new Im(3, null));
                        c4364jm.f31381d = null;
                        c4364jm.f31382e = null;
                        c4364jm.f31383f = null;
                        c4364jm.f31384g = null;
                        c4364jm.f31387j = 2;
                        hn2.getClass();
                        g10 = C2399j.g(new C2408n0(C2399j.B(qVar, i13), new Hl(hn2, c4395ko, i13, null)), c4364jm);
                        if (g10 != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return Unit.f71690a;
                }
                Hn hn3 = c4364jm.f31384g;
                xe.I i15 = c4364jm.f31383f;
                C4395ko c4395ko2 = c4364jm.f31382e;
                hn = c4364jm.f31381d;
                Sc.s.b(obj2);
                hn2 = hn3;
                c4395ko = c4395ko2;
                obj = obj2;
                i13 = i15;
                hn.getClass();
                Be.q qVar2 = new Be.q(C2399j.A(new C4336in(c4395ko, hn, null)), (InterfaceC2395h) obj, new Im(3, null));
                c4364jm.f31381d = null;
                c4364jm.f31382e = null;
                c4364jm.f31383f = null;
                c4364jm.f31384g = null;
                c4364jm.f31387j = 2;
                hn2.getClass();
                g10 = C2399j.g(new C2408n0(C2399j.B(qVar2, i13), new Hl(hn2, c4395ko, i13, null)), c4364jm);
                if (g10 != aVar) {
                    g10 = Unit.f71690a;
                }
            }
        }
        c4364jm = new C4364jm(this, dVar);
        Object obj22 = c4364jm.f31385h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = c4364jm.f31387j;
        if (i12 != 0) {
        }
    }
}
