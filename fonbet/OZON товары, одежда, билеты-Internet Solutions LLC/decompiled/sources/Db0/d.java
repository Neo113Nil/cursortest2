package Db0;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function1<WeakReference<Activity>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f6301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Activity activity) {
        super(1);
        this.f6301b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<Activity> weakReference) {
        WeakReference<Activity> it = weakReference;
        Intrinsics.checkNotNullParameter(it, "it");
        Activity activity = it.get();
        return Boolean.valueOf(activity == null || activity == this.f6301b);
    }
}
