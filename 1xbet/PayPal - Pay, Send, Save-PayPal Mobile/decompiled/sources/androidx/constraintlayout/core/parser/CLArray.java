package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLArray extends androidx.constraintlayout.core.parser.CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDebugName());
        sb.append("[");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        boolean z = true;
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.getHighSpeedVideoFpsRangesFor.get(i).toJSON());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append((java.lang.Object) sb2);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String json = toJSON();
        if (i2 <= 0 && json.length() + i < sMaxLine) {
            sb.append(json);
        } else {
            sb.append("[\n");
            java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            boolean z = true;
            while (it.hasNext()) {
                androidx.constraintlayout.core.parser.CLElement next = it.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, sBaseIndent + i);
                sb.append(next.toFormattedJSON(sBaseIndent + i, i2 - 1));
            }
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            addIndent(sb, i);
            sb.append("]");
        }
        return sb.toString();
    }
}
