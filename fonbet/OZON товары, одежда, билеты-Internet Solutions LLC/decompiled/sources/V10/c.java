package V10;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import z00.f;

/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f27934a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27935b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27936c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<ButtonV3Atom.SmallButton> f27937d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1<AtomAction, Unit> f27938e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0<Unit> f27939f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0<Unit> f27940g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27941h;

    public c(String str, String str2, String str3, @NotNull List buttons, Function1 function1, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f27934a = str;
        this.f27935b = str2;
        this.f27936c = str3;
        this.f27937d = buttons;
        this.f27938e = function1;
        this.f27939f = function0;
        this.f27940g = function02;
        this.f27941h = true;
    }

    public final Function0<Unit> a() {
        return this.f27939f;
    }

    public final String b() {
        return this.f27936c;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallButton> c() {
        return this.f27937d;
    }

    public final Function1<AtomAction, Unit> d() {
        return this.f27938e;
    }

    public final String e() {
        return this.f27935b;
    }

    public final Function0<Unit> f() {
        return this.f27940g;
    }

    public final String getTitle() {
        return this.f27934a;
    }

    @Override // z00.f
    /* renamed from: isError */
    public final boolean getIsError() {
        return this.f27941h;
    }
}
