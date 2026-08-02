package androidx.media3.session;

import androidx.media3.common.util.Consumer;
import androidx.media3.session.DefaultMediaNotificationProvider;

/* loaded from: classes3.dex */
public final /* synthetic */ class K4 implements Consumer, DefaultMediaNotificationProvider.NotificationIdProvider {
    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((PlayerWrapper) obj).seekToNextMediaItem();
    }

    @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
    public int getNotificationId(MediaSession mediaSession) {
        int lambda$new$0;
        lambda$new$0 = DefaultMediaNotificationProvider.Builder.lambda$new$0(mediaSession);
        return lambda$new$0;
    }
}
