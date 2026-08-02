package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BH\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rB0\b\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#"}, d2 = {"Landroidx/navigation3/runtime/NavEntry;", "", "T", "key", "contentKey", "", "", "metadata", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)V", "navEntry", "(Landroidx/navigation3/runtime/NavEntry;Lkotlin/jvm/functions/Function3;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "getContentKey", "()Ljava/lang/Object;", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavEntry<T> {
    public static final int $stable = 0;
    private final java.lang.Object contentKey;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, java.lang.Object> metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public NavEntry(T t, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getHighSpeedVideoSizes = t;
        this.contentKey = obj;
        this.metadata = map;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
    }

    public /* synthetic */ NavEntry(java.lang.Object obj, java.lang.Object obj2, java.util.Map map, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? androidx.navigation3.runtime.NavEntryKt.defaultContentKey(obj) : obj2, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, function3);
    }

    public final java.lang.Object getContentKey() {
        return this.contentKey;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return this.metadata;
    }

    public NavEntry(androidx.navigation3.runtime.NavEntry<T> navEntry, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this(navEntry.getHighSpeedVideoSizes, navEntry.contentKey, navEntry.metadata, function3);
    }

    public final void Content(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(295512821);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(295512821, i2, -1, "androidx.navigation3.runtime.NavEntry.Content (NavEntry.kt:63)");
            }
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoSizes, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.runtime.NavEntry$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.navigation3.runtime.NavEntry.$r8$lambda$Mqzf2a9K1mfyCvZmGve_Cftgmb8(androidx.navigation3.runtime.NavEntry.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, navEntry.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentKey, navEntry.contentKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, navEntry.metadata) && this.getHighResolutionOutputSizeshNQ4ISI == navEntry.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + (this.contentKey.hashCode() * 31) + (this.metadata.hashCode() * 31) + (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavEntry(key=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", contentKey=");
        sb.append(this.contentKey);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", content=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mqzf2a9K1mfyCvZmGve_Cftgmb8(androidx.navigation3.runtime.NavEntry navEntry, int i, androidx.compose.runtime.Composer composer, int i2) {
        navEntry.Content(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
