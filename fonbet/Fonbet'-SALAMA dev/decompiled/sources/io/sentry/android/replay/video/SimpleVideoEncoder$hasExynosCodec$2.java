package io.sentry.android.replay.video;

import C6.o;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import s6.a;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class SimpleVideoEncoder$hasExynosCodec$2 extends i implements a {
    public static final SimpleVideoEncoder$hasExynosCodec$2 INSTANCE = new SimpleVideoEncoder$hasExynosCodec$2();

    public SimpleVideoEncoder$hasExynosCodec$2() {
        super(0);
    }

    @Override // s6.a
    public final Boolean invoke() {
        boolean z4 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        h.d(codecInfos, "MediaCodecList(MediaCode…EGULAR_CODECS).codecInfos");
        int length = codecInfos.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            String name = codecInfos[i7].getName();
            h.d(name, "it.name");
            if (o.p0(name, "c2.exynos", false)) {
                z4 = true;
                break;
            }
            i7++;
        }
        return Boolean.valueOf(z4);
    }
}
