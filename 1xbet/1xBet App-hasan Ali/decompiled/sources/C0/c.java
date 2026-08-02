package C0;

import A0.C0040k0;
import B4.d;
import D2.e;
import Q2.C0375o;
import U2.j;
import W3.h;
import X3.z;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.Menu;
import g1.AbstractC1967a;
import h0.C1989c;
import i4.InterfaceC2015a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.l;
import n.C2146p;
import n.m0;
import n.r0;
import r0.AbstractC2346c;
import r3.C2350b;
import v.w0;
import y4.C2675c;
import y4.m;
import y4.n;
import y4.x;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f810a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f811b;

    /* renamed from: c, reason: collision with root package name */
    public Object f812c;

    /* renamed from: d, reason: collision with root package name */
    public Object f813d;

    /* renamed from: e, reason: collision with root package name */
    public Object f814e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f815g;

    public c(Context context, String str) {
        String concat;
        this.f810a = 2;
        this.f811b = context.getApplicationContext();
        this.f812c = str;
        this.f813d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + C2350b.a(context).c(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e3) {
            j.g("Unable to get package version name for reporting", e3);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f815g = concat;
    }

    public static void a(Menu menu, b bVar) {
        int i;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            i = R.string.copy;
        } else if (ordinal == 1) {
            i = R.string.paste;
        } else if (ordinal == 2) {
            i = R.string.cut;
        } else if (ordinal == 3) {
            i = R.string.selectAll;
        } else {
            if (ordinal != 4) {
                throw new e();
            }
            i = Build.VERSION.SDK_INT <= 26 ? game.betting133.sports1xbet.R.string.autofill : R.string.autofill;
        }
        menu.add(0, bVar.f808k, bVar.f809l, i).setShowAsAction(1);
    }

    public static void b(Menu menu, b bVar, InterfaceC2015a interfaceC2015a) {
        int i = bVar.f808k;
        if (interfaceC2015a != null && menu.findItem(i) == null) {
            a(menu, bVar);
        } else {
            if (interfaceC2015a != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }

    public static boolean c(int[] iArr, int i) {
        for (int i5 : iArr) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i) {
        int c5 = r0.c(context, game.betting133.sports1xbet.R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{r0.f18315b, r0.f18317d, r0.f18316c, r0.f}, new int[]{r0.b(context, game.betting133.sports1xbet.R.attr.colorButtonNormal), AbstractC1967a.b(c5, i), AbstractC1967a.b(c5, i), i});
    }

    public static LayerDrawable f(m0 m0Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = m0Var.f(context, game.betting133.sports1xbet.R.drawable.abc_star_black_48dp);
        Drawable f5 = m0Var.f(context, game.betting133.sports1xbet.R.drawable.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f5 instanceof BitmapDrawable) && f5.getIntrinsicWidth() == dimensionPixelSize && f5.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f5;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f5.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void i(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h3;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C2146p.f18306b;
        }
        PorterDuff.Mode mode2 = C2146p.f18306b;
        synchronized (C2146p.class) {
            h3 = m0.h(i, mode);
        }
        mutate.setColorFilter(h3);
    }

    public C2675c d() {
        C2675c c2675c = (C2675c) this.f815g;
        if (c2675c != null) {
            return c2675c;
        }
        C2675c c2675c2 = C2675c.f21303n;
        C2675c d5 = w0.d((m) this.f813d);
        this.f815g = d5;
        return d5;
    }

    public ColorStateList g(Context context, int i) {
        if (i == game.betting133.sports1xbet.R.drawable.abc_edit_text_material) {
            return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_edittext);
        }
        if (i == 2131165251) {
            return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_switch_track);
        }
        if (i != game.betting133.sports1xbet.R.drawable.abc_switch_thumb_material) {
            if (i == game.betting133.sports1xbet.R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, r0.c(context, game.betting133.sports1xbet.R.attr.colorButtonNormal));
            }
            if (i == game.betting133.sports1xbet.R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == game.betting133.sports1xbet.R.drawable.abc_btn_colored_material) {
                return e(context, r0.c(context, game.betting133.sports1xbet.R.attr.colorAccent));
            }
            if (i == 2131165246 || i == game.betting133.sports1xbet.R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f812c, i)) {
                return r0.d(context, game.betting133.sports1xbet.R.attr.colorControlNormal);
            }
            if (c((int[]) this.f, i)) {
                return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_default);
            }
            if (c((int[]) this.f815g, i)) {
                return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_btn_checkable);
            }
            if (i == game.betting133.sports1xbet.R.drawable.abc_seekbar_thumb_material) {
                return AbstractC2346c.o(context, game.betting133.sports1xbet.R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d5 = r0.d(context, game.betting133.sports1xbet.R.attr.colorSwitchThumbNormal);
        if (d5 == null || !d5.isStateful()) {
            iArr[0] = r0.f18315b;
            iArr2[0] = r0.b(context, game.betting133.sports1xbet.R.attr.colorSwitchThumbNormal);
            iArr[1] = r0.f18318e;
            iArr2[1] = r0.c(context, game.betting133.sports1xbet.R.attr.colorControlActivated);
            iArr[2] = r0.f;
            iArr2[2] = r0.c(context, game.betting133.sports1xbet.R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = r0.f18315b;
            iArr[0] = iArr3;
            iArr2[0] = d5.getColorForState(iArr3, 0);
            iArr[1] = r0.f18318e;
            iArr2[1] = r0.c(context, game.betting133.sports1xbet.R.attr.colorControlActivated);
            iArr[2] = r0.f;
            iArr2[2] = d5.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C0375o h() {
        C0375o c0375o = new C0375o(false);
        c0375o.f5046p = new LinkedHashMap();
        c0375o.f5042l = (n) this.f811b;
        c0375o.f5043m = (String) this.f812c;
        c0375o.f5045o = (x) this.f814e;
        Map map = (Map) this.f;
        c0375o.f5046p = map.isEmpty() ? new LinkedHashMap() : z.U(map);
        c0375o.f5044n = ((m) this.f813d).f();
        return c0375o;
    }

    public String toString() {
        switch (this.f810a) {
            case 5:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f812c);
                sb.append(", url=");
                sb.append((n) this.f811b);
                m mVar = (m) this.f813d;
                if (mVar.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : mVar) {
                        int i5 = i + 1;
                        if (i < 0) {
                            X3.n.R();
                            throw null;
                        }
                        h hVar = (h) obj;
                        String str = (String) hVar.f6036k;
                        String str2 = (String) hVar.f6037l;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i = i5;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                l.e("StringBuilder().apply(builderAction).toString()", sb2);
                return sb2;
            default:
                return super.toString();
        }
    }

    public c(Set set, String str, String str2) {
        this.f810a = 3;
        B3.a aVar = B3.a.f753b;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f811b = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f813d = str;
        this.f814e = str2;
        this.f = aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f812c = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public c(n nVar, String str, m mVar, x xVar, Map map) {
        this.f810a = 5;
        l.f("url", nVar);
        l.f("method", str);
        this.f811b = nVar;
        this.f812c = str;
        this.f813d = mVar;
        this.f814e = xVar;
        this.f = map;
    }

    public c(C0040k0 c0040k0) {
        this.f810a = 0;
        C1989c c1989c = C1989c.f17192e;
        this.f811b = c0040k0;
        this.f812c = c1989c;
        this.f813d = null;
        this.f814e = null;
        this.f = null;
        this.f815g = null;
    }

    public c() {
        this.f810a = 4;
        this.f811b = new int[]{2131165261, 2131165259, 2131165185};
        this.f812c = new int[]{2131165209, game.betting133.sports1xbet.R.drawable.abc_seekbar_tick_mark_material, game.betting133.sports1xbet.R.drawable.abc_ic_menu_share_mtrl_alpha, game.betting133.sports1xbet.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, game.betting133.sports1xbet.R.drawable.abc_ic_menu_cut_mtrl_alpha, game.betting133.sports1xbet.R.drawable.abc_ic_menu_selectall_mtrl_alpha, game.betting133.sports1xbet.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f813d = new int[]{2131165258, 2131165260, 2131165202, game.betting133.sports1xbet.R.drawable.abc_text_cursor_material, 2131165255, 2131165256, 2131165257};
        this.f814e = new int[]{2131165234, game.betting133.sports1xbet.R.drawable.abc_cab_background_internal_bg, 2131165233};
        this.f = new int[]{game.betting133.sports1xbet.R.drawable.abc_tab_indicator_material, game.betting133.sports1xbet.R.drawable.abc_textfield_search_material};
        this.f815g = new int[]{game.betting133.sports1xbet.R.drawable.abc_btn_check_material, game.betting133.sports1xbet.R.drawable.abc_btn_radio_material, game.betting133.sports1xbet.R.drawable.abc_btn_check_material_anim, game.betting133.sports1xbet.R.drawable.abc_btn_radio_material_anim};
    }

    public c(d dVar) {
        this.f810a = 1;
        l.f("taskRunner", dVar);
        this.f811b = dVar;
        this.f815g = F4.h.f1594a;
    }
}
