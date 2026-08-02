package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ik implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f29240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f29241b;

    public Ik(kotlin.jvm.internal.L l11, Pm pm) {
        this.f29240a = l11;
        this.f29241b = pm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f29240a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Pm pm = this.f29241b;
        androidx.fragment.app.r requireActivity = pm.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(requireActivity, "<this>");
        View currentFocus = requireActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(requireActivity);
        }
        E.g(requireActivity, currentFocus);
        ((Z2) pm.u()).e0(C4662u2.f32174a);
    }
}
