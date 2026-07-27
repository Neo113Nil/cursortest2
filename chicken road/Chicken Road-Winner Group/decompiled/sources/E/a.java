package E;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f332a;

    /* renamed from: b, reason: collision with root package name */
    public final i f333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334c;

    public a(int i3, i iVar, int i4) {
        this.f332a = i3;
        this.f333b = iVar;
        this.f334c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f332a);
        this.f333b.f341a.performAction(this.f334c, bundle);
    }
}
