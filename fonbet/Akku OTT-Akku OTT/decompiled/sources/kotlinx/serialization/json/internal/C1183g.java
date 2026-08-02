package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.serialization.json.internal.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1183g extends C1182f {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183g(u writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.c = z;
    }

    @Override // kotlinx.serialization.json.internal.C1182f
    public final void h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.c) {
            super.h(value);
        } else {
            f(value);
        }
    }
}
