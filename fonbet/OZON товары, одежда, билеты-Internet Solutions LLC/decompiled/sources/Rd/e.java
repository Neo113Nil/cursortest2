package Rd;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e extends Pd.a {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final e f25015g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e f25016h;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25017f;

    static {
        e eVar = new e(2, 0, 0);
        f25015g = eVar;
        f25016h = (eVar.a() == 1 && eVar.b() == 9) ? new e(2, 0, 0) : new e(eVar.a(), eVar.b() + 1, 0);
        new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull int[] versionArray, boolean z11) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f25017f = z11;
    }

    private final boolean j(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean g(@NotNull e metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f25015g;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        e i11 = metadataVersionFromLanguageVersion.i(this.f25017f);
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !j(i11);
    }

    public final boolean h() {
        return this.f25017f;
    }

    @NotNull
    public final e i(boolean z11) {
        e eVar = z11 ? f25015g : f25016h;
        return eVar.j(this) ? eVar : this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
