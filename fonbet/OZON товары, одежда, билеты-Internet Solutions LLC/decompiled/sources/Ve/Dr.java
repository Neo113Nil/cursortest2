package Ve;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Dr extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Dr(Object obj, int i11) {
        super(1);
        this.f28889b = i11;
        this.f28890c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28889b) {
            case 0:
                ((J4) this.f28890c).requireActivity().startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
                break;
            default:
                wl0.c error = (wl0.c) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                ((lm0.e) this.f28890c).a(error);
                break;
        }
        return Unit.f71690a;
    }
}
