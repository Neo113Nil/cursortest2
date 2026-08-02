package A10;

import androidx.recyclerview.widget.RecyclerView;
import org.chromium.net.impl.CronetUrlRequest;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f280a = i11;
        this.f281b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f280a) {
            case 0:
                ((RecyclerView) this.f281b).invalidateItemDecorations();
                break;
            default:
                ((CronetUrlRequest) this.f281b).f78747f.n();
                break;
        }
    }
}
