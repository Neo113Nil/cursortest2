package D;

/* loaded from: classes.dex */
public final class d extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public D.c f193a;

    @Override // android.widget.Filter
    public final java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        return ((h.d0) this.f193a).c((android.database.Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        java.lang.String charSequence2;
        android.database.Cursor cursor;
        h.d0 d0Var = (h.d0) this.f193a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            d0Var.getClass();
            charSequence2 = charSequence.toString();
        }
        androidx.appcompat.widget.SearchView searchView = d0Var.f3137l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = d0Var.g(d0Var.f3138m, charSequence2);
            } catch (java.lang.RuntimeException e2) {
                android.util.Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
            if (cursor != null) {
                cursor.getCount();
                android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        android.widget.Filter.FilterResults filterResults2 = new android.widget.Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        D.c cVar = this.f193a;
        android.database.Cursor cursor = cVar.f187c;
        java.lang.Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((h.d0) cVar).b((android.database.Cursor) obj);
    }
}
