package L5;

import android.content.Context;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Map;
import w1.C1759x1;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class H extends AbstractC0331j {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4401b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4402c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761y0 f4403d;

    /* renamed from: e, reason: collision with root package name */
    public final r f4404e;

    /* renamed from: f, reason: collision with root package name */
    public final C0334m f4405f;

    /* renamed from: g, reason: collision with root package name */
    public final J f4406g;

    /* renamed from: h, reason: collision with root package name */
    public final M5.b f4407h;

    /* renamed from: i, reason: collision with root package name */
    public TemplateView f4408i;
    public final Context j;

    public H(Context context, int i7, C1759x1 c1759x1, String str, r rVar, C1761y0 c1761y0, Map map, J j, M5.b bVar) {
        super(i7);
        this.j = context;
        this.f4401b = c1759x1;
        this.f4402c = str;
        this.f4404e = rVar;
        this.f4403d = c1761y0;
        this.f4406g = j;
        this.f4407h = bVar;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        TemplateView templateView = this.f4408i;
        if (templateView != null) {
            templateView.f10517c.destroy();
            this.f4408i = null;
        }
    }

    @Override // L5.AbstractC0331j
    public final io.flutter.plugin.platform.f c() {
        TemplateView templateView = this.f4408i;
        if (templateView != null) {
            return new K(templateView, 0);
        }
        return null;
    }

    public H(Context context, int i7, C1759x1 c1759x1, String str, C0334m c0334m, C1761y0 c1761y0, Map map, J j, M5.b bVar) {
        super(i7);
        this.j = context;
        this.f4401b = c1759x1;
        this.f4402c = str;
        this.f4405f = c0334m;
        this.f4403d = c1761y0;
        this.f4406g = j;
        this.f4407h = bVar;
    }
}
