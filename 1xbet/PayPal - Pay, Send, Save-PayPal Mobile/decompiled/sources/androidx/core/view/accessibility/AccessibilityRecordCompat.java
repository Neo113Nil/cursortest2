package androidx.core.view.accessibility;

/* loaded from: classes3.dex */
public class AccessibilityRecordCompat {
    private final android.view.accessibility.AccessibilityRecord getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public AccessibilityRecordCompat(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = (android.view.accessibility.AccessibilityRecord) obj;
    }

    @java.lang.Deprecated
    public java.lang.Object getImpl() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain(androidx.core.view.accessibility.AccessibilityRecordCompat accessibilityRecordCompat) {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(android.view.accessibility.AccessibilityRecord.obtain(accessibilityRecordCompat.getHighSpeedVideoFpsRangesFor));
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain() {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(android.view.accessibility.AccessibilityRecord.obtain());
    }

    @java.lang.Deprecated
    public void setSource(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.setSource(view);
    }

    @java.lang.Deprecated
    public void setSource(android.view.View view, int i) {
        setSource(this.getHighSpeedVideoFpsRangesFor, view, i);
    }

    @androidx.annotation.ReplaceWith(expression = "record.setSource(root, virtualDescendantId)")
    @java.lang.Deprecated
    public static void setSource(android.view.accessibility.AccessibilityRecord accessibilityRecord, android.view.View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    @java.lang.Deprecated
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getSource() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getSource());
    }

    @java.lang.Deprecated
    public int getWindowId() {
        return this.getHighSpeedVideoFpsRangesFor.getWindowId();
    }

    @java.lang.Deprecated
    public boolean isChecked() {
        return this.getHighSpeedVideoFpsRangesFor.isChecked();
    }

    @java.lang.Deprecated
    public void setChecked(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setChecked(z);
    }

    @java.lang.Deprecated
    public boolean isEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.isEnabled();
    }

    @java.lang.Deprecated
    public void setEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setEnabled(z);
    }

    @java.lang.Deprecated
    public boolean isPassword() {
        return this.getHighSpeedVideoFpsRangesFor.isPassword();
    }

    @java.lang.Deprecated
    public void setPassword(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setPassword(z);
    }

    @java.lang.Deprecated
    public boolean isFullScreen() {
        return this.getHighSpeedVideoFpsRangesFor.isFullScreen();
    }

    @java.lang.Deprecated
    public void setFullScreen(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setFullScreen(z);
    }

    @java.lang.Deprecated
    public boolean isScrollable() {
        return this.getHighSpeedVideoFpsRangesFor.isScrollable();
    }

    @java.lang.Deprecated
    public void setScrollable(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setScrollable(z);
    }

    @java.lang.Deprecated
    public int getItemCount() {
        return this.getHighSpeedVideoFpsRangesFor.getItemCount();
    }

    @java.lang.Deprecated
    public void setItemCount(int i) {
        this.getHighSpeedVideoFpsRangesFor.setItemCount(i);
    }

    @java.lang.Deprecated
    public int getCurrentItemIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentItemIndex();
    }

    @java.lang.Deprecated
    public void setCurrentItemIndex(int i) {
        this.getHighSpeedVideoFpsRangesFor.setCurrentItemIndex(i);
    }

    @java.lang.Deprecated
    public int getFromIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getFromIndex();
    }

    @java.lang.Deprecated
    public void setFromIndex(int i) {
        this.getHighSpeedVideoFpsRangesFor.setFromIndex(i);
    }

    @java.lang.Deprecated
    public int getToIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getToIndex();
    }

    @java.lang.Deprecated
    public void setToIndex(int i) {
        this.getHighSpeedVideoFpsRangesFor.setToIndex(i);
    }

    @java.lang.Deprecated
    public int getScrollX() {
        return this.getHighSpeedVideoFpsRangesFor.getScrollX();
    }

    @java.lang.Deprecated
    public void setScrollX(int i) {
        this.getHighSpeedVideoFpsRangesFor.setScrollX(i);
    }

    @java.lang.Deprecated
    public int getScrollY() {
        return this.getHighSpeedVideoFpsRangesFor.getScrollY();
    }

    @java.lang.Deprecated
    public void setScrollY(int i) {
        this.getHighSpeedVideoFpsRangesFor.setScrollY(i);
    }

    @java.lang.Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.getHighSpeedVideoFpsRangesFor);
    }

    @androidx.annotation.ReplaceWith(expression = "record.getMaxScrollX()")
    @java.lang.Deprecated
    public static int getMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @java.lang.Deprecated
    public void setMaxScrollX(int i) {
        setMaxScrollX(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @androidx.annotation.ReplaceWith(expression = "record.setMaxScrollX(maxScrollX)")
    @java.lang.Deprecated
    public static void setMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    @java.lang.Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.getHighSpeedVideoFpsRangesFor);
    }

    @androidx.annotation.ReplaceWith(expression = "record.getMaxScrollY()")
    @java.lang.Deprecated
    public static int getMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @java.lang.Deprecated
    public void setMaxScrollY(int i) {
        setMaxScrollY(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @androidx.annotation.ReplaceWith(expression = "record.setMaxScrollY(maxScrollY)")
    @java.lang.Deprecated
    public static void setMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @java.lang.Deprecated
    public int getAddedCount() {
        return this.getHighSpeedVideoFpsRangesFor.getAddedCount();
    }

    @java.lang.Deprecated
    public void setAddedCount(int i) {
        this.getHighSpeedVideoFpsRangesFor.setAddedCount(i);
    }

    @java.lang.Deprecated
    public int getRemovedCount() {
        return this.getHighSpeedVideoFpsRangesFor.getRemovedCount();
    }

    @java.lang.Deprecated
    public void setRemovedCount(int i) {
        this.getHighSpeedVideoFpsRangesFor.setRemovedCount(i);
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getClassName() {
        return this.getHighSpeedVideoFpsRangesFor.getClassName();
    }

    @java.lang.Deprecated
    public void setClassName(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setClassName(charSequence);
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.CharSequence> getText() {
        return this.getHighSpeedVideoFpsRangesFor.getText();
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getBeforeText() {
        return this.getHighSpeedVideoFpsRangesFor.getBeforeText();
    }

    @java.lang.Deprecated
    public void setBeforeText(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setBeforeText(charSequence);
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getContentDescription() {
        return this.getHighSpeedVideoFpsRangesFor.getContentDescription();
    }

    @java.lang.Deprecated
    public void setContentDescription(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setContentDescription(charSequence);
    }

    @java.lang.Deprecated
    public android.os.Parcelable getParcelableData() {
        return this.getHighSpeedVideoFpsRangesFor.getParcelableData();
    }

    @java.lang.Deprecated
    public void setParcelableData(android.os.Parcelable parcelable) {
        this.getHighSpeedVideoFpsRangesFor.setParcelableData(parcelable);
    }

    @java.lang.Deprecated
    public void recycle() {
        this.getHighSpeedVideoFpsRangesFor.recycle();
    }

    @java.lang.Deprecated
    public int hashCode() {
        android.view.accessibility.AccessibilityRecord accessibilityRecord = this.getHighSpeedVideoFpsRangesFor;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @java.lang.Deprecated
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.view.accessibility.AccessibilityRecordCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityRecordCompat accessibilityRecordCompat = (androidx.core.view.accessibility.AccessibilityRecordCompat) obj;
        android.view.accessibility.AccessibilityRecord accessibilityRecord = this.getHighSpeedVideoFpsRangesFor;
        if (accessibilityRecord == null) {
            return accessibilityRecordCompat.getHighSpeedVideoFpsRangesFor == null;
        }
        return accessibilityRecord.equals(accessibilityRecordCompat.getHighSpeedVideoFpsRangesFor);
    }
}
