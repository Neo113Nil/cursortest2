package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC4514l9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8311a;

    /* renamed from: com.ironsource.l9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4514l9 a(int i) {
            EnumC4514l9 enumC4514l9;
            EnumC4514l9[] values = EnumC4514l9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4514l9 = null;
                    break;
                }
                enumC4514l9 = values[i2];
                if (enumC4514l9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC4514l9 == null ? EnumC4514l9.APP_ACTIVITY : enumC4514l9;
        }

        private a() {
        }
    }

    EnumC4514l9(int i) {
        this.f8311a = i;
    }

    public final int b() {
        return this.f8311a;
    }
}
