package Q2;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import sf.D;

/* loaded from: classes8.dex */
final class d extends AbstractC7737t implements Function0<D> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22934b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e<Object> f22935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Context context, e<Object> eVar) {
        super(0);
        this.f22934b = context;
        this.f22935c = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final D invoke() {
        String str = D.f98654b;
        Context applicationContext = this.f22934b;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        this.f22935c.getClass();
        String absolutePath = c.a(applicationContext, "secure_token_prefs.pb").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return D.a.a(absolutePath, false);
    }
}
