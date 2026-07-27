package e;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.InterfaceC0249t;
import androidx.lifecycle.InterfaceC0250u;
import f.AbstractC0413a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403d implements InterfaceC0249t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0401b f5497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0413a f5498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0407h f5499d;

    public C0403d(AbstractC0407h abstractC0407h, String str, InterfaceC0401b interfaceC0401b, AbstractC0413a abstractC0413a) {
        this.f5499d = abstractC0407h;
        this.f5496a = str;
        this.f5497b = interfaceC0401b;
        this.f5498c = abstractC0413a;
    }

    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        Integer num;
        boolean equals = EnumC0243m.ON_START.equals(enumC0243m);
        String str = this.f5496a;
        AbstractC0407h abstractC0407h = this.f5499d;
        if (equals) {
            HashMap hashMap = abstractC0407h.f5511e;
            InterfaceC0401b interfaceC0401b = this.f5497b;
            AbstractC0413a abstractC0413a = this.f5498c;
            hashMap.put(str, new C0405f(abstractC0413a, interfaceC0401b));
            HashMap hashMap2 = abstractC0407h.f5512f;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                interfaceC0401b.b(obj);
            }
            Bundle bundle = abstractC0407h.f5513g;
            C0400a c0400a = (C0400a) bundle.getParcelable(str);
            if (c0400a != null) {
                bundle.remove(str);
                interfaceC0401b.b(abstractC0413a.b(c0400a.f5494a, c0400a.f5495b));
                return;
            }
            return;
        }
        if (EnumC0243m.ON_STOP.equals(enumC0243m)) {
            abstractC0407h.f5511e.remove(str);
            return;
        }
        if (EnumC0243m.ON_DESTROY.equals(enumC0243m)) {
            if (!abstractC0407h.f5510d.contains(str) && (num = (Integer) abstractC0407h.f5508b.remove(str)) != null) {
                abstractC0407h.f5507a.remove(num);
            }
            abstractC0407h.f5511e.remove(str);
            HashMap hashMap3 = abstractC0407h.f5512f;
            if (hashMap3.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap3.get(str));
                hashMap3.remove(str);
            }
            Bundle bundle2 = abstractC0407h.f5513g;
            if (bundle2.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle2.getParcelable(str));
                bundle2.remove(str);
            }
            HashMap hashMap4 = abstractC0407h.f5509c;
            C0406g c0406g = (C0406g) hashMap4.get(str);
            if (c0406g != null) {
                ArrayList arrayList = c0406g.f5506b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0406g.f5505a.b((InterfaceC0249t) it.next());
                }
                arrayList.clear();
                hashMap4.remove(str);
            }
        }
    }
}
