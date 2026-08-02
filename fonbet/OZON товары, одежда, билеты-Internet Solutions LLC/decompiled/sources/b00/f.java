package b00;

import S0.B1;
import S0.G0;
import WZ.l;
import a00.C4911f;
import a00.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u0016"}, d2 = {"LS0/G0;", "Lb00/a;", "a", "LS0/G0;", "b", "()LS0/G0;", "LocalComposerContainer", "LQZ/a;", "Ll20/a;", "LocalComposer", "Ll10/b;", "c", "LocalComposerController", "LWZ/l;", "d", "e", "LocalTokenizedAnalytics", "La00/f;", "LocalOwnerContainer", "La00/h;", "f", "LocalViewModelOwnerProvider", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f45594a = new B1(b.f45601b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final B1 f45595b = new B1(a.f45600b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final B1 f45596c = new B1(c.f45602b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final B1 f45597d = new B1(e.f45604b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final B1 f45598e = new B1(d.f45603b);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final B1 f45599f = new B1(C0827f.f45605b);

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<QZ.a<? extends C7854a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f45600b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final QZ.a<? extends C7854a> invoke() {
            throw new IllegalStateException("CompositionLocal Composer not present. Use only inside composer compose widget");
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<C5497a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f45601b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C5497a invoke() {
            throw new IllegalStateException("CompositionLocal ComposerComposeContainer not present. Use only inside composer compose widget");
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<InterfaceC7851b> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f45602b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC7851b invoke() {
            throw new IllegalStateException("CompositionLocal ComposerController not present. Use only inside composer compose widget");
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function0<C4911f> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f45603b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final C4911f invoke() {
            throw new IllegalStateException("CompositionLocal OwnerContainer not present. Use only inside composer compose widget");
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends AbstractC7737t implements Function0<l> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f45604b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final l invoke() {
            throw new IllegalStateException("CompositionLocal TokenizedAnalytics not present. Use only inside composer compose widget");
        }
    }

    /* renamed from: b00.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0827f extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0827f f45605b = new C0827f(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            throw new IllegalStateException("CompositionLocal ViewModelOwnerProvider not present. Use only inside composer compose widget");
        }
    }

    @NotNull
    public static final G0<QZ.a<? extends C7854a>> a() {
        return f45595b;
    }

    @NotNull
    public static final G0<C5497a> b() {
        return f45594a;
    }

    @NotNull
    public static final G0<InterfaceC7851b> c() {
        return f45596c;
    }

    @NotNull
    public static final G0<C4911f> d() {
        return f45598e;
    }

    @NotNull
    public static final G0<l> e() {
        return f45597d;
    }

    @NotNull
    public static final G0<h> f() {
        return f45599f;
    }
}
