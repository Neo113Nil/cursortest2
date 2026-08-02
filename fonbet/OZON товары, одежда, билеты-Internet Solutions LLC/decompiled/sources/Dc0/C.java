package Dc0;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import B0.A0;
import Fc0.c;
import Sc.InterfaceC4008j;
import T7.E;
import W.C4852x;
import android.app.Application;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import h3.C6788a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class C extends w0 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private a f6412A;

    /* renamed from: B, reason: collision with root package name */
    private B0 f6413B;

    /* renamed from: C, reason: collision with root package name */
    private Uri f6414C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private Fc0.d f6415D;

    /* renamed from: E, reason: collision with root package name */
    private String f6416E;

    /* renamed from: F, reason: collision with root package name */
    private int f6417F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private LinkedList<File> f6418G;

    /* renamed from: H, reason: collision with root package name */
    private B0 f6419H;

    /* renamed from: I, reason: collision with root package name */
    private int f6420I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final C0 f6421J;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f6422a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f6423b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hc0.d> f6424c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f6425d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0 f6426e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Object> f6427f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f6428g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Object> f6429h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f6430i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Integer> f6431j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f6432k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Fc0.e> f6433l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<c.b> f6434m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<c.b> f6435n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final x0<Fc0.b> f6436o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Fc0.b> f6437p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final x0<Fc0.c> f6438q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Fc0.c> f6439r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final x0<c.d> f6440s;

    /* renamed from: t, reason: collision with root package name */
    private B0 f6441t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private Fc0.a f6442u;

    /* renamed from: v, reason: collision with root package name */
    private Uri f6443v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6444w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6445x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6446y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6447z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PASSPORT;
        public static final a SELFIE;

        static {
            a aVar = new a("PASSPORT", 0);
            PASSPORT = aVar;
            a aVar2 = new a("SELFIE", 1);
            SELFIE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6448a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6448a = iArr;
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((C) this.receiver).onBackPressed();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C.k0((C) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C.l0((C) this.receiver);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$onCreate$1", f = "FintechRecoveryCameraViewModel.kt", l = {170}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6449d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6449d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Hc0.d dVar = (Hc0.d) C.this.f6424c.getValue();
                this.f6449d = 1;
                if (dVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$uploadPhoto$1", f = "FintechRecoveryCameraViewModel.kt", l = {298, 303, 309, 315}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6451d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f6453f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$uploadPhoto$1$1", f = "FintechRecoveryCameraViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C f6454d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C c11, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f6454d = c11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f6454d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C c11 = this.f6454d;
                c11.f6413B = null;
                C.p0(c11, false);
                C.j0(c11);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$uploadPhoto$1$2", f = "FintechRecoveryCameraViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C f6455d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C c11, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f6455d = c11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f6455d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C c11 = this.f6455d;
                c11.f6430i.tryEmit(new Integer(R.string.ozonid_could_not_upload_photo));
                c11.f6413B = null;
                C.p0(c11, false);
                return Unit.f71690a;
            }
        }

        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6456a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.PASSPORT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.SELFIE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6456a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f6453f = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C.this.new g(this.f6453f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        
            if (xe.C10727i.f(r10, r1, r9) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
        
            if (xe.C10727i.f(r10, r1, r9) != r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6451d;
            C c11 = C.this;
            try {
            } catch (Exception unused) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                b bVar = new b(c11, null);
                this.f6451d = 4;
            }
            if (i11 == 0) {
                Sc.s.b(obj);
                int i12 = c.f6456a[c11.f6412A.ordinal()];
                Uri uri = this.f6453f;
                String str = "";
                if (i12 == 1) {
                    Hc0.d dVar = (Hc0.d) c11.f6424c.getValue();
                    String str2 = c11.f6416E;
                    if (str2 != null) {
                        str = str2;
                    }
                    this.f6451d = 1;
                    if (dVar.c(uri, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 2) {
                        throw new Sc.o();
                    }
                    Hc0.d dVar2 = (Hc0.d) c11.f6424c.getValue();
                    String str3 = c11.f6416E;
                    if (str3 != null) {
                        str = str3;
                    }
                    this.f6451d = 2;
                    if (dVar2.d(uri, str, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        Sc.s.b(obj);
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            C10720e0 c10720e02 = C10720e0.f105451a;
            L0 l03 = De.s.f6650a;
            a aVar2 = new a(c11, null);
            this.f6451d = 3;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraViewModel$uploadVideo$1", f = "FintechRecoveryCameraViewModel.kt", l = {269, 270}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6457d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f6459f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f6459f = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C.this.new h(this.f6459f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r7.e(r1, r5, r6) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6457d;
            C c11 = C.this;
            try {
            } catch (CancellationException unused) {
                C.p0(c11, false);
            } catch (Exception unused2) {
                if (c11.getVideoUploadAttempt() >= 2) {
                    c11.J0();
                } else {
                    c11.setVideoUploadAttempt(c11.getVideoUploadAttempt() + 1);
                    c11.K0();
                }
            }
            if (i11 == 0) {
                Sc.s.b(obj);
                C.p0(c11, true);
                Hc0.d dVar = (Hc0.d) c11.f6424c.getValue();
                this.f6457d = 1;
                if (dVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    c11.J0();
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            Hc0.d dVar2 = (Hc0.d) c11.f6424c.getValue();
            Uri fromFile = Uri.fromFile(this.f6459f);
            String str = c11.f6416E;
            if (str == null) {
                str = "";
            }
            this.f6457d = 2;
        }
    }

    public C(@NotNull Application application, @NotNull InterfaceC4008j<Nc0.f> mainScreenContainer, @NotNull InterfaceC4008j<Hc0.d> fintechRecoveryCameraRepository, @NotNull InterfaceC4008j<Pc0.c> authRouter) {
        Fc0.d dVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainScreenContainer, "mainScreenContainer");
        Intrinsics.checkNotNullParameter(fintechRecoveryCameraRepository, "fintechRecoveryCameraRepository");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        this.f6422a = application;
        this.f6423b = mainScreenContainer;
        this.f6424c = fintechRecoveryCameraRepository;
        this.f6425d = authRouter;
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        C0 a11 = E0.a(0, 1, enumC11113a);
        this.f6426e = a11;
        this.f6427f = C2399j.a(a11);
        C0 a12 = E0.a(0, 1, enumC11113a);
        this.f6428g = a12;
        this.f6429h = C2399j.a(a12);
        C0 a13 = E0.a(0, 1, enumC11113a);
        this.f6430i = a13;
        this.f6431j = C2399j.a(a13);
        C0 a14 = E0.a(0, 1, enumC11113a);
        this.f6432k = a14;
        this.f6433l = C2399j.l(C2399j.o(C2399j.a(a14)), 430L);
        x0<c.b> a15 = O0.a(null);
        this.f6434m = a15;
        this.f6435n = C2399j.b(a15);
        x0<Fc0.b> a16 = O0.a(null);
        this.f6436o = a16;
        this.f6437p = C2399j.b(a16);
        x0<Fc0.c> a17 = O0.a(null);
        this.f6438q = a17;
        this.f6439r = C2399j.b(a17);
        this.f6440s = O0.a(c.d.SELF);
        this.f6442u = new Fc0.a(false, false, false);
        this.f6444w = true;
        this.f6412A = a.PASSPORT;
        dVar = Fc0.d.f9354d;
        this.f6415D = dVar;
        this.f6418G = new LinkedList<>();
        this.f6421J = E0.a(1, 0, enumC11113a);
    }

    public static final void d0(C c11) {
        B0 b02 = c11.f6441t;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        c11.f6441t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleState() {
        c.EnumC0196c enumC0196c;
        c.EnumC0196c enumC0196c2;
        Integer num;
        Integer valueOf;
        a aVar;
        a aVar2;
        c.d dVar;
        c.d dVar2;
        boolean z11 = this.f6446y;
        x0<c.b> x0Var = this.f6434m;
        if (z11) {
            x0Var.setValue(new c.b(R.string.ozonid_error_technical_error_title, R.string.ozonid_error_technical_error_title, R.string.ozonid_camera_error_close_android, new c(0, this, C.class, "onBackPressed", "onBackPressed()V", 0)));
            return;
        }
        x0<Fc0.c> x0Var2 = this.f6438q;
        a aVar3 = this.f6412A;
        a aVar4 = a.PASSPORT;
        if (aVar3 == aVar4 && this.f6443v == null) {
            enumC0196c2 = c.EnumC0196c.PASS;
        } else if (aVar3 == aVar4 && this.f6443v != null) {
            enumC0196c2 = c.EnumC0196c.PASS_CHECK;
        } else if (aVar3 == a.SELFIE) {
            enumC0196c2 = c.EnumC0196c.SELFIE;
        } else {
            enumC0196c = null;
            Uri uri = this.f6443v;
            boolean z12 = uri != null;
            boolean z13 = this.f6447z;
            boolean z14 = uri != null;
            boolean z15 = uri != null && this.f6444w;
            boolean z16 = this.f6445x;
            if (aVar3 != aVar4 && uri == null) {
                valueOf = Integer.valueOf(R.string.ozonid_camera_disclaimer_pass);
            } else if (aVar3 == aVar4 || uri == null) {
                num = null;
                aVar = this.f6412A;
                aVar2 = a.SELFIE;
                if (aVar != aVar2 && this.f6443v == null) {
                    dVar2 = this.f6440s.getValue();
                } else {
                    if (aVar == aVar2 || this.f6443v == null) {
                        dVar = null;
                        x0Var2.setValue(new Fc0.c(enumC0196c, uri, z12, z13, z14, z15, z16, num, this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.CUSTOM, R.string.ozonid_camera_retake, Integer.valueOf(R.color.oz_white_1), Integer.valueOf(R.color.oz_blue)), this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, R.string.ozonid_camera_submit, null, null), dVar));
                        if (!this.f6442u.c()) {
                            x0Var.setValue(null);
                            this.f6436o.setValue(new Fc0.b(this.f6443v == null, this.f6444w));
                            return;
                        } else if (this.f6442u.a()) {
                            x0Var.setValue(new c.b(R.string.ozonid_camera_access_denied, R.string.ozonid_allow_camera_access_in_settings, R.string.ozonid_camera_permission_provide_android, new d(0, this, C.class, "gotoPermissions", "gotoPermissions()V", 0)));
                            return;
                        } else {
                            if (this.f6442u.b()) {
                                x0Var.setValue(new c.b(R.string.ozonid_camera_access_denied, R.string.ozonid_allow_camera_access_in_settings, R.string.ozonid_open_settings, new e(0, this, C.class, "gotoSettings", "gotoSettings()V", 0)));
                                return;
                            }
                            return;
                        }
                    }
                    dVar2 = c.d.CHECK;
                }
                dVar = dVar2;
                x0Var2.setValue(new Fc0.c(enumC0196c, uri, z12, z13, z14, z15, z16, num, this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.CUSTOM, R.string.ozonid_camera_retake, Integer.valueOf(R.color.oz_white_1), Integer.valueOf(R.color.oz_blue)), this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, R.string.ozonid_camera_submit, null, null), dVar));
                if (!this.f6442u.c()) {
                }
            } else {
                valueOf = Integer.valueOf(R.string.ozonid_camera_disclaimer_check);
            }
            num = valueOf;
            aVar = this.f6412A;
            aVar2 = a.SELFIE;
            if (aVar != aVar2) {
            }
            if (aVar == aVar2) {
            }
            dVar = null;
            x0Var2.setValue(new Fc0.c(enumC0196c, uri, z12, z13, z14, z15, z16, num, this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.CUSTOM, R.string.ozonid_camera_retake, Integer.valueOf(R.color.oz_white_1), Integer.valueOf(R.color.oz_blue)), this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, R.string.ozonid_camera_submit, null, null), dVar));
            if (!this.f6442u.c()) {
            }
        }
        enumC0196c = enumC0196c2;
        Uri uri2 = this.f6443v;
        if (uri2 != null) {
        }
        boolean z132 = this.f6447z;
        if (uri2 != null) {
        }
        if (uri2 != null) {
        }
        boolean z162 = this.f6445x;
        if (aVar3 != aVar4) {
        }
        if (aVar3 == aVar4) {
        }
        num = null;
        aVar = this.f6412A;
        aVar2 = a.SELFIE;
        if (aVar != aVar2) {
        }
        if (aVar == aVar2) {
        }
        dVar = null;
        x0Var2.setValue(new Fc0.c(enumC0196c, uri2, z12, z132, z14, z15, z162, num, this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.CUSTOM, R.string.ozonid_camera_retake, Integer.valueOf(R.color.oz_white_1), Integer.valueOf(R.color.oz_blue)), this.f6443v != null ? null : new c.a(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, R.string.ozonid_camera_submit, null, null), dVar));
        if (!this.f6442u.c()) {
        }
    }

    public static final void j0(C c11) {
        Uri.Builder buildUpon;
        Uri.Builder appendQueryParameter;
        Uri uri = c11.f6414C;
        Uri build = (uri == null || (buildUpon = uri.buildUpon()) == null || (appendQueryParameter = buildUpon.appendQueryParameter("success", "true")) == null) ? null : appendQueryParameter.build();
        Uri.Builder appendQueryParameter2 = new Uri.Builder().scheme("ozon").authority("web").appendQueryParameter(ImagesContract.URL, build != null ? build.toString() : null);
        Uri build2 = appendQueryParameter2 != null ? appendQueryParameter2.build() : null;
        if (build == null) {
            c11.f6446y = true;
            c11.handleState();
        } else {
            String valueOf = String.valueOf(build2);
            c11.f6426e.tryEmit(Unit.f71690a);
            c11.f6425d.getValue().v(valueOf);
        }
    }

    public static final void k0(C c11) {
        c11.f6428g.tryEmit(Unit.f71690a);
    }

    public static final void l0(C c11) {
        c11.getClass();
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        Application application = c11.f6422a;
        intent.setData(Uri.fromParts("package", application.getPackageName(), null));
        application.startActivity(intent);
    }

    public static final void p0(C c11, boolean z11) {
        c11.f6447z = z11;
        c11.handleState();
    }

    private static Fc0.d v0(Uri uri) {
        String queryParameter;
        Fc0.d dVar;
        Fc0.d dVar2;
        C4852x c4852x;
        String queryParameter2;
        if (uri != null) {
            try {
                queryParameter = uri.getQueryParameter("videoQuality");
            } catch (NullPointerException unused) {
                dVar2 = Fc0.d.f9354d;
                return dVar2;
            } catch (UnsupportedOperationException unused2) {
                dVar = Fc0.d.f9354d;
                return dVar;
            }
        } else {
            queryParameter = null;
        }
        boolean parseBoolean = Boolean.parseBoolean(uri != null ? uri.getQueryParameter("videoEnabled") : null);
        long parseLong = (uri == null || (queryParameter2 = uri.getQueryParameter("videoChunkDurationMs")) == null) ? 5000L : Long.parseLong(queryParameter2);
        if (queryParameter != null) {
            int hashCode = queryParameter.hashCode();
            if (hashCode != 2300) {
                if (hashCode != 2641) {
                    if (hashCode != 69570) {
                        if (hashCode == 83985 && queryParameter.equals("UHD")) {
                            c4852x = C4852x.f33150d;
                            Intrinsics.f(c4852x);
                            return new Fc0.d(parseBoolean, parseLong, c4852x);
                        }
                    } else if (queryParameter.equals("FHD")) {
                        c4852x = C4852x.f33149c;
                        Intrinsics.f(c4852x);
                        return new Fc0.d(parseBoolean, parseLong, c4852x);
                    }
                } else if (queryParameter.equals("SD")) {
                    c4852x = C4852x.f33147a;
                    Intrinsics.f(c4852x);
                    return new Fc0.d(parseBoolean, parseLong, c4852x);
                }
            } else if (queryParameter.equals("HD")) {
                c4852x = C4852x.f33148b;
                Intrinsics.f(c4852x);
                return new Fc0.d(parseBoolean, parseLong, c4852x);
            }
        }
        c4852x = C4852x.f33148b;
        Intrinsics.f(c4852x);
        return new Fc0.d(parseBoolean, parseLong, c4852x);
    }

    @NotNull
    public final InterfaceC2395h<Fc0.e> A0() {
        return this.f6433l;
    }

    public final boolean B0() {
        return this.f6445x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(String str) {
        Uri parse;
        String str2;
        boolean z11;
        String queryParameter;
        String lastPathSegment;
        InterfaceC4008j<Nc0.f> interfaceC4008j = this.f6423b;
        interfaceC4008j.getValue().j();
        interfaceC4008j.getValue().hideLoader();
        resetChunkFiles();
        resetCombinedFile();
        td0.f.b(androidx.lifecycle.x0.a(this), null, new f(null));
        if (str != null) {
            try {
                parse = Uri.parse(str);
            } catch (Exception unused) {
                this.f6446y = true;
                handleState();
                return;
            }
        } else {
            parse = null;
        }
        if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null) {
            str2 = lastPathSegment.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
        }
        str2 = "";
        this.f6412A = a.valueOf(str2);
        String queryParameter2 = parse != null ? parse.getQueryParameter("returnUrl") : null;
        this.f6414C = queryParameter2 != null ? Uri.parse(queryParameter2) : null;
        this.f6416E = parse != null ? parse.getQueryParameter("token") : null;
        this.f6415D = v0(parse);
        if (parse != null && (queryParameter = parse.getQueryParameter("maxPhotoSize")) != null) {
            Long.parseLong(queryParameter);
        }
        int i11 = b.f6448a[this.f6412A.ordinal()];
        if (i11 == 1) {
            z11 = false;
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            z11 = true;
        }
        setBackCamera(z11);
        handleState();
    }

    public final void D0(@NotNull Fc0.e orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f6432k.tryEmit(orientation);
    }

    public final void E0() {
        q0();
        G0(null);
        if (this.f6415D.c()) {
            resetChunkFiles();
            resetCombinedFile();
            this.f6421J.tryEmit(Boolean.TRUE);
        }
    }

    public final void F0(@NotNull Fc0.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6442u = value;
        handleState();
    }

    public final void G0(Uri uri) {
        this.f6443v = uri;
        handleState();
    }

    public final void H0(boolean z11) {
        this.f6445x = z11;
        handleState();
    }

    public final void I0() {
        this.f6420I = 0;
        K0();
    }

    public final void J0() {
        Uri uri = this.f6443v;
        if (uri == null) {
            return;
        }
        this.f6447z = true;
        handleState();
        B0 b02 = this.f6413B;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f6413B = C10727i.c(a11, He.b.f10879b, null, new g(uri, null), 2);
    }

    public final void K0() {
        if (!this.f6415D.c()) {
            J0();
            return;
        }
        B0 b02 = this.f6419H;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        File file = new File(this.f6422a.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", this.f6412A.name(), ".mp4"));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f6419H = C10727i.c(a11, He.b.f10879b, null, new h(file, null), 2);
    }

    @NotNull
    public final File createChunkFile() {
        Application application = this.f6422a;
        new File(application.getFilesDir(), "/fin_video").mkdir();
        File file = new File(application.getFilesDir(), E.a(this.f6417F, "/fin_video/chunk_", ".mp4"));
        this.f6418G.push(file);
        this.f6417F++;
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createCombinedLastChunks() {
        MediaMuxer mediaMuxer;
        Application application;
        Ec0.a aVar;
        int i11;
        Iterator it;
        int parseInt;
        LinkedList<File> linkedList = this.f6418G;
        int size = linkedList.size();
        int i12 = 0;
        Application application2 = this.f6422a;
        int i13 = 1;
        if (size <= 1) {
            if (linkedList.size() == 1) {
                File file = linkedList.get(0);
                Intrinsics.checkNotNullExpressionValue(file, "get(...)");
                new File(application2.getFilesDir(), "/fin_video_combined").mkdir();
                file.renameTo(new File(application2.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", this.f6412A.name(), ".mp4")));
                return;
            }
            return;
        }
        File file2 = linkedList.get(0);
        Intrinsics.checkNotNullExpressionValue(file2, "get(...)");
        File file3 = linkedList.get(1);
        Intrinsics.checkNotNullExpressionValue(file3, "get(...)");
        File file4 = file3;
        new File(application2.getFilesDir(), "/fin_video_combined").mkdir();
        File dst = new File(application2.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", this.f6412A.name(), ".mp4"));
        ArrayList sources = new ArrayList();
        sources.add(file4);
        sources.add(file2);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (sources.isEmpty()) {
            aVar = new Ec0.a(0, "sources is empty, no any video files saved", false);
            application = application2;
        } else {
            try {
                MediaMuxer mediaMuxer2 = new MediaMuxer(dst.getPath(), 0);
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(((File) C7714v.K(sources)).getAbsolutePath());
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                        if (extractMetadata != null && (parseInt = Integer.parseInt(extractMetadata)) >= 0) {
                            mediaMuxer2.setOrientationHint(parseInt);
                        }
                        Iterator it2 = sources.iterator();
                        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                        int i14 = 0;
                        int i15 = 0;
                        MediaFormat mediaFormat = null;
                        int i16 = -1;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i17 = i13;
                            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                            File file5 = (File) next;
                            new MediaMetadataRetriever().setDataSource(file5.getAbsolutePath());
                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                            mediaMetadataRetriever2.setDataSource(file5.getAbsolutePath());
                            try {
                                String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(9);
                                Intrinsics.f(extractMetadata2);
                                i11 = Integer.parseInt(extractMetadata2);
                            } catch (Exception unused) {
                                i11 = i12;
                            }
                            MediaExtractor mediaExtractor = new MediaExtractor();
                            mediaExtractor.setDataSource(file5.getPath());
                            int trackCount = mediaExtractor.getTrackCount();
                            while (true) {
                                if (i12 >= trackCount) {
                                    it = it2;
                                    application = application2;
                                    break;
                                }
                                it = it2;
                                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i12);
                                int i18 = trackCount;
                                Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                                String string = trackFormat.getString("mime");
                                Intrinsics.f(string);
                                application = application2;
                                try {
                                    if (kotlin.text.h.e0(string, "video/", false)) {
                                        mediaExtractor.selectTrack(i12);
                                        mediaFormat = mediaExtractor.getTrackFormat(i12);
                                        break;
                                    } else {
                                        i12++;
                                        it2 = it;
                                        trackCount = i18;
                                        application2 = application;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    mediaMuxer = mediaMuxer2;
                                    try {
                                        Ec0.a aVar2 = new Ec0.a(0, e.getMessage(), false);
                                        if (mediaMuxer != null) {
                                            try {
                                                mediaMuxer.stop();
                                                mediaMuxer.release();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        aVar = aVar2;
                                        if (aVar.a()) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (mediaMuxer != null) {
                                            try {
                                                mediaMuxer.stop();
                                                mediaMuxer.release();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                            if (i16 == -1) {
                                Intrinsics.f(mediaFormat);
                                i16 = mediaMuxer2.addTrack(mediaFormat);
                            }
                            ByteBuffer allocate = ByteBuffer.allocate(262144);
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            if (i15 == 0) {
                                mediaMuxer2.start();
                                i15 = i17;
                            }
                            int i19 = 0;
                            while (i19 == 0) {
                                int i21 = i19;
                                bufferInfo.offset = 0;
                                int readSampleData = mediaExtractor.readSampleData(allocate, 0);
                                bufferInfo.size = readSampleData;
                                if (readSampleData < 0) {
                                    bufferInfo.size = 0;
                                    i19 = i17;
                                } else {
                                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime() + i14;
                                    bufferInfo.flags = i17;
                                    mediaMuxer2.writeSampleData(i16, allocate, bufferInfo);
                                    mediaExtractor.advance();
                                    mediaFormat = mediaFormat;
                                    i15 = i15;
                                    i19 = i21;
                                    i17 = 1;
                                }
                            }
                            mediaExtractor.release();
                            i14 += i11 * 1000;
                            mediaFormat = mediaFormat;
                            i15 = i15;
                            it2 = it;
                            application2 = application;
                            i12 = 0;
                            i13 = 1;
                        }
                        application = application2;
                        aVar = new Ec0.a(i14 / 1000, null, true);
                        try {
                            mediaMuxer2.stop();
                            mediaMuxer2.release();
                        } catch (Exception unused4) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mediaMuxer = mediaMuxer2;
                        if (mediaMuxer != null) {
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    application = application2;
                }
            } catch (Exception e13) {
                e = e13;
                application = application2;
                mediaMuxer = null;
            } catch (Throwable th4) {
                th = th4;
                mediaMuxer = null;
            }
        }
        if (aVar.a()) {
            resetCombinedFile();
            new File(application.getFilesDir(), "/fin_video_combined").mkdir();
            file4.renameTo(new File(application.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", this.f6412A.name(), ".mp4")));
        }
    }

    @NotNull
    public final Ae.w0<Boolean> getStartVideoFlow() {
        return this.f6421J;
    }

    public final int getVideoUploadAttempt() {
        return this.f6420I;
    }

    public final void onBackPressed() {
        B0 b02 = this.f6413B;
        if (b02 != null) {
            ((H0) b02).j(null);
            this.f6413B = null;
            this.f6447z = false;
            handleState();
            q0();
            return;
        }
        B0 b03 = this.f6419H;
        if (b03 != null) {
            ((H0) b03).j(null);
            this.f6419H = null;
            this.f6447z = false;
            handleState();
            resetChunkFiles();
            resetCombinedFile();
            return;
        }
        if (this.f6443v != null) {
            G0(null);
            q0();
        } else {
            q0();
            this.f6426e.tryEmit(Unit.f71690a);
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        B0 b02 = this.f6441t;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f6441t = null;
        resetChunkFiles();
        resetCombinedFile();
        super.onCleared();
    }

    public final void onPause() {
        if (this.f6412A == a.SELFIE) {
            B0 b02 = this.f6441t;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f6441t = null;
        }
    }

    public final void onResume() {
        if (this.f6412A == a.SELFIE) {
            c.d value = this.f6440s.getValue();
            value.getClass();
            if (c.d.a.f9353a[value.ordinal()] == 3) {
                return;
            }
            B0 b02 = this.f6441t;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f6441t = null;
            this.f6441t = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new D(this, null), 3);
        }
    }

    public final void q0() {
        Hc0.d value = this.f6424c.getValue();
        Uri uri = this.f6443v;
        value.getClass();
        Hc0.d.a(uri, null);
    }

    public final boolean r0() {
        return this.f6444w;
    }

    public final void resetChunkFiles() {
        File[] listFiles;
        File file = new File(this.f6422a.getFilesDir(), "/fin_video");
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        } catch (Exception unused) {
        }
        this.f6417F = 0;
        this.f6418G.clear();
    }

    public final void resetCombinedFile() {
        new File(this.f6422a.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", this.f6412A.name(), ".mp4")).delete();
    }

    @NotNull
    public final InterfaceC2395h<Fc0.b> s0() {
        return this.f6437p;
    }

    public final void setBackCamera(boolean z11) {
        this.f6444w = z11;
        handleState();
    }

    public final void setVideoUploadAttempt(int i11) {
        this.f6420I = i11;
    }

    @NotNull
    public final InterfaceC2395h<Fc0.c> t0() {
        return this.f6439r;
    }

    @NotNull
    public final Fc0.d u0() {
        return this.f6415D;
    }

    @NotNull
    public final InterfaceC2395h<Object> w0() {
        return this.f6427f;
    }

    @NotNull
    public final InterfaceC2395h<Object> x0() {
        return this.f6429h;
    }

    @NotNull
    public final InterfaceC2395h<Integer> y0() {
        return this.f6431j;
    }

    @NotNull
    public final InterfaceC2395h<c.b> z0() {
        return this.f6435n;
    }
}
