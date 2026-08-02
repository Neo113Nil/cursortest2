package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.collection.Z;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f37263a;

    /* renamed from: b, reason: collision with root package name */
    final b f37264b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f37265a;

        /* renamed from: b, reason: collision with root package name */
        final Context f37266b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f37267c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final Z<Menu, Menu> f37268d = new Z<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f37266b = context;
            this.f37265a = callback;
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(b bVar, androidx.appcompat.view.menu.g gVar) {
            f e11 = e(bVar);
            Z<Menu, Menu> z11 = this.f37268d;
            Menu menu = z11.get(gVar);
            if (menu == null) {
                menu = new o(this.f37266b, gVar);
                z11.put(gVar, menu);
            }
            return this.f37265a.onCreateActionMode(e11, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean b(b bVar, androidx.appcompat.view.menu.i iVar) {
            return this.f37265a.onActionItemClicked(e(bVar), new j(this.f37266b, iVar));
        }

        @Override // androidx.appcompat.view.b.a
        public final void c(b bVar) {
            this.f37265a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean d(b bVar, androidx.appcompat.view.menu.g gVar) {
            f e11 = e(bVar);
            Z<Menu, Menu> z11 = this.f37268d;
            Menu menu = z11.get(gVar);
            if (menu == null) {
                menu = new o(this.f37266b, gVar);
                z11.put(gVar, menu);
            }
            return this.f37265a.onPrepareActionMode(e11, menu);
        }

        public final f e(b bVar) {
            ArrayList<f> arrayList = this.f37267c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = arrayList.get(i11);
                if (fVar != null && fVar.f37264b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f37266b, bVar);
            arrayList.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f37263a = context;
        this.f37264b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f37264b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f37264b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new o(this.f37263a, this.f37264b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f37264b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f37264b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f37264b.h();
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f37264b.i();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f37264b.j();
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f37264b.k();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f37264b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f37264b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f37264b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f37264b.p(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f37264b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z11) {
        this.f37264b.s(z11);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i11) {
        this.f37264b.n(i11);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i11) {
        this.f37264b.q(i11);
    }
}
