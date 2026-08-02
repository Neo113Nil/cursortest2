package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextToolbarHelperApi28;", "", "<init>", "()V", "Landroid/view/Menu;", "p0", "", "p1", "Landroid/content/Context;", "p2", "Landroid/view/textclassifier/TextClassification;", "p3", "p4", "", "getHighSpeedVideoSizes", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;I)V", "", "Landroid/app/RemoteAction;", "(Landroid/view/Menu;ILandroid/content/Context;ZLandroid/app/RemoteAction;)V", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextToolbarHelperApi28 {
    public static final androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28 INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28();

    private TextToolbarHelperApi28() {
    }

    public final void getHighSpeedVideoSizes(android.view.Menu p0, int p1, android.content.Context p2, android.view.textclassifier.TextClassification p3, int p4) {
        if (p4 < 0) {
            getHighSpeedVideoSizes(p0, p1, p2, p3);
        } else {
            getHighSpeedVideoSizes(p0, p1, p2, p4 == 0, p3.getActions().get(p4));
        }
    }

    public final void getHighSpeedVideoSizes(android.view.Menu p0, int p1, android.content.Context p2, boolean p3, final android.app.RemoteAction p4) {
        android.view.MenuItem add = p0.add(android.R.id.textAssist, p3 ? 16908353 : 0, p1, p4.getTitle());
        add.setShowAsAction(p3 ? 2 : 0);
        if (p3 || p4.shouldShowIcon()) {
            add.setIcon(p4.getIcon().loadDrawable(p2));
        }
        add.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28.Camera2StreamConfigurationMap(p4, menuItem);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(android.app.RemoteAction remoteAction, android.view.MenuItem menuItem) {
        androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return true;
    }

    public final void getHighSpeedVideoSizes(android.view.Menu p0, int p1, final android.content.Context p2, final android.view.textclassifier.TextClassification p3) {
        android.view.MenuItem add = p0.add(android.R.id.textAssist, android.R.id.textAssist, p1, p3.getLabel());
        add.setShowAsAction(2);
        add.setIcon(p3.getIcon());
        add.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28.getHighSpeedVideoSizes(p2, p3, menuItem);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(android.content.Context context, android.view.textclassifier.TextClassification textClassification, android.view.MenuItem menuItem) {
        androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return true;
    }
}
