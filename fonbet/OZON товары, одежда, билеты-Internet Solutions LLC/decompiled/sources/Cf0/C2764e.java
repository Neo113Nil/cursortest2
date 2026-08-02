package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.AbstractC8919b;

/* renamed from: Cf0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C2764e extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8919b.c f4903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2764e(AbstractC8919b.c cVar) {
        super(0);
        this.f4903b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AbstractC8919b.c cVar = this.f4903b;
        return G.g.c(cVar.getName().a(), "/", cVar.getVersion());
    }
}
