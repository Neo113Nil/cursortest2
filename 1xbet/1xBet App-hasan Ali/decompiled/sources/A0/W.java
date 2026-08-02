package A0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import t0.C2404a;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public static final W f401a = new W();

    public final void a(View view, t0.o oVar) {
        PointerIcon pointerIcon;
        Context context = view.getContext();
        PointerIcon systemIcon = oVar instanceof C2404a ? PointerIcon.getSystemIcon(context, ((C2404a) oVar).f19460b) : PointerIcon.getSystemIcon(context, 1000);
        pointerIcon = view.getPointerIcon();
        if (kotlin.jvm.internal.l.a(pointerIcon, systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
