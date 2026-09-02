package D;

import F.F;
import O.l;
import P.c;
import P.j;
import a.AbstractC0018a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.luminance.color.alchemy.MainActivity;
import e.d;
import g0.h;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements j, c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15b;

    public /* synthetic */ b(Object obj) {
        this.f15b = obj;
    }

    @Override // P.c
    public void m(Object obj) {
        b bVar = (b) this.f15b;
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((F) bVar.f15b).a(z2);
    }

    @Override // P.j
    public void o(C.a aVar, l lVar) {
        MainActivity mainActivity = (MainActivity) this.f15b;
        int i2 = MainActivity.f480g;
        h.e(aVar, "call");
        if (!h.a((String) aVar.f4c, "alignChromaticTone")) {
            lVar.b();
            return;
        }
        h.e(mainActivity, "context");
        try {
            byte[] bArr = new byte[16];
            for (int i3 = 0; i3 < 16; i3++) {
                bArr[i3] = (byte) (a.f12a[i3] ^ 93);
            }
            byte[] bArr2 = new byte[16];
            for (int i4 = 0; i4 < 16; i4++) {
                bArr2[i4] = (byte) (a.f13b[i4] ^ 93);
            }
            byte[] bArr3 = new byte[48];
            for (int i5 = 0; i5 < 48; i5++) {
                bArr3[i5] = (byte) (a.f14c[i5] ^ 93);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(bArr3);
            h.b(doFinal);
            String str = new String(doFinal, l0.a.f855a);
            String l2 = AbstractC0018a.l(mainActivity);
            d dVar = new d();
            Intent intent = dVar.f484a;
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            C.a a2 = dVar.a();
            Intent intent2 = (Intent) a2.f4c;
            if (l2 != null) {
                intent2.setPackage(l2);
            }
            intent2.setData(Uri.parse(str));
            mainActivity.startActivity(intent2, (Bundle) a2.f5d);
        } catch (Throwable unused) {
        }
        lVar.d(Boolean.TRUE);
    }
}
