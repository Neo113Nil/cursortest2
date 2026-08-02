package L30;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f16512a;

    /* renamed from: b, reason: collision with root package name */
    private PdfRenderer f16513b;

    /* renamed from: c, reason: collision with root package name */
    private C7735q f16514c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f16515d;

    /* renamed from: e, reason: collision with root package name */
    private int f16516e;

    /* renamed from: f, reason: collision with root package name */
    private int f16517f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<Unit> f16518g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.base.utils.PdfBitmapRenderManager$1", f = "PdfBitmapRenderManager.kt", l = {52}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16519d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f16520e;

        /* renamed from: L30.l$a$a, reason: collision with other inner class name */
        static final class C0312a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f16522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f16523b;

            C0312a(l lVar, M m11) {
                this.f16522a = lVar;
                this.f16523b = m11;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                b bVar = (b) obj;
                l lVar = this.f16522a;
                Bitmap bitmap = null;
                try {
                    Bitmap c11 = l.c(lVar, bVar.a());
                    if (c11 == null) {
                        lVar.e().setValue(Unit.f71690a);
                    } else {
                        bitmap = c11;
                    }
                } catch (Exception e11) {
                    L80.a.c("PdfBitmapRenderer", "Error while render page " + bVar.a(), e11);
                    lVar.e().setValue(Unit.f71690a);
                }
                if (bitmap != null) {
                    bVar.b().setValue(bitmap);
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = l.this.new a(dVar);
            aVar.f16520e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16519d;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.f16520e;
                l lVar = l.this;
                C0 c02 = lVar.f16515d;
                C0312a c0312a = new C0312a(lVar, m11);
                this.f16519d = 1;
                if (c02.collect(c0312a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f16524a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final x0<Bitmap> f16525b;

        public b(int i11, @NotNull x0<Bitmap> mutableStateFlow) {
            Intrinsics.checkNotNullParameter(mutableStateFlow, "mutableStateFlow");
            this.f16524a = i11;
            this.f16525b = mutableStateFlow;
        }

        public final int a() {
            return this.f16524a;
        }

        @NotNull
        public final x0<Bitmap> b() {
            return this.f16525b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16524a == bVar.f16524a && Intrinsics.d(this.f16525b, bVar.f16525b);
        }

        public final int hashCode() {
            return this.f16525b.hashCode() + (Integer.hashCode(this.f16524a) * 31);
        }

        @NotNull
        public final String toString() {
            return "PdfRenderRequest(index=" + this.f16524a + ", mutableStateFlow=" + this.f16525b + ")";
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<PdfRenderer.Page, Bitmap> {
        @Override // kotlin.jvm.functions.Function1
        public final Bitmap invoke(PdfRenderer.Page page) {
            PdfRenderer.Page p02 = page;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((l) this.receiver).getClass();
            return Bitmap.createBitmap(p02.getWidth() * 3, p02.getHeight() * 3, Bitmap.Config.ARGB_8888);
        }
    }

    /* synthetic */ class d extends C7735q implements Function1<PdfRenderer.Page, Bitmap> {
        @Override // kotlin.jvm.functions.Function1
        public final Bitmap invoke(PdfRenderer.Page page) {
            PdfRenderer.Page p02 = page;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return l.a((l) this.receiver, p02);
        }
    }

    /* synthetic */ class e extends C7735q implements Function1<PdfRenderer.Page, Bitmap> {
        @Override // kotlin.jvm.functions.Function1
        public final Bitmap invoke(PdfRenderer.Page page) {
            PdfRenderer.Page p02 = page;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((l) this.receiver).getClass();
            return Bitmap.createBitmap(p02.getWidth(), p02.getHeight(), Bitmap.Config.ARGB_8888);
        }
    }

    public l(@NotNull Context context, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f16512a = context;
        this.f16515d = E0.b(0, 5, null, 5);
        this.f16518g = O0.a(null);
        C10727i.c(appCoroutineScopes.b(), null, null, new a(null), 3);
    }

    public static final Bitmap a(l lVar, PdfRenderer.Page page) {
        lVar.getClass();
        double width = (page.getWidth() * 1.0d) / page.getHeight();
        int i11 = lVar.f16516e;
        double d11 = i11;
        int i12 = lVar.f16517f;
        double d12 = i12;
        if (width > (1.0d * d11) / d12) {
            i12 = (int) (d11 / width);
        } else {
            i11 = (int) (d12 * width);
        }
        return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    public static final Bitmap c(l lVar, int i11) {
        Bitmap bitmap;
        lVar.getClass();
        L80.a.a("PdfBitmapRenderer", "Render next page " + i11);
        PdfRenderer pdfRenderer = lVar.f16513b;
        if (pdfRenderer != null && i11 >= 0 && i11 < pdfRenderer.getPageCount()) {
            PdfRenderer.Page openPage = pdfRenderer.openPage(i11);
            Intrinsics.checkNotNullExpressionValue(openPage, "openPage(...)");
            ?? r32 = lVar.f16514c;
            if (r32 != 0 && (bitmap = (Bitmap) r32.invoke(openPage)) != null) {
                openPage.render(bitmap, null, null, 1);
                openPage.close();
                return bitmap;
            }
        }
        return null;
    }

    public final void d() {
        try {
            PdfRenderer pdfRenderer = this.f16513b;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
        } catch (Exception e11) {
            L80.a.c("PdfBitmapRenderer", "Error while close pdfRenderer", e11);
        } finally {
            this.f16513b = null;
        }
    }

    @NotNull
    public final x0<Unit> e() {
        return this.f16518g;
    }

    public final int f() {
        PdfRenderer pdfRenderer = this.f16513b;
        if (pdfRenderer != null) {
            return pdfRenderer.getPageCount();
        }
        return 1;
    }

    public final boolean g(@NotNull File file, String str) {
        l lVar;
        C7735q eVar;
        C7735q c7735q;
        Intrinsics.checkNotNullParameter(file, "file");
        if (this.f16514c == null) {
            if (Intrinsics.d(str, "medium")) {
                c7735q = new c(1, this, l.class, "createBitmapMedium", "createBitmapMedium(Landroid/graphics/pdf/PdfRenderer$Page;)Landroid/graphics/Bitmap;", 0);
                lVar = this;
            } else {
                if (Intrinsics.d(str, "high")) {
                    eVar = new d(1, this, l.class, "createBitmapHigh", "createBitmapHigh(Landroid/graphics/pdf/PdfRenderer$Page;)Landroid/graphics/Bitmap;", 0);
                    lVar = this;
                } else {
                    lVar = this;
                    eVar = new e(1, lVar, l.class, "createBitmapLow", "createBitmapLow(Landroid/graphics/pdf/PdfRenderer$Page;)Landroid/graphics/Bitmap;", 0);
                }
                c7735q = eVar;
            }
            lVar.f16514c = c7735q;
        } else {
            lVar = this;
        }
        PdfRenderer pdfRenderer = null;
        lVar.f16518g.setValue(null);
        PdfRenderer pdfRenderer2 = lVar.f16513b;
        if (pdfRenderer2 == null) {
            try {
                ParcelFileDescriptor openFileDescriptor = lVar.f16512a.getContentResolver().openFileDescriptor(Uri.fromFile(file), "r");
                if (openFileDescriptor != null) {
                    pdfRenderer = new PdfRenderer(openFileDescriptor);
                }
            } catch (Exception e11) {
                L80.a.c("PdfBitmapRenderer", "Error while init pdfRenderer", e11);
            }
            pdfRenderer2 = pdfRenderer;
        }
        lVar.f16513b = pdfRenderer2;
        return pdfRenderer2 != null;
    }

    public final void h(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f16515d.tryEmit(request);
    }

    public final void i(int i11) {
        this.f16517f = i11;
    }

    public final void j(int i11) {
        this.f16516e = i11;
    }
}
