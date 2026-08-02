package v;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class o0 implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f20284b = new o0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f20285c = new o0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20286a;

    public /* synthetic */ o0(int i) {
        this.f20286a = i;
    }

    @Override // v.m0
    public final boolean a() {
        switch (this.f20286a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // v.m0
    public final l0 b(View view, W0.c cVar) {
        switch (this.f20286a) {
            case 0:
                return new n0(new Magnifier(view));
            default:
                return new p0(new Magnifier(view));
        }
    }
}
