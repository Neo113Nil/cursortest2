package q0;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f15738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ResultReceiver resultReceiver, int i7) {
        super(obj);
        this.f15737e = i7;
        this.f15738f = resultReceiver;
    }

    @Override // q0.n
    public final void c(Object obj) {
        switch (this.f15737e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (MediaBrowserCompat$MediaItem) obj);
                this.f15738f.b(0, bundle);
                break;
            default:
                List list = (List) obj;
                ResultReceiver resultReceiver = this.f15738f;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    resultReceiver.b(0, bundle2);
                    break;
                } else {
                    resultReceiver.b(-1, null);
                    break;
                }
        }
    }
}
