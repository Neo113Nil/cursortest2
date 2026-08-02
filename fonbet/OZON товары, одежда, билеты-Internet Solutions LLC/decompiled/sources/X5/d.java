package X5;

import java.io.File;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final long f34087a;

    /* renamed from: b, reason: collision with root package name */
    private final a f34088b;

    public interface a {
    }

    public d(a aVar, long j11) {
        this.f34087a = j11;
        this.f34088b = aVar;
    }

    public final e a() {
        File cacheDir = ((f) this.f34088b).f34094a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            return new e(file, this.f34087a);
        }
        return null;
    }
}
