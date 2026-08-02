package Ub;

import If.c;
import Ub.d;
import Ub.f;
import Ub.k;
import Ub.o;
import Vb.r;
import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class e implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27482a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f27483b = new ArrayList(3);

    /* renamed from: c, reason: collision with root package name */
    private TextView.BufferType f27484c = TextView.BufferType.SPANNABLE;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27485d = true;

    e(@NonNull Context context) {
        this.f27482a = context;
    }

    @Override // Ub.d.a
    @NonNull
    public final d.a a(@NonNull a aVar) {
        this.f27483b.add(aVar);
        return this;
    }

    @Override // Ub.d.a
    @NonNull
    public final d build() {
        ArrayList arrayList = this.f27483b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList c11 = new q(arrayList).c();
        c.a aVar = new c.a();
        r.a e11 = Vb.r.e(this.f27482a);
        f.a aVar2 = new f.a();
        o.a aVar3 = new o.a();
        k.a aVar4 = new k.a();
        Iterator it = c11.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.configureParser(aVar);
            hVar.configureTheme(e11);
            hVar.configureConfiguration(aVar2);
            hVar.configureVisitor(aVar3);
            hVar.configureSpansFactory(aVar4);
        }
        m mVar = new m(aVar3, aVar2.i(e11.j(), aVar4.d()));
        return new g(this.f27484c, aVar.e(), mVar, Collections.unmodifiableList(c11), this.f27485d);
    }
}
