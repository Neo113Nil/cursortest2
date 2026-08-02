package Oe;

import Sc.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a0 extends S<Sc.y, Sc.z, Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a0 f20281c;

    static {
        Intrinsics.checkNotNullParameter(Sc.y.INSTANCE, "<this>");
        f20281c = new a0(b0.f20282a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        byte[] collectionSize = ((Sc.z) obj).c();
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, Sc.z zVar, int i11) {
        byte[] content = zVar.c();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            Ne.c w11 = encoder.w(b(), i12);
            byte b11 = content[i12];
            y.Companion companion = Sc.y.INSTANCE;
            w11.a(b11);
        }
    }
}
