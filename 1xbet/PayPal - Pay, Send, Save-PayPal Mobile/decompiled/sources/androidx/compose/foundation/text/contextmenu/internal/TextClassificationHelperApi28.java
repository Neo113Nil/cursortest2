package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextClassificationHelperApi28;", "", "<init>", "()V", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "", "sendPendingIntent", "(Landroid/app/PendingIntent;)V", "Landroid/content/Context;", "context", "Landroid/view/textclassifier/TextClassification;", "textClassification", "sendLegacyIntent", "(Landroid/content/Context;Landroid/view/textclassifier/TextClassification;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextClassificationHelperApi28 {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28 INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28();

    private TextClassificationHelperApi28() {
    }

    public final void sendPendingIntent(android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelper34 textClassificationHelper34 = androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelper34.INSTANCE;
            androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelper34.getHighSpeedVideoSizes(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }

    public final void sendLegacyIntent(android.content.Context context, android.view.textclassifier.TextClassification textClassification) {
        java.lang.String text = textClassification.getText();
        sendPendingIntent(android.app.PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }
}
