package androidx.compose.ui.focus;

import D1.C2809k;
import D1.H;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class l implements Comparator<FocusTargetNode> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f40406a = new l();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i11 = 0;
        if (k.f(focusTargetNode3) && k.f(focusTargetNode4)) {
            H f7 = C2809k.f(focusTargetNode3);
            H f11 = C2809k.f(focusTargetNode4);
            if (!Intrinsics.d(f7, f11)) {
                U0.b bVar = new U0.b(new H[16]);
                while (f7 != null) {
                    bVar.a(0, f7);
                    f7 = f7.g0();
                }
                U0.b bVar2 = new U0.b(new H[16]);
                while (f11 != null) {
                    bVar2.a(0, f11);
                    f11 = f11.g0();
                }
                int min = Math.min(bVar.m() - 1, bVar2.m() - 1);
                if (min >= 0) {
                    while (Intrinsics.d(bVar.l()[i11], bVar2.l()[i11])) {
                        if (i11 != min) {
                            i11++;
                        }
                    }
                    return Intrinsics.i(((H) bVar.l()[i11]).h0(), ((H) bVar2.l()[i11]).h0());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (k.f(focusTargetNode3)) {
                return -1;
            }
            if (k.f(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
