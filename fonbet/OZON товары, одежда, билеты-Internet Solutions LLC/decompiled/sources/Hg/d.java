package Hg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f10958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar) {
        super(0);
        this.f10958b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final b invoke() {
        String str;
        c cVar = this.f10958b;
        cVar.getClass();
        Qg.b a11 = c.a(cVar);
        if (a11 == null || (str = a11.versionName()) == null) {
            str = "NA";
        }
        Qg.b a12 = c.a(cVar);
        return new b("com.vk.id.tracking.tracer", str, a12 != null ? a12.buildUuid() : null);
    }
}
