package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Helper {
    protected static final java.util.Map<androidx.constraintlayout.core.dsl.Constraint.Side, java.lang.String> sideMap;
    protected static final java.util.Map<androidx.constraintlayout.core.dsl.Helper.Type, java.lang.String> typeMap;
    protected java.lang.String config;
    protected java.util.Map<java.lang.String, java.lang.String> configMap;

    /* renamed from: name, reason: collision with root package name */
    protected final java.lang.String f2719name;
    protected androidx.constraintlayout.core.dsl.Helper.HelperType type;

    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        sideMap = hashMap;
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.LEFT, "'left'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.RIGHT, "'right'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.TOP, "'top'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.BOTTOM, "'bottom'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.START, "'start'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.END, "'end'");
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.Side.BASELINE, "'baseline'");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        typeMap = hashMap2;
        hashMap2.put(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_GUIDELINE, "vGuideline");
        hashMap2.put(androidx.constraintlayout.core.dsl.Helper.Type.HORIZONTAL_GUIDELINE, "hGuideline");
        hashMap2.put(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_CHAIN, "vChain");
        hashMap2.put(androidx.constraintlayout.core.dsl.Helper.Type.HORIZONTAL_CHAIN, "hChain");
        hashMap2.put(androidx.constraintlayout.core.dsl.Helper.Type.BARRIER, "barrier");
    }

    public Helper(java.lang.String str, androidx.constraintlayout.core.dsl.Helper.HelperType helperType) {
        this.type = null;
        this.configMap = new java.util.HashMap();
        this.f2719name = str;
        this.type = helperType;
    }

    public Helper(java.lang.String str, androidx.constraintlayout.core.dsl.Helper.HelperType helperType, java.lang.String str2) {
        this.type = null;
        this.configMap = new java.util.HashMap();
        this.f2719name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }

    public java.lang.String getId() {
        return this.f2719name;
    }

    public androidx.constraintlayout.core.dsl.Helper.HelperType getType() {
        return this.type;
    }

    public java.lang.String getConfig() {
        return this.config;
    }

    public java.util.Map<java.lang.String, java.lang.String> convertConfigToMap() {
        java.lang.String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = "";
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.config.length(); i3++) {
            char charAt = this.config.charAt(i3);
            if (charAt == ':') {
                str2 = sb.toString();
                sb.setLength(0);
            } else if (charAt == ',' && i == 0 && i2 == 0) {
                hashMap.put(str2, sb.toString());
                sb.setLength(0);
                str2 = "";
            } else if (charAt != ' ') {
                if (charAt == '[') {
                    i++;
                } else if (charAt == ']') {
                    i--;
                } else if (charAt == '{') {
                    i2++;
                } else if (charAt == '}') {
                    i2--;
                }
                sb.append(charAt);
            }
        }
        hashMap.put(str2, sb.toString());
        return hashMap;
    }

    public void append(java.util.Map<java.lang.String, java.lang.String> map, java.lang.StringBuilder sb) {
        if (map.isEmpty()) {
            return;
        }
        for (java.lang.String str : map.keySet()) {
            sb.append(str);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(map.get(str));
            sb.append(",\n");
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f2719name);
        sb.append(":{\n");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        if (this.type != null) {
            sb2.append("type:'");
            sb2.append(this.type.toString());
            sb2.append("',\n");
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.configMap;
        if (map != null) {
            append(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public static void main(java.lang.String[] strArr) {
        java.lang.System.out.println(new androidx.constraintlayout.core.dsl.Barrier("abc", "['a1', 'b2']").toString());
    }

    public static final class HelperType {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        public HelperType(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
