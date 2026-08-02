package F3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: F3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3013s {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f8720d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final p3.i f8721a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f8722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8723c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3013s(p3.i iVar) {
        this(iVar, Collections.EMPTY_MAP, 0L);
        Uri uri = iVar.f80066a;
    }

    public static long a() {
        return f8720d.getAndIncrement();
    }

    public C3013s(p3.i iVar, Map map, long j11) {
        this.f8721a = iVar;
        this.f8722b = map;
        this.f8723c = j11;
    }
}
