package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.vd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4702vd implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f32275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Yd f32276b;

    public ViewOnClickListenerC4702vd(kotlin.jvm.internal.L l11, Yd yd2) {
        this.f32275a = l11;
        this.f32276b = yd2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f32275a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Ce ce2 = (Ce) this.f32276b.u();
        ((C4238fb) ce2.f31988c).b(C4825zo.f32678a);
    }
}
