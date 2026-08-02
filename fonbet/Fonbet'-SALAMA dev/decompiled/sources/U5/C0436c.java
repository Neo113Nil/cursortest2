package U5;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import f5.AbstractC1102b;
import f5.C1103c;
import f5.C1105e;
import f5.C1106f;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.C1545a;
import q0.C1548d;

/* renamed from: U5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0436c {

    /* renamed from: a, reason: collision with root package name */
    public List f6461a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6462b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6463c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6464d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6465e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6466f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6467g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6468h;

    public boolean a() {
        Context context;
        Context context2 = (Context) this.f6466f;
        if (context2 == null) {
            return false;
        }
        C1105e c1105e = (C1105e) this.f6464d;
        if (c1105e != null) {
            context2.unregisterReceiver(c1105e);
            this.f6464d = null;
        }
        C1105e c1105e2 = (C1105e) this.f6465e;
        if (c1105e2 != null && (context = (Context) this.f6466f) != null) {
            context.unregisterReceiver(c1105e2);
            this.f6465e = null;
        }
        C1548d c1548d = (C1548d) this.f6463c;
        if (c1548d == null) {
            return true;
        }
        AudioManager audioManager = (AudioManager) this.f6467g;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        int a2 = Build.VERSION.SDK_INT >= 26 ? q0.e.a(audioManager, n3.b.g(c1548d.f15731f)) : audioManager.abandonAudioFocus(c1548d.f15727b);
        this.f6463c = null;
        return a2 == 1;
    }

    public void b(Map map) {
        Object obj = map.get("downTime");
        long longValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
        Object obj2 = map.get("eventTime");
        ((AudioManager) this.f6467g).dispatchMediaKeyEvent(new KeyEvent(longValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
    }

    public ArrayList c(int i7) {
        C1106f.e(23);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f6467g).getDevices(i7)) {
            arrayList.add(C1106f.d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), SentryLockReason.JsonKeys.ADDRESS, Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", C1106f.c(audioDeviceInfo.getSampleRates()), "channelMasks", C1106f.c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", C1106f.c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", C1106f.c(audioDeviceInfo.getChannelCounts()), "encodings", C1106f.c(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    public ArrayList d() {
        List microphones;
        List<Pair> frequencyResponse;
        List<Pair> channelMapping;
        String description;
        int id;
        int type;
        String address;
        int location;
        int group;
        int indexInTheGroup;
        MicrophoneInfo.Coordinate3F position;
        MicrophoneInfo.Coordinate3F orientation;
        float sensitivity;
        float maxSpl;
        float minSpl;
        int directionality;
        C1106f.e(28);
        ArrayList arrayList = new ArrayList();
        microphones = ((AudioManager) this.f6467g).getMicrophones();
        Iterator it = microphones.iterator();
        while (it.hasNext()) {
            MicrophoneInfo i7 = AbstractC1102b.i(it.next());
            ArrayList arrayList2 = new ArrayList();
            frequencyResponse = i7.getFrequencyResponse();
            for (Pair pair : frequencyResponse) {
                arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
            }
            ArrayList arrayList3 = new ArrayList();
            channelMapping = i7.getChannelMapping();
            for (Pair pair2 : channelMapping) {
                arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
            }
            description = i7.getDescription();
            id = i7.getId();
            Integer valueOf = Integer.valueOf(id);
            type = i7.getType();
            Integer valueOf2 = Integer.valueOf(type);
            address = i7.getAddress();
            location = i7.getLocation();
            Integer valueOf3 = Integer.valueOf(location);
            group = i7.getGroup();
            Integer valueOf4 = Integer.valueOf(group);
            indexInTheGroup = i7.getIndexInTheGroup();
            Integer valueOf5 = Integer.valueOf(indexInTheGroup);
            position = i7.getPosition();
            ArrayList a2 = C1106f.a(position);
            orientation = i7.getOrientation();
            ArrayList a4 = C1106f.a(orientation);
            sensitivity = i7.getSensitivity();
            Float valueOf6 = Float.valueOf(sensitivity);
            maxSpl = i7.getMaxSpl();
            Float valueOf7 = Float.valueOf(maxSpl);
            minSpl = i7.getMinSpl();
            Float valueOf8 = Float.valueOf(minSpl);
            directionality = i7.getDirectionality();
            arrayList.add(C1106f.d("description", description, "id", valueOf, "type", valueOf2, SentryLockReason.JsonKeys.ADDRESS, address, "location", valueOf3, "group", valueOf4, "indexInTheGroup", valueOf5, "position", a2, Device.JsonKeys.ORIENTATION, a4, "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", valueOf6, "maxSpl", valueOf7, "minSpl", valueOf8, "directionality", Integer.valueOf(directionality)));
        }
        return arrayList;
    }

    public void e(String str, Object... objArr) {
        Iterator it = ((ArrayList) this.f6462b).iterator();
        while (it.hasNext()) {
            C1106f c1106f = (C1106f) it.next();
            c1106f.f12992a.a(str, new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    public boolean f(List list) {
        if (((C1548d) this.f6463c) != null) {
            return true;
        }
        Map map = (Map) list.get(0);
        int intValue = ((Integer) map.get("gainType")).intValue();
        AudioAttributesCompat audioAttributesCompat = C1548d.f15725g;
        if (intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
            throw new IllegalArgumentException(e1.k.d(intValue, "Illegal audio focus gain type "));
        }
        C1103c c1103c = new C1103c(this);
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            int i7 = AudioAttributesCompat.f9649b;
            R4.c c1545a = Build.VERSION.SDK_INT >= 26 ? new C1545a(22) : new R4.c(22);
            Object obj = map2.get("contentType");
            AudioAttributes.Builder builder = (AudioAttributes.Builder) c1545a.f6064b;
            if (obj != null) {
                builder.setContentType(((Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                builder.setFlags(((Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                c1545a.F(((Integer) map2.get("usage")).intValue());
            }
            audioAttributesCompat = new AudioAttributesCompat(c1545a.z());
        }
        AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
        C1548d c1548d = new C1548d(intValue, c1103c, handler, audioAttributesCompat2, map.get("willPauseWhenDucked") != null ? ((Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
        this.f6463c = c1548d;
        AudioManager audioManager = (AudioManager) this.f6467g;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        boolean z4 = (Build.VERSION.SDK_INT >= 26 ? q0.e.b(audioManager, n3.b.g(c1548d.f15731f)) : audioManager.requestAudioFocus(c1548d.f15727b, audioAttributesCompat2.f9650a.a(), intValue)) == 1;
        if (z4) {
            if (((C1105e) this.f6464d) == null) {
                C1105e c1105e = new C1105e(this, 0);
                this.f6464d = c1105e;
                G.h.registerReceiver((Context) this.f6466f, c1105e, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
            }
            if (((C1105e) this.f6465e) == null) {
                C1105e c1105e2 = new C1105e(this, 1);
                this.f6465e = c1105e2;
                G.h.registerReceiver((Context) this.f6466f, c1105e2, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
            }
        }
        return z4;
    }
}
