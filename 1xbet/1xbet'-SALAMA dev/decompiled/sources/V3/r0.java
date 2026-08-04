package V3;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0844y;

/* JADX INFO: loaded from: classes2.dex */
public enum r0 implements InterfaceC0844y {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6674a;

    r0(int i7) {
        this.f6674a = i7;
    }

    public static r0 a(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f6674a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
