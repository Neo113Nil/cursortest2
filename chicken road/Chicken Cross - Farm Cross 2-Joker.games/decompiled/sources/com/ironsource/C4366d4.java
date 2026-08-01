package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4366d4 implements InterfaceC4619r7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8134a;
    private final String b;
    private final boolean c;
    private final C4339bd d;

    public C4366d4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC4619r7
    public String a() {
        return this.f8134a;
    }

    @Override // com.ironsource.InterfaceC4619r7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4619r7
    public C4339bd c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4619r7
    public String d() {
        return this.b;
    }

    public C4366d4(String controllerUrl, String cacheFolder, boolean z, C4339bd rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f8134a = controllerUrl;
        this.b = cacheFolder;
        this.c = z;
        this.d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4366d4(String str, String str2, boolean z, C4339bd c4339bd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C4339bd(str) : c4339bd);
        str = (i & 1) != 0 ? "" : str;
    }
}
