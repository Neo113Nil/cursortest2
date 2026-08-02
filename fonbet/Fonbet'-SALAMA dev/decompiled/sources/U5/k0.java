package U5;

/* loaded from: classes2.dex */
public enum k0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: a, reason: collision with root package name */
    public final int f6531a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6532b;

    k0(int i7) {
        this.f6531a = i7;
        this.f6532b = Integer.toString(i7).getBytes(D3.f.f1717a);
    }

    public final l0 a() {
        return (l0) l0.f6535d.get(this.f6531a);
    }
}
