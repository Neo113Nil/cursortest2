package sg.bigo.ads.h;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class N0 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0 f12842a;

    public N0(P0 p0) {
        this.f12842a = p0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Y0 y0 = this.f12842a.d;
        y0.q = true;
        y0.r = false;
    }
}
