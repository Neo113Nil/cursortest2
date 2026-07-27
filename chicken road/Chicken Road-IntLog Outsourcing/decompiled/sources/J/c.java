package J;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b2.AbstractC0279e;
import l.d0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1338a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1339b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f1340c;

    /* renamed from: d, reason: collision with root package name */
    public Context f1341d;

    /* renamed from: e, reason: collision with root package name */
    public int f1342e;

    /* renamed from: f, reason: collision with root package name */
    public a f1343f;

    /* renamed from: g, reason: collision with root package name */
    public b f1344g;

    /* renamed from: h, reason: collision with root package name */
    public d f1345h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1340c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1343f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1344g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1340c = cursor;
            if (cursor != null) {
                a aVar2 = this.f1343f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1344g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1342e = cursor.getColumnIndexOrThrow("_id");
                this.f1338a = true;
                notifyDataSetChanged();
            } else {
                this.f1342e = -1;
                this.f1338a = false;
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
        if (!this.f1338a || (cursor = this.f1340c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1338a) {
            return null;
        }
        this.f1340c.moveToPosition(i2);
        if (view == null) {
            d0 d0Var = (d0) this;
            view = d0Var.f10842k.inflate(d0Var.f10841j, viewGroup, false);
        }
        a(view, this.f1340c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1345h == null) {
            d dVar = new d();
            dVar.f1346a = this;
            this.f1345h = dVar;
        }
        return this.f1345h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f1338a || (cursor = this.f1340c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1340c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f1338a && (cursor = this.f1340c) != null && cursor.moveToPosition(i2)) {
            return this.f1340c.getLong(this.f1342e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1338a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1340c.moveToPosition(i2)) {
            throw new IllegalStateException(AbstractC0279e.d(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1340c);
        return view;
    }
}
