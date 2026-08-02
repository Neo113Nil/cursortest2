package com.amplitude.core.platform;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface k {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;
        public static final /* synthetic */ EnumEntries i;

        static {
            a aVar = new a("Before", 0);
            a = aVar;
            a aVar2 = new a("Enrichment", 1);
            b = aVar2;
            a aVar3 = new a("Destination", 2);
            c = aVar3;
            a aVar4 = new a("Utility", 3);
            d = aVar4;
            a aVar5 = new a("Observe", 4);
            e = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f = aVarArr;
            i = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    void b(com.amplitude.core.b bVar);

    default void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        b(amplitude);
    }

    default com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event;
    }

    a getType();
}
