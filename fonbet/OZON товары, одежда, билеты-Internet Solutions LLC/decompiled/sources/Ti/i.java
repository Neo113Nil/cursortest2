package Ti;

import Ci.C2779a;
import Ci.k;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import ru.ozon.app.android.R;
import xi.C10779a;
import zi.C11125b;

/* loaded from: classes10.dex */
public final class i {
    public static void a(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r activity = fragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static void b(@NotNull GalleryActivity activity, Hi.a aVar, boolean z11, C10779a c10779a) {
        Hi.a d11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C10779a a11 = c10779a == null ? C2779a.a() : c10779a;
        if (c10779a != null && (d11 = c10779a.d()) != null) {
            aVar = d11;
        }
        C10779a a12 = C10779a.a(a11, aVar);
        C11125b c11125b = new C11125b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("CAMERA_PAGE_CONFIG_ARG", a12);
        c11125b.setArguments(bundle);
        d(activity, new f(c11125b, z11));
    }

    public static void c(@NotNull GalleryActivity activity, @NotNull k pageConfig, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageConfig, "pageConfig");
        if (bundle != null) {
            return;
        }
        d(activity, new g(pageConfig));
        Hi.i h11 = pageConfig.h();
        if ((h11 != null ? h11.c() : null) != null) {
            b(activity, pageConfig.h().c(), true, pageConfig.g());
        }
    }

    private static void d(GalleryActivity galleryActivity, Function1 function1) {
        if (galleryActivity.isFinishing() || galleryActivity.isDestroyed()) {
            return;
        }
        G supportFragmentManager = galleryActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Q p11 = supportFragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        function1.invoke(p11);
        p11.i();
    }

    public static void e(i iVar, Activity context, int i11, int i12, DialogInterface.OnClickListener onClickListener, e eVar, int i13) {
        if ((i13 & 64) != 0) {
            eVar = null;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        f.a aVar = new f.a(context);
        aVar.e(i11);
        aVar.p(R.string.gallery_permissions_dialog_title_android);
        aVar.setPositiveButton(i12, onClickListener).setNegativeButton(R.string.gallery_cancel_button_android, eVar).b(false).q();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Ti.e] */
    public final void f(@NotNull r activity, @NotNull final Function0 negativeAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(negativeAction, "negativeAction");
        e(this, activity, R.string.gallery_permissions_dialog_settings_text_android, R.string.gallery_permissions_settings_android, new d(activity, 0), new DialogInterface.OnClickListener() { // from class: Ti.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                Function0.this.invoke();
            }
        }, 32);
    }
}
