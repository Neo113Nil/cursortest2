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
import live.football.scorerepublic.R;
import p000.fo0;
import p000.mz0;
import p000.on0;
import p000.oq0;
import p000.rn0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements fo0, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: j */
    public rn0 f313j;

    /* JADX INFO: renamed from: k */
    public ImageView f314k;

    /* JADX INFO: renamed from: l */
    public RadioButton f315l;

    /* JADX INFO: renamed from: m */
    public TextView f316m;

    /* JADX INFO: renamed from: n */
    public CheckBox f317n;

    /* JADX INFO: renamed from: o */
    public TextView f318o;

    /* JADX INFO: renamed from: p */
    public ImageView f319p;

    /* JADX INFO: renamed from: q */
    public ImageView f320q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f321r;

    /* JADX INFO: renamed from: s */
    public final Drawable f322s;

    /* JADX INFO: renamed from: t */
    public final int f323t;

    /* JADX INFO: renamed from: u */
    public final Context f324u;

    /* JADX INFO: renamed from: v */
    public boolean f325v;

    /* JADX INFO: renamed from: w */
    public final Drawable f326w;

    /* JADX INFO: renamed from: x */
    public final boolean f327x;

    /* JADX INFO: renamed from: y */
    public LayoutInflater f328y;

    /* JADX INFO: renamed from: z */
    public boolean f329z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        oq0 oq0VarM3731n = oq0.m3731n(getContext(), attributeSet, mz0.f5204r, R.attr.listMenuViewStyle);
        this.f322s = oq0VarM3731n.m3735e(5);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        this.f323t = typedArray.getResourceId(1, -1);
        this.f325v = typedArray.getBoolean(7, false);
        this.f324u = context;
        this.f326w = oq0VarM3731n.m3735e(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f327x = typedArrayObtainStyledAttributes.hasValue(0);
        oq0VarM3731n.m3742o();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f328y == null) {
            this.f328y = LayoutInflater.from(getContext());
        }
        return this.f328y;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f319p;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p000.fo0
    /* JADX INFO: renamed from: a */
    public final void mo329a(rn0 rn0Var) {
        boolean z;
        int i;
        String string;
        this.f313j = rn0Var;
        boolean zIsVisible = rn0Var.isVisible();
        on0 on0Var = rn0Var.f6916w;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(rn0Var.f6907n);
        setCheckable(rn0Var.isCheckable());
        if (on0Var.mo2023o()) {
            if ((on0Var.mo2022n() ? rn0Var.f6912s : rn0Var.f6910q) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        on0Var.mo2022n();
        if (z) {
            rn0 rn0Var2 = this.f313j;
            on0 on0Var2 = rn0Var2.f6916w;
            if (on0Var2.mo2023o()) {
                i = (on0Var2.mo2022n() ? rn0Var2.f6912s : rn0Var2.f6910q) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.f318o;
            rn0 rn0Var3 = this.f313j;
            on0 on0Var3 = rn0Var3.f6916w;
            Context context = on0Var3.f5799j;
            char c = on0Var3.mo2022n() ? rn0Var3.f6912s : rn0Var3.f6910q;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = on0Var3.mo2022n() ? rn0Var3.f6913t : rn0Var3.f6911r;
                rn0.m4384c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                rn0.m4384c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                rn0.m4384c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                rn0.m4384c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                rn0.m4384c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                rn0.m4384c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f318o.getVisibility() != i) {
            this.f318o.setVisibility(i);
        }
        setIcon(rn0Var.getIcon());
        setEnabled(rn0Var.isEnabled());
        setSubMenuArrowVisible(rn0Var.hasSubMenu());
        setContentDescription(rn0Var.f6919z);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f320q;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f320q.getLayoutParams();
        rect.top = this.f320q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p000.fo0
    public rn0 getItemData() {
        return this.f313j;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f322s);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f316m = textView;
        int i = this.f323t;
        if (i != -1) {
            textView.setTextAppearance(this.f324u, i);
        }
        this.f318o = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f319p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f326w);
        }
        this.f320q = (ImageView) findViewById(R.id.group_divider);
        this.f321r = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f314k != null && this.f325v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f314k.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f315l == null && this.f317n == null) {
            return;
        }
        if ((this.f313j.f6897G & 4) != 0) {
            if (this.f315l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f315l = radioButton;
                LinearLayout linearLayout = this.f321r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f315l;
            view = this.f317n;
        } else {
            if (this.f317n == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f317n = checkBox;
                LinearLayout linearLayout2 = this.f321r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f317n;
            view = this.f315l;
        }
        if (z) {
            compoundButton.setChecked(this.f313j.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f317n;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f315l;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f313j.f6897G & 4) != 0) {
            if (this.f315l == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f315l = radioButton;
                LinearLayout linearLayout = this.f321r;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f315l;
        } else {
            if (this.f317n == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f317n = checkBox;
                LinearLayout linearLayout2 = this.f321r;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f317n;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f329z = z;
        this.f325v = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f320q;
        if (imageView != null) {
            imageView.setVisibility((this.f327x || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        on0 on0Var = this.f313j.f6916w;
        boolean z = this.f329z;
        if (z || this.f325v) {
            ImageView imageView = this.f314k;
            if (imageView == null && drawable == null && !this.f325v) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f314k = imageView2;
                LinearLayout linearLayout = this.f321r;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f325v) {
                this.f314k.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f314k;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f314k.getVisibility() != 0) {
                this.f314k.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f316m;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f316m.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f316m.getVisibility() != 0) {
                this.f316m.setVisibility(0);
            }
        }
    }
}
