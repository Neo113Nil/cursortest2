package R1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface k {
    ByteBuffer C(int i7);

    void E(Surface surface);

    ByteBuffer I(int i7);

    void N(int i7, D1.c cVar, long j);

    void P(int i7, int i8, long j, int i9);

    void flush();

    MediaFormat k();

    void l(Bundle bundle);

    void n(int i7, long j);

    int o();

    void r(p156w2.g gVar, Handler handler);

    void release();

    int s(MediaCodec.BufferInfo bufferInfo);

    void w(int i7, boolean z4);

    void z(int i7);
}
