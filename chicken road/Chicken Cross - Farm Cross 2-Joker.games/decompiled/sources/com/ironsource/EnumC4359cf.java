package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC4359cf {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8115a;

    /* renamed from: com.ironsource.cf$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4359cf a(int i) {
            EnumC4359cf enumC4359cf;
            EnumC4359cf[] values = EnumC4359cf.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4359cf = null;
                    break;
                }
                enumC4359cf = values[i2];
                if (enumC4359cf.f8115a == i) {
                    break;
                }
                i2++;
            }
            return enumC4359cf == null ? EnumC4359cf.CurrentlyLoadedAds : enumC4359cf;
        }

        private a() {
        }
    }

    EnumC4359cf(int i) {
        this.f8115a = i;
    }

    public final int b() {
        return this.f8115a;
    }
}
