package androidx.core.widget;

import android.widget.Toast;
import androidx.room.RoomTrackingLiveData;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.razorpay.MagicXActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ContentLoadingProgressBar) this.b).hideOnUiThread();
                break;
            case 1:
                RoomTrackingLiveData.invalidationRunnable$lambda$1((RoomTrackingLiveData) this.b);
                break;
            case 2:
                ((DownloadHelper) this.b).lambda$onMediaPrepared$4();
                break;
            case 3:
                MagicXActivity.m1699showHalfTransparentPage$lambda0((MagicXActivity) this.b);
                break;
            default:
                Toast toast = ((io.github.ponnamkarthik.toast.fluttertoast.b) this.b).b;
                if (toast != null) {
                    toast.show();
                    break;
                }
                break;
        }
    }
}
