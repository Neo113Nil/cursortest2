package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLObject extends androidx.constraintlayout.core.parser.CLContainer implements java.lang.Iterable<androidx.constraintlayout.core.parser.CLKey> {
    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLObject allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLObject(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toJSON() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDebugName());
        sb.append("{ ");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        boolean z = true;
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public java.lang.String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName());
        sb.append("{\n");
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        boolean z = true;
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(next.toFormattedJSON(sBaseIndent + i, i2 - 1));
        }
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        addIndent(sb, i);
        sb.append("}");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.constraintlayout.core.parser.CLKey> iterator() {
        return new androidx.constraintlayout.core.parser.CLObject.CLObjectIterator(this);
    }

    /* loaded from: classes6.dex */
    static class CLObjectIterator implements java.util.Iterator<androidx.constraintlayout.core.parser.CLKey> {
        androidx.constraintlayout.core.parser.CLObject Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor = 0;

        CLObjectIterator(androidx.constraintlayout.core.parser.CLObject cLObject) {
            this.Camera2StreamConfigurationMap = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor < this.Camera2StreamConfigurationMap.size();
        }

        @Override // java.util.Iterator
        public /* synthetic */ androidx.constraintlayout.core.parser.CLKey next() {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRangesFor++;
            return cLKey;
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone */
    public androidx.constraintlayout.core.parser.CLObject mo9053clone() {
        return (androidx.constraintlayout.core.parser.CLObject) super.mo9053clone();
    }
}
