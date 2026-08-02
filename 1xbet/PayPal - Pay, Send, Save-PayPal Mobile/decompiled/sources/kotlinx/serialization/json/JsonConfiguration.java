package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001Bµ\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010\r\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b(\u0010\u001dR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b0\u0010\u001dR(\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u00101\u0012\u0004\b6\u0010-\u001a\u0004\b2\u00103\"\u0004\b4\u00105"}, d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "allowComments", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/JsonNamingStrategy;ZZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "()Ljava/lang/String;", "Z", "getEncodeDefaults", "()Z", "getIgnoreUnknownKeys", "getAllowStructuredMapKeys", "getPrettyPrint", "getExplicitNulls", "Ljava/lang/String;", "getPrettyPrintIndent", "getCoerceInputValues", "getUseArrayPolymorphism", "getClassDiscriminator", "getAllowSpecialFloatingPointValues", "getUseAlternativeNames", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy$annotations", "()V", "getDecodeEnumsCaseInsensitive", "getAllowTrailingComma", "getAllowComments", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonConfiguration {
    private final boolean allowComments;
    private final boolean allowSpecialFloatingPointValues;
    private final boolean allowStructuredMapKeys;
    private final boolean allowTrailingComma;
    private final java.lang.String classDiscriminator;
    private kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode;
    private final boolean coerceInputValues;
    private final boolean decodeEnumsCaseInsensitive;
    private final boolean encodeDefaults;
    private final boolean explicitNulls;
    private final boolean ignoreUnknownKeys;
    private final boolean isLenient;
    private final kotlinx.serialization.json.JsonNamingStrategy namingStrategy;
    private final boolean prettyPrint;
    private final java.lang.String prettyPrintIndent;
    private final boolean useAlternativeNames;
    private final boolean useArrayPolymorphism;

    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str, boolean z7, boolean z8, java.lang.String str2, boolean z9, boolean z10, kotlinx.serialization.json.JsonNamingStrategy jsonNamingStrategy, boolean z11, boolean z12, boolean z13, kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDiscriminatorMode, "");
        this.encodeDefaults = z;
        this.ignoreUnknownKeys = z2;
        this.isLenient = z3;
        this.allowStructuredMapKeys = z4;
        this.prettyPrint = z5;
        this.explicitNulls = z6;
        this.prettyPrintIndent = str;
        this.coerceInputValues = z7;
        this.useArrayPolymorphism = z8;
        this.classDiscriminator = str2;
        this.allowSpecialFloatingPointValues = z9;
        this.useAlternativeNames = z10;
        this.namingStrategy = jsonNamingStrategy;
        this.decodeEnumsCaseInsensitive = z11;
        this.allowTrailingComma = z12;
        this.allowComments = z13;
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    /* renamed from: isLenient, reason: from getter */
    public final boolean getIsLenient() {
        return this.isLenient;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str, boolean z7, boolean z8, java.lang.String str2, boolean z9, boolean z10, kotlinx.serialization.json.JsonNamingStrategy jsonNamingStrategy, boolean z11, boolean z12, boolean z13, kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : jsonNamingStrategy, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & 65536) != 0 ? kotlinx.serialization.json.ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }

    public final java.lang.String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    public final java.lang.String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final kotlinx.serialization.json.JsonNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    public final boolean getAllowComments() {
        return this.allowComments;
    }

    public final kotlinx.serialization.json.ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.")
    public final void setClassDiscriminatorMode(kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDiscriminatorMode, "");
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.encodeDefaults);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.ignoreUnknownKeys);
        sb.append(", isLenient=");
        sb.append(this.isLenient);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.allowStructuredMapKeys);
        sb.append(", prettyPrint=");
        sb.append(this.prettyPrint);
        sb.append(", explicitNulls=");
        sb.append(this.explicitNulls);
        sb.append(", prettyPrintIndent='");
        sb.append(this.prettyPrintIndent);
        sb.append("', coerceInputValues=");
        sb.append(this.coerceInputValues);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.useArrayPolymorphism);
        sb.append(", classDiscriminator='");
        sb.append(this.classDiscriminator);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.allowSpecialFloatingPointValues);
        sb.append(", useAlternativeNames=");
        sb.append(this.useAlternativeNames);
        sb.append(", namingStrategy=");
        sb.append(this.namingStrategy);
        sb.append(", decodeEnumsCaseInsensitive=");
        sb.append(this.decodeEnumsCaseInsensitive);
        sb.append(", allowTrailingComma=");
        sb.append(this.allowTrailingComma);
        sb.append(", allowComments=");
        sb.append(this.allowComments);
        sb.append(", classDiscriminatorMode=");
        sb.append(this.classDiscriminatorMode);
        sb.append(')');
        return sb.toString();
    }

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }
}
