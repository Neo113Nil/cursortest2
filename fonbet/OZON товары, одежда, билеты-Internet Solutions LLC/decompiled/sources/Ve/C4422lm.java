package Ve;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.lm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4422lm extends androidx.recyclerview.widget.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4394kn f31536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4422lm(C4394kn c4394kn, Context context) {
        super(context);
        this.f31536a = c4394kn;
    }

    @Override // androidx.recyclerview.widget.r
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return this.f31536a.f31461e / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.z
    public final void onTargetFound(View targetView, RecyclerView.A state, RecyclerView.z.a action) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        C4394kn c4394kn = this.f31536a;
        RecyclerView recyclerView = c4394kn.f31467k;
        if (recyclerView == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView recyclerView2 = c4394kn.f31467k;
        Intrinsics.f(recyclerView2);
        RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
        Intrinsics.f(layoutManager);
        int[] calculateDistanceToFinalSnap = c4394kn.calculateDistanceToFinalSnap(layoutManager, targetView);
        int i11 = calculateDistanceToFinalSnap[0];
        int i12 = calculateDistanceToFinalSnap[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
        if (calculateTimeForDeceleration > 0) {
            action.d(i11, i12, this.mDecelerateInterpolator, calculateTimeForDeceleration);
        }
    }
}
