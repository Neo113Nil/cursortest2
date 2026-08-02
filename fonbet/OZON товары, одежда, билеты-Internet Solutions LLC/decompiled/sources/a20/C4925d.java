package a20;

import T00.m;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;

/* renamed from: a20.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4925d implements InterfaceC7243a<C4922a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m f36219a = new m(1, "internal_composer", "first_row_spacer_component", "1-internal_composer.first_row_spacer_component");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36220b = 0;

    @Override // j20.InterfaceC7243a
    public final boolean canParse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public final Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public final long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    public final C4922a parse(C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C4922a.f36216a;
    }
}
