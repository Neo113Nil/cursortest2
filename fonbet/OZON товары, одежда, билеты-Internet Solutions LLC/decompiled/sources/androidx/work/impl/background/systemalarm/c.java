package androidx.work.impl.background.systemalarm;

import B0.A0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.o;
import androidx.work.p;
import d5.C6089d;
import g5.C6627B;
import g5.S;
import i5.C7009b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f45379e = o.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f45380a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45381b;

    /* renamed from: c, reason: collision with root package name */
    private final f f45382c;

    /* renamed from: d, reason: collision with root package name */
    private final C6089d f45383d;

    c(@NonNull Context context, int i11, @NonNull f fVar) {
        this.f45380a = context;
        this.f45381b = i11;
        this.f45382c = fVar;
        this.f45383d = new C6089d(fVar.f().m(), null);
    }

    final void a() {
        f fVar = this.f45382c;
        ArrayList l11 = fVar.f().n().f().l();
        int i11 = ConstraintProxy.f45363b;
        Iterator it = l11.iterator();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (it.hasNext()) {
            androidx.work.d dVar = ((C6627B) it.next()).f63808j;
            z11 |= dVar.f();
            z12 |= dVar.g();
            z13 |= dVar.i();
            z14 |= dVar.d() != p.NOT_REQUIRED;
            if (z11 && z12 && z13 && z14) {
                break;
            }
        }
        String str = ConstraintProxyUpdateReceiver.f45364a;
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        Context context = this.f45380a;
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
        context.sendBroadcast(intent);
        C6089d c6089d = this.f45383d;
        c6089d.d(l11);
        ArrayList arrayList = new ArrayList(l11.size());
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = l11.iterator();
        while (it2.hasNext()) {
            C6627B c6627b = (C6627B) it2.next();
            String str2 = c6627b.f63799a;
            if (currentTimeMillis >= c6627b.a() && (!c6627b.e() || c6089d.a(str2))) {
                arrayList.add(c6627b);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C6627B c6627b2 = (C6627B) it3.next();
            String str3 = c6627b2.f63799a;
            Intent a11 = b.a(context, S.a(c6627b2));
            o.e().a(f45379e, A0.b("Creating a delay_met command for workSpec with id (", str3, ")"));
            ((C7009b) fVar.f45401b).b().execute(new f.b(this.f45381b, a11, fVar));
        }
        c6089d.e();
    }
}
