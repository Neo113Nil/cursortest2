package U8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import java.util.EnumMap;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final EnumMap f27457a;

    static {
        new EnumMap(V8.a.class);
        f27457a = new EnumMap(V8.a.class);
    }

    @NonNull
    @KeepForSdk
    public static String a() {
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f27457a.get(null)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null);
    }

    @NonNull
    public final String toString() {
        zzq zzb = zzr.zzb("RemoteModel");
        zzb.zza("modelName", null);
        zzb.zza("baseModel", null);
        zzb.zza("modelType", null);
        return zzb.toString();
    }
}
