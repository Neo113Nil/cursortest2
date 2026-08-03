package com.ironsource;

/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3055g4 implements com.ironsource.InterfaceC3308u7 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6268a;
    private final java.lang.String b;
    private final boolean c;
    private final com.ironsource.C2992cd d;

    public C3055g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC3308u7
    public java.lang.String a() {
        return this.f6268a;
    }

    @Override // com.ironsource.InterfaceC3308u7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3308u7
    public com.ironsource.C2992cd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3308u7
    public java.lang.String d() {
        return this.b;
    }

    public C3055g4(java.lang.String controllerUrl, java.lang.String cacheFolder, boolean z, com.ironsource.C2992cd rootFolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f6268a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3055g4(java.lang.String str, java.lang.String str2, boolean z, com.ironsource.C2992cd c2992cd, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new com.ironsource.C2992cd(str) : c2992cd);
        str = (i & 1) != 0 ? "" : str;
    }
}
