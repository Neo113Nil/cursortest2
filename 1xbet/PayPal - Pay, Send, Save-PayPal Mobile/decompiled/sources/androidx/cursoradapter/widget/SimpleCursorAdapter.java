package androidx.cursoradapter.widget;

/* loaded from: classes7.dex */
public class SimpleCursorAdapter extends androidx.cursoradapter.widget.ResourceCursorAdapter {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder getHighSpeedVideoFpsRanges;
    private androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter getHighSpeedVideoFpsRangesFor;
    java.lang.String[] getHighSpeedVideoSizes;
    protected int[] mFrom;
    protected int[] mTo;

    public interface CursorToStringConverter {
        java.lang.CharSequence convertToString(android.database.Cursor cursor);
    }

    public interface ViewBinder {
        boolean setViewValue(android.view.View view, android.database.Cursor cursor, int i);
    }

    @java.lang.Deprecated
    public SimpleCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, java.lang.String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.mTo = iArr;
        this.getHighSpeedVideoSizes = strArr;
        getHighSpeedVideoSizes(cursor, strArr);
    }

    public SimpleCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, java.lang.String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.mTo = iArr;
        this.getHighSpeedVideoSizes = strArr;
        getHighSpeedVideoSizes(cursor, strArr);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
        androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder viewBinder = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.mTo;
        int length = iArr.length;
        int[] iArr2 = this.mFrom;
        for (int i = 0; i < length; i++) {
            android.view.View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null && (viewBinder == null || !viewBinder.setViewValue(findViewById, cursor, iArr2[i]))) {
                java.lang.String string = cursor.getString(iArr2[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof android.widget.TextView) {
                    setViewText((android.widget.TextView) findViewById, string);
                } else if (findViewById instanceof android.widget.ImageView) {
                    setViewImage((android.widget.ImageView) findViewById, string);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(findViewById.getClass().getName());
                    sb.append(" is not a  view that can be bounds by this SimpleCursorAdapter");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }
        }
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder getViewBinder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setViewBinder(androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder viewBinder) {
        this.getHighSpeedVideoFpsRanges = viewBinder;
    }

    public void setViewImage(android.widget.ImageView imageView, java.lang.String str) {
        try {
            imageView.setImageResource(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            imageView.setImageURI(android.net.Uri.parse(str));
        }
    }

    public void setViewText(android.widget.TextView textView, java.lang.String str) {
        textView.setText(str);
    }

    public int getStringConversionColumn() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setStringConversionColumn(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setCursorToStringConverter(androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter cursorToStringConverter) {
        this.getHighSpeedVideoFpsRangesFor = cursorToStringConverter;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public java.lang.CharSequence convertToString(android.database.Cursor cursor) {
        androidx.cursoradapter.widget.SimpleCursorAdapter.CursorToStringConverter cursorToStringConverter = this.getHighSpeedVideoFpsRangesFor;
        if (cursorToStringConverter != null) {
            return cursorToStringConverter.convertToString(cursor);
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i >= 0) {
            return cursor.getString(i);
        }
        return super.convertToString(cursor);
    }

    private void getHighSpeedVideoSizes(android.database.Cursor cursor, java.lang.String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.mFrom;
            if (iArr == null || iArr.length != length) {
                this.mFrom = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.mFrom[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.mFrom = null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.database.Cursor swapCursor(android.database.Cursor cursor) {
        getHighSpeedVideoSizes(cursor, this.getHighSpeedVideoSizes);
        return super.swapCursor(cursor);
    }

    public void changeCursorAndColumns(android.database.Cursor cursor, java.lang.String[] strArr, int[] iArr) {
        this.getHighSpeedVideoSizes = strArr;
        this.mTo = iArr;
        getHighSpeedVideoSizes(cursor, strArr);
        super.changeCursor(cursor);
    }
}
