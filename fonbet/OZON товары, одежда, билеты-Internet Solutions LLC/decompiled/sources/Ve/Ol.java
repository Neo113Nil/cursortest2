package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class Ol implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f29639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f29640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pm f29641c;

    public Ol(kotlin.jvm.internal.L l11, C4400l0 c4400l0, Pm pm) {
        this.f29639a = l11;
        this.f29640b = c4400l0;
        this.f29641c = pm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f29639a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        W8 w82 = this.f29640b.f31486d.f98899b;
        if (w82 != null) {
            w82.setText(R.string.spay_empty_string);
        }
        ((Z2) this.f29641c.u()).e0(U5.f30101a);
    }
}
