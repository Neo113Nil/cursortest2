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
import io.sentry.SentryLockReason;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: U5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0436c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6468h;

    public boolean a() {
        Context context;
        Context context2 = (Context) this.f6466f;
        if (context2 == null) {
            return false;
        }
        p043f5.e eVar = (p043f5.e) this.f6464d;
        if (eVar != null) {
            context2.unregisterReceiver(eVar);
            this.f6464d = null;
        }
        p043f5.e eVar2 = (p043f5.e) this.f6465e;
        if (eVar2 != null && (context = (Context) this.f6466f) != null) {
            context.unregisterReceiver(eVar2);
            this.f6465e = null;
        }
        p117q0.d dVar = (p117q0.d) this.f6463c;
        if (dVar == null) {
            return true;
        }
        AudioManager audioManager = (AudioManager) this.f6467g;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        int iA = Build.VERSION.SDK_INT >= 26 ? p117q0.e.a(audioManager, p097n3.b.g(dVar.f15737f)) : audioManager.abandonAudioFocus(dVar.f15733b);
        this.f6463c = null;
        return iA == 1;
    }

    public void b(Map map) {
        Object obj = map.get("downTime");
        long jLongValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
        Object obj2 = map.get("eventTime");
        ((AudioManager) this.f6467g).dispatchMediaKeyEvent(new KeyEvent(jLongValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
    }

    public ArrayList c(int i7) {
        p043f5.f.e(23);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f6467g).getDevices(i7)) {
            arrayList.add(p043f5.f.d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), SentryLockReason.JsonKeys.ADDRESS, Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", p043f5.f.c(audioDeviceInfo.getSampleRates()), "channelMasks", p043f5.f.c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", p043f5.f.c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", p043f5.f.c(audioDeviceInfo.getChannelCounts()), "encodings", p043f5.f.c(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    public ArrayList d() {
        p043f5.f.e(28);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AudioManager) this.f6467g).getMicrophones().iterator();
        while (it.hasNext()) {
            MicrophoneInfo microphoneInfoI = p043f5.b.i(it.next());
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : microphoneInfoI.getFrequencyResponse()) {
                arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Pair pair2 : microphoneInfoI.getChannelMapping()) {
                arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
            }
            arrayList.add(p043f5.f.d("description", microphoneInfoI.getDescription(), "id", Integer.valueOf(microphoneInfoI.getId()), "type", Integer.valueOf(microphoneInfoI.getType()), SentryLockReason.JsonKeys.ADDRESS, microphoneInfoI.getAddress(), "location", Integer.valueOf(microphoneInfoI.getLocation()), "group", Integer.valueOf(microphoneInfoI.getGroup()), "indexInTheGroup", Integer.valueOf(microphoneInfoI.getIndexInTheGroup()), "position", p043f5.f.a(microphoneInfoI.getPosition()), Device.JsonKeys.ORIENTATION, p043f5.f.a(microphoneInfoI.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(microphoneInfoI.getSensitivity()), "maxSpl", Float.valueOf(microphoneInfoI.getMaxSpl()), "minSpl", Float.valueOf(microphoneInfoI.getMinSpl()), "directionality", Integer.valueOf(microphoneInfoI.getDirectionality())));
        }
        return arrayList;
    }

    public void e(String str, Object... objArr) {
        for (p043f5.f fVar : (ArrayList) this.f6462b) {
            fVar.f12998a.a(str, new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    public boolean f(List list) {
        int iRequestAudioFocus;
        if (((p117q0.d) this.f6463c) != null) {
            return true;
        }
        Map map = (Map) list.get(0);
        int iIntValue = ((Integer) map.get("gainType")).intValue();
        AudioAttributesCompat audioAttributesCompat = p117q0.d.f15731g;
        if (iIntValue != 1 && iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
            throw new IllegalArgumentException(p031e1.k.d(iIntValue, "Illegal audio focus gain type "));
        }
        p043f5.c cVar = new p043f5.c(this);
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            int i7 = AudioAttributesCompat.f9649b;
            R4.c aVar = Build.VERSION.SDK_INT >= 26 ? new p117q0.a(22) : new R4.c(22);
            Object obj = map2.get("contentType");
            AudioAttributes.Builder builder = (AudioAttributes.Builder) aVar.f6064b;
            if (obj != null) {
                builder.setContentType(((Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                builder.setFlags(((Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                aVar.F(((Integer) map2.get("usage")).intValue());
            }
            audioAttributesCompat = new AudioAttributesCompat(aVar.z());
        }
        AudioAttributesCompat audioAttributesCompat2 = audioAttributesCompat;
        p117q0.d dVar = new p117q0.d(iIntValue, cVar, handler, audioAttributesCompat2, map.get("willPauseWhenDucked") != null ? ((Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
        this.f6463c = dVar;
        AudioManager audioManager = (AudioManager) this.f6467g;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            iRequestAudioFocus = p117q0.e.b(audioManager, p097n3.b.g(dVar.f15737f));
        } else {
            iRequestAudioFocus = audioManager.requestAudioFocus(dVar.f15733b, audioAttributesCompat2.f9650a.a(), iIntValue);
        }
        boolean z4 = iRequestAudioFocus == 1;
        if (z4) {
            if (((p043f5.e) this.f6464d) == null) {
                p043f5.e eVar = new p043f5.e(this, 0);
                this.f6464d = eVar;
                G.h.registerReceiver((Context) this.f6466f, eVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
            }
            if (((p043f5.e) this.f6465e) == null) {
                p043f5.e eVar2 = new p043f5.e(this, 1);
                this.f6465e = eVar2;
                G.h.registerReceiver((Context) this.f6466f, eVar2, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
            }
        }
        return z4;
    }
}
