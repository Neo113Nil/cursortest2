package Ea0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AbstractC7737t implements Function1<String, String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f7770b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str) {
        super(1);
        this.f7770b = aVar;
        this.f7771c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        a aVar = this.f7770b;
        String str2 = this.f7771c;
        boolean j11 = a.j(aVar, str2);
        boolean d11 = Intrinsics.d(str2, str);
        if (!j11 || d11) {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
