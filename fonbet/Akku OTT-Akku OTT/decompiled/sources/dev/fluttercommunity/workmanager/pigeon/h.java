package dev.fluttercommunity.workmanager.pigeon;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h {
    public static final a Companion;
    public static final /* synthetic */ h[] b;
    public static final /* synthetic */ EnumEntries c;
    public final int a;

    @SourceDebugExtension({"SMAP\nWorkmanagerApi.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/NetworkType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,874:1\n1401#2,2:875\n*S KotlinDebug\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/NetworkType$Companion\n*L\n141#1:875,2\n*E\n"})
    public static final class a {
    }

    static {
        h[] hVarArr = {new h("CONNECTED", 0, 0), new h("METERED", 1, 1), new h("NOT_REQUIRED", 2, 2), new h("NOT_ROAMING", 3, 3), new h("UNMETERED", 4, 4), new h("TEMPORARILY_UNMETERED", 5, 5)};
        b = hVarArr;
        c = EnumEntriesKt.enumEntries(hVarArr);
        Companion = new a();
    }

    public h(String str, int i, int i2) {
        this.a = i2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }
}
