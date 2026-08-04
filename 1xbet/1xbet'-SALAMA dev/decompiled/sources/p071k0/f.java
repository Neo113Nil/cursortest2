package p071k0;

import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import io.sentry.protocol.Request;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0701v f14664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, String str) {
        super(str);
        h.e(abstractComponentCallbacksC0701v, Request.JsonKeys.FRAGMENT);
        this.f14664a = abstractComponentCallbacksC0701v;
    }
}
