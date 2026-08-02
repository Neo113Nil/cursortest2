package Oe0;

import B0.A0;
import De.C2862e;
import De.s;
import Le0.w;
import Sc.o;
import Ve.C4598rp;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Style;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import te0.C9867b;
import ue0.InterfaceC10046c;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;
import xe.C10720e0;
import xe.N;
import xe0.j;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f20328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f20329b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20330c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final HashMap f20331d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f20332e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f20333f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Oe0.e f20334g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Oe0.a f20335h;

    protected abstract class a {
        public a() {
        }

        @NotNull
        protected final C0411d a(C0411d c0411d, @NotNull String newResourceName, @NotNull Bitmap newBitmap) {
            Intrinsics.checkNotNullParameter(newResourceName, "newResourceName");
            Intrinsics.checkNotNullParameter(newBitmap, "newBitmap");
            d dVar = d.this;
            if (c0411d != null) {
                dVar.k(c0411d.d());
                return c0411d;
            }
            C0411d c0411d2 = new C0411d(newBitmap, newResourceName);
            dVar.f().put(newResourceName, c0411d2);
            dVar.j(newResourceName);
            return c0411d2;
        }

        @NotNull
        public abstract C0411d b(@NotNull InterfaceC10542A.b bVar);

        @NotNull
        public abstract C0411d c(@NotNull InterfaceC10542A.c cVar);
    }

    private final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private int f20337b;

        public b() {
            super();
        }

        private final C0411d d(Bitmap bitmap, String str) {
            Bitmap b11;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            CRC32 crc32 = new CRC32();
            boolean z11 = false;
            crc32.update(allocate.array(), 0, bitmap.getByteCount());
            String e11 = U7.d.e(str, String.valueOf(crc32.getValue()));
            C0411d c0411d = (C0411d) d.this.f().get(e11);
            if (c0411d != null && (b11 = c0411d.b()) != null) {
                z11 = b11.sameAs(bitmap);
            }
            if (c0411d != null && !z11) {
                e11 = C4598rp.c(this.f20337b, e11, "_");
                this.f20337b++;
                c0411d = null;
            }
            return a(c0411d, e11, bitmap);
        }

        @Override // Oe0.d.a
        @NotNull
        public final C0411d b(@NotNull InterfaceC10542A.b placemarkCustomView) {
            Intrinsics.checkNotNullParameter(placemarkCustomView, "placemarkCustomView");
            return d(d.b(d.this, placemarkCustomView.a().invoke()), "view-");
        }

        @Override // Oe0.d.a
        @NotNull
        public final C0411d c(@NotNull InterfaceC10542A.c placemarkImage) {
            Intrinsics.checkNotNullParameter(placemarkImage, "placemarkImage");
            return d(placemarkImage.a(), "image-");
        }
    }

    private final class c extends a {
        public c() {
            super();
        }

        @Override // Oe0.d.a
        @NotNull
        public final C0411d b(@NotNull InterfaceC10542A.b placemarkCustomView) {
            Intrinsics.checkNotNullParameter(placemarkCustomView, "placemarkCustomView");
            Bitmap b11 = d.b(d.this, placemarkCustomView.a().invoke());
            return a(null, Nk.a.b("view-", String.valueOf(b11.hashCode())), b11);
        }

        @Override // Oe0.d.a
        @NotNull
        public final C0411d c(@NotNull InterfaceC10542A.c placemarkImage) {
            Intrinsics.checkNotNullParameter(placemarkImage, "placemarkImage");
            String b11 = Nk.a.b("image-", String.valueOf(placemarkImage.a().hashCode()));
            return a((C0411d) d.this.f().get(b11), b11, placemarkImage.a());
        }
    }

    /* renamed from: Oe0.d$d, reason: collision with other inner class name */
    public static class C0411d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20340a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Bitmap f20341b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20342c;

        public C0411d(Bitmap bitmap, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f20340a = name;
            this.f20341b = bitmap;
            this.f20342c = true;
        }

        @NotNull
        public static String a(@NotNull PointF contentAnchor) {
            Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
            float f7 = contentAnchor.x;
            if (f7 < 0.5f) {
                float f11 = contentAnchor.y;
                return f11 < 0.5f ? "top-left" : f11 == 0.5f ? "left" : f11 > 0.5f ? "bottom-left" : RichContentDTO.ALIGN_CENTER;
            }
            if (f7 == 0.5f) {
                float f12 = contentAnchor.y;
                return f12 < 0.5f ? "top" : (f12 != 0.5f && f12 > 0.5f) ? "bottom" : RichContentDTO.ALIGN_CENTER;
            }
            if (f7 <= 0.5f) {
                return RichContentDTO.ALIGN_CENTER;
            }
            float f13 = contentAnchor.y;
            return f13 < 0.5f ? "top-right" : f13 == 0.5f ? "right" : f13 > 0.5f ? "bottom-right" : RichContentDTO.ALIGN_CENTER;
        }

        @NotNull
        public final Bitmap b() {
            return this.f20341b;
        }

        @NotNull
        public final Float[] c(@NotNull PointF contentAnchor) {
            float f7;
            Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
            float f11 = contentAnchor.x;
            float f12 = 0.0f;
            boolean z11 = f11 == 0.0f || f11 == 0.5f || f11 == 1.0f;
            Bitmap bitmap = this.f20341b;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = (f11 < 0.5f ? -f11 : 1.0f - f11) * ((int) Math.ceil(bitmap.getWidth() / Resources.getSystem().getDisplayMetrics().density));
            }
            float f13 = contentAnchor.y;
            if (f13 != 0.0f && f13 != 0.5f && f13 != 1.0f) {
                f12 = ((int) Math.ceil(bitmap.getHeight() / Resources.getSystem().getDisplayMetrics().density)) * (f13 < 0.5f ? -f13 : 1.0f - f13);
            }
            return new Float[]{Float.valueOf(f7), Float.valueOf(f12)};
        }

        @NotNull
        public final String d() {
            return this.f20340a;
        }

        public final boolean e() {
            return this.f20342c;
        }

        public final void f() {
            this.f20342c = false;
        }
    }

    public static final class e extends TimerTask {
        e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            d.this.f20335h.b();
        }
    }

    public d(boolean z11, @NotNull MapLibreMap mapLibreMap, @NotNull w mapView, @NotNull j pinSelectSynchronizer, boolean z12) {
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        this.f20328a = mapLibreMap;
        this.f20329b = pinSelectSynchronizer;
        this.f20330c = z12;
        this.f20331d = new HashMap();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f20332e = N.a(s.f6650a.x());
        this.f20333f = z11 ? new b() : new c();
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.f(createBitmap);
        this.f20334g = new Oe0.e(createBitmap, "");
        Oe0.a aVar = new Oe0.a();
        this.f20335h = aVar;
        mapView.addOnStyleImageMissingListener(new MapView.OnStyleImageMissingListener() { // from class: Oe0.c
            @Override // org.maplibre.android.maps.MapView.OnStyleImageMissingListener
            public final void i(String str) {
                d.a(d.this, str);
            }
        });
        mapView.addOnCanRemoveUnusedStyleImageListener(aVar);
    }

    public static void a(d dVar, String it) {
        Bitmap b11;
        Style u11;
        Intrinsics.checkNotNullParameter(it, "it");
        dVar.getClass();
        if (it.length() == 0 || kotlin.text.h.K(it)) {
            return;
        }
        C9867b c9867b = C9867b.f99466a;
        C9867b.g(A0.b("Error while loading bitmap resource ", it, ", trying again"), InterfaceC10046c.a.INFO, 4);
        C0411d c0411d = (C0411d) dVar.f20331d.get(it);
        if (c0411d == null || (b11 = c0411d.b()) == null || (u11 = dVar.f20328a.u()) == null) {
            return;
        }
        u11.p(it);
        u11.a(b11, it);
        C9867b.g("Reload of resource " + it + " done", null, 6);
    }

    public static final Bitmap b(d dVar, View view) {
        dVar.getClass();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public void d(long j11) {
        if (j11 == 0) {
            this.f20335h.b();
        } else {
            new Timer().schedule(new e(), j11);
        }
    }

    @NotNull
    protected final MapLibreMap e() {
        return this.f20328a;
    }

    @NotNull
    protected final HashMap f() {
        return this.f20331d;
    }

    @NotNull
    protected final C2862e g() {
        return this.f20332e;
    }

    @NotNull
    public final ArrayList h(@NotNull Collection placemarks) {
        Style u11;
        C0411d c0411d;
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = placemarks.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            z c11 = this.f20329b.c(uVar);
            InterfaceC10542A d11 = c11.d();
            boolean z11 = d11 instanceof InterfaceC10542A.b;
            a aVar = this.f20333f;
            if (z11) {
                c0411d = aVar.b((InterfaceC10542A.b) c11.d());
            } else if (d11 instanceof InterfaceC10542A.c) {
                c0411d = aVar.c((InterfaceC10542A.c) c11.d());
            } else {
                if (!(d11 instanceof InterfaceC10542A.a) && !Intrinsics.d(d11, InterfaceC10542A.d.f104404a)) {
                    throw new o();
                }
                c0411d = this.f20334g;
            }
            if (c0411d.e()) {
                c0411d.f();
                hashMap.put(c0411d.d(), c0411d.b());
            }
            arrayList.add(new Pair(uVar, c0411d));
        }
        Set<String> keySet = hashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        for (String str : keySet) {
            Intrinsics.f(str);
            this.f20335h.a(str);
        }
        try {
            if (hashMap.isEmpty()) {
                hashMap = null;
            }
            if (hashMap != null && (u11 = this.f20328a.u()) != null) {
                u11.b(hashMap);
                return arrayList;
            }
        } catch (Exception e11) {
            C9867b c9867b = C9867b.f99466a;
            String message = e11.getMessage();
            if (message == null) {
                message = e11;
            }
            C9867b.f("Error while loading image resource " + ((Object) message), e11, InterfaceC10046c.a.INFO);
        }
        return arrayList;
    }

    protected final boolean i() {
        return this.f20330c;
    }

    protected void j(@NotNull String newResourceName) {
        Intrinsics.checkNotNullParameter(newResourceName, "newResourceName");
    }

    protected void k(@NotNull String existResourceName) {
        Intrinsics.checkNotNullParameter(existResourceName, "existResourceName");
    }

    public void l(@NotNull String resourceName) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        this.f20335h.c(resourceName);
        this.f20331d.remove(resourceName);
    }
}
