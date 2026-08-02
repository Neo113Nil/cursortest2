package B4;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class D extends AbstractC7737t implements Function1<Context, Context> {

    /* renamed from: b, reason: collision with root package name */
    public static final D f2496b = new D(1);

    @Override // kotlin.jvm.functions.Function1
    public final Context invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }
}
