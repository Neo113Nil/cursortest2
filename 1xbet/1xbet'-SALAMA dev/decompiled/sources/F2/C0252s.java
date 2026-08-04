package F2;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbwf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: renamed from: F2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0252s f2717f = new C0252s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.d f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0247p f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f2721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f2722e;

    public C0252s() {
        J2.d dVar = new J2.d();
        dVar.f3812a = -1.0f;
        j1 j1Var = new j1("com.google.android.gms.ads.AdManagerCreatorImpl");
        Y0 y4 = new Y0("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1);
        Y0 y5 = new Y0("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0);
        zzbhf zzbhfVar = new zzbhf();
        new zzbwf();
        zzbsl zzbslVar = new zzbsl();
        new zzbhg();
        C0247p c0247p = new C0247p(j1Var, y4, y5, zzbhfVar, zzbslVar, new Y0("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 2));
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 250930000, true, false);
        Random random = new Random();
        this.f2718a = dVar;
        this.f2719b = c0247p;
        this.f2720c = string;
        this.f2721d = versionInfoParcel;
        this.f2722e = random;
    }
}
