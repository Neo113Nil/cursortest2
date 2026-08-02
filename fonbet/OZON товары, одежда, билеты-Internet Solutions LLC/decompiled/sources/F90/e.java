package F90;

import Ae.O0;
import Ae.x0;
import B90.h0;
import B90.m0;
import Ca.o;
import Ca.p;
import Ca.q;
import Ca.r;
import Sc.s;
import T80.c;
import android.content.Context;
import d40.InterfaceC6083a;
import e40.C6293a;
import h3.C6788a;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class e extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f9161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f9162b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f9163c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9164d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f9165e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f9166f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<x90.c> f9167g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<x90.b> f9168h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.scanner.ScannerSettingsViewModel$onStart$2$1$1", f = "ScannerSettingsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f9169d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9169d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f9169d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            File file = this.f9169d;
            if (file.exists()) {
                file.delete();
            }
            return Unit.f71690a;
        }
    }

    public e(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f9161a = context;
        this.f9162b = fintechNavigation;
        this.f9163c = exchanger;
        this.f9165e = "RETURN_VALUE";
        this.f9166f = TakePhotoRequest.QR_SCANNER_TYPE;
        FinToolbarState finToolbarState = new FinToolbarState(context.getString(R.string.fintech_preference_qr_scanner_settings_title), null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new m0(this, 1), null, null, null, null, 17, 61950, null);
        String string = context.getString(R.string.fintech_preference_settings_start_button);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f9167g = O0.a(new x90.c(finToolbarState, new FinLargeButtonState("goto", string, new d(this, 0), null, null, null, null, null, null, 504, null)));
        this.f9168h = O0.a(null);
    }

    public static Unit d0(e eVar) {
        eVar.f9165e = "TRY_TO_GO_TO";
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit e0(e eVar) {
        eVar.f9164d = false;
        eVar.f9165e = "PHOTO";
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit f0(e eVar) {
        eVar.f9166f = "QR_AND_BARCODE";
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit g0(e eVar) {
        eVar.f9165e = "RETURN_VALUE";
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit h0(e eVar) {
        eVar.f9162b.pop();
        return Unit.f71690a;
    }

    public static Unit i0(e eVar) {
        eVar.f9166f = TakePhotoRequest.QR_SCANNER_TYPE;
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit j0(e eVar, e40.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        H30.e.c(eVar.f9161a, "Qr считан: " + it.a());
        return Unit.f71690a;
    }

    public static Unit k0(e eVar) {
        eVar.f9166f = TakePhotoRequest.BARCODE_SCANNER_TYPE;
        eVar.s0();
        return Unit.f71690a;
    }

    public static Unit l0(e eVar, C6293a photoFile) {
        Intrinsics.checkNotNullParameter(photoFile, "photoFile");
        Context context = eVar.f9161a;
        File d11 = photoFile.d();
        H30.e.c(context, "Получена фотография: " + (d11 != null ? d11.getName() : null));
        File d12 = photoFile.d();
        if (d12 != null) {
            C6788a a11 = androidx.lifecycle.x0.a(eVar);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new a(d12, null), 2);
        }
        return Unit.f71690a;
    }

    public static Unit m0(e eVar) {
        c.a.a(eVar.f9162b, eVar.f9166f, null, eVar.f9165e, false, null, eVar.f9164d, false, null, null, null, null, null, null, false, null, null, null, 131034);
        return Unit.f71690a;
    }

    private final void s0() {
        this.f9168h.setValue(new x90.b(new FinRadioButtonState(R.string.fintech_preference_qr_mode, null, Intrinsics.d(this.f9166f, TakePhotoRequest.QR_SCANNER_TYPE), 0, null, null, new o(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_barcode_mode, null, Intrinsics.d(this.f9166f, TakePhotoRequest.BARCODE_SCANNER_TYPE), 0, null, null, new p(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_mix_mode, null, Intrinsics.d(this.f9166f, "QR_AND_BARCODE"), 0, null, null, new q(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_try_to_go, null, Intrinsics.d(this.f9165e, "TRY_TO_GO_TO"), 0, null, null, new Function1() { // from class: F90.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d0(e.this);
            }
        }, 56, null), new FinRadioButtonState(R.string.fintech_preference_return_value, null, Intrinsics.d(this.f9165e, "RETURN_VALUE"), 0, null, null, new c(this, 0), 56, null), new FinRadioButtonState(R.string.fintech_preference_photo_value, null, Intrinsics.d(this.f9165e, "PHOTO"), 0, null, null, new h0(this, 1), 56, null), this.f9164d));
    }

    @NotNull
    public final x0<x90.b> n0() {
        return this.f9168h;
    }

    public final void onStart() {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        r rVar = new r(this, 1);
        InterfaceC6083a interfaceC6083a = this.f9163c;
        interfaceC6083a.e(e40.c.class, a11, true, rVar);
        interfaceC6083a.e(C6293a.class, androidx.lifecycle.x0.a(this), true, new C90.d(this, 2));
    }

    public final void onStop() {
        InterfaceC6083a interfaceC6083a = this.f9163c;
        interfaceC6083a.d(e40.c.class);
        interfaceC6083a.d(C6293a.class);
    }

    @NotNull
    public final x0<x90.c> p0() {
        return this.f9167g;
    }

    public final void q0() {
        s0();
    }

    public final void r0(boolean z11) {
        this.f9164d = z11;
        s0();
    }
}
