package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class pd {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4959a;
    public final int b;
    public final byte[] c;
    public final Throwable d;
    public final String e;
    public final Lazy f;

    public pd(boolean z, int i, byte[] bArr, Throwable th, String str) {
        this.f4959a = z;
        this.b = i;
        this.c = bArr;
        this.d = th;
        this.e = str;
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pd.a(pd.this);
            }
        });
    }

    public final String a() {
        return (String) this.f.getValue();
    }

    public final byte[] b() {
        return this.c;
    }

    public final Throwable c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e() {
        return this.f4959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return this.f4959a == pdVar.f4959a && this.b == pdVar.b && Intrinsics.areEqual(this.c, pdVar.c) && Intrinsics.areEqual(this.d, pdVar.d) && Intrinsics.areEqual(this.e, pdVar.e);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f4959a) * 31) + Integer.hashCode(this.b)) * 31;
        byte[] bArr = this.c;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th = this.d;
        int hashCode3 = (hashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(isSuccessful=" + this.f4959a + ", statusCode=" + this.b + ", bytes=" + Arrays.toString(this.c) + ", error=" + this.d + ", charset=" + this.e + ")";
    }

    public static final String a(pd pdVar) {
        byte[] bArr = pdVar.c;
        if (bArr == null) {
            return null;
        }
        String str = pdVar.e;
        if (str == null) {
            str = Charsets.UTF_8.name();
        }
        try {
            Intrinsics.checkNotNull(str);
            Charset forName = Charset.forName(str);
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            return new String(bArr, forName);
        } catch (Exception unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }

    public /* synthetic */ pd(boolean z, int i, byte[] bArr, Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? null : str);
    }
}
