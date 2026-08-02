package androidx.compose.foundation;

import D1.I0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import r0.C9107H;

/* loaded from: classes.dex */
final class j extends AbstractC7737t implements Function1<I0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f39291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(I i11) {
        super(1);
        this.f39291b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(I0 i02) {
        boolean z11;
        I0 i03 = i02;
        I i11 = this.f39291b;
        if (!i11.f71783a) {
            Intrinsics.g(i03, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (!((C9107H) i03).I1()) {
                z11 = false;
                i11.f71783a = z11;
                return Boolean.valueOf(!z11);
            }
        }
        z11 = true;
        i11.f71783a = z11;
        return Boolean.valueOf(!z11);
    }
}
