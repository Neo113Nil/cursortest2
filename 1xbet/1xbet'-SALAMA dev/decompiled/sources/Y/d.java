package Y;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.U0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7645a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((U0) this.f7645a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        U0 u4 = (U0) this.f7645a;
        if (charSequence == null) {
            string = "";
        } else {
            u4.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = u4.f8558B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = u4.g(u4.f8559C, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
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
