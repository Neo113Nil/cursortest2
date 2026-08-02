package Ri;

import Sc.InterfaceC4008j;
import Sc.k;
import Ti.j;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRi/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "ozon-gallery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Ri.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3933a extends com.google.android.material.bottomsheet.b {

    /* renamed from: c, reason: collision with root package name */
    private static final float f25108c = UiExtKt.toPxF(16.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25109d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25110a = k.b(new b());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f25111b = k.b(new C0503a());

    /* renamed from: Ri.a$a, reason: collision with other inner class name */
    static final class C0503a extends AbstractC7737t implements Function0<Ii.c> {
        C0503a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ii.c invoke() {
            Ii.c a11 = Ii.c.a(C3933a.this.requireView());
            Intrinsics.checkNotNullExpressionValue(a11, "bind(...)");
            return a11;
        }
    }

    /* renamed from: Ri.a$b */
    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle arguments = C3933a.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("SELECT_ARG", false) : false);
        }
    }

    public static final void t(C3933a c3933a, AtomAction atomAction, Function1 function1) {
        if (atomAction instanceof AtomAction.Click) {
            r activity = c3933a.getActivity();
            GalleryActivity galleryActivity = activity instanceof GalleryActivity ? (GalleryActivity) activity : null;
            if (galleryActivity != null) {
                function1.invoke(galleryActivity);
                c3933a.dismiss();
            }
        }
    }

    static void u(C3933a c3933a, CellView cellView, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        Drawable background = cellView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, f11, f11, f11, f11});
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R.style.RoundedBottomSheetTheme;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.camera_chooser_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC4008j interfaceC4008j = this.f25111b;
        Ii.c cVar = (Ii.c) interfaceC4008j.getValue();
        CellView takePhotoCV = cVar.f12558c;
        Intrinsics.checkNotNullExpressionValue(takePhotoCV, "takePhotoCV");
        String string = getResources().getString(R.string.gallery_take_photo_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterfaceC4008j interfaceC4008j2 = this.f25110a;
        CellHolderKt.bind(takePhotoCV, j.c(string, ((Boolean) interfaceC4008j2.getValue()).booleanValue()), new C3935c(this));
        CellView takeVideoCV = cVar.f12559d;
        Intrinsics.checkNotNullExpressionValue(takeVideoCV, "takeVideoCV");
        String string2 = getResources().getString(R.string.gallery_take_video_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CellHolderKt.bind(takeVideoCV, j.d(string2, ((Boolean) interfaceC4008j2.getValue()).booleanValue()), new C3937e(this));
        CellView takePhotoCV2 = cVar.f12558c;
        Intrinsics.checkNotNullExpressionValue(takePhotoCV2, "takePhotoCV");
        float f7 = f25108c;
        u(this, takePhotoCV2, f7, 0.0f, 2);
        Intrinsics.checkNotNullExpressionValue(takeVideoCV, "takeVideoCV");
        u(this, takeVideoCV, 0.0f, f7, 1);
        Ii.c cVar2 = (Ii.c) interfaceC4008j.getValue();
        IconButtonV3View closeButton = cVar2.f12557b;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        IconButtonV3HolderKt.bind$default(closeButton, j.b(((Boolean) interfaceC4008j2.getValue()).booleanValue()), null, 2, null);
        cVar2.f12557b.setOnClickListener(new EX.c(this, 6));
    }
}
