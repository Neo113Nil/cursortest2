package sg.bigo.ads.P;

import android.os.Parcel;
import android.text.TextUtils;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class w implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public int f12495a = 0;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(",");
            if (split.length >= 1) {
                this.f12495a = I.b(0, split[0]);
            }
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(String.valueOf(this.f12495a));
    }
}
