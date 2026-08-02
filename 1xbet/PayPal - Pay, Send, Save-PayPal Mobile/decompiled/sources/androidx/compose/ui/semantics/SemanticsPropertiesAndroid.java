package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "TestTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "AccessibilityClassName", "getAccessibilityClassName"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsPropertiesAndroid {
    public static final androidx.compose.ui.semantics.SemanticsPropertiesAndroid INSTANCE = new androidx.compose.ui.semantics.SemanticsPropertiesAndroid();
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> TestTagsAsResourceId = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("TestTagsAsResourceId", false, new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final java.lang.Boolean Camera2StreamConfigurationMap(java.lang.Boolean bool, boolean z) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return Camera2StreamConfigurationMap(bool, bool2.booleanValue());
        }
    }, null, 8, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> AccessibilityClassName = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("AccessibilityClassName", true, new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$AccessibilityClassName$1
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(java.lang.String str, java.lang.String str2) {
            return str;
        }
    }, null, 8, null);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getAccessibilityClassName() {
        return AccessibilityClassName;
    }
}
