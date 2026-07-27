package P0;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2283a;

    public b(int i2) {
        switch (i2) {
            case 1:
                this.f2283a = new LinkedHashMap();
                break;
            default:
                this.f2283a = new LinkedHashMap();
                break;
        }
    }

    public void a(Y.a... migrations) {
        i.e(migrations, "migrations");
        for (Y.a aVar : migrations) {
            int i2 = aVar.f3659a;
            LinkedHashMap linkedHashMap = this.f2283a;
            Integer valueOf = Integer.valueOf(i2);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i3 = aVar.f3660b;
            if (treeMap.containsKey(Integer.valueOf(i3))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i3)) + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i3), aVar);
        }
    }
}
