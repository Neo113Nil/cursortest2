package androidx.core.view.accessibility;

/* loaded from: classes3.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    public void addExtraDataToAccessibilityNodeInfo(int i, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, java.lang.String str, android.os.Bundle bundle) {
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return null;
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        return null;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int i) {
        return null;
    }

    public boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return false;
    }

    static class AccessibilityNodeProviderApi19 extends android.view.accessibility.AccessibilityNodeProvider {
        final androidx.core.view.accessibility.AccessibilityNodeProviderCompat getHighSpeedVideoFpsRangesFor;

        AccessibilityNodeProviderApi19(androidx.core.view.accessibility.AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.getHighSpeedVideoFpsRangesFor = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.getHighSpeedVideoFpsRangesFor.createAccessibilityNodeInfo(i);
            if (createAccessibilityNodeInfo == null) {
                return null;
            }
            return createAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String str, int i) {
            java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText = this.getHighSpeedVideoFpsRangesFor.findAccessibilityNodeInfosByText(str, i);
            if (findAccessibilityNodeInfosByText == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = findAccessibilityNodeInfosByText.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(findAccessibilityNodeInfosByText.get(i2).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, android.os.Bundle bundle) {
            return this.getHighSpeedVideoFpsRangesFor.performAction(i, i2, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus = this.getHighSpeedVideoFpsRangesFor.findFocus(i);
            if (findFocus == null) {
                return null;
            }
            return findFocus.unwrap();
        }
    }

    static class AccessibilityNodeProviderApi26 extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19 {
        AccessibilityNodeProviderApi26(androidx.core.view.accessibility.AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
            this.getHighSpeedVideoFpsRangesFor.addExtraDataToAccessibilityNodeInfo(i, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        this.getHighSpeedVideoFpsRanges = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi26(this);
    }

    public AccessibilityNodeProviderCompat(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
    }

    public java.lang.Object getProvider() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
