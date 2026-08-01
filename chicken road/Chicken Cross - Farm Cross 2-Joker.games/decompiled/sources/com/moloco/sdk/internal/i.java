package com.moloco.sdk.internal;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class i {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f10472a;
    public final int b;

    public static final class a extends i {
        public static final int e = 0;
        public final Integer d;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(Integer num) {
            return new a(num);
        }

        public final Integer c() {
            return this.d;
        }

        public final Integer d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.d, ((a) obj).d);
        }

        public int hashCode() {
            Integer num = this.d;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "AnchoredAdaptive(availableWidth=" + this.d + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Integer num) {
            super(r0, r0, null);
            int i = 0;
            this.d = num;
        }

        public static /* synthetic */ a a(a aVar, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = aVar.d;
            }
            return aVar.a(num);
        }

        public /* synthetic */ a(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    public static final class b extends i {
        public static final int f = 0;
        public final int d;
        public final int e;

        public b(int i, int i2) {
            super(i, i2, null);
            this.d = i;
            this.e = i2;
        }

        public final b a(int i, int i2) {
            return new b(i, i2);
        }

        @Override // com.moloco.sdk.internal.i
        public int b() {
            return this.d;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.d == bVar.d && this.e == bVar.e;
        }

        public int hashCode() {
            return (Integer.hashCode(this.d) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            return "Custom(wDp=" + this.d + ", hDp=" + this.e + ')';
        }

        public static /* synthetic */ b a(b bVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bVar.d;
            }
            if ((i3 & 2) != 0) {
                i2 = bVar.e;
            }
            return bVar.a(i, i2);
        }

        @Override // com.moloco.sdk.internal.i
        public int a() {
            return this.e;
        }
    }

    public static final class c extends i {
        public static final int e = 0;
        public final Integer d;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final c a(Integer num) {
            return new c(num);
        }

        public final Integer c() {
            return this.d;
        }

        public final Integer d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.d, ((c) obj).d);
        }

        public int hashCode() {
            Integer num = this.d;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "InlineAdaptive(availableWidth=" + this.d + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(Integer num) {
            super(r0, r0, null);
            int i = 0;
            this.d = num;
        }

        public static /* synthetic */ c a(c cVar, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = cVar.d;
            }
            return cVar.a(num);
        }

        public /* synthetic */ c(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    public static final class d extends i {
        public static final d d = new d();
        public static final int e = 0;

        public d() {
            super(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, null);
        }
    }

    public static final class e extends i {
        public static final e d = new e();
        public static final int e = 0;

        public e() {
            super(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, null);
        }
    }

    public static final class f extends i {
        public static final f d = new f();
        public static final int e = 0;

        public f() {
            super(728, 90, null);
        }
    }

    public /* synthetic */ i(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f10472a;
    }

    public i(int i, int i2) {
        this.f10472a = i;
        this.b = i2;
    }
}
