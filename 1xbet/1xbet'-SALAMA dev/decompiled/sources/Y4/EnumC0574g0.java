package Y4;

/* JADX INFO: renamed from: Y4.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0574g0 implements com.google.protobuf.H {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7719a;

    EnumC0574g0(int i7) {
        this.f7719a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7719a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
