package We;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class x extends AbstractC7737t implements Function0<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f33813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(List list) {
        super(0);
        this.f33813b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        return this.f33813b;
    }
}
