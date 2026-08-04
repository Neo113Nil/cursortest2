package Y4;

/* JADX INFO: renamed from: Y4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0578i0 implements com.google.protobuf.H {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7733a;

    EnumC0578i0(int i7) {
        this.f7733a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7733a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
