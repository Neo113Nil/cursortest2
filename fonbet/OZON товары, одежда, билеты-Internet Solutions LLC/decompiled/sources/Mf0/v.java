package Mf0;

import S0.InterfaceC3972m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class v extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f18057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.f18057b = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder();
        int length = it.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = it.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        Integer w02 = kotlin.text.h.w0(sb3);
        this.f18057b.d(w02 != null ? w02.intValue() : 0);
        return Unit.f71690a;
    }
}
