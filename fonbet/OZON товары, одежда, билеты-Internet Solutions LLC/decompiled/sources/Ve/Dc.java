package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Dc implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f28851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4298hd f28852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4728wb f28853c;

    public Dc(kotlin.jvm.internal.L l11, C4298hd c4298hd, C4728wb c4728wb) {
        this.f28851a = l11;
        this.f28852b = c4298hd;
        this.f28853c = c4728wb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f28851a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f28852b.f31183b.invoke(this.f28853c);
    }
}
