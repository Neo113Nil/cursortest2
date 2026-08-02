package b6;

import T5.m;
import V5.v;
import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public final class j<T> implements m<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final j f55554b = new j();

    @NonNull
    public static <T> j<T> a() {
        return f55554b;
    }

    @Override // T5.m
    @NonNull
    public final v<T> transform(@NonNull Context context, @NonNull v<T> vVar, int i11, int i12) {
        return vVar;
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
