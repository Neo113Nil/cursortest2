package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1413A extends F.x implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final k f15039c;

    public MenuC1413A(Context context, k kVar) {
        super(context);
        if (kVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15039c = kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return l(this.f15039c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f15039c.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = l(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f15039c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        r.l lVar = (r.l) this.f2476b;
        if (lVar != null) {
            lVar.clear();
        }
        this.f15039c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f15039c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return l(this.f15039c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return l(this.f15039c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f15039c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f15039c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return this.f15039c.performIdentifierAction(i7, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f15039c.performShortcut(i7, keyEvent, i8);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((r.l) this.f2476b) != null) {
            int i8 = 0;
            while (true) {
                r.l lVar = (r.l) this.f2476b;
                if (i8 >= lVar.f16007c) {
                    break;
                }
                if (((K.a) lVar.h(i8)).getGroupId() == i7) {
                    ((r.l) this.f2476b).i(i8);
                    i8--;
                }
                i8++;
            }
        }
        this.f15039c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((r.l) this.f2476b) != null) {
            int i8 = 0;
            while (true) {
                r.l lVar = (r.l) this.f2476b;
                if (i8 >= lVar.f16007c) {
                    break;
                }
                if (((K.a) lVar.h(i8)).getItemId() == i7) {
                    ((r.l) this.f2476b).i(i8);
                    break;
                }
                i8++;
            }
        }
        this.f15039c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z4, boolean z7) {
        this.f15039c.setGroupCheckable(i7, z4, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z4) {
        this.f15039c.setGroupEnabled(i7, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z4) {
        this.f15039c.setGroupVisible(i7, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f15039c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f15039c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.f15039c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return this.f15039c.addSubMenu(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return l(this.f15039c.add(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return this.f15039c.addSubMenu(i7, i8, i9, i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return l(this.f15039c.a(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return l(this.f15039c.add(i7, i8, i9, i10));
    }
}
