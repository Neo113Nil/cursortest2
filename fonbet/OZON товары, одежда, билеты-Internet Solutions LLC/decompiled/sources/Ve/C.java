package Ve;

import N4.a;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4371k0 f28730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C4371k0 c4371k0) {
        super(0);
        this.f28730b = c4371k0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4371k0 c4371k0 = this.f28730b;
        Context context = c4371k0.f31405a;
        String e11 = U7.d.e(context.getPackageName(), "session_store");
        Object obj = c4371k0.f31406b;
        Sc.s.b(obj);
        N4.a a11 = N4.a.a(context, e11, (N4.b) obj, a.c.AES256_SIV, a.d.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(a11, "create(\n            /* c…heme.AES256_GCM\n        )");
        return a11;
    }
}
