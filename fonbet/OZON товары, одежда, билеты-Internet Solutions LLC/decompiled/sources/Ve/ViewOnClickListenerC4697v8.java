package Ve;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.BnplButtonCompositeView;

/* renamed from: Ve.v8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC4697v8 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.L f32264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BnplButtonCompositeView f32265b;

    public ViewOnClickListenerC4697v8(kotlin.jvm.internal.L l11, BnplButtonCompositeView bnplButtonCompositeView) {
        this.f32264a = l11;
        this.f32265b = bnplButtonCompositeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kotlin.jvm.internal.L l11 = this.f32264a;
        if (elapsedRealtime - l11.f71786a < 400) {
            return;
        }
        l11.f71786a = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f32265b.performClick();
    }
}
