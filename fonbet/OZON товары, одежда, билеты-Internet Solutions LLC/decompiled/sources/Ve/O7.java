package Ve;

import Lm0.a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.jvm.internal.Intrinsics;
import v5.C10232f;
import v5.C10234h;
import v5.C10243q;

/* loaded from: classes10.dex */
public final class O7 implements C10234h.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f29595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f29596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Drawable f29597d;

    public O7(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, Drawable drawable) {
        this.f29595b = shimmerFrameLayout;
        this.f29596c = imageView;
        this.f29597d = drawable;
    }

    @Override // v5.C10234h.b
    public final void a(C10234h request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ShimmerFrameLayout shimmerFrameLayout = this.f29595b;
        shimmerFrameLayout.a();
        shimmerFrameLayout.setVisibility(0);
    }

    @Override // v5.C10234h.b
    public final void b(C10234h request, C10232f result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        a.b bVar = Lm0.a.f17149a;
        bVar.b("IMAGE REQUEST LISTENER EXCEPTION");
        bVar.e(result.c());
        ShimmerFrameLayout shimmerFrameLayout = this.f29595b;
        shimmerFrameLayout.b();
        shimmerFrameLayout.setVisibility(8);
        ImageView imageView = this.f29596c;
        imageView.setImageDrawable(this.f29597d);
        imageView.setVisibility(0);
    }

    @Override // v5.C10234h.b
    public final void c(C10234h request, C10243q result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        ShimmerFrameLayout shimmerFrameLayout = this.f29595b;
        shimmerFrameLayout.b();
        shimmerFrameLayout.setVisibility(8);
        this.f29596c.setVisibility(0);
    }
}
