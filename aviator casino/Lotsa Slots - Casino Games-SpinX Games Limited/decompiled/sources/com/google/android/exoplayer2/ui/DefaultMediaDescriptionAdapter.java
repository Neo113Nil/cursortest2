package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public final class DefaultMediaDescriptionAdapter implements com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter {
    private final android.app.PendingIntent pendingIntent;

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public /* synthetic */ java.lang.CharSequence getCurrentSubText(com.google.android.exoplayer2.Player player) {
        return com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter.CC.$default$getCurrentSubText(this, player);
    }

    public DefaultMediaDescriptionAdapter(android.app.PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public java.lang.CharSequence getCurrentContentTitle(com.google.android.exoplayer2.Player player) {
        java.lang.CharSequence charSequence = player.getMediaMetadata().displayTitle;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = player.getMediaMetadata().title;
        return charSequence2 != null ? charSequence2 : "";
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public android.app.PendingIntent createCurrentContentIntent(com.google.android.exoplayer2.Player player) {
        return this.pendingIntent;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public java.lang.CharSequence getCurrentContentText(com.google.android.exoplayer2.Player player) {
        java.lang.CharSequence charSequence = player.getMediaMetadata().artist;
        return !android.text.TextUtils.isEmpty(charSequence) ? charSequence : player.getMediaMetadata().albumArtist;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public android.graphics.Bitmap getCurrentLargeIcon(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback bitmapCallback) {
        byte[] bArr = player.getMediaMetadata().artworkData;
        if (bArr == null) {
            return null;
        }
        return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
