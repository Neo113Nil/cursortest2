package Je0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ERROR;
    public static final e FIRST_RASTER_RENDERED;
    public static final e FIRST_VECTOR_RENDERED;
    public static final e MAP_LOAD;
    public static final e MAP_READY;
    public static final e RASTER_MAP_RENDERED;
    public static final e STYLE_LOAD_TIME;
    public static final e VECTOR_MAP_RENDERED;

    @NotNull
    private final String trackingName;

    static {
        e eVar = new e("MAP_LOAD", 0, "map-load");
        MAP_LOAD = eVar;
        e eVar2 = new e("MAP_READY", 1, "map-ready");
        MAP_READY = eVar2;
        e eVar3 = new e("FIRST_RASTER_RENDERED", 2, "first-raster-tile-rendered");
        FIRST_RASTER_RENDERED = eVar3;
        e eVar4 = new e("FIRST_VECTOR_RENDERED", 3, "first-vector-tile-rendered");
        FIRST_VECTOR_RENDERED = eVar4;
        e eVar5 = new e("RASTER_MAP_RENDERED", 4, "raster-map-rendered");
        RASTER_MAP_RENDERED = eVar5;
        e eVar6 = new e("VECTOR_MAP_RENDERED", 5, "vector-map-rendered");
        VECTOR_MAP_RENDERED = eVar6;
        e eVar7 = new e("STYLE_LOAD_TIME", 6, "style-loaded");
        STYLE_LOAD_TIME = eVar7;
        e eVar8 = new e("ERROR", 7, "error");
        ERROR = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
    }

    private e(String str, int i11, String str2) {
        this.trackingName = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.trackingName;
    }
}
