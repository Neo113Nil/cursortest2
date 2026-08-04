package W4;

import com.google.protobuf.H;

/* JADX INFO: loaded from: classes2.dex */
public enum d implements H {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6734a;

    d(int i7) {
        this.f6734a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6734a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
