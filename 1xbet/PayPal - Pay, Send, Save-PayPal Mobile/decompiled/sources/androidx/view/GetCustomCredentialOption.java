package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0011BM\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0012"}, d2 = {"Landroidx/credentials/GetCustomCredentialOption;", "Landroidx/credentials/CredentialOption;", "Landroid/os/Bundle;", "requestData", "", "type", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class GetCustomCredentialOption extends androidx.view.CredentialOption {
    public /* synthetic */ GetCustomCredentialOption(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set set, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, bundle2, z, (i2 & 16) != 0 ? false : z2, (java.util.Set<android.content.ComponentName>) ((i2 & 32) != 0 ? kotlin.collections.SetsKt.emptySet() : set), (i2 & 64) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set<android.content.ComponentName> set, int i) {
        super(str, bundle, bundle2, z, z2, set, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("type should not be empty".toString());
        }
        if (i == 100) {
            throw new java.lang.IllegalArgumentException("Custom types should not have passkey level priority.".toString());
        }
    }

    public /* synthetic */ GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set<android.content.ComponentName> set) {
        this(bundle, str, bundle2, z, z2, set, 0, 64, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    public /* synthetic */ GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set set, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z, (i2 & 16) != 0 ? false : z2, (java.util.Set<android.content.ComponentName>) ((i2 & 32) != 0 ? kotlin.collections.SetsKt.emptySet() : set), (i2 & 64) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2, java.util.Set<android.content.ComponentName> set, int i) {
        this(bundle, str, bundle2, z, z2, set, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
    }
}
