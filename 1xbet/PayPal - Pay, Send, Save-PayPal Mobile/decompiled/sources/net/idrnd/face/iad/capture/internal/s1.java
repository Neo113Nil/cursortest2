package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum s1 implements com.google.protobuf.Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_ORIENTATION(0),
    PORTRAIT(1),
    /* JADX INFO: Fake field, exist only in values array */
    LANDSCAPE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SENSORS_BASED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7003a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f7003a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    s1(int i) {
        this.f7003a = i;
    }
}
