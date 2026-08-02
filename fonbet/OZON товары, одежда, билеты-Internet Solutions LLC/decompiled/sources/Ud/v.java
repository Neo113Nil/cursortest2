package Ud;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACTUAL;

    @NotNull
    public static final Set<v> ALL;

    @NotNull
    public static final Set<v> ALL_EXCEPT_ANNOTATIONS;
    public static final v ANNOTATIONS;
    public static final v CONST;

    @NotNull
    public static final a Companion;
    public static final v DATA;
    public static final v EXPECT;
    public static final v FUN;
    public static final v INLINE;
    public static final v INNER;
    public static final v LATEINIT;
    public static final v MEMBER_KIND;
    public static final v MODALITY;
    public static final v OVERRIDE;
    public static final v VALUE;
    public static final v VISIBILITY;
    private final boolean includeByDefault;

    public static final class a {
    }

    static {
        v vVar = new v("VISIBILITY", 0, true);
        VISIBILITY = vVar;
        v vVar2 = new v("MODALITY", 1, true);
        MODALITY = vVar2;
        v vVar3 = new v("OVERRIDE", 2, true);
        OVERRIDE = vVar3;
        v vVar4 = new v("ANNOTATIONS", 3, false);
        ANNOTATIONS = vVar4;
        v vVar5 = new v("INNER", 4, true);
        INNER = vVar5;
        v vVar6 = new v("MEMBER_KIND", 5, true);
        MEMBER_KIND = vVar6;
        v vVar7 = new v("DATA", 6, true);
        DATA = vVar7;
        v vVar8 = new v("INLINE", 7, true);
        INLINE = vVar8;
        v vVar9 = new v("EXPECT", 8, true);
        EXPECT = vVar9;
        v vVar10 = new v("ACTUAL", 9, true);
        ACTUAL = vVar10;
        v vVar11 = new v("CONST", 10, true);
        CONST = vVar11;
        v vVar12 = new v("LATEINIT", 11, true);
        LATEINIT = vVar12;
        v vVar13 = new v("FUN", 12, true);
        FUN = vVar13;
        v vVar14 = new v("VALUE", 13, true);
        VALUE = vVar14;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14};
        $VALUES = vVarArr;
        $ENTRIES = Xc.b.a(vVarArr);
        Companion = new a();
        v[] values = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar15 : values) {
            if (vVar15.includeByDefault) {
                arrayList.add(vVar15);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = C7714v.Y0(arrayList);
        ALL = C7705l.j0(values());
    }

    private v(String str, int i11, boolean z11) {
        this.includeByDefault = z11;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
