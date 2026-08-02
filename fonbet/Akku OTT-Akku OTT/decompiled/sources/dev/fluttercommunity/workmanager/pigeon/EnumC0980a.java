package dev.fluttercommunity.workmanager.pigeon;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dev.fluttercommunity.workmanager.pigeon.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC0980a {
    public static final C0147a Companion;
    public static final /* synthetic */ EnumC0980a[] b;
    public static final /* synthetic */ EnumEntries c;
    public final int a;

    @SourceDebugExtension({"SMAP\nWorkmanagerApi.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/BackoffPolicy$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,874:1\n1401#2,2:875\n*S KotlinDebug\n*F\n+ 1 WorkmanagerApi.g.kt\ndev/fluttercommunity/workmanager/pigeon/BackoffPolicy$Companion\n*L\n159#1:875,2\n*E\n"})
    /* renamed from: dev.fluttercommunity.workmanager.pigeon.a$a, reason: collision with other inner class name */
    public static final class C0147a {
    }

    static {
        EnumC0980a[] enumC0980aArr = {new EnumC0980a("EXPONENTIAL", 0, 0), new EnumC0980a("LINEAR", 1, 1)};
        b = enumC0980aArr;
        c = EnumEntriesKt.enumEntries(enumC0980aArr);
        Companion = new C0147a();
    }

    public EnumC0980a(String str, int i, int i2) {
        this.a = i2;
    }

    public static EnumC0980a valueOf(String str) {
        return (EnumC0980a) Enum.valueOf(EnumC0980a.class, str);
    }

    public static EnumC0980a[] values() {
        return (EnumC0980a[]) b.clone();
    }
}
