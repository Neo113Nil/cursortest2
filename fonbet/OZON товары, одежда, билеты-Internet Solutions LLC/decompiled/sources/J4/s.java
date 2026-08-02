package J4;

import C.C2702w;
import O4.c;
import Sc.InterfaceC3999a;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import n.C8358c;
import n.ExecutorC8357b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b&\u0018\u0000 v2\u00020\u0001:\u0005wxyz{B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\bH$¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H$¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00100\rH\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH'¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\nH\u0017¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\nH\u0017¢\u0006\u0004\b\"\u0010\u0003J#\u0010$\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b$\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0017¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\nH\u0017¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\nH\u0017¢\u0006\u0004\b0\u0010\u0003J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J#\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b3\u00107J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J-\u0010B\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010A\u001a\u00020\u0015H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010E\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010\u0003R\u001e\u0010F\u001a\u0004\u0018\u0001088\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0003R\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010M\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u001aR\u0016\u0010R\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR$\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010\u00108\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\u0003RR\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\u0004\u0012\u00020\u00010Y2\u001a\u0010Z\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\u0004\u0012\u00020\u00010Y8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010[\u001a\u0004\b\\\u0010\u001c\"\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8G¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR#\u0010h\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010Y8G¢\u0006\f\n\u0004\bh\u0010[\u001a\u0004\bi\u0010\u001cR$\u0010j\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u00010Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010[R\u0014\u0010m\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0014\u0010A\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0017\u0010r\u001a\u00020<8G¢\u0006\f\u0012\u0004\bs\u0010\u0003\u001a\u0004\br\u0010>R\u0014\u0010u\u001a\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010>¨\u0006|"}, d2 = {"LJ4/s;", "", "<init>", "()V", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "LJ4/h;", "configuration", "", "init", "(LJ4/h;)V", "", "Ljava/lang/Class;", "autoMigrationSpecs", "", "LK4/a;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "config", "LO4/c;", "createOpenHelper", "(LJ4/h;)LO4/c;", "LJ4/p;", "createInvalidationTracker", "()LJ4/p;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "assertNotMainThread", "assertNotSuspendingTransaction", "LO4/e;", SearchIntents.EXTRA_QUERY, "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "(LO4/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "", "sql", "LO4/f;", "compileStatement", "(Ljava/lang/String;)LO4/f;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "LO4/b;", "db", "internalInitInvalidationTracker", "(LO4/b;)V", "", "inTransaction", "()Z", "T", "clazz", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;LO4/c;)Ljava/lang/Object;", "internalBeginTransaction", "internalEndTransaction", "mDatabase", "LO4/b;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "LO4/c;", "invalidationTracker", "LJ4/p;", "getInvalidationTracker", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "LJ4/s$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()LO4/c;", "isOpenInternal", "isOpenInternal$annotations", "isMainThread$room_runtime_release", "isMainThread", "Companion", "a", "b", "c", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class s {
    private boolean allowMainThreadQueries;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private O4.c internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile O4.b mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final p invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public static class a<T extends s> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f13916a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<T> f13917b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13918c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f13919d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ArrayList f13920e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private ArrayList f13921f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f13922g;

        /* renamed from: h, reason: collision with root package name */
        private Executor f13923h;

        /* renamed from: i, reason: collision with root package name */
        private androidx.work.impl.w f13924i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f13925j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private d f13926k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f13927l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f13928m;

        /* renamed from: n, reason: collision with root package name */
        private long f13929n;

        /* renamed from: o, reason: collision with root package name */
        @NotNull
        private final e f13930o;

        /* renamed from: p, reason: collision with root package name */
        @NotNull
        private LinkedHashSet f13931p;

        /* renamed from: q, reason: collision with root package name */
        private HashSet f13932q;

        public a(@NotNull Class klass, String str, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f13916a = context;
            this.f13917b = klass;
            this.f13918c = str;
            this.f13919d = new ArrayList();
            this.f13920e = new ArrayList();
            this.f13921f = new ArrayList();
            this.f13926k = d.AUTOMATIC;
            this.f13927l = true;
            this.f13929n = -1L;
            this.f13930o = new e();
            this.f13931p = new LinkedHashSet();
        }

        @NotNull
        public final void a(@NotNull b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f13919d.add(callback);
        }

        @NotNull
        public final void b(@NotNull K4.a... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f13932q == null) {
                this.f13932q = new HashSet();
            }
            for (K4.a aVar : migrations) {
                HashSet hashSet = this.f13932q;
                Intrinsics.f(hashSet);
                hashSet.add(Integer.valueOf(aVar.startVersion));
                HashSet hashSet2 = this.f13932q;
                Intrinsics.f(hashSet2);
                hashSet2.add(Integer.valueOf(aVar.endVersion));
            }
            this.f13930o.a((K4.a[]) Arrays.copyOf(migrations, migrations.length));
        }

        @NotNull
        public final void c() {
            this.f13925j = true;
        }

        @NotNull
        public final T d() {
            String str;
            Executor executor = this.f13922g;
            if (executor == null && this.f13923h == null) {
                ExecutorC8357b d11 = C8358c.d();
                this.f13923h = d11;
                this.f13922g = d11;
            } else if (executor != null && this.f13923h == null) {
                this.f13923h = executor;
            } else if (executor == null) {
                this.f13922g = this.f13923h;
            }
            HashSet hashSet = this.f13932q;
            LinkedHashSet linkedHashSet = this.f13931p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(Ej.b.a(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            c.InterfaceC0397c interfaceC0397c = this.f13924i;
            if (interfaceC0397c == null) {
                interfaceC0397c = new P4.g();
            }
            c.InterfaceC0397c interfaceC0397c2 = interfaceC0397c;
            if (this.f13929n > 0) {
                if (this.f13918c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.f13919d;
            boolean z11 = this.f13925j;
            d dVar = this.f13926k;
            dVar.getClass();
            Context context = this.f13916a;
            Intrinsics.checkNotNullParameter(context, "context");
            if (dVar == d.AUTOMATIC) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                    if (!activityManager.isLowRamDevice()) {
                        dVar = d.WRITE_AHEAD_LOGGING;
                    }
                }
                dVar = d.TRUNCATE;
            }
            d dVar2 = dVar;
            Executor executor2 = this.f13922g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f13923h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h hVar = new h(context, this.f13918c, interfaceC0397c2, this.f13930o, arrayList, z11, dVar2, executor2, executor3, this.f13927l, this.f13928m, linkedHashSet, this.f13920e, this.f13921f);
            Class<T> klass = this.f13917b;
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter("_Impl", "suffix");
            Package r42 = klass.getPackage();
            Intrinsics.f(r42);
            String fullPackage = r42.getName();
            String canonicalName = klass.getCanonicalName();
            Intrinsics.f(canonicalName);
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String str2 = kotlin.text.h.Y(canonicalName, '.', '_') + "_Impl";
            try {
                if (fullPackage.length() == 0) {
                    str = str2;
                } else {
                    str = fullPackage + '.' + str2;
                }
                Class<?> cls = Class.forName(str, true, klass.getClassLoader());
                Intrinsics.g(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                T t2 = (T) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                t2.init(hVar);
                return t2;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
            }
        }

        @NotNull
        public final void e() {
            this.f13927l = false;
            this.f13928m = true;
        }

        @NotNull
        public final void f(@NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i11 : startVersions) {
                this.f13931p.add(Integer.valueOf(i11));
            }
        }

        @NotNull
        public final void g() {
            this.f13927l = true;
            this.f13928m = true;
        }

        @NotNull
        public final void h(androidx.work.impl.w wVar) {
            this.f13924i = wVar;
        }

        @NotNull
        public final void i(@NotNull h5.o executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f13922g = executor;
        }
    }

    public static abstract class b {
        public void a(@NotNull O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void b(@NotNull O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d AUTOMATIC;
        public static final d TRUNCATE;
        public static final d WRITE_AHEAD_LOGGING;

        static {
            d dVar = new d("AUTOMATIC", 0);
            AUTOMATIC = dVar;
            d dVar2 = new d("TRUNCATE", 1);
            TRUNCATE = dVar2;
            d dVar3 = new d("WRITE_AHEAD_LOGGING", 2);
            WRITE_AHEAD_LOGGING = dVar3;
            $VALUES = new d[]{dVar, dVar2, dVar3};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f13933a = new LinkedHashMap();

        public final void a(@NotNull K4.a... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (K4.a aVar : migrations) {
                int i11 = aVar.startVersion;
                int i12 = aVar.endVersion;
                LinkedHashMap linkedHashMap = this.f13933a;
                Integer valueOf = Integer.valueOf(i11);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(i12))) {
                    Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i12)) + " with " + aVar);
                }
                treeMap.put(Integer.valueOf(i12), aVar);
            }
        }

        public final boolean b(int i11, int i12) {
            LinkedHashMap linkedHashMap = this.f13933a;
            if (!linkedHashMap.containsKey(Integer.valueOf(i11))) {
                return false;
            }
            Map map = (Map) linkedHashMap.get(Integer.valueOf(i11));
            if (map == null) {
                map = U.c();
            }
            return map.containsKey(Integer.valueOf(i12));
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0072 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<K4.a> c(int i11, int i12) {
            TreeMap treeMap;
            boolean z11;
            if (i11 == i12) {
                return K.f71697a;
            }
            boolean z12 = i12 > i11;
            ArrayList arrayList = new ArrayList();
            do {
                if (z12) {
                    if (i11 >= i12) {
                        return arrayList;
                    }
                    treeMap = (TreeMap) this.f13933a.get(Integer.valueOf(i11));
                    if (treeMap != null) {
                        return null;
                    }
                    for (Integer targetVersion : z12 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                        if (z12) {
                            int i13 = i11 + 1;
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue = targetVersion.intValue();
                            if (i13 <= intValue && intValue <= i12) {
                                Object obj = treeMap.get(targetVersion);
                                Intrinsics.f(obj);
                                arrayList.add(obj);
                                i11 = targetVersion.intValue();
                                z11 = true;
                                break;
                            }
                        } else {
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue2 = targetVersion.intValue();
                            if (i12 <= intValue2 && intValue2 < i11) {
                                Object obj2 = treeMap.get(targetVersion);
                                Intrinsics.f(obj2);
                                arrayList.add(obj2);
                                i11 = targetVersion.intValue();
                                z11 = true;
                                break;
                                break;
                            }
                        }
                    }
                    z11 = false;
                } else {
                    if (i11 <= i12) {
                        return arrayList;
                    }
                    treeMap = (TreeMap) this.f13933a.get(Integer.valueOf(i11));
                    if (treeMap != null) {
                    }
                }
            } while (z11);
            return null;
        }
    }

    public s() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        O4.b writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().k(writableDatabase);
        if (writableDatabase.W1()) {
            writableDatabase.J();
        } else {
            writableDatabase.A();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().i1();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().h();
    }

    public static /* synthetic */ Cursor query$default(s sVar, O4.e eVar, CancellationSignal cancellationSignal, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i11 & 2) != 0) {
            cancellationSignal = null;
        }
        return sVar.query(eVar, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> clazz, O4.c openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof i) {
            return (T) unwrapOpenHelper(clazz, ((i) openHelper).c());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC3999a
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public abstract void clearAllTables();

    @NotNull
    public O4.f compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().C1(sql);
    }

    @NotNull
    protected abstract p createInvalidationTracker();

    @NotNull
    protected abstract O4.c createOpenHelper(@NotNull h config);

    @InterfaceC3999a
    public void endTransaction() {
        internalEndTransaction();
    }

    @NotNull
    public List<K4.a> getAutoMigrations(@NotNull Map<Class<Object>, Object> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return K.f71697a;
    }

    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @NotNull
    public p getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public O4.c getOpenHelper() {
        O4.c cVar = this.internalOpenHelper;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("internalQueryExecutor");
        throw null;
    }

    @NotNull
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return M.f71699a;
    }

    @NotNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return U.c();
    }

    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("internalTransactionExecutor");
        throw null;
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().T1();
    }

    public void init(@NotNull h configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i11 = -1;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = configuration.f13889n.size() - 1;
                ArrayList arrayList = configuration.f13889n;
                if (size >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i11 = size;
                            break;
                        } else if (i12 < 0) {
                            break;
                        } else {
                            size = i12;
                        }
                    }
                }
                if (i11 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i11));
            } else {
                int size2 = configuration.f13889n.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i13 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i13 < 0) {
                            break;
                        } else {
                            size2 = i13;
                        }
                    }
                }
                for (K4.a aVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    int i14 = aVar.startVersion;
                    int i15 = aVar.endVersion;
                    e eVar = configuration.f13879d;
                    if (!eVar.b(i14, i15)) {
                        eVar.a(aVar);
                    }
                }
                if (((z) unwrapOpenHelper(z.class, getOpenHelper())) != null) {
                    Intrinsics.checkNotNullParameter(configuration, "databaseConfiguration");
                }
                if (((C3379a) unwrapOpenHelper(C3379a.class, getOpenHelper())) != null) {
                    getInvalidationTracker().getClass();
                    Intrinsics.checkNotNullParameter(null, "autoCloser");
                    throw null;
                }
                boolean z11 = configuration.f13882g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z11);
                this.mCallbacks = configuration.f13880e;
                this.internalQueryExecutor = configuration.f13883h;
                this.internalTransactionExecutor = new D(configuration.f13884i);
                this.allowMainThreadQueries = configuration.f13881f;
                this.writeAheadLoggingEnabled = z11;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it2 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    ArrayList arrayList2 = configuration.f13888m;
                    if (hasNext) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it2.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i16 = size3 - 1;
                                    if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i16 < 0) {
                                        break;
                                    } else {
                                        size3 = i16;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            this.typeConverters.put(cls, arrayList2.get(size3));
                        }
                    } else {
                        int size4 = arrayList2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i17 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException(C2702w.c(arrayList2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                            }
                            if (i17 < 0) {
                                return;
                            } else {
                                size4 = i17;
                            }
                        }
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        getInvalidationTracker().g(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean isOpenInternal() {
        O4.b bVar = this.mDatabase;
        return bVar != null && bVar.isOpen();
    }

    @NotNull
    public Cursor query(@NotNull O4.e query, CancellationSignal signal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return signal != null ? getOpenHelper().getWritableDatabase().Y0(query, signal) : getOpenHelper().getWritableDatabase().G(query);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @InterfaceC3999a
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().f1();
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
