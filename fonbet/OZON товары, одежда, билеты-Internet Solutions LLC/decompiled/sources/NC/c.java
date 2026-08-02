package NC;

import K80.k;
import U50.j;
import android.location.Location;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements E6.d, k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18835b;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f18834a = obj;
        this.f18835b = obj2;
    }

    @Override // K80.k
    public void a(Location location) {
        g60.b.a((j) this.f18834a, (g60.b) this.f18835b, location);
    }

    @Override // E6.d
    public void b(float f7, float f11, float f12) {
        Photo360Activity.setupImage$lambda$7$lambda$5((PhotoView) this.f18834a, (Photo360Activity) this.f18835b, f7, f11, f12);
    }
}
