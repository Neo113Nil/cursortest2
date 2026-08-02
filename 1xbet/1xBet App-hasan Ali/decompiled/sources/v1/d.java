package v1;

import L4.AbstractC0218a;
import L4.C0229l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k4.AbstractC2036a;
import l3.C2054a;
import o4.AbstractC2223a;

/* loaded from: classes.dex */
public abstract class d {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(t0.E r8, c4.AbstractC0540a r9) {
        /*
            boolean r0 = r9 instanceof w.c
            if (r0 == 0) goto L13
            r0 = r9
            w.c r0 = (w.c) r0
            int r1 = r0.f20455m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20455m = r1
            goto L18
        L13:
            w.c r0 = new w.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20454l
            b4.a r1 = b4.EnumC0510a.f7289k
            int r2 = r0.f20455m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t0.E r8 = r0.f20453k
            G4.l.N(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            G4.l.N(r9)
        L34:
            r0.f20453k = r8
            r0.f20455m = r3
            java.lang.Object r9 = n.AbstractC2107A.m(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            t0.j r9 = (t0.j) r9
            int r2 = r9.f19487c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f19485a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r9.get(r5)
            t0.s r6 = (t0.s) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f19506h
            if (r7 != 0) goto L34
            boolean r6 = r6.f19503d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L4f
        L68:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.a(t0.E, c4.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r b(Context context) {
        ProviderInfo providerInfo;
        k1.e eVar;
        ApplicationInfo applicationInfo;
        C2054a cVar = Build.VERSION.SDK_INT >= 28 ? new c(10) : new C2054a(10);
        PackageManager packageManager = context.getPackageManager();
        AbstractC2036a.o("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] i = cVar.i(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : i) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new k1.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
            }
            if (eVar != null) {
                return null;
            }
            return new r(new q(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static String c(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0229l c0229l = C0229l.f3092n;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.l.e("publicKey.encoded", encoded);
        int length = encoded.length;
        int i = 0;
        G4.l.o(encoded.length, 0, length);
        C0229l b3 = new C0229l(X3.l.z0(encoded, 0, length)).b("SHA-256");
        byte[] bArr = AbstractC0218a.f3073a;
        byte[] bArr2 = b3.f3093k;
        kotlin.jvm.internal.l.f("<this>", bArr2);
        kotlin.jvm.internal.l.f("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length2 = bArr2.length - (bArr2.length % 3);
        int i5 = 0;
        while (i < length2) {
            byte b5 = bArr2[i];
            int i6 = i + 2;
            byte b6 = bArr2[i + 1];
            i += 3;
            byte b7 = bArr2[i6];
            bArr3[i5] = bArr[(b5 & 255) >> 2];
            bArr3[i5 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr3[i5 + 2] = bArr[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i5 += 4;
            bArr3[i7] = bArr[b7 & 63];
        }
        int length3 = bArr2.length - length2;
        if (length3 == 1) {
            byte b8 = bArr2[i];
            bArr3[i5] = bArr[(b8 & 255) >> 2];
            bArr3[1 + i5] = bArr[(b8 & 3) << 4];
            bArr3[2 + i5] = 61;
            bArr3[i5 + 3] = 61;
        } else if (length3 == 2) {
            int i8 = i + 1;
            byte b9 = bArr2[i];
            byte b10 = bArr2[i8];
            bArr3[i5] = bArr[(b9 & 255) >> 2];
            bArr3[1 + i5] = bArr[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr3[i5 + 2] = bArr[(b10 & 15) << 2];
            bArr3[i5 + 3] = 61;
        }
        sb.append(new String(bArr3, AbstractC2223a.f18653a));
        return sb.toString();
    }
}
