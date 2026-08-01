package sg.bigo.ads.U;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sg.bigo.ads.K0.O;

/* loaded from: classes3.dex */
public final class a implements g {
    public static final a d = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f12559a;
    public boolean b;
    public long c;

    public a() {
        this.f12559a = "";
        this.b = true;
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12559a = parcel.readString();
        this.b = parcel.readInt() != 0;
        this.c = parcel.readLong();
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12559a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
    }

    public final String toString() {
        return "{advertisingId='" + this.f12559a + "', isLimitAdTrackingEnabled=" + this.b + ", lastUpdateTime=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public a(Parcel parcel) {
        a(parcel);
    }

    public final boolean a() {
        return Math.abs(O.a() - this.c) > ((long) 1) * 86400000;
    }

    public a(String str, boolean z) {
        this.f12559a = str;
        this.b = z;
        this.c = O.a();
    }
}
