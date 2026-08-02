package Y4;

/* loaded from: classes2.dex */
public enum t0 implements com.google.protobuf.H {
    OPERATOR_UNSPECIFIED(0),
    IS_NAN(2),
    IS_NULL(3),
    IS_NOT_NAN(4),
    IS_NOT_NULL(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7747a;

    t0(int i7) {
        this.f7747a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7747a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
