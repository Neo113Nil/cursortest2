package sg.bigo.ads.O;

import android.os.Parcel;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class b implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public String f12468a;

    public b() {
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12468a = parcel.readString();
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12468a);
    }

    public final String toString() {
        String str = this.f12468a;
        Pattern pattern = I.f12345a;
        return str == null ? "" : str;
    }

    public b(String str) {
        this.f12468a = str;
    }
}
