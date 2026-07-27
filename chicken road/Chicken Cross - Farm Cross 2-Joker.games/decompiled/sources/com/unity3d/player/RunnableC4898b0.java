package com.unity3d.player;

/* renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4898b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PermissionRequest f11781a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int[] c;

    public RunnableC4898b0(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.f11781a = permissionRequest;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11781a.permissionResponse(this.b, this.c);
    }
}
