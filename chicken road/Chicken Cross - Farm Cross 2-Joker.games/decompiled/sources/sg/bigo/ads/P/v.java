package sg.bigo.ads.P;

import android.os.Parcel;
import android.text.TextUtils;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class v implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public int f12494a = 0;
    public long b = 5000;
    public long c = 21600000;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        long j;
        long j2;
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(",");
            if (split.length >= 3) {
                this.f12494a = I.b(0, split[0]);
                try {
                    j = Long.parseLong(split[1]);
                } catch (Throwable unused) {
                    j = 5000;
                }
                this.b = j;
                try {
                    j2 = Long.parseLong(split[2]);
                } catch (Throwable unused2) {
                    j2 = 21600000;
                }
                this.c = j2;
            }
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12494a + "," + this.b + "," + this.c);
    }
}
