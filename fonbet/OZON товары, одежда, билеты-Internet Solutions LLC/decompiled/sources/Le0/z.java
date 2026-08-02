package Le0;

import Ne0.e;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes3.dex */
public abstract class z {

    @NotNull
    public static final a Companion = new a();
    private static final long maxTileLifeTime;
    private static final long minTileLifeTime;

    @NotNull
    private final Ne0.e librePlacemarkImplementation = new e.a();
    private final Long tileCacheSize;
    private final kotlin.time.b tileLifeTime;

    public static final class a {
    }

    public static final class b extends z {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f17041a = new b();
    }

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        minTileLifeTime = kotlin.time.c.g(15, EnumC10311b.MINUTES);
        maxTileLifeTime = kotlin.time.c.g(8, EnumC10311b.HOURS);
    }

    @NotNull
    public Ne0.e getLibrePlacemarkImplementation() {
        return this.librePlacemarkImplementation;
    }

    public Long getTileCacheSize() {
        return this.tileCacheSize;
    }

    /* renamed from: getTileLifeTime-FghU774, reason: not valid java name */
    public kotlin.time.b m10getTileLifeTimeFghU774() {
        return this.tileLifeTime;
    }
}
