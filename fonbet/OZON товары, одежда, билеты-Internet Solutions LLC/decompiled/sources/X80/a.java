package X80;

import E30.b;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LX80/a;", "LE30/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "LS80/b;", "navigation", "LS80/b;", "getNavigation", "()LS80/b;", "setNavigation", "(LS80/b;)V", "fintech-nav_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a extends b {
    public S80.b navigation;

    @NotNull
    public final S80.b getNavigation() {
        S80.b bVar = this.navigation;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("navigation");
        throw null;
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentCallbacksC5392m h02 = getNavigation().h0();
        if (h02 != null) {
            h02.onStop();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        ComponentCallbacksC5392m h02 = getNavigation().h0();
        if (h02 != null) {
            h02.onStart();
        }
    }

    public final void setNavigation(@NotNull S80.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.navigation = bVar;
    }
}
