package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum n1 implements com.google.protobuf.Internal.EnumLite {
    PNG(0),
    JPEG(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6989a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6989a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    n1(int i) {
        this.f6989a = i;
    }
}
