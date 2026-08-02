package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "", "isFocusable", "shouldDismissOnBackPress", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)Landroidx/compose/material3/ModalBottomSheetProperties;", "Landroidx/compose/material3/ModalBottomSheetProperties;", "getProperties", "()Landroidx/compose/material3/ModalBottomSheetProperties;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.ModalBottomSheetDefaults INSTANCE = new androidx.compose.material3.ModalBottomSheetDefaults();
    private static final androidx.compose.material3.ModalBottomSheetProperties properties = new androidx.compose.material3.ModalBottomSheetProperties();

    private ModalBottomSheetDefaults() {
    }

    public final androidx.compose.material3.ModalBottomSheetProperties getProperties() {
        return properties;
    }

    public static /* synthetic */ androidx.compose.material3.ModalBottomSheetProperties properties$default(androidx.compose.material3.ModalBottomSheetDefaults modalBottomSheetDefaults, androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureFlagPolicy = androidx.compose.ui.window.SecureFlagPolicy.Inherit;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return modalBottomSheetDefaults.properties(secureFlagPolicy, z, z2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "'isFocusable' param is no longer used. Use value without this parameter.", replaceWith = @kotlin.ReplaceWith(expression = "properties", imports = {}))
    public final androidx.compose.material3.ModalBottomSheetProperties properties(androidx.compose.ui.window.SecureFlagPolicy securePolicy, boolean isFocusable, boolean shouldDismissOnBackPress) {
        return new androidx.compose.material3.ModalBottomSheetProperties(securePolicy, shouldDismissOnBackPress, false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
