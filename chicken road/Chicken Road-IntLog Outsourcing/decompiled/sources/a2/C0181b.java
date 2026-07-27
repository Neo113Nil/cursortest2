package a2;

import K1.g;
import K1.i;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3855c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3857b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0181b(g gVar) {
        gVar.a();
        this.f3856a = gVar.f1387a.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.a();
        i iVar = gVar.f1389c;
        String str = iVar.f1405e;
        if (str == null) {
            gVar.a();
            str = iVar.f1402b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.f3857b = str;
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f3856a) {
            String str = null;
            String string = this.f3856a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e3) {
                Log.w("ContentValues", "Invalid key stored " + e3);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
