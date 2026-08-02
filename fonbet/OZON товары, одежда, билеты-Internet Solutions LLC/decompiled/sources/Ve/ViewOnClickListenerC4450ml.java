package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ml, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4450ml implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f31604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f31605b;

    public ViewOnClickListenerC4450ml(kotlin.jvm.internal.L l11, Pm pm) {
        this.f31604a = l11;
        this.f31605b = pm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f31604a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Pm pm = this.f31605b;
        androidx.fragment.app.r requireActivity = pm.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(requireActivity, "<this>");
        View currentFocus = requireActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(requireActivity);
        }
        E.g(requireActivity, currentFocus);
        ((Z2) pm.u()).e0(Y2.f30427a);
    }
}
