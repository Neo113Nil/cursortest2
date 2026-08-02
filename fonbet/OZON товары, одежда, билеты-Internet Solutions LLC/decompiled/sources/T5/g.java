package T5;

import V5.v;
import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g<T> implements m<T> {

    /* renamed from: b, reason: collision with root package name */
    private final List f26663b;

    @SafeVarargs
    public g(@NonNull m<T>... mVarArr) {
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f26663b = Arrays.asList(mVarArr);
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f26663b.equals(((g) obj).f26663b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f26663b.hashCode();
    }

    @Override // T5.m
    @NonNull
    public final v<T> transform(@NonNull Context context, @NonNull v<T> vVar, int i11, int i12) {
        Iterator it = this.f26663b.iterator();
        v<T> vVar2 = vVar;
        while (it.hasNext()) {
            v<T> transform = ((m) it.next()).transform(context, vVar2, i11, i12);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(transform)) {
                vVar2.a();
            }
            vVar2 = transform;
        }
        return vVar2;
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        Iterator it = this.f26663b.iterator();
        while (it.hasNext()) {
            ((m) it.next()).updateDiskCacheKey(messageDigest);
        }
    }

    public g(@NonNull ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.f26663b = arrayList;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
