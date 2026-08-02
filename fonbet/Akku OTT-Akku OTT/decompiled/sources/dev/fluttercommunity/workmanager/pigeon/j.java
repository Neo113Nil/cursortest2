package dev.fluttercommunity.workmanager.pigeon;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {
    public static final a Companion;
    public static final /* synthetic */ j[] b;
    public static final /* synthetic */ EnumEntries c;
    public final int a;

    @SourceDebugExtension({"SMAP\nWorkmanagerApi.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/OutOfQuotaPolicy$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,874:1\n1401#2,2:875\n*S KotlinDebug\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/OutOfQuotaPolicy$Companion\n*L\n260#1:875,2\n*E\n"})
    public static final class a {
    }

    static {
        j[] jVarArr = {new j("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0, 0), new j("DROP_WORK_REQUEST", 1, 1)};
        b = jVarArr;
        c = EnumEntriesKt.enumEntries(jVarArr);
        Companion = new a();
    }

    public j(String str, int i, int i2) {
        this.a = i2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) b.clone();
    }
}
