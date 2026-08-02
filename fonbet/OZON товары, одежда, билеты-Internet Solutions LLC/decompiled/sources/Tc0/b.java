package Tc0;

import android.content.IntentFilter;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.l;

/* loaded from: classes3.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f27042a;

    /* renamed from: b, reason: collision with root package name */
    private a f27043b;

    public b(Function1 function1) {
        this.f27042a = function1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m componentCallbacksC5392m = owner instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) owner : null;
        r activity = componentCallbacksC5392m != null ? componentCallbacksC5392m.getActivity() : null;
        if (activity == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (l.a(activity, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"}, 2))) {
            this.f27043b = new a(this.f27042a);
            androidx.core.content.a.registerReceiver(activity, this.f27043b, new IntentFilter("android.intent.action.PHONE_STATE"), 2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().e(this);
        ComponentCallbacksC5392m componentCallbacksC5392m = owner instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) owner : null;
        r activity = componentCallbacksC5392m != null ? componentCallbacksC5392m.getActivity() : null;
        if (activity == null || (aVar = this.f27043b) == null) {
            return;
        }
        this.f27043b = null;
        activity.unregisterReceiver(aVar);
    }
}
