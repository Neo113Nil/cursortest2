package p043f5;

import U5.C0436c;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0436c f12994a;

    public d(C0436c c0436c) {
        this.f12994a = c0436c;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(f.b(audioDeviceInfo));
        }
        this.f12994a.e("onAudioDevicesAdded", arrayList);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(f.b(audioDeviceInfo));
        }
        this.f12994a.e("onAudioDevicesRemoved", arrayList);
    }
}
