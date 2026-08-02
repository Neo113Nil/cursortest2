package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307i1 extends ClickableSpan {

    /* JADX INFO: renamed from: j */
    public final int f3370j;

    /* JADX INFO: renamed from: k */
    public final C0639r1 f3371k;

    /* JADX INFO: renamed from: l */
    public final int f3372l;

    public C0307i1(int i, C0639r1 c0639r1, int i2) {
        this.f3370j = i;
        this.f3371k = c0639r1;
        this.f3372l = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3370j);
        this.f3371k.f6649a.performAction(this.f3372l, bundle);
    }
}
