package io.ktor.util.collections;

/* compiled from: MapDelegates.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class MapDelegatesKt$asBoolean$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.String> {
    public static final io.ktor.util.collections.MapDelegatesKt$asBoolean$1 INSTANCE = new io.ktor.util.collections.MapDelegatesKt$asBoolean$1();

    MapDelegatesKt$asBoolean$1() {
        super(1, java.lang.Boolean.TYPE, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.String invoke(java.lang.Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final java.lang.String invoke(boolean z) {
        return java.lang.String.valueOf(z);
    }
}
