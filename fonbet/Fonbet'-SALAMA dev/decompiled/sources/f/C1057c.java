package f;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.r;
import g.AbstractC1118a;
import java.util.HashMap;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1055a f12741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1118a f12742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1062h f12743d;

    public C1057c(AbstractC1062h abstractC1062h, String str, InterfaceC1055a interfaceC1055a, AbstractC1118a abstractC1118a) {
        this.f12743d = abstractC1062h;
        this.f12740a = str;
        this.f12741b = interfaceC1055a;
        this.f12742c = abstractC1118a;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        boolean equals = EnumC0739m.ON_START.equals(enumC0739m);
        String str = this.f12740a;
        AbstractC1062h abstractC1062h = this.f12743d;
        if (!equals) {
            if (EnumC0739m.ON_STOP.equals(enumC0739m)) {
                abstractC1062h.f12755e.remove(str);
                return;
            } else {
                if (EnumC0739m.ON_DESTROY.equals(enumC0739m)) {
                    abstractC1062h.e(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = abstractC1062h.f12755e;
        InterfaceC1055a interfaceC1055a = this.f12741b;
        AbstractC1118a abstractC1118a = this.f12742c;
        hashMap.put(str, new C1060f(abstractC1118a, interfaceC1055a));
        HashMap hashMap2 = abstractC1062h.f12756f;
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            interfaceC1055a.a(obj);
        }
        Bundle bundle = abstractC1062h.f12757g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC1055a.a(abstractC1118a.c(activityResult.f8120b, activityResult.f8119a));
        }
    }
}
