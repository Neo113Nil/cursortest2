package Si;

import Si.InterfaceC4010a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final int f26338a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Integer> f26339b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f26340c;

    public r(int i11, @NotNull Function0<Integer> currentSelectionCount, @NotNull Function0<Unit> onLimitReached) {
        Intrinsics.checkNotNullParameter(currentSelectionCount, "currentSelectionCount");
        Intrinsics.checkNotNullParameter(onLimitReached, "onLimitReached");
        this.f26338a = i11;
        this.f26339b = currentSelectionCount;
        this.f26340c = onLimitReached;
    }

    @Override // Si.q
    public final boolean a() {
        boolean z11 = this.f26339b.invoke().intValue() < this.f26338a;
        if (!z11) {
            this.f26340c.invoke();
        }
        return z11;
    }

    @Override // Si.q
    public final boolean b() {
        return true;
    }

    @Override // Si.q
    public final void c(@NotNull LinkedHashMap currentSelections) {
        Intrinsics.checkNotNullParameter(currentSelections, "currentSelections");
    }

    @Override // Si.q
    public final boolean d(@NotNull InterfaceC4010a.e media, int i11, @NotNull LinkedHashMap currentSelections) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(currentSelections, "currentSelections");
        if (currentSelections.containsKey(Long.valueOf(media.getId()))) {
            currentSelections.remove(Long.valueOf(media.getId()));
            return true;
        }
        if (currentSelections.size() >= this.f26338a) {
            ((p) this.f26340c).invoke();
            return false;
        }
        currentSelections.put(Long.valueOf(media.getId()), Integer.valueOf(i11));
        return true;
    }
}
