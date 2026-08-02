package k0;

import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import io.sentry.protocol.Request;
import t6.h;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1328f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0722v f14658a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1328f(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, String str) {
        super(str);
        h.e(abstractComponentCallbacksC0722v, Request.JsonKeys.FRAGMENT);
        this.f14658a = abstractComponentCallbacksC0722v;
    }
}
