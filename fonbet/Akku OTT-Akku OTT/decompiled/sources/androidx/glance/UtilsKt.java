package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.GlanceModifier;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0087\b\u001a\u001c\u0010\u0004\u001a\u0004\u0018\u0001H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"extractModifier", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/glance/GlanceModifier;", "findModifier", "(Landroidx/glance/GlanceModifier;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final /* synthetic */ <T> Pair<T, GlanceModifier> extractModifier(GlanceModifier glanceModifier) {
        Intrinsics.needClassReification();
        if (!glanceModifier.any(new Function1<GlanceModifier.Element, Boolean>() { // from class: androidx.glance.UtilsKt$extractModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(GlanceModifier.Element element) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                return Boolean.valueOf(Objects.nonNull(element));
            }
        })) {
            return TuplesKt.to(null, glanceModifier);
        }
        Pair pair = TuplesKt.to(null, GlanceModifier.INSTANCE);
        Intrinsics.needClassReification();
        return (Pair) glanceModifier.foldIn(pair, UtilsKt$extractModifier$2.INSTANCE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final /* synthetic */ <T> T findModifier(GlanceModifier glanceModifier) {
        Intrinsics.needClassReification();
        return (T) glanceModifier.foldIn(null, UtilsKt$findModifier$1.INSTANCE);
    }
}
