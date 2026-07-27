package com.google.firebase;

import B0.f;
import E.C0028c;
import G2.d;
import N1.a;
import N1.i;
import N1.q;
import W1.b;
import W1.e;
import W1.g;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import h2.C0480a;
import h2.C0481b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
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
        hashSet.add(q.a(C0481b.class));
        for (Class cls : new Class[0]) {
            f.g(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVar = new i(2, C0480a.class, 0);
        if (hashSet.contains(iVar.f2019a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        arrayList.add(new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0028c(24), hashSet3));
        q qVar = new q(M1.a.class, Executor.class);
        d dVar = new d(W1.d.class, new Class[]{W1.f.class, g.class});
        dVar.a(i.a(Context.class));
        dVar.a(i.a(K1.g.class));
        dVar.a(new i(2, e.class, 0));
        dVar.a(new i(1, C0481b.class, 1));
        dVar.a(new i(qVar, 1, 0));
        dVar.f939f = new b(qVar, 0);
        arrayList.add(dVar.b());
        arrayList.add(AbstractC1341c.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC1341c.e("fire-core", "21.0.0"));
        arrayList.add(AbstractC1341c.e("device-name", a(Build.PRODUCT)));
        arrayList.add(AbstractC1341c.e("device-model", a(Build.DEVICE)));
        arrayList.add(AbstractC1341c.e("device-brand", a(Build.BRAND)));
        arrayList.add(AbstractC1341c.k("android-target-sdk", new C0028c(2)));
        arrayList.add(AbstractC1341c.k("android-min-sdk", new C0028c(3)));
        arrayList.add(AbstractC1341c.k("android-platform", new C0028c(4)));
        arrayList.add(AbstractC1341c.k("android-installer", new C0028c(5)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC1341c.e("kotlin", str));
        }
        return arrayList;
    }
}
