package Si;

import Si.InterfaceC4010a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class s implements q {
    @Override // Si.q
    public final boolean a() {
        return true;
    }

    @Override // Si.q
    public final boolean b() {
        return false;
    }

    @Override // Si.q
    public final void c(@NotNull LinkedHashMap currentSelections) {
        Intrinsics.checkNotNullParameter(currentSelections, "currentSelections");
        currentSelections.clear();
    }

    @Override // Si.q
    public final boolean d(@NotNull InterfaceC4010a.e media, int i11, @NotNull LinkedHashMap currentSelections) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(currentSelections, "currentSelections");
        if (currentSelections.containsKey(Long.valueOf(media.getId()))) {
            currentSelections.remove(Long.valueOf(media.getId()));
            return true;
        }
        currentSelections.clear();
        currentSelections.put(Long.valueOf(media.getId()), Integer.valueOf(i11));
        return true;
    }
}
