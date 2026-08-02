package Pl0;

import R2.C3909c;
import W2.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class o extends AbstractC7737t implements Function1<C3909c, W2.f> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(1);
        this.f22700b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final W2.f invoke(C3909c c3909c) {
        C3909c exception = c3909c;
        Intrinsics.checkNotNullParameter(exception, "exception");
        El0.n nVar = e.f22651b;
        (nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk")).error(this.f22700b + " data store was initialized with default values, " + exception, null);
        return W2.g.b(new f.b[0]);
    }
}
