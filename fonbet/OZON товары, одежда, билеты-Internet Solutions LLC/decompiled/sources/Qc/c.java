package Qc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23222a = 0;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f23223a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f23224b;

        /* renamed from: c, reason: collision with root package name */
        private final Qc.b f23225c;

        public a(Context context, Bitmap bitmap, Qc.b bVar) {
            this.f23223a = context;
            this.f23224b = bitmap;
            this.f23225c = bVar;
        }

        public final void a(ImageView imageView) {
            Bitmap bitmap = this.f23224b;
            int width = bitmap.getWidth();
            Qc.b bVar = this.f23225c;
            bVar.f23219a = width;
            bVar.f23220b = bitmap.getHeight();
            imageView.setImageDrawable(new BitmapDrawable(this.f23223a.getResources(), Qc.a.a(imageView.getContext(), bitmap, bVar)));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final View f23226a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f23227b;

        /* renamed from: c, reason: collision with root package name */
        private final Qc.b f23228c;

        public b(Context context) {
            this.f23227b = context;
            View view = new View(context);
            this.f23226a = view;
            view.setTag("c");
            Qc.b bVar = new Qc.b();
            bVar.f23221c = 25;
            this.f23228c = bVar;
        }

        public final a a(Bitmap bitmap) {
            return new a(this.f23227b, bitmap, this.f23228c);
        }

        public final void b(ViewGroup viewGroup) {
            int measuredWidth = viewGroup.getMeasuredWidth();
            Qc.b bVar = this.f23228c;
            bVar.f23219a = measuredWidth;
            bVar.f23220b = viewGroup.getMeasuredHeight();
            Resources resources = this.f23227b.getResources();
            viewGroup.setDrawingCacheEnabled(true);
            viewGroup.destroyDrawingCache();
            viewGroup.setDrawingCacheQuality(524288);
            Bitmap drawingCache = viewGroup.getDrawingCache();
            Bitmap a11 = Qc.a.a(viewGroup.getContext(), drawingCache, bVar);
            drawingCache.recycle();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, a11);
            View view = this.f23226a;
            view.setBackground(bitmapDrawable);
            viewGroup.addView(view);
        }

        public final void c(int i11) {
            this.f23228c.f23221c = i11;
        }

        public final void d() {
            this.f23228c.getClass();
        }
    }
}
