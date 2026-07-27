package androidx.appcompat.view.menu;

import A0.j;
import D.z;
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
import com.chicken.jump.road.pump.R;
import g.AbstractC0301a;
import java.lang.reflect.Field;
import k.InterfaceC1076q;
import k.MenuC1069j;
import k.MenuItemC1070k;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1076q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public MenuItemC1070k f1905a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1906b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1907c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f1908d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1909e;
    public TextView f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1910g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f1911h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1912i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1913j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1914k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1915l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1916m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1917n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1918o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1919p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1920q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j I3 = j.I(getContext(), attributeSet, AbstractC0301a.f4938n, R.attr.listMenuViewStyle);
        this.f1913j = I3.A(5);
        TypedArray typedArray = (TypedArray) I3.f67c;
        this.f1914k = typedArray.getResourceId(1, -1);
        this.f1916m = typedArray.getBoolean(7, false);
        this.f1915l = context;
        this.f1917n = I3.A(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1918o = obtainStyledAttributes.hasValue(0);
        I3.L();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1919p == null) {
            this.f1919p = LayoutInflater.from(getContext());
        }
        return this.f1919p;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f1910g;
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
    @Override // k.InterfaceC1076q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MenuItemC1070k menuItemC1070k) {
        boolean z3;
        String sb;
        boolean z4;
        this.f1905a = menuItemC1070k;
        int i3 = 0;
        setVisibility(menuItemC1070k.isVisible() ? 0 : 8);
        setTitle(menuItemC1070k.f9605e);
        setCheckable(menuItemC1070k.isCheckable());
        if (menuItemC1070k.f9613n.n()) {
            if ((menuItemC1070k.f9613n.m() ? menuItemC1070k.f9609j : menuItemC1070k.f9607h) != 0) {
                z3 = true;
                menuItemC1070k.f9613n.m();
                if (z3) {
                    MenuItemC1070k menuItemC1070k2 = this.f1905a;
                    if (menuItemC1070k2.f9613n.n()) {
                        if ((menuItemC1070k2.f9613n.m() ? menuItemC1070k2.f9609j : menuItemC1070k2.f9607h) != 0) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.f;
                    MenuItemC1070k menuItemC1070k3 = this.f1905a;
                    char c3 = menuItemC1070k3.f9613n.m() ? menuItemC1070k3.f9609j : menuItemC1070k3.f9607h;
                    if (c3 == 0) {
                        sb = "";
                    } else {
                        MenuC1069j menuC1069j = menuItemC1070k3.f9613n;
                        Resources resources = menuC1069j.f9579a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC1069j.f9579a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = menuC1069j.m() ? menuItemC1070k3.f9610k : menuItemC1070k3.f9608i;
                        MenuItemC1070k.a(sb2, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        MenuItemC1070k.a(sb2, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        MenuItemC1070k.a(sb2, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        MenuItemC1070k.a(sb2, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        MenuItemC1070k.a(sb2, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        MenuItemC1070k.a(sb2, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c3 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c3 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c3 != ' ') {
                            sb2.append(c3);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f.getVisibility() != i3) {
                    this.f.setVisibility(i3);
                }
                setIcon(menuItemC1070k.getIcon());
                setEnabled(menuItemC1070k.isEnabled());
                setSubMenuArrowVisible(menuItemC1070k.hasSubMenu());
                setContentDescription(menuItemC1070k.f9616q);
            }
        }
        z3 = false;
        menuItemC1070k.f9613n.m();
        if (z3) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.f.getVisibility() != i3) {
        }
        setIcon(menuItemC1070k.getIcon());
        setEnabled(menuItemC1070k.isEnabled());
        setSubMenuArrowVisible(menuItemC1070k.hasSubMenu());
        setContentDescription(menuItemC1070k.f9616q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1911h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1911h.getLayoutParams();
        rect.top = this.f1911h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.InterfaceC1076q
    public MenuItemC1070k getItemData() {
        return this.f1905a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = z.f259a;
        setBackground(this.f1913j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1908d = textView;
        int i3 = this.f1914k;
        if (i3 != -1) {
            textView.setTextAppearance(this.f1915l, i3);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1910g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1917n);
        }
        this.f1911h = (ImageView) findViewById(R.id.group_divider);
        this.f1912i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f1906b != null && this.f1916m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1906b.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f1907c == null && this.f1909e == null) {
            return;
        }
        if ((this.f1905a.f9623x & 4) != 0) {
            if (this.f1907c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1907c = radioButton;
                LinearLayout linearLayout = this.f1912i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1907c;
            view = this.f1909e;
        } else {
            if (this.f1909e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1909e = checkBox;
                LinearLayout linearLayout2 = this.f1912i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1909e;
            view = this.f1907c;
        }
        if (z3) {
            compoundButton.setChecked(this.f1905a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1909e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1907c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f1905a.f9623x & 4) != 0) {
            if (this.f1907c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1907c = radioButton;
                LinearLayout linearLayout = this.f1912i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1907c;
        } else {
            if (this.f1909e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1909e = checkBox;
                LinearLayout linearLayout2 = this.f1912i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1909e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f1920q = z3;
        this.f1916m = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f1911h;
        if (imageView != null) {
            imageView.setVisibility((this.f1918o || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1905a.f9613n.getClass();
        boolean z3 = this.f1920q;
        if (z3 || this.f1916m) {
            ImageView imageView = this.f1906b;
            if (imageView == null && drawable == null && !this.f1916m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1906b = imageView2;
                LinearLayout linearLayout = this.f1912i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1916m) {
                this.f1906b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1906b;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1906b.getVisibility() != 0) {
                this.f1906b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1908d.getVisibility() != 8) {
                this.f1908d.setVisibility(8);
            }
        } else {
            this.f1908d.setText(charSequence);
            if (this.f1908d.getVisibility() != 0) {
                this.f1908d.setVisibility(0);
            }
        }
    }
}
