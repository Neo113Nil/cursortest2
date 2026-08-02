package androidx.compose.ui.platform;

import K1.C3422b;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5255j implements I0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClipboardManager f40894a;

    public C5255j(@NotNull Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f40894a = (ClipboardManager) systemService;
    }

    @Override // androidx.compose.ui.platform.I0
    public final G0 a() {
        ClipData primaryClip = this.f40894a.getPrimaryClip();
        if (primaryClip != null) {
            return new G0(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.I0
    public final boolean b() {
        ClipDescription primaryClipDescription = this.f40894a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.I0
    public final void c(@NotNull C3422b c3422b) {
        this.f40894a.setPrimaryClip(ClipData.newPlainText("plain text", C5258k.b(c3422b)));
    }

    @Override // androidx.compose.ui.platform.I0
    public final C3422b getText() {
        ClipData primaryClip = this.f40894a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return C5258k.a(itemAt != null ? itemAt.getText() : null);
    }
}
