package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841cF extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0802bc f12984a;

    public /* synthetic */ C0841cF(C0802bc c0802bc) {
        this.f12984a = c0802bc;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0802bc c0802bc = this.f12984a;
        c0802bc.i(C0797bF.b((Context) c0802bc.f12821k, (Mm) c0802bc.f12829s, (Dp) c0802bc.f12828r));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0802bc c0802bc = this.f12984a;
        Dp dp = (Dp) c0802bc.f12828r;
        int i = AbstractC1260lo.f14419a;
        int length = audioDeviceInfoArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i5], dp)) {
                c0802bc.f12828r = null;
                break;
            }
            i5++;
        }
        c0802bc.i(C0797bF.b((Context) c0802bc.f12821k, (Mm) c0802bc.f12829s, (Dp) c0802bc.f12828r));
    }
}
