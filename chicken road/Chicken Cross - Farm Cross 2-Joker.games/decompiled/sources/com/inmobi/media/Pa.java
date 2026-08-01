package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.SdkInitializationListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Pa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6780a;
    public final String b;
    public final byte c;
    public final JSONObject d;
    public final SdkInitializationListener e;
    public final long f;

    public Pa(Context context, String str, byte b, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener, long j) {
        this.f6780a = context;
        this.b = str;
        this.c = b;
        this.d = jSONObject;
        this.e = sdkInitializationListener;
        this.f = j;
    }

    public static Pa a(Pa pa, Context context, String str, int i) {
        if ((i & 2) != 0) {
            str = pa.b;
        }
        byte b = pa.c;
        JSONObject jSONObject = pa.d;
        SdkInitializationListener sdkInitializationListener = pa.e;
        long j = pa.f;
        pa.getClass();
        return new Pa(context, str, b, jSONObject, sdkInitializationListener, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pa)) {
            return false;
        }
        Pa pa = (Pa) obj;
        return Intrinsics.areEqual(this.f6780a, pa.f6780a) && Intrinsics.areEqual(this.b, pa.b) && this.c == pa.c && Intrinsics.areEqual(this.d, pa.d) && Intrinsics.areEqual(this.e, pa.e) && this.f == pa.f;
    }

    public final int hashCode() {
        Context context = this.f6780a;
        int hashCode = (context == null ? 0 : context.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (Byte.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        JSONObject jSONObject = this.d;
        int hashCode3 = (hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        SdkInitializationListener sdkInitializationListener = this.e;
        return Long.hashCode(this.f) + ((hashCode3 + (sdkInitializationListener != null ? sdkInitializationListener.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Context context = this.f6780a;
        String str = this.b;
        byte b = this.c;
        return "InitRequest(context=" + context + ", accountId=" + str + ", source=" + ((int) b) + ", consentObject=" + this.d + ", sdkInitializationListener=" + this.e + ", startTime=" + this.f + ")";
    }
}
