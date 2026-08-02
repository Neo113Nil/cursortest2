package C;

import android.os.Build;
import android.os.Bundle;
import androidx.concurrent.futures.b;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes8.dex */
public final /* synthetic */ class i0 implements b.c, androidx.fragment.app.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4196b;

    public /* synthetic */ i0(AtomicReference atomicReference, String str) {
        this.f4195a = atomicReference;
        this.f4196b = str;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f4195a).set(aVar);
        return o0.c(new StringBuilder(), (String) this.f4196b, "-cancellation");
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        Hi.k kVar;
        Hi.a aVar;
        Object parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            parcelable2 = bundle.getParcelable("media_arg", Hi.k.class);
            kVar = (Hi.k) parcelable2;
        } else {
            kVar = (Hi.k) bundle.getParcelable("media_arg");
        }
        if (kVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (i11 >= 33) {
            parcelable = bundle.getParcelable("CAMERA_RESTORABLE_STATE_ARG", Hi.a.class);
            aVar = (Hi.a) parcelable;
        } else {
            aVar = (Hi.a) bundle.getParcelable("CAMERA_RESTORABLE_STATE_ARG");
        }
        if (aVar == null) {
            return;
        }
        GalleryActivity activity = (GalleryActivity) this.f4195a;
        Hi.i f83802j = activity.getF83802j();
        if (f83802j == null) {
            f83802j = new Hi.i((Hi.j) null, (Long) null, 0, 0, kotlin.collections.K.f71697a, 1, 64);
        }
        Hi.i a11 = Hi.i.a(f83802j, aVar);
        Ci.k kVar2 = (Ci.k) this.f4196b;
        if (kVar2.d().h() > 1 && kVar2.d().f().g() != Ci.l.ON_RESULT_CALLBACK) {
            activity.getSupportFragmentManager().P0();
            activity.Q(kVar);
        } else {
            if (kVar2.d().f().g() == Ci.l.ON_RESULT_CALLBACK) {
                kVar2.d().f().f().invoke(new Hi.f(C7714v.a0(kVar), a11));
                return;
            }
            Hi.f result = new Hi.f(C7714v.a0(kVar), a11);
            List<? extends Hi.k> legacyMedia = C7714v.a0(kVar);
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(legacyMedia, "legacyMedia");
            activity.L(result, legacyMedia);
        }
    }

    public /* synthetic */ i0(GalleryActivity galleryActivity, Ti.i iVar, Ci.k kVar) {
        this.f4195a = galleryActivity;
        this.f4196b = kVar;
    }
}
