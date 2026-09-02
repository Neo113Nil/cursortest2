package E1;

/* loaded from: classes.dex */
public final class A extends java.lang.RuntimeException {
    public A(java.lang.String str, android.os.Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
