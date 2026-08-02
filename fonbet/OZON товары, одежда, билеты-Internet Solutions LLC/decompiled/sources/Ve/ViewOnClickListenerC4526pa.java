package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.pa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4526pa implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f31767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ra f31768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4399l f31769c;

    public ViewOnClickListenerC4526pa(kotlin.jvm.internal.L l11, Ra ra2, C4399l c4399l) {
        this.f31767a = l11;
        this.f31768b = ra2;
        this.f31769c = c4399l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f31767a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f31768b.f29841b.invoke(this.f31769c);
    }
}
