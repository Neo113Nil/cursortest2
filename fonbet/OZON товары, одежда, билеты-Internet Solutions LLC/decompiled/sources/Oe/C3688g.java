package Oe;

import kotlin.jvm.internal.C7723e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3688g extends S<Byte, byte[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3688g f20294c;

    static {
        Intrinsics.checkNotNullParameter(C7723e.f71803a, "<this>");
        f20294c = new C3688g(C3689h.f20296a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, byte[] bArr, int i11) {
        byte[] content = bArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.y(b(), i12, content[i12]);
        }
    }
}
