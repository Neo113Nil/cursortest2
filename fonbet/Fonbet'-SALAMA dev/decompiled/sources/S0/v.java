package S0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class v extends C0431b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i7, String str, String str2) {
        super(2, str, str2);
        this.f6266e = i7;
    }

    @Override // S0.AbstractC0432c
    public final boolean b() {
        switch (this.f6266e) {
            case 0:
                if (!super.b() || !R0.d.a("MULTI_PROCESS")) {
                    return false;
                }
                Uri uri = R0.w.f5874a;
                if (w.f6273G.b()) {
                    return y.f6312a.getStatics().isMultiProcessEnabled();
                }
                throw w.a();
            default:
                if (R0.d.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
