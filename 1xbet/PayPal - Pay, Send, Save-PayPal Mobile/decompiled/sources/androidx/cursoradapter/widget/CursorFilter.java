package androidx.cursoradapter.widget;

/* loaded from: classes7.dex */
class CursorFilter extends android.widget.Filter {
    androidx.cursoradapter.widget.CursorFilter.CursorFilterClient getHighSpeedVideoSizes;

    interface CursorFilterClient {
        void changeCursor(android.database.Cursor cursor);

        java.lang.CharSequence convertToString(android.database.Cursor cursor);

        android.database.Cursor getCursor();

        android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence charSequence);
    }

    CursorFilter(androidx.cursoradapter.widget.CursorFilter.CursorFilterClient cursorFilterClient) {
        this.getHighSpeedVideoSizes = cursorFilterClient;
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        return this.getHighSpeedVideoSizes.convertToString((android.database.Cursor) obj);
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.database.Cursor runQueryOnBackgroundThread = this.getHighSpeedVideoSizes.runQueryOnBackgroundThread(charSequence);
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        android.database.Cursor cursor = this.getHighSpeedVideoSizes.getCursor();
        if (filterResults.values == null || filterResults.values == cursor) {
            return;
        }
        this.getHighSpeedVideoSizes.changeCursor((android.database.Cursor) filterResults.values);
    }
}
