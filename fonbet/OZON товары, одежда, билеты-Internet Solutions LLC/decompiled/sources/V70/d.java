package V70;

import Ca.h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.e;
import androidx.work.impl.C;
import androidx.work.q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g30.InterfaceC6618a;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.recordaudio.domain.AudioRecordWorker;
import ru.ozon.fintech.features.recordaudio.domain.CleanupWorker;
import ru.ozon.fintech.features.recordaudio.network.AudioRecordNetwork;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.Y;

/* loaded from: classes3.dex */
public final class d implements V70.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f28402b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f28403c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AudioRecordNetwork f28404d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final O30.b f28405e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R30.a f28406f;

    /* renamed from: g, reason: collision with root package name */
    private f f28407g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f28408h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28409i;

    /* renamed from: j, reason: collision with root package name */
    private String f28410j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28411k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28412l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28413m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28414n;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.recordaudio.domain.AudioRecordInteractorImpl$setCookieHeaders$1", f = "AudioRecordInteractorImpl.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f28415d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f28415d;
            if (i11 == 0) {
                s.b(obj);
                AudioRecordNetwork audioRecordNetwork = d.this.f28404d;
                this.f28415d = 1;
                if (audioRecordNetwork.postForCachingTestCookie(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.recordaudio.domain.AudioRecordInteractorImpl$startRecording$3", f = "AudioRecordInteractorImpl.kt", l = {111, 119}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        long f28417d;

        /* renamed from: e, reason: collision with root package name */
        int f28418e;

        /* renamed from: f, reason: collision with root package name */
        int f28419f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f28420g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f28420g = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (V70.d.l(r5, r9, true, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        
            if (V70.d.l(r5, 300, false, r11) != r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:12:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long i11;
            M m11;
            int i12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i13 = this.f28419f;
            d dVar = d.this;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    dVar.f28407g = null;
                    return Unit.f71690a;
                }
                i12 = this.f28418e;
                i11 = this.f28417d;
                m11 = (M) this.f28420g;
                s.b(obj);
                i12++;
                if (i12 >= i11) {
                    dVar.f28409i = false;
                }
                if (dVar.f28409i || !N.f(m11)) {
                    this.f28420g = null;
                    this.f28419f = 2;
                } else {
                    long j11 = d.j(dVar);
                    this.f28420g = m11;
                    this.f28417d = i11;
                    this.f28418e = i12;
                    this.f28419f = 1;
                }
                return aVar;
            }
            s.b(obj);
            M m12 = (M) this.f28420g;
            i11 = d.i(dVar) / d.j(dVar);
            m11 = m12;
            i12 = 0;
            if (dVar.f28409i) {
            }
            this.f28420g = null;
            this.f28419f = 2;
        }
    }

    public d(@NotNull Context context, @NotNull InterfaceC6618a analyticInteractor, @NotNull Q90.c featureToggles, @NotNull AudioRecordNetwork audioRecordNetwork, @NotNull O30.b type, @NotNull R30.a appCoroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(audioRecordNetwork, "audioRecordNetwork");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f28401a = context;
        this.f28402b = analyticInteractor;
        this.f28403c = featureToggles;
        this.f28404d = audioRecordNetwork;
        this.f28405e = type;
        this.f28406f = appCoroutineScope;
        this.f28411k = k.b(new Oe.M(this, 1));
        this.f28412l = k.b(new F70.c(this, 3));
        this.f28413m = k.b(new G30.a(this, 2));
        this.f28414n = k.b(new h(this, 3));
    }

    public static long d(d dVar) {
        Long dictLong = dVar.f28403c.q(S90.c.MOB_AUDIO_CONFIG).b().getDictLong("segmentDuration");
        if (dictLong != null) {
            return dictLong.longValue() * 1000;
        }
        return 5000L;
    }

    public static long e(d dVar) {
        Long dictLong = dVar.f28403c.q(S90.c.MOB_AUDIO_CONFIG).b().getDictLong("maxRecordingDuration");
        if (dictLong != null) {
            return dictLong.longValue() * 1000;
        }
        return 30L;
    }

    public static V70.a f(d dVar) {
        String dictString = dVar.f28403c.q(S90.c.MOB_AUDIO_CONFIG).b().getDictString("quality");
        if (dictString != null) {
            String upperCase = dictString.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            V70.a valueOf = V70.a.valueOf(upperCase);
            if (valueOf != null) {
                return valueOf;
            }
        }
        return V70.a.MEDIUM;
    }

    public static long g(d dVar) {
        Long dictLong = dVar.f28403c.q(S90.c.MOB_AUDIO_CONFIG).b().getDictLong("lifecycleRecording");
        if (dictLong != null) {
            return dictLong.longValue();
        }
        return 72L;
    }

    public static final long i(d dVar) {
        return ((Number) dVar.f28413m.getValue()).longValue();
    }

    public static final long j(d dVar) {
        return ((Number) dVar.f28412l.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(d dVar, long j11, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        File a11;
        dVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f28400h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f28400h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f28398f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f28400h;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f28396d = dVar;
                    cVar2.f28397e = z11;
                    cVar2.f28400h = 1;
                    if (Y.b(j11, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = cVar2.f28397e;
                    dVar = cVar2.f28396d;
                    s.b(obj);
                }
                f fVar = dVar.f28407g;
                a11 = fVar == null ? fVar.a(z11) : null;
                if (a11 != null) {
                    q.a aVar2 = new q.a(AudioRecordWorker.class);
                    Pair[] pairArr = {new Pair("filePath", a11.getAbsolutePath()), new Pair("issueId", dVar.f28410j), new Pair("FINTECH_ACTIVITY_LIB_TYPE_KEY", Integer.valueOf(dVar.f28405e.ordinal()))};
                    e.a aVar3 = new e.a();
                    for (int i13 = 0; i13 < 3; i13++) {
                        Pair pair = pairArr[i13];
                        aVar3.b((String) pair.e(), pair.f());
                    }
                    androidx.work.e a12 = aVar3.a();
                    Intrinsics.checkNotNullExpressionValue(a12, "dataBuilder.build()");
                    q b11 = aVar2.m(a12).b();
                    C i14 = C.i(dVar.f28401a);
                    i14.getClass();
                    i14.e(Collections.singletonList(b11));
                }
                return Unit.f71690a;
            }
        }
        cVar2 = new c(dVar, cVar);
        Object obj2 = cVar2.f28398f;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f28400h;
        if (i11 != 0) {
        }
        f fVar2 = dVar.f28407g;
        if (fVar2 == null) {
        }
        if (a11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // V70.b
    public final void a() {
        this.f28402b.g0();
        this.f28409i = false;
    }

    @Override // V70.b
    public final void b() {
        C10727i.c(this.f28406f.b(), null, null, new a(null), 3);
    }

    @Override // V70.b
    public final void c(@NotNull String issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        this.f28402b.I0();
        a();
        B0 b02 = this.f28408h;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f28410j = issueId;
        Context context = this.f28401a;
        File file = new File(context.getCacheDir(), issueId);
        file.mkdirs();
        f fVar = new f(file, (V70.a) this.f28411k.getValue(), issueId);
        fVar.b();
        this.f28409i = true;
        this.f28407g = fVar;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f28408h = C10727i.c(N.a(He.b.f10879b), null, null, new b(null), 3);
        q.a k11 = new q.a(CleanupWorker.class).k(((Number) this.f28414n.getValue()).longValue(), TimeUnit.HOURS);
        Pair[] pairArr = {new Pair("issueId", issueId), new Pair("FINTECH_ACTIVITY_LIB_TYPE_KEY", Integer.valueOf(this.f28405e.ordinal()))};
        e.a aVar = new e.a();
        for (int i11 = 0; i11 < 2; i11++) {
            Pair pair = pairArr[i11];
            aVar.b((String) pair.e(), pair.f());
        }
        androidx.work.e a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "dataBuilder.build()");
        q b11 = k11.m(a11).b();
        C i12 = C.i(context);
        i12.getClass();
        i12.e(Collections.singletonList(b11));
    }
}
