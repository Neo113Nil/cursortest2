package B8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import k8.e;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f3033c = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f3034a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3035b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r0.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NonNull e eVar) {
        this.f3034a = eVar.i().getSharedPreferences("com.google.android.gms.appid", 0);
        String d11 = eVar.l().d();
        if (d11 == null) {
            d11 = eVar.l().c();
            if (d11.startsWith("1:") || d11.startsWith("2:")) {
                String[] split = d11.split(ProductContainerDTO.RATIO_DELIMITER);
                if (split.length == 4) {
                    d11 = split[1];
                }
                d11 = null;
            }
        }
        this.f3035b = d11;
    }

    private String b() {
        PublicKey publicKey;
        synchronized (this.f3034a) {
            String str = null;
            String string = this.f3034a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e11) {
                Log.w("ContentValues", "Invalid key stored " + e11);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }

    public final String a() {
        String string;
        synchronized (this.f3034a) {
            try {
                synchronized (this.f3034a) {
                    string = this.f3034a.getString("|S|id", null);
                }
                if (string != null) {
                    return string;
                }
                return b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String c() {
        synchronized (this.f3034a) {
            try {
                String[] strArr = f3033c;
                int i11 = 0;
                while (true) {
                    String str = null;
                    if (i11 >= 4) {
                        return null;
                    }
                    String str2 = strArr[i11];
                    String string = this.f3034a.getString("|T|" + this.f3035b + "|" + str2, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str = new JSONObject(string).getString("token");
                            } catch (JSONException unused) {
                            }
                            string = str;
                        }
                        return string;
                    }
                    i11++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
