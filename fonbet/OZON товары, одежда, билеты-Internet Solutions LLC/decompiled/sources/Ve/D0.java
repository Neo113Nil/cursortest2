package Ve;

import Ae.InterfaceC2397i;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class D0 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28799b;

    public /* synthetic */ D0(Object obj, int i11) {
        this.f28798a = i11;
        this.f28799b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28798a) {
            case 0:
                ((C4514or) this.f28799b).f31751b.setText((String) obj);
                return Unit.f71690a;
            case 1:
                Jj jj2 = (Jj) obj;
                if (jj2.f29298a.length() > 0) {
                    C4817zg c4817zg = (C4817zg) this.f28799b;
                    c4817zg.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jj2.f29298a);
                    int i11 = 0;
                    for (Object obj2 : jj2.f29299b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        Yf yf2 = new Yf(c4817zg, (String) obj2);
                        List list = jj2.f29300c;
                        spannableStringBuilder.setSpan(yf2, ((C4304hj) list.get(i11)).f31199a, ((C4304hj) list.get(i11)).f31200b, 34);
                        i11 = i12;
                    }
                    X4.a aVar = c4817zg.f28693b;
                    if (aVar == null) {
                        throw M7.f29463a;
                    }
                    MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
                    SPayTextView sPayTextView = ((Z4) aVar).f30565f;
                    sPayTextView.setMovementMethod(linkMovementMethod);
                    sPayTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                    X4.a aVar2 = c4817zg.f28693b;
                    if (aVar2 == null) {
                        throw M7.f29463a;
                    }
                    SPayTextView sPayTextView2 = ((Z4) aVar2).f30565f;
                    Intrinsics.checkNotNullExpressionValue(sPayTextView2, "binding.spaySlpnStvTermsOfService");
                    sPayTextView2.setVisibility(0);
                }
                return Unit.f71690a;
            default:
                ((S0) this.f28799b).f29935k.setBonusCount(((Number) obj).intValue());
                return Unit.f71690a;
        }
    }
}
