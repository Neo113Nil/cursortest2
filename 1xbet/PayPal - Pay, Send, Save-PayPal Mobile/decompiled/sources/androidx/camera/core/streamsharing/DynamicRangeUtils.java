package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class DynamicRangeUtils {
    private DynamicRangeUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.camera.core.DynamicRange resolveDynamicRange(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getDynamicRange());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) arrayList.get(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dynamicRange.getEncoding());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(dynamicRange.getBitDepth());
        for (int i = 1; i < arrayList.size(); i++) {
            androidx.camera.core.DynamicRange dynamicRange2 = (androidx.camera.core.DynamicRange) arrayList.get(i);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(dynamicRange2.getEncoding());
            if (!valueOf.equals(0)) {
                if (!valueOf3.equals(0)) {
                    if (!valueOf.equals(2) || valueOf3.equals(1)) {
                        if ((!valueOf3.equals(2) || valueOf.equals(1)) && !valueOf.equals(valueOf3)) {
                            valueOf = null;
                        }
                    }
                }
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(dynamicRange2.getBitDepth());
                if (!valueOf2.equals(0)) {
                    valueOf2 = valueOf4;
                } else if (!valueOf4.equals(0) && !valueOf2.equals(valueOf4)) {
                    valueOf2 = null;
                }
                if (valueOf != null || valueOf2 == null) {
                    return null;
                }
            }
            valueOf = valueOf3;
            java.lang.Integer valueOf42 = java.lang.Integer.valueOf(dynamicRange2.getBitDepth());
            if (!valueOf2.equals(0)) {
            }
            if (valueOf != null) {
            }
            return null;
        }
        return new androidx.camera.core.DynamicRange(valueOf.intValue(), valueOf2.intValue());
    }
}
