package l1;

import M2.C0097a;
import M2.C0099c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b0.InterfaceC0260a;
import b0.InterfaceC0261b;
import c0.C0305g;
import com.chickyneer.roadway.R;
import com.google.android.gms.internal.play_billing.i2;
import com.google.firebase.components.ComponentRegistrar;
import e1.InterfaceC0410a;
import g4.AbstractC0464i;
import h4.C0488f;
import h4.C0491i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import r.C1392b;
import r.C1395e;

/* loaded from: classes.dex */
public final class j implements S0.e, H2.m, T.a, U.f, X0.b, InterfaceC0260a, InterfaceC0410a {

    /* renamed from: b, reason: collision with root package name */
    public static j f11016b;

    /* renamed from: c, reason: collision with root package name */
    public static j f11017c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11018a;

    public /* synthetic */ j(int i2) {
        this.f11018a = i2;
    }

    public static final String b(j5.i iVar, j5.i[] iVarArr, int i2) {
        int i3;
        boolean z;
        int i6;
        int i7;
        int i8 = -1;
        j5.i iVar2 = g5.a.f5755b;
        int a6 = iVar.a();
        int i9 = 0;
        while (i9 < a6) {
            int i10 = (i9 + a6) / 2;
            while (i10 > i8 && iVar.d(i10) != 10) {
                i10 += i8;
            }
            int i11 = i10 + 1;
            int i12 = 1;
            while (true) {
                i3 = i11 + i12;
                if (iVar.d(i3) == 10) {
                    break;
                }
                i12++;
            }
            int i13 = i3 - i11;
            int i14 = i2;
            boolean z5 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z5) {
                    i6 = 46;
                    z = false;
                } else {
                    byte d6 = iVarArr[i14].d(i15);
                    byte[] bArr = U4.c.f3176a;
                    int i17 = d6 & 255;
                    z = z5;
                    i6 = i17;
                }
                byte d7 = iVar.d(i11 + i16);
                byte[] bArr2 = U4.c.f3176a;
                i7 = i6 - (d7 & 255);
                if (i7 != 0) {
                    break;
                }
                i16++;
                i15++;
                if (i16 == i13) {
                    break;
                }
                if (iVarArr[i14].a() != i15) {
                    z5 = z;
                } else {
                    if (i14 == iVarArr.length - 1) {
                        break;
                    }
                    i14++;
                    z5 = true;
                    i15 = -1;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i18 = i13 - i16;
                    int a7 = iVarArr[i14].a() - i15;
                    int length = iVarArr.length;
                    for (int i19 = i14 + 1; i19 < length; i19++) {
                        a7 += iVarArr[i19].a();
                    }
                    if (a7 >= i18) {
                        if (a7 <= i18) {
                            return iVar.h(i11, i13 + i11).g(B4.a.f287a);
                        }
                    }
                }
                i9 = i3 + 1;
                i8 = -1;
            }
            a6 = i10;
            i8 = -1;
        }
        return null;
    }

    public static j5.i d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (k5.b.a(str.charAt(i3 + 1)) + (k5.b.a(str.charAt(i3)) << 4));
        }
        return new j5.i(bArr);
    }

    public static j5.i h(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(B4.a.f287a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        j5.i iVar = new j5.i(bytes);
        iVar.f10499c = str;
        return iVar;
    }

    public static C0491i k(List list) {
        C0491i c0491i = new C0491i(new C0488f(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String packageName = ((ResolveInfo) it.next()).activityInfo.packageName;
            kotlin.jvm.internal.i.d(packageName, "packageName");
            c0491i.add(packageName);
        }
        return e5.g.e(c0491i);
    }

    public static j5.i l(byte[] bArr, int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = bArr.length;
        }
        j5.b.d(bArr.length, i2, i3);
        return new j5.i(AbstractC0464i.Q(bArr, i2, i3 + i2));
    }

    public static final n n(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].equals(oVar)) {
                    return nVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean o(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? n(packageInfo2, p.f11026a) : n(packageInfo2, p.f11026a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z = true;
        if (packageInfo != null) {
            if ((!z ? n(packageInfo2, p.f11026a) : n(packageInfo2, p.f11026a[0])) == null) {
            }
        }
        return false;
    }

    @Override // b0.InterfaceC0260a
    public InterfaceC0261b a(X4.i iVar) {
        return new C0305g((Context) iVar.f3571c, (String) iVar.f3572d, (B3.d) iVar.f3573e, iVar.f3569a, iVar.f3570b);
    }

    @Override // S0.e
    public Object apply(Object obj) {
        return ((i2) obj).b();
    }

    @Override // e1.InterfaceC0410a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // T.a
    public CharSequence f(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f4606a.getString(R.string.not_set);
        }
        return null;
    }

    public String g(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new A.c(3, Executors.newSingleThreadExecutor());
    }

    public void j(C0099c c0099c) {
        switch (this.f11018a) {
            case 6:
                Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + c0099c);
                break;
            default:
                Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + c0099c);
                break;
        }
    }

    public List m(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (N1.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f1996a;
            if (str != null) {
                C0097a c0097a = new C0097a(str, 11, aVar);
                aVar = new N1.a(str, aVar.f1997b, aVar.f1998c, aVar.f1999d, aVar.f2000e, c0097a, aVar.f2002g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // H2.m
    public void onMethodCall(H2.l lVar, H2.n nVar) {
        switch (this.f11018a) {
            case 3:
                ((G2.i) nVar).success(null);
                break;
            default:
                ((G2.i) nVar).success(null);
                break;
        }
    }

    public j(B4.i iVar) {
        this.f11018a = 17;
    }

    public j() {
        this.f11018a = 19;
        new C1392b();
        new C1395e();
    }

    @Override // U.f
    public void i() {
    }

    @Override // U.f
    public void c(int i2, Serializable serializable) {
    }
}
