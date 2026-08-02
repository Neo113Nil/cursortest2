package Ui;

import Ez.ViewOnClickListenerC2979c;
import Gi.C3123a;
import Hj0.C3147d;
import Sc.InterfaceC4003e;
import Si.InterfaceC4010a;
import Si.InterfaceC4011b;
import android.animation.Animator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cj.C5838a;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ti.C9876a;
import xe.C10727i;
import y7.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUi/c;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-gallery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Ui.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4069c extends ComponentCallbacksC5392m {

    /* renamed from: t, reason: collision with root package name */
    private static final float f27730t = UiExtKt.toPxF(60);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f27731u = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f27732a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f27733b;

    /* renamed from: c, reason: collision with root package name */
    private Ii.e f27734c;

    /* renamed from: d, reason: collision with root package name */
    private float f27735d;

    /* renamed from: e, reason: collision with root package name */
    private Hi.i f27736e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private u f27737f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27738g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27739h;

    /* renamed from: i, reason: collision with root package name */
    public C3147d f27740i;

    /* renamed from: j, reason: collision with root package name */
    public Ti.i f27741j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f27742k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f27743l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Object f27744m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f27745n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f27746o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final m f27747p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final b f27748q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C0564c f27749r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final f f27750s;

    /* renamed from: Ui.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27751a;

        static {
            int[] iArr = new int[Ci.l.values().length];
            try {
                iArr[Ci.l.LEGACY_ON_CLICK_CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ci.l.RESULT_API_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ci.l.ON_RESULT_CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27751a = iArr;
        }
    }

    /* renamed from: Ui.c$b */
    public static final class b extends RecyclerView.i {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i11, int i12) {
            C4069c c4069c = C4069c.this;
            if (c4069c.f27736e == null && i12 > 0 && i11 == 0) {
                c4069c.a0().f12568d.scrollToPosition(0);
            }
        }
    }

    /* renamed from: Ui.c$c, reason: collision with other inner class name */
    public static final class C0564c implements Animator.AnimatorListener {
        C0564c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C4069c.this.f27738g = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C4069c.this.f27738g = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            C4069c.this.f27738g = true;
        }
    }

    /* renamed from: Ui.c$d */
    static final class d extends AbstractC7737t implements Function0<Function0<? extends Unit>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Function0<? extends Unit> invoke() {
            C4069c c4069c = C4069c.this;
            return new Ui.f(new M(), x0.a(c4069c.d0()), new Ui.g(c4069c));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$finishAndReturnSelectedMedia$1", f = "GalleryFragment.kt", l = {317, 318}, m = "invokeSuspend")
    /* renamed from: Ui.c$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        C4069c f27755d;

        /* renamed from: e, reason: collision with root package name */
        Collection f27756e;

        /* renamed from: f, reason: collision with root package name */
        Iterator f27757f;

        /* renamed from: g, reason: collision with root package name */
        Collection f27758g;

        /* renamed from: h, reason: collision with root package name */
        int f27759h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<Long> f27760i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C4069c f27761j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f27762k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<Long> list, C4069c c4069c, boolean z11, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f27760i = list;
            this.f27761j = c4069c;
            this.f27762k = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f27760i, this.f27761j, this.f27762k, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
        
            if (r11 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:13:0x006c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            Iterator it;
            C4069c c4069c;
            List list;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27759h;
            C4069c c4069c2 = this.f27761j;
            if (i11 == 0) {
                Sc.s.b(obj);
                List<Long> list2 = this.f27760i;
                arrayList = new ArrayList(C7714v.z(list2, 10));
                it = list2.iterator();
                c4069c = c4069c2;
                if (it.hasNext()) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                list = (List) obj;
                C4069c.C(c4069c2, list, this.f27762k);
                return Unit.f71690a;
            }
            arrayList = this.f27758g;
            it = this.f27757f;
            Collection collection = this.f27756e;
            c4069c = this.f27755d;
            Sc.s.b(obj);
            arrayList.add((Hi.k) obj);
            arrayList = collection;
            if (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Si.e d02 = c4069c.d0();
                this.f27755d = c4069c;
                Collection collection2 = arrayList;
                this.f27756e = collection2;
                this.f27757f = it;
                this.f27758g = collection2;
                this.f27759h = 1;
                obj = d02.A0(longValue, this);
                if (obj != aVar) {
                    collection = arrayList;
                    arrayList.add((Hi.k) obj);
                    arrayList = collection;
                    if (it.hasNext()) {
                        ArrayList I11 = C7714v.I((List) arrayList);
                        boolean isEmpty = I11.isEmpty();
                        list = I11;
                        if (isEmpty) {
                            list = null;
                        }
                        if (list == null) {
                            Si.e d03 = c4069c2.d0();
                            this.f27755d = null;
                            this.f27756e = null;
                            this.f27757f = null;
                            this.f27758g = null;
                            this.f27759h = 2;
                            obj = d03.H0(this);
                        }
                        C4069c.C(c4069c2, list, this.f27762k);
                        return Unit.f71690a;
                    }
                }
            }
            return aVar;
        }
    }

    /* renamed from: Ui.c$f */
    public static final class f extends ContentObserver {
        f(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z11) {
            super.onChange(z11);
            C4069c.N(C4069c.this);
        }
    }

    /* renamed from: Ui.c$g */
    static final class g extends AbstractC7737t implements Function0<List<? extends RecyclerView.n>> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends RecyclerView.n> invoke() {
            C4069c c4069c = C4069c.this;
            Function1<Context, List<RecyclerView.n>> e11 = c4069c.c0().d().e();
            Context requireContext = c4069c.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            return e11.invoke(requireContext);
        }
    }

    /* renamed from: Ui.c$h */
    static final class h extends AbstractC7737t implements Function0<C3123a> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3123a invoke() {
            androidx.fragment.app.r requireActivity = C4069c.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            return new C3123a(requireActivity);
        }
    }

    /* renamed from: Ui.c$i */
    static final class i extends AbstractC7737t implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Context requireContext = C4069c.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            return Boolean.valueOf(UniGlobalConfigKt.getRoundCornersFlag(requireContext));
        }
    }

    /* renamed from: Ui.c$j */
    static final class j extends AbstractC7737t implements Function0<Vi.c> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Vi.c invoke() {
            C4069c c4069c = C4069c.this;
            J viewLifecycleOwner = c4069c.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            return new Vi.c(viewLifecycleOwner, C7714v.a0(Xi.b.f34483a), new Ui.k(c4069c), C4069c.M(c4069c), new Ui.j(1, c4069c.d0(), Si.e.class, "getSelectionIndexForMediaId", "getSelectionIndexForMediaId(J)I", 0));
        }
    }

    /* renamed from: Ui.c$k */
    static final class k extends AbstractC7737t implements Function0<Ci.k> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ci.k invoke() {
            Bundle requireArguments = C4069c.this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            Ci.k kVar = (Ci.k) Ei.b.a(requireArguments, "GALLERY_PAGE_CONFIG_ARG", Ci.k.class);
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalStateException("Gallery page configuration not provided");
        }
    }

    /* renamed from: Ui.c$l */
    static final class l implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f27769a;

        l(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27769a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f27769a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27769a.invoke(obj);
        }
    }

    /* renamed from: Ui.c$m */
    public static final class m extends RecyclerView.t {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            C4069c c4069c = C4069c.this;
            if (c4069c.f27738g || Math.abs(i12) <= 25) {
                return;
            }
            if (i12 < 0) {
                ButtonV3View pickAlbumButton = c4069c.a0().f12569e;
                Intrinsics.checkNotNullExpressionValue(pickAlbumButton, "pickAlbumButton");
                C4069c.A(c4069c, pickAlbumButton);
            } else {
                ButtonV3View pickAlbumButton2 = c4069c.a0().f12569e;
                Intrinsics.checkNotNullExpressionValue(pickAlbumButton2, "pickAlbumButton");
                C4069c.z(c4069c, pickAlbumButton2);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.media.view.gallery.GalleryFragment$setSelectedMediaIds$1", f = "GalleryFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ui.c$n */
    static final class n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {
        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C4069c.this.new n(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C4069c.this.b0().n();
            return Unit.f71690a;
        }
    }

    /* renamed from: Ui.c$o */
    static final class o extends AbstractC7737t implements Function0<Si.e> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Si.e invoke() {
            C3147d c3147d = C4069c.this.f27740i;
            if (c3147d != null) {
                return (Si.e) c3147d.get();
            }
            Intrinsics.n("viewModelProvider");
            throw null;
        }
    }

    public C4069c() {
        Sc.n nVar = Sc.n.NONE;
        this.f27732a = Sc.k.a(nVar, new k());
        this.f27733b = Sc.k.a(nVar, new i());
        this.f27737f = u.NONE;
        this.f27742k = Sc.k.a(nVar, new o());
        this.f27743l = Sc.k.a(nVar, new j());
        this.f27744m = Sc.k.a(nVar, new g());
        this.f27745n = Sc.k.a(nVar, new d());
        this.f27746o = Sc.k.a(nVar, new h());
        this.f27747p = new m();
        this.f27748q = new b();
        this.f27749r = new C0564c();
        this.f27750s = new f(new Handler(Looper.getMainLooper()));
    }

    public static final void A(C4069c c4069c, ButtonV3View buttonV3View) {
        buttonV3View.animate().y(c4069c.f27735d).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(c4069c.f27749r).setDuration(200L).start();
    }

    public static final void C(C4069c c4069c, List legacyMedia, boolean z11) {
        Hi.i Y11 = c4069c.Y(legacyMedia);
        if (!z11) {
            K selectedMediaIdsInOrder = K.f71697a;
            Intrinsics.checkNotNullParameter(selectedMediaIdsInOrder, "selectedMediaIdsInOrder");
            Y11 = new Hi.i((Hi.j) null, (Long) null, 0, 0, selectedMediaIdsInOrder, 1, (Hi.a) null);
        }
        if (c4069c.f27741j == null) {
            Intrinsics.n("router");
            throw null;
        }
        GalleryActivity activity = c4069c.h0();
        Hi.f result = new Hi.f(legacyMedia, Y11);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(legacyMedia, "legacyMedia");
        activity.L(result, legacyMedia);
    }

    public static final void L(C4069c c4069c) {
        if (Intrinsics.d(null, Fi.f.f9495a)) {
            ButtonV3View pickAlbumButton = c4069c.a0().f12569e;
            Intrinsics.checkNotNullExpressionValue(pickAlbumButton, "pickAlbumButton");
            pickAlbumButton.setVisibility((c4069c.d0().K0().getValue().booleanValue() || c4069c.d0().x0().getValue().booleanValue()) ? 8 : 0);
        } else {
            if (!Intrinsics.d(null, Fi.g.f9496a)) {
                throw new Sc.o();
            }
            ButtonV3View pickAlbumButton2 = c4069c.a0().f12569e;
            Intrinsics.checkNotNullExpressionValue(pickAlbumButton2, "pickAlbumButton");
            pickAlbumButton2.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final boolean M(C4069c c4069c) {
        return ((Boolean) c4069c.f27733b.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final void N(C4069c c4069c) {
        ((Function0) c4069c.f27745n.getValue()).invoke();
    }

    public static final void O(C4069c c4069c, InterfaceC4010a interfaceC4010a, int i11) {
        c4069c.getClass();
        if (!(interfaceC4010a instanceof InterfaceC4010a.C0522a)) {
            if (interfaceC4010a instanceof InterfaceC4010a.e) {
                c4069c.f0((InterfaceC4010a.e) interfaceC4010a, i11);
                return;
            }
            if (!(interfaceC4010a instanceof InterfaceC4010a.f)) {
                if (!(interfaceC4010a instanceof InterfaceC4010a.d)) {
                    throw new Sc.o();
                }
                return;
            } else {
                Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", c4069c.requireContext().getPackageName(), null));
                Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                c4069c.startActivity(data);
                return;
            }
        }
        if (c4069c.d0().t0()) {
            c4069c.d0().N0();
            androidx.fragment.app.r activity = c4069c.getActivity();
            GalleryActivity galleryActivity = activity instanceof GalleryActivity ? (GalleryActivity) activity : null;
            if (galleryActivity != null) {
                if (c4069c.c0().g() == null) {
                    c4069c.c0().d().f().b().invoke(galleryActivity);
                } else if (c4069c.f27741j != null) {
                    Ti.i.b(galleryActivity, null, true, c4069c.c0().g());
                } else {
                    Intrinsics.n("router");
                    throw null;
                }
            }
        }
    }

    public static final boolean P(C4069c c4069c, InterfaceC4010a interfaceC4010a) {
        c4069c.getClass();
        if (interfaceC4010a instanceof InterfaceC4010a.e) {
            return c4069c.c0().d().f().e().invoke(c4069c.h0(), ((InterfaceC4010a.e) interfaceC4010a).d()).booleanValue();
        }
        if (!(interfaceC4010a instanceof InterfaceC4010a.C0522a)) {
            return false;
        }
        if (!c4069c.d0().t0()) {
            return true;
        }
        c4069c.d0().N0();
        c4069c.c0().d().f().c().invoke(c4069c.h0());
        return true;
    }

    public static final void Q(C4069c c4069c, InterfaceC4010a interfaceC4010a, int i11) {
        InterfaceC4010a.e eVar = interfaceC4010a instanceof InterfaceC4010a.e ? (InterfaceC4010a.e) interfaceC4010a : null;
        if (eVar == null) {
            return;
        }
        int i12 = a.f27751a[c4069c.c0().d().f().g().ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                throw new Sc.o();
            }
            c4069c.f0(eVar, i11);
        } else {
            c4069c.e0(c4069c.d0().M0(eVar, i11));
            if (c4069c.c0().k()) {
                c4069c.Z(C7714v.a0(Long.valueOf(eVar.getId())), false);
            }
        }
    }

    public static final void S(final C4069c c4069c) {
        int e11;
        View childAt;
        int height;
        int i11;
        Hi.i iVar = c4069c.f27736e;
        if (iVar == null) {
            return;
        }
        final RecyclerView mediaRecyclerView = c4069c.a0().f12568d;
        Intrinsics.checkNotNullExpressionValue(mediaRecyclerView, "mediaRecyclerView");
        int shimmersCount = c4069c.b0().getShimmersCount();
        if (shimmersCount <= 0) {
            return;
        }
        RecyclerView.o layoutManager = mediaRecyclerView.getLayoutManager();
        int o11 = layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).o() : layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).g() : 1;
        Long b11 = iVar.b();
        int k11 = b11 != null ? c4069c.b0().k(b11.longValue()) : -1;
        Integer valueOf = Integer.valueOf(k11);
        if (k11 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            e11 = valueOf.intValue();
        } else {
            int h11 = iVar.h();
            if (h11 < 1) {
                h11 = 1;
            }
            int e12 = iVar.e() / h11;
            int e13 = iVar.e() % h11;
            int i12 = o11 - 1;
            if (e13 > i12) {
                e13 = i12;
            }
            e11 = kotlin.ranges.h.e((e12 * o11) + e13, 0, shimmersCount - 1);
        }
        v vVar = new v(e11, iVar.f());
        RecyclerView.o layoutManager2 = mediaRecyclerView.getLayoutManager();
        if (((layoutManager2 instanceof StaggeredGridLayoutManager) || (layoutManager2 instanceof GridLayoutManager)) && (childAt = mediaRecyclerView.getChildAt(0)) != null && (height = childAt.getHeight()) > 0 && vVar.b() < 0 && (i11 = (-vVar.b()) / height) > 0) {
            vVar = new v((o11 * i11) + vVar.c(), (i11 * height) + vVar.b());
        }
        final v a11 = v.a(vVar, kotlin.ranges.h.e(vVar.c(), 0, shimmersCount - 1));
        c4069c.f27736e = null;
        c4069c.f27737f = u.NONE;
        c4069c.d0().V0(false);
        mediaRecyclerView.post(new Runnable(c4069c) { // from class: Ui.a
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = C4069c.f27731u;
                RecyclerView recyclerView = mediaRecyclerView;
                RecyclerView.o layoutManager3 = recyclerView.getLayoutManager();
                boolean z11 = layoutManager3 instanceof StaggeredGridLayoutManager;
                v vVar2 = a11;
                if (z11) {
                    ((StaggeredGridLayoutManager) layoutManager3).scrollToPositionWithOffset(vVar2.c(), vVar2.b());
                } else if (layoutManager3 instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager3).scrollToPositionWithOffset(vVar2.c(), vVar2.b());
                } else {
                    recyclerView.scrollToPosition(vVar2.c());
                }
            }
        });
    }

    public static final void W(C4069c c4069c, InterfaceC4011b.a aVar) {
        NotificationDTO notification = new NotificationDTO(C5838a.a(aVar.a(), Integer.valueOf(aVar.a())), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
        GalleryActivity h02 = c4069c.h0();
        h02.getClass();
        Intrinsics.checkNotNullParameter(notification, "notification");
        View decorView = h02.getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default((ViewGroup) decorView, null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, h02, null, 8, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(String str, Set<String> set) {
        C4069c c4069c;
        String text;
        TextDTO textDTO;
        int i11;
        String title = c0().d().getTitle();
        int i12 = 1;
        if (title == null || !(!kotlin.text.h.K(title))) {
            title = null;
        }
        if (title != null) {
            c4069c = this;
            text = title;
        } else if (str == null) {
            c4069c = this;
            text = c4069c.getString(R.string.gallery_default_folder_android);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        } else {
            c4069c = this;
            text = str;
        }
        String str2 = (title == null || !set.containsAll(C7705l.j0(Li.a.b()))) ? null : str;
        Ii.e a02 = c4069c.a0();
        TextAtomV2View title2 = a02.f12573i;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(text);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String str3 = str2;
        TextHolderKt.bind$default(title2, new TextDTO(ozonSpannableString, null, null, null, null, null, textPreset, "tsBodyControl500Medium", "textPrimaryOnDark", null, null, null, null, false, null, null, null, null, i12, 261694, null), null, 2, null);
        TextAtomV2View subtitle = a02.f12572h;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        if (str3 != null) {
            textDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(str3), null, null, null, null, null, textPreset, "tsCompact400Small", "textSecondaryOnDark", null, null, null, null, false, null, null, null, null, i12, 261694, null);
            i11 = 2;
        } else {
            textDTO = null;
            i11 = 2;
        }
        TextHolderKt.bindOrGone$default(subtitle, textDTO, null, i11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[LOOP:0: B:33:0x00e2->B:35:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Hi.i Y(List<? extends Hi.k> list) {
        int childAdapterPosition;
        View view;
        InterfaceC4010a l11;
        Long l12;
        Iterator<T> it;
        RecyclerView.o layoutManager;
        Hi.k d11;
        Integer valueOf;
        RecyclerView mediaRecyclerView = a0().f12568d;
        Intrinsics.checkNotNullExpressionValue(mediaRecyclerView, "mediaRecyclerView");
        RecyclerView.o layoutManager2 = mediaRecyclerView.getLayoutManager();
        int i11 = 1;
        if (layoutManager2 instanceof StaggeredGridLayoutManager) {
            int[] h11 = ((StaggeredGridLayoutManager) layoutManager2).h();
            Intrinsics.checkNotNullExpressionValue(h11, "findFirstVisibleItemPositions(...)");
            Intrinsics.checkNotNullParameter(h11, "<this>");
            if (h11.length == 0) {
                valueOf = null;
            } else {
                int i12 = h11[0];
                Intrinsics.checkNotNullParameter(h11, "<this>");
                int length = h11.length - 1;
                if (1 <= length) {
                    int i13 = 1;
                    while (true) {
                        int i14 = h11[i13];
                        if (i12 > i14) {
                            i12 = i14;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                    }
                }
                valueOf = Integer.valueOf(i12);
            }
            if (valueOf != null) {
                childAdapterPosition = valueOf.intValue();
            }
            childAdapterPosition = -1;
        } else if (layoutManager2 instanceof LinearLayoutManager) {
            childAdapterPosition = ((LinearLayoutManager) layoutManager2).findFirstVisibleItemPosition();
        } else {
            View childAt = mediaRecyclerView.getChildAt(0);
            if (childAt != null) {
                childAdapterPosition = mediaRecyclerView.getChildAdapterPosition(childAt);
            }
            childAdapterPosition = -1;
        }
        Integer valueOf2 = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition == -1) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            RecyclerView.o layoutManager3 = mediaRecyclerView.getLayoutManager();
            if (layoutManager3 != null) {
                view = layoutManager3.findViewByPosition(intValue);
                int top = view == null ? view.getTop() - mediaRecyclerView.getPaddingTop() : 0;
                l11 = b0().l(childAdapterPosition);
                if (l11 == null) {
                    InterfaceC4010a.e eVar = l11 instanceof InterfaceC4010a.e ? (InterfaceC4010a.e) l11 : null;
                    l12 = (eVar == null || (d11 = eVar.d()) == null) ? null : Long.valueOf(d11.getId());
                } else {
                    l12 = null;
                }
                Hi.j value = d0().F0().getValue();
                Integer valueOf3 = childAdapterPosition != -1 ? Integer.valueOf(childAdapterPosition) : null;
                int intValue2 = valueOf3 != null ? valueOf3.intValue() : 0;
                List<? extends Hi.k> list2 = list;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Hi.k) it.next()).getId()));
                }
                layoutManager = mediaRecyclerView.getLayoutManager();
                if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                    i11 = ((StaggeredGridLayoutManager) layoutManager).o();
                } else if (layoutManager instanceof GridLayoutManager) {
                    i11 = ((GridLayoutManager) layoutManager).g();
                }
                return new Hi.i(value, l12, intValue2, top, arrayList, i11, 64);
            }
        }
        view = null;
        if (view == null) {
        }
        l11 = b0().l(childAdapterPosition);
        if (l11 == null) {
        }
        Hi.j value2 = d0().F0().getValue();
        if (childAdapterPosition != -1) {
        }
        int intValue22 = valueOf3 != null ? valueOf3.intValue() : 0;
        List<? extends Hi.k> list22 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        layoutManager = mediaRecyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
        }
        return new Hi.i(value2, l12, intValue22, top, arrayList2, i11, 64);
    }

    private final void Z(List<Long> list, boolean z11) {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new e(list, this, z11, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ii.e a0() {
        Ii.e eVar = this.f27734c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final Vi.c b0() {
        return (Vi.c) this.f27743l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final Ci.k c0() {
        return (Ci.k) this.f27732a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final Si.e d0() {
        Object value = this.f27742k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Si.e) value;
    }

    private final void e0(Collection<Long> collection) {
        Collection<Long> collection2 = collection;
        Vi.c b02 = b0();
        ArrayList arrayList = new ArrayList(C7714v.z(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(b02.k(((Number) it.next()).longValue())));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() != -1) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b0().notifyItemChanged(((Number) it2.next()).intValue(), e0.h(1));
        }
    }

    private final void f0(InterfaceC4010a.e eVar, int i11) {
        int i12 = a.f27751a[c0().d().f().g().ordinal()];
        if (i12 == 1) {
            c0().d().f().d().invoke(h0(), eVar.d());
            return;
        }
        if (i12 == 2) {
            e0(d0().M0(eVar, i11));
            if (c0().k()) {
                Z(C7714v.a0(Long.valueOf(eVar.getId())), false);
                return;
            }
            return;
        }
        if (i12 != 3) {
            throw new Sc.o();
        }
        e0(d0().M0(eVar, i11));
        c0().d().f().f().invoke(new Hi.f(C7714v.a0(eVar.d()), Y(K.f71697a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        for (String str : d0().C0().getValue()) {
            if (androidx.core.content.a.checkSelfPermission(requireContext(), str) == 0) {
                d0().r0(str);
            }
        }
    }

    private final GalleryActivity h0() {
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.android.gallery.media.view.GalleryActivity");
        return (GalleryActivity) requireActivity;
    }

    public static void t(C4069c c4069c) {
        Hi.h value = c4069c.d0().w0().getValue();
        C9876a c9876a = new C9876a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MEDIA_FILTER_ARG", value);
        c9876a.setArguments(bundle);
        c9876a.show(c4069c.getChildFragmentManager(), C9876a.class.getSimpleName());
    }

    public static void u(C4069c c4069c, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Hi.j jVar = (Hi.j) Ei.b.a(bundle, "album_arg", Hi.j.class);
        if (jVar != null) {
            c4069c.d0().L0(jVar);
        }
    }

    public static void v(C4069c c4069c) {
        c4069c.c0().f().invoke(c4069c.h0());
    }

    public static void w(C4069c c4069c) {
        c4069c.e0(c4069c.d0().u0());
    }

    public static void x(C4069c c4069c) {
        c4069c.getClass();
        c4069c.h0().requestPermission(new t(c4069c, false));
    }

    public static void y(C4069c c4069c) {
        c4069c.Z(K.f71697a, true);
    }

    public static final void z(C4069c c4069c, ButtonV3View buttonV3View) {
        buttonV3View.animate().y(buttonV3View.getResources().getDisplayMetrics().heightPixels + 0.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(c4069c.f27749r).setDuration(200L).start();
    }

    public final void i0(@NotNull List<Long> selectedIds) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        d0().s0(selectedIds);
        if (c0().k()) {
            Z(selectedIds, false);
        } else {
            C10727i.c(x0.a(d0()), null, null, new n(null), 3);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Pi.b.a().c(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Vi.c b02 = b0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        b02.i(viewLifecycleOwner);
        this.f27734c = Ii.e.b(inflater, viewGroup);
        ConstraintLayout a11 = a0().a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        if (this.f27739h) {
            requireContext().getContentResolver().unregisterContentObserver(this.f27750s);
            this.f27739h = false;
        }
        if (this.f27743l.isInitialized()) {
            b0().unregisterAdapterDataObserver(this.f27748q);
            a0().f12568d.setAdapter(null);
        }
        this.f27734c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Ii.e eVar = this.f27734c;
        if (eVar != null) {
            RecyclerView.o layoutManager = eVar.f12568d.getLayoutManager();
            outState.putParcelable("bundle_recycler_layout", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        outState.putAll(d0().v0());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        h0().requestPermission(new t(this, true));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        boolean z11;
        Hi.i h11;
        int i11 = 5;
        int i12 = 6;
        Intrinsics.checkNotNullParameter(view, "view");
        Ii.e a02 = a0();
        Hi.j value = d0().F0().getValue();
        X(value != null ? value.getTitle() : null, d0().y0().getValue());
        IconButtonV3View closeButton = a02.f12567c;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        IconButtonV3HolderKt.bind$default(closeButton, new IconButtonV3DTO(null, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, "graphicLightKey", "graphicDisabledOnLight", null, null, null, null, null, null, null, 16273, null), null, 2, null);
        closeButton.setOnClickListener(new Nt.a(this, 6));
        b0().p(c0().d().j());
        b0().registerAdapterDataObserver(this.f27748q);
        RecyclerView recyclerView = a0().f12568d;
        recyclerView.setHasFixedSize(true);
        Function1<Context, RecyclerView.o> g10 = c0().d().g();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(g10.invoke(context));
        Iterator it = ((List) this.f27744m.getValue()).iterator();
        while (it.hasNext()) {
            recyclerView.addItemDecoration((RecyclerView.n) it.next());
        }
        recyclerView.setAdapter(b0());
        recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 1);
        ButtonV3View pickAlbumButton = a0().f12569e;
        Intrinsics.checkNotNullExpressionValue(pickAlbumButton, "pickAlbumButton");
        String title = getString(R.string.gallery_pick_album_title);
        Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
        Intrinsics.checkNotNullParameter(title, "title");
        ButtonV3HolderKt.bind$default(pickAlbumButton, new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, null, title, null, "ic_m_chevron_up_filled", null, null, "textPrimary", null, null, "graphicTertiary", null, "bgPrimary", null, null, null, null, null, 256874, null), null, 2, null);
        Intrinsics.checkNotNullExpressionValue(pickAlbumButton, "pickAlbumButton");
        int i13 = Y.f42258g;
        if (!pickAlbumButton.isLaidOut() || pickAlbumButton.isLayoutRequested()) {
            pickAlbumButton.addOnLayoutChangeListener(new Ui.h(this));
        } else {
            this.f27735d = pickAlbumButton.getTop();
        }
        pickAlbumButton.setOnClickListener(new AU.a(this, i11));
        if (c0().k()) {
            b0().o(Si.d.CHECKMARK);
        }
        getChildFragmentManager().n1("album_request_key", getViewLifecycleOwner(), new AW.d(this));
        getChildFragmentManager().n1("CAMERA_REQUEST_KEY", getViewLifecycleOwner(), new Kk.d());
        if (bundle == null) {
            int i14 = Fi.e.f9493d;
            Fi.e.g(c0().d().b());
        }
        if (!d0().J0()) {
            Hi.h c11 = c0().c();
            if (c11 != null) {
                d0().S0(c11);
            }
            d0().T0(c0().d().h());
            d0().U0(c0().d().i());
            Context context2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            try {
                Object systemService = context2.getApplicationContext().getSystemService("camera");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                String[] cameraIdList = ((CameraManager) systemService).getCameraIdList();
                Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
                z11 = !(cameraIdList.length == 0);
            } catch (CameraAccessException unused) {
                z11 = false;
            }
            d0().Q0(z11 && c0().d().c());
            d0().R0(z11 && c0().d().d());
            d0().P0(bundle);
            if (bundle == null && (h11 = c0().h()) != null) {
                this.f27736e = h11;
                Hi.j d11 = h11.d();
                if (d11 != null) {
                    d0().L0(d11);
                }
                if (h11.g().isEmpty()) {
                    this.f27737f = u.READY_TO_RESTORE_SCROLL;
                } else {
                    J viewLifecycleOwner = getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new Ui.d(this, h11, null), 3);
                }
            }
            g0();
            d0().setInitialized(true);
        }
        Ii.e a03 = a0();
        ButtonV3View clearSelectedMediaButton = a03.f12566b;
        Intrinsics.checkNotNullExpressionValue(clearSelectedMediaButton, "clearSelectedMediaButton");
        String string = getString(R.string.gallery_reset_all_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ButtonV3HolderKt.bind$default(clearSelectedMediaButton, new ButtonV3DTO(ButtonV3DTO.StyleTypes.NEGATIVE, null, string, null, str, str2, null, null, str3, str4, str5, str6, str7, null, null, null, null, null, 262138, null), null, 2, null);
        ButtonV3View submitSelectedMediaButton = a03.f12571g;
        Intrinsics.checkNotNullExpressionValue(submitSelectedMediaButton, "submitSelectedMediaButton");
        String string2 = getString(R.string.gallery_pick_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ButtonV3HolderKt.bind$default(submitSelectedMediaButton, new ButtonV3DTO(false ? 1 : 0, null, string2, str, str2, false ? 1 : 0, false ? 1 : 0, str3, str4, str5, str6, str7, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, null, 262139, null), null, 2, null);
        clearSelectedMediaButton.setOnClickListener(new ViewOnClickListenerC2979c(this, i12));
        Intrinsics.checkNotNullExpressionValue(clearSelectedMediaButton, "clearSelectedMediaButton");
        clearSelectedMediaButton.setVisibility(d0().W0() ? 0 : 8);
        submitSelectedMediaButton.setOnClickListener(new FM.a(this, i11));
        if (((Boolean) this.f27733b.getValue()).booleanValue()) {
            MaterialCardView materialCardView = a03.f12570f;
            y7.k shapeAppearanceModel = materialCardView.getShapeAppearanceModel();
            shapeAppearanceModel.getClass();
            k.a aVar = new k.a(shapeAppearanceModel);
            aVar.e(f27730t);
            materialCardView.setShapeAppearanceModel(aVar.a());
        }
        Ui.m mVar = new Ui.m(this, null);
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner2), null, null, new Ui.i(this, mVar, null), 3);
        d0().B0().observe(getViewLifecycleOwner(), new l(new Ui.o(this)));
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner3), null, null, new p(this, null), 3);
        getLifecycle().a((C3123a) this.f27746o.getValue());
        if (!this.f27739h) {
            ContentResolver contentResolver = requireContext().getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            f fVar = this.f27750s;
            contentResolver.registerContentObserver(uri, true, fVar);
            requireContext().getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, fVar);
            this.f27739h = true;
        }
        Ui.l lVar = new Ui.l(this, null);
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner4), null, null, new Ui.i(this, lVar, null), 3);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        Parcelable parcelable;
        RecyclerView.o layoutManager;
        super.onViewStateRestored(bundle);
        if (bundle == null || (parcelable = (Parcelable) Ei.b.a(bundle, "bundle_recycler_layout", Parcelable.class)) == null || (layoutManager = a0().f12568d.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable);
    }
}
