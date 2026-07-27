package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class al {
    public static final b e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4683a;
    public final URL b;
    public final String c;
    public final String d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f4684a;
        public String b;
        public String c;
        public String d;
        public String e;

        public a(String javascriptResourceUrl) {
            Intrinsics.checkNotNullParameter(javascriptResourceUrl, "javascriptResourceUrl");
            this.f4684a = javascriptResourceUrl;
            this.b = CampaignEx.KEY_OMID;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.f4684a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public final String f() {
            return this.d;
        }

        public final al a() {
            try {
                return new al(this);
            } catch (Exception unused) {
                return null;
            }
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(u0 u0Var) {
            List a2 = u0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a2) {
                bb bbVar = (bb) obj;
                if (StringsKt.equals(bbVar.a(), CampaignEx.KEY_OMID, true) && !Intrinsics.areEqual(bbVar.b(), Boolean.FALSE)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final Set b(List adVerifications, si siVar) {
            Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                al a2 = al.e.a((u0) it.next(), siVar);
                if (a2 != null) {
                    linkedHashSet.add(a2);
                }
            }
            return linkedHashSet;
        }

        public b() {
        }

        public final Integer b(u0 u0Var) {
            if (u0Var.a().isEmpty()) {
                return 3;
            }
            List a2 = a(u0Var);
            if (a2.isEmpty()) {
                return 2;
            }
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (((bb) it.next()).c() != null) {
                        return null;
                    }
                }
            }
            return 3;
        }

        public final al a(u0 adVerification, si siVar) {
            Object obj;
            String c;
            String a2;
            Intrinsics.checkNotNullParameter(adVerification, "adVerification");
            Iterator it = a(adVerification).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((bb) obj).c() != null) {
                    break;
                }
            }
            bb bbVar = (bb) obj;
            if (bbVar == null || (c = bbVar.c()) == null) {
                return null;
            }
            if (siVar != null && (a2 = siVar.a(c)) != null) {
                c = a2;
            }
            a aVar = new a(c);
            String a3 = bbVar.a();
            if (a3 == null) {
                a3 = "";
            }
            a a4 = aVar.a(a3);
            String c2 = adVerification.c();
            a4.b(c2 != null ? c2 : "").c(adVerification.d());
            return aVar.a();
        }

        public static /* synthetic */ Set a(b bVar, List list, si siVar, int i, Object obj) {
            if ((i & 2) != 0) {
                siVar = null;
            }
            return bVar.b(list, siVar);
        }

        public final List a(List adVerifications, si siVar) {
            String a2;
            Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
            ArrayList arrayList = new ArrayList();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                u0 u0Var = (u0) it.next();
                Integer b = al.e.b(u0Var);
                if (b != null) {
                    int intValue = b.intValue();
                    List b2 = u0Var.b();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : b2) {
                        if (Intrinsics.areEqual(((ii) obj).b(), "verificationNotExecuted")) {
                            arrayList2.add(obj);
                        }
                    }
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        String f = ((ii) obj2).f();
                        if (f != null) {
                            String replace$default = StringsKt.replace$default(f, "[REASON]", String.valueOf(intValue), false, 4, (Object) null);
                            if (siVar != null && (a2 = siVar.a(replace$default)) != null) {
                                replace$default = a2;
                            }
                            arrayList.add(replace$default);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public al(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!StringsKt.equals(CampaignEx.KEY_OMID, builder.b(), true) || TextUtils.isEmpty(builder.c())) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.f4683a = builder.d();
        this.b = new URL(builder.c());
        this.c = builder.f();
        this.d = builder.e();
    }

    public final URL a() {
        return this.b;
    }

    public final String b() {
        return this.f4683a;
    }

    public final String c() {
        return this.c;
    }
}
