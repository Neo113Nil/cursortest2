package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum W6 {
    SendEvent(0),
    NativeController(1);

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f7986a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W6 a(int i) {
            W6 w6;
            W6[] values = W6.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    w6 = null;
                    break;
                }
                w6 = values[i2];
                if (w6.b() == i) {
                    break;
                }
                i2++;
            }
            return w6 == null ? W6.SendEvent : w6;
        }

        private a() {
        }
    }

    W6(int i) {
        this.f7986a = i;
    }

    public final int b() {
        return this.f7986a;
    }
}
