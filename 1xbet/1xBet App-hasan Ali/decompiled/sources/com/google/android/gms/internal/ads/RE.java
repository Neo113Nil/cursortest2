package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class RE implements Yj, InterfaceC1805xu, WF, VF, InterfaceC1883zi {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11347k;

    public /* synthetic */ RE(int i) {
        this.f11347k = i;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.VF
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        switch (this.f11347k) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                ((ExecutorService) obj).shutdown();
                break;
            case 12:
                ((LG) obj).getClass();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public MediaCodecInfo z(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public RE(Context context) {
        this.f11347k = 11;
        new C1667ur(context, 5);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.clear();
        hashMap2.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        byte[] bArr = new byte[12];
        UE.f11760h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.WF
    public int k(Object obj) {
        HashMap hashMap = YF.f12311a;
        String str = ((NF) obj).f10788a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC1260lo.f14419a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
