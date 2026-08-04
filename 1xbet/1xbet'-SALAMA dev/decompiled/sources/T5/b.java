package T5;

import android.widget.Toast$Callback;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Toast$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f6369a;

    public b(P2 p5) {
        this.f6369a = p5;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f6369a.f17515c = null;
    }
}
