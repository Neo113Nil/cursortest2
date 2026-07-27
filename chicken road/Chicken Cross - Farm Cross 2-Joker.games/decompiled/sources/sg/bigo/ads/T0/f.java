package sg.bigo.ads.T0;

import android.os.Parcel;

/* loaded from: classes3.dex */
public final class f implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public int f12552a = 0;
    public int b = 0;
    public int c = 0;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12552a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeInt(this.f12552a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
