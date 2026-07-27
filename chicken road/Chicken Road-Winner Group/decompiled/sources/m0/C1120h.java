package m0;

import a0.C0087a;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.W;

/* renamed from: m0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120h {

    /* renamed from: a, reason: collision with root package name */
    public int f10046a;

    /* renamed from: b, reason: collision with root package name */
    public String f10047b;

    public static C0087a a() {
        C0087a c0087a = new C0087a();
        c0087a.f1780a = "";
        return c0087a;
    }

    public final String toString() {
        int i3 = this.f10046a;
        int i4 = AbstractC0213o0.f2786a;
        W w3 = com.google.android.gms.internal.play_billing.L.f2649c;
        Integer valueOf = Integer.valueOf(i3);
        return "Response Code: " + (!w3.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.L.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.L) w3.get(valueOf)).toString() + ", Debug Message: " + this.f10047b;
    }
}
