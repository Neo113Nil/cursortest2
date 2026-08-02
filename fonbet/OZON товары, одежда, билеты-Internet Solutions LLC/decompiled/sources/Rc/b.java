package Rc;

import Pk0.h;
import T5.f;
import W5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b extends Rc.a {

    /* renamed from: b, reason: collision with root package name */
    private final int f24971b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24972c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC0496b f24973d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24974a;

        static {
            int[] iArr = new int[EnumC0496b.values().length];
            f24974a = iArr;
            try {
                iArr[EnumC0496b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24974a[EnumC0496b.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24974a[EnumC0496b.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24974a[EnumC0496b.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24974a[EnumC0496b.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24974a[EnumC0496b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24974a[EnumC0496b.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24974a[EnumC0496b.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24974a[EnumC0496b.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24974a[EnumC0496b.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24974a[EnumC0496b.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24974a[EnumC0496b.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24974a[EnumC0496b.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24974a[EnumC0496b.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24974a[EnumC0496b.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Rc.b$b, reason: collision with other inner class name */
    public static final class EnumC0496b {
        private static final /* synthetic */ EnumC0496b[] $VALUES;
        public static final EnumC0496b ALL;
        public static final EnumC0496b BOTTOM;
        public static final EnumC0496b BOTTOM_LEFT;
        public static final EnumC0496b BOTTOM_RIGHT;
        public static final EnumC0496b DIAGONAL_FROM_TOP_LEFT;
        public static final EnumC0496b DIAGONAL_FROM_TOP_RIGHT;
        public static final EnumC0496b LEFT;
        public static final EnumC0496b OTHER_BOTTOM_LEFT;
        public static final EnumC0496b OTHER_BOTTOM_RIGHT;
        public static final EnumC0496b OTHER_TOP_LEFT;
        public static final EnumC0496b OTHER_TOP_RIGHT;
        public static final EnumC0496b RIGHT;
        public static final EnumC0496b TOP;
        public static final EnumC0496b TOP_LEFT;
        public static final EnumC0496b TOP_RIGHT;

        static {
            EnumC0496b enumC0496b = new EnumC0496b("ALL", 0);
            ALL = enumC0496b;
            EnumC0496b enumC0496b2 = new EnumC0496b("TOP_LEFT", 1);
            TOP_LEFT = enumC0496b2;
            EnumC0496b enumC0496b3 = new EnumC0496b("TOP_RIGHT", 2);
            TOP_RIGHT = enumC0496b3;
            EnumC0496b enumC0496b4 = new EnumC0496b("BOTTOM_LEFT", 3);
            BOTTOM_LEFT = enumC0496b4;
            EnumC0496b enumC0496b5 = new EnumC0496b("BOTTOM_RIGHT", 4);
            BOTTOM_RIGHT = enumC0496b5;
            EnumC0496b enumC0496b6 = new EnumC0496b("TOP", 5);
            TOP = enumC0496b6;
            EnumC0496b enumC0496b7 = new EnumC0496b("BOTTOM", 6);
            BOTTOM = enumC0496b7;
            EnumC0496b enumC0496b8 = new EnumC0496b("LEFT", 7);
            LEFT = enumC0496b8;
            EnumC0496b enumC0496b9 = new EnumC0496b("RIGHT", 8);
            RIGHT = enumC0496b9;
            EnumC0496b enumC0496b10 = new EnumC0496b("OTHER_TOP_LEFT", 9);
            OTHER_TOP_LEFT = enumC0496b10;
            EnumC0496b enumC0496b11 = new EnumC0496b("OTHER_TOP_RIGHT", 10);
            OTHER_TOP_RIGHT = enumC0496b11;
            EnumC0496b enumC0496b12 = new EnumC0496b("OTHER_BOTTOM_LEFT", 11);
            OTHER_BOTTOM_LEFT = enumC0496b12;
            EnumC0496b enumC0496b13 = new EnumC0496b("OTHER_BOTTOM_RIGHT", 12);
            OTHER_BOTTOM_RIGHT = enumC0496b13;
            EnumC0496b enumC0496b14 = new EnumC0496b("DIAGONAL_FROM_TOP_LEFT", 13);
            DIAGONAL_FROM_TOP_LEFT = enumC0496b14;
            EnumC0496b enumC0496b15 = new EnumC0496b("DIAGONAL_FROM_TOP_RIGHT", 14);
            DIAGONAL_FROM_TOP_RIGHT = enumC0496b15;
            $VALUES = new EnumC0496b[]{enumC0496b, enumC0496b2, enumC0496b3, enumC0496b4, enumC0496b5, enumC0496b6, enumC0496b7, enumC0496b8, enumC0496b9, enumC0496b10, enumC0496b11, enumC0496b12, enumC0496b13, enumC0496b14, enumC0496b15};
        }

        private EnumC0496b() {
            throw null;
        }

        public static EnumC0496b valueOf(String str) {
            return (EnumC0496b) Enum.valueOf(EnumC0496b.class, str);
        }

        public static EnumC0496b[] values() {
            return (EnumC0496b[]) $VALUES.clone();
        }
    }

    public b(int i11, EnumC0496b enumC0496b) {
        this.f24971b = i11;
        this.f24972c = i11 * 2;
        this.f24973d = enumC0496b;
    }

    @Override // Rc.a
    protected final Bitmap a(@NonNull Context context, @NonNull d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap f7 = dVar.f(width, height, Bitmap.Config.ARGB_8888);
        f7.setHasAlpha(true);
        f7.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(f7);
        Paint a11 = h.a(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        a11.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f11 = height;
        float f12 = 0;
        float f13 = width - f12;
        float f14 = f11 - f12;
        int i13 = a.f24974a[this.f24973d.ordinal()];
        int i14 = this.f24972c;
        int i15 = this.f24971b;
        switch (i13) {
            case 1:
                RectF rectF = new RectF(f12, f12, f13, f14);
                float f15 = i15;
                canvas.drawRoundRect(rectF, f15, f15, a11);
                break;
            case 2:
                float f16 = i14;
                RectF rectF2 = new RectF(f12, f12, f16, f16);
                float f17 = i15;
                canvas.drawRoundRect(rectF2, f17, f17, a11);
                float f18 = i15;
                canvas.drawRect(new RectF(f12, f18, f18, f14), a11);
                canvas.drawRect(new RectF(f18, f12, f13, f14), a11);
                break;
            case 3:
                RectF rectF3 = new RectF(f13 - i14, f12, f13, i14);
                float f19 = i15;
                canvas.drawRoundRect(rectF3, f19, f19, a11);
                float f21 = f13 - f19;
                canvas.drawRect(new RectF(f12, f12, f21, f14), a11);
                canvas.drawRect(new RectF(f21, i15, f13, f14), a11);
                break;
            case 4:
                float f22 = f14 - i14;
                float f23 = i14;
                RectF rectF4 = new RectF(f12, f22, f23, f14);
                float f24 = i15;
                canvas.drawRoundRect(rectF4, f24, f24, a11);
                canvas.drawRect(new RectF(f12, f12, f23, f14 - f24), a11);
                canvas.drawRect(new RectF(i15, f12, f13, f14), a11);
                break;
            case 5:
                float f25 = i14;
                RectF rectF5 = new RectF(f13 - f25, f14 - f25, f13, f14);
                float f26 = i15;
                canvas.drawRoundRect(rectF5, f26, f26, a11);
                float f27 = f13 - f26;
                canvas.drawRect(new RectF(f12, f12, f27, f14), a11);
                canvas.drawRect(new RectF(f27, f12, f13, f14 - f26), a11);
                break;
            case 6:
                RectF rectF6 = new RectF(f12, f12, f13, i14);
                float f28 = i15;
                canvas.drawRoundRect(rectF6, f28, f28, a11);
                canvas.drawRect(new RectF(f12, i15, f13, f14), a11);
                break;
            case 7:
                RectF rectF7 = new RectF(f12, f14 - i14, f13, f14);
                float f29 = i15;
                canvas.drawRoundRect(rectF7, f29, f29, a11);
                canvas.drawRect(new RectF(f12, f12, f13, f14 - f29), a11);
                break;
            case 8:
                RectF rectF8 = new RectF(f12, f12, i14, f14);
                float f31 = i15;
                canvas.drawRoundRect(rectF8, f31, f31, a11);
                canvas.drawRect(new RectF(i15, f12, f13, f14), a11);
                break;
            case 9:
                RectF rectF9 = new RectF(f13 - i14, f12, f13, f14);
                float f32 = i15;
                canvas.drawRoundRect(rectF9, f32, f32, a11);
                canvas.drawRect(new RectF(f12, f12, f13 - f32, f14), a11);
                break;
            case 10:
                float f33 = i14;
                float f34 = i15;
                canvas.drawRoundRect(new RectF(f12, f14 - f33, f13, f14), f34, f34, a11);
                canvas.drawRoundRect(new RectF(f13 - f33, f12, f13, f14), f34, f34, a11);
                canvas.drawRect(new RectF(f12, f12, f13 - f34, f14 - f34), a11);
                break;
            case 11:
                float f35 = i15;
                canvas.drawRoundRect(new RectF(f12, f12, i14, f14), f35, f35, a11);
                canvas.drawRoundRect(new RectF(f12, f14 - i14, f13, f14), f35, f35, a11);
                canvas.drawRect(new RectF(i15, f12, f13, f14 - f35), a11);
                break;
            case 12:
                float f36 = i15;
                canvas.drawRoundRect(new RectF(f12, f12, f13, i14), f36, f36, a11);
                canvas.drawRoundRect(new RectF(f13 - i14, f12, f13, f14), f36, f36, a11);
                canvas.drawRect(new RectF(f12, i15, f13 - f36, f14), a11);
                break;
            case 13:
                float f37 = i14;
                float f38 = i15;
                canvas.drawRoundRect(new RectF(f12, f12, f13, f37), f38, f38, a11);
                canvas.drawRoundRect(new RectF(f12, f12, f37, f14), f38, f38, a11);
                float f39 = i15;
                canvas.drawRect(new RectF(f39, f39, f13, f14), a11);
                break;
            case 14:
                float f41 = i14;
                RectF rectF10 = new RectF(f12, f12, f41, f41);
                float f42 = i15;
                canvas.drawRoundRect(rectF10, f42, f42, a11);
                float f43 = i14;
                canvas.drawRoundRect(new RectF(f13 - f43, f14 - f43, f13, f14), f42, f42, a11);
                float f44 = i15;
                canvas.drawRect(new RectF(f12, f44, f13 - f42, f14), a11);
                canvas.drawRect(new RectF(f44, f12, f13, f14 - f42), a11);
                break;
            case 15:
                float f45 = i14;
                float f46 = i14;
                float f47 = i15;
                canvas.drawRoundRect(new RectF(f13 - f45, f12, f13, f46), f47, f47, a11);
                canvas.drawRoundRect(new RectF(f12, f14 - f45, f46, f14), f47, f47, a11);
                canvas.drawRect(new RectF(f12, f12, f13 - f47, f14 - f47), a11);
                float f48 = i15;
                canvas.drawRect(new RectF(f48, f48, f13, f14), a11);
                break;
            default:
                RectF rectF11 = new RectF(f12, f12, f13, f14);
                float f49 = i15;
                canvas.drawRoundRect(rectF11, f49, f49, a11);
                break;
        }
        return f7;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f24971b == this.f24971b && bVar.f24972c == this.f24972c && bVar.f24973d == this.f24973d;
    }

    @Override // T5.f
    public final int hashCode() {
        return (this.f24973d.ordinal() * 10) + (this.f24972c * 1000) + (this.f24971b * 10000) + 425235636;
    }

    public final String toString() {
        return "RoundedTransformation(radius=" + this.f24971b + ", margin=0, diameter=" + this.f24972c + ", cornerType=" + this.f24973d.name() + ")";
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1" + this.f24971b + this.f24972c + 0 + this.f24973d).getBytes(f.f26662a));
    }
}
