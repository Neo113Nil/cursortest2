package V8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@KeepForSdk
/* loaded from: classes9.dex */
public final class a {

    @NonNull
    @KeepForSdk
    public static final a ENTITY_EXTRACTION;

    @NonNull
    @KeepForSdk
    public static final a IMAGE_CAPTIONING;

    @NonNull
    @KeepForSdk
    public static final a TOXICITY_DETECTION;

    @NonNull
    @KeepForSdk
    public static final a TRANSLATE;

    @NonNull
    public static final a zza;

    @NonNull
    public static final a zzb;
    private static final /* synthetic */ a[] zzc;

    static {
        a aVar = new a("FACE_DETECTION", 0);
        zza = aVar;
        a aVar2 = new a("SMART_REPLY", 1);
        zzb = aVar2;
        a aVar3 = new a("TRANSLATE", 2);
        TRANSLATE = aVar3;
        a aVar4 = new a("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = aVar4;
        a aVar5 = new a("TOXICITY_DETECTION", 4);
        TOXICITY_DETECTION = aVar5;
        a aVar6 = new a("IMAGE_CAPTIONING", 5);
        IMAGE_CAPTIONING = aVar6;
        zzc = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    @NonNull
    public static a[] values() {
        return (a[]) zzc.clone();
    }
}
