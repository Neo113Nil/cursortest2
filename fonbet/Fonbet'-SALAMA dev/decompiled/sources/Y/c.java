package Y;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.U0;
import e1.k;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7638a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7639b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f7640c;

    /* renamed from: d, reason: collision with root package name */
    public int f7641d;

    /* renamed from: e, reason: collision with root package name */
    public a f7642e;

    /* renamed from: f, reason: collision with root package name */
    public b f7643f;

    /* renamed from: x, reason: collision with root package name */
    public d f7644x;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7640c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f7642e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f7643f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f7640c = cursor;
            if (cursor != null) {
                a aVar2 = this.f7642e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f7643f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f7641d = cursor.getColumnIndexOrThrow("_id");
                this.f7638a = true;
                notifyDataSetChanged();
            } else {
                this.f7641d = -1;
                this.f7638a = false;
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
        if (!this.f7638a || (cursor = this.f7640c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f7638a) {
            return null;
        }
        this.f7640c.moveToPosition(i7);
        if (view == null) {
            U0 u02 = (U0) this;
            view = u02.f8557A.inflate(u02.f8572z, viewGroup, false);
        }
        a(view, this.f7640c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f7644x == null) {
            d dVar = new d();
            dVar.f7645a = this;
            this.f7644x = dVar;
        }
        return this.f7644x;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (!this.f7638a || (cursor = this.f7640c) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f7640c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (this.f7638a && (cursor = this.f7640c) != null && cursor.moveToPosition(i7)) {
            return this.f7640c.getLong(this.f7641d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f7638a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f7640c.moveToPosition(i7)) {
            throw new IllegalStateException(k.d(i7, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f7640c);
        return view;
    }
}
