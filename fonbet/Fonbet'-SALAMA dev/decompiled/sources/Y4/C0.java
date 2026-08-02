package Y4;

/* loaded from: classes2.dex */
public enum C0 implements com.google.protobuf.H {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7688a;

    C0(int i7) {
        this.f7688a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7688a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
