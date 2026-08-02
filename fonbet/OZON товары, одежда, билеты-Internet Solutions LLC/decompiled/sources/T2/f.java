package T2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import sf.D;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function0<D> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g<Object> f26530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g<Object> gVar) {
        super(0);
        this.f26530b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final D invoke() {
        Function0 function0;
        Function0 function02;
        g<Object> gVar = this.f26530b;
        function0 = ((g) gVar).f26536d;
        D d11 = (D) function0.invoke();
        d11.getClass();
        if (tf.c.h(d11) != -1) {
            return d11.d();
        }
        StringBuilder sb2 = new StringBuilder("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ");
        function02 = ((g) gVar).f26536d;
        sb2.append(function02);
        sb2.append(", instead got ");
        sb2.append(d11);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
