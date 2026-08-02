package CZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import xZ.C10683b;

/* loaded from: classes3.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f4584b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pZ.f f4585c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f4586d;

    public static final class a extends i<g> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final BZ.b f4587a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final BZ.e f4588b;

        public a(@NotNull BZ.b appHandlerCache, @NotNull BZ.e miniAppConfigHolder) {
            Intrinsics.checkNotNullParameter(appHandlerCache, "appHandlerCache");
            Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
            this.f4587a = appHandlerCache;
            this.f4588b = miniAppConfigHolder;
        }

        private final void navigateInternal(EZ.g gVar, EZ.e<g> eVar, int i11) {
            if (!d.a(gVar.getActivity())) {
                gVar.getActivity().finish();
                redirect(eVar, i11);
                return;
            }
            String a11 = eVar.b().a();
            if (Intrinsics.d(BZ.f.a(this.f4588b), a11)) {
                redirect(eVar.e(eVar.b().b()), i11);
                return;
            }
            if (!(gVar instanceof C10683b)) {
                next(gVar, eVar, i11);
                return;
            }
            c miniAppDestination = this.f4587a.c(a11).getMiniAppDestination(gVar.getActivity(), a11, eVar, ((C10683b) gVar).e(a11));
            if (miniAppDestination == null) {
                redirect(eVar.e(eVar.b().b()), i11);
            } else {
                redirect(eVar.e(miniAppDestination), i11);
            }
        }

        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<g> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<g> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateInternal(navigator, response, i11);
        }
    }

    public g(@NotNull String appName, @NotNull pZ.f redirect) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.f4584b = appName;
        this.f4585c = redirect;
        this.f4586d = N.b(a.class);
    }

    @NotNull
    public final String a() {
        return this.f4584b;
    }

    @NotNull
    public final pZ.f b() {
        return this.f4585c;
    }

    @Override // CZ.c, pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f4586d;
    }

    @NotNull
    public final String toString() {
        return "SwitchMiniAppDestination(appName=" + this.f4584b + ", redirect=" + this.f4585c + ", navigator=" + this.f4586d + ")";
    }
}
