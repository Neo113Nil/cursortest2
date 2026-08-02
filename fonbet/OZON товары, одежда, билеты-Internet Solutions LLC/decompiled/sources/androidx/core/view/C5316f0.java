package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.core.view.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5316f0 {
    @NotNull
    public static final View a(@NotNull ViewGroup viewGroup, int i11) {
        View childAt = viewGroup.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
        f7.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(f7.toString());
    }

    @NotNull
    public static final C5310c0 b(@NotNull ViewGroup viewGroup) {
        return new C5310c0(viewGroup);
    }

    @NotNull
    public static final C5314e0 c(@NotNull ViewGroup viewGroup) {
        return new C5314e0(viewGroup);
    }
}
