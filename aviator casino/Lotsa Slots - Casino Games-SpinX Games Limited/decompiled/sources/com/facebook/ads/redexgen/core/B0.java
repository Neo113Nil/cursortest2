package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public interface B0 {
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No longer in upstream exo")
    void A58(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i, java.lang.Object obj);

    int A5s();

    int A5u(android.media.MediaCodec.BufferInfo bufferInfo);

    java.nio.ByteBuffer A8J(int i);

    java.nio.ByteBuffer A8e(int i);

    android.media.MediaFormat A8f();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D39791066")
    android.util.Pair<java.lang.Long, java.lang.Integer> A8j();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D39791066")
    int A9K();

    void AHI(int i, int i2, int i3, long j, int i4);

    void AHK(int i, int i2, com.facebook.ads.redexgen.core.C04735z c04735z, long j, int i3);

    void AHb();

    void AHh(int i, long j);

    void AHi(int i, boolean z);

    void AJa(com.facebook.ads.redexgen.core.InterfaceC0587Az interfaceC0587Az, android.os.Handler handler);

    void AJb(android.view.Surface surface);

    void AJs(int i);

    void flush();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No longer in upstream exo")
    @java.lang.Deprecated
    void reset();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No longer in upstream exo")
    @java.lang.Deprecated
    void stop();
}
