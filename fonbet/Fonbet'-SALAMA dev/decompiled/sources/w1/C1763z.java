package w1;

import android.content.pm.PackageInfo;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: w1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763z extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f17939b;

    public /* synthetic */ C1763z(C c3, int i7) {
        this.f17938a = i7;
        this.f17939b = c3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|4|5|6|7|8|(1:10)(1:91)|11|(1:13)|14|(1:16)|(3:18|19|20)|(10:29|(5:31|(3:36|37|(8:39|(1:41)|42|43|(3:45|(4:47|(2:51|(1:53)(2:54|50))|49|50)|55)|(1:57)|59|(1:61))(3:68|(3:70|(6:72|(1:82)(1:76)|77|(1:79)|80|81)|83)|84))|85|37|(0)(0))|86|(0)|42|43|(0)|(0)|59|(0)(0))|87|42|43|(0)|(0)|59|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c5, code lost:
    
        r0.getLocalizedMessage();
        w1.AbstractC1706i0.j("Error fetching Install Id", "Exception happened during fetching Install Id", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0153 A[Catch: Exception -> 0x00a1, TryCatch #3 {Exception -> 0x00a1, blocks: (B:19:0x0079, B:22:0x0085, B:24:0x008f, B:26:0x0097, B:29:0x00a4, B:31:0x00b0, B:33:0x00be, B:36:0x00cf, B:37:0x00d7, B:41:0x0153, B:68:0x00df, B:70:0x00e9, B:72:0x00f3, B:74:0x010c, B:77:0x0112, B:79:0x011d, B:81:0x012c, B:83:0x0147, B:84:0x014a, B:86:0x014c, B:87:0x015b), top: B:18:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176 A[Catch: Exception -> 0x01a9, TryCatch #2 {Exception -> 0x01a9, blocks: (B:43:0x016d, B:45:0x0176, B:47:0x0180, B:50:0x01af, B:51:0x0196, B:53:0x01a3, B:54:0x01ab, B:55:0x01b3, B:57:0x01b7), top: B:42:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7 A[Catch: Exception -> 0x01a9, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a9, blocks: (B:43:0x016d, B:45:0x0176, B:47:0x0180, B:50:0x01af, B:51:0x0196, B:53:0x01a3, B:54:0x01ab, B:55:0x01b3, B:57:0x01b7), top: B:42:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df A[Catch: Exception -> 0x00a1, TryCatch #3 {Exception -> 0x00a1, blocks: (B:19:0x0079, B:22:0x0085, B:24:0x008f, B:26:0x0097, B:29:0x00a4, B:31:0x00b0, B:33:0x00be, B:36:0x00cf, B:37:0x00d7, B:41:0x0153, B:68:0x00df, B:70:0x00e9, B:72:0x00f3, B:74:0x010c, B:77:0x0112, B:79:0x011d, B:81:0x012c, B:83:0x0147, B:84:0x014a, B:86:0x014c, B:87:0x015b), top: B:18:0x0079 }] */
    @Override // w1.AbstractRunnableC1687d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        byte[] bArr;
        byte[] s7;
        boolean isEmpty;
        H h6;
        String str;
        String str2;
        boolean z4;
        switch (this.f17938a) {
            case 0:
                this.f17939b.f17298B.i();
                break;
            case 1:
                Collections.emptyMap();
                C c3 = this.f17939b;
                c3.getClass();
                c3.d(new C1763z(c3, 2));
                break;
            default:
                C c4 = this.f17939b;
                c4.f17301E.set(false);
                c4.f17298B.i();
                try {
                    C1757x c1757x = c4.f17300D;
                    String k7 = AbstractC1707i1.k("advertising_id", null);
                    try {
                        z4 = AbstractC1707i1.f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getBoolean("com.flurry.sdk.".concat("ad_tracking_enabled"), false);
                    } catch (Throwable unused) {
                        z4 = false;
                    }
                    boolean z7 = !z4;
                    if (k7 != null) {
                        c1757x.f17917z = k7;
                        c1757x.f17915A = z7;
                    } else {
                        c1757x.h();
                    }
                    C1757x c1757x2 = c4.f17300D;
                    String str3 = c1757x2.f17917z;
                    boolean z8 = c1757x2.f17915A;
                    if (!TextUtils.isEmpty(str3)) {
                        c4.f17297A.f17381a.put(H.AndroidAdvertisingId, str3);
                        c4.f17297A.f17382b = z8;
                    }
                    if (!c4.f17300D.f17916B.get()) {
                        c4.d(new C1672A(this, z8, str3));
                    }
                } catch (Exception e7) {
                    e7.getLocalizedMessage();
                    AbstractC1706i0.j("Error fetching Ad Id", "Exception happened during fetching Ad Id", e7);
                }
                try {
                    isEmpty = TextUtils.isEmpty(c4.f17300D.f17917z);
                    h6 = H.DeviceId;
                } catch (Exception e8) {
                    e8.getLocalizedMessage();
                    AbstractC1706i0.j("Error fetching Device Id", "Exception happened during fetching Device Id", e8);
                }
                if (isEmpty && (!H2.a().f17397a.f17532A || (!AbstractC1706i0.l("android.permission.ACCESS_FINE_LOCATION") && !AbstractC1706i0.l("android.permission.ACCESS_COARSE_LOCATION")))) {
                    com.google.android.gms.common.internal.w wVar = c4.f17299C;
                    if (TextUtils.isEmpty((String) wVar.f11335b)) {
                        String string = Settings.Secure.getString(AbstractC1707i1.f17743c.getContentResolver(), "android_id");
                        if (string != null && !((Set) wVar.f11336c).contains(string.toLowerCase(Locale.US))) {
                            str = "AND".concat(string);
                            if (TextUtils.isEmpty(str)) {
                                if (str != null) {
                                    c4.f17297A.f17381a.put(h6, str);
                                }
                                F0 f02 = c4.f17298B;
                                bArr = (byte[]) f02.f17374c;
                                if (bArr == null) {
                                    bArr = f02.q(f02.s());
                                    if (bArr == null) {
                                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.ENGLISH);
                                        if (!TextUtils.isEmpty(lowerCase)) {
                                            String replaceAll = lowerCase.replaceAll("[^a-f0-9]+", "");
                                            if (replaceAll.length() % 2 != 0) {
                                                "Input string must contain an even number of characters ".concat(replaceAll);
                                            } else {
                                                s7 = AbstractC1706i0.s(replaceAll);
                                                f02.o(s7);
                                                bArr = s7;
                                            }
                                        }
                                        s7 = null;
                                        f02.o(s7);
                                        bArr = s7;
                                    }
                                    f02.f17374c = bArr;
                                }
                                if (bArr != null) {
                                    c4.f17297A.f17381a.put(H.AndroidInstallationId, Base64.encodeToString(bArr, 2));
                                }
                                c4.f17301E.set(true);
                                if (c4.j()) {
                                    G g3 = c4.f17297A;
                                    Map unmodifiableMap = Collections.unmodifiableMap(g3.f17381a);
                                    boolean z9 = g3.f17382b;
                                    G g7 = new G();
                                    g7.f17381a = unmodifiableMap;
                                    g7.f17382b = z9;
                                    c4.h(g7);
                                    break;
                                }
                            } else {
                                String l7 = com.google.android.gms.common.internal.w.l();
                                if (TextUtils.isEmpty(l7)) {
                                    l7 = com.google.android.gms.common.internal.w.u();
                                    if (TextUtils.isEmpty(l7)) {
                                        long doubleToLongBits = Double.doubleToLongBits(new SecureRandom().nextDouble());
                                        long nanoTime = System.nanoTime();
                                        PackageInfo j = AbstractC1707i1.j(AbstractC1707i1.f17743c);
                                        if (j == null || (str2 = j.packageName) == null) {
                                            str2 = "";
                                        }
                                        long j3 = 1125899906842597L;
                                        for (int i7 = 0; i7 < str2.length(); i7++) {
                                            j3 = (j3 * 31) + str2.charAt(i7);
                                        }
                                        l7 = "ID" + Long.toString((((j3 * 37) + nanoTime) * 37) + doubleToLongBits, 16);
                                    }
                                    com.google.android.gms.common.internal.w.o(l7);
                                }
                                wVar.f11335b = l7;
                            }
                        }
                        str = null;
                        if (TextUtils.isEmpty(str)) {
                        }
                    }
                    str = (String) wVar.f11335b;
                    if (str != null) {
                    }
                    F0 f022 = c4.f17298B;
                    bArr = (byte[]) f022.f17374c;
                    if (bArr == null) {
                    }
                    if (bArr != null) {
                    }
                    c4.f17301E.set(true);
                    if (c4.j()) {
                    }
                }
                c4.f17297A.f17381a.remove(h6);
                F0 f0222 = c4.f17298B;
                bArr = (byte[]) f0222.f17374c;
                if (bArr == null) {
                }
                if (bArr != null) {
                }
                c4.f17301E.set(true);
                if (c4.j()) {
                }
                break;
        }
    }
}
