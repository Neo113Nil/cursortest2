package Ki;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {
    public static final void a(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", rVar.getPackageName(), null));
        intent.addFlags(268435456);
        rVar.startActivity(intent);
    }
}
