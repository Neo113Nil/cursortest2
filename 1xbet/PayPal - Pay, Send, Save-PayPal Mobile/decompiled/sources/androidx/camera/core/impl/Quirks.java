package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class Quirks {
    private final java.util.List<androidx.camera.core.impl.Quirk> getHighSpeedVideoFpsRangesFor;

    public Quirks(java.util.List<androidx.camera.core.impl.Quirk> list) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list);
    }

    public <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public <T extends androidx.camera.core.impl.Quirk> java.util.List<T> getAll(java.lang.Class<T> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.Quirk quirk : this.getHighSpeedVideoFpsRangesFor) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }

    public boolean contains(java.lang.Class<? extends androidx.camera.core.impl.Quirk> cls) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public void addQuirkForTesting(androidx.camera.core.impl.Quirk quirk) {
        this.getHighSpeedVideoFpsRangesFor.add(quirk);
    }

    public static java.lang.String toString(androidx.camera.core.impl.Quirks quirks) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = quirks.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return java.lang.String.join(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR, arrayList);
    }
}
