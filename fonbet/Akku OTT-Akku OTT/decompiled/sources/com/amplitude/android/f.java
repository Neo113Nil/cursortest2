package com.amplitude.android;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    public static final a Companion;
    public static final Set<f> a;
    public static final Set<f> b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f i;
    public static final f j;
    public static final /* synthetic */ f[] k;
    public static final /* synthetic */ EnumEntries l;

    public static final class a {
    }

    static {
        f fVar = new f("SESSIONS", 0);
        c = fVar;
        f fVar2 = new f("APP_LIFECYCLES", 1);
        d = fVar2;
        f fVar3 = new f("DEEP_LINKS", 2);
        e = fVar3;
        f fVar4 = new f("SCREEN_VIEWS", 3);
        f = fVar4;
        f fVar5 = new f("ELEMENT_INTERACTIONS", 4);
        i = fVar5;
        f fVar6 = new f("FRUSTRATION_INTERACTIONS", 5);
        j = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        k = fVarArr;
        l = EnumEntriesKt.enumEntries(fVarArr);
        Companion = new a();
        a = SetsKt.setOf((Object[]) new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6});
        b = SetsKt.setOf((Object[]) new f[]{fVar2, fVar4, fVar5, fVar3});
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) k.clone();
    }
}
