package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC4634s4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8522a;

    /* renamed from: com.ironsource.s4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final EnumC4634s4 a(String str) {
            EnumC4634s4 enumC4634s4;
            EnumC4634s4[] values = EnumC4634s4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC4634s4 = null;
                    break;
                }
                enumC4634s4 = values[i];
                if (Intrinsics.areEqual(enumC4634s4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC4634s4 == null ? EnumC4634s4.NONE : enumC4634s4;
        }

        private a() {
        }
    }

    EnumC4634s4(String str) {
        this.f8522a = str;
    }

    public final String b() {
        return this.f8522a;
    }

    @JvmStatic
    public static final EnumC4634s4 a(String str) {
        return b.a(str);
    }
}
