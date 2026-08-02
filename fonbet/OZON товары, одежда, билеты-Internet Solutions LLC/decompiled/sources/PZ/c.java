package PZ;

import android.view.Window;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f22108a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f22109b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f22110c;

    c(d dVar, r rVar, AbstractC5434v abstractC5434v) {
        this.f22108a = dVar;
        this.f22109b = rVar;
        this.f22110c = abstractC5434v;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f22110c.e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f22108a.getClass();
        Window window = this.f22109b.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d.b(this.f22108a, this.f22109b);
    }
}
