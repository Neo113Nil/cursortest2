package p000;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0008a7 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TextView f47j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Typeface f48k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f49l;

    public RunnableC0008a7(TextView textView, Typeface typeface, int i) {
        this.f47j = textView;
        this.f48k = typeface;
        this.f49l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47j.setTypeface(this.f48k, this.f49l);
    }
}
