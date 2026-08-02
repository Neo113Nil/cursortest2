package androidx.appcompat.app;

/* loaded from: classes5.dex */
class NavItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    private final androidx.appcompat.app.ActionBar.OnNavigationListener getHighSpeedVideoFpsRanges;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
    }

    public NavItemSelectedListener(androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener) {
        this.getHighSpeedVideoFpsRanges = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener = this.getHighSpeedVideoFpsRanges;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i, j);
        }
    }
}
