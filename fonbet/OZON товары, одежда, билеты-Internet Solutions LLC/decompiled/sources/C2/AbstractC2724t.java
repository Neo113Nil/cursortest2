package C2;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: C2.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC2724t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f4361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bundle f4362b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<ComponentName> f4363c;

    public AbstractC2724t(@NotNull Bundle requestData, @NotNull Bundle candidateQueryData, @NotNull Set allowedProviders) {
        Intrinsics.checkNotNullParameter("android.credentials.TYPE_PASSWORD_CREDENTIAL", "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.f4361a = requestData;
        this.f4362b = candidateQueryData;
        this.f4363c = allowedProviders;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        requestData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000);
        candidateQueryData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000);
    }

    @NotNull
    public final Set<ComponentName> a() {
        return this.f4363c;
    }

    @NotNull
    public final Bundle b() {
        return this.f4362b;
    }

    @NotNull
    public final Bundle c() {
        return this.f4361a;
    }
}
