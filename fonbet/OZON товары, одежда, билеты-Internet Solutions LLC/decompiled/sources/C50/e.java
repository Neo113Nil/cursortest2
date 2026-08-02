package C50;

import Kk.C3532b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f4421a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4422b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4423c;

    public e(int i11, @NotNull ArrayList framesList, boolean z11) {
        Intrinsics.checkNotNullParameter(framesList, "framesList");
        this.f4421a = framesList;
        this.f4422b = z11;
        this.f4423c = i11;
    }

    @NotNull
    public final List<b> a() {
        return this.f4421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4421a.equals(eVar.f4421a) && this.f4422b == eVar.f4422b && this.f4423c == eVar.f4423c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4423c) + C3532b.a(this.f4421a.hashCode() * 31, 31, this.f4422b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoryUI(framesList=");
        sb2.append(this.f4421a);
        sb2.append(", canClose=");
        sb2.append(this.f4422b);
        sb2.append(", storyPos=");
        return K00.b.e(this.f4423c, ")", sb2);
    }
}
