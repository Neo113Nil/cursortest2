package sg.bigo.ads.T0;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class l implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12556a = true;
    public boolean b = false;
    public int c = 0;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12556a = sg.bigo.ads.U.n.a(parcel, true);
        this.f12556a = sg.bigo.ads.U.n.a(parcel, false);
        this.c = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeInt(this.f12556a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
    }

    public final String toString() {
        return "{isNativeVideoClickable=" + this.f12556a + ", isNativeVideoClickable=" + this.f12556a + ", clickTriggerType=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
