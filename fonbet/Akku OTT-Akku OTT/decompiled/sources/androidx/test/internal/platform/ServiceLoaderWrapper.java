package androidx.test.internal.platform;

import android.os.StrictMode;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ServiceLoaderWrapper {

    public interface Factory<T> {
        T create();
    }

    private ServiceLoaderWrapper() {
    }

    public static <T> List<T> loadService(Class<T> cls) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return arrayList;
    }

    public static <T> T loadSingleService(Class<T> cls, Factory<T> factory) {
        T t = (T) loadSingleServiceOrNull(cls);
        return t == null ? factory.create() : t;
    }

    public static <T> T loadSingleServiceOrNull(Class<T> cls) {
        List loadService = loadService(cls);
        if (loadService.isEmpty()) {
            return null;
        }
        if (loadService.size() == 1) {
            return (T) loadService.get(0);
        }
        throw new IllegalStateException("Found more than one implementation for ".concat(cls.getName()));
    }
}
