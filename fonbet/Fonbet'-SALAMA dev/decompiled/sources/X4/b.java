package X4;

import com.google.protobuf.H;

/* loaded from: classes2.dex */
public enum b implements H {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7478a;

    b(int i7) {
        this.f7478a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7478a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
