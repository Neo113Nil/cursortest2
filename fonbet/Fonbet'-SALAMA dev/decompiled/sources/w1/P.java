package w1;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class P extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I2 f17493b;

    public /* synthetic */ P(I2 i22, int i7) {
        this.f17492a = i7;
        this.f17493b = i22;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17492a) {
            case 0:
                this.f17493b.a(new O(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry()));
                break;
            default:
                this.f17493b.a(TimeZone.getDefault().getID());
                break;
        }
    }
}
