package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: nk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0510nk implements my0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5444b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5445c;

    public /* synthetic */ C0510nk(int i, Object obj, Object obj2) {
        this.f5443a = i;
        this.f5444b = obj;
        this.f5445c = obj2;
    }

    @Override // p000.my0
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.f5443a;
        boolean z = true;
        Object obj = this.f5445c;
        Object obj2 = this.f5444b;
        switch (i) {
            case 0:
                C0547ok c0547ok = (C0547ok) obj2;
                C0805vj c0805vj = (C0805vj) obj;
                InterfaceC0436lk interfaceC0436lk = c0805vj.f8203f;
                C0902y5 c0902y5 = new C0902y5();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<C0481ms> set = c0805vj.f8200c;
                Set set2 = c0805vj.f8204g;
                for (C0481ms c0481ms : set) {
                    int i2 = c0481ms.f5154c;
                    int i3 = c0481ms.f5153b;
                    boolean z2 = i2 == 0 ? z : false;
                    cz0 cz0Var = c0481ms.f5152a;
                    if (z2) {
                        if (i3 == 2) {
                            hashSet4.add(cz0Var);
                        } else {
                            hashSet.add(cz0Var);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(cz0Var);
                    } else if (i3 == 2) {
                        hashSet5.add(cz0Var);
                    } else {
                        hashSet2.add(cz0Var);
                    }
                    z = true;
                }
                if (!set2.isEmpty()) {
                    hashSet.add(cz0.m1050a(wy0.class));
                }
                c0902y5.f9154a = Collections.unmodifiableSet(hashSet);
                c0902y5.f9155b = Collections.unmodifiableSet(hashSet2);
                c0902y5.f9156c = Collections.unmodifiableSet(hashSet3);
                c0902y5.f9157d = Collections.unmodifiableSet(hashSet4);
                c0902y5.f9158e = Collections.unmodifiableSet(hashSet5);
                c0902y5.f9159f = c0547ok;
                return interfaceC0436lk.mo532x(c0902y5);
            case 1:
                return new db0((Context) obj2, (String) obj);
            default:
                w00 w00Var = (w00) obj2;
                String strM5225c = w00Var.m5225c();
                C0440lo c0440lo = new C0440lo();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strM5225c), 0);
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c0440lo.f4863a = z;
                return c0440lo;
        }
    }
}
