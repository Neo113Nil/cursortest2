package p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 implements nb1, ne0, q71, mp0, iq0, oh1, InterfaceC0375jx, InterfaceC0436lk, ju1 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ u90 f7708k = new u90(21);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ u90 f7709l = new u90(24);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ u90 f7710m = new u90(25);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ u90 f7711n = new u90(26);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ u90 f7712o = new u90(27);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ u90 f7713p = new u90(28);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ u90 f7714q = new u90(29);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7715j;

    public u90(SSLSession sSLSession) {
        this.f7715j = 3;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            je0.f3912d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4898g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: i */
    public static final rp1 m4899i(Object obj, Object obj2) {
        rp1 rp1VarM4394a = (rp1) obj;
        rp1 rp1Var = (rp1) obj2;
        if (!rp1Var.isEmpty()) {
            if (!rp1VarM4394a.f6938j) {
                rp1VarM4394a = rp1VarM4394a.m4394a();
            }
            rp1VarM4394a.m4395c();
            if (!rp1Var.isEmpty()) {
                rp1VarM4394a.putAll(rp1Var);
            }
        }
        return rp1VarM4394a;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f7715j) {
            case 25:
                return new Boolean(((Boolean) lr1.f4891a.get()).booleanValue());
            case 26:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 27:
                List list2 = jx1.f4164a;
                return (String) nr1.f5507a.get();
            case 28:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            default:
                List list4 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
        }
    }

    @Override // p000.q71
    /* JADX INFO: renamed from: b */
    public void mo154b(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // p000.q71, p000.InterfaceC0043az
    /* JADX INFO: renamed from: c */
    public Object mo155c() {
        return Executors.newCachedThreadPool(ca0.m910e("grpc-okhttp-%d"));
    }

    @Override // p000.oh1
    /* JADX INFO: renamed from: d */
    public void mo156d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f7715j) {
            case 19:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: e */
    public byte[] mo157e(Object obj) {
        switch (this.f7715j) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                return ((ja1) obj).f3886a.f3522k;
        }
    }

    @Override // p000.oh1
    /* JADX INFO: renamed from: f */
    public void mo158f(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f7715j) {
            case 19:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p000.nb1
    public Object get() {
        return new na1();
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: h */
    public Object mo160h(byte[] bArr) {
        int i;
        byte b;
        char c = 1;
        switch (this.f7715j) {
            case 2:
                if (bArr.length >= 3) {
                    return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
                }
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, oe0.f5707a)));
            default:
                if (bArr.length == 1 && bArr[0] == 48) {
                    return ja1.f3875e;
                }
                int length = bArr.length;
                if (length != 1) {
                    i = (length == 2 && (b = bArr[0]) >= 48 && b <= 57) ? (b - 48) * 10 : 0;
                    return ja1.f3877g.m2840h("Unknown code ".concat(new String(bArr, AbstractC0358jg.f3919a)));
                }
                c = 0;
                byte b2 = bArr[c];
                if (b2 >= 48 && b2 <= 57) {
                    int i2 = (b2 - 48) + i;
                    List list = ja1.f3874d;
                    if (i2 < list.size()) {
                        return (ja1) list.get(i2);
                    }
                }
                return ja1.f3877g.m2840h("Unknown code ".concat(new String(bArr, AbstractC0358jg.f3919a)));
        }
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f7715j) {
            case 16:
                return new xa1(f71Var.m1658d(Uri.class, InputStream.class), 0);
            default:
                return new xa1(f71Var.m1658d(z80.class, InputStream.class), 1);
        }
    }

    public String toString() {
        switch (this.f7715j) {
            case 4:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object mo532x(C0902y5 c0902y5) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c0902y5);
    }

    public /* synthetic */ u90(int i) {
        this.f7715j = i;
    }
}
