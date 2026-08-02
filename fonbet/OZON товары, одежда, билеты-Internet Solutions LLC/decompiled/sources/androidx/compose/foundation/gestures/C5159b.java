package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.InterfaceC9122b;

/* renamed from: androidx.compose.foundation.gestures.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5159b extends AbstractC7737t implements Function2<Float, Float, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC9122b f39113b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f39114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5159b(InterfaceC9122b interfaceC9122b, kotlin.jvm.internal.J j11) {
        super(2);
        this.f39113b = interfaceC9122b;
        this.f39114c = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f7, Float f11) {
        float floatValue = f7.floatValue();
        this.f39113b.a(floatValue, f11.floatValue());
        this.f39114c.f71784a = floatValue;
        return Unit.f71690a;
    }
}
