package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1309 extends WeakHashMap implements InterfaceC0997 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f3778;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0807 f3779;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309(C1305 c1305, WeakHashMap weakHashMap, C0807 c0807) {
        super(weakHashMap);
        this.f3778 = c1305;
        this.f3779 = c0807;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        View view = (View) obj;
        WeakReference weakReference = (WeakReference) obj2;
        this.f3778.m5529(this, this.f3779, StringFog.decrypt("vg/LU0qBGT2nC95RdIUrMb0PzxRMkSw=\n", "8G6/OjzkWFk=\n"), view, weakReference);
        return (WeakReference) super.put(view, weakReference);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this;
    }
}
