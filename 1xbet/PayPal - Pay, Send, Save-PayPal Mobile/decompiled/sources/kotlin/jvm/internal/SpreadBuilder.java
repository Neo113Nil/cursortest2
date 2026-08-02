package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public class SpreadBuilder {
    private final java.util.ArrayList<java.lang.Object> getHighSpeedVideoFpsRanges;

    public SpreadBuilder(int i) {
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>(i);
    }

    public void addSpread(java.lang.Object obj) {
        if (obj != null) {
            if (obj instanceof java.lang.Object[]) {
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                if (objArr.length > 0) {
                    java.util.ArrayList<java.lang.Object> arrayList = this.getHighSpeedVideoFpsRanges;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    java.util.Collections.addAll(this.getHighSpeedVideoFpsRanges, objArr);
                    return;
                }
                return;
            }
            if (obj instanceof java.util.Collection) {
                this.getHighSpeedVideoFpsRanges.addAll((java.util.Collection) obj);
                return;
            }
            if (obj instanceof java.lang.Iterable) {
                java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                while (it.hasNext()) {
                    this.getHighSpeedVideoFpsRanges.add(it.next());
                }
                return;
            }
            if (obj instanceof java.util.Iterator) {
                java.util.Iterator it2 = (java.util.Iterator) obj;
                while (it2.hasNext()) {
                    this.getHighSpeedVideoFpsRanges.add(it2.next());
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }
        }
    }

    public int size() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    public void add(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges.add(obj);
    }

    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.getHighSpeedVideoFpsRanges.toArray(objArr);
    }
}
