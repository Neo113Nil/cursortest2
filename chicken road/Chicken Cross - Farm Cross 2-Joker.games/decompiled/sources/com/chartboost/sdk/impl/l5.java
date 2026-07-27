package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class l5 {

    public static final class a extends l5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f4855a;
        public final String b;
        public final Integer c;
        public final List d;
        public final y4 e;
        public final List f;

        public /* synthetic */ a(String str, String str2, Integer num, List list, y4 y4Var, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, num, list, y4Var, (i & 32) != 0 ? null : list2);
        }

        public final a a(String str, String str2, Integer num, List universalAdIds, y4 companionAds, List list) {
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(companionAds, "companionAds");
            return new a(str, str2, num, universalAdIds, companionAds, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4855a, aVar.f4855a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f);
        }

        public int hashCode() {
            String str = this.f4855a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            List list = this.f;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "CompanionCreative(id=" + this.f4855a + ", adId=" + this.b + ", sequence=" + this.c + ", universalAdIds=" + this.d + ", companionAds=" + this.e + ", creativeExtensions=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Integer num, List universalAdIds, y4 companionAds, List list) {
            super(null);
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(companionAds, "companionAds");
            this.f4855a = str;
            this.b = str2;
            this.c = num;
            this.d = universalAdIds;
            this.e = companionAds;
            this.f = list;
        }

        public static /* synthetic */ a a(a aVar, String str, String str2, Integer num, List list, y4 y4Var, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f4855a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                num = aVar.c;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                list = aVar.d;
            }
            List list3 = list;
            if ((i & 16) != 0) {
                y4Var = aVar.e;
            }
            y4 y4Var2 = y4Var;
            if ((i & 32) != 0) {
                list2 = aVar.f;
            }
            return aVar.a(str, str3, num2, list3, y4Var2, list2);
        }

        public final y4 a() {
            return this.e;
        }
    }

    public static final class b extends l5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f4856a;
        public final String b;
        public final Integer c;
        public final List d;
        public final db e;
        public final List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Integer num, List universalAdIds, db linear, List list) {
            super(null);
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f4856a = str;
            this.b = str2;
            this.c = num;
            this.d = universalAdIds;
            this.e = linear;
            this.f = list;
        }

        public final b a(String str, String str2, Integer num, List universalAdIds, db linear, List list) {
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(linear, "linear");
            return new b(str, str2, num, universalAdIds, linear, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f4856a, bVar.f4856a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f);
        }

        public int hashCode() {
            String str = this.f4856a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            List list = this.f;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "LinearCreative(id=" + this.f4856a + ", adId=" + this.b + ", sequence=" + this.c + ", universalAdIds=" + this.d + ", linear=" + this.e + ", creativeExtensions=" + this.f + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, String str2, Integer num, List list, db dbVar, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f4856a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                num = bVar.c;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                list = bVar.d;
            }
            List list3 = list;
            if ((i & 16) != 0) {
                dbVar = bVar.e;
            }
            db dbVar2 = dbVar;
            if ((i & 32) != 0) {
                list2 = bVar.f;
            }
            return bVar.a(str, str3, num2, list3, dbVar2, list2);
        }

        public final db a() {
            return this.e;
        }
    }

    public /* synthetic */ l5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public l5() {
    }
}
