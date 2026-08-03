package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public interface m {

    public static final class a implements com.ironsource.sdk.controller.m {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6643a;
        private final java.lang.String b;
        private final java.lang.String c;
        private final java.lang.String d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall) {
            this(funToCall, null, null, null, 14, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        public java.lang.String a() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.f6643a);
            java.lang.String str = this.b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.b);
            }
            java.lang.String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.c);
            }
            java.lang.String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.d);
            }
            sb.append("');");
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall, java.lang.String str) {
            this(funToCall, str, null, null, 12, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall, java.lang.String str, java.lang.String str2) {
            this(funToCall, str, str2, null, 8, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(java.lang.String funToCall, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.f6643a = funToCall;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public static final class b implements com.ironsource.sdk.controller.m {

        /* renamed from: a, reason: collision with root package name */
        private int f6644a;
        private java.lang.String b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(com.ironsource.sdk.controller.m jsMethod, int i) {
            this(jsMethod.a(), i);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        public b(java.lang.String script, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
            this.b = script;
            this.f6644a = i;
        }

        @Override // com.ironsource.sdk.controller.m
        public java.lang.String a() {
            java.lang.String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f6644a != com.ironsource.C3202o8.d.MODE_0.b() && (this.f6644a < com.ironsource.C3202o8.d.MODE_1.b() || this.f6644a > com.ironsource.C3202o8.d.MODE_3.b())) {
                str = "empty";
            }
            java.lang.String str2 = "try{" + this.b + "}catch(e){" + str + "}";
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }
    }

    java.lang.String a();
}
