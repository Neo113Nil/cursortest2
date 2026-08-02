package Ve;

import Ae.InterfaceC2397i;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.dn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4193dn implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1 f30893a;

    public C4193dn(C1 c12) {
        this.f30893a = c12;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Jj jj2 = (Jj) obj;
        C1 c12 = this.f30893a;
        c12.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jj2.f29298a);
        int i11 = 0;
        for (Object obj2 : jj2.f29299b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            W0 w02 = new W0(c12, i11, (String) obj2);
            List list = jj2.f29300c;
            spannableStringBuilder.setSpan(w02, ((C4304hj) list.get(i11)).f31199a, ((C4304hj) list.get(i11)).f31200b, 34);
            i11 = i12;
        }
        X4.a aVar = c12.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        SPayTextView sPayTextView = ((C4746x1) aVar).f32443e;
        sPayTextView.setMovementMethod(linkMovementMethod);
        sPayTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        return Unit.f71690a;
    }
}
