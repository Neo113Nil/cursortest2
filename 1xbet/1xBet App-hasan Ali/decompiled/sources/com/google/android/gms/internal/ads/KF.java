package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface KF {
    ByteBuffer B(int i);

    int a();

    ByteBuffer b(int i);

    void c(int i, C1645uD c1645uD, long j5);

    void d(int i, long j5);

    void e();

    void f(int i, int i5, int i6, long j5);

    void g(int i);

    void h();

    MediaFormat i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void l();

    void m(int i);

    void n(Surface surface);

    boolean o(Qs qs);

    void p(Bundle bundle);
}
