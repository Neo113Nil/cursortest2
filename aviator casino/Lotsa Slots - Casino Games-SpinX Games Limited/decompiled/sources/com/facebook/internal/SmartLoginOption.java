package com.facebook.internal;

/* compiled from: SmartLoginOption.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "value", "", "(Ljava/lang/String;IJ)V", "getValue", "()J", "None", "Enabled", "RequireConfirm", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final java.util.EnumSet<com.facebook.internal.SmartLoginOption> ALL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.SmartLoginOption.Companion INSTANCE = new com.facebook.internal.SmartLoginOption.Companion(null);
    private final long value;

    @kotlin.jvm.JvmStatic
    public static final java.util.EnumSet<com.facebook.internal.SmartLoginOption> parseOptions(long j) {
        return INSTANCE.parseOptions(j);
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    static {
        java.util.EnumSet<com.facebook.internal.SmartLoginOption> allOf = java.util.EnumSet.allOf(com.facebook.internal.SmartLoginOption.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    /* compiled from: SmartLoginOption.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/internal/SmartLoginOption$Companion;", "", "()V", "ALL", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "parseOptions", "bitmask", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.EnumSet<com.facebook.internal.SmartLoginOption> parseOptions(long bitmask) {
            java.util.EnumSet<com.facebook.internal.SmartLoginOption> result = java.util.EnumSet.noneOf(com.facebook.internal.SmartLoginOption.class);
            java.util.Iterator it = com.facebook.internal.SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                com.facebook.internal.SmartLoginOption smartLoginOption = (com.facebook.internal.SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & bitmask) != 0) {
                    result.add(smartLoginOption);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.internal.SmartLoginOption[] valuesCustom() {
        com.facebook.internal.SmartLoginOption[] valuesCustom = values();
        return (com.facebook.internal.SmartLoginOption[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
