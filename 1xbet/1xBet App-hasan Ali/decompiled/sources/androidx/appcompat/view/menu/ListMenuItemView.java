package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import h.AbstractC1986a;
import m.InterfaceC2077o;
import m.MenuC2070h;
import m.MenuItemC2071i;
import v3.e;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2077o, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public boolean f6664A;

    /* renamed from: k, reason: collision with root package name */
    public MenuItemC2071i f6665k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f6666l;

    /* renamed from: m, reason: collision with root package name */
    public RadioButton f6667m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f6668n;

    /* renamed from: o, reason: collision with root package name */
    public CheckBox f6669o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f6670p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f6671q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f6672r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f6673s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f6674t;

    /* renamed from: u, reason: collision with root package name */
    public final int f6675u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f6676v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6677w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f6678x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6679y;

    /* renamed from: z, reason: collision with root package name */
    public LayoutInflater f6680z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e G5 = e.G(getContext(), attributeSet, AbstractC1986a.f17180n, R.attr.listMenuViewStyle);
        this.f6674t = G5.x(5);
        TypedArray typedArray = (TypedArray) G5.f20433m;
        this.f6675u = typedArray.getResourceId(1, -1);
        this.f6677w = typedArray.getBoolean(7, false);
        this.f6676v = context;
        this.f6678x = G5.x(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f6679y = obtainStyledAttributes.hasValue(0);
        G5.J();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f6680z == null) {
            this.f6680z = LayoutInflater.from(getContext());
        }
        return this.f6680z;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f6671q;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // m.InterfaceC2077o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MenuItemC2071i menuItemC2071i) {
        boolean z3;
        String sb;
        boolean z5;
        this.f6665k = menuItemC2071i;
        int i = 0;
        setVisibility(menuItemC2071i.isVisible() ? 0 : 8);
        setTitle(menuItemC2071i.f17930e);
        setCheckable(menuItemC2071i.isCheckable());
        if (menuItemC2071i.f17937n.n()) {
            if ((menuItemC2071i.f17937n.m() ? menuItemC2071i.f17933j : menuItemC2071i.f17932h) != 0) {
                z3 = true;
                menuItemC2071i.f17937n.m();
                if (z3) {
                    MenuItemC2071i menuItemC2071i2 = this.f6665k;
                    if (menuItemC2071i2.f17937n.n()) {
                        if ((menuItemC2071i2.f17937n.m() ? menuItemC2071i2.f17933j : menuItemC2071i2.f17932h) != 0) {
                            z5 = true;
                        }
                    }
                    z5 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f6670p;
                    MenuItemC2071i menuItemC2071i3 = this.f6665k;
                    char c5 = menuItemC2071i3.f17937n.m() ? menuItemC2071i3.f17933j : menuItemC2071i3.f17932h;
                    if (c5 == 0) {
                        sb = "";
                    } else {
                        MenuC2070h menuC2070h = menuItemC2071i3.f17937n;
                        Resources resources = menuC2070h.f17905a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC2070h.f17905a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i5 = menuC2070h.m() ? menuItemC2071i3.f17934k : menuItemC2071i3.i;
                        MenuItemC2071i.a(sb2, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        MenuItemC2071i.a(sb2, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        MenuItemC2071i.a(sb2, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        MenuItemC2071i.a(sb2, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        MenuItemC2071i.a(sb2, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        MenuItemC2071i.a(sb2, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c5 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c5 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c5 != ' ') {
                            sb2.append(c5);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f6670p.getVisibility() != i) {
                    this.f6670p.setVisibility(i);
                }
                setIcon(menuItemC2071i.getIcon());
                setEnabled(menuItemC2071i.isEnabled());
                setSubMenuArrowVisible(menuItemC2071i.hasSubMenu());
                setContentDescription(menuItemC2071i.f17940q);
            }
        }
        z3 = false;
        menuItemC2071i.f17937n.m();
        if (z3) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f6670p.getVisibility() != i) {
        }
        setIcon(menuItemC2071i.getIcon());
        setEnabled(menuItemC2071i.isEnabled());
        setSubMenuArrowVisible(menuItemC2071i.hasSubMenu());
        setContentDescription(menuItemC2071i.f17940q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f6672r;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6672r.getLayoutParams();
        rect.top = this.f6672r.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // m.InterfaceC2077o
    public MenuItemC2071i getItemData() {
        return this.f6665k;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f6674t);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f6668n = textView;
        int i = this.f6675u;
        if (i != -1) {
            textView.setTextAppearance(this.f6676v, i);
        }
        this.f6670p = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f6671q = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f6678x);
        }
        this.f6672r = (ImageView) findViewById(R.id.group_divider);
        this.f6673s = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        if (this.f6666l != null && this.f6677w) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6666l.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i5);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f6667m == null && this.f6669o == null) {
            return;
        }
        if ((this.f6665k.f17947x & 4) != 0) {
            if (this.f6667m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6667m = radioButton;
                LinearLayout linearLayout = this.f6673s;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6667m;
            view = this.f6669o;
        } else {
            if (this.f6669o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6669o = checkBox;
                LinearLayout linearLayout2 = this.f6673s;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6669o;
            view = this.f6667m;
        }
        if (z3) {
            compoundButton.setChecked(this.f6665k.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f6669o;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f6667m;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f6665k.f17947x & 4) != 0) {
            if (this.f6667m == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6667m = radioButton;
                LinearLayout linearLayout = this.f6673s;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6667m;
        } else {
            if (this.f6669o == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6669o = checkBox;
                LinearLayout linearLayout2 = this.f6673s;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6669o;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f6664A = z3;
        this.f6677w = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f6672r;
        if (imageView != null) {
            imageView.setVisibility((this.f6679y || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6665k.f17937n.getClass();
        boolean z3 = this.f6664A;
        if (z3 || this.f6677w) {
            ImageView imageView = this.f6666l;
            if (imageView == null && drawable == null && !this.f6677w) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f6666l = imageView2;
                LinearLayout linearLayout = this.f6673s;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f6677w) {
                this.f6666l.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f6666l;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f6666l.getVisibility() != 0) {
                this.f6666l.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f6668n.getVisibility() != 8) {
                this.f6668n.setVisibility(8);
            }
        } else {
            this.f6668n.setText(charSequence);
            if (this.f6668n.getVisibility() != 0) {
                this.f6668n.setVisibility(0);
            }
        }
    }
}
