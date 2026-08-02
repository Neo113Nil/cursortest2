package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1665up {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15910a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f15911b;

    public /* synthetic */ AbstractC1665up() {
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public boolean a(int i) {
        return (this.f15911b & i) == i;
    }

    public boolean c() {
        return a(1);
    }

    public String toString() {
        switch (this.f15910a) {
            case 0:
                return b(this.f15911b);
            default:
                return super.toString();
        }
    }
}
