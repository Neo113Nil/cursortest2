package io.flutter.plugins.googlesignin;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/googlesignin/GetCredentialRequestGoogleIdOptionParams;", "", "filterToAuthorized", "", "autoSelectEnabled", "<init>", "(ZZ)V", "getFilterToAuthorized", "()Z", "getAutoSelectEnabled", "toList", "", "equals", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "Companion", "google_sign_in_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetCredentialRequestGoogleIdOptionParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoSelectEnabled;
    private final boolean filterToAuthorized;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/googlesignin/GetCredentialRequestGoogleIdOptionParams$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/googlesignin/GetCredentialRequestGoogleIdOptionParams;", "pigeonVar_list", "", "google_sign_in_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GetCredentialRequestGoogleIdOptionParams fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new GetCredentialRequestGoogleIdOptionParams(booleanValue, ((Boolean) obj2).booleanValue());
        }

        private Companion() {
        }
    }

    public GetCredentialRequestGoogleIdOptionParams(boolean z, boolean z2) {
        this.filterToAuthorized = z;
        this.autoSelectEnabled = z2;
    }

    public static /* synthetic */ GetCredentialRequestGoogleIdOptionParams copy$default(GetCredentialRequestGoogleIdOptionParams getCredentialRequestGoogleIdOptionParams, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getCredentialRequestGoogleIdOptionParams.filterToAuthorized;
        }
        if ((i & 2) != 0) {
            z2 = getCredentialRequestGoogleIdOptionParams.autoSelectEnabled;
        }
        return getCredentialRequestGoogleIdOptionParams.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFilterToAuthorized() {
        return this.filterToAuthorized;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAutoSelectEnabled() {
        return this.autoSelectEnabled;
    }

    public final GetCredentialRequestGoogleIdOptionParams copy(boolean filterToAuthorized, boolean autoSelectEnabled) {
        return new GetCredentialRequestGoogleIdOptionParams(filterToAuthorized, autoSelectEnabled);
    }

    public boolean equals(Object other) {
        if (!(other instanceof GetCredentialRequestGoogleIdOptionParams)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((GetCredentialRequestGoogleIdOptionParams) other).toList());
    }

    public final boolean getAutoSelectEnabled() {
        return this.autoSelectEnabled;
    }

    public final boolean getFilterToAuthorized() {
        return this.filterToAuthorized;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(this.filterToAuthorized), Boolean.valueOf(this.autoSelectEnabled)});
    }

    public String toString() {
        return "GetCredentialRequestGoogleIdOptionParams(filterToAuthorized=" + this.filterToAuthorized + ", autoSelectEnabled=" + this.autoSelectEnabled + ")";
    }
}
