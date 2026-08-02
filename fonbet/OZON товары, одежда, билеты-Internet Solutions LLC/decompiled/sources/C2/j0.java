package C2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j0 extends AbstractC2724t {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<String> f4351d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(Object obj) {
        super(r1, r0, allowUserIds);
        kotlin.collections.M allowUserIds = kotlin.collections.M.f71699a;
        Intrinsics.checkNotNullParameter(allowUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(allowUserIds, "allowedProviders");
        Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
        Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
        this.f4351d = allowUserIds;
    }
}
