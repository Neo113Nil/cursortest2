package androidx.media3.session.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@UnstableApi
/* loaded from: classes3.dex */
public final class LegacyParcelableUtil {
    private LegacyParcelableUtil() {
    }

    public static <T extends Parcelable, U extends Parcelable> T convert(U u, Parcelable.Creator<T> creator) {
        if (u == null) {
            return null;
        }
        Parcelable parcelable = (Parcelable) maybeApplyMediaDescriptionParcelableBugWorkaround(u);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (T) maybeApplyMediaDescriptionParcelableBugWorkaround(creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> convertList(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        ArgumentList argumentList = (ArrayList<T>) new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            argumentList.add(convert(list.get(i), creator));
        }
        return argumentList;
    }

    private static <T> T maybeApplyMediaDescriptionParcelableBugWorkaround(T t) {
        return t;
    }

    private static android.support.v4.media.MediaDescriptionCompat rebuildMediaDescriptionCompat(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        return new android.support.v4.media.MediaDescriptionCompat(mediaDescriptionCompat.a, mediaDescriptionCompat.b, mediaDescriptionCompat.c, mediaDescriptionCompat.d, mediaDescriptionCompat.e, mediaDescriptionCompat.f, mediaDescriptionCompat.i, mediaDescriptionCompat.j);
    }
}
