package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements z51 {

    /* JADX INFO: renamed from: j */
    public final ScrollFeedbackProvider f9175j;

    public y51(NestedScrollView nestedScrollView) {
        this.f9175j = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.z51
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f9175j.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.z51
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f9175j.onScrollProgress(i, i2, i3, i4);
    }
}
