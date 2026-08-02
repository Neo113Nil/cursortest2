package com.bbflight.background_downloader;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlinx.serialization.i(with = E.class)
/* loaded from: classes3.dex */
public final class B {
    public static final a Companion;
    public static final Lazy<kotlinx.serialization.b<Object>> a;
    public static final B b;
    public static final B c;
    public static final B d;
    public static final B e;
    public static final /* synthetic */ B[] f;
    public static final /* synthetic */ EnumEntries i;

    public static final class a {
        public final kotlinx.serialization.b<B> serializer() {
            return (kotlinx.serialization.b) B.a.getValue();
        }
    }

    static {
        B b2 = new B("applicationDocuments", 0);
        b = b2;
        B b3 = new B("temporary", 1);
        c = b3;
        B b4 = new B("applicationSupport", 2);
        d = b4;
        B b5 = new B("applicationLibrary", 3);
        B b6 = new B("root", 4);
        e = b6;
        B[] bArr = {b2, b3, b4, b5, b6};
        f = bArr;
        i = EnumEntriesKt.enumEntries(bArr);
        Companion = new a();
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new androidx.lifecycle.s(1));
    }

    public B() {
        throw null;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f.clone();
    }
}
