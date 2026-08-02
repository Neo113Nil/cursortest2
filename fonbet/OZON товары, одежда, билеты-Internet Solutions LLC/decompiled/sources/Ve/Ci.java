package Ve;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class Ci extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hk f28772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ci(Hk hk) {
        super(1);
        this.f28772b = hk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f28772b.requireActivity().startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
        return Unit.f71690a;
    }
}
