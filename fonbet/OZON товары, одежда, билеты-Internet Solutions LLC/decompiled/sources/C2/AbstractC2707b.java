package C2;

import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: C2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC2707b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f4343a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bundle f4344b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f4345c;

    /* renamed from: C2.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f4346a;

        public a(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f4346a = userId;
            if (userId.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        @NotNull
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.f4346a);
            if (!TextUtils.isEmpty(null)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
            }
            return bundle;
        }
    }

    public AbstractC2707b(@NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, @NotNull a displayInfo) {
        Intrinsics.checkNotNullParameter("android.credentials.TYPE_PASSWORD_CREDENTIAL", "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.f4343a = credentialData;
        this.f4344b = candidateQueryData;
        this.f4345c = displayInfo;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }

    @NotNull
    public final Bundle a() {
        return this.f4344b;
    }

    @NotNull
    public final Bundle b() {
        return this.f4343a;
    }

    @NotNull
    public final a c() {
        return this.f4345c;
    }
}
