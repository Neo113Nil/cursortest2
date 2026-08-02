package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public enum u0 implements com.google.protobuf.Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7008a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f7008a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    u0(int i) {
        this.f7008a = i;
    }
}
