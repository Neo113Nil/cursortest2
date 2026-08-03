package androidx.compose.material;

/* compiled from: Menu.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/MenuDefaults;", "", "()V", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.layout.PaddingValues DropdownMenuItemContentPadding;
    public static final androidx.compose.material.MenuDefaults INSTANCE = new androidx.compose.material.MenuDefaults();

    private MenuDefaults() {
    }

    public final androidx.compose.foundation.layout.PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }

    static {
        float f;
        f = androidx.compose.material.MenuKt.DropdownMenuItemHorizontalPadding;
        DropdownMenuItemContentPadding = androidx.compose.foundation.layout.PaddingKt.m562PaddingValuesYgX7TsA(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(0));
    }
}
