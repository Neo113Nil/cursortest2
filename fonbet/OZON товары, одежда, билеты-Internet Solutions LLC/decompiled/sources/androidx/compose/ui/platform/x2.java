package androidx.compose.ui.platform;

import S0.C3988v;
import S0.InterfaceC3982s;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
final class x2 implements InterfaceC3982s, androidx.lifecycle.G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f41046a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3988v f41047b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41048c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5434v f41049d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private C4912a f41050e = J0.f40665a;

    public x2(@NotNull AndroidComposeView androidComposeView, @NotNull C3988v c3988v) {
        this.f41046a = androidComposeView;
        this.f41047b = c3988v;
    }

    @Override // S0.InterfaceC3982s
    public final void dispose() {
        if (!this.f41048c) {
            this.f41048c = true;
            this.f41046a.setTag(R.id.wrapped_composition_tag, null);
            AbstractC5434v abstractC5434v = this.f41049d;
            if (abstractC5434v != null) {
                abstractC5434v.e(this);
            }
        }
        this.f41047b.dispose();
    }

    @Override // S0.InterfaceC3982s
    public final void k(@NotNull C4912a c4912a) {
        this.f41046a.U0(new w2(this, c4912a));
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull androidx.lifecycle.J j11, @NotNull AbstractC5434v.a aVar) {
        if (aVar == AbstractC5434v.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != AbstractC5434v.a.ON_CREATE || this.f41048c) {
                return;
            }
            k(this.f41050e);
        }
    }

    @NotNull
    public final InterfaceC3982s w() {
        return this.f41047b;
    }

    @NotNull
    public final AndroidComposeView x() {
        return this.f41046a;
    }
}
