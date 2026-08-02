package Ve;

import Ae.InterfaceC2397i;
import W2.f;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import v5.C10234h;

/* loaded from: classes10.dex */
public final class Tb implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30033c;

    public /* synthetic */ Tb(int i11, Object obj, Object obj2) {
        this.f30031a = i11;
        this.f30032b = obj;
        this.f30033c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4527pb c4527pb;
        int i11;
        switch (this.f30031a) {
            case 0:
                if (dVar instanceof C4527pb) {
                    c4527pb = (C4527pb) dVar;
                    int i12 = c4527pb.f31771e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4527pb.f31771e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4527pb.f31770d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4527pb.f31771e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            Object c11 = ((W2.f) obj).c((f.a) this.f30033c);
                            c4527pb.f31771e = 1;
                            if (((InterfaceC2397i) this.f30032b).emit(c11, c4527pb) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c4527pb = new C4527pb(this, dVar);
                Object obj22 = c4527pb.f31770d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4527pb.f31771e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            case 1:
                ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj;
                D d11 = (D) this.f30032b;
                d11.f28795c.setText(bannerData.getText());
                String iconUrl = bannerData.getIconUrl();
                if (iconUrl != null && iconUrl.length() != 0) {
                    AppCompatImageView targetView = d11.f28794b;
                    Intrinsics.checkNotNullExpressionValue(targetView, "spayLnmcAcivImage");
                    Sh sh2 = ((Hk) this.f30033c).f29164d;
                    if (sh2 == null) {
                        Intrinsics.n("coilImpl");
                        throw null;
                    }
                    String iconUrl2 = bannerData.getIconUrl();
                    E80.c imageRequestListener = new E80.c();
                    Intrinsics.checkNotNullParameter(targetView, "<this>");
                    Intrinsics.checkNotNullParameter(imageRequestListener, "imageRequestListener");
                    C4218ek imageRequestBuilder = new C4218ek(imageRequestListener);
                    Intrinsics.checkNotNullParameter(targetView, "targetView");
                    Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
                    C10234h.a aVar3 = new C10234h.a(sh2.f29980a);
                    aVar3.b(iconUrl2);
                    aVar3.h(targetView);
                    imageRequestBuilder.invoke(aVar3);
                    sh2.f29981b.a(aVar3.a());
                }
                return Unit.f71690a;
            default:
                ((S0) this.f30032b).f29937m.setText(E.f(((C4188di) obj).f30883a, (Context) this.f30033c));
                return Unit.f71690a;
        }
    }
}
