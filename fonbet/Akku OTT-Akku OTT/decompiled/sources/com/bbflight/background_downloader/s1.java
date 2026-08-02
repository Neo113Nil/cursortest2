package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlinx.serialization.i(with = v1.class)
/* loaded from: classes3.dex */
public final class s1 {
    public static final a Companion;
    public static final Lazy<kotlinx.serialization.b<Object>> a;
    public static final s1 b;
    public static final s1 c;
    public static final s1 d;
    public static final /* synthetic */ s1[] e;
    public static final /* synthetic */ EnumEntries f;

    public static final class a {
        public final kotlinx.serialization.b<s1> serializer() {
            return (kotlinx.serialization.b) s1.a.getValue();
        }
    }

    static {
        s1 s1Var = new s1("none", 0);
        s1 s1Var2 = new s1(NotificationCompat.CATEGORY_STATUS, 1);
        b = s1Var2;
        s1 s1Var3 = new s1(NotificationCompat.CATEGORY_PROGRESS, 2);
        c = s1Var3;
        s1 s1Var4 = new s1("statusAndProgress", 3);
        d = s1Var4;
        s1[] s1VarArr = {s1Var, s1Var2, s1Var3, s1Var4};
        e = s1VarArr;
        f = EnumEntriesKt.enumEntries(s1VarArr);
        Companion = new a();
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new r1());
    }

    public s1() {
        throw null;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) e.clone();
    }
}
