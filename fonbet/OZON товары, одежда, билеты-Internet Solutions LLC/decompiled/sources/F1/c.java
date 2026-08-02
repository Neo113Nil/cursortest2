package F1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Function0<Unit> f8376a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C7460f f8377b;

    /* renamed from: c, reason: collision with root package name */
    private Object f8378c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7737t f8379d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7737t f8380e;

    /* renamed from: f, reason: collision with root package name */
    private Object f8381f;

    public c(Function0 function0) {
        C7460f c7460f;
        c7460f = C7460f.f70279e;
        this.f8376a = function0;
        this.f8377b = c7460f;
        this.f8378c = null;
        this.f8379d = null;
        this.f8380e = null;
        this.f8381f = null;
    }

    public static void a(@NotNull Menu menu, @NotNull b bVar) {
        menu.add(0, bVar.a(), bVar.b(), bVar.d()).setShowAsAction(1);
    }

    private static void b(Menu menu, b bVar, Function0 function0) {
        if (function0 != null && menu.findItem(bVar.a()) == null) {
            a(menu, bVar);
        } else {
            if (function0 != null || menu.findItem(bVar.a()) == null) {
                return;
            }
            menu.removeItem(bVar.a());
        }
    }

    @NotNull
    public final C7460f c() {
        return this.f8377b;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.a()) {
            ?? r32 = this.f8378c;
            if (r32 != 0) {
                r32.invoke();
            }
        } else if (itemId == b.Paste.a()) {
            ?? r33 = this.f8379d;
            if (r33 != 0) {
                r33.invoke();
            }
        } else if (itemId == b.Cut.a()) {
            ?? r34 = this.f8380e;
            if (r34 != 0) {
                r34.invoke();
            }
        } else {
            if (itemId != b.SelectAll.a()) {
                return false;
            }
            ?? r35 = this.f8381f;
            if (r35 != 0) {
                r35.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f8378c != null) {
            a(menu, b.Copy);
        }
        if (this.f8379d != null) {
            a(menu, b.Paste);
        }
        if (this.f8380e != null) {
            a(menu, b.Cut);
        }
        if (this.f8381f != null) {
            a(menu, b.SelectAll);
        }
    }

    public final void f() {
        Function0<Unit> function0 = this.f8376a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, b.Copy, this.f8378c);
        b(menu, b.Paste, this.f8379d);
        b(menu, b.Cut, this.f8380e);
        b(menu, b.SelectAll, this.f8381f);
        return true;
    }

    public final void h(Function0<Unit> function0) {
        this.f8378c = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Function0<Unit> function0) {
        this.f8380e = (AbstractC7737t) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Function0<Unit> function0) {
        this.f8379d = (AbstractC7737t) function0;
    }

    public final void k(Function0<Unit> function0) {
        this.f8381f = function0;
    }

    public final void l(@NotNull C7460f c7460f) {
        this.f8377b = c7460f;
    }
}
