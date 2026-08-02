package B4;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public enum H {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(7),
    /* JADX INFO: Fake field, exist only in values array */
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    /* JADX INFO: Fake field, exist only in values array */
    OUT_OF_RANGE(11),
    /* JADX INFO: Fake field, exist only in values array */
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: D, reason: collision with root package name */
    public static final SparseArray f1087D;

    /* renamed from: a, reason: collision with root package name */
    public final int f1097a;

    static {
        SparseArray sparseArray = new SparseArray();
        for (H h6 : values()) {
            H h7 = (H) sparseArray.get(h6.f1097a);
            if (h7 != null) {
                throw new IllegalStateException("Code value duplication between " + h7 + "&" + h6.name());
            }
            sparseArray.put(h6.f1097a, h6);
        }
        f1087D = sparseArray;
    }

    H(int i7) {
        this.f1097a = i7;
    }
}
