package f5;

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
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import io.sentry.SentryLockReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: f5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1106f implements q {

    /* renamed from: b, reason: collision with root package name */
    public static C0436c f12991b;

    /* renamed from: a, reason: collision with root package name */
    public s f12992a;

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        float f7;
        float f8;
        float f9;
        ArrayList arrayList = new ArrayList();
        f7 = coordinate3F.x;
        arrayList.add(Double.valueOf(f7));
        f8 = coordinate3F.y;
        arrayList.add(Double.valueOf(f8));
        f9 = coordinate3F.z;
        arrayList.add(Double.valueOf(f9));
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
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    public static void e(int i7) {
        if (Build.VERSION.SDK_INT < i7) {
            throw new RuntimeException(k.d(i7, "Requires API level "));
        }
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        char c3;
        int streamMinVolume;
        float streamVolumeDb;
        List availableCommunicationDevices;
        AudioDeviceInfo communicationDevice;
        int allowedCapturePolicy;
        boolean isHapticPlaybackSupported;
        try {
            List list = (List) oVar.f677b;
            String str = oVar.f676a;
            boolean z4 = false;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c3 = 17;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c3 = '(';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c3 = 29;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c3 = 20;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c3 = '*';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c3 = 28;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c3 = 19;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c3 = 27;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c3 = ')';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c3 = 21;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c3 = 26;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c3 = '%';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c3 = ' ';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c3 = 24;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c3 = 16;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c3 = 31;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c3 = '#';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c3 = 25;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c3 = 23;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c3 = '\"';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c3 = '\'';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c3 = 22;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c3 = 18;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c3 = '&';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c3 = '$';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c3 = 15;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c3 = 30;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c3 = '!';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    ((p) rVar).success(Boolean.valueOf(f12991b.f(list)));
                    break;
                case 1:
                    ((p) rVar).success(Boolean.valueOf(f12991b.a()));
                    break;
                case 2:
                    f12991b.b((Map) list.get(0));
                    ((p) rVar).success(null);
                    break;
                case 3:
                    C0436c c0436c = f12991b;
                    c0436c.getClass();
                    e(21);
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) c0436c.f6467g).isVolumeFixed()));
                    break;
                case 4:
                    ((AudioManager) f12991b.f6467g).adjustStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case 5:
                    ((AudioManager) f12991b.f6467g).adjustVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    ((p) rVar).success(null);
                    break;
                case 6:
                    ((AudioManager) f12991b.f6467g).adjustSuggestedStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case 7:
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12991b.f6467g).getRingerMode()));
                    break;
                case '\b':
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12991b.f6467g).getStreamMaxVolume(((Integer) list.get(0)).intValue())));
                    break;
                case '\t':
                    C0436c c0436c2 = f12991b;
                    int intValue = ((Integer) list.get(0)).intValue();
                    c0436c2.getClass();
                    e(28);
                    streamMinVolume = ((AudioManager) c0436c2.f6467g).getStreamMinVolume(intValue);
                    ((p) rVar).success(Integer.valueOf(streamMinVolume));
                    break;
                case '\n':
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12991b.f6467g).getStreamVolume(((Integer) list.get(0)).intValue())));
                    break;
                case 11:
                    C0436c c0436c3 = f12991b;
                    int intValue2 = ((Integer) list.get(0)).intValue();
                    int intValue3 = ((Integer) list.get(1)).intValue();
                    int intValue4 = ((Integer) list.get(2)).intValue();
                    c0436c3.getClass();
                    e(28);
                    streamVolumeDb = ((AudioManager) c0436c3.f6467g).getStreamVolumeDb(intValue2, intValue3, intValue4);
                    ((p) rVar).success(Float.valueOf(streamVolumeDb));
                    break;
                case '\f':
                    ((AudioManager) f12991b.f6467g).setRingerMode(((Integer) list.get(0)).intValue());
                    ((p) rVar).success(null);
                    break;
                case '\r':
                    ((AudioManager) f12991b.f6467g).setStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    ((p) rVar).success(null);
                    break;
                case 14:
                    C0436c c0436c4 = f12991b;
                    int intValue5 = ((Integer) list.get(0)).intValue();
                    c0436c4.getClass();
                    e(23);
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) c0436c4.f6467g).isStreamMute(intValue5)));
                    break;
                case 15:
                    C0436c c0436c5 = f12991b;
                    c0436c5.getClass();
                    e(31);
                    availableCommunicationDevices = ((AudioManager) c0436c5.f6467g).getAvailableCommunicationDevices();
                    c0436c5.f6461a = availableCommunicationDevices;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c0436c5.f6461a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b((AudioDeviceInfo) it.next()));
                    }
                    ((p) rVar).success(arrayList);
                    break;
                case 16:
                    C0436c c0436c6 = f12991b;
                    Integer num = (Integer) list.get(0);
                    c0436c6.getClass();
                    e(31);
                    Iterator it2 = c0436c6.f6461a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it2.next();
                            if (audioDeviceInfo.getId() == num.intValue()) {
                                z4 = ((AudioManager) c0436c6.f6467g).setCommunicationDevice(audioDeviceInfo);
                            }
                        }
                    }
                    ((p) rVar).success(Boolean.valueOf(z4));
                    break;
                case 17:
                    C0436c c0436c7 = f12991b;
                    c0436c7.getClass();
                    e(31);
                    communicationDevice = ((AudioManager) c0436c7.f6467g).getCommunicationDevice();
                    ((p) rVar).success(b(communicationDevice));
                    break;
                case 18:
                    C0436c c0436c8 = f12991b;
                    c0436c8.getClass();
                    e(31);
                    ((AudioManager) c0436c8.f6467g).clearCommunicationDevice();
                    ((p) rVar).success(null);
                    break;
                case 19:
                    ((AudioManager) f12991b.f6467g).setSpeakerphoneOn(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case 20:
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12991b.f6467g).isSpeakerphoneOn()));
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    C0436c c0436c9 = f12991b;
                    int intValue6 = ((Integer) list.get(0)).intValue();
                    c0436c9.getClass();
                    e(29);
                    ((AudioManager) c0436c9.f6467g).setAllowedCapturePolicy(intValue6);
                    ((p) rVar).success(null);
                    break;
                case 22:
                    C0436c c0436c10 = f12991b;
                    c0436c10.getClass();
                    e(29);
                    allowedCapturePolicy = ((AudioManager) c0436c10.f6467g).getAllowedCapturePolicy();
                    ((p) rVar).success(Integer.valueOf(allowedCapturePolicy));
                    break;
                case 23:
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12991b.f6467g).isBluetoothScoAvailableOffCall()));
                    break;
                case 24:
                    ((AudioManager) f12991b.f6467g).startBluetoothSco();
                    ((p) rVar).success(null);
                    break;
                case 25:
                    ((AudioManager) f12991b.f6467g).stopBluetoothSco();
                    ((p) rVar).success(null);
                    break;
                case 26:
                    ((AudioManager) f12991b.f6467g).setBluetoothScoOn(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case 27:
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12991b.f6467g).isBluetoothScoOn()));
                    break;
                case 28:
                    ((AudioManager) f12991b.f6467g).setMicrophoneMute(((Boolean) list.get(0)).booleanValue());
                    ((p) rVar).success(null);
                    break;
                case 29:
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12991b.f6467g).isMicrophoneMute()));
                    break;
                case 30:
                    ((AudioManager) f12991b.f6467g).setMode(((Integer) list.get(0)).intValue());
                    ((p) rVar).success(null);
                    break;
                case 31:
                    ((p) rVar).success(Integer.valueOf(((AudioManager) f12991b.f6467g).getMode()));
                    break;
                case ' ':
                    ((p) rVar).success(Boolean.valueOf(((AudioManager) f12991b.f6467g).isMusicActive()));
                    break;
                case '!':
                    C0436c c0436c11 = f12991b;
                    c0436c11.getClass();
                    e(21);
                    ((p) rVar).success(Integer.valueOf(((AudioManager) c0436c11.f6467g).generateAudioSessionId()));
                    break;
                case '\"':
                    ((AudioManager) f12991b.f6467g).setParameters((String) list.get(0));
                    ((p) rVar).success(null);
                    break;
                case '#':
                    ((p) rVar).success(((AudioManager) f12991b.f6467g).getParameters((String) list.get(0)));
                    break;
                case '$':
                    C0436c c0436c12 = f12991b;
                    int intValue7 = ((Integer) list.get(0)).intValue();
                    Double d7 = (Double) list.get(1);
                    if (d7 != null) {
                        ((AudioManager) c0436c12.f6467g).playSoundEffect(intValue7, (float) d7.doubleValue());
                    } else {
                        ((AudioManager) c0436c12.f6467g).playSoundEffect(intValue7);
                    }
                    ((p) rVar).success(null);
                    break;
                case '%':
                    ((AudioManager) f12991b.f6467g).loadSoundEffects();
                    ((p) rVar).success(null);
                    break;
                case '&':
                    ((AudioManager) f12991b.f6467g).unloadSoundEffects();
                    ((p) rVar).success(null);
                    break;
                case '\'':
                    ((p) rVar).success(((AudioManager) f12991b.f6467g).getProperty((String) list.get(0)));
                    break;
                case '(':
                    ((p) rVar).success(f12991b.c(((Integer) list.get(0)).intValue()));
                    break;
                case ')':
                    ((p) rVar).success(f12991b.d());
                    break;
                case '*':
                    f12991b.getClass();
                    e(29);
                    isHapticPlaybackSupported = AudioManager.isHapticPlaybackSupported();
                    ((p) rVar).success(Boolean.valueOf(isHapticPlaybackSupported));
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
