package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5308b0 {

    /* renamed from: androidx.core.view.b0$a */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z11) {
            viewGroup.setTransitionGroup(z11);
        }
    }

    public static boolean a(@NonNull ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
