package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import spay.sdk.view.SPayMaterialButton;

/* renamed from: Ve.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4169d implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30838b;

    public /* synthetic */ C4169d(Object obj, int i11) {
        this.f30837a = i11;
        this.f30838b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30837a) {
            case 0:
                C4580r7 c4580r7 = (C4580r7) obj;
                Dm dm = ((C4344j2) this.f30838b).f31338d;
                if (dm != null) {
                    dm.f(c4580r7.f31957a);
                    return Unit.f71690a;
                }
                Intrinsics.n("cardsListAdapter");
                throw null;
            case 1:
                int ordinal = ((Ta) obj).ordinal();
                D d11 = (D) this.f30838b;
                if (ordinal == 0) {
                    SPayMaterialButton spayLnmcMbIssueCard = d11.f28797e;
                    Intrinsics.checkNotNullExpressionValue(spayLnmcMbIssueCard, "spayLnmcMbIssueCard");
                    Intrinsics.checkNotNullParameter(spayLnmcMbIssueCard, "<this>");
                    spayLnmcMbIssueCard.setVisibility(0);
                } else if (ordinal == 1) {
                    SPayMaterialButton spayLnmcMbIssueCard2 = d11.f28797e;
                    Intrinsics.checkNotNullExpressionValue(spayLnmcMbIssueCard2, "spayLnmcMbIssueCard");
                    Intrinsics.checkNotNullParameter(spayLnmcMbIssueCard2, "<this>");
                    spayLnmcMbIssueCard2.setVisibility(8);
                }
                return Unit.f71690a;
            case 2:
                ((H2) this.f30838b).f29113l.setChecked(((Boolean) obj).booleanValue());
                return Unit.f71690a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    RedirectActivity.a((RedirectActivity) this.f30838b);
                }
                return Unit.f71690a;
        }
    }
}
