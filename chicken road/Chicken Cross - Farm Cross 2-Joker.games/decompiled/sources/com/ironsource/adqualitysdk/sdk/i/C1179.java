package com.ironsource.adqualitysdk.sdk.i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮇ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1179 implements InterfaceC1253 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f3363;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3362 = {StringFog.decrypt("vg5Q\n", "zWo76IqxXdo=\n"), StringFog.decrypt("gy9UdXVl1dCAKw==\n", "5EA7EhkAiqM=\n"), StringFog.decrypt("qJth2mNVPka1mg==\n", "2/8KhQQlVik=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3361 = {StringFog.decrypt("zf4QmCUgvMw=\n", "iJNl9ERU074=\n"), StringFog.decrypt("67Ap5uXqW175mgY=\n", "qt5NlIqDP34=\n")};

    public C1179(Context context) {
        this.f3363 = context;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5906() {
        String lowerCase = Build.PRODUCT.toLowerCase();
        String str = Build.MODEL;
        for (String str2 : f3362) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        for (String str3 : f3361) {
            if (str.toLowerCase().contains(str3.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    public final String getName() {
        return StringFog.decrypt("/3XvtVWAne7WYem5R4+b4vR96ag=\n", "lxSd0SLh74s=\n");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:55|56|57|(1:59)|60|(4:61|62|63|64)|(16:91|92|93|94|68|(1:70)|71|72|73|(2:75|(6:80|81|83|84|85|86))|89|81|83|84|85|86)|66|67|68|(0)|71|72|73|(0)|89|81|83|84|85|86) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:55|56|57|(1:59)|60|61|62|63|64|(16:91|92|93|94|68|(1:70)|71|72|73|(2:75|(6:80|81|83|84|85|86))|89|81|83|84|85|86)|66|67|68|(0)|71|72|73|(0)|89|81|83|84|85|86) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0216, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("Vpo=\n", "LefKPY5ejcE=\n");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013e A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #7 {Exception -> 0x0147, blocks: (B:53:0x012b, B:101:0x013e), top: B:52:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: Exception -> 0x00c0, TryCatch #1 {Exception -> 0x00c0, blocks: (B:14:0x0050, B:16:0x0055, B:19:0x0060, B:21:0x0067, B:23:0x0074, B:25:0x0077, B:26:0x0084, B:31:0x008b, B:33:0x0092, B:35:0x0098), top: B:13:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: Exception -> 0x00c0, LOOP:2: B:30:0x0089->B:31:0x008b, LOOP_END, TryCatch #1 {Exception -> 0x00c0, blocks: (B:14:0x0050, B:16:0x0055, B:19:0x0060, B:21:0x0067, B:23:0x0074, B:25:0x0077, B:26:0x0084, B:31:0x008b, B:33:0x0092, B:35:0x0098), top: B:13:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c0, blocks: (B:14:0x0050, B:16:0x0055, B:19:0x0060, B:21:0x0067, B:23:0x0074, B:25:0x0077, B:26:0x0084, B:31:0x008b, B:33:0x0092, B:35:0x0098), top: B:13:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c A[Catch: Exception -> 0x01bd, TryCatch #2 {Exception -> 0x01bd, blocks: (B:73:0x018e, B:75:0x019c, B:77:0x01ac, B:81:0x01ba), top: B:72:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c A[Catch: Exception -> 0x016a, TRY_LEAVE, TryCatch #5 {Exception -> 0x016a, blocks: (B:64:0x0159, B:91:0x016c), top: B:63:0x0159 }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0474 mo5481() {
        long j;
        int i;
        long[] jArr;
        char c;
        long j2;
        char c2;
        long j3;
        String lowerCase;
        int i2;
        int i3;
        int i4;
        boolean z;
        Intent registerReceiver;
        SensorManager sensorManager;
        int i5;
        int i6;
        double d;
        ActivityManager activityManager;
        ArrayList arrayList = new ArrayList();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors < 3) {
            arrayList.add(50);
        }
        try {
            activityManager = (ActivityManager) this.f3363.getSystemService(StringFog.decrypt("Wh0HWTEG/Vc=\n", "O35zMEdviS4=\n"));
        } catch (Exception unused) {
        }
        if (activityManager == null) {
            j = 0;
            if (j < 1024) {
                arrayList.add(51);
            }
            try {
                long[] jArr2 = new long[5];
                for (i5 = 0; i5 < 5; i5++) {
                    long nanoTime = System.nanoTime();
                    long j4 = 0;
                    for (int i7 = 0; i7 < 10000; i7++) {
                        long j5 = i7;
                        j4 = (j5 * j5) + j4;
                    }
                    jArr2[i5] = System.nanoTime() - nanoTime;
                    if (j4 == Long.MIN_VALUE) {
                        throw new RuntimeException(StringFog.decrypt("uWGmzwF+iQWuY7E=\n", "zA/UqmAd4WQ=\n"));
                    }
                }
                double d2 = 0.0d;
                double d3 = 0.0d;
                for (i6 = 0; i6 < 5; i6++) {
                    d3 += jArr2[i6];
                }
                double d4 = 5;
                d = d3 / d4;
                if (d != 0.0d) {
                    jArr = new long[]{0, 0};
                } else {
                    int i8 = 0;
                    for (int i9 = 5; i8 < i9; i9 = 5) {
                        try {
                            double d5 = jArr2[i8] - d;
                            d2 += d5 * d5;
                            i8++;
                        } catch (Exception unused2) {
                            i = 2;
                            jArr = new long[i];
                            c = 0;
                            j2 = 0;
                            jArr[0] = 0;
                            c2 = 1;
                            jArr[1] = -1;
                            long j6 = jArr[c];
                            j3 = jArr[c2];
                            if (j3 > j2) {
                            }
                            if (m5906()) {
                            }
                            lowerCase = Build.FINGERPRINT.toLowerCase();
                            if (!lowerCase.contains(StringFog.decrypt("uGPrEs8SrQ==\n", "3waFd717znQ=\n"))) {
                            }
                            arrayList.add(54);
                            sensorManager = (SensorManager) this.f3363.getSystemService(StringFog.decrypt("S1IHwrzl\n", "ODdpsdOX9Qg=\n"));
                            if (sensorManager != null) {
                            }
                        }
                    }
                    jArr = new long[]{(long) d, (long) (d2 / d4)};
                }
                c = 0;
                j2 = 0;
                c2 = 1;
            } catch (Exception unused3) {
                i = 2;
            }
            long j62 = jArr[c];
            j3 = jArr[c2];
            if (j3 > j2 && j62 > j2 && Math.sqrt(j3) / j62 > 0.5d) {
                arrayList.add(52);
            }
            if (m5906()) {
                arrayList.add(53);
            }
            lowerCase = Build.FINGERPRINT.toLowerCase();
            if (!lowerCase.contains(StringFog.decrypt("uGPrEs8SrQ==\n", "3waFd717znQ=\n")) || lowerCase.contains(StringFog.decrypt("DUJL3vOMtyAK\n", "eSc4qt7n0lk=\n"))) {
                arrayList.add(54);
            }
            try {
                sensorManager = (SensorManager) this.f3363.getSystemService(StringFog.decrypt("S1IHwrzl\n", "ODdpsdOX9Qg=\n"));
            } catch (Exception unused4) {
            }
            if (sensorManager != null) {
                i2 = sensorManager.getSensorList(-1).size();
                if (i2 < 5) {
                }
                registerReceiver = this.f3363.registerReceiver(null, new IntentFilter(StringFog.decrypt("cH1D0ZwDt014fVPGnR79AnJnTsydRJEiRUdi8ao1kCtQXWDmtw==\n", "ERMno/Nq02M=\n")));
                if (registerReceiver != null) {
                }
                i3 = -1;
                i4 = i3;
                if (i4 == 250) {
                }
                JSONObject jSONObject = new JSONObject();
                String decrypt = StringFog.decrypt("2akOTPCCT8vfqA==\n", "sNpLIYXuLr8=\n");
                if (!m5906()) {
                }
                z = true;
                jSONObject.put(decrypt, z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringFog.decrypt("UYWHOShwymRTtIcvI3c=\n", "IffoWk0DuQs=\n"), availableProcessors);
                jSONObject2.put(StringFog.decrypt("DfxFFSknpB8W4Ug5Bw==\n", "eZMxdEVqwXI=\n"), j);
                jSONObject2.put(StringFog.decrypt("jf39aK3hb6qL/fFvoON3uA==\n", "+ZSQAcOGOcs=\n"), j3);
                jSONObject2.put(StringFog.decrypt("Uo1HwK3WmHxUhl0=\n", "Iegps8Kk2xM=\n"), i2);
                jSONObject2.put(StringFog.decrypt("JCBazpFzuPsjLF4=\n", "RkEuuvQBwa8=\n"), i4);
                jSONObject2.put(StringFog.decrypt("huK+fsVvjF+a7L9r2nWQTQ==\n", "7oPNO6ga4D4=\n"), jSONObject.optBoolean(StringFog.decrypt("HPCS0xok1KQa8Q==\n", "dYPXvm9ItdA=\n"), false));
                String decrypt2 = jSONObject2.toString();
                return new C0474(arrayList.isEmpty(), arrayList, decrypt2, null);
            }
            i2 = 0;
            if (i2 < 5) {
                arrayList.add(55);
            }
            try {
                try {
                    registerReceiver = this.f3363.registerReceiver(null, new IntentFilter(StringFog.decrypt("cH1D0ZwDt014fVPGnR79AnJnTsydRJEiRUdi8ao1kCtQXWDmtw==\n", "ERMno/Nq02M=\n")));
                } catch (Exception unused5) {
                }
            } catch (Exception unused6) {
                i3 = -1;
            }
            if (registerReceiver != null) {
                i3 = -1;
                try {
                    i4 = registerReceiver.getIntExtra(StringFog.decrypt("7rZYW6/cfZrvoVA=\n", "mtM1K8quHO4=\n"), -1);
                } catch (Exception unused7) {
                }
                if (i4 == 250) {
                    arrayList.add(56);
                }
                JSONObject jSONObject3 = new JSONObject();
                String decrypt3 = StringFog.decrypt("2akOTPCCT8vfqA==\n", "sNpLIYXuLr8=\n");
                if (!m5906()) {
                    String lowerCase2 = Build.FINGERPRINT.toLowerCase();
                    if (!lowerCase2.contains(StringFog.decrypt("uGPrEs8SrQ==\n", "3waFd717znQ=\n")) && !lowerCase2.contains(StringFog.decrypt("DUJL3vOMtyAK\n", "eSc4qt7n0lk=\n"))) {
                        z = false;
                        jSONObject3.put(decrypt3, z);
                        JSONObject jSONObject22 = new JSONObject();
                        jSONObject22.put(StringFog.decrypt("UYWHOShwymRTtIcvI3c=\n", "IffoWk0DuQs=\n"), availableProcessors);
                        jSONObject22.put(StringFog.decrypt("DfxFFSknpB8W4Ug5Bw==\n", "eZMxdEVqwXI=\n"), j);
                        jSONObject22.put(StringFog.decrypt("jf39aK3hb6qL/fFvoON3uA==\n", "+ZSQAcOGOcs=\n"), j3);
                        jSONObject22.put(StringFog.decrypt("Uo1HwK3WmHxUhl0=\n", "Iegps8Kk2xM=\n"), i2);
                        jSONObject22.put(StringFog.decrypt("JCBazpFzuPsjLF4=\n", "RkEuuvQBwa8=\n"), i4);
                        jSONObject22.put(StringFog.decrypt("huK+fsVvjF+a7L9r2nWQTQ==\n", "7oPNO6ga4D4=\n"), jSONObject3.optBoolean(StringFog.decrypt("HPCS0xok1KQa8Q==\n", "dYPXvm9ItdA=\n"), false));
                        String decrypt22 = jSONObject22.toString();
                        return new C0474(arrayList.isEmpty(), arrayList, decrypt22, null);
                    }
                }
                z = true;
                jSONObject3.put(decrypt3, z);
                JSONObject jSONObject222 = new JSONObject();
                jSONObject222.put(StringFog.decrypt("UYWHOShwymRTtIcvI3c=\n", "IffoWk0DuQs=\n"), availableProcessors);
                jSONObject222.put(StringFog.decrypt("DfxFFSknpB8W4Ug5Bw==\n", "eZMxdEVqwXI=\n"), j);
                jSONObject222.put(StringFog.decrypt("jf39aK3hb6qL/fFvoON3uA==\n", "+ZSQAcOGOcs=\n"), j3);
                jSONObject222.put(StringFog.decrypt("Uo1HwK3WmHxUhl0=\n", "Iegps8Kk2xM=\n"), i2);
                jSONObject222.put(StringFog.decrypt("JCBazpFzuPsjLF4=\n", "RkEuuvQBwa8=\n"), i4);
                jSONObject222.put(StringFog.decrypt("huK+fsVvjF+a7L9r2nWQTQ==\n", "7oPNO6ga4D4=\n"), jSONObject3.optBoolean(StringFog.decrypt("HPCS0xok1KQa8Q==\n", "dYPXvm9ItdA=\n"), false));
                String decrypt222 = jSONObject222.toString();
                return new C0474(arrayList.isEmpty(), arrayList, decrypt222, null);
            }
            i3 = -1;
            i4 = i3;
            if (i4 == 250) {
            }
            JSONObject jSONObject32 = new JSONObject();
            String decrypt32 = StringFog.decrypt("2akOTPCCT8vfqA==\n", "sNpLIYXuLr8=\n");
            if (!m5906()) {
            }
            z = true;
            jSONObject32.put(decrypt32, z);
            JSONObject jSONObject2222 = new JSONObject();
            jSONObject2222.put(StringFog.decrypt("UYWHOShwymRTtIcvI3c=\n", "IffoWk0DuQs=\n"), availableProcessors);
            jSONObject2222.put(StringFog.decrypt("DfxFFSknpB8W4Ug5Bw==\n", "eZMxdEVqwXI=\n"), j);
            jSONObject2222.put(StringFog.decrypt("jf39aK3hb6qL/fFvoON3uA==\n", "+ZSQAcOGOcs=\n"), j3);
            jSONObject2222.put(StringFog.decrypt("Uo1HwK3WmHxUhl0=\n", "Iegps8Kk2xM=\n"), i2);
            jSONObject2222.put(StringFog.decrypt("JCBazpFzuPsjLF4=\n", "RkEuuvQBwa8=\n"), i4);
            jSONObject2222.put(StringFog.decrypt("huK+fsVvjF+a7L9r2nWQTQ==\n", "7oPNO6ga4D4=\n"), jSONObject32.optBoolean(StringFog.decrypt("HPCS0xok1KQa8Q==\n", "dYPXvm9ItdA=\n"), false));
            String decrypt2222 = jSONObject2222.toString();
            return new C0474(arrayList.isEmpty(), arrayList, decrypt2222, null);
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        j = memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (j < 1024) {
        }
        long[] jArr22 = new long[5];
        while (i5 < 5) {
        }
        double d22 = 0.0d;
        double d32 = 0.0d;
        while (i6 < 5) {
        }
        double d42 = 5;
        d = d32 / d42;
        if (d != 0.0d) {
        }
        c = 0;
        j2 = 0;
        c2 = 1;
        long j622 = jArr[c];
        j3 = jArr[c2];
        if (j3 > j2) {
            arrayList.add(52);
        }
        if (m5906()) {
        }
        lowerCase = Build.FINGERPRINT.toLowerCase();
        if (!lowerCase.contains(StringFog.decrypt("uGPrEs8SrQ==\n", "3waFd717znQ=\n"))) {
        }
        arrayList.add(54);
        sensorManager = (SensorManager) this.f3363.getSystemService(StringFog.decrypt("S1IHwrzl\n", "ODdpsdOX9Qg=\n"));
        if (sensorManager != null) {
        }
    }
}
