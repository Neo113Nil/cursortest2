package sg.bigo.ads.Y0;

import android.os.Parcel;
import android.os.Parcelable;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes3.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new LandingPageStyleConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LandingPageStyleConfig[i];
    }
}
