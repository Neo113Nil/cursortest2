package D4;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2846v extends AbstractC7737t implements Function1<Bundle, B4.P> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f5932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2846v(Context context) {
        super(1);
        this.f5932b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final B4.P invoke(Bundle bundle) {
        B4.P a11 = C2848x.a(this.f5932b);
        a11.U(bundle);
        return a11;
    }
}
