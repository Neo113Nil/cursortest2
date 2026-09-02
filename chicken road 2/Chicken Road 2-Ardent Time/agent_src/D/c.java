package D;

/* loaded from: classes.dex */
public abstract class c extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f185a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f186b;

    /* renamed from: c, reason: collision with root package name */
    public android.database.Cursor f187c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f188d;

    /* renamed from: e, reason: collision with root package name */
    public int f189e;

    /* renamed from: f, reason: collision with root package name */
    public D.a f190f;

    /* renamed from: g, reason: collision with root package name */
    public D.b f191g;

    /* renamed from: h, reason: collision with root package name */
    public D.d f192h;

    public abstract void a(android.view.View view, android.database.Cursor cursor);

    public void b(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f187c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                D.a aVar = this.f190f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                D.b bVar = this.f191g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f187c = cursor;
            if (cursor != null) {
                D.a aVar2 = this.f190f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                D.b bVar2 = this.f191g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f189e = cursor.getColumnIndexOrThrow("_id");
                this.f185a = true;
                notifyDataSetChanged();
            } else {
                this.f189e = -1;
                this.f185a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract java.lang.String c(android.database.Cursor cursor);

    public abstract android.view.View d(android.view.ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        android.database.Cursor cursor;
        if (!this.f185a || (cursor = this.f187c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f185a) {
            return null;
        }
        this.f187c.moveToPosition(i2);
        if (view == null) {
            h.d0 d0Var = (h.d0) this;
            view = d0Var.f3136k.inflate(d0Var.f3135j, viewGroup, false);
        }
        a(view, this.f187c);
        return view;
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.f192h == null) {
            D.d dVar = new D.d();
            dVar.f193a = this;
            this.f192h = dVar;
        }
        return this.f192h;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i2) {
        android.database.Cursor cursor;
        if (!this.f185a || (cursor = this.f187c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f187c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        android.database.Cursor cursor;
        if (this.f185a && (cursor = this.f187c) != null && cursor.moveToPosition(i2)) {
            return this.f187c.getLong(this.f189e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f185a) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f187c.moveToPosition(i2)) {
            throw new java.lang.IllegalStateException(B1.a.f(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f187c);
        return view;
    }
}
