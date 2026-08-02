package U5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6411d = Logger.getLogger(C.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final C f6412e = new C();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f6413a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6414b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f6415c;

    public C() {
        new ConcurrentSkipListMap();
        this.f6413a = new ConcurrentSkipListMap();
        this.f6414b = new ConcurrentHashMap();
        this.f6415c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
