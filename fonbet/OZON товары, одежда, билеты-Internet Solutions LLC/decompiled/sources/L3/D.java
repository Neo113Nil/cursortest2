package L3;

import L3.K;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.I2;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3VO;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder;
import v3.o;

/* loaded from: classes8.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16252c;

    public /* synthetic */ D(int i11, Object obj, Object obj2) {
        this.f16250a = i11;
        this.f16251b = obj;
        this.f16252c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16250a) {
            case 0:
                K.a.b((K.a) this.f16251b, (Exception) this.f16252c);
                break;
            case 1:
                ScrollingTagListV3ViewHolder.bind$lambda$3$lambda$2((ScrollingTagListV3VO) this.f16251b, (RecyclerView) this.f16252c);
                break;
            case 2:
                ((io.sentry.cache.l) this.f16251b).K((I2) this.f16252c, "level.json");
                break;
            default:
                o.a.g((o.a) this.f16251b, (Exception) this.f16252c);
                break;
        }
    }
}
