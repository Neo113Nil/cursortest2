package h;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: g, reason: collision with root package name */
    public static h.N f3095g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.WeakHashMap f3098b = new java.util.WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public android.util.TypedValue f3099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3100d;

    /* renamed from: e, reason: collision with root package name */
    public P1.h f3101e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f3094f = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final h.M f3096h = new h.M(6);

    public static synchronized h.N b() {
        h.N n2;
        synchronized (h.N.class) {
            try {
                if (f3095g == null) {
                    f3095g = new h.N();
                }
                n2 = f3095g;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return n2;
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int i2, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (h.N.class) {
            h.M m2 = f3096h;
            m2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) m2.a(java.lang.Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final android.graphics.drawable.Drawable a(android.content.Context context, int i2) {
        android.graphics.drawable.Drawable drawable;
        java.lang.Object obj;
        if (this.f3099c == null) {
            this.f3099c = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f3099c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            l.e eVar = (l.e) this.f3098b.get(context);
            drawable = null;
            if (eVar != null) {
                int b2 = l.d.b(eVar.f7982b, eVar.f7984d, j2);
                if (b2 < 0 || (obj = eVar.f7983c[b2]) == l.e.f7980e) {
                    obj = null;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                if (weakReference != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b3 = l.d.b(eVar.f7982b, eVar.f7984d, j2);
                        if (b3 >= 0) {
                            java.lang.Object[] objArr = eVar.f7983c;
                            java.lang.Object obj2 = objArr[b3];
                            java.lang.Object obj3 = l.e.f7980e;
                            if (obj2 != obj3) {
                                objArr[b3] = obj3;
                                eVar.f7981a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = null;
        if (this.f3101e != null && i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_cab_background_top_material) {
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{c(context, com.watchfacestudio.huasi_urx110.R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    android.graphics.drawable.Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        l.e eVar2 = (l.e) this.f3098b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new l.e();
                            this.f3098b.put(context, eVar2);
                        }
                        eVar2.b(j2, new java.lang.ref.WeakReference(constantState2));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i2) {
        return d(context, i2);
    }

    public final synchronized android.graphics.drawable.Drawable d(android.content.Context context, int i2) {
        android.graphics.drawable.Drawable a2;
        try {
            if (!this.f3100d) {
                this.f3100d = true;
                android.graphics.drawable.Drawable c2 = c(context, com.watchfacestudio.huasi_urx110.R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof T.a) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f3100d = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i2);
            if (a2 == null) {
                a2 = p.AbstractC0944a.b(context, i2);
            }
            if (a2 != null) {
                a2 = g(context, i2, a2);
            }
            if (a2 != null) {
                android.graphics.Rect rect = h.AbstractC0165x.f3277a;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized android.content.res.ColorStateList f(android.content.Context context, int i2) {
        android.content.res.ColorStateList colorStateList;
        int i3;
        l.l lVar;
        java.lang.Object obj;
        java.util.WeakHashMap weakHashMap = this.f3097a;
        android.content.res.ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (lVar = (l.l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a2 = l.d.a(lVar.f8012c, i2, lVar.f8010a);
            if (a2 < 0 || (obj = lVar.f8011b[a2]) == l.l.f8009d) {
                obj = null;
            }
            colorStateList = (android.content.res.ColorStateList) obj;
        }
        if (colorStateList == null) {
            P1.h hVar = this.f3101e;
            if (hVar != null) {
                colorStateList2 = hVar.c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f3097a == null) {
                    this.f3097a = new java.util.WeakHashMap();
                }
                l.l lVar2 = (l.l) this.f3097a.get(context);
                if (lVar2 == null) {
                    lVar2 = new l.l();
                    int i4 = 4;
                    while (true) {
                        i3 = 40;
                        if (i4 >= 32) {
                            break;
                        }
                        int i5 = (1 << i4) - 12;
                        if (40 <= i5) {
                            i3 = i5;
                            break;
                        }
                        i4++;
                    }
                    int i6 = i3 / 4;
                    lVar2.f8010a = new int[i6];
                    lVar2.f8011b = new java.lang.Object[i6];
                    this.f3097a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.drawable.Drawable g(android.content.Context context, int i2, android.graphics.drawable.Drawable drawable) {
        int round;
        android.graphics.PorterDuffColorFilter e2;
        int i3 = com.watchfacestudio.huasi_urx110.R.attr.colorControlNormal;
        int i4 = com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated;
        android.content.res.ColorStateList f2 = f(context, i2);
        if (f2 != null) {
            if (h.AbstractC0165x.a(drawable)) {
                drawable = drawable.mutate();
            }
            s.AbstractC0989a.h(drawable, f2);
            android.graphics.PorterDuff.Mode mode = null;
            if (this.f3101e != null && i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_switch_thumb_material) {
                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                s.AbstractC0989a.i(drawable, mode);
            }
        } else {
            if (this.f3101e != null) {
                if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_seekbar_track_material) {
                    android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                    android.graphics.drawable.Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int b2 = h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlNormal);
                    android.graphics.PorterDuff.Mode mode2 = h.C0157o.f3219b;
                    P1.h.e(findDrawableByLayerId, b2);
                    P1.h.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlNormal));
                    P1.h.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated));
                } else if (i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_ratingbar_material || i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_ratingbar_indicator_material || i2 == com.watchfacestudio.huasi_urx110.R.drawable.abc_ratingbar_small_material) {
                    android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawable;
                    android.graphics.drawable.Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int a2 = h.f0.a(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlNormal);
                    android.graphics.PorterDuff.Mode mode3 = h.C0157o.f3219b;
                    P1.h.e(findDrawableByLayerId2, a2);
                    P1.h.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated));
                    P1.h.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h.f0.b(context, com.watchfacestudio.huasi_urx110.R.attr.colorControlActivated));
                }
            }
            P1.h hVar = this.f3101e;
            boolean z2 = false;
            if (hVar != null) {
                android.graphics.PorterDuff.Mode mode4 = h.C0157o.f3219b;
                if (!P1.h.a((int[]) hVar.f1483a, i2)) {
                    if (!P1.h.a((int[]) hVar.f1485c, i2)) {
                        boolean a3 = P1.h.a((int[]) hVar.f1486d, i2);
                        i4 = android.R.attr.colorBackground;
                        if (a3) {
                            mode4 = android.graphics.PorterDuff.Mode.MULTIPLY;
                        } else if (i2 == 2131165227) {
                            round = java.lang.Math.round(40.8f);
                            i3 = android.R.attr.colorForeground;
                            z2 = true;
                            if (z2) {
                                android.graphics.drawable.Drawable mutate = h.AbstractC0165x.a(drawable) ? drawable.mutate() : drawable;
                                int b3 = h.f0.b(context, i3);
                                synchronized (h.C0157o.class) {
                                    e2 = e(b3, mode4);
                                }
                                mutate.setColorFilter(e2);
                                if (round != -1) {
                                    mutate.setAlpha(round);
                                }
                            }
                        } else if (i2 != com.watchfacestudio.huasi_urx110.R.drawable.abc_dialog_material_background) {
                            i3 = 0;
                            round = -1;
                            if (z2) {
                            }
                        }
                    }
                    i3 = i4;
                }
                z2 = true;
                round = -1;
                if (z2) {
                }
            }
        }
        return drawable;
    }
}
