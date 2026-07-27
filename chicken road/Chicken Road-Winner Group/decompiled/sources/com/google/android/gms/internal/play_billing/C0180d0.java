package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180d0 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0180d0(String str, int i3) {
        super(str);
        this.f2736a = i3;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f2736a) {
            case 0:
                synchronized (this) {
                    break;
                }
            case 1:
                synchronized (this) {
                    break;
                }
            default:
                synchronized (this) {
                    break;
                }
        }
        return this;
    }
}
