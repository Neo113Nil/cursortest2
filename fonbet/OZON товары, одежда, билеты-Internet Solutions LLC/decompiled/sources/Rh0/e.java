package Rh0;

import C.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class e extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25104b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(String str, String str2) {
        super(0);
        this.f25104b = str;
        this.f25105c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("HW ids migration completed successfully (hwId: ");
        sb2.append(this.f25104b);
        sb2.append(", oldHwId: ");
        return o0.c(sb2, this.f25105c, ").");
    }
}
