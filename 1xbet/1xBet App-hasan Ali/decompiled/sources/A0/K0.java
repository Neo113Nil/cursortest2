package A0;

import android.view.View;
import p0.InterfaceC2241a;

/* loaded from: classes.dex */
public final class K0 implements InterfaceC2241a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313a;

    /* renamed from: b, reason: collision with root package name */
    public final View f314b;

    public /* synthetic */ K0(View view, int i) {
        this.f313a = i;
        this.f314b = view;
    }

    @Override // p0.InterfaceC2241a
    public final void a() {
        switch (this.f313a) {
            case 0:
                this.f314b.performHapticFeedback(9);
                break;
            default:
                ((F) this.f314b).performHapticFeedback(9);
                break;
        }
    }
}
