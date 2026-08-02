package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class H0 extends AbstractC1132d0 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(kotlinx.serialization.descriptors.f primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.b = primitive.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.b;
    }
}
