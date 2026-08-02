package Vb;

import Ve.E;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;
import lc.C7916a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f28499h = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* renamed from: a, reason: collision with root package name */
    protected final int f28500a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f28501b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f28502c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f28503d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f28504e;

    /* renamed from: f, reason: collision with root package name */
    protected final Typeface f28505f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f28506g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f28507a;

        /* renamed from: b, reason: collision with root package name */
        private int f28508b;

        /* renamed from: c, reason: collision with root package name */
        private int f28509c;

        /* renamed from: d, reason: collision with root package name */
        private int f28510d;

        /* renamed from: f, reason: collision with root package name */
        private Typeface f28512f;

        /* renamed from: e, reason: collision with root package name */
        private int f28511e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f28513g = -1;

        a() {
        }

        @NonNull
        public final void h(int i11) {
            this.f28507a = i11;
        }

        @NonNull
        public final void i(int i11) {
            this.f28508b = i11;
        }

        @NonNull
        public final r j() {
            return new r(this);
        }

        @NonNull
        public final void k(int i11) {
            this.f28509c = i11;
        }

        @NonNull
        public final void l(int i11) {
            this.f28510d = i11;
        }

        @NonNull
        public final void m(int i11) {
            this.f28511e = i11;
        }

        @NonNull
        public final void n(@NonNull Typeface typeface) {
            this.f28512f = typeface;
        }

        @NonNull
        public final void o(int i11) {
            this.f28513g = i11;
        }
    }

    protected r(@NonNull a aVar) {
        aVar.getClass();
        this.f28500a = aVar.f28507a;
        this.f28501b = aVar.f28508b;
        this.f28502c = aVar.f28509c;
        this.f28503d = aVar.f28510d;
        this.f28504e = aVar.f28511e;
        this.f28505f = aVar.f28512f;
        this.f28506g = aVar.f28513g;
    }

    @NonNull
    public static a e(@NonNull Context context) {
        C7916a c7916a = new C7916a(context.getResources().getDisplayMetrics().density);
        a aVar = new a();
        aVar.l(c7916a.a(8));
        aVar.h(c7916a.a(24));
        aVar.i(c7916a.a(4));
        aVar.k(c7916a.a(1));
        aVar.m(c7916a.a(1));
        aVar.o(c7916a.a(4));
        return aVar;
    }

    public final void a(@NonNull Paint paint) {
        paint.setColor(E.h(paint.getColor(), 75));
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f28504e;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public final void b(@NonNull TextPaint textPaint, int i11) {
        Typeface typeface = this.f28505f;
        if (typeface == null) {
            textPaint.setFakeBoldText(true);
        } else {
            textPaint.setTypeface(typeface);
        }
        float[] fArr = f28499h;
        if (6 >= i11) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i11 - 1]);
        } else {
            Locale locale = Locale.US;
            throw new IllegalStateException(Nh.a.c(i11, "Supplied heading level: ", " is invalid, where configured heading sizes are: `", Arrays.toString(fArr), "`"));
        }
    }

    public final void c(@NonNull Paint paint) {
        paint.setColor(paint.getColor());
        int i11 = this.f28502c;
        if (i11 != 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public final void d(@NonNull Paint paint) {
        paint.setColor(E.h(paint.getColor(), 25));
        paint.setStyle(Paint.Style.FILL);
        int i11 = this.f28506g;
        if (i11 >= 0) {
            paint.setStrokeWidth(i11);
        }
    }

    public final int f() {
        return this.f28500a;
    }

    public final int g() {
        int i11 = this.f28501b;
        return i11 == 0 ? (int) ((this.f28500a * 0.25f) + 0.5f) : i11;
    }

    public final int h(int i11) {
        return Math.min(this.f28500a, i11) / 2;
    }

    public final int i() {
        return this.f28503d;
    }
}
