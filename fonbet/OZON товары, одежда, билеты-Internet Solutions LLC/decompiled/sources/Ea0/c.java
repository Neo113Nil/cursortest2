package Ea0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends AbstractC7737t implements Function1<String, String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f7772b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7773c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f7774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, a aVar2) {
        super(1);
        this.f7772b = aVar;
        this.f7773c = str;
        this.f7774d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        a aVar = this.f7772b;
        String str2 = this.f7773c;
        boolean j11 = a.j(aVar, str2);
        boolean d11 = Intrinsics.d(str2, str);
        if (!j11 || d11) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        this.f7774d.f7752e.compareAndSet(false, true);
        return str2;
    }
}
