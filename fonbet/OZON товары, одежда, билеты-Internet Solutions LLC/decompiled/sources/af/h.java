package af;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class h extends AbstractC7737t implements Function1<IOException, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5015e f36757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(C5015e c5015e) {
        super(1);
        this.f36757b = c5015e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IOException iOException) {
        IOException it = iOException;
        Intrinsics.checkNotNullParameter(it, "it");
        byte[] bArr = Ye.b.f34900a;
        this.f36757b.f36723i = true;
        return Unit.f71690a;
    }
}
