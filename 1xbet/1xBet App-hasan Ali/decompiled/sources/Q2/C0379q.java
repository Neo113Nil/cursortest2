package Q2;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* renamed from: Q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379q {
    public static final C0379q f = new C0379q();

    /* renamed from: a, reason: collision with root package name */
    public final U2.e f5048a;

    /* renamed from: b, reason: collision with root package name */
    public final C0375o f5049b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5050c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.a f5051d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f5052e;

    public C0379q() {
        U2.e eVar = new U2.e();
        eVar.f5867a = -1.0f;
        C0375o c0375o = new C0375o(new J0("com.google.android.gms.ads.AdManagerCreatorImpl", 2), new J0("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1), new J0("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0), new J0("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 3), new J0("com.google.android.gms.ads.AdOverlayCreatorImpl", 4), 0);
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        U2.a aVar = new U2.a(0, 244410000, true, false);
        Random random = new Random();
        this.f5048a = eVar;
        this.f5049b = c0375o;
        this.f5050c = bigInteger;
        this.f5051d = aVar;
        this.f5052e = random;
    }
}
