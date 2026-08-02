package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29383b;

    public L1() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 32; i11++) {
            sb2.append(Integer.toHexString(kotlin.random.c.INSTANCE.e(16)));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f29382a = sb3;
        StringBuilder sb4 = new StringBuilder();
        for (int i12 = 0; i12 < 16; i12++) {
            sb4.append(Integer.toHexString(kotlin.random.c.INSTANCE.e(16)));
        }
        String sb5 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
        this.f29383b = sb5;
    }
}
