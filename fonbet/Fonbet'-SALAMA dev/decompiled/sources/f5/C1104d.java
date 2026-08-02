package f5;

import U5.C0436c;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;

/* renamed from: f5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1104d extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0436c f12988a;

    public C1104d(C0436c c0436c) {
        this.f12988a = c0436c;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(C1106f.b(audioDeviceInfo));
        }
        this.f12988a.e("onAudioDevicesAdded", arrayList);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(C1106f.b(audioDeviceInfo));
        }
        this.f12988a.e("onAudioDevicesRemoved", arrayList);
    }
}
