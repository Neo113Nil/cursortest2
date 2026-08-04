package M4;

import A1.C0045t0;
import B.v;
import C0.C0091j;
import F1.m;
import F1.s;
import H2.o;
import R1.i;
import R1.j;
import R1.k;
import W5.AbstractC0494d0;
import W5.b2;
import android.content.Context;
import android.media.MediaCodec;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.ads.zzbbd;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p146u2.A;
import p146u2.C0955n;
import p146u2.D;
import p146u2.J;
import p155w1.C1010l1;
import p155w1.C1013m0;
import p155w1.P2;
import p155w1.Y0;
import p155w1.Z0;

/* JADX INFO: loaded from: classes2.dex */
public class e implements A0.d, m, J0.b, M2.c, j, W3.j, b2, p113p3.c, p120q4.g, p120q4.a, p137t0.a, Z0, Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f4590a;

    public static MediaCodec o(i iVar) throws IOException {
        iVar.f5919a.getClass();
        String str = iVar.f5919a.f5925a;
        p151v2.a.c("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        p151v2.a.m();
        return mediaCodecCreateByCodecName;
    }

    public static Q1.e t(o oVar, v vVar) {
        int i7;
        IOException iOException = (IOException) vVar.f966c;
        if (!(iOException instanceof D) || ((i7 = ((D) iOException).f16715d) != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503)) {
            return null;
        }
        if (oVar.a(1)) {
            return new Q1.e(1, 300000L);
        }
        if (oVar.a(2)) {
            return new Q1.e(2, 60000L);
        }
        return null;
    }

    public static long v(v vVar) {
        Throwable cause = (IOException) vVar.f966c;
        if (!(cause instanceof C0045t0) && !(cause instanceof FileNotFoundException) && !(cause instanceof A) && !(cause instanceof J)) {
            int i7 = C0955n.f16799b;
            while (cause != null) {
                if (!(cause instanceof C0955n) || ((C0955n) cause).f16800a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((vVar.f965b - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
        }
        return -9223372036854775807L;
    }

    @Override // R1.j
    public k a(i iVar) {
        MediaCodec mediaCodecO = null;
        try {
            mediaCodecO = o(iVar);
            p151v2.a.c("configureCodec");
            mediaCodecO.configure(iVar.f5920b, iVar.f5922d, iVar.f5923e, 0);
            p151v2.a.m();
            p151v2.a.c("startCodec");
            mediaCodecO.start();
            p151v2.a.m();
            return new t(mediaCodecO);
        } catch (IOException | RuntimeException e7) {
            if (mediaCodecO != null) {
                mediaCodecO.release();
            }
            throw e7;
        }
    }

    @Override // W5.b2
    public Object b() {
        return Executors.newCachedThreadPool(AbstractC0494d0.e("grpc-okhttp-%d"));
    }

    @Override // A0.d
    public void c(int i7, Serializable serializable) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // p113p3.c
    public C0091j e(Context context, String str, p113p3.b bVar) {
        C0091j c0091j = new C0091j();
        int iF = bVar.f(context, str, true);
        c0091j.f1290b = iF;
        if (iF != 0) {
            c0091j.f1291c = 1;
        } else {
            int iK = bVar.k(context, str);
            c0091j.f1289a = iK;
            if (iK != 0) {
                c0091j.f1291c = -1;
            }
        }
        return c0091j;
    }

    @Override // p137t0.a
    public CharSequence f(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f9660a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p155w1.Z0
    public Y0 g(int i7) {
        return new C1010l1(new C1013m0(27));
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    @Override // J0.b
    public J0.c i(D3.j jVar) {
        boolean z4 = jVar.f1724c;
        return new K0.e((Context) jVar.f1725d, (String) jVar.f1723b, (P2) jVar.f1726e, z4);
    }

    @Override // A0.d
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p120q4.a
    public long k() {
        return System.currentTimeMillis();
    }

    @Override // W5.b2
    public void l(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // F1.m
    public void m(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // F1.m
    public void n() {
        throw new UnsupportedOperationException();
    }

    @Override // p120q4.g
    public boolean p(Object obj) {
        p114p4.c cVar = (p114p4.c) ((Map) obj).get(p134s4.g.f16169i);
        return cVar != null && cVar.f15708d;
    }

    public String q(List list) throws IOException {
        t6.h.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        t6.h.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // F1.m
    public F1.v r(int i7, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // p155w1.Y0
    public /* synthetic */ void s(Object obj, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return;
        }
        outputStream.write(bArr, 0, bArr.length);
    }

    public int u(int i7) {
        return i7 == 7 ? 6 : 3;
    }

    public boolean w(CharSequence charSequence) {
        return charSequence instanceof N.d;
    }
}
