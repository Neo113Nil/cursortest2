package dev.fluttercommunity.workmanager.pigeon;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m {
    public static final a Companion;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m i;
    public static final /* synthetic */ m[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int a;

    @SourceDebugExtension({"SMAP\nWorkmanagerApi.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/TaskStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,874:1\n1401#2,2:875\n*S KotlinDebug\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/TaskStatus$Companion\n*L\n106#1:875,2\n*E\n"})
    public static final class a {
    }

    static {
        m mVar = new m("SCHEDULED", 0, 0);
        b = mVar;
        m mVar2 = new m("STARTED", 1, 1);
        c = mVar2;
        m mVar3 = new m("COMPLETED", 2, 2);
        d = mVar3;
        m mVar4 = new m("FAILED", 3, 3);
        e = mVar4;
        m mVar5 = new m("CANCELLED", 4, 4);
        m mVar6 = new m("RETRYING", 5, 5);
        f = mVar6;
        m mVar7 = new m("RESCHEDULED", 6, 6);
        i = mVar7;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7};
        j = mVarArr;
        k = EnumEntriesKt.enumEntries(mVarArr);
        Companion = new a();
    }

    public m(String str, int i2, int i3) {
        this.a = i3;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) j.clone();
    }
}
