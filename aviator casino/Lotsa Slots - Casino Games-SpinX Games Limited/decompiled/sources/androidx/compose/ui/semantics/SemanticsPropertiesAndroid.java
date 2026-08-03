package androidx.compose.ui.semantics;

/* compiled from: SemanticsProperties.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "()V", "TestTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "getTestTagsAsResourceId$annotations", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesAndroid {
    public static final androidx.compose.ui.semantics.SemanticsPropertiesAndroid INSTANCE = new androidx.compose.ui.semantics.SemanticsPropertiesAndroid();
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> TestTagsAsResourceId = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("TestTagsAsResourceId", false, new kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final java.lang.Boolean invoke(java.lang.Boolean bool, boolean z) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    });
    public static final int $stable = 8;

    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }

    private SemanticsPropertiesAndroid() {
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
