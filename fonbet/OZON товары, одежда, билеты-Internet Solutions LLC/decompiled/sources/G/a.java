package G;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f9592a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f9593b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f9594c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f9595d = new Rational(9, 16);

    /* renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0199a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        private final RectF f9596a;

        /* renamed from: b, reason: collision with root package name */
        private final Rational f9597b;

        public C0199a(@NonNull Rational rational, Rational rational2) {
            this.f9597b = rational2 == null ? new Rational(4, 3) : rational2;
            this.f9596a = b(rational);
        }

        private static float a(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF b(Rational rational) {
            float floatValue = rational.floatValue();
            Rational rational2 = this.f9597b;
            return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z11 = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF b11 = b(rational3);
            RectF b12 = b(rational4);
            RectF rectF = this.f9596a;
            boolean z12 = b11.width() >= rectF.width() && b11.height() >= rectF.height();
            if (b12.width() >= rectF.width() && b12.height() >= rectF.height()) {
                z11 = true;
            }
            if (z12 && z11) {
                return (int) Math.signum((b11.height() * b11.width()) - (b12.height() * b12.width()));
            }
            if (z12) {
                return -1;
            }
            if (z11) {
                return 1;
            }
            return -((int) Math.signum(a(b11, rectF) - a(b12, rectF)));
        }
    }

    public static boolean a(@NonNull Size size, Rational rational, @NonNull Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = M.c.f17199a;
        if (size.getHeight() * size.getWidth() >= M.c.a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i11 = width % 16;
            if (i11 == 0 && height % 16 == 0) {
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i11 == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
            }
        }
        return false;
    }

    private static boolean b(int i11, int i12, Rational rational) {
        x2.i.b(i12 % 16 == 0);
        double numerator = (rational.getNumerator() * i11) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i12 + (-16))) && numerator < ((double) (i12 + 16));
    }
}
