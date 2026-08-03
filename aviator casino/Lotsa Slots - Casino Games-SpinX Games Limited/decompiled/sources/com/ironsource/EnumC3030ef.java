package com.ironsource;

/* renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC3030ef {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    public static final com.ironsource.EnumC3030ef.a b = new com.ironsource.EnumC3030ef.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6218a;

    /* renamed from: com.ironsource.ef$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.EnumC3030ef a(int i) {
            com.ironsource.EnumC3030ef enumC3030ef;
            com.ironsource.EnumC3030ef[] values = com.ironsource.EnumC3030ef.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC3030ef = null;
                    break;
                }
                enumC3030ef = values[i2];
                if (enumC3030ef.f6218a == i) {
                    break;
                }
                i2++;
            }
            return enumC3030ef == null ? com.ironsource.EnumC3030ef.CurrentlyLoadedAds : enumC3030ef;
        }

        private a() {
        }
    }

    EnumC3030ef(int i) {
        this.f6218a = i;
    }

    public final int b() {
        return this.f6218a;
    }
}
