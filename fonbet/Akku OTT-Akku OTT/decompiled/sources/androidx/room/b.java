package androidx.room;

import com.google.android.exoplayer2.source.dash.DashMediaSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((InvalidationTracker) this.b).onAutoCloseCallback();
                break;
            default:
                ((DashMediaSource) this.b).lambda$new$0();
                break;
        }
    }
}
