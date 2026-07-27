package sg.bigo.ads.T0;

import android.os.Parcel;

/* loaded from: classes3.dex */
public final class e implements sg.bigo.ads.U.g {
    public static final int[][] n = {new int[]{1, 2}, new int[]{3, 4}};
    public int h;

    /* renamed from: a, reason: collision with root package name */
    public int f12551a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final d i = new d(3);
    public final d j = new d(4);
    public final d k = new d(12);
    public final d l = new d(1);
    public final d m = new d(20);

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12551a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        sg.bigo.ads.U.n.a(parcel, this.i);
        sg.bigo.ads.U.n.a(parcel, this.j);
        sg.bigo.ads.U.n.a(parcel, this.k);
        sg.bigo.ads.U.n.a(parcel, this.l);
        this.h = parcel.readInt();
        sg.bigo.ads.U.n.a(parcel, this.m);
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeInt(this.f12551a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        sg.bigo.ads.U.n.b(parcel, this.i);
        sg.bigo.ads.U.n.b(parcel, this.j);
        sg.bigo.ads.U.n.b(parcel, this.k);
        sg.bigo.ads.U.n.b(parcel, this.l);
        parcel.writeInt(this.h);
        sg.bigo.ads.U.n.b(parcel, this.m);
    }
}
