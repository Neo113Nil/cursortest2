package androidx.compose.ui.platform;

import I0.C3173b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5279r0 implements V1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f41006a;

    public C5279r0(@NotNull Context context) {
        this.f41006a = context;
    }

    @Override // androidx.compose.ui.platform.V1
    public final void openUri(@NotNull String str) {
        try {
            this.f41006a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e11) {
            throw new IllegalArgumentException(C3173b.a('.', "Can't open ", str), e11);
        }
    }
}
