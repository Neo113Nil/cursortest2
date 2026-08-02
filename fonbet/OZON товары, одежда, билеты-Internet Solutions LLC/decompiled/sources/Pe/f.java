package Pe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22288a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22289b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f22290c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22291d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private a f22292e;

    public f() {
        a classDiscriminatorMode = a.POLYMORPHIC;
        Intrinsics.checkNotNullParameter("    ", "prettyPrintIndent");
        Intrinsics.checkNotNullParameter("type", "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f22288a = true;
        this.f22289b = "    ";
        this.f22290c = "type";
        this.f22291d = true;
        this.f22292e = classDiscriminatorMode;
    }

    @NotNull
    public final String a() {
        return this.f22290c;
    }

    @NotNull
    public final a b() {
        return this.f22292e;
    }

    public final boolean c() {
        return this.f22288a;
    }

    @NotNull
    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f22288a + ", prettyPrintIndent='" + this.f22289b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f22290c + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f22291d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f22292e + ')';
    }
}
