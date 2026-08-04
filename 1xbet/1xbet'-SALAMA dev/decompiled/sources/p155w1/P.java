package p155w1;

import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I2 f17499b;

    public /* synthetic */ P(I2 i7, int i8) {
        this.f17498a = i8;
        this.f17499b = i7;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17498a) {
            case 0:
                this.f17499b.a(new O(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry()));
                break;
            default:
                this.f17499b.a(TimeZone.getDefault().getID());
                break;
        }
    }
}
