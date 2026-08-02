package dev.fluttercommunity.workmanager.pigeon;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final a Companion;
    public static final /* synthetic */ d[] b;
    public static final /* synthetic */ EnumEntries c;
    public final int a;

    @SourceDebugExtension({"SMAP\nWorkmanagerApi.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/ExistingPeriodicWorkPolicy$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,874:1\n1401#2,2:875\n*S KotlinDebug\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/ExistingPeriodicWorkPolicy$Companion\n*L\n236#1:875,2\n*E\n"})
    public static final class a {
    }

    static {
        d[] dVarArr = {new d("KEEP", 0, 0), new d("REPLACE", 1, 1), new d("UPDATE", 2, 2)};
        b = dVarArr;
        c = EnumEntriesKt.enumEntries(dVarArr);
        Companion = new a();
    }

    public d(String str, int i, int i2) {
        this.a = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) b.clone();
    }
}
