package com.inmobi.media;

import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3815j8 implements Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7176a;

    public C3815j8(C4043r8 c4043r8) {
        this.f7176a = c4043r8;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        super.onIsLoadingChanged(z);
        if (z) {
            this.f7176a.m.setVisibility(0);
        } else {
            this.f7176a.m.setVisibility(8);
        }
        if (this.f7176a.n.getPlaybackState() == 3 && this.f7176a.n.getBufferedPercentage() == 100) {
            this.f7176a.a(A8.f6451a);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        super.onPlaybackStateChanged(i);
        if (i == 4) {
            Y9 y9 = this.f7176a.b;
            if (y9 != null) {
                ((Z9) y9).b("HtmlMediaPlayer", "Playback ended");
            }
            V6 v6 = this.f7176a.x;
            if (v6.g != 2) {
                v6.g = 2;
                BuildersKt__Builders_commonKt.launch$default(v6.b, Dispatchers.getMain().getImmediate(), null, new R6(v6, v6.f6908a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Y9 y9 = this.f7176a.b;
        if (y9 != null) {
            ((Z9) y9).a("HtmlMediaPlayer", "Playback error: " + error.getErrorCodeName(), error);
        }
        this.f7176a.j.set(Kh.g);
        C4043r8 c4043r8 = this.f7176a;
        int i = error.errorCode;
        String errorCodeName = error.getErrorCodeName();
        Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
        c4043r8.a(new O8(errorCodeName));
        this.f7176a.g();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Tracks.Group group;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        Iterator<Tracks.Group> it = groups.iterator();
        while (true) {
            if (it.hasNext()) {
                group = it.next();
                if (group.getType() == 2) {
                    break;
                }
            } else {
                group = null;
                break;
            }
        }
        Tracks.Group group2 = group;
        if (group2 != null) {
            C4043r8 c4043r8 = this.f7176a;
            int i = group2.getMediaTrackGroup().length;
            for (int i2 = 0; i2 < i; i2++) {
                Format format = group2.getMediaTrackGroup().getFormat(i2);
                Intrinsics.checkNotNullExpressionValue(format, "getFormat(...)");
                Y9 y9 = c4043r8.b;
                if (y9 != null) {
                    Z9 z9 = (Z9) y9;
                    z9.b("HtmlMediaPlayer", "Metadata loaded: " + format.width + "x" + format.height + ", " + format.sampleMimeType);
                }
                c4043r8.a(N8.f6737a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        Y9 y9 = this.f7176a.b;
        if (y9 != null) {
            Z9 z9 = (Z9) y9;
            z9.b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        C4043r8 c4043r8 = this.f7176a;
        int i = videoSize.width;
        c4043r8.getClass();
        this.f7176a.getClass();
        this.f7176a.z.d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
        super.onVolumeChanged(f);
        if (f == 0.0f || f == 1.0f) {
            return;
        }
        C4043r8 c4043r8 = this.f7176a;
        boolean z = c4043r8.y.e;
        c4043r8.a(new C3833jq());
    }
}
