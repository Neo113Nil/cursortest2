package T2;

import R2.U;
import R2.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import sf.AbstractC9688n;
import sf.D;

/* loaded from: classes8.dex */
final class e extends AbstractC7737t implements Function2<D, AbstractC9688n, U> {

    /* renamed from: b, reason: collision with root package name */
    public static final e f26529b = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final U invoke(D d11, AbstractC9688n abstractC9688n) {
        D path = d11;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(abstractC9688n, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(path, "path");
        String filePath = path.d().toString();
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new f0(filePath);
    }
}
