package androidx.compose.ui.graphics;

import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7827j0;
import l1.InterfaceC7825i0;
import l1.J0;
import l1.N0;
import l1.y0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    @NotNull
    public static final e a(@NotNull e eVar, @NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
        return eVar.l0(new BlockGraphicsLayerElement(function1));
    }

    public static e b(e eVar, float f7, float f11, float f12, float f13, float f14, float f15, J0 j02, boolean z11, int i11) {
        long j11;
        float f16 = (i11 & 1) != 0 ? 1.0f : f7;
        float f17 = (i11 & 2) != 0 ? 1.0f : f11;
        float f18 = (i11 & 4) != 0 ? 1.0f : f12;
        float f19 = (i11 & 16) != 0 ? 0.0f : f13;
        float f21 = (i11 & 32) != 0 ? 0.0f : f14;
        float f22 = (i11 & 256) != 0 ? 0.0f : f15;
        j11 = N0.f72232b;
        return eVar.l0(new GraphicsLayerElement(f16, f17, f18, f19, f21, f22, j11, (i11 & 2048) != 0 ? y0.a() : j02, (i11 & 4096) != 0 ? false : z11, C7827j0.a(), C7827j0.a(), (i11 & 65536) == 0 ? 1 : 0));
    }
}
