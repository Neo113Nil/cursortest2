package I;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.f0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f565a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f566b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f567c;

    /* renamed from: d, reason: collision with root package name */
    public Context f568d;

    /* renamed from: e, reason: collision with root package name */
    public int f569e;
    public a f;

    /* renamed from: g, reason: collision with root package name */
    public b f570g;

    /* renamed from: h, reason: collision with root package name */
    public d f571h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f567c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f570g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f567c = cursor;
            if (cursor != null) {
                a aVar2 = this.f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f570g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f569e = cursor.getColumnIndexOrThrow("_id");
                this.f565a = true;
                notifyDataSetChanged();
            } else {
                this.f569e = -1;
                this.f565a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f565a || (cursor = this.f567c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f565a) {
            return null;
        }
        this.f567c.moveToPosition(i3);
        if (view == null) {
            f0 f0Var = (f0) this;
            view = f0Var.f9778k.inflate(f0Var.f9777j, viewGroup, false);
        }
        a(view, this.f567c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f571h == null) {
            d dVar = new d();
            dVar.f572a = this;
            this.f571h = dVar;
        }
        return this.f571h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f565a || (cursor = this.f567c) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f567c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f565a && (cursor = this.f567c) != null && cursor.moveToPosition(i3)) {
            return this.f567c.getLong(this.f569e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f565a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f567c.moveToPosition(i3)) {
            throw new IllegalStateException(B0.c.h(i3, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f567c);
        return view;
    }
}
