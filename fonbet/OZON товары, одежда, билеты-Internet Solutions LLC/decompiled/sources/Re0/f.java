package Re0;

import Sc.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import we0.InterfaceC10542A;

/* loaded from: classes3.dex */
public final class f extends ru.ozon.mapsdk.libre.placemark.view.b<ImageView> {

    public static final class a {
        public static final c a(Context context, Bitmap bitmap) {
            c cVar = new c(context);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            cVar.setLayoutParams(new ViewGroup.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
            cVar.measure(0, 0);
            return cVar;
        }

        public static final Bitmap b(View view) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
    }

    private final void s(View view, Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = bitmap.getHeight();
        layoutParams.width = bitmap.getWidth();
        view.setLayoutParams(layoutParams);
        j().measure(0, 0);
        j().setImageBitmap(bitmap);
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.b
    protected final void r() {
        super.r();
        InterfaceC10542A d11 = i().d().d();
        if (d11 instanceof InterfaceC10542A.b) {
            s(j(), a.b(((InterfaceC10542A.b) d11).a().invoke()));
        } else if (d11 instanceof InterfaceC10542A.c) {
            s(j(), ((InterfaceC10542A.c) d11).a());
        } else if (!(d11 instanceof InterfaceC10542A.a) && !Intrinsics.d(d11, InterfaceC10542A.d.f104404a)) {
            throw new o();
        }
    }
}
