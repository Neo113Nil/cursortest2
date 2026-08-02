package S1;

import K1.AbstractC3429i;
import K1.InterfaceC3430j;
import android.text.style.ClickableSpan;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class i extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC3429i f25659a;

    public i(@NotNull AbstractC3429i abstractC3429i) {
        this.f25659a = abstractC3429i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View view) {
        AbstractC3429i abstractC3429i = this.f25659a;
        InterfaceC3430j a11 = abstractC3429i.a();
        if (a11 != null) {
            a11.a(abstractC3429i);
        }
    }
}
