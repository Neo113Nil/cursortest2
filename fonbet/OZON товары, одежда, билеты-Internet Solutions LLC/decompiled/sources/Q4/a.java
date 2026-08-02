package Q4;

import U7.d;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final HashMap f22951e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22952a;

    /* renamed from: b, reason: collision with root package name */
    private final File f22953b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Lock f22954c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f22955d;

    public a(@NotNull String name, File file, boolean z11) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f22952a = z11;
        this.f22953b = file != null ? new File(file, d.e(name, ".lck")) : null;
        HashMap hashMap = f22951e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(name);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(name, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22954c = lock;
    }

    public final void a(boolean z11) {
        this.f22954c.lock();
        if (z11) {
            File file = this.f22953b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f22955d = channel;
            } catch (IOException e11) {
                this.f22955d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e11);
            }
        }
    }

    public final void c() {
        try {
            FileChannel fileChannel = this.f22955d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f22954c.unlock();
    }
}
