package androidx.loader.content;

/* loaded from: classes7.dex */
public class CursorLoader extends androidx.loader.content.AsyncTaskLoader<android.database.Cursor> {
    private java.lang.String Camera2StreamConfigurationMap;
    private final androidx.loader.content.Loader<android.database.Cursor>.ForceLoadContentObserver getHighResolutionOutputSizeshNQ4ISI;
    private androidx.core.os.CancellationSignal getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;
    private android.database.Cursor getHighSpeedVideoSizes;
    private java.lang.String getInputFormats;
    private android.net.Uri getOutputFormats;
    private java.lang.String[] getOutputMinFrameDuration;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.AsyncTaskLoader
    public android.database.Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new androidx.core.os.OperationCanceledException();
            }
            this.getHighSpeedVideoFpsRanges = new androidx.core.os.CancellationSignal();
        }
        try {
            android.database.Cursor query = androidx.core.content.ContentResolverCompat.query(getContext().getContentResolver(), this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRanges);
            if (query != null) {
                try {
                    query.getCount();
                    query.registerContentObserver(this.getHighResolutionOutputSizeshNQ4ISI);
                } catch (java.lang.RuntimeException e) {
                    query.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.getHighSpeedVideoFpsRanges = null;
            }
            return query;
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                this.getHighSpeedVideoFpsRanges = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            androidx.core.os.CancellationSignal cancellationSignal = this.getHighSpeedVideoFpsRanges;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    @Override // androidx.loader.content.Loader
    public void deliverResult(android.database.Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        android.database.Cursor cursor2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = cursor;
        if (isStarted()) {
            super.deliverResult((androidx.loader.content.CursorLoader) cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    public CursorLoader(android.content.Context context) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.loader.content.Loader.ForceLoadContentObserver();
    }

    public CursorLoader(android.content.Context context, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.loader.content.Loader.ForceLoadContentObserver();
        this.getOutputFormats = uri;
        this.getHighSpeedVideoFpsRangesFor = strArr;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputMinFrameDuration = strArr2;
        this.getInputFormats = str2;
    }

    @Override // androidx.loader.content.Loader
    protected void onStartLoading() {
        android.database.Cursor cursor = this.getHighSpeedVideoSizes;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.getHighSpeedVideoSizes == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onStopLoading() {
        cancelLoad();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void onCanceled(android.database.Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.Loader
    protected void onReset() {
        super.onReset();
        onStopLoading();
        android.database.Cursor cursor = this.getHighSpeedVideoSizes;
        if (cursor != null && !cursor.isClosed()) {
            this.getHighSpeedVideoSizes.close();
        }
        this.getHighSpeedVideoSizes = null;
    }

    public android.net.Uri getUri() {
        return this.getOutputFormats;
    }

    public void setUri(android.net.Uri uri) {
        this.getOutputFormats = uri;
    }

    public java.lang.String[] getProjection() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setProjection(java.lang.String[] strArr) {
        this.getHighSpeedVideoFpsRangesFor = strArr;
    }

    public java.lang.String getSelection() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setSelection(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String[] getSelectionArgs() {
        return this.getOutputMinFrameDuration;
    }

    public void setSelectionArgs(java.lang.String[] strArr) {
        this.getOutputMinFrameDuration = strArr;
    }

    public java.lang.String getSortOrder() {
        return this.getInputFormats;
    }

    public void setSortOrder(java.lang.String str) {
        this.getInputFormats = str;
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.getOutputFormats);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.Camera2StreamConfigurationMap);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(java.util.Arrays.toString(this.getOutputMinFrameDuration));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.getInputFormats);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.getHighSpeedVideoSizes);
    }
}
