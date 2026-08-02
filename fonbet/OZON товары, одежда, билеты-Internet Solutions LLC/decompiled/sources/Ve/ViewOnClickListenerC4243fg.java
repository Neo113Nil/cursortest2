package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.fg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4243fg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f31035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f31036b;

    public ViewOnClickListenerC4243fg(kotlin.jvm.internal.L l11, Function1 function1) {
        this.f31035a = l11;
        this.f31036b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f31035a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f31036b.invoke(it);
    }
}
