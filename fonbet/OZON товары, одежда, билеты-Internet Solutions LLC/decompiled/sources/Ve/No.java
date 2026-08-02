package Ve;

import N4.a;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class No extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4483np f29570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public No(C4483np c4483np) {
        super(0);
        this.f29570b = c4483np;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4483np c4483np = this.f29570b;
        Context context = c4483np.f31685a;
        String e11 = U7.d.e(context.getPackageName(), "at_store");
        Object obj = c4483np.f31687c;
        Sc.s.b(obj);
        N4.a a11 = N4.a.a(context, e11, (N4.b) obj, a.c.AES256_SIV, a.d.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(a11, "create(\n            /* c…heme.AES256_GCM\n        )");
        return a11;
    }
}
