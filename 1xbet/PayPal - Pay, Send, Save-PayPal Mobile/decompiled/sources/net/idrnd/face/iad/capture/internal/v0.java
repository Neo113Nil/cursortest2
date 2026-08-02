package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum v0 implements com.google.protobuf.Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    PHOTO(1),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_PHOTO(2),
    /* JADX INFO: Fake field, exist only in values array */
    BOTH(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7012a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f7012a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    v0(int i) {
        this.f7012a = i;
    }
}
