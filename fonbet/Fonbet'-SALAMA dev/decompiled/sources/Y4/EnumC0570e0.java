package Y4;

/* renamed from: Y4.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0570e0 implements com.google.protobuf.H {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7713a;

    EnumC0570e0(int i7) {
        this.f7713a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7713a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
