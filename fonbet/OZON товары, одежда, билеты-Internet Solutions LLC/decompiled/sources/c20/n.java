package c20;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;

/* loaded from: classes7.dex */
public final /* synthetic */ class n implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56418b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f56417a = i11;
        this.f56418b = obj;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        switch (this.f56417a) {
            case 0:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                ((AbstractC6065b) this.f56418b).dispatchLifecycleEvent$composer_recycler_ui_release(event);
                break;
            default:
                PermissionRequest.Builder.addCallbackStateInvalidateListener$lambda$8((PermissionRequest.Builder) this.f56418b, j11, event);
                break;
        }
    }
}
