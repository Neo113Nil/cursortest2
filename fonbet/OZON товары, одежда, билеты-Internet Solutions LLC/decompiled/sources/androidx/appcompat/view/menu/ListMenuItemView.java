package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.b0;
import i.C6977a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private i f37332a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f37333b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f37334c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f37335d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f37336e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f37337f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f37338g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f37339h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f37340i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f37341j;

    /* renamed from: k, reason: collision with root package name */
    private int f37342k;

    /* renamed from: l, reason: collision with root package name */
    private Context f37343l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37344m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f37345n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f37346o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f37347p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37348q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 v11 = b0.v(getContext(), attributeSet, C6977a.f65664r, R.attr.listMenuViewStyle, 0);
        this.f37341j = v11.g(5);
        this.f37342k = v11.n(1, -1);
        this.f37344m = v11.a(7, false);
        this.f37343l = context;
        this.f37345n = v11.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f37346o = obtainStyledAttributes.hasValue(0);
        v11.x();
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        this.f37348q = true;
        this.f37344m = true;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f37339h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37339h.getLayoutParams();
        rect.top = this.f37339h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b(boolean z11) {
        ImageView imageView = this.f37339h;
        if (imageView != null) {
            imageView.setVisibility((this.f37346o || !z11) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    @Override // androidx.appcompat.view.menu.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i iVar) {
        CompoundButton compoundButton;
        View view;
        int i11;
        Drawable icon;
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        this.f37332a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        CharSequence h11 = iVar.h(this);
        if (h11 != null) {
            this.f37335d.setText(h11);
            if (this.f37335d.getVisibility() != 0) {
                this.f37335d.setVisibility(0);
            }
        } else if (this.f37335d.getVisibility() != 8) {
            this.f37335d.setVisibility(8);
        }
        boolean isCheckable = iVar.isCheckable();
        if (isCheckable || this.f37334c != null || this.f37336e != null) {
            if (this.f37332a.l()) {
                if (this.f37334c == null) {
                    if (this.f37347p == null) {
                        this.f37347p = LayoutInflater.from(getContext());
                    }
                    RadioButton radioButton = (RadioButton) this.f37347p.inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f37334c = radioButton;
                    LinearLayout linearLayout = this.f37340i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f37334c;
                view = this.f37336e;
            } else {
                if (this.f37336e == null) {
                    if (this.f37347p == null) {
                        this.f37347p = LayoutInflater.from(getContext());
                    }
                    CheckBox checkBox = (CheckBox) this.f37347p.inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f37336e = checkBox;
                    LinearLayout linearLayout2 = this.f37340i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f37336e;
                view = this.f37334c;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.f37332a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            } else {
                CheckBox checkBox2 = this.f37336e;
                if (checkBox2 != null) {
                    checkBox2.setVisibility(8);
                }
                RadioButton radioButton2 = this.f37334c;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean z12 = iVar.f37454n.v() && iVar.f() != 0;
        iVar.f();
        if (z12) {
            i iVar2 = this.f37332a;
            if (iVar2.f37454n.v() && iVar2.f() != 0) {
                i11 = 0;
                if (i11 == 0) {
                    this.f37337f.setText(this.f37332a.g());
                }
                if (this.f37337f.getVisibility() != i11) {
                    this.f37337f.setVisibility(i11);
                }
                icon = iVar.getIcon();
                this.f37332a.f37454n.getClass();
                z11 = this.f37348q;
                if ((!z11 || this.f37344m) && ((imageView = this.f37333b) != null || icon != null || this.f37344m)) {
                    if (imageView == null) {
                        if (this.f37347p == null) {
                            this.f37347p = LayoutInflater.from(getContext());
                        }
                        ImageView imageView3 = (ImageView) this.f37347p.inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                        this.f37333b = imageView3;
                        LinearLayout linearLayout3 = this.f37340i;
                        if (linearLayout3 != null) {
                            linearLayout3.addView(imageView3, 0);
                        } else {
                            addView(imageView3, 0);
                        }
                    }
                    if (icon == null || this.f37344m) {
                        ImageView imageView4 = this.f37333b;
                        if (!z11) {
                            icon = null;
                        }
                        imageView4.setImageDrawable(icon);
                        if (this.f37333b.getVisibility() != 0) {
                            this.f37333b.setVisibility(0);
                        }
                    } else {
                        this.f37333b.setVisibility(8);
                    }
                }
                setEnabled(iVar.isEnabled());
                boolean hasSubMenu = iVar.hasSubMenu();
                imageView2 = this.f37338g;
                if (imageView2 != null) {
                    imageView2.setVisibility(hasSubMenu ? 0 : 8);
                }
                setContentDescription(iVar.getContentDescription());
            }
        }
        i11 = 8;
        if (i11 == 0) {
        }
        if (this.f37337f.getVisibility() != i11) {
        }
        icon = iVar.getIcon();
        this.f37332a.f37454n.getClass();
        z11 = this.f37348q;
        if (!z11) {
        }
        if (imageView == null) {
        }
        if (icon == null) {
        }
        ImageView imageView42 = this.f37333b;
        if (!z11) {
        }
        imageView42.setImageDrawable(icon);
        if (this.f37333b.getVisibility() != 0) {
        }
        setEnabled(iVar.isEnabled());
        boolean hasSubMenu2 = iVar.hasSubMenu();
        imageView2 = this.f37338g;
        if (imageView2 != null) {
        }
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final i g() {
        return this.f37332a;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f37341j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f37335d = textView;
        int i11 = this.f37342k;
        if (i11 != -1) {
            textView.setTextAppearance(this.f37343l, i11);
        }
        this.f37337f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f37338g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f37345n);
        }
        this.f37339h = (ImageView) findViewById(R.id.group_divider);
        this.f37340i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        if (this.f37333b != null && this.f37344m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37333b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }
}
