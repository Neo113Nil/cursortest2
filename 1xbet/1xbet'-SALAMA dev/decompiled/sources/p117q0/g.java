package p117q0;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f15744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ResultReceiver resultReceiver, int i7) {
        super(obj);
        this.f15743e = i7;
        this.f15744f = resultReceiver;
    }

    @Override // p117q0.n
    public final void c(Object obj) {
        switch (this.f15743e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (MediaBrowserCompat$MediaItem) obj);
                this.f15744f.b(0, bundle);
                break;
            default:
                List list = (List) obj;
                ResultReceiver resultReceiver = this.f15744f;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    resultReceiver.b(0, bundle2);
                } else {
                    resultReceiver.b(-1, null);
                }
                break;
        }
    }
}
