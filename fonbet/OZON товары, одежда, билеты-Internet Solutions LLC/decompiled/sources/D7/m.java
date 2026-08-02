package D7;

import B0.d2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    protected final n f6108a;

    /* renamed from: b, reason: collision with root package name */
    private final IntentFilter f6109b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6110c;

    /* renamed from: d, reason: collision with root package name */
    protected final HashSet f6111d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private l f6112e = null;

    protected m(n nVar, IntentFilter intentFilter, Context context) {
        this.f6108a = nVar;
        this.f6109b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f6110c = applicationContext != null ? applicationContext : context;
    }

    private final void e() {
        l lVar;
        HashSet hashSet = this.f6111d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.f6110c;
        if (!isEmpty && this.f6112e == null) {
            l lVar2 = new l(this);
            this.f6112e = lVar2;
            int i11 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f6109b;
            if (i11 >= 33) {
                context.registerReceiver(lVar2, intentFilter, 2);
            } else {
                context.registerReceiver(lVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (lVar = this.f6112e) == null) {
            return;
        }
        context.unregisterReceiver(lVar);
        this.f6112e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(E7.b bVar) {
        this.f6108a.d("registerListener", new Object[0]);
        d2.b(bVar, "Registered Play Core listener should not be null.");
        this.f6111d.add(bVar);
        e();
    }

    public final synchronized void c(E7.b bVar) {
        this.f6108a.d("unregisterListener", new Object[0]);
        d2.b(bVar, "Unregistered Play Core listener should not be null.");
        this.f6111d.remove(bVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.f6111d).iterator();
        while (it.hasNext()) {
            ((I7.a) it.next()).a(obj);
        }
    }
}
