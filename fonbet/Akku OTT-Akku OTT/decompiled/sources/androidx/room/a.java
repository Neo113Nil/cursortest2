package androidx.room;

import com.google.android.exoplayer2.source.dash.DashMediaSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AutoCloser.autoCloser$lambda$3((AutoCloser) this.b);
                break;
            case 1:
                ((DashMediaSource) this.b).startLoadingManifest();
                break;
            default:
                ((com.google.android.material.timepicker.a) this.b).b();
                break;
        }
    }
}
