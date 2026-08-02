package Ci;

import Di.C2872a;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cj.C5838a;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import ru.ozon.app.android.R;
import xi.C10779a;

/* renamed from: Ci.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2779a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f5057a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final h f5058b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final k f5059c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final k f5060d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C10779a f5061e;

    /* renamed from: Ci.a$a, reason: collision with other inner class name */
    static final class C0119a extends AbstractC7737t implements Function2<GalleryActivity, Hi.k, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0119a f5062b = new C0119a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GalleryActivity galleryActivity, Hi.k kVar) {
            GalleryActivity activity = galleryActivity;
            Hi.k media = kVar;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(media, "media");
            Fi.e.f(activity, media);
            return Unit.f71690a;
        }
    }

    /* renamed from: Ci.a$b */
    static final class b extends AbstractC7737t implements Function1<GalleryActivity, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5063b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GalleryActivity galleryActivity) {
            GalleryActivity activity = galleryActivity;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Fi.e.d(activity);
            return Unit.f71690a;
        }
    }

    /* renamed from: Ci.a$c */
    static final class c extends AbstractC7737t implements Function1<GalleryActivity, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5064b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(GalleryActivity galleryActivity) {
            GalleryActivity activity = galleryActivity;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Fi.e.d(activity);
            return Boolean.TRUE;
        }
    }

    /* renamed from: Ci.a$d */
    static final class d extends AbstractC7737t implements InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5065b = new d(4);

        @Override // fd.InterfaceC6512o
        public final Unit invoke(GalleryActivity galleryActivity, Integer num, Integer num2, Intent intent) {
            GalleryActivity activity = galleryActivity;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Fi.e.b(activity, num.intValue(), num2.intValue(), intent);
            return Unit.f71690a;
        }
    }

    /* renamed from: Ci.a$e */
    static final class e extends AbstractC7737t implements Function1<Context, RecyclerView.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5066b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final RecyclerView.o invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return new StaggeredGridLayoutManager(3, 1);
        }
    }

    /* renamed from: Ci.a$f */
    static final class f extends AbstractC7737t implements Function1<Context, List<? extends RecyclerView.n>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f5067b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends RecyclerView.n> invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return C7714v.a0(new Wi.a(context2));
        }
    }

    static {
        String b11 = C5838a.b(R.string.gallery_default_dir_name_android);
        f5057a = b11;
        h hVar = new h(50, 50, 150, true);
        f5058b = hVar;
        Ci.b mediaListConfig = new Ci.b(new g(null, null, null, 15), true, false, false, e.f5066b, f.f5067b, U.c(), 10, hVar, b11, null);
        K selectedIds = K.f71697a;
        Intrinsics.checkNotNullParameter(mediaListConfig, "mediaListConfig");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        i onBackNavigationClick = i.f5099b;
        Intrinsics.checkNotNullParameter(onBackNavigationClick, "onBackNavigationClick");
        j onActivityResult = j.f5100b;
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        Intrinsics.checkNotNullParameter(mediaListConfig, "mediaListConfig");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(onBackNavigationClick, "onBackNavigationClick");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        k kVar = new k(R.style.OzonGalleryTheme, 8000, null, mediaListConfig, selectedIds, onBackNavigationClick, onActivityResult, null, null);
        f5059c = kVar;
        f5060d = k.a(kVar, 0, null, Ci.b.a(kVar.d(), new g(C0119a.f5062b, b.f5063b, c.f5064b, 2), U.i(new Pair(1, new C2872a(2.0d))), 0, 1982), null, d.f5065b, 53);
        f5061e = new C10779a(C10779a.b.PHOTO);
    }

    @NotNull
    public static C10779a a() {
        return f5061e;
    }

    @NotNull
    public static k b() {
        return f5060d;
    }

    @NotNull
    public static String c() {
        return f5057a;
    }

    @NotNull
    public static k d() {
        return f5059c;
    }

    @NotNull
    public static h e() {
        return f5058b;
    }
}
