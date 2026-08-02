package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class aa0 implements q71, ne0, o11, InterfaceC0043az, lx0, z51, iq0, oh1, InterfaceC0766uh, ju1 {

    /* JADX INFO: renamed from: k */
    public static aa0 f107k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ aa0 f108l = new aa0(24);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ aa0 f109m = new aa0(25);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ aa0 f110n = new aa0(26);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ aa0 f111o = new aa0(27);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ aa0 f112p = new aa0(28);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ aa0 f113q = new aa0(29);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f114j;

    public aa0() {
        this.f114j = 17;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: i */
    public static vt0 m149i(int i) {
        return new vt0(new C0539oc(), Math.min(1048576, Math.max(4096, i)));
    }

    /* JADX INFO: renamed from: m */
    public static Font m150m(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM151p = m151p(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM151p2 = m151p(fontStyle, font2.getStyle());
            if (iM151p2 < iM151p) {
                font = font2;
                iM151p = iM151p2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: p */
    public static int m151p(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: r */
    public static final kp1 m152r(Object obj, long j) {
        kp1 kp1Var = (kp1) tq1.m4833i(obj, j);
        if (((eo1) kp1Var).f2152j) {
            return kp1Var;
        }
        int size = kp1Var.size();
        kp1 kp1VarMo460m = kp1Var.mo460m(size == 0 ? 10 : size + size);
        tq1.m4834j(j, obj, kp1VarMo460m);
        return kp1VarMo460m;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f114j) {
            case 24:
                return new Boolean(((Boolean) jr1.f4077a.get()).booleanValue());
            case 25:
                return new Boolean(((Boolean) pr1.f6234a.get()).booleanValue());
            case 26:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 27:
                List list2 = jx1.f4164a;
                return (String) nr1.f5508b.get();
            case 28:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            default:
                List list4 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
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
        switch (this.f114j) {
            case 0:
                return Executors.newCachedThreadPool(ca0.m910e("grpc-default-executor-%d"));
            default:
                return new ak0();
        }
    }

    @Override // p000.oh1
    /* JADX INFO: renamed from: d */
    public void mo156d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new nh1((ByteBuffer) obj));
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: e */
    public byte[] mo157e(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.oh1
    /* JADX INFO: renamed from: f */
    public void mo158f(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new nh1((ByteBuffer) obj));
    }

    @Override // p000.InterfaceC0766uh
    /* JADX INFO: renamed from: g */
    public long mo159g() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: l */
    public Typeface m163l(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM164n = m164n((q40[]) list.get(0), contentResolver);
            if (fontFamilyM164n == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM164n);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM164n2 = m164n((q40[]) list.get(i2), contentResolver);
                if (fontFamilyM164n2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM164n2);
                }
            }
            return customFallbackBuilder.setStyle(m150m(fontFamilyM164n, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public FontFamily m164n(q40[] q40VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (q40 q40Var : q40VarArr) {
            if (Objects.equals(q40Var.f6367a.getScheme(), "systemfont")) {
                fontBuild = mo165o(q40Var);
            } else {
                try {
                    Uri uri = q40Var.f6367a;
                    String str = q40Var.f6371e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(q40Var.f6369c).setSlant(q40Var.f6370d ? 1 : 0).setTtcIndex(q40Var.f6368b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: o */
    public Font mo165o(q40 q40Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    /* JADX INFO: renamed from: q */
    public int m166q(Object obj) {
        switch (this.f114j) {
            case 4:
                ((nj0) obj).getClass();
                return 5;
            case 5:
            default:
                ((fr0) obj).getClass();
                return 5;
            case 6:
                ((jt0) ((nl0) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, jt0.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
        }
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f114j) {
            case 15:
                return new xa1(f71Var.m1658d(Uri.class, AssetFileDescriptor.class), 0);
            default:
                return new rg1(f71Var.m1658d(z80.class, InputStream.class));
        }
    }

    public String toString() {
        switch (this.f114j) {
            case 0:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ aa0(int i) {
        this.f114j = i;
    }

    public aa0(f50 f50Var, t50 t50Var) {
        this.f114j = 3;
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: j */
    public void mo161j() {
    }

    @Override // p000.mp0
    /* JADX INFO: renamed from: h */
    public Object mo160h(byte[] bArr) {
        return bArr;
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: k */
    public void mo162k(int i, Object obj) {
    }

    @Override // p000.z51
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.z51
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
