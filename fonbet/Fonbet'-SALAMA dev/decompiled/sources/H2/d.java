package H2;

import I2.J;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: O, reason: collision with root package name */
    public final /* synthetic */ int f3238O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i7) {
        super(activity);
        this.f3238O = i7;
    }

    @Override // H2.j, com.google.android.gms.internal.ads.zzbso
    public void zzl(Bundle bundle) {
        switch (this.f3238O) {
            case 4:
                J.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f3258M = 4;
                this.f3259a.finish();
                break;
            default:
                super.zzl(bundle);
                break;
        }
    }
}
