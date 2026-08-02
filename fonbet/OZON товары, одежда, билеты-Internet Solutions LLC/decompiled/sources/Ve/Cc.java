package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Cc implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f28754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4240fd f28755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Zb f28756c;

    public Cc(kotlin.jvm.internal.L l11, C4240fd c4240fd, Zb zb2) {
        this.f28754a = l11;
        this.f28755b = c4240fd;
        this.f28756c = zb2;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f28754a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f28755b.f31026c.invoke(this.f28756c);
    }
}
