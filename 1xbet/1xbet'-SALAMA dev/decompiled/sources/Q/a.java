package Q;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5725c;

    public a(int i7, h hVar, int i8) {
        this.f5723a = i7;
        this.f5724b = hVar;
        this.f5725c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5723a);
        this.f5724b.f5735a.performAction(this.f5725c, bundle);
    }
}
