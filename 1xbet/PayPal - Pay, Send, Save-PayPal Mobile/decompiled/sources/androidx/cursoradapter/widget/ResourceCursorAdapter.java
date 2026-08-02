package androidx.cursoradapter.widget;

/* loaded from: classes7.dex */
public abstract class ResourceCursorAdapter extends androidx.cursoradapter.widget.CursorAdapter {
    private android.view.LayoutInflater Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor) {
        super(context, cursor);
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(android.content.Context context, int i, android.database.Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.Camera2StreamConfigurationMap.inflate(this.getHighResolutionOutputSizeshNQ4ISI, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newDropDownView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        return this.Camera2StreamConfigurationMap.inflate(this.getHighSpeedVideoSizes, viewGroup, false);
    }

    public void setViewResource(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setDropDownViewResource(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
