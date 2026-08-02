package K1;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: K1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3423c extends AbstractC7737t implements InterfaceC6511n<String, Integer, Integer, String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ R1.c f15044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3423c(R1.c cVar) {
        super(3);
        this.f15044b = cVar;
    }

    @Override // fd.InterfaceC6511n
    public final String invoke(String str, Integer num, Integer num2) {
        String substring = str.substring(num.intValue(), num2.intValue());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        R1.c cVar = this.f15044b;
        String upperCase = substring.toUpperCase((cVar.isEmpty() ? R1.d.a().a().c() : cVar.c()).a());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
