package Bi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d extends AbstractC6755a<Object, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f3808a = new d();

    @Override // h.AbstractC6755a
    @NotNull
    public final Intent a(@NotNull Context context, @NotNull Object input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.media.action.STILL_IMAGE_CAMERA").putExtra("output", (Uri) input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final Boolean c(int i11, Intent intent) {
        return Boolean.valueOf(i11 == -1);
    }
}
