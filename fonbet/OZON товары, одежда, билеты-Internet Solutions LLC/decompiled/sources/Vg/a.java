package Vg;

import Tg.b;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tg.a f32760a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7851b f32761b;

    public a(@NotNull InterfaceC7851b composerController, @NotNull Tg.a navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.f32760a = navigator;
        this.f32761b = composerController;
    }

    public void a(@NotNull Tg.b action) {
        InterfaceC7851b o11;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = action instanceof b.a;
        Tg.a aVar = this.f32760a;
        if (z11) {
            aVar.dismiss();
            return;
        }
        if (action instanceof b.d) {
            aVar.navigateTo(((b.d) action).getLink());
            return;
        }
        if (action instanceof b.InterfaceC0546b) {
            aVar.dismiss();
            aVar.navigateTo(((b.InterfaceC0546b) action).getLink());
            return;
        }
        if (action instanceof b.g) {
            this.f32761b.i(0, ((b.g) action).getWidgetName());
            return;
        }
        if (action instanceof b.e) {
            b.e eVar = (b.e) action;
            String link = eVar.getLink();
            b.f scrollTo = eVar.getScrollTo();
            InterfaceC7851b.a.a(this.f32761b, link, null, null, scrollTo != null ? aVar.get$converter().b(scrollTo) : null, 6);
            return;
        }
        if (action instanceof b.c) {
            aVar.dismiss();
            QZ.a<? extends C7854a> composer = aVar.getComposer();
            if (composer == null || (o11 = composer.o()) == null) {
                return;
            }
            b.c cVar = (b.c) action;
            String link2 = cVar.getLink();
            b.f scrollTo2 = cVar.getScrollTo();
            InterfaceC7851b.a.a(o11, link2, null, null, scrollTo2 != null ? aVar.get$converter().b(scrollTo2) : null, 6);
        }
    }
}
