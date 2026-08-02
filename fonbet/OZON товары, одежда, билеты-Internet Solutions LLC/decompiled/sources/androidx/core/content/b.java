package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f42051a;

    /* renamed from: b, reason: collision with root package name */
    private final LocusId f42052b;

    private static class a {
        @NonNull
        static LocusId a(@NonNull String str) {
            return new LocusId(str);
        }
    }

    public b(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f42051a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f42052b = a.a(str);
        } else {
            this.f42052b = null;
        }
    }

    @NonNull
    public final String a() {
        return this.f42051a;
    }

    @NonNull
    public final LocusId b() {
        return this.f42052b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        String str = ((b) obj).f42051a;
        String str2 = this.f42051a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f42051a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f42051a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
