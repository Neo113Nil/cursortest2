package sg.bigo.ads.P;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class q implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public long f12489a = 0;

    public final boolean a(int i) {
        return (this.f12489a & (1 << i)) != 0;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeLong(this.f12489a);
    }

    public final String toString() {
        return "{value=" + this.f12489a + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12489a = parcel.readLong();
    }
}
