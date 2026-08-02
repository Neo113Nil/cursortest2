package androidx.compose.ui.platform;

import Bl0.C2652m;
import S0.C3969l;
import S0.C3991w0;
import S0.InterfaceC3967k;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeView extends AbstractC5228a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f40612c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40613a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40614b;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f40616c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f40616c | 1);
            ComposeView.this.Content(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public ComposeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void Content(InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(420213850);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Function2 function2 = (Function2) this.f40613a.getValue();
            if (function2 == null) {
                u11.o(358373017);
            } else {
                u11.o(150107752);
                function2.invoke(u11, 0);
            }
            u11.k();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(i11));
        }
    }

    public final void a(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        this.f40614b = true;
        this.f40613a.setValue(function2);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    protected final boolean getF40614b() {
        return this.f40614b;
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, 0);
        C3991w0 f7;
        f7 = S0.n1.f(null, S0.D1.f25195a);
        this.f40613a = f7;
    }
}
