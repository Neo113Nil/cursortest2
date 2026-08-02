package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material/MenuDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        f = androidx.compose.material.MenuKt.getHighSpeedVideoFpsRanges;
        DropdownMenuItemContentPadding = androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
    }
}
