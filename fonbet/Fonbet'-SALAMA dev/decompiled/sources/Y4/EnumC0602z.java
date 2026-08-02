package Y4;

/* renamed from: Y4.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0602z implements com.google.protobuf.H {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7752a;

    EnumC0602z(int i7) {
        this.f7752a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7752a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
