package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5201y extends AbstractC7737t implements InterfaceC6511n<InterfaceC2552v, Integer, Integer, Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f39569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5201y(int[] iArr) {
        super(3);
        this.f39569b = iArr;
    }

    @Override // fd.InterfaceC6511n
    public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num, Integer num2) {
        int intValue = num.intValue();
        num2.intValue();
        return Integer.valueOf(this.f39569b[intValue]);
    }
}
