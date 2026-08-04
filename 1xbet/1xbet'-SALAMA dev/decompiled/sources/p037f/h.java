package p037f;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p031e1.k;
import p045g.a;
import x6.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12757a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12758b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12759c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f12760d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f12761e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f12762f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f12763g = new Bundle();

    public final boolean a(int i7, int i8, Intent intent) {
        a aVar;
        String str = (String) this.f12757a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f12761e.get(str);
        if (fVar == null || (aVar = fVar.f12753a) == null || !this.f12760d.contains(str)) {
            this.f12762f.remove(str);
            this.f12763g.putParcelable(str, new ActivityResult(intent, i8));
            return true;
        }
        aVar.a(fVar.f12754b.c(intent, i8));
        this.f12760d.remove(str);
        return true;
    }

    public abstract void b(int i7, a aVar, Parcelable parcelable);

    public final e c(String str, a aVar, a aVar2) {
        d(str);
        this.f12761e.put(str, new f(aVar, aVar2));
        HashMap map = this.f12762f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            aVar2.a(obj);
        }
        Bundle bundle = this.f12763g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar2.a(aVar.c(activityResult.f8120b, activityResult.f8119a));
        }
        return new e(this, str, aVar);
    }

    public final void d(String str) {
        HashMap map = this.f12758b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        d.f18100a.getClass();
        int iNextInt = d.f18101b.a().nextInt(2147418112);
        while (true) {
            int i7 = iNextInt + 65536;
            HashMap map2 = this.f12757a;
            if (!map2.containsKey(Integer.valueOf(i7))) {
                map2.put(Integer.valueOf(i7), str);
                map.put(str, Integer.valueOf(i7));
                return;
            } else {
                d.f18100a.getClass();
                iNextInt = d.f18101b.a().nextInt(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f12760d.contains(str) && (num = (Integer) this.f12758b.remove(str)) != null) {
            this.f12757a.remove(num);
        }
        this.f12761e.remove(str);
        HashMap map = this.f12762f;
        if (map.containsKey(str)) {
            StringBuilder sbK = k.k("Dropping pending result for request ", str, ": ");
            sbK.append(map.get(str));
            Log.w("ActivityResultRegistry", sbK.toString());
            map.remove(str);
        }
        Bundle bundle = this.f12763g;
        if (bundle.containsKey(str)) {
            StringBuilder sbK2 = k.k("Dropping pending result for request ", str, ": ");
            sbK2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbK2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f12759c;
        g gVar = (g) map2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f12756b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f12755a.b((r) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
