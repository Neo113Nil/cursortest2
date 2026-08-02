package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797bF {

    /* renamed from: c, reason: collision with root package name */
    public static final C0797bF f12791c = new C0797bF(AbstractC1044gv.n(C0752aF.f12648d));

    /* renamed from: d, reason: collision with root package name */
    public static final C1761wv f12792d;

    /* renamed from: e, reason: collision with root package name */
    public static final Cv f12793e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f12794a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f12795b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC1400ot.C(3, objArr);
        f12792d = AbstractC1044gv.k(3, objArr);
        G3 g32 = new G3(4);
        g32.f(5, 6);
        g32.f(17, 6);
        g32.f(7, 6);
        g32.f(30, 10);
        g32.f(18, 6);
        g32.f(6, 8);
        g32.f(8, 8);
        g32.f(14, 8);
        f12793e = g32.n();
    }

    public C0797bF(C1761wv c1761wv) {
        for (int i = 0; i < c1761wv.f16186n; i++) {
            C0752aF c0752aF = (C0752aF) c1761wv.get(i);
            this.f12794a.put(c0752aF.f12649a, c0752aF);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f12794a.size(); i6++) {
            i5 = Math.max(i5, ((C0752aF) this.f12794a.valueAt(i6)).f12650b);
        }
        this.f12795b = i5;
    }

    public static C0797bF b(Context context, Mm mm, Dp dp) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), mm, dp);
    }

    public static C0797bF c(Context context, Intent intent, Mm mm, Dp dp) {
        Dp dp2;
        int i;
        int i5;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        int i6 = 0;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (dp == null) {
            dp2 = null;
            if (AbstractC1260lo.f14419a >= 33) {
                try {
                    audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) mm.a().f10741l);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        dp2 = new Dp(13, (AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
        } else {
            dp2 = dp;
        }
        int i7 = AbstractC1260lo.f14419a;
        Cv cv = f12793e;
        if (i7 >= 33 && (AbstractC1260lo.e(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) mm.a().f10741l);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(AbstractC1400ot.a0(12)));
            for (int i8 = 0; i8 < directProfilesForAttributes.size(); i8++) {
                AudioProfile d5 = WE.d(directProfilesForAttributes.get(i8));
                encapsulationType = d5.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = d5.getFormat();
                    if (AbstractC1260lo.c(format) || cv.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = d5.getChannelMasks();
                            set.addAll(AbstractC1400ot.a0(channelMasks2));
                        } else {
                            channelMasks = d5.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(AbstractC1400ot.a0(channelMasks)));
                        }
                    }
                }
            }
            AbstractC0952et.q("initialCapacity", 4);
            Object[] objArr = new Object[4];
            for (Map.Entry entry : hashMap.entrySet()) {
                C0752aF c0752aF = new C0752aF(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArr.length;
                int i9 = i6 + 1;
                int d6 = AbstractC0776av.d(length, i9);
                if (d6 > length) {
                    objArr = Arrays.copyOf(objArr, d6);
                }
                objArr[i6] = c0752aF;
                i6 = i9;
            }
            return new C0797bF(AbstractC1044gv.k(i6, objArr));
        }
        if (i7 >= 23) {
            AudioDeviceInfo[] devices = dp2 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) dp2.f8377l};
            C1132iv c1132iv = new C1132iv(4);
            i = 1;
            Integer[] numArr = {8, 7};
            if (c1132iv.f14017d != null) {
                for (int i10 = 0; i10 < 2; i10++) {
                    c1132iv.f(numArr[i10]);
                }
            } else {
                AbstractC1400ot.C(2, numArr);
                c1132iv.e(2);
                System.arraycopy(numArr, 0, c1132iv.f12730a, c1132iv.f12731b, 2);
                c1132iv.f12731b += 2;
            }
            if (i7 >= 31) {
                Integer[] numArr2 = {26, 27};
                if (c1132iv.f14017d != null) {
                    for (int i11 = 0; i11 < 2; i11++) {
                        c1132iv.f(numArr2[i11]);
                    }
                } else {
                    AbstractC1400ot.C(2, numArr2);
                    c1132iv.e(2);
                    System.arraycopy(numArr2, 0, c1132iv.f12730a, c1132iv.f12731b, 2);
                    c1132iv.f12731b += 2;
                }
            }
            if (i7 >= 33) {
                c1132iv.f(30);
            }
            AbstractC1177jv h3 = c1132iv.h();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (h3.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f12791c;
                }
            }
        } else {
            i = 1;
        }
        C1132iv c1132iv2 = new C1132iv(4);
        c1132iv2.f(2);
        int i12 = AbstractC1260lo.f14419a;
        if (i12 >= 29 && (AbstractC1260lo.e(context) || (i12 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            C0909dv c0909dv = new C0909dv(4);
            Av av = cv.f8105l;
            if (av == null) {
                Av av2 = new Av(cv, new Bv(cv.f8108o, 0, cv.f8109p));
                cv.f8105l = av2;
                av = av2;
            }
            Lv g5 = av.g();
            while (g5.hasNext()) {
                Integer num = (Integer) g5.next();
                int intValue = num.intValue();
                if (AbstractC1260lo.f14419a >= AbstractC1260lo.l(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) mm.a().f10741l);
                    if (isDirectPlaybackSupported) {
                        c0909dv.a(num);
                    }
                }
            }
            c0909dv.a(2);
            c1132iv2.g(c0909dv.f());
            return new C0797bF(d(AbstractC1400ot.e0(c1132iv2.h()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z3 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == i;
        if (!z3) {
            String str = AbstractC1260lo.f14421c;
            if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
                i5 = 1;
                if (intent != null || z3 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != i5) {
                    return new C0797bF(d(AbstractC1400ot.e0(c1132iv2.h()), 10));
                }
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    c1132iv2.g(AbstractC1400ot.a0(intArrayExtra));
                }
                return new C0797bF(d(AbstractC1400ot.e0(c1132iv2.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
            }
        }
        i5 = 1;
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c1132iv2.g(f12792d);
        }
        if (intent != null) {
        }
        return new C0797bF(d(AbstractC1400ot.e0(c1132iv2.h()), 10));
    }

    public static C1761wv d(int[] iArr, int i) {
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < iArr.length) {
            C0752aF c0752aF = new C0752aF(iArr[i5], i);
            int length = objArr.length;
            int i7 = i6 + 1;
            int d5 = AbstractC0776av.d(length, i7);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i6] = c0752aF;
            i5++;
            i6 = i7;
        }
        return AbstractC1044gv.k(i6, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0047, code lost:
    
        if (r4.indexOfKey(30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(C1407p c1407p, Mm mm) {
        boolean isDirectPlaybackSupported;
        int m5;
        String str = c1407p.f14904m;
        str.getClass();
        int a5 = AbstractC1593t6.a(str, c1407p.f14901j);
        Integer valueOf = Integer.valueOf(a5);
        Cv cv = f12793e;
        if (!cv.containsKey(valueOf)) {
            return null;
        }
        SparseArray sparseArray = this.f12794a;
        int i = 8;
        if (a5 == 18) {
            if (sparseArray.indexOfKey(18) >= 0) {
                a5 = 18;
            } else {
                a5 = 6;
                if (sparseArray.indexOfKey(a5) < 0) {
                    return null;
                }
                C0752aF c0752aF = (C0752aF) sparseArray.get(a5);
                c0752aF.getClass();
                int i5 = 0;
                r11 = false;
                boolean contains = false;
                int i6 = 10;
                int i7 = c0752aF.f12650b;
                AbstractC1177jv abstractC1177jv = c0752aF.f12651c;
                int i8 = c1407p.f14886B;
                if (i8 == -1 || a5 == 18) {
                    int i9 = c1407p.f14887C;
                    if (i9 == -1) {
                        i9 = 48000;
                    }
                    if (abstractC1177jv != null) {
                        i5 = i7;
                    } else {
                        int i10 = AbstractC1260lo.f14419a;
                        int i11 = c0752aF.f12649a;
                        if (i10 >= 29) {
                            while (true) {
                                if (i6 <= 0) {
                                    break;
                                }
                                int m6 = AbstractC1260lo.m(i6);
                                if (m6 != 0) {
                                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i9).setChannelMask(m6).build(), (AudioAttributes) mm.a().f10741l);
                                    if (isDirectPlaybackSupported) {
                                        i5 = i6;
                                        break;
                                    }
                                }
                                i6--;
                            }
                        } else {
                            Object obj = cv.get(Integer.valueOf(i11));
                            i5 = ((Integer) (obj != null ? obj : 0)).intValue();
                        }
                    }
                    i8 = i5;
                } else if (!c1407p.f14904m.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC1260lo.f14419a >= 33) {
                    if (abstractC1177jv != null) {
                        int m7 = AbstractC1260lo.m(i8);
                        if (m7 != 0) {
                            contains = abstractC1177jv.contains(Integer.valueOf(m7));
                        }
                    } else if (i8 <= i7) {
                        contains = true;
                    }
                    if (!contains) {
                        return null;
                    }
                } else if (i8 > 10) {
                    return null;
                }
                int i12 = AbstractC1260lo.f14419a;
                if (i12 <= 28) {
                    if (i8 != 7) {
                        if (i8 == 3 || i8 == 4 || i8 == 5) {
                            i = 6;
                        }
                    }
                    if (i12 <= 26 && "fugu".equals(AbstractC1260lo.f14420b) && i == 1) {
                        i = 2;
                    }
                    m5 = AbstractC1260lo.m(i);
                    if (m5 == 0) {
                        return Pair.create(Integer.valueOf(a5), Integer.valueOf(m5));
                    }
                    return null;
                }
                i = i8;
                if (i12 <= 26) {
                    i = 2;
                }
                m5 = AbstractC1260lo.m(i);
                if (m5 == 0) {
                }
            }
        }
        if (a5 == 8) {
            if (sparseArray.indexOfKey(8) >= 0) {
                a5 = 8;
            }
            a5 = 7;
            if (sparseArray.indexOfKey(a5) < 0) {
            }
        }
        if (a5 == 30) {
        }
        if (sparseArray.indexOfKey(a5) < 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0797bF) {
            C0797bF c0797bF = (C0797bF) obj;
            SparseArray sparseArray = this.f12794a;
            SparseArray sparseArray2 = c0797bF.f12794a;
            if (AbstractC1260lo.f14419a >= 31) {
                contentEquals = sparseArray.contentEquals(sparseArray2);
            } else {
                int size = sparseArray.size();
                if (size == sparseArray2.size()) {
                    for (int i = 0; i < size; i++) {
                        if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                            break;
                        }
                    }
                    if (this.f12795b == c0797bF.f12795b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i5 = AbstractC1260lo.f14419a;
        SparseArray sparseArray = this.f12794a;
        if (i5 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i6 = 17;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                i6 = Objects.hashCode(sparseArray.valueAt(i7)) + ((sparseArray.keyAt(i7) + (i6 * 31)) * 31);
            }
            i = i6;
        }
        return (i * 31) + this.f12795b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f12795b + ", audioProfiles=" + this.f12794a.toString() + "]";
    }
}
