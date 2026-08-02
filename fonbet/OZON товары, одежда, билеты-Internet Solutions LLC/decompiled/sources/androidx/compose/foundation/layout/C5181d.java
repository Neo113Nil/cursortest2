package androidx.compose.foundation.layout;

import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5181d extends AbstractC7737t implements Function2<Integer, Z1.s, Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.InterfaceC0966b f39475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5181d(InterfaceC6250b.InterfaceC0966b interfaceC0966b) {
        super(2);
        this.f39475b = interfaceC0966b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, Z1.s sVar) {
        return Integer.valueOf(this.f39475b.a(0, num.intValue(), sVar));
    }
}
