package E30;

import E30.e;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE30/a;", "Landroidx/appcompat/app/g;", "<init>", "()V", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a extends androidx.appcompat.app.g {

    /* renamed from: h, reason: collision with root package name */
    public z0.b f7408h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ArrayList f7409i = new ArrayList();

    @NotNull
    public final z0.b J() {
        z0.b bVar = this.f7408h;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("factory");
        throw null;
    }

    public final void K(@NotNull CameraFragment listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7409i.add(listener);
    }

    public final void L(@NotNull CameraFragment listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7409i.remove(listener);
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Iterator it = e.a().iterator();
        while (it.hasNext()) {
            ((e.a) it.next()).a(i11, i12, intent);
        }
    }

    @Override // androidx.appcompat.app.g, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        Iterator it = this.f7409i.iterator();
        while (it.hasNext()) {
            ((View.OnKeyListener) it.next()).onKey(null, i11, keyEvent);
        }
        return super.onKeyDown(i11, keyEvent);
    }
}
