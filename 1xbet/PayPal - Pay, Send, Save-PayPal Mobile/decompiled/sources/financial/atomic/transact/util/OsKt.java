package financial.atomic.transact.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "", "isNightModeActive", "(Landroid/content/Context;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OsKt {
    public static final boolean isNightModeActive(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return android.os.Build.VERSION.SDK_INT >= 30 ? context.getResources().getConfiguration().isNightModeActive() : (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
