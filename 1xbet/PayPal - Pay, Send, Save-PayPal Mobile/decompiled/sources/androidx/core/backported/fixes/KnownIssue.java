package androidx.core.backported.fixes;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014"}, d2 = {"Landroidx/core/backported/fixes/KnownIssue;", "", "", "id", "", "alias", "", "", "manuallyTestedFingerprints", "Lkotlin/Function0;", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.PRECONDITION_KEY, "<init>", "(JLjava/lang/Integer;Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Ljava/lang/Integer;", "getAlias$core_backported_fixes", "()Ljava/lang/Integer;", "Ljava/util/Set;", "getManuallyTestedFingerprints$core_backported_fixes", "()Ljava/util/Set;", "Lkotlin/jvm/functions/Function0;", "getPrecondition$core_backported_fixes", "()Lkotlin/jvm/functions/Function0;", "url", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KnownIssue {
    private final java.lang.Integer alias;
    private final long id;
    private final java.util.Set<java.lang.String> manuallyTestedFingerprints;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> precondition;
    private final java.lang.String url;

    public static /* synthetic */ boolean $r8$lambda$3RZ4F6EfPweem0drDMoB3xvz3Hs() {
        return true;
    }

    public KnownIssue(long j, java.lang.Integer num, java.util.Set<java.lang.String> set, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.id = j;
        this.alias = num;
        this.manuallyTestedFingerprints = set;
        this.precondition = function0;
        this.url = "https://issuetracker.google.com/issues/".concat(java.lang.String.valueOf(j));
    }

    public final long getId() {
        return this.id;
    }

    /* renamed from: getAlias$core_backported_fixes, reason: from getter */
    public final java.lang.Integer getAlias() {
        return this.alias;
    }

    public /* synthetic */ KnownIssue(long j, java.lang.Integer num, java.util.Set set, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, num, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.core.backported.fixes.KnownIssue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.core.backported.fixes.KnownIssue.$r8$lambda$3RZ4F6EfPweem0drDMoB3xvz3Hs());
            }
        } : function0);
    }

    public final java.util.Set<java.lang.String> getManuallyTestedFingerprints$core_backported_fixes() {
        return this.manuallyTestedFingerprints;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getPrecondition$core_backported_fixes() {
        return this.precondition;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.core.backported.fixes.KnownIssue) && this.id == ((androidx.core.backported.fixes.KnownIssue) other).id;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.id);
    }

    public final java.lang.String toString() {
        if (this.alias == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.id);
            sb.append(" without alias");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.id);
        sb2.append(" with alias ");
        sb2.append(this.alias.intValue());
        return sb2.toString();
    }
}
