package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class VGuideline extends androidx.constraintlayout.core.dsl.Guideline {
    public VGuideline(java.lang.String str) {
        super(str);
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_GUIDELINE));
    }

    public VGuideline(java.lang.String str, java.lang.String str2) {
        super(str);
        this.config = str2;
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }
}
