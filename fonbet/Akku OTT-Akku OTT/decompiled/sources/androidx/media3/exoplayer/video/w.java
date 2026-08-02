package androidx.media3.exoplayer.video;

import android.content.Context;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.room.QueryInterceptorDatabase;
import com.razorpay.C$O0Oo$oo0o;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$disabled$8((DecoderCounters) this.c);
                break;
            case 1:
                QueryInterceptorDatabase.query$lambda$6((QueryInterceptorDatabase) this.b, (String) this.c);
                break;
            default:
                ((C$O0Oo$oo0o) this.b).lambda$startPrefetch$1((Context) this.c);
                break;
        }
    }
}
