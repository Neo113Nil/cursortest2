package B4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2593w extends AbstractC7737t implements Function1<H, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final C2593w f2716b = new C2593w(1);

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(H h11) {
        H it = h11;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.m());
    }
}
