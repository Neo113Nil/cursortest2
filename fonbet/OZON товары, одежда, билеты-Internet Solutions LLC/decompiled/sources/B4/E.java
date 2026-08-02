package B4;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class E extends AbstractC7737t implements Function1<Context, Activity> {

    /* renamed from: b, reason: collision with root package name */
    public static final E f2497b = new E(1);

    @Override // kotlin.jvm.functions.Function1
    public final Activity invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }
}
