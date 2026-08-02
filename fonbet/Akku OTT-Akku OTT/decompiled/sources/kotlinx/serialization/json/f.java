package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final EnumC1176a e;

    public f() {
        EnumC1176a classDiscriminatorMode = EnumC1176a.b;
        Intrinsics.checkNotNullParameter("    ", "prettyPrintIndent");
        Intrinsics.checkNotNullParameter("type", "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.a = true;
        this.b = "    ";
        this.c = "type";
        this.d = true;
        this.e = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.a + ", prettyPrintIndent='" + this.b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.c + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.e + ')';
    }
}
