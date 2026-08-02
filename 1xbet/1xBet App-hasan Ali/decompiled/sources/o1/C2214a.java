package o1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2214a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f18604a;

    /* renamed from: b, reason: collision with root package name */
    public final C2218e f18605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18606c;

    public C2214a(int i, C2218e c2218e, int i5) {
        this.f18604a = i;
        this.f18605b = c2218e;
        this.f18606c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18604a);
        this.f18605b.f18616a.performAction(this.f18606c, bundle);
    }
}
