package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1987ms extends com.facebook.ads.redexgen.core.InterfaceC03762c {
    void A47(int i) throws java.io.IOException;

    boolean A48(int i, boolean z) throws java.io.IOException;

    long A8O();

    long A8i();

    long A8n();

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added API for MP4 extractor")
    android.net.Uri A9P();

    int AGs(byte[] bArr, int i, int i2) throws java.io.IOException;

    void AGt(byte[] bArr, int i, int i2) throws java.io.IOException;

    boolean AGu(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException;

    boolean AHR(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException;

    void AIl();

    int AK0(int i) throws java.io.IOException;

    void AK3(int i) throws java.io.IOException;

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    int read(byte[] bArr, int i, int i2) throws java.io.IOException;

    void readFully(byte[] bArr, int i, int i2) throws java.io.IOException;
}
