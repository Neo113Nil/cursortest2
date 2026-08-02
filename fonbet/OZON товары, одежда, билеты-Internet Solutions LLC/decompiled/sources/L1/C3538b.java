package L1;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3538b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3538b f16188a = new C3538b();

    /* JADX WARN: Type inference failed for: r0v2, types: [L1.a] */
    public final int[] a(@NotNull W w11, @NotNull RectF rectF, int i11, @NotNull final Function2<? super RectF, ? super RectF, Boolean> function2) {
        SegmentFinder b11;
        int[] rangeForRect;
        if (i11 == 1) {
            b11 = M1.a.f17231a.a(new M1.i(w11.C(), w11.E()));
        } else {
            C2.T.c();
            b11 = C2.P.b(C2.S.b(w11.C(), w11.D()));
        }
        rangeForRect = w11.h().getRangeForRect(rectF, b11, new Layout.TextInclusionStrategy() { // from class: L1.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) Function2.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
