package K40;

import Sc.o;
import android.os.Parcelable;
import e50.InterfaceC6302a;
import j50.InterfaceC7285a;
import java.util.LinkedHashSet;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import u50.InterfaceC9967b;
import x40.C10656a;
import z50.InterfaceC10987a;
import z50.InterfaceC10990d;

/* loaded from: classes3.dex */
public final class c implements K40.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10656a f15172a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10987a f15173b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7285a f15174c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final P40.a f15175d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final U40.a f15176e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final p50.a f15177f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC9967b f15178g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC10990d f15179h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final I50.a f15180i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final b f15181j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC6302a f15182k;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15183a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15184b;

        static {
            int[] iArr = new int[CbottomType.values().length];
            try {
                iArr[CbottomType.SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CbottomType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CbottomType.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CbottomType.ONBOARDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CbottomType.MODAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CbottomType.SNACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CbottomType.WEBVIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CbottomType.STORIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CbottomType.PDF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f15183a = iArr;
            int[] iArr2 = new int[Cbottom2Action.Type.values().length];
            try {
                iArr2[Cbottom2Action.Type.SHARE_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f15184b = iArr2;
        }
    }

    public c(@NotNull C10656a cbottomMapper2, @NotNull InterfaceC10987a fullDisplay, @NotNull InterfaceC7285a screenDisplay, @NotNull P40.a modalDisplay, @NotNull U40.a onboardingSlidesDisplay, @NotNull p50.a sheetDisplay, @NotNull InterfaceC9967b snackbarDisplay, @NotNull InterfaceC10990d storiesDisplay, @NotNull I50.a webViewDisplay, @NotNull b cbottomDisplayCreator, @NotNull InterfaceC6302a pdfDisplay) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fullDisplay, "fullDisplay");
        Intrinsics.checkNotNullParameter(screenDisplay, "screenDisplay");
        Intrinsics.checkNotNullParameter(modalDisplay, "modalDisplay");
        Intrinsics.checkNotNullParameter(onboardingSlidesDisplay, "onboardingSlidesDisplay");
        Intrinsics.checkNotNullParameter(sheetDisplay, "sheetDisplay");
        Intrinsics.checkNotNullParameter(snackbarDisplay, "snackbarDisplay");
        Intrinsics.checkNotNullParameter(storiesDisplay, "storiesDisplay");
        Intrinsics.checkNotNullParameter(webViewDisplay, "webViewDisplay");
        Intrinsics.checkNotNullParameter(cbottomDisplayCreator, "cbottomDisplayCreator");
        Intrinsics.checkNotNullParameter(pdfDisplay, "pdfDisplay");
        this.f15172a = cbottomMapper2;
        this.f15173b = fullDisplay;
        this.f15174c = screenDisplay;
        this.f15175d = modalDisplay;
        this.f15176e = onboardingSlidesDisplay;
        this.f15177f = sheetDisplay;
        this.f15178g = snackbarDisplay;
        this.f15179h = storiesDisplay;
        this.f15180i = webViewDisplay;
        this.f15181j = cbottomDisplayCreator;
        this.f15182k = pdfDisplay;
    }

    @Override // K40.a
    @NotNull
    public final LinkedHashSet a() {
        return e0.f(e0.f(e0.f(e0.f(e0.f(e0.f(e0.f(e0.f(this.f15175d.a(), this.f15178g.a()), this.f15174c.a()), this.f15173b.a()), this.f15176e.a()), this.f15177f.a()), this.f15179h.a()), this.f15180i.a()), this.f15182k.a());
    }

    @Override // K40.a
    public final void c(@NotNull String id2, @NotNull String uuid, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f15173b.c(id2, uuid);
        this.f15175d.c(id2, uuid);
        this.f15176e.c(id2, uuid);
        this.f15177f.c(id2, uuid);
        this.f15178g.c(id2, uuid);
        this.f15179h.c(id2, uuid);
        this.f15180i.c(id2, uuid);
        this.f15174c.c(id2, uuid, str);
        this.f15182k.c(id2, uuid);
    }

    @Override // K40.a
    @NotNull
    public final b creator() {
        return this.f15181j;
    }

    @Override // K40.a
    public final void e(String str, @NotNull String id2, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Cbottom2SharingAction c11 = str != null ? this.f15172a.c(str) : null;
        if (c11 == null) {
            throw new Exception("action not parse");
        }
        if (a.f15184b[c11.getName().ordinal()] != 1) {
            throw new o();
        }
        this.f15182k.e(str, id2, uuid);
    }

    @Override // K40.a
    public final void f(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f15173b.b();
        this.f15175d.b();
        this.f15176e.b();
        this.f15177f.b();
        this.f15178g.b();
        this.f15179h.b();
        this.f15180i.b();
        this.f15174c.b();
        this.f15182k.b();
    }

    @Override // K40.a
    public final void g(Parcelable parcelable, @NotNull CbottomType cbottomType, @NotNull String uuid, String str) {
        Intrinsics.checkNotNullParameter(cbottomType, "cbottomType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        switch (a.f15183a[cbottomType.ordinal()]) {
            case 1:
                this.f15177f.d(parcelable, uuid);
                return;
            case 2:
                this.f15173b.d(parcelable, uuid);
                return;
            case 3:
                this.f15174c.d(parcelable, uuid, str);
                return;
            case 4:
                this.f15176e.d(parcelable, uuid);
                return;
            case 5:
                this.f15175d.d(parcelable, uuid);
                return;
            case 6:
                this.f15178g.d(parcelable, uuid);
                return;
            case 7:
                this.f15180i.d(parcelable, uuid);
                return;
            case 8:
                this.f15179h.d(parcelable, uuid);
                return;
            case 9:
                this.f15182k.d(parcelable, uuid);
                return;
            default:
                throw new o();
        }
    }

    @Override // K40.a
    @NotNull
    public final ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a h(String str) {
        return this.f15172a.d(str);
    }

    @Override // K40.a
    public final void i(@NotNull A40.a parameterParcelable, @NotNull String uuid, String str) {
        Intrinsics.checkNotNullParameter(parameterParcelable, "parameterParcelable");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a aVar = parameterParcelable instanceof ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a ? (ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a) parameterParcelable : null;
        if ((aVar != null ? aVar.getType() : null) == null) {
            throw new Exception("Cbottom type not found");
        }
        g(aVar, aVar.getType(), uuid, str);
    }
}
