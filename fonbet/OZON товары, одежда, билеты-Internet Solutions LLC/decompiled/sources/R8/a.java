package R8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f24788a;

    @KeepForSdk
    public a(@NonNull String str, int i11) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f24788a = i11;
    }

    public final int a() {
        return this.f24788a;
    }

    @KeepForSdk
    public a(@NonNull String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.f24788a = 13;
    }
}
