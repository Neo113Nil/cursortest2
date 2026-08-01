package sg.bigo.ads.P;

import android.os.Parcel;
import android.text.TextUtils;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class p implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public int f12488a = 2;
    public int b = 3;
    public int c = 5;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        String[] split;
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString) || (split = readString.split(",")) == null || split.length != 3) {
                return;
            }
            this.f12488a = I.b(2, split[0]);
            this.b = I.b(3, split[1]);
            this.c = I.b(5, split[2]);
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12488a + "," + this.b + "," + this.c);
    }
}
