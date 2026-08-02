package androidx.constraintlayout.core.parser;

/* loaded from: classes6.dex */
public class CLKey extends androidx.constraintlayout.core.parser.CLContainer {
    private static java.util.ArrayList<java.lang.String> Camera2StreamConfigurationMap;

    static {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        Camera2StreamConfigurationMap = arrayList;
        arrayList.add("ConstraintSets");
        Camera2StreamConfigurationMap.add("Variables");
        Camera2StreamConfigurationMap.add("Generate");
        Camera2StreamConfigurationMap.add(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.NAME);
        Camera2StreamConfigurationMap.add("KeyFrames");
        Camera2StreamConfigurationMap.add(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.NAME);
        Camera2StreamConfigurationMap.add("KeyPositions");
        Camera2StreamConfigurationMap.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLKey(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        androidx.constraintlayout.core.parser.CLKey cLKey = new androidx.constraintlayout.core.parser.CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }

    public java.lang.String getName() {
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getDebugName());
            sb.append(content());
            sb.append(": ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.get(0).toJSON());
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(getDebugName());
        sb2.append(content());
        sb2.append(": <> ");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getDebugName());
        addIndent(sb, i);
        java.lang.String content = content();
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            sb.append(content);
            sb.append(": ");
            if (Camera2StreamConfigurationMap.contains(content)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.getHighSpeedVideoFpsRangesFor.get(0).toFormattedJSON(i, i2 - 1));
            } else {
                java.lang.String json = this.getHighSpeedVideoFpsRangesFor.get(0).toJSON();
                if (json.length() + i < sMaxLine) {
                    sb.append(json);
                } else {
                    sb.append(this.getHighSpeedVideoFpsRangesFor.get(0).toFormattedJSON(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(content);
        sb2.append(": <> ");
        return sb2.toString();
    }

    public void set(androidx.constraintlayout.core.parser.CLElement cLElement) {
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            this.getHighSpeedVideoFpsRangesFor.set(0, cLElement);
        } else {
            this.getHighSpeedVideoFpsRangesFor.add(cLElement);
        }
    }

    public androidx.constraintlayout.core.parser.CLElement getValue() {
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            return this.getHighSpeedVideoFpsRangesFor.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.constraintlayout.core.parser.CLKey) || java.util.Objects.equals(getName(), ((androidx.constraintlayout.core.parser.CLKey) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }
}
