package A1;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class W extends RuntimeException {
    public W(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
