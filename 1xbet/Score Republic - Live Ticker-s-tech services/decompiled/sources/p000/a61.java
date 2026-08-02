package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a61 {

    /* JADX INFO: renamed from: a */
    public final z51 f43a;

    public a61(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f43a = new y51(nestedScrollView);
        } else {
            this.f43a = new aa0(14);
        }
    }
}
