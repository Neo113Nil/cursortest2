package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ia implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f29223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4357jf f29224b;

    public Ia(kotlin.jvm.internal.L l11, C4357jf c4357jf) {
        this.f29223a = l11;
        this.f29224b = c4357jf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f29223a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        ((C4709vk) this.f29224b.u()).e0(C4272gg.f31112a);
    }
}
