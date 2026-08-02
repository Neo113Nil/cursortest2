package androidx.core.backported.fixes;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b6\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/backported/fixes/KnownIssues;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class KnownIssues {
    public static final androidx.core.backported.fixes.KnownIssue KI_350037023 = new androidx.core.backported.fixes.KnownIssue(350037023, 1, null, null, 12, null);
    public static final androidx.core.backported.fixes.KnownIssue KI_372917199 = new androidx.core.backported.fixes.KnownIssue(372917199, 2, kotlin.collections.SetsKt.setOf("foo/bar/manually_tested"), new kotlin.jvm.functions.Function0() { // from class: androidx.core.backported.fixes.KnownIssues$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean equals;
            equals = android.os.Build.BRAND.equals("robolectric");
            return java.lang.Boolean.valueOf(equals);
        }
    });
    public static final androidx.core.backported.fixes.KnownIssue KI_350037348 = new androidx.core.backported.fixes.KnownIssue(350037348, 3, null, null, 12, null);
    public static final androidx.core.backported.fixes.KnownIssue KI_398591036 = new androidx.core.backported.fixes.KnownIssue(398591036, 5, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"google/blazer/blazer:16/BD3A.250721.001.B7/13955164:user/release-keys", "google/caiman/caiman:16/BP3A.250905.014/13873947:user/release-keys", "google/comet/comet:16/BP3A.250905.014/13873947:user/release-keys", "google/frankel/frankel:16/BD3A.250721.001.B7/13955164:user/release-keys", "google/komodo/komodo:16/BP3A.250905.014/13873947:user/release-keys", "google/mustang/mustang:16/BD3A.250721.001.B7/13955164:user/release-keys", "google/tokay/tokay:16/BP3A.250905.014/13873947:user/release-keys", "google/blazer/blazer:16/BD3A.251005.003.W3/14147046:user/release-keys", "google/blazer/blazer:16/BD3A.251005.003.J5/14147083:user/release-keys", "google/caiman/caiman:16/BP3A.251005.004.B1/14042072:user/release-keys", "google/comet/comet:16/BP3A.251005.004.B1/14042072:user/release-keys", "google/frankel/frankel:16/BD3A.251005.003.W3/14147046:user/release-keys", "google/frankel/frankel:16/BD3A.251005.003.J5/14147083:user/release-keys", "google/komodo/komodo:16/BP3A.251005.004.B1/14042072:user/release-keys", "google/mustang/mustang:16/BD3A.251005.003.J5/14147083:user/release-keys", "google/mustang/mustang:16/BD3A.251005.003.W3/14147046:user/release-keys", "google/rango/rango:16/BD3A.251005.003.W3/14147046:user/release-keys", "google/rango/rango:16/BD3A.251005.003.J5/14147083:user/release-keys", "google/tokay/tokay:16/BP3A.251005.004.B1/14042072:user/release-keys", "google/blazer/blazer:16/BD3A.251105.010.E1/14337626:user/release-keys", "google/blazer/blazer:16/BD3A.251105.010.F1/14341671:user/release-keys", "google/blazer/blazer:16/BD3A.251105.010.J3/14341896:user/release-keys", "google/caiman/caiman:16/BP3A.251105.015/14339231:user/release-keys", "google/comet/comet:16/BP3A.251105.015/14339231:user/release-keys", "google/frankel/frankel:16/BD3A.251105.010.E1/14337626:user/release-keys", "google/frankel/frankel:16/BD3A.251105.010.F1/14341671:user/release-keys", "google/frankel/frankel:16/BD3A.251105.010.J3/14341896:user/release-keys", "google/komodo/komodo:16/BP3A.251105.015/14339231:user/release-keys", "google/mustang/mustang:16/BD3A.251105.010.E1/14337626:user/release-keys", "google/mustang/mustang:16/BD3A.251105.010.F1/14341671:user/release-keys", "google/mustang/mustang:16/BD3A.251105.010.J3/14341896:user/release-keys", "google/rango/rango:16/BD3A.251105.010.E1/14337626:user/release-keys", "google/rango/rango:16/BD3A.251105.010.F1/14341671:user/release-keys", "google/rango/rango:16/BD3A.251105.010.J3/14341896:user/release-keys", "google/tokay/tokay:16/BP3A.251105.015/14339231:user/release-keys", "google/blazer/blazer:16/BD4A.251205.006.A1/14402117:user/release-keys", "google/blazer/blazer:16/BD4A.251205.006/14401865:user/release-keys", "google/blazer/blazer:16/BP4A.251205.006.C1/14402245:user/release-keys", "google/caiman/caiman:16/BP4A.251205.006.A1/14402117:user/release-keys", "google/caiman/caiman:16/BP4A.251205.006/14401865:user/release-keys", "google/comet/comet:16/BD4A.251205.006.A1/14402117:user/release-keys", "google/comet/comet:16/BD4A.251205.006/14401865:user/release-keys", "google/frankel/frankel:16/BD4A.251205.006.A1/14402117:user/release-keys", "google/frankel/frankel:16/BD4A.251205.006/14401865:user/release-keys", "google/frankel/frankel:16/BP4A.251205.006.C1/14402245:user/release-keys", "google/komodo/komodo:16/BP4A.251205.006.A1/14402117:user/release-keys", "google/komodo/komodo:16/BP4A.251205.006/14401865:user/release-keys", "google/mustang/mustang:16/BD4A.251205.006.A1/14402117:user/release-keys", "google/mustang/mustang:16/BD4A.251205.006/14401865:user/release-keys", "google/mustang/mustang:16/BP4A.251205.006.C1/14402245:user/release-keys", "google/rango/rango:16/BD4A.251205.006.A1/14402117:user/release-keys", "google/rango/rango:16/BP4A.251205.006.C1/14402245:user/release-keys", "google/rango/rango:16/BD4A.251205.006/14401865:user/release-keys", "google/tokay/tokay:16/BP4A.251205.006.A1/14402117:user/release-keys", "google/tokay/tokay:16/BP4A.251205.006/14401865:user/release-keys"}), new kotlin.jvm.functions.Function0() { // from class: androidx.core.backported.fixes.KnownIssues$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean equals;
            equals = android.os.Build.BRAND.equals(com.adjust.sdk.Constants.REFERRER_API_GOOGLE);
            return java.lang.Boolean.valueOf(equals);
        }
    });
    public static final androidx.core.backported.fixes.KnownIssue KI_452390376 = new androidx.core.backported.fixes.KnownIssue(452390376, 6, null, new kotlin.jvm.functions.Function0() { // from class: androidx.core.backported.fixes.KnownIssues$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(androidx.core.backported.fixes.KnownIssues.$r8$lambda$uqVYSlZqGMjwk0Z4TpjJd8NFDew());
        }
    }, 4, null);

    private KnownIssues() {
    }

    public static /* synthetic */ boolean $r8$lambda$uqVYSlZqGMjwk0Z4TpjJd8NFDew() {
        android.os.Build.BRAND.equals(com.adjust.sdk.Constants.REFERRER_API_GOOGLE);
        return kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"frankel", "blazer", "mustang", "rango"}).contains(android.os.Build.PRODUCT);
    }

    public /* synthetic */ KnownIssues(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
