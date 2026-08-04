package p037f;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.r;
import java.util.HashMap;
import p045g.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f12748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f12749d;

    public c(h hVar, String str, a aVar, a aVar2) {
        this.f12749d = hVar;
        this.f12746a = str;
        this.f12747b = aVar;
        this.f12748c = aVar2;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        boolean zEquals = EnumC0718m.ON_START.equals(enumC0718m);
        String str = this.f12746a;
        h hVar = this.f12749d;
        if (!zEquals) {
            if (EnumC0718m.ON_STOP.equals(enumC0718m)) {
                hVar.f12761e.remove(str);
                return;
            } else {
                if (EnumC0718m.ON_DESTROY.equals(enumC0718m)) {
                    hVar.e(str);
                    return;
                }
                return;
            }
        }
        HashMap map = hVar.f12761e;
        a aVar = this.f12747b;
        a aVar2 = this.f12748c;
        map.put(str, new f(aVar2, aVar));
        HashMap map2 = hVar.f12762f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            aVar.a(obj);
        }
        Bundle bundle = hVar.f12763g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar.a(aVar2.c(activityResult.f8120b, activityResult.f8119a));
        }
    }
}
