package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Landroidx/credentials/internal/FormFactorHelper;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "isTV", "(Landroid/content/Context;)Z", "isWear", "isAuto"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FormFactorHelper {
    public static final androidx.view.internal.FormFactorHelper INSTANCE = new androidx.view.internal.FormFactorHelper();

    private FormFactorHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isTV(android.content.Context ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return ctx.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isWear(android.content.Context ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAuto(android.content.Context ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }
}
