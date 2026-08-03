package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3788a;
    public final /* synthetic */ com.fyber.inneractive.sdk.measurement.i b;

    public g(java.util.List list, com.fyber.inneractive.sdk.measurement.i iVar) {
        this.f3788a = list;
        this.b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final java.util.List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        if (xVar == null || this.f3788a == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f3788a) {
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", java.lang.String.valueOf(this.b.mReason)));
            }
        }
        return arrayList;
    }
}
