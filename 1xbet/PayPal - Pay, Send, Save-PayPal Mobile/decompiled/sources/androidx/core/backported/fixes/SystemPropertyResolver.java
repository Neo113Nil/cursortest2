package androidx.core.backported.fixes;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/core/backported/fixes/SystemPropertyResolver;", "Landroidx/core/backported/fixes/StatusResolver;", "<init>", "()V", "Landroidx/core/backported/fixes/KnownIssue;", "ki", "Landroidx/core/backported/fixes/Status;", "getStatus", "(Landroidx/core/backported/fixes/KnownIssue;)Landroidx/core/backported/fixes/Status;", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)[J", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/String;", "", "", "aliases$delegate", "Lkotlin/Lazy;", "getAliases", "()Ljava/util/Set;", "aliases"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemPropertyResolver implements androidx.core.backported.fixes.StatusResolver {

    /* renamed from: aliases$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy aliases = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.core.backported.fixes.SystemPropertyResolver$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.core.backported.fixes.SystemPropertyResolver.$r8$lambda$WUGZ1J69Ga10Y7fYyHq8WrTbPFQ(androidx.core.backported.fixes.SystemPropertyResolver.this);
        }
    });

    public final java.util.Set<java.lang.Integer> getAliases() {
        return (java.util.Set) this.aliases.getValue();
    }

    @Override // androidx.core.backported.fixes.StatusResolver
    public final androidx.core.backported.fixes.Status getStatus(androidx.core.backported.fixes.KnownIssue ki) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ki, "");
        if (ki.getAlias() == null) {
            return androidx.core.backported.fixes.Status.Unknown;
        }
        if (getAliases().contains(ki.getAlias())) {
            return androidx.core.backported.fixes.Status.Fixed;
        }
        return androidx.core.backported.fixes.Status.NotFixed;
    }

    private static long[] getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.Iterator it = kotlin.text.StringsKt.split$default((java.lang.CharSequence) p0, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA}, false, 0, 6, (java.lang.Object) null).iterator();
        while (it.hasNext()) {
            try {
                createListBuilder.add(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it.next())));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return kotlin.collections.CollectionsKt.toLongArray(kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object invoke = cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, androidx.core.backported.fixes.SystemPropertyResolverKt.ALIAS_BITSET_PROP_NAME, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            return (java.lang.String) invoke;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ java.util.Set $r8$lambda$WUGZ1J69Ga10Y7fYyHq8WrTbPFQ(androidx.core.backported.fixes.SystemPropertyResolver systemPropertyResolver) {
        java.util.BitSet valueOf = java.util.BitSet.valueOf(getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI()));
        int size = valueOf.size();
        if (size == 0) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder(size);
        for (int i = 0; i >= 0; i = valueOf.nextSetBit(i + 1)) {
            if (valueOf.get(i)) {
                createSetBuilder.add(java.lang.Integer.valueOf(i));
            }
            if (i == Integer.MAX_VALUE) {
                break;
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }
}
