package W4;

import com.google.protobuf.H;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements H {
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6728a;

    b(int i7) {
        this.f6728a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6728a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
