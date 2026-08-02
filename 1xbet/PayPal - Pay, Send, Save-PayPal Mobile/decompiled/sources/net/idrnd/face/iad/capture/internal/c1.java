package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum c1 implements com.google.protobuf.Internal.EnumLite {
    CENTER_TOP(0),
    CENTER_CENTER(1),
    CENTER_BOTTOM(2),
    LEFT_TOP(3),
    LEFT_CENTER(4),
    LEFT_BOTTOM(5),
    RIGHT_TOP(6),
    RIGHT_CENTER(7),
    RIGHT_BOTTOM(8),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6958a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6958a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    c1(int i) {
        this.f6958a = i;
    }
}
