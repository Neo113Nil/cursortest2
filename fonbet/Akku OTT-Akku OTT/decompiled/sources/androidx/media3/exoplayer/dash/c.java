package androidx.media3.exoplayer.dash;

import com.facebook.internal.p;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DashMediaSource) this.b).startLoadingManifest();
                break;
            case 1:
                ((p.b) this.b).getClass();
                break;
            default:
                ((TextInputLayout) this.b).d.requestLayout();
                break;
        }
    }
}
