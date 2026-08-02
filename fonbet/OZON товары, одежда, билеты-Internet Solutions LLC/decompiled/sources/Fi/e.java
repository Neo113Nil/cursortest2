package Fi;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import Hi.k;
import Ri.C3933a;
import Sc.o;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import h.AbstractC6755a;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f9490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final B0<Hi.f> f9491b = C2399j.a(E0.b(0, 3, null, 5));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final B0<d> f9492c = C2399j.a(E0.b(0, 3, null, 5));

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9493d = 0;

    static final class a extends AbstractC7737t implements Function2<String, Uri, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GalleryActivity f9494b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GalleryActivity galleryActivity) {
            super(2);
            this.f9494b = galleryActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Uri uri) {
            long j11;
            Uri mediaStoreUri = uri;
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(mediaStoreUri, "mediaStoreUri");
            try {
                j11 = ContentUris.parseId(mediaStoreUri);
            } catch (NumberFormatException | UnsupportedOperationException unused) {
                j11 = -1;
            }
            if (j11 != -1) {
                this.f9494b.S(C7714v.a0(Long.valueOf(j11)));
            }
            return Unit.f71690a;
        }
    }

    @NotNull
    public static B0 a() {
        return f9492c;
    }

    public static void b(@NotNull GalleryActivity activity, int i11, int i12, Intent intent) throws IllegalArgumentException {
        AbstractC6755a abstractC6755a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        switch (i11) {
            case 70001:
                abstractC6755a = Bi.f.f3810a;
                break;
            case 70002:
                abstractC6755a = Bi.e.f3809a;
                break;
            case 70003:
                abstractC6755a = Bi.d.f3808a;
                break;
            default:
                throw new IllegalArgumentException("Unsupported result");
        }
        boolean booleanValue = ((Boolean) abstractC6755a.c(i12, intent)).booleanValue();
        File f83801i = activity.getF83801i();
        activity.R(null);
        if (booleanValue) {
            if (f83801i != null) {
                c.e(activity, f83801i, new a(activity));
            }
        } else if (f83801i != null) {
            f83801i.delete();
        }
    }

    public static void c(@NotNull GalleryActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3933a c3933a = new C3933a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SELECT_ARG", false);
        c3933a.setArguments(bundle);
        c3933a.show(activity.getSupportFragmentManager(), C3933a.class.getSimpleName());
    }

    public static void d(@NotNull GalleryActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bi.f fVar = Bi.f.f3810a;
        File a11 = c.a(f9490a);
        Intent a12 = fVar.a(activity, c.c(activity, a11));
        activity.R(a11);
        activity.startActivityForResult(a12, 70001);
    }

    public static void e(@NotNull GalleryActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bi.e eVar = Bi.e.f3809a;
        File b11 = c.b(f9490a);
        Intent a11 = eVar.a(activity, c.c(activity, b11));
        activity.R(b11);
        activity.startActivityForResult(a11, 70002);
    }

    public static void f(@NotNull GalleryActivity context, @NotNull k media) {
        String str;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        if (media instanceof k.a) {
            str = "image/*";
        } else {
            if (!(media instanceof k.b)) {
                throw new o();
            }
            str = "video/*";
        }
        Intent addFlags = new Intent("android.intent.action.VIEW").setDataAndType(media.getUri(), str).putExtra("android.intent.extra.STREAM", media.getUri()).addFlags(1);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.ResolveInfoFlags.of(65536);
            queryIntentActivities = packageManager.queryIntentActivities(addFlags, of2);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(addFlags, 65536);
        }
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "run(...)");
        if (queryIntentActivities.isEmpty()) {
            return;
        }
        context.startActivity(addFlags);
    }

    public static void g(String str) {
        f9490a = str;
    }
}
