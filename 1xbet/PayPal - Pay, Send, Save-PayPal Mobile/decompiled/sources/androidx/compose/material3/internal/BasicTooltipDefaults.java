package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex;", "GlobalMutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "getGlobalMutatorMutex", "()Landroidx/compose/foundation/MutatorMutex;", "", "TooltipDuration", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltipDefaults {
    public static final int $stable = 0;
    public static final long TooltipDuration = 1500;
    public static final androidx.compose.material3.internal.BasicTooltipDefaults INSTANCE = new androidx.compose.material3.internal.BasicTooltipDefaults();
    private static final androidx.compose.foundation.MutatorMutex GlobalMutatorMutex = new androidx.compose.foundation.MutatorMutex();

    private BasicTooltipDefaults() {
    }

    public final androidx.compose.foundation.MutatorMutex getGlobalMutatorMutex() {
        return GlobalMutatorMutex;
    }
}
