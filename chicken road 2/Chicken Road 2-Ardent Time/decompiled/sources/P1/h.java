package P1;

/* loaded from: classes.dex */
public final class h implements X0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1483a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f1484b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.Serializable f1485c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1488f;

    public h(java.util.Set set, java.lang.String str, java.lang.String str2) {
        B0.a aVar = B0.a.f4b;
        java.util.Set emptySet = set == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(set);
        this.f1483a = emptySet;
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        this.f1485c = str;
        this.f1486d = str2;
        this.f1487e = aVar;
        java.util.HashSet hashSet = new java.util.HashSet(emptySet);
        java.util.Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        this.f1484b = java.util.Collections.unmodifiableSet(hashSet);
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static android.content.res.ColorStateList b(android.content.Context context, int i2) {
        int b2 = h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlHighlight);
        int a2 = h.f0.a(context, com.watchfacestudio.huasi_urx110.R.attr.colorButtonNormal);
        int[] iArr = h.f0.f3152b;
        int[] iArr2 = h.f0.f3154d;
        int a3 = r.AbstractC0983a.a(b2, i2);
        return new android.content.res.ColorStateList(new int[][]{iArr, iArr2, h.f0.f3153c, h.f0.f3156f}, new int[]{a2, a3, r.AbstractC0983a.a(b2, i2), i2});
    }

    public static void e(android.graphics.drawable.Drawable drawable, int i2) {
        android.graphics.PorterDuffColorFilter e2;
        android.graphics.PorterDuff.Mode mode = h.C0157o.f3219b;
        if (h.AbstractC0165x.a(drawable)) {
            drawable = drawable.mutate();
        }
        synchronized (h.C0157o.class) {
            e2 = h.N.e(i2, mode);
        }
        drawable.setColorFilter(e2);
    }

    public android.content.res.ColorStateList c(android.content.Context context, int i2) {
        if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_edit_text_material) {
            java.lang.Object obj = d.AbstractC0106a.f2737a;
            return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            java.lang.Object obj2 = d.AbstractC0106a.f2737a;
            return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_switch_track);
        }
        if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            android.content.res.ColorStateList c2 = h.f0.c(context, com.watchfacestudio.huasi_urx110.R.attr.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = h.f0.f3152b;
                iArr2[0] = h.f0.a(context, com.watchfacestudio.huasi_urx110.R.attr.colorSwitchThumbNormal);
                iArr[1] = h.f0.f3155e;
                iArr2[1] = h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated);
                iArr[2] = h.f0.f3156f;
                iArr2[2] = h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = h.f0.f3152b;
                iArr[0] = iArr3;
                iArr2[0] = c2.getColorForState(iArr3, 0);
                iArr[1] = h.f0.f3155e;
                iArr2[1] = h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated);
                iArr[2] = h.f0.f3156f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new android.content.res.ColorStateList(iArr, iArr2);
        }
        if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorButtonNormal));
        }
        if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_colored_material) {
            return b(context, h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorAccent));
        }
        if (i2 == 2131165251 || i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_spinner_textfield_background_material) {
            java.lang.Object obj3 = d.AbstractC0106a.f2737a;
            return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_spinner);
        }
        if (a((int[]) this.f1484b, i2)) {
            return h.f0.c(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlNormal);
        }
        if (a((int[]) this.f1487e, i2)) {
            java.lang.Object obj4 = d.AbstractC0106a.f2737a;
            return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_default);
        }
        if (a((int[]) this.f1488f, i2)) {
            java.lang.Object obj5 = d.AbstractC0106a.f2737a;
            return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_btn_checkable);
        }
        if (i2 != com.watchfacestudio.huasi_urx110.R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        java.lang.Object obj6 = d.AbstractC0106a.f2737a;
        return context.getColorStateList(com.watchfacestudio.huasi_urx110.R.color.abc_tint_seek_thumb);
    }

    public boolean d(int i2, int i3, android.content.Intent intent) {
        java.util.Iterator it = new java.util.HashSet((java.util.HashSet) this.f1485c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                java.util.HashMap hashMap = ((d1.C0108a) it.next()).f2742d;
                if (hashMap.containsKey(java.lang.Integer.valueOf(i2))) {
                    ((Z0.j) hashMap.remove(java.lang.Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.io.Serializable] */
    public h() {
        this.f1483a = new int[]{2131165267, 2131165265, 2131165184};
        this.f1484b = new int[]{2131165208, com.watchfacestudio.huasi_urx110.R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
        this.f1485c = new int[]{2131165264, 2131165266, 2131165201, com.watchfacestudio.huasi_urx110.R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
        this.f1486d = new int[]{2131165239, com.watchfacestudio.huasi_urx110.R.drawable.abc_cab_background_internal_bg, 2131165238};
        this.f1487e = new int[]{com.watchfacestudio.huasi_urx110.R.drawable.abc_tab_indicator_material, com.watchfacestudio.huasi_urx110.R.drawable.abc_textfield_search_material};
        this.f1488f = new int[]{com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_check_material, com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_radio_material, com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_check_material_anim, com.watchfacestudio.huasi_urx110.R.drawable.abc_btn_radio_material_anim};
    }

    public h(L1.d taskRunner) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f1483a = taskRunner;
        this.f1488f = P1.j.f1489a;
    }

    public h(P0.AbstractActivityC0047e abstractActivityC0047e, androidx.lifecycle.l lVar) {
        this.f1484b = new java.util.HashSet();
        this.f1485c = new java.util.HashSet();
        this.f1486d = new java.util.HashSet();
        this.f1487e = new java.util.HashSet();
        new java.util.HashSet();
        this.f1488f = new java.util.HashSet();
        this.f1483a = abstractActivityC0047e;
        new io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference(lVar);
    }
}
