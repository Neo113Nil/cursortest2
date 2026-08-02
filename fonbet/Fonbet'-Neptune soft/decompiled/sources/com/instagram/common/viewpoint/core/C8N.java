package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public interface C8N {
    void A51(C1830or c1830or, int i, int[] iArr) throws C8G;

    void A5r();

    void A6E();

    void A6L();

    long A7X(boolean z);

    C1814ob A8e();

    boolean A9W(ByteBuffer byteBuffer, long j, int i) throws C8H, C8M;

    void A9Z();

    boolean A9g();

    boolean AAG();

    void AGG();

    void AGI() throws C8M;

    void AIW(C1836oy c1836oy);

    void AIX(int i);

    void AIY(C1P c1p);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIg(boolean z);

    void AIl(C8J c8j);

    void AIt(C1814ob c1814ob);

    void AIw(C02327m c02327m);

    void AIy(AudioDeviceInfo audioDeviceInfo);

    void AJ4(boolean z);

    boolean AJc(C1830or c1830or);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJe(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
