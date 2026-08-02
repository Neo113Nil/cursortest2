package f;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.r;
import e1.k;
import g.AbstractC1118a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: f.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1062h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12751a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12752b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12753c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f12754d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f12755e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12756f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f12757g = new Bundle();

    public final boolean a(int i7, int i8, Intent intent) {
        InterfaceC1055a interfaceC1055a;
        String str = (String) this.f12751a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C1060f c1060f = (C1060f) this.f12755e.get(str);
        if (c1060f == null || (interfaceC1055a = c1060f.f12747a) == null || !this.f12754d.contains(str)) {
            this.f12756f.remove(str);
            this.f12757g.putParcelable(str, new ActivityResult(intent, i8));
            return true;
        }
        interfaceC1055a.a(c1060f.f12748b.c(intent, i8));
        this.f12754d.remove(str);
        return true;
    }

    public abstract void b(int i7, AbstractC1118a abstractC1118a, Parcelable parcelable);

    public final C1059e c(String str, AbstractC1118a abstractC1118a, InterfaceC1055a interfaceC1055a) {
        d(str);
        this.f12755e.put(str, new C1060f(abstractC1118a, interfaceC1055a));
        HashMap hashMap = this.f12756f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            interfaceC1055a.a(obj);
        }
        Bundle bundle = this.f12757g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC1055a.a(abstractC1118a.c(activityResult.f8120b, activityResult.f8119a));
        }
        return new C1059e(this, str, abstractC1118a);
    }

    public final void d(String str) {
        HashMap hashMap = this.f12752b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        x6.d.f18094a.getClass();
        int nextInt = x6.d.f18095b.a().nextInt(2147418112);
        while (true) {
            int i7 = nextInt + 65536;
            HashMap hashMap2 = this.f12751a;
            if (!hashMap2.containsKey(Integer.valueOf(i7))) {
                hashMap2.put(Integer.valueOf(i7), str);
                hashMap.put(str, Integer.valueOf(i7));
                return;
            } else {
                x6.d.f18094a.getClass();
                nextInt = x6.d.f18095b.a().nextInt(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f12754d.contains(str) && (num = (Integer) this.f12752b.remove(str)) != null) {
            this.f12751a.remove(num);
        }
        this.f12755e.remove(str);
        HashMap hashMap = this.f12756f;
        if (hashMap.containsKey(str)) {
            StringBuilder k7 = k.k("Dropping pending result for request ", str, ": ");
            k7.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", k7.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f12757g;
        if (bundle.containsKey(str)) {
            StringBuilder k8 = k.k("Dropping pending result for request ", str, ": ");
            k8.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", k8.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f12753c;
        C1061g c1061g = (C1061g) hashMap2.get(str);
        if (c1061g != null) {
            ArrayList arrayList = c1061g.f12750b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c1061g.f12749a.b((r) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
