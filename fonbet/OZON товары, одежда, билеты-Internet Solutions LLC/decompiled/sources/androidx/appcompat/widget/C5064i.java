package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.T;
import ru.ozon.app.android.R;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5064i {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f37938b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C5064i f37939c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37940d = 0;

    /* renamed from: a, reason: collision with root package name */
    private T f37941a;

    /* renamed from: androidx.appcompat.widget.i$a */
    final class a implements T.b {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f37942a = {2131231118, 2131231116, 2131231042};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f37943b = {2131231066, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f37944c = {2131231115, 2131231117, 2131231059, R.drawable.abc_text_cursor_material, 2131231112, 2131231113, 2131231114};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f37945d = {2131231091, R.drawable.abc_cab_background_internal_bg, 2131231090};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f37946e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f37947f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        a() {
        }

        private static boolean a(int[] iArr, int i11) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        private static ColorStateList b(int i11, @NonNull Context context) {
            int c11 = W.c(R.attr.colorControlHighlight, context);
            int b11 = W.b(R.attr.colorButtonNormal, context);
            int[] iArr = W.f37842b;
            int[] iArr2 = W.f37844d;
            int d11 = androidx.core.graphics.c.d(c11, i11);
            return new ColorStateList(new int[][]{iArr, iArr2, W.f37843c, W.f37846f}, new int[]{b11, d11, androidx.core.graphics.c.d(c11, i11), i11});
        }

        private static LayerDrawable d(@NonNull T t2, @NonNull Context context, int i11) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
            Drawable c11 = t2.c(context, R.drawable.abc_star_black_48dp);
            Drawable c12 = t2.c(context, R.drawable.abc_star_half_black_48dp);
            if ((c11 instanceof BitmapDrawable) && c11.getIntrinsicWidth() == dimensionPixelSize && c11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) c11;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                c11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                c11.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((c12 instanceof BitmapDrawable) && c12.getIntrinsicWidth() == dimensionPixelSize && c12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) c12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                c12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                c12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        private static void f(Drawable drawable, int i11, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C5064i.f37938b;
            }
            mutate.setColorFilter(C5064i.e(i11, mode));
        }

        public final LayerDrawable c(@NonNull T t2, @NonNull Context context, int i11) {
            if (i11 == R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{t2.c(context, R.drawable.abc_cab_background_internal_bg), t2.c(context, 2131231059)});
            }
            if (i11 == R.drawable.abc_ratingbar_material) {
                return d(t2, context, R.dimen.abc_star_big);
            }
            if (i11 == R.drawable.abc_ratingbar_indicator_material) {
                return d(t2, context, R.dimen.abc_star_medium);
            }
            if (i11 == R.drawable.abc_ratingbar_small_material) {
                return d(t2, context, R.dimen.abc_star_small);
            }
            return null;
        }

        public final ColorStateList e(int i11, @NonNull Context context) {
            if (i11 == R.drawable.abc_edit_text_material) {
                return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i11 == 2131231108) {
                return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i11 != R.drawable.abc_switch_thumb_material) {
                if (i11 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(W.c(R.attr.colorButtonNormal, context), context);
                }
                if (i11 == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i11 == R.drawable.abc_btn_colored_material) {
                    return b(W.c(R.attr.colorAccent, context), context);
                }
                if (i11 == 2131231103 || i11 == R.drawable.abc_spinner_textfield_background_material) {
                    return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(this.f37943b, i11)) {
                    return W.d(R.attr.colorControlNormal, context);
                }
                if (a(this.f37946e, i11)) {
                    return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(this.f37947f, i11)) {
                    return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i11 == R.drawable.abc_seekbar_thumb_material) {
                    return androidx.core.content.a.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d11 = W.d(R.attr.colorSwitchThumbNormal, context);
            if (d11 == null || !d11.isStateful()) {
                iArr[0] = W.f37842b;
                iArr2[0] = W.b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = W.f37845e;
                iArr2[1] = W.c(R.attr.colorControlActivated, context);
                iArr[2] = W.f37846f;
                iArr2[2] = W.c(R.attr.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = W.f37842b;
                iArr[0] = iArr3;
                iArr2[0] = d11.getColorForState(iArr3, 0);
                iArr[1] = W.f37845e;
                iArr2[1] = W.c(R.attr.colorControlActivated, context);
                iArr[2] = W.f37846f;
                iArr2[2] = d11.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final boolean g(@NonNull Context context, int i11, @NonNull Drawable drawable) {
            if (i11 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                f(layerDrawable.findDrawableByLayerId(android.R.id.background), W.c(R.attr.colorControlNormal, context), C5064i.f37938b);
                f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), W.c(R.attr.colorControlNormal, context), C5064i.f37938b);
                f(layerDrawable.findDrawableByLayerId(android.R.id.progress), W.c(R.attr.colorControlActivated, context), C5064i.f37938b);
                return true;
            }
            if (i11 != R.drawable.abc_ratingbar_material && i11 != R.drawable.abc_ratingbar_indicator_material && i11 != R.drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            f(layerDrawable2.findDrawableByLayerId(android.R.id.background), W.b(R.attr.colorControlNormal, context), C5064i.f37938b);
            f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), W.c(R.attr.colorControlActivated, context), C5064i.f37938b);
            f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), W.c(R.attr.colorControlActivated, context), C5064i.f37938b);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean h(@NonNull Context context, int i11, @NonNull Drawable drawable) {
            PorterDuff.Mode mode;
            int i12;
            boolean z11;
            int round;
            PorterDuff.Mode mode2 = C5064i.f37938b;
            if (a(this.f37942a, i11)) {
                i12 = R.attr.colorControlNormal;
            } else if (a(this.f37944c, i11)) {
                i12 = R.attr.colorControlActivated;
            } else {
                if (a(this.f37945d, i11)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i11 == 2131231079) {
                        round = Math.round(40.8f);
                        i12 = 16842800;
                        mode = mode2;
                        z11 = true;
                        if (z11) {
                            return false;
                        }
                        Drawable mutate = drawable.mutate();
                        mutate.setColorFilter(C5064i.e(W.c(i12, context), mode));
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                        return true;
                    }
                    if (i11 != R.drawable.abc_dialog_material_background) {
                        mode = mode2;
                        i12 = 0;
                        z11 = false;
                        round = -1;
                        if (z11) {
                        }
                    }
                }
                mode = mode2;
                round = -1;
                i12 = 16842801;
                z11 = true;
                if (z11) {
                }
            }
            mode = mode2;
            z11 = true;
            round = -1;
            if (z11) {
            }
        }
    }

    public static synchronized C5064i b() {
        C5064i c5064i;
        synchronized (C5064i.class) {
            try {
                if (f37939c == null) {
                    h();
                }
                c5064i = f37939c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5064i;
    }

    public static synchronized PorterDuffColorFilter e(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter e11;
        synchronized (C5064i.class) {
            e11 = T.e(i11, mode);
        }
        return e11;
    }

    public static synchronized void h() {
        synchronized (C5064i.class) {
            if (f37939c == null) {
                C5064i c5064i = new C5064i();
                f37939c = c5064i;
                c5064i.f37941a = T.b();
                f37939c.f37941a.h(new a());
            }
        }
    }

    public final synchronized Drawable c(@NonNull Context context, int i11) {
        return this.f37941a.c(context, i11);
    }

    final synchronized Drawable d(int i11, @NonNull Context context) {
        return this.f37941a.d(context, i11, true);
    }

    final synchronized ColorStateList f(int i11, @NonNull Context context) {
        return this.f37941a.f(i11, context);
    }

    public final synchronized void g(@NonNull Context context) {
        this.f37941a.g(context);
    }
}
