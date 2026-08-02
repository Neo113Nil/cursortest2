package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.session.DefaultMediaNotificationProvider;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.media3.session.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0510i implements DefaultMediaNotificationProvider.NotificationIdProvider, Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0510i(int i) {
        this.a = i;
    }

    public static int a(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static Object b(long[] jArr, int i, Function1 function1) {
        return function1.invoke(ULong.m1884boximpl(ULongArray.m1950getsVKNKU(jArr, i)));
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.LocalConfiguration fromBundle;
        switch (this.a) {
            case 2:
                return ExoPlaybackException.a(bundle);
            default:
                fromBundle = MediaItem.LocalConfiguration.fromBundle(bundle);
                return fromBundle;
        }
    }

    @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
    public int getNotificationId(MediaSession mediaSession) {
        int lambda$new$0;
        lambda$new$0 = DefaultMediaNotificationProvider.lambda$new$0(mediaSession);
        return lambda$new$0;
    }
}
