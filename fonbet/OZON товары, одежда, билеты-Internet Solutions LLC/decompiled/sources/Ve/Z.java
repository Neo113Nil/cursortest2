package Ve;

import Ae.InterfaceC2397i;
import androidx.cardview.widget.CardView;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Z implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30526b;

    public /* synthetic */ Z(Object obj, int i11) {
        this.f30525a = i11;
        this.f30526b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30525a) {
            case 0:
                int ordinal = ((Eh) obj).ordinal();
                S0 s02 = (S0) this.f30526b;
                if (ordinal == 0) {
                    CardView cardView = s02.f29928d;
                    cardView.setClickable(false);
                    cardView.setFocusable(false);
                } else if (ordinal == 1) {
                    CardView cardView2 = s02.f29928d;
                    cardView2.setClickable(true);
                    cardView2.setFocusable(true);
                }
                return Unit.f71690a;
            default:
                String str = (String) obj;
                X4.a aVar = ((S7) this.f30526b).f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                ((Vk) aVar).f30212f.loadUrl(str);
                return Unit.f71690a;
        }
    }
}
