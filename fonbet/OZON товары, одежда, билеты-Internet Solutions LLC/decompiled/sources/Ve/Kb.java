package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Kb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f29343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4528pc f29344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rc f29345c;

    public Kb(kotlin.jvm.internal.L l11, C4528pc c4528pc, Rc rc2) {
        this.f29343a = l11;
        this.f29344b = c4528pc;
        this.f29345c = rc2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f29343a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f29344b.f31773b.invoke(this.f29345c);
    }
}
