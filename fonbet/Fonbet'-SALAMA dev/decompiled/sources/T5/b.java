package T5;

import android.widget.Toast$Callback;
import w1.P2;

/* loaded from: classes2.dex */
public final class b extends Toast$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f6369a;

    public b(P2 p22) {
        this.f6369a = p22;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f6369a.f17509c = null;
    }
}
