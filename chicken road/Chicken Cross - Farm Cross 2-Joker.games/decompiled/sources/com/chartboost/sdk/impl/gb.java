package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gb {
    public static final a c;
    public static final gb d = new gb("CONCURRENT", 0, 0);
    public static final gb e = new gb("SEQUENTIAL", 1, 1);
    public static final /* synthetic */ gb[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gb a(int i) {
            Object obj;
            Iterator<E> it = gb.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((gb) obj).c() == i) {
                    break;
                }
            }
            gb gbVar = (gb) obj;
            return gbVar == null ? gb.e : gbVar;
        }

        public a() {
        }
    }

    static {
        gb[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public gb(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ gb[] a() {
        return new gb[]{d, e};
    }

    public static EnumEntries b() {
        return g;
    }

    public static gb valueOf(String str) {
        return (gb) Enum.valueOf(gb.class, str);
    }

    public static gb[] values() {
        return (gb[]) f.clone();
    }

    public final int c() {
        return this.b;
    }
}
