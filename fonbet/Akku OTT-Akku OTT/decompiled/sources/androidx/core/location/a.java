package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.offline.DownloadHelper;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept((Location) this.c);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$audioCodecError$9((Exception) this.c);
                break;
            default:
                ((DownloadHelper) this.b).lambda$prepare$3((DownloadHelper.Callback) this.c);
                break;
        }
    }
}
