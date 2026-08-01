package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C8 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f6491a;
    public int b;
    public int c;
    public int d;
    public Cg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6491a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i == this.f6491a && i2 == this.b && i5 == this.c && i6 == this.d) {
            return;
        }
        this.f6491a = i;
        this.b = i2;
        this.c = i5;
        this.d = i6;
        Cg cg = this.e;
        if (cg != null) {
            cg.a(i, i2, i5, i6);
        }
    }

    public final void setOnPositionChangeListener(Cg cg) {
        this.e = cg;
    }
}
