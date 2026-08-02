package q0;

import A1.x0;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f15747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, x0 x0Var, int i7) {
        super(str);
        this.f15746e = i7;
        this.f15747f = x0Var;
    }

    @Override // q0.n
    public final void a() {
        switch (this.f15746e) {
            case 0:
                ((MediaBrowserService.Result) this.f15747f.f613b).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) this.f15747f.f613b).detach();
                break;
            default:
                ((MediaBrowserService.Result) this.f15747f.f613b).detach();
                break;
        }
    }

    @Override // q0.n
    public final void c(Object obj) {
        ArrayList arrayList;
        switch (this.f15746e) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                        arrayList2.add(obtain);
                    }
                    arrayList = arrayList2;
                }
                this.f15747f.q(arrayList);
                break;
            case 1:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                x0 x0Var = this.f15747f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    x0Var.q(null);
                    break;
                } else {
                    Parcel obtain2 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem2.writeToParcel(obtain2, 0);
                    x0Var.q(obtain2);
                    break;
                }
            default:
                List<MediaBrowserCompat$MediaItem> list2 = (List) obj;
                x0 x0Var2 = this.f15747f;
                if (list2 == null) {
                    x0Var2.q(null);
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list2) {
                        Parcel obtain3 = Parcel.obtain();
                        mediaBrowserCompat$MediaItem3.writeToParcel(obtain3, 0);
                        arrayList3.add(obtain3);
                    }
                    x0Var2.q(arrayList3);
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, String str, x0 x0Var, Bundle bundle) {
        super(str);
        this.f15746e = 2;
        this.f15747f = x0Var;
    }
}
