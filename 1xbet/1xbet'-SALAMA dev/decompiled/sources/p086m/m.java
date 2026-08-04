package p086m;

import K.a;
import P.AbstractC0347c;
import R4.c;
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

/* JADX INFO: loaded from: classes.dex */
public final class m implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public char f15156A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f15158C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final k f15160E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public D f15161F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f15162G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f15163H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f15164I;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15171P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public View f15172Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public AbstractC0347c f15173R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f15174S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f15180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f15181f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Intent f15182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public char f15183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15184z = 4096;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15157B = 4096;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15159D = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ColorStateList f15165J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public PorterDuff.Mode f15166K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15167L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f15168M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f15169N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15170O = 16;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f15175T = false;

    public m(k kVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f15160E = kVar;
        this.f15176a = i8;
        this.f15177b = i7;
        this.f15178c = i9;
        this.f15179d = i10;
        this.f15180e = charSequence;
        this.f15171P = i11;
    }

    public static void a(int i7, int i8, String str, StringBuilder sb) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f15169N && (this.f15167L || this.f15168M)) {
            drawable = drawable.mutate();
            if (this.f15167L) {
                J.a.h(drawable, this.f15165J);
            }
            if (this.f15168M) {
                J.a.i(drawable, this.f15166K);
            }
            this.f15169N = false;
        }
        return drawable;
    }

    @Override // K.a
    public final a c(AbstractC0347c abstractC0347c) {
        AbstractC0347c abstractC0347c2 = this.f15173R;
        if (abstractC0347c2 != null) {
            abstractC0347c2.f5050a = null;
        }
        this.f15172Q = null;
        this.f15173R = abstractC0347c;
        this.f15160E.p(true);
        AbstractC0347c abstractC0347c3 = this.f15173R;
        if (abstractC0347c3 != null) {
            abstractC0347c3.d(new c(this, 20));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f15171P & 8) == 0) {
            return false;
        }
        if (this.f15172Q == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15174S;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f15160E.d(this);
        }
        return false;
    }

    @Override // K.a
    public final AbstractC0347c d() {
        return this.f15173R;
    }

    public final boolean e() {
        AbstractC0347c abstractC0347c;
        if ((this.f15171P & 8) == 0) {
            return false;
        }
        if (this.f15172Q == null && (abstractC0347c = this.f15173R) != null) {
            this.f15172Q = abstractC0347c.b(this);
        }
        return this.f15172Q != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f15174S;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f15160E.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f15170O & 32) == 32;
    }

    public final void g(boolean z4) {
        if (z4) {
            this.f15170O |= 32;
        } else {
            this.f15170O &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f15172Q;
        if (view != null) {
            return view;
        }
        AbstractC0347c abstractC0347c = this.f15173R;
        if (abstractC0347c == null) {
            return null;
        }
        View viewB = abstractC0347c.b(this);
        this.f15172Q = viewB;
        return viewB;
    }

    @Override // K.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f15157B;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f15156A;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f15163H;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f15177b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f15158C;
        if (drawable != null) {
            return b(drawable);
        }
        int i7 = this.f15159D;
        if (i7 == 0) {
            return null;
        }
        Drawable drawableW = p097n3.a.w(this.f15160E.f15144a, i7);
        this.f15159D = 0;
        this.f15158C = drawableW;
        return b(drawableW);
    }

    @Override // K.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f15165J;
    }

    @Override // K.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f15166K;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f15182x;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f15176a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // K.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f15184z;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f15183y;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f15178c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f15161F;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f15180e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15181f;
        return charSequence != null ? charSequence : this.f15180e;
    }

    @Override // K.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f15164I;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f15161F != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f15175T;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f15170O & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f15170O & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f15170O & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0347c abstractC0347c = this.f15173R;
        if (abstractC0347c == null || !abstractC0347c.c()) {
            return (this.f15170O & 8) == 0;
        }
        return (this.f15170O & 8) == 0 && this.f15173R.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f15172Q = view;
        this.f15173R = null;
        if (view != null && view.getId() == -1 && (i7 = this.f15176a) > 0) {
            view.setId(i7);
        }
        k kVar = this.f15160E;
        kVar.f15129B = true;
        kVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f15156A == c3) {
            return this;
        }
        this.f15156A = Character.toLowerCase(c3);
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i7 = this.f15170O;
        int i8 = (z4 ? 1 : 0) | (i7 & (-2));
        this.f15170O = i8;
        if (i7 != i8) {
            this.f15160E.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i7 = this.f15170O;
        if ((i7 & 4) != 0) {
            k kVar = this.f15160E;
            kVar.getClass();
            ArrayList arrayList = kVar.f15149f;
            int size = arrayList.size();
            kVar.w();
            for (int i8 = 0; i8 < size; i8++) {
                m mVar = (m) arrayList.get(i8);
                if (mVar.f15177b == this.f15177b && (mVar.f15170O & 4) != 0 && mVar.isCheckable()) {
                    boolean z7 = mVar == this;
                    int i9 = mVar.f15170O;
                    int i10 = (z7 ? 2 : 0) | (i9 & (-3));
                    mVar.f15170O = i10;
                    if (i9 != i10) {
                        mVar.f15160E.p(false);
                    }
                }
            }
            kVar.v();
        } else {
            int i11 = (i7 & (-3)) | (z4 ? 2 : 0);
            this.f15170O = i11;
            if (i7 != i11) {
                this.f15160E.p(false);
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
            this.f15170O |= 16;
        } else {
            this.f15170O &= -17;
        }
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f15159D = 0;
        this.f15158C = drawable;
        this.f15169N = true;
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15165J = colorStateList;
        this.f15167L = true;
        this.f15169N = true;
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15166K = mode;
        this.f15168M = true;
        this.f15169N = true;
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f15182x = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f15183y == c3) {
            return this;
        }
        this.f15183y = c3;
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15174S = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15162G = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f15183y = c3;
        this.f15156A = Character.toLowerCase(c4);
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f15171P = i7;
        k kVar = this.f15160E;
        kVar.f15129B = true;
        kVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f15180e = charSequence;
        this.f15160E.p(false);
        D d7 = this.f15161F;
        if (d7 != null) {
            d7.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15181f = charSequence;
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i7 = this.f15170O;
        int i8 = (z4 ? 0 : 8) | (i7 & (-9));
        this.f15170O = i8;
        if (i7 != i8) {
            k kVar = this.f15160E;
            kVar.f15151y = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f15180e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // K.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f15163H = charSequence;
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f15164I = charSequence;
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i7) {
        if (this.f15156A == c3 && this.f15157B == i7) {
            return this;
        }
        this.f15156A = Character.toLowerCase(c3);
        this.f15157B = KeyEvent.normalizeMetaState(i7);
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i7) {
        if (this.f15183y == c3 && this.f15184z == i7) {
            return this;
        }
        this.f15183y = c3;
        this.f15184z = KeyEvent.normalizeMetaState(i7);
        this.f15160E.p(false);
        return this;
    }

    @Override // K.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i7, int i8) {
        this.f15183y = c3;
        this.f15184z = KeyEvent.normalizeMetaState(i7);
        this.f15156A = Character.toLowerCase(c4);
        this.f15157B = KeyEvent.normalizeMetaState(i8);
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f15158C = null;
        this.f15159D = i7;
        this.f15169N = true;
        this.f15160E.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f15160E.f15144a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.f15160E.f15144a;
        View viewInflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f15172Q = viewInflate;
        this.f15173R = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i8 = this.f15176a) > 0) {
            viewInflate.setId(i8);
        }
        k kVar = this.f15160E;
        kVar.f15129B = true;
        kVar.p(true);
        return this;
    }
}
