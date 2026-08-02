package E30;

import C.D;
import android.graphics.Rect;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Rect f7421a = new Rect(0, 0, 0, 0);

    static {
        new Rect(D.d(16), D.d(16), D.d(16), D.d(16));
        new Rect(D.d(16), D.d(8), D.d(16), D.d(4));
        new Rect(D.d(16), D.d(16), D.d(6), D.d(16));
        new Rect(D.d(6), D.d(16), D.d(16), D.d(16));
        new Rect(D.d(16), D.d(4), D.d(16), D.d(4));
        new Rect(D.d(16), D.d(4), D.d(16), D.d(16));
        new Rect(D.d(16), D.d(8), D.d(16), D.d(8));
    }

    @NotNull
    public static final Rect a() {
        return f7421a;
    }

    public static final Rect b(List<Integer> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty() || (list.size() < 4)) {
            return null;
        }
        return new Rect(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3).intValue());
    }
}
