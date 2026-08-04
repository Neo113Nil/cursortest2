package V3;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0844y;

/* JADX INFO: loaded from: classes2.dex */
public enum O implements InterfaceC0844y {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6651a;

    O(int i7) {
        this.f6651a = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6651a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
