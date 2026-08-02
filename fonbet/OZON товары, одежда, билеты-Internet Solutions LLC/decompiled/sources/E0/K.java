package E0;

import C2.C2727w;
import C2.C2728x;
import C2.C2729y;
import android.view.inputmethod.EditorInfo;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final K f7045a = new K();

    public final void a(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(C7714v.b0(C2727w.c(), C2.A.a(), C2728x.b(), C2729y.c(), C2.B.a(), C2.C.b(), C2.D.b()));
        Class[] elements = {C2727w.c(), C2.A.a(), C2728x.b(), C2729y.c()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        editorInfo.setSupportedHandwritingGesturePreviews(C7705l.j0(elements));
    }
}
