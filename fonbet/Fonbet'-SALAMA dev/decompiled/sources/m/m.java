package m;

import P.AbstractC0347c;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class m implements K.a {

    /* renamed from: A, reason: collision with root package name */
    public char f15150A;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f15152C;

    /* renamed from: E, reason: collision with root package name */
    public final k f15154E;

    /* renamed from: F, reason: collision with root package name */
    public SubMenuC1416D f15155F;

    /* renamed from: G, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f15156G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f15157H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f15158I;

    /* renamed from: P, reason: collision with root package name */
    public int f15165P;

    /* renamed from: Q, reason: collision with root package name */
    public View f15166Q;

    /* renamed from: R, reason: collision with root package name */
    public AbstractC0347c f15167R;

    /* renamed from: S, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f15168S;

    /* renamed from: a, reason: collision with root package name */
    public final int f15170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15173d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15174e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f15175f;

    /* renamed from: x, reason: collision with root package name */
    public Intent f15176x;

    /* renamed from: y, reason: collision with root package name */
    public char f15177y;

    /* renamed from: z, reason: collision with root package name */
    public int f15178z = 4096;

    /* renamed from: B, reason: collision with root package name */
    public int f15151B = 4096;

    /* renamed from: D, reason: collision with root package name */
    public int f15153D = 0;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f15159J = null;

    /* renamed from: K, reason: collision with root package name */
    public PorterDuff.Mode f15160K = null;

    /* renamed from: L, reason: collision with root package name */
    public boolean f15161L = false;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15162M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15163N = false;

    /* renamed from: O, reason: collision with root package name */
    public int f15164O = 16;

    /* renamed from: T, reason: collision with root package name */
    public boolean f15169T = false;

    public m(k kVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f15154E = kVar;
        this.f15170a = i8;
        this.f15171b = i7;
        this.f15172c = i9;
        this.f15173d = i10;
        this.f15174e = charSequence;
        this.f15165P = i11;
    }

    public static void a(int i7, int i8, String str, StringBuilder sb) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f15163N && (this.f15161L || this.f15162M)) {
            drawable = drawable.mutate();
            if (this.f15161L) {
                J.a.h(drawable, this.f15159J);
            }
            if (this.f15162M) {
                J.a.i(drawable, this.f15160K);
            }
            this.f15163N = false;
        }
        return drawable;
    }

    @Override // K.a
    public final K.a c(AbstractC0347c abstractC0347c) {
        AbstractC0347c abstractC0347c2 = this.f15167R;
        if (abstractC0347c2 != null) {
            abstractC0347c2.f5050a = null;
        }
        this.f15166Q = null;
        this.f15167R = abstractC0347c;
        this.f15154E.p(true);
        AbstractC0347c abstractC0347c3 = this.f15167R;
        if (abstractC0347c3 != null) {
            abstractC0347c3.d(new R4.c(this, 20));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f15165P & 8) == 0) {
            return false;
        }
        if (this.f15166Q == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15168S;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f15154E.d(this);
        }
        return false;
    }

    @Override // K.a
    public final AbstractC0347c d() {
        return this.f15167R;
    }

    public final boolean e() {
        AbstractC0347c abstractC0347c;
        if ((this.f15165P & 8) == 0) {
            return false;
        }
        if (this.f15166Q == null && (abstractC0347c = this.f15167R) != null) {
            this.f15166Q = abstractC0347c.b(this);
        }
        return this.f15166Q != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15168S;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f15154E.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f15164O & 32) == 32;
    }

    public final void g(boolean z4) {
        if (z4) {
            this.f15164O |= 32;
        } else {
            this.f15164O &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f15166Q;
        if (view != null) {
            return view;
        }
        AbstractC0347c abstractC0347c = this.f15167R;
        if (abstractC0347c == null) {
            return null;
        }
        View b7 = abstractC0347c.b(this);
        this.f15166Q = b7;
        return b7;
    }

    @Override // K.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f15151B;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f15150A;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f15157H;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f15171b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f15152C;
        if (drawable != null) {
            return b(drawable);
        }
        int i7 = this.f15153D;
        if (i7 == 0) {
            return null;
        }
        Drawable w7 = AbstractC1464a.w(this.f15154E.f15138a, i7);
        this.f15153D = 0;
        this.f15152C = w7;
        return b(w7);
    }

    @Override // K.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f15159J;
    }

    @Override // K.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15160K;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f15176x;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f15170a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // K.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f15178z;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f15177y;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f15172c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f15155F;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f15174e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15175f;
        return charSequence != null ? charSequence : this.f15174e;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f15158I;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f15155F != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f15169T;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f15164O & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f15164O & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f15164O & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0347c abstractC0347c = this.f15167R;
        return (abstractC0347c == null || !abstractC0347c.c()) ? (this.f15164O & 8) == 0 : (this.f15164O & 8) == 0 && this.f15167R.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f15166Q = view;
        this.f15167R = null;
        if (view != null && view.getId() == -1 && (i7 = this.f15170a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f15154E;
        kVar.f15123B = true;
        kVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f15150A == c3) {
            return this;
        }
        this.f15150A = Character.toLowerCase(c3);
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i7 = this.f15164O;
        int i8 = (z4 ? 1 : 0) | (i7 & (-2));
        this.f15164O = i8;
        if (i7 != i8) {
            this.f15154E.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i7 = this.f15164O;
        if ((i7 & 4) != 0) {
            k kVar = this.f15154E;
            kVar.getClass();
            ArrayList arrayList = kVar.f15143f;
            int size = arrayList.size();
            kVar.w();
            for (int i8 = 0; i8 < size; i8++) {
                m mVar = (m) arrayList.get(i8);
                if (mVar.f15171b == this.f15171b && (mVar.f15164O & 4) != 0 && mVar.isCheckable()) {
                    boolean z7 = mVar == this;
                    int i9 = mVar.f15164O;
                    int i10 = (z7 ? 2 : 0) | (i9 & (-3));
                    mVar.f15164O = i10;
                    if (i9 != i10) {
                        mVar.f15154E.p(false);
                    }
                }
            }
            kVar.v();
        } else {
            int i11 = (i7 & (-3)) | (z4 ? 2 : 0);
            this.f15164O = i11;
            if (i7 != i11) {
                this.f15154E.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f15164O |= 16;
        } else {
            this.f15164O &= -17;
        }
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f15153D = 0;
        this.f15152C = drawable;
        this.f15163N = true;
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15159J = colorStateList;
        this.f15161L = true;
        this.f15163N = true;
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15160K = mode;
        this.f15162M = true;
        this.f15163N = true;
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f15176x = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f15177y == c3) {
            return this;
        }
        this.f15177y = c3;
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15168S = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15156G = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f15177y = c3;
        this.f15150A = Character.toLowerCase(c4);
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15165P = i7;
        k kVar = this.f15154E;
        kVar.f15123B = true;
        kVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15174e = charSequence;
        this.f15154E.p(false);
        SubMenuC1416D subMenuC1416D = this.f15155F;
        if (subMenuC1416D != null) {
            subMenuC1416D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15175f = charSequence;
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i7 = this.f15164O;
        int i8 = (z4 ? 0 : 8) | (i7 & (-9));
        this.f15164O = i8;
        if (i7 != i8) {
            k kVar = this.f15154E;
            kVar.f15145y = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15174e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // K.a, android.view.MenuItem
    public final K.a setContentDescription(CharSequence charSequence) {
        this.f15157H = charSequence;
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final K.a setTooltipText(CharSequence charSequence) {
        this.f15158I = charSequence;
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i7) {
        if (this.f15150A == c3 && this.f15151B == i7) {
            return this;
        }
        this.f15150A = Character.toLowerCase(c3);
        this.f15151B = KeyEvent.normalizeMetaState(i7);
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i7) {
        if (this.f15177y == c3 && this.f15178z == i7) {
            return this;
        }
        this.f15177y = c3;
        this.f15178z = KeyEvent.normalizeMetaState(i7);
        this.f15154E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i7, int i8) {
        this.f15177y = c3;
        this.f15178z = KeyEvent.normalizeMetaState(i7);
        this.f15150A = Character.toLowerCase(c4);
        this.f15151B = KeyEvent.normalizeMetaState(i8);
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f15152C = null;
        this.f15153D = i7;
        this.f15163N = true;
        this.f15154E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f15154E.f15138a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.f15154E.f15138a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f15166Q = inflate;
        this.f15167R = null;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f15170a) > 0) {
            inflate.setId(i8);
        }
        k kVar = this.f15154E;
        kVar.f15123B = true;
        kVar.p(true);
        return this;
    }
}
