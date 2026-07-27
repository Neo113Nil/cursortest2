package e;

import Y1.C0077a;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0281b f4856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0077a f4857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.f f4858d;

    public C0282c(c.f fVar, String str, InterfaceC0281b interfaceC0281b, C0077a c0077a) {
        this.f4858d = fVar;
        this.f4855a = str;
        this.f4856b = interfaceC0281b;
        this.f4857c = c0077a;
    }

    @Override // androidx.lifecycle.j
    public final void a(k kVar, androidx.lifecycle.e eVar) {
        Integer num;
        boolean equals = androidx.lifecycle.e.ON_START.equals(eVar);
        String str = this.f4855a;
        c.f fVar = this.f4858d;
        if (equals) {
            HashMap hashMap = fVar.f2492e;
            InterfaceC0281b interfaceC0281b = this.f4856b;
            hashMap.put(str, new C0283d(this.f4857c, interfaceC0281b));
            HashMap hashMap2 = fVar.f;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                interfaceC0281b.b(obj);
            }
            Bundle bundle = fVar.f2493g;
            C0280a c0280a = (C0280a) bundle.getParcelable(str);
            if (c0280a != null) {
                bundle.remove(str);
                interfaceC0281b.b(new C0280a(c0280a.f4854b, c0280a.f4853a));
                return;
            }
            return;
        }
        if (androidx.lifecycle.e.ON_STOP.equals(eVar)) {
            fVar.f2492e.remove(str);
            return;
        }
        if (androidx.lifecycle.e.ON_DESTROY.equals(eVar)) {
            if (!fVar.f2491d.contains(str) && (num = (Integer) fVar.f2489b.remove(str)) != null) {
                fVar.f2488a.remove(num);
            }
            fVar.f2492e.remove(str);
            HashMap hashMap3 = fVar.f;
            if (hashMap3.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap3.get(str));
                hashMap3.remove(str);
            }
            Bundle bundle2 = fVar.f2493g;
            if (bundle2.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle2.getParcelable(str));
                bundle2.remove(str);
            }
            HashMap hashMap4 = fVar.f2490c;
            C0284e c0284e = (C0284e) hashMap4.get(str);
            if (c0284e != null) {
                ArrayList arrayList = c0284e.f4861b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0284e.f4860a.b((j) it.next());
                }
                arrayList.clear();
                hashMap4.remove(str);
            }
        }
    }
}
