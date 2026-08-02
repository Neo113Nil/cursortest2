package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.kb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4382kb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f31434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4357jf f31435b;

    public ViewOnClickListenerC4382kb(kotlin.jvm.internal.L l11, C4357jf c4357jf) {
        this.f31434a = l11;
        this.f31435b = c4357jf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f31434a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        ((C4709vk) this.f31435b.u()).e0(Jf.f29290a);
    }
}
