package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements g.q, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public g.k f1965a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f1966b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.RadioButton f1967c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f1968d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.CheckBox f1969e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f1970f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f1971g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f1972h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f1973i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f1974j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1975k;

    /* renamed from: l, reason: collision with root package name */
    public final android.content.Context f1976l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1977m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f1978n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1979o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.LayoutInflater f1980p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1981q;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        I0.b H2 = I0.b.H(getContext(), attributeSet, c.AbstractC0095a.f2545n, com.watchfacestudio.huasi_urx110.R.attr.listMenuViewStyle);
        this.f1974j = H2.A(5);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        this.f1975k = typedArray.getResourceId(1, -1);
        this.f1977m = typedArray.getBoolean(7, false);
        this.f1976l = context;
        this.f1978n = H2.A(8);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.watchfacestudio.huasi_urx110.R.attr.dropDownListViewStyle, 0);
        this.f1979o = obtainStyledAttributes.hasValue(0);
        H2.K();
        obtainStyledAttributes.recycle();
    }

    private android.view.LayoutInflater getInflater() {
        if (this.f1980p == null) {
            this.f1980p = android.view.LayoutInflater.from(getContext());
        }
        return this.f1980p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        android.widget.ImageView imageView = this.f1971g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f1972h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f1972h.getLayoutParams();
        rect.top = this.f1972h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // g.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g.k kVar) {
        boolean z2;
        java.lang.String sb;
        boolean z3;
        this.f1965a = kVar;
        int i2 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f2985e);
        setCheckable(kVar.isCheckable());
        if (kVar.f2994n.n()) {
            if ((kVar.f2994n.m() ? kVar.f2990j : kVar.f2988h) != 0) {
                z2 = true;
                kVar.f2994n.m();
                if (z2) {
                    g.k kVar2 = this.f1965a;
                    if (kVar2.f2994n.n()) {
                        if ((kVar2.f2994n.m() ? kVar2.f2990j : kVar2.f2988h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    android.widget.TextView textView = this.f1970f;
                    g.k kVar3 = this.f1965a;
                    char c2 = kVar3.f2994n.m() ? kVar3.f2990j : kVar3.f2988h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        g.j jVar = kVar3.f2994n;
                        android.content.res.Resources resources = jVar.f2960a.getResources();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        if (android.view.ViewConfiguration.get(jVar.f2960a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = jVar.m() ? kVar3.f2991k : kVar3.f2989i;
                        g.k.a(sb2, i3, 65536, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_meta_shortcut_label));
                        g.k.a(sb2, i3, io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_ctrl_shortcut_label));
                        g.k.a(sb2, i3, 2, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_alt_shortcut_label));
                        g.k.a(sb2, i3, 1, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_shift_shortcut_label));
                        g.k.a(sb2, i3, 4, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_sym_shortcut_label));
                        g.k.a(sb2, i3, 8, resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_function_shortcut_label));
                        if (c2 == '\b') {
                            sb2.append(resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb2.append(resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb2.append(c2);
                        } else {
                            sb2.append(resources.getString(com.watchfacestudio.huasi_urx110.R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f1970f.getVisibility() != i2) {
                    this.f1970f.setVisibility(i2);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f2997q);
            }
        }
        z2 = false;
        kVar.f2994n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f1970f.getVisibility() != i2) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f2997q);
    }

    @Override // g.q
    public g.k getItemData() {
        return this.f1965a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        java.lang.reflect.Field field = y.x.f8478a;
        setBackground(this.f1974j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.watchfacestudio.huasi_urx110.R.id.title);
        this.f1968d = textView;
        int i2 = this.f1975k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1976l, i2);
        }
        this.f1970f = (android.widget.TextView) findViewById(com.watchfacestudio.huasi_urx110.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.submenuarrow);
        this.f1971g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1978n);
        }
        this.f1972h = (android.widget.ImageView) findViewById(com.watchfacestudio.huasi_urx110.R.id.group_divider);
        this.f1973i = (android.widget.LinearLayout) findViewById(com.watchfacestudio.huasi_urx110.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1966b != null && this.f1977m) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f1966b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z2 && this.f1967c == null && this.f1969e == null) {
            return;
        }
        if ((this.f1965a.f3003x & 4) != 0) {
            if (this.f1967c == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.f1967c = radioButton;
                android.widget.LinearLayout linearLayout = this.f1973i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1967c;
            view = this.f1969e;
        } else {
            if (this.f1969e == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f1969e = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f1973i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1969e;
            view = this.f1967c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1965a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = this.f1969e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.f1967c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        android.widget.CompoundButton compoundButton;
        if ((this.f1965a.f3003x & 4) != 0) {
            if (this.f1967c == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.f1967c = radioButton;
                android.widget.LinearLayout linearLayout = this.f1973i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1967c;
        } else {
            if (this.f1969e == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f1969e = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f1973i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1969e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1981q = z2;
        this.f1977m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        android.widget.ImageView imageView = this.f1972h;
        if (imageView != null) {
            imageView.setVisibility((this.f1979o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f1965a.f2994n.getClass();
        boolean z2 = this.f1981q;
        if (z2 || this.f1977m) {
            android.widget.ImageView imageView = this.f1966b;
            if (imageView == null && drawable == null && !this.f1977m) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getInflater().inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
                this.f1966b = imageView2;
                android.widget.LinearLayout linearLayout = this.f1973i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1977m) {
                this.f1966b.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.f1966b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1966b.getVisibility() != 0) {
                this.f1966b.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1968d.getVisibility() != 8) {
                this.f1968d.setVisibility(8);
            }
        } else {
            this.f1968d.setText(charSequence);
            if (this.f1968d.getVisibility() != 0) {
                this.f1968d.setVisibility(0);
            }
        }
    }
}
