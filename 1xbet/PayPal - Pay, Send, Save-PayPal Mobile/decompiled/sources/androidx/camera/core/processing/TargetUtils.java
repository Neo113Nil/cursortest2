package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class TargetUtils {
    public static int getNumberOfTargets(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>= 1;
        }
        return i2;
    }

    public static boolean isSuperset(int i, int i2) {
        return (i & i2) == i2;
    }

    private TargetUtils() {
    }

    public static void checkSupportedTargets(java.util.Collection<java.lang.Integer> collection, int i) {
        boolean contains = collection.contains(java.lang.Integer.valueOf(i));
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String humanReadableName = getHumanReadableName(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(java.lang.String.join(", ", arrayList));
        sb.append("]");
        androidx.core.util.Preconditions.checkArgument(contains, java.lang.String.format(locale, "Effects target %s is not in the supported list %s.", humanReadableName, sb.toString()));
    }

    public static java.lang.String getHumanReadableName(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return java.lang.String.join(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, arrayList);
    }
}
