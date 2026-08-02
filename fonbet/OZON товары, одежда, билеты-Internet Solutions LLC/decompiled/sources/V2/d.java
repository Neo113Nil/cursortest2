package V2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class d extends AbstractC7737t implements Function0<File> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f27943b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f27944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Context context, e eVar) {
        super(0);
        this.f27943b = context;
        this.f27944c = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        String str;
        Context applicationContext = this.f27943b;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        str = this.f27944c.f27945a;
        return c.a(applicationContext, str);
    }
}
