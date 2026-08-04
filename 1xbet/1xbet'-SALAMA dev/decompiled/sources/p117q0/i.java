package p117q0;

import A1.x0;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f15753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, x0 x0Var, int i7) {
        super(str);
        this.f15752e = i7;
        this.f15753f = x0Var;
    }

    @Override // p117q0.n
    public final void a() {
        switch (this.f15752e) {
            case 0:
                ((MediaBrowserService.Result) this.f15753f.f613b).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) this.f15753f.f613b).detach();
                break;
            default:
                ((MediaBrowserService.Result) this.f15753f.f613b).detach();
                break;
        }
    }

    @Override // p117q0.n
    public final void c(Object obj) {
        ArrayList arrayList;
        switch (this.f15752e) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f15753f.q(arrayList);
                break;
            case 1:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                x0 x0Var = this.f15753f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    x0Var.q(null);
                } else {
                    Parcel parcelObtain2 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem2.writeToParcel(parcelObtain2, 0);
                    x0Var.q(parcelObtain2);
                }
                break;
            default:
                List<MediaBrowserCompat$MediaItem> list2 = (List) obj;
                x0 x0Var2 = this.f15753f;
                if (list2 == null) {
                    x0Var2.q(null);
                } else {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list2) {
                        Parcel parcelObtain3 = Parcel.obtain();
                        mediaBrowserCompat$MediaItem3.writeToParcel(parcelObtain3, 0);
                        arrayList3.add(parcelObtain3);
                    }
                    x0Var2.q(arrayList3);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, String str, x0 x0Var, Bundle bundle) {
        super(str);
        this.f15752e = 2;
        this.f15753f = x0Var;
    }
}
