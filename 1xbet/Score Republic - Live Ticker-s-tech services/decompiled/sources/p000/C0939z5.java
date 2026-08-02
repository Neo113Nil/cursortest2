package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0939z5 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f9605b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0939z5 f9606c;

    /* JADX INFO: renamed from: a */
    public f21 f9607a;

    /* JADX INFO: renamed from: a */
    public static synchronized C0939z5 m5859a() {
        try {
            if (f9606c == null) {
                m5860c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9606c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m5860c() {
        if (f9606c == null) {
            C0939z5 c0939z5 = new C0939z5();
            f9606c = c0939z5;
            c0939z5.f9607a = f21.m1576b();
            f21 f21Var = f9606c.f9607a;
            C0902y5 c0902y5 = new C0902y5();
            c0902y5.f9154a = new int[]{2131165262, 2131165260, 2131165186};
            c0902y5.f9155b = new int[]{2131165210, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c0902y5.f9156c = new int[]{2131165259, 2131165261, 2131165203, R.drawable.abc_text_cursor_material, 2131165256, 2131165257, 2131165258};
            c0902y5.f9157d = new int[]{2131165235, R.drawable.abc_cab_background_internal_bg, 2131165234};
            c0902y5.f9158e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c0902y5.f9159f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (f21Var) {
                f21Var.f2280e = c0902y5;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5861d(Drawable drawable, C0290hl c0290hl, int[] iArr) {
        PorterDuff.Mode mode = f21.f2273f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0290hl.f3254b;
        if (!z && !c0290hl.f3253a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM1577e = null;
        ColorStateList colorStateList = z ? (ColorStateList) c0290hl.f3255c : null;
        PorterDuff.Mode mode2 = c0290hl.f3253a ? (PorterDuff.Mode) c0290hl.f3256d : f21.f2273f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM1577e = f21.m1577e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM1577e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m5862b(Context context, int i) {
        return this.f9607a.m1579c(context, i);
    }
}
