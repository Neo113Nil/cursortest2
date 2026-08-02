package V3;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0888y;

/* loaded from: classes2.dex */
public enum Z implements InterfaceC0888y {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6666a;

    Z(int i7) {
        this.f6666a = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6666a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
