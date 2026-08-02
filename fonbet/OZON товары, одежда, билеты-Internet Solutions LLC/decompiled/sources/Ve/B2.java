package Ve;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class B2 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f28657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(RedirectActivity redirectActivity) {
        super(1);
        this.f28657b = redirectActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        RedirectActivity redirectActivity = this.f28657b;
        int i11 = RedirectActivity.f98831g;
        synchronized (redirectActivity) {
            try {
                if (!booleanValue) {
                    List<ComponentCallbacksC5392m> r02 = redirectActivity.getSupportFragmentManager().r0();
                    Intrinsics.checkNotNullExpressionValue(r02, "supportFragmentManager.fragments");
                    Object Q11 = C7714v.Q(0, r02);
                    Mq mq = Q11 instanceof Mq ? (Mq) Q11 : null;
                    if (mq != null) {
                        mq.dismiss();
                    }
                    break;
                }
                List<ComponentCallbacksC5392m> r03 = redirectActivity.getSupportFragmentManager().r0();
                Intrinsics.checkNotNullExpressionValue(r03, "supportFragmentManager.fragments");
                Iterator<T> it = r03.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacksC5392m) it.next()) instanceof Mq) {
                        break;
                    }
                }
                androidx.fragment.app.Q p11 = redirectActivity.getSupportFragmentManager().p();
                p11.d(new Mq(), "SdkFlowBottomSheetDialogFragment");
                p11.k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.f71690a;
    }
}
