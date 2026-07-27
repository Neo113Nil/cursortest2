package P0;

import T1.s;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.chicken.jump.road.pump.R;
import io.appmetrica.analytics.impl.C0644l9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import p.C1152b;
import p.C1155e;

/* loaded from: classes.dex */
public final class j implements C0.b, S.d, T1.m {

    /* renamed from: b, reason: collision with root package name */
    public static j f1138b;

    /* renamed from: c, reason: collision with root package name */
    public static j f1139c;

    /* renamed from: d, reason: collision with root package name */
    public static j f1140d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1141a;

    public /* synthetic */ j(int i3) {
        this.f1141a = i3;
    }

    public static final n g(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < nVarArr.length; i3++) {
                if (nVarArr[i3].equals(oVar)) {
                    return nVarArr[i3];
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
    public static final boolean h(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z3;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z3 ? g(packageInfo2, p.f1148a) : g(packageInfo2, p.f1148a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z3 = true;
        if (packageInfo != null) {
            if ((!z3 ? g(packageInfo2, p.f1148a) : g(packageInfo2, p.f1148a[0])) == null) {
            }
        }
        return false;
    }

    @Override // S.d
    public void a(int i3, Serializable serializable) {
        String str;
        switch (this.f1141a) {
            case 17:
                break;
            default:
                switch (i3) {
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
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // S.d
    public void b() {
        switch (this.f1141a) {
            case 17:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public long c() {
        switch (this.f1141a) {
            case 3:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public CharSequence f(Preference preference) {
        switch (this.f1141a) {
            case 14:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f2350a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f2350a.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // c2.a
    public Object get() {
        switch (this.f1141a) {
            case 1:
                return new A0.q(0, Executors.newSingleThreadExecutor());
            default:
                j jVar = new j(4);
                HashMap hashMap = new HashMap();
                x0.c cVar = x0.c.f10540a;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(cVar, new G0.c(30000L, 86400000L, set));
                x0.c cVar2 = x0.c.f10542c;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(cVar2, new G0.c(1000L, 86400000L, set));
                x0.c cVar3 = x0.c.f10541b;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(G0.e.f396b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(cVar3, new G0.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < x0.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new G0.b(jVar, hashMap);
        }
    }

    @Override // T1.m
    public void onMethodCall(T1.l lVar, T1.n nVar) {
        switch (this.f1141a) {
            case C0644l9.f7761E /* 21 */:
                ((S1.i) nVar).success(null);
                break;
            default:
                ((S1.i) nVar).success(null);
                break;
        }
    }

    public /* synthetic */ j(int i3, Object obj) {
        this.f1141a = i3;
    }

    public j(P.k fragmentManager) {
        this.f1141a = 11;
        kotlin.jvm.internal.j.e(fragmentManager, "fragmentManager");
        new CopyOnWriteArrayList();
    }

    public j() {
        this.f1141a = 29;
        new C1152b();
        new C1155e();
    }

    public j(K1.b bVar) {
        this.f1141a = 22;
        new T1.o(bVar, "flutter/deferredcomponent", s.f1473b).b(new J1.i(13, this));
        A0.j.F().getClass();
        new HashMap();
    }

    private final void d() {
    }

    private final void e(int i3, Serializable serializable) {
    }
}
