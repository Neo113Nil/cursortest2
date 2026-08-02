package bc;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* renamed from: bc.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5631g {

    /* renamed from: bc.g$a */
    final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f55872a;

        a(TextView textView) {
            this.f55872a = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AbstractC5631g.c(this.f55872a);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(R.id.markwon_drawables_scheduler, null);
        }
    }

    /* renamed from: bc.g$b */
    private static class b implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f55873a;

        /* renamed from: b, reason: collision with root package name */
        private final c f55874b;

        /* renamed from: c, reason: collision with root package name */
        private Rect f55875c;

        /* renamed from: bc.g$b$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Drawable f55876a;

            a(Drawable drawable) {
                this.f55876a = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.invalidateDrawable(this.f55876a);
            }
        }

        b(@NonNull TextView textView, @NonNull c cVar, Rect rect) {
            this.f55873a = textView;
            this.f55874b = cVar;
            this.f55875c = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
            Looper myLooper = Looper.myLooper();
            Looper mainLooper = Looper.getMainLooper();
            TextView textView = this.f55873a;
            if (myLooper != mainLooper) {
                textView.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.f55875c.equals(bounds)) {
                textView.postInvalidate();
            } else {
                this.f55874b.a();
                this.f55875c = new Rect(bounds);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
            this.f55873a.postDelayed(runnable, j11 - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.f55873a.removeCallbacks(runnable);
        }
    }

    /* renamed from: bc.g$c */
    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f55878a;

        c(@NonNull TextView textView) {
            this.f55878a = textView;
        }

        public final void a() {
            TextView textView = this.f55878a;
            textView.removeCallbacks(this);
            textView.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView = this.f55878a;
            textView.setText(textView.getText());
        }
    }

    private static C5632h[] a(@NonNull TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C5632h[]) ((Spanned) text).getSpans(0, length, C5632h.class);
    }

    public static void b(@NonNull TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode);
        int hashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != hashCode) {
            textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(hashCode));
            C5632h[] a11 = a(textView);
            if (a11 == null || a11.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.markwon_drawables_scheduler) == null) {
                a aVar = new a(textView);
                textView.addOnAttachStateChangeListener(aVar);
                textView.setTag(R.id.markwon_drawables_scheduler, aVar);
            }
            c cVar = new c(textView);
            for (C5632h c5632h : a11) {
                C5625a a12 = c5632h.a();
                a12.e(new b(textView, cVar, a12.getBounds()));
            }
        }
    }

    public static void c(@NonNull TextView textView) {
        if (textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        C5632h[] a11 = a(textView);
        if (a11 == null || a11.length <= 0) {
            return;
        }
        for (C5632h c5632h : a11) {
            c5632h.a().e(null);
        }
    }
}
