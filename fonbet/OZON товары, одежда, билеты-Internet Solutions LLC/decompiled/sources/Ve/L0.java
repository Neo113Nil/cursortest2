package Ve;

import Ae.InterfaceC2397i;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class L0 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29381b;

    public /* synthetic */ L0(Object obj, int i11) {
        this.f29380a = i11;
        this.f29381b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29380a) {
            case 0:
                Toast.makeText(((RedirectActivity) this.f29381b).getBaseContext(), (String) obj, 0).show();
                break;
            case 1:
                ((L5) obj).a(new C4633t2((K4) this.f29381b, 0));
                break;
            case 2:
                Wb wb2 = (Wb) obj;
                C4796yn c4796yn = (C4796yn) this.f29381b;
                c4796yn.f32607c.setText(wb2.f30256a);
                c4796yn.f32606b.setText(wb2.f30258c);
                c4796yn.f32608d.setText(wb2.f30260e);
                break;
            case 3:
                ((L5) obj).a(new C4633t2((Mq) this.f29381b, 2));
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                S0 s02 = (S0) this.f29381b;
                AppCompatImageView appCompatImageView = s02.f29930f.f32060c;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "spaySloIncludeSelectedCard.spaySilscIvMoreCards");
                appCompatImageView.setVisibility(booleanValue ? 0 : 8);
                AppCompatImageView appCompatImageView2 = s02.f29929e.f29859b;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "spaySloIncludeCompoundWa…CompoundWalletIvMoreCards");
                appCompatImageView2.setVisibility(booleanValue ? 0 : 8);
                break;
        }
        return Unit.f71690a;
    }
}
