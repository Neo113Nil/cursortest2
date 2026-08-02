package C2;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l0 extends AbstractC2714i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4353a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f4354b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(@NotNull String id2, @NotNull String password) {
        this(id2, password, r0);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
        bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
    }

    @NotNull
    public final String a() {
        return this.f4353a;
    }

    @NotNull
    public final String b() {
        return this.f4354b;
    }

    public /* synthetic */ l0(String str, String str2, Bundle bundle, int i11) {
        this(str, str2, bundle);
    }

    private l0(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f4353a = str;
        this.f4354b = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }
}
