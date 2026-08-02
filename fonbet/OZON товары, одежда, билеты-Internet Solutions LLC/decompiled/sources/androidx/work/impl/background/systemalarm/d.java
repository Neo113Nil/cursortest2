package androidx.work.impl.background.systemalarm;

import org.maplibre.android.snapshotter.MapSnapshotter;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollView;
import v50.j;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45385b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f45384a = i11;
        this.f45385b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45384a) {
            case 0:
                e.c((e) this.f45385b);
                break;
            case 1:
                ((MapSnapshotter) this.f45385b).getClass();
                break;
            case 2:
                j.i((j) this.f45385b);
                break;
            default:
                ((HorizontalAutoScrollView) this.f45385b).initGestureDetector();
                break;
        }
    }

    public /* synthetic */ d(MapSnapshotter mapSnapshotter, String str) {
        this.f45384a = 1;
        this.f45385b = mapSnapshotter;
    }
}
