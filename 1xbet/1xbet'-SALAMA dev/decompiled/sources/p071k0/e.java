package p071k0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import io.sentry.protocol.Request;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f14663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, ViewGroup viewGroup, int i7) {
        super(abstractComponentCallbacksC0701v, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0701v + " to container " + viewGroup);
        switch (i7) {
            case 1:
                h.e(abstractComponentCallbacksC0701v, Request.JsonKeys.FRAGMENT);
                super(abstractComponentCallbacksC0701v, "Attempting to add fragment " + abstractComponentCallbacksC0701v + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f14663b = viewGroup;
                break;
            default:
                this.f14663b = viewGroup;
                break;
        }
    }
}
