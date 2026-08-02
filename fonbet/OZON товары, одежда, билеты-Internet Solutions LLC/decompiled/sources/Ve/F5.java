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
public final class F5 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28971b;

    public /* synthetic */ F5(Object obj, int i11) {
        this.f28970a = i11;
        this.f28971b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28970a) {
            case 0:
                String str = (String) obj;
                C4378k7 c4378k7 = (C4378k7) this.f28971b;
                c4378k7.f31422b.setText(str);
                SPayTextView spaySlspActvLocalSessionId = c4378k7.f31422b;
                Intrinsics.checkNotNullExpressionValue(spaySlspActvLocalSessionId, "spaySlspActvLocalSessionId");
                String n11 = M1.b.n(str);
                spaySlspActvLocalSessionId.setVisibility((n11 == null || n11.length() == 0) ? 8 : 0);
                return Unit.f71690a;
            case 1:
                String str2 = (String) obj;
                X4.a aVar = ((Ub) this.f28971b).f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                SPayTextView observeViewModel$lambda$2$lambda$1 = ((C4795ym) aVar).f32601b;
                observeViewModel$lambda$2$lambda$1.setText(str2);
                Intrinsics.checkNotNullExpressionValue(observeViewModel$lambda$2$lambda$1, "observeViewModel$lambda$2$lambda$1");
                String n12 = M1.b.n(str2);
                observeViewModel$lambda$2$lambda$1.setVisibility((n12 == null || n12.length() == 0) ? 8 : 0);
                return Unit.f71690a;
            default:
                Jj jj2 = (Jj) obj;
                C4192dm c4192dm = (C4192dm) this.f28971b;
                c4192dm.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jj2.f29298a);
                int i11 = 0;
                for (Object obj2 : jj2.f29299b) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    Bl bl = new Bl(c4192dm, i11, (String) obj2);
                    List list = jj2.f29300c;
                    spannableStringBuilder.setSpan(bl, ((C4304hj) list.get(i11)).f31199a, ((C4304hj) list.get(i11)).f31200b, 34);
                    i11 = i12;
                }
                X4.a aVar2 = c4192dm.f28693b;
                if (aVar2 == null) {
                    throw M7.f29463a;
                }
                MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
                SPayTextView sPayTextView = ((H2) aVar2).f29110i;
                sPayTextView.setMovementMethod(linkMovementMethod);
                sPayTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                return Unit.f71690a;
        }
    }
}
