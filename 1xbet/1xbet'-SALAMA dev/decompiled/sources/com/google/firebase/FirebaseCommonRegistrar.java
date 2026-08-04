package com.google.firebase;

import A1.C0042s;
import C0.A;
import H5.k;
import M4.d;
import M4.e;
import M4.g;
import R4.a;
import R4.b;
import R5.M;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p048g4.i;
import p048g4.q;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(b.class));
        for (Class cls : new Class[0]) {
            f.l(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVar = new i(2, 0, a.class);
        if (hashSet.contains(iVar.f13212a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        arrayList.add(new p048g4.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k(17), hashSet3));
        q qVar = new q(Z3.a.class, Executor.class);
        A a2 = new A(d.class, new Class[]{M4.f.class, g.class});
        a2.b(i.b(Context.class));
        a2.b(i.b(Y3.i.class));
        a2.b(new i(2, 0, e.class));
        a2.b(new i(1, 1, b.class));
        a2.b(new i(qVar, 1, 0));
        a2.f1216f = new C0042s(qVar, 25);
        arrayList.add(a2.e());
        arrayList.add(Q0.a.h("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(Q0.a.h("fire-core", "21.0.0"));
        arrayList.add(Q0.a.h("device-name", a(Build.PRODUCT)));
        arrayList.add(Q0.a.h("device-model", a(Build.DEVICE)));
        arrayList.add(Q0.a.h("device-brand", a(Build.BRAND)));
        arrayList.add(Q0.a.z("android-target-sdk", new M(10)));
        arrayList.add(Q0.a.z("android-min-sdk", new M(11)));
        arrayList.add(Q0.a.z("android-platform", new M(12)));
        arrayList.add(Q0.a.z("android-installer", new M(13)));
        try {
            p044f6.a.f13003b.getClass();
            str = "2.1.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(Q0.a.h("kotlin", str));
        }
        return arrayList;
    }
}
