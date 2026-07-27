package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4478j9;
import com.ironsource.EnumC4514l9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1631a {

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C1632a extends AbstractC1631a {

            /* renamed from: a, reason: collision with root package name */
            private final String f11662a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1632a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f11662a;
            }

            public final String b() {
                return this.f11662a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1632a) && Intrinsics.areEqual(this.f11662a, ((C1632a) obj).f11662a);
            }

            public int hashCode() {
                return this.f11662a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f11662a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1632a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f11662a = errorMessage;
            }

            public final C1632a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C1632a(errorMessage);
            }

            public /* synthetic */ C1632a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C1632a a(C1632a c1632a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c1632a.f11662a;
                }
                return c1632a.a(str);
            }
        }

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC1631a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f11663a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC1631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1631a() {
        }
    }

    static /* synthetic */ AbstractC1631a a(a aVar, Context context, EnumC4514l9 enumC4514l9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i & 2) != 0) {
            enumC4514l9 = EnumC4514l9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4514l9);
    }

    AbstractC1631a a(Context context, C4478j9 c4478j9);

    AbstractC1631a a(Context context, EnumC4514l9 enumC4514l9);
}
