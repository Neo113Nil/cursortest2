package Ui;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
final class r extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4069c f27818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C4069c c4069c) {
        super(0);
        this.f27818b = c4069c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C4069c c4069c = this.f27818b;
        c4069c.g0();
        androidx.fragment.app.r context = c4069c.getActivity();
        if (context != null) {
            Ti.i iVar = c4069c.f27741j;
            if (iVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: Ui.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C4069c.x(C4069c.this);
                }
            };
            Intrinsics.checkNotNullParameter(context, "context");
            Ti.i.e(iVar, context, R.string.gallery_permissions_dialog_rationale_text_android, R.string.gallery_permissions_allow_android, onClickListener, null, 96);
        }
        return Unit.f71690a;
    }
}
