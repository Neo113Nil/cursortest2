package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC4802c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10782a = 0;

    /* renamed from: com.moloco.sdk.internal.services.c$a */
    public static final class a extends AbstractC4802c {
        public static final int c = 0;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.b = id;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Available(id=" + this.b + ')';
        }

        public final a a(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new a(id);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            return aVar.a(str);
        }
    }

    /* renamed from: com.moloco.sdk.internal.services.c$b */
    public static final class b extends AbstractC4802c {
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4802c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC4802c() {
    }
}
