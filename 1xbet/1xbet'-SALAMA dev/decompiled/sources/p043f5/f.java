package p043f5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import U5.C0436c;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import io.sentry.SentryLockReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0436c f12997b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f12998a;

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(coordinate3F.x));
        arrayList.add(Double.valueOf(coordinate3F.y));
        arrayList.add(Double.valueOf(coordinate3F.z));
        return arrayList;
    }

    public static HashMap b(AudioDeviceInfo audioDeviceInfo) {
        return d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), SentryLockReason.JsonKeys.ADDRESS, Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    public static HashMap d(Object... objArr) {
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            map.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return map;
    }

    public static void e(int i7) {
        if (Build.VERSION.SDK_INT < i7) {
            throw new RuntimeException(k.d(i7, "Requires API level "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x020e  */
    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        try {
            List list = (List) oVar.f677b;
            boolean communicationDevice = false;
            switch (oVar.f676a) {
                case "requestAudioFocus":
                    ((p) rVar).success(Boolean.valueOf(f12997b.f(list)));
                    break;
                case "abandonAudioFocus":
                    ((p) rVar).success(Boolean.valueOf(f12997b.a()));
                    break;
                case "dispatchMediaKeyEvent":
                    f12997b.b((Map) list.get(0));
                    ((p) rVar).success(null);
                    break;
                case "isVolumeFixed":
                    C0436c c0436c = f12997b;
                    c0436c.getClass();
                    e(21);
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) c0436c.f6467g).isVolumeFixed()));
                    break;
                case "adjustStreamVolume":
                    ((AudioManager) f12997b.f6467g).adjustStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "adjustVolume":
                    ((AudioManager) f12997b.f6467g).adjustVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "adjustSuggestedStreamVolume":
                    ((AudioManager) f12997b.f6467g).adjustSuggestedStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "getRingerMode":
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12997b.f6467g).getRingerMode()));
                    break;
                case "getStreamMaxVolume":
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12997b.f6467g).getStreamMaxVolume(((Integer) list.get(0)).intValue())));
                    break;
                case "getStreamMinVolume":
                    C0436c c0436c2 = f12997b;
                    int iIntValue = ((Integer) list.get(0)).intValue();
                    c0436c2.getClass();
                    e(28);
                    ((p) rVar).success(Integer.valueOf(((AudioManager) c0436c2.f6467g).getStreamMinVolume(iIntValue)));
                    break;
                case "getStreamVolume":
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12997b.f6467g).getStreamVolume(((Integer) list.get(0)).intValue())));
                    break;
                case "getStreamVolumeDb":
                    C0436c c0436c3 = f12997b;
                    int iIntValue2 = ((Integer) list.get(0)).intValue();
                    int iIntValue3 = ((Integer) list.get(1)).intValue();
                    int iIntValue4 = ((Integer) list.get(2)).intValue();
                    c0436c3.getClass();
                    e(28);
                    ((p) rVar).success(Float.valueOf(((AudioManager) c0436c3.f6467g).getStreamVolumeDb(iIntValue2, iIntValue3, iIntValue4)));
                    break;
                case "setRingerMode":
                    ((AudioManager) f12997b.f6467g).setRingerMode(((Integer) list.get(0)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "setStreamVolume":
                    ((AudioManager) f12997b.f6467g).setStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "isStreamMute":
                    C0436c c0436c4 = f12997b;
                    int iIntValue5 = ((Integer) list.get(0)).intValue();
                    c0436c4.getClass();
                    e(23);
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) c0436c4.f6467g).isStreamMute(iIntValue5)));
                    break;
                case "getAvailableCommunicationDevices":
                    C0436c c0436c5 = f12997b;
                    c0436c5.getClass();
                    e(31);
                    c0436c5.f6461a = ((AudioManager) c0436c5.f6467g).getAvailableCommunicationDevices();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c0436c5.f6461a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b((AudioDeviceInfo) it.next()));
                    }
                    ((p) rVar).success(arrayList);
                    break;
                case "setCommunicationDevice":
                    C0436c c0436c6 = f12997b;
                    Integer num = (Integer) list.get(0);
                    c0436c6.getClass();
                    e(31);
                    for (AudioDeviceInfo audioDeviceInfo : c0436c6.f6461a) {
                        if (audioDeviceInfo.getId() == num.intValue()) {
                            communicationDevice = ((AudioManager) c0436c6.f6467g).setCommunicationDevice(audioDeviceInfo);
                            ((p) rVar).success(Boolean.valueOf(communicationDevice));
                            break;
                        }
                    }
                    ((p) rVar).success(Boolean.valueOf(communicationDevice));
                    break;
                case "getCommunicationDevice":
                    C0436c c0436c7 = f12997b;
                    c0436c7.getClass();
                    e(31);
                    ((p) rVar).success(b(((AudioManager) c0436c7.f6467g).getCommunicationDevice()));
                    break;
                case "clearCommunicationDevice":
                    C0436c c0436c8 = f12997b;
                    c0436c8.getClass();
                    e(31);
                    ((AudioManager) c0436c8.f6467g).clearCommunicationDevice();
                    ((p) rVar).success(null);
                    break;
                case "setSpeakerphoneOn":
                    ((AudioManager) f12997b.f6467g).setSpeakerphoneOn(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case "isSpeakerphoneOn":
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12997b.f6467g).isSpeakerphoneOn()));
                    break;
                case "setAllowedCapturePolicy":
                    C0436c c0436c9 = f12997b;
                    int iIntValue6 = ((Integer) list.get(0)).intValue();
                    c0436c9.getClass();
                    e(29);
                    ((AudioManager) c0436c9.f6467g).setAllowedCapturePolicy(iIntValue6);
                    ((p) rVar).success(null);
                    break;
                case "getAllowedCapturePolicy":
                    C0436c c0436c10 = f12997b;
                    c0436c10.getClass();
                    e(29);
                    ((p) rVar).success(Integer.valueOf(((AudioManager) c0436c10.f6467g).getAllowedCapturePolicy()));
                    break;
                case "isBluetoothScoAvailableOffCall":
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12997b.f6467g).isBluetoothScoAvailableOffCall()));
                    break;
                case "startBluetoothSco":
                    ((AudioManager) f12997b.f6467g).startBluetoothSco();
                    ((p) rVar).success(null);
                    break;
                case "stopBluetoothSco":
                    ((AudioManager) f12997b.f6467g).stopBluetoothSco();
                    ((p) rVar).success(null);
                    break;
                case "setBluetoothScoOn":
                    ((AudioManager) f12997b.f6467g).setBluetoothScoOn(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case "isBluetoothScoOn":
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12997b.f6467g).isBluetoothScoOn()));
                    break;
                case "setMicrophoneMute":
                    ((AudioManager) f12997b.f6467g).setMicrophoneMute(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case "isMicrophoneMute":
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12997b.f6467g).isMicrophoneMute()));
                    break;
                case "setMode":
                    ((AudioManager) f12997b.f6467g).setMode(((Integer) list.get(0)).intValue());
                    ((p) rVar).success(null);
                    break;
                case "getMode":
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12997b.f6467g).getMode()));
                    break;
                case "isMusicActive":
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12997b.f6467g).isMusicActive()));
                    break;
                case "generateAudioSessionId":
                    C0436c c0436c11 = f12997b;
                    c0436c11.getClass();
                    e(21);
                    ((p) rVar).success(Integer.valueOf(((AudioManager) c0436c11.f6467g).generateAudioSessionId()));
                    break;
                case "setParameters":
                    ((AudioManager) f12997b.f6467g).setParameters((String) list.get(0));
                    ((p) rVar).success(null);
                    break;
                case "getParameters":
                    ((p) rVar).success(((AudioManager) f12997b.f6467g).getParameters((String) list.get(0)));
                    break;
                case "playSoundEffect":
                    C0436c c0436c12 = f12997b;
                    int iIntValue7 = ((Integer) list.get(0)).intValue();
                    Double d7 = (Double) list.get(1);
                    if (d7 != null) {
                        ((AudioManager) c0436c12.f6467g).playSoundEffect(iIntValue7, (float) d7.doubleValue());
                    } else {
                        ((AudioManager) c0436c12.f6467g).playSoundEffect(iIntValue7);
                    }
                    ((p) rVar).success(null);
                    break;
                case "loadSoundEffects":
                    ((AudioManager) f12997b.f6467g).loadSoundEffects();
                    ((p) rVar).success(null);
                    break;
                case "unloadSoundEffects":
                    ((AudioManager) f12997b.f6467g).unloadSoundEffects();
                    ((p) rVar).success(null);
                    break;
                case "getProperty":
                    ((p) rVar).success(((AudioManager) f12997b.f6467g).getProperty((String) list.get(0)));
                    break;
                case "getDevices":
                    ((p) rVar).success(f12997b.c(((Integer) list.get(0)).intValue()));
                    break;
                case "getMicrophones":
                    ((p) rVar).success(f12997b.d());
                    break;
                case "isHapticPlaybackSupported":
                    f12997b.getClass();
                    e(29);
                    ((p) rVar).success(Boolean.valueOf(AudioManager.isHapticPlaybackSupported()));
                    break;
                default:
                    ((p) rVar).notImplemented();
                    break;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            ((p) rVar).error("Error: " + e7, null, null);
        }
    }
}
