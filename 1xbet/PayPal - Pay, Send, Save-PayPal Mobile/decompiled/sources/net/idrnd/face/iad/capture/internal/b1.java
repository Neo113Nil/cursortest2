package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum b1 implements com.google.protobuf.Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_CAPTURE_TYPE(0),
    FACE(1),
    DOCUMENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6956a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6956a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    b1(int i) {
        this.f6956a = i;
    }
}
