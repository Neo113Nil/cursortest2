package bc;

import android.content.res.Resources;
import ec.AbstractC6342b;
import ec.C6341a;
import fc.C6496a;
import gc.C6707a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: bc.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5627c {

    /* renamed from: a, reason: collision with root package name */
    ExecutorService f55857a;

    /* renamed from: b, reason: collision with root package name */
    final HashMap f55858b = new HashMap(3);

    /* renamed from: c, reason: collision with root package name */
    final HashMap f55859c = new HashMap(3);

    /* renamed from: d, reason: collision with root package name */
    C5633i f55860d;

    /* renamed from: e, reason: collision with root package name */
    boolean f55861e;

    C5627c() {
        cc.d b11 = cc.d.b();
        if (this.f55861e) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        b11.getClass();
        Iterator it = Collections.singleton("data").iterator();
        while (it.hasNext()) {
            this.f55858b.put((String) it.next(), b11);
        }
        C6496a c6496a = new C6496a();
        if (this.f55861e) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        Iterator it2 = Arrays.asList("http", "https").iterator();
        while (it2.hasNext()) {
            this.f55858b.put((String) it2.next(), c6496a);
        }
        C6707a b12 = C6707a.b();
        if (this.f55861e) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        b12.getClass();
        Iterator it3 = Collections.singleton("image/svg+xml").iterator();
        while (it3.hasNext()) {
            this.f55859c.put((String) it3.next(), b12);
        }
        if (AbstractC6342b.a()) {
            C6341a b13 = C6341a.b();
            if (this.f55861e) {
                throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
            }
            Iterator it4 = b13.d().iterator();
            while (it4.hasNext()) {
                this.f55859c.put((String) it4.next(), b13);
            }
        }
        this.f55860d = new C5633i(Resources.getSystem());
    }
}
