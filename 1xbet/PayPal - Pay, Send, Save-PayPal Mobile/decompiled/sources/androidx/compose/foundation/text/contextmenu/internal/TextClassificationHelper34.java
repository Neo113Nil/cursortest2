package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextClassificationHelper34;", "", "<init>", "()V", "Landroid/app/PendingIntent;", "p0", "", "getHighSpeedVideoSizes", "(Landroid/app/PendingIntent;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextClassificationHelper34 {
    public static final androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelper34 INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelper34();

    private TextClassificationHelper34() {
    }

    public static void getHighSpeedVideoSizes(android.app.PendingIntent p0) {
        try {
            p0.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (android.app.PendingIntent.CanceledException unused) {
        }
    }
}
