package V3;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0844y;

/* JADX INFO: loaded from: classes2.dex */
public enum X implements InterfaceC0844y {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6659a;

    X(int i7) {
        this.f6659a = i7;
    }
}
