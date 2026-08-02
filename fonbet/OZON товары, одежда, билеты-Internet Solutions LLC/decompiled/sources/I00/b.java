package I00;

import V.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7854a f11673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(C7854a c7854a) {
        super(0);
        this.f11673b = c7854a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C7854a c7854a = this.f11673b;
        return e.a("Map Widget update error [component: ", c7854a.c().a(), ". StateID: ", c7854a.c().d(), "]");
    }
}
