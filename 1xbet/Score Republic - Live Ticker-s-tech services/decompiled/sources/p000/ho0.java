package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ho0 extends AbstractC0717t5 implements Menu {

    /* JADX INFO: renamed from: l */
    public final on0 f3275l;

    public ho0(Context context, on0 on0Var) {
        super(context);
        if (on0Var != null) {
            this.f3275l = on0Var;
        } else {
            C0270h1.m2190f("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4688f(this.f3275l.m3705a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f3275l.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m4688f(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3275l.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        w71 w71Var = (w71) this.f7280k;
        if (w71Var != null) {
            w71Var.clear();
        }
        this.f3275l.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f3275l.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m4688f(this.f3275l.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m4688f(this.f3275l.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f3275l.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f3275l.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f3275l.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f3275l.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((w71) this.f7280k) != null) {
            int i2 = 0;
            while (true) {
                w71 w71Var = (w71) this.f7280k;
                if (i2 >= w71Var.f8453l) {
                    break;
                }
                if (((wb1) w71Var.m5299f(i2)).getGroupId() == i) {
                    ((w71) this.f7280k).mo5301h(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f3275l.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((w71) this.f7280k) != null) {
            int i2 = 0;
            while (true) {
                w71 w71Var = (w71) this.f7280k;
                if (i2 >= w71Var.f8453l) {
                    break;
                }
                if (((wb1) w71Var.m5299f(i2)).getItemId() == i) {
                    ((w71) this.f7280k).mo5301h(i2);
                    break;
                }
                i2++;
            }
        }
        this.f3275l.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f3275l.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f3275l.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f3275l.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f3275l.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3275l.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f3275l.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f3275l.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f3275l.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m4688f(this.f3275l.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m4688f(this.f3275l.m3705a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m4688f(this.f3275l.add(i, i2, i3, i4));
    }
}
