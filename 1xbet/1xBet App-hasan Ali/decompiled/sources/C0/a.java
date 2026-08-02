package C0;

import A0.C0040k0;
import E.A;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h0.C1989c;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final c f801a;

    public a(c cVar) {
        this.f801a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        c cVar = this.f801a;
        cVar.getClass();
        l.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            A a5 = (A) cVar.f813d;
            if (a5 != null) {
                a5.invoke();
            }
        } else if (itemId == 1) {
            A a6 = (A) cVar.f814e;
            if (a6 != null) {
                a6.invoke();
            }
        } else if (itemId == 2) {
            A a7 = (A) cVar.f;
            if (a7 != null) {
                a7.invoke();
            }
        } else if (itemId == 3) {
            A a8 = (A) cVar.f815g;
            if (a8 != null) {
                a8.invoke();
            }
        } else if (itemId != 4) {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f801a;
        cVar.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((A) cVar.f813d) != null) {
            c.a(menu, b.f802m);
        }
        if (((A) cVar.f814e) != null) {
            c.a(menu, b.f803n);
        }
        if (((A) cVar.f) != null) {
            c.a(menu, b.f804o);
        }
        if (((A) cVar.f815g) == null) {
            return true;
        }
        c.a(menu, b.f805p);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C0040k0) this.f801a.f811b).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C1989c c1989c = (C1989c) this.f801a.f812c;
        if (rect != null) {
            rect.set((int) c1989c.f17193a, (int) c1989c.f17194b, (int) c1989c.f17195c, (int) c1989c.f17196d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.f801a;
        cVar.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        c.b(menu, b.f802m, (A) cVar.f813d);
        c.b(menu, b.f803n, (A) cVar.f814e);
        c.b(menu, b.f804o, (A) cVar.f);
        c.b(menu, b.f805p, (A) cVar.f815g);
        c.b(menu, b.f806q, null);
        return true;
    }
}
