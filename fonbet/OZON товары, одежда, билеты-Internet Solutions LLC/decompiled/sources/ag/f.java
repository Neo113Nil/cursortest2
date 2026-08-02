package ag;

import android.location.Location;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<Location> f36775a;

    private f(ArrayList arrayList) {
        this.f36775a = Collections.unmodifiableList(arrayList);
    }

    @NonNull
    public static f a(Location location) {
        ArrayList arrayList = new ArrayList();
        if (location != null) {
            arrayList.add(location);
        }
        return new f(arrayList);
    }

    public final Location b() {
        List<Location> list = this.f36775a;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
