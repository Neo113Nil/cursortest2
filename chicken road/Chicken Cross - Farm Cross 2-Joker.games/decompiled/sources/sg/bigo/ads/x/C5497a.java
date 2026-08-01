package sg.bigo.ads.x;

import android.app.Activity;
import sg.bigo.ads.h.C5149b2;
import sg.bigo.ads.h.Q1;

/* renamed from: sg.bigo.ads.x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5497a extends C5149b2 {
    public final int e0;

    public C5497a(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        Q1 b0 = super.b0();
        b0.c = this.e0;
        return b0;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void z() {
    }

    public C5497a(Activity activity, int i) {
        super(activity);
        this.e0 = i;
    }
}
