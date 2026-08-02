package Y;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.U0;

/* loaded from: classes.dex */
public final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public c f7645a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((U0) this.f7645a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        U0 u02 = (U0) this.f7645a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            u02.getClass();
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = u02.f8558B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = u02.g(u02.f8559C, charSequence2);
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
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
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f7645a;
        Cursor cursor = cVar.f7640c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((U0) cVar).b((Cursor) obj);
    }
}
