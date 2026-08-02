package k0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import io.sentry.protocol.Request;
import t6.h;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327e extends AbstractC1328f {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f14657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327e(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, ViewGroup viewGroup, int i7) {
        super(abstractComponentCallbacksC0722v, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0722v + " to container " + viewGroup);
        switch (i7) {
            case 1:
                h.e(abstractComponentCallbacksC0722v, Request.JsonKeys.FRAGMENT);
                super(abstractComponentCallbacksC0722v, "Attempting to add fragment " + abstractComponentCallbacksC0722v + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f14657b = viewGroup;
                break;
            default:
                this.f14657b = viewGroup;
                break;
        }
    }
}
