package n1;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import l3.C2054a;

/* renamed from: n1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2173n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2172m f18444a;

    public C2173n(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f18444a = new C2171l(nestedScrollView);
        } else {
            this.f18444a = new C2054a(2);
        }
    }
}
