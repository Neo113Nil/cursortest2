package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import s2.InterfaceMenuC9584a;

/* loaded from: classes8.dex */
public class o extends b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuC9584a f37491d;

    public o(Context context, InterfaceMenuC9584a interfaceMenuC9584a) {
        super(context);
        if (interfaceMenuC9584a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f37491d = interfaceMenuC9584a;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f37491d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f37491d.addIntentOptions(i11, i12, i13, componentName, intentArr, intent, i14, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i15 = 0; i15 < length; i15++) {
                menuItemArr[i15] = c(menuItemArr2[i15]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f37491d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        e();
        this.f37491d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f37491d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        return c(this.f37491d.findItem(i11));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return c(this.f37491d.getItem(i11));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f37491d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return this.f37491d.isShortcutKey(i11, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return this.f37491d.performIdentifierAction(i11, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        return this.f37491d.performShortcut(i11, keyEvent, i12);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        f(i11);
        this.f37491d.removeGroup(i11);
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        g(i11);
        this.f37491d.removeItem(i11);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        this.f37491d.setGroupCheckable(i11, z11, z12);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        this.f37491d.setGroupEnabled(i11, z11);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        this.f37491d.setGroupVisible(i11, z11);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z11) {
        this.f37491d.setQwertyMode(z11);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f37491d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return c(this.f37491d.add(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return d(this.f37491d.addSubMenu(i11));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return c(this.f37491d.add(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        return d(this.f37491d.addSubMenu(i11, i12, i13, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return c(this.f37491d.add(i11, i12, i13, i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return d(this.f37491d.addSubMenu(i11, i12, i13, i14));
    }
}
