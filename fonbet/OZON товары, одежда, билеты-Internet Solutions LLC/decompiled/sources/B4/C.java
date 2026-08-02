package B4;

import B4.H;
import B4.L;
import B4.L.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import g.C6594f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f2490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Intent f2491b;

    /* renamed from: c, reason: collision with root package name */
    private L f2492c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f2493d;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f2494a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f2495b;

        public a(int i11, Bundle bundle) {
            this.f2494a = i11;
            this.f2495b = bundle;
        }

        public final Bundle a() {
            return this.f2495b;
        }

        public final int b() {
            return this.f2494a;
        }
    }

    public C(@NotNull C2584m navController) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Context context = navController.u();
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2490a = context;
        Activity activity = (Activity) kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.q(context, D.f2496b), E.f2497b));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f2491b = launchIntentForPackage;
        this.f2493d = new ArrayList();
        this.f2492c = navController.A();
    }

    private final H c(int i11) {
        C7704k c7704k = new C7704k();
        L l11 = this.f2492c;
        Intrinsics.f(l11);
        c7704k.addLast(l11);
        while (!c7704k.isEmpty()) {
            H h11 = (H) c7704k.removeFirst();
            if (h11.m() == i11) {
                return h11;
            }
            if (h11 instanceof L) {
                L.a aVar = ((L) h11).new a();
                while (aVar.hasNext()) {
                    c7704k.addLast((H) aVar.next());
                }
            }
        }
        return null;
    }

    public static void e(C c11, int i11) {
        ArrayList arrayList = c11.f2493d;
        arrayList.clear();
        arrayList.add(new a(i11, null));
        if (c11.f2492c != null) {
            c11.f();
        }
    }

    private final void f() {
        Iterator it = this.f2493d.iterator();
        while (it.hasNext()) {
            int b11 = ((a) it.next()).b();
            if (c(b11) == null) {
                int i11 = H.f2506k;
                StringBuilder b12 = C6594f.b("Navigation destination ", H.a.a(b11, this.f2490a), " cannot be found in the navigation graph ");
                b12.append(this.f2492c);
                throw new IllegalArgumentException(b12.toString());
            }
        }
    }

    @NotNull
    public final void a(int i11, Bundle bundle) {
        this.f2493d.add(new a(i11, bundle));
        if (this.f2492c != null) {
            f();
        }
    }

    @NotNull
    public final androidx.core.app.v b() {
        L l11 = this.f2492c;
        if (l11 == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.f2493d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        H h11 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            Context context = this.f2490a;
            int i11 = 0;
            if (!hasNext) {
                int[] T02 = C7714v.T0(arrayList2);
                Intent intent = this.f2491b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", T02);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                androidx.core.app.v e11 = androidx.core.app.v.e(context);
                e11.a(new Intent(intent));
                Intrinsics.checkNotNullExpressionValue(e11, "create(context).addNextI…rentStack(Intent(intent))");
                int g10 = e11.g();
                while (i11 < g10) {
                    Intent f7 = e11.f(i11);
                    if (f7 != null) {
                        f7.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i11++;
                }
                return e11;
            }
            a aVar = (a) it.next();
            int b11 = aVar.b();
            Bundle a11 = aVar.a();
            H c11 = c(b11);
            if (c11 == null) {
                int i12 = H.f2506k;
                throw new IllegalArgumentException("Navigation destination " + H.a.a(b11, context) + " cannot be found in the navigation graph " + l11);
            }
            int[] h12 = c11.h(h11);
            int length = h12.length;
            while (i11 < length) {
                arrayList2.add(Integer.valueOf(h12[i11]));
                arrayList3.add(a11);
                i11++;
            }
            h11 = c11;
        }
    }

    @NotNull
    public final void d(Bundle bundle) {
        this.f2491b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
    }
}
