package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1685v8 implements InterfaceC1805xu {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15965k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f15966l;

    public /* synthetic */ C1685v8(Context context, int i) {
        this.f15965k = i;
        this.f15966l = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        switch (this.f15965k) {
            case 1:
                AudioManager audioManager = (AudioManager) this.f15966l.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            default:
                return new C1112iH(this.f15966l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KF b(C0375o c0375o) {
        MediaCodec createByCodecName;
        String str;
        MediaCodec mediaCodec;
        LF dp;
        DF df;
        Surface surface;
        Context context;
        int i = AbstractC1260lo.f14419a;
        int i5 = 0;
        MediaCodec mediaCodec2 = null;
        r5 = null;
        DF df2 = null;
        mediaCodec2 = null;
        if (i < 23 || (i < 31 && ((context = this.f15966l) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            try {
                String str2 = ((NF) c0375o.f5042l).f10788a;
                Trace.beginSection("createCodec:".concat(str2));
                createByCodecName = MediaCodec.createByCodecName(str2);
                Trace.endSection();
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e5) {
                e = e5;
            }
            try {
                Trace.beginSection("configureCodec");
                Surface surface2 = (Surface) c0375o.f5045o;
                if (surface2 == null && ((NF) c0375o.f5042l).f10794h && i >= 35) {
                    i5 = 8;
                }
                createByCodecName.configure((MediaFormat) c0375o.f5043m, surface2, (MediaCrypto) null, i5);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new Er(createByCodecName, (C1667ur) c0375o.f5046p);
            } catch (IOException e6) {
                e = e6;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                throw e;
            } catch (RuntimeException e7) {
                e = e7;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                }
                throw e;
            }
        }
        int b3 = AbstractC1593t6.b(((C1407p) c0375o.f5044n).f14904m);
        switch (b3) {
            case -2:
                str = "none";
                break;
            case -1:
                str = "unknown";
                break;
            case 0:
                str = "default";
                break;
            case 1:
                str = "audio";
                break;
            case 2:
                str = "video";
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = "metadata";
                break;
            default:
                str = "camera motion";
                break;
        }
        JB.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
        NF nf = (NF) c0375o.f5042l;
        String str3 = nf.f10788a;
        try {
            Trace.beginSection("createCodec:" + str3);
            mediaCodec = MediaCodec.createByCodecName(str3);
            try {
                C1407p c1407p = (C1407p) c0375o.f5044n;
                try {
                    if (i >= 34) {
                        if (i < 35) {
                            if (AbstractC1593t6.g(c1407p.f14904m)) {
                            }
                        }
                        dp = new Dp(15, mediaCodec);
                        i5 = 4;
                        df = new DF(mediaCodec, new HandlerThread(DF.r("ExoPlayer:MediaCodecAsyncAdapter:", b3)), dp, (C1667ur) c0375o.f5046p);
                        Trace.endSection();
                        surface = (Surface) c0375o.f5045o;
                        if (surface == null && nf.f10794h && i >= 35) {
                            i5 |= 8;
                        }
                        DF.q(df, (MediaFormat) c0375o.f5043m, surface, i5);
                        return df;
                    }
                    Trace.endSection();
                    surface = (Surface) c0375o.f5045o;
                    if (surface == null) {
                        i5 |= 8;
                    }
                    DF.q(df, (MediaFormat) c0375o.f5043m, surface, i5);
                    return df;
                } catch (Exception e8) {
                    e = e8;
                    df2 = df;
                    if (df2 != null) {
                        df2.l();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                dp = new GF(mediaCodec, new HandlerThread(DF.r("ExoPlayer:MediaCodecQueueingThread:", b3)));
                df = new DF(mediaCodec, new HandlerThread(DF.r("ExoPlayer:MediaCodecAsyncAdapter:", b3)), dp, (C1667ur) c0375o.f5046p);
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }
}
