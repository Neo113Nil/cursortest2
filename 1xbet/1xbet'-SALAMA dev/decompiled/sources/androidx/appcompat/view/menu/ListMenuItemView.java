package androidx.appcompat.view.menu;

import P.U;
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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;
import p051h.a;
import p086m.k;
import p086m.m;
import p086m.y;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Drawable f8157A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f8158B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Context f8159C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f8160D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Drawable f8161E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f8162F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LayoutInflater f8163G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8164H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f8165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f8166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f8167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f8168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f8169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f8170f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f8171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f8172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f8173z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f8163G == null) {
            this.f8163G = LayoutInflater.from(getContext());
        }
        return this.f8163G;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f8171x;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p086m.y
    public final void a(m mVar) {
        boolean z4;
        int i7;
        String string;
        boolean z7;
        this.f8165a = mVar;
        setVisibility(mVar.isVisible() ? 0 : 8);
        setTitle(mVar.f15180e);
        setCheckable(mVar.isCheckable());
        if (mVar.f15160E.o()) {
            if ((mVar.f15160E.n() ? mVar.f15156A : mVar.f15183y) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        mVar.f15160E.n();
        if (z4) {
            m mVar2 = this.f8165a;
            if (mVar2.f15160E.o()) {
                if ((mVar2.f15160E.n() ? mVar2.f15156A : mVar2.f15183y) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            i7 = z7 ? 0 : 8;
        }
        if (i7 == 0) {
            TextView textView = this.f8170f;
            m mVar3 = this.f8165a;
            char c3 = mVar3.f15160E.n() ? mVar3.f15156A : mVar3.f15183y;
            if (c3 == 0) {
                string = "";
            } else {
                k kVar = mVar3.f15160E;
                Resources resources = kVar.f15144a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(kVar.f15144a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i8 = kVar.n() ? mVar3.f15157B : mVar3.f15184z;
                m.a(i8, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                m.a(i8, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                m.a(i8, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                m.a(i8, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                m.a(i8, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                m.a(i8, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c3 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c3 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c3 != ' ') {
                    sb.append(c3);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f8170f.getVisibility() != i7) {
            this.f8170f.setVisibility(i7);
        }
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.f15163H);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8172y;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8172y.getLayoutParams();
        rect.top = this.f8172y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p086m.y
    public m getItemData() {
        return this.f8165a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = U.f5037a;
        setBackground(this.f8157A);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f8168d = textView;
        int i7 = this.f8158B;
        if (i7 != -1) {
            textView.setTextAppearance(this.f8159C, i7);
        }
        this.f8170f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f8171x = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8161E);
        }
        this.f8172y = (ImageView) findViewById(R.id.group_divider);
        this.f8173z = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f8166b != null && this.f8160D) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8166b.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f8167c == null && this.f8169e == null) {
            return;
        }
        if ((this.f8165a.f15170O & 4) != 0) {
            if (this.f8167c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8167c = radioButton;
                LinearLayout linearLayout = this.f8173z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8167c;
            view = this.f8169e;
        } else {
            if (this.f8169e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8169e = checkBox;
                LinearLayout linearLayout2 = this.f8173z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8169e;
            view = this.f8167c;
        }
        if (z4) {
            compoundButton.setChecked(this.f8165a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f8169e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f8167c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f8165a.f15170O & 4) != 0) {
            if (this.f8167c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8167c = radioButton;
                LinearLayout linearLayout = this.f8173z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8167c;
        } else {
            if (this.f8169e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8169e = checkBox;
                LinearLayout linearLayout2 = this.f8173z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8169e;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f8164H = z4;
        this.f8160D = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f8172y;
        if (imageView != null) {
            imageView.setVisibility((this.f8162F || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z4 = this.f8165a.f15160E.f15137J || this.f8164H;
        if (z4 || this.f8160D) {
            ImageView imageView = this.f8166b;
            if (imageView == null && drawable == null && !this.f8160D) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f8166b = imageView2;
                LinearLayout linearLayout = this.f8173z;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f8160D) {
                this.f8166b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f8166b;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f8166b.getVisibility() != 0) {
                this.f8166b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f8168d.getVisibility() != 8) {
                this.f8168d.setVisibility(8);
            }
        } else {
            this.f8168d.setText(charSequence);
            if (this.f8168d.getVisibility() != 0) {
                this.f8168d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        C1017n0 c1017n0F = C1017n0.F(getContext(), attributeSet, a.f13346s, i7);
        this.f8157A = c1017n0F.u(5);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        this.f8158B = typedArray.getResourceId(1, -1);
        this.f8160D = typedArray.getBoolean(7, false);
        this.f8159C = context;
        this.f8161E = c1017n0F.u(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f8162F = typedArrayObtainStyledAttributes.hasValue(0);
        c1017n0F.H();
        typedArrayObtainStyledAttributes.recycle();
    }
}
