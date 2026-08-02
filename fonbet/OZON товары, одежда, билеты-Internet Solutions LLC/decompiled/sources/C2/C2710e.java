package C2;

import C2.AbstractC2707b;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: C2.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2710e extends AbstractC2707b {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f4347d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f4348e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2710e(String id2, String password) {
        super(r0, new Bundle(), r2);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
        AbstractC2707b.a aVar = new AbstractC2707b.a(id2);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
        bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
        this.f4347d = id2;
        this.f4348e = password;
        if (password.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    @NotNull
    public final String d() {
        return this.f4347d;
    }

    @NotNull
    public final String e() {
        return this.f4348e;
    }
}
