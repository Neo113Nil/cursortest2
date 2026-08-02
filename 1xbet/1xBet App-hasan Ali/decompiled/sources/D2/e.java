package D2;

import O4.S;
import android.os.Parcel;
import y4.z;

/* loaded from: classes.dex */
public class e extends RuntimeException {
    public e(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(S s2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        z zVar = s2.f4188a;
        sb.append(zVar.f21451n);
        sb.append(" ");
        sb.append(zVar.f21450m);
    }
}
