package Ve;

import Lm0.a;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.o7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4494o7 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S7 f31710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4494o7(S7 s72) {
        super(1);
        this.f31710b = s72;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sr message = (Sr) obj;
        Intrinsics.checkNotNullParameter(message, "message");
        S7 s72 = this.f31710b;
        s72.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            Context requireContext = s72.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            intent.putExtra("android.intent.extra.TEXT", E.f(message, requireContext));
            s72.startActivity(Intent.createChooser(intent, s72.getString(R.string.spay_bnpl_share_link_choose_application)));
        } catch (Exception e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("SHARE LINK EXCEPTION");
            bVar.e(e11);
        }
        return Unit.f71690a;
    }
}
